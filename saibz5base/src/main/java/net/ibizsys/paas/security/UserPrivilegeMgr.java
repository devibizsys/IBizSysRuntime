package net.ibizsys.paas.security;

import java.util.HashMap;

import net.ibizsys.paas.core.CallResult;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.IWebContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 用户权限管理对象实现
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class UserPrivilegeMgr implements IUserPrivilegeMgr
{
	private static final Log log = LogFactory.getLog(UserPrivilegeMgr.class);
	
	public final static int MAXUNITCOUNT = 2000;
	
	protected HashMap<String,Boolean> resourceList = new HashMap<String,Boolean>();

	protected HashMap<String,Integer> columnList = new HashMap<String,Integer> ();
	
	protected HashMap<String,Integer> deDataCacheMap = new HashMap<String,Integer>();
	
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.security.IUserPrivilegeMgr#reset(net.ibizsys.paas.web.IWebContext)
	 */
	@Override
	public synchronized void reset(IWebContext webContext)
	{
		resourceList = null;
	}
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.security.IUserPrivilegeMgr#reset(net.ibizsys.paas.web.IWebContext)
	 */
	@Override
	public synchronized void reset()
	{
		resourceList = null;
	}
	


	/* (non-Javadoc)
	 * @see net.ibizsys.paas.security.IUserPrivilegeMgr#test(net.ibizsys.paas.web.IWebContext, java.lang.String)
	 */
	@Override
	public synchronized boolean test(IWebContext webContext,String strResourceId)throws Exception
	{
		if(StringHelper.length( webContext.getCurUserId()) == 0)
			return false;

		strResourceId = strResourceId.toUpperCase();
		//判断是否允许的列表中
		Boolean bRet = resourceList.get(strResourceId);
		if(bRet!=null)
			return bRet;
		
		bRet = internalTest(webContext,strResourceId);
		if(resourceList.size()>=MAXUNITCOUNT)
		{
			resourceList.clear();
		}

		resourceList.put(strResourceId,bRet);
		return bRet;
	}
	
	


	/**
	 * 判断访问实体字段能力
	 * @param webContext
	 * @param strResourceId
	 * @return
	 * @throws Exception
	 */
	public int testColumn(IWebContext webContext, String strResourceId)throws Exception
	{
		if(StringHelper.isNullOrEmpty(strResourceId))
			return PrivilegeAbilities.UPDATE;
		
	//	String strOriginResourceId = strResourceId;
		strResourceId = strResourceId.toUpperCase();
		//判断是否允许的列表中
		Integer nRet = columnList.get(strResourceId);
		if(nRet!=null)
			return nRet;
		
		nRet = internalTestColumn(webContext,strResourceId);
		if(columnList.size()>=MAXUNITCOUNT)
		{
			columnList.clear();
		}
		columnList.put(strResourceId,nRet);
		return nRet;
	}

	
	
	/**
	 * 判断是否允许访问指定资源
	 * @param webContext
	 * @param strResourceId
	 * @return
	 * @throws Exception
	 */
	protected synchronized boolean internalTest(IWebContext webContext, String strResourceId) throws Exception
	{
		if(StringHelper.compare(UniResTypes.NONE, strResourceId, true) == 0)
			return true;
		
		if(webContext.isSuperUser())
			return true;
		
		IUserRoleMgr iUserRoleMgr = webContext.getUserRoleMgr();
		
		String []parts = strResourceId.split("[:]");
		if(parts.length == 1)
		{
			//常规资源编号
			return iUserRoleMgr.testUserRoleUniRes(UniResTypes.CUSTOM, strResourceId);
		}
//		
//		if(parts.length == 2)
//		{
//			String strResType = parts[0];
//			if(StringHelper.compare(strResType,UniResTypes.PAGE, true) == 0)
//			{
//				return iUserRoleMgr.testUserRoleUniRes( UniResTypes.PAGE, parts[1]);
//			}
//			
//			if(StringHelper.compare(strResType,UniResTypes.REPORT, true) == 0)
//			{
//				return iUserRoleMgr.testUserRoleUniRes( UniResTypes.REPORT, parts[1]);
//			}
//			return false;
//		}
		
		if(parts.length == 3)
		{
			String strResType = parts[0];
			if(StringHelper.compare(strResType, UniResTypes.DEDATA, true) == 0)
			{
				return iUserRoleMgr.testUserRoleDataAction(parts[1], null,parts[2]);
			}
			return false;
		}
		
		return false;
	}
	

	/**
	 * 判断访问实体字段能力
	 * @param webContext
	 * @param strResourceId
	 * @return
	 * @throws Exception
	 */
	protected synchronized int internalTestColumn(IWebContext webContext, String strResourceId)throws Exception
	{
		if(webContext.isSuperUser())
			return PrivilegeAbilities.UPDATE;
		
		IUserRoleMgr iUserRoleMgr = webContext.getUserRoleMgr();
		
		String []parts = strResourceId.split("[|]");
		if(parts.length==2)
		{
			return iUserRoleMgr.testUserRoleDEField(parts[0], parts[1]);
		}
		log.error(StringHelper.format("无法识别的实体属性资源标识[%1$s]",strResourceId));
		return PrivilegeAbilities.NONE;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.security.IUserPrivilegeMgr#testDEField(net.ibizsys.paas.web.IWebContext, java.lang.String)
	 */
	@Override
	public int testDEField(IWebContext webContext, String strResourceId) throws Exception
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.security.IUserPrivilegeMgr#testDataAccessAction(net.ibizsys.paas.web.IWebContext, net.ibizsys.paas.demodel.IDataEntityModel, java.lang.Object, java.lang.String)
	 */
	@Override
	public CallResult testDataAccessAction(IWebContext webContext, IDataEntityModel iDataEntityModel, Object objKey, String strDataAccessAction) throws Exception
	{
		if(StringHelper.isNullOrEmpty(strDataAccessAction) || (StringHelper.compare(strDataAccessAction, DataAccessActions.NONE,true)==0))
			return new CallResult();
	
		CallResult callResult;
		String strKey= StringHelper.format("%1$s|%2$s|%3$s",iDataEntityModel.getName(),objKey,strDataAccessAction);
		Integer nRet =  deDataCacheMap.get(strKey);
		if(nRet!=null)
		{
			callResult = new CallResult();
			callResult.setRetCode(nRet);
			return callResult;
		}
		
		callResult = iDataEntityModel.getDEDataAccMgr().test(webContext, objKey, strDataAccessAction);
		if(objKey == null ||(callResult!=null && callResult.getUserObject()!=null && StringHelper.compare(DataObject.getStringValue(callResult.getUserObject()),TESTRESULT_CACHE, true) == 0))
		{
			if(deDataCacheMap.size()>=MAXUNITCOUNT)
			{
				deDataCacheMap.clear();
			}
			deDataCacheMap.put(strKey, callResult.getRetCode());
		}
		return callResult;
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.security.IUserPrivilegeMgr#testDataAccessAction(net.ibizsys.paas.web.IWebContext, net.ibizsys.paas.demodel.IDataEntityModel, net.ibizsys.paas.entity.IEntity, java.lang.String)
	 */
	@Override
	public CallResult testDataAccessAction(IWebContext webContext, IDataEntityModel iDataEntityModel, IEntity iEntity, String strDataAccessAction) throws Exception
	{
		if(StringHelper.isNullOrEmpty(strDataAccessAction)|| (StringHelper.compare(strDataAccessAction, DataAccessActions.NONE,true)==0))
			return new CallResult();
		
		CallResult callResult;
		Object objKey = null;
		if(iEntity!=null)
		{
			objKey =  iEntity.get(iDataEntityModel.getKeyDEField().getName());
		}
		
		String strKey = null;
		if(objKey!=null)
		{
			strKey= StringHelper.format("%1$s|%2$s|%3$s",iDataEntityModel.getName(),objKey,strDataAccessAction);
			Integer nRet =  deDataCacheMap.get(strKey);
			if(nRet!=null)
			{
				callResult = new CallResult();
				callResult.setRetCode(nRet);
				return callResult;
			}
		}
		
		
		callResult = iDataEntityModel.getDEDataAccMgr().test(webContext, iEntity, strDataAccessAction);
		
		if(strKey != null && callResult!=null && callResult.getUserObject()!=null && StringHelper.compare(DataObject.getStringValue(callResult.getUserObject()),TESTRESULT_CACHE, true) == 0)
		{
			if(deDataCacheMap.size()>=MAXUNITCOUNT)
			{
				deDataCacheMap.clear();
			}
			deDataCacheMap.put(strKey, callResult.getRetCode());
		}
		
		return callResult;
	}
	



}
