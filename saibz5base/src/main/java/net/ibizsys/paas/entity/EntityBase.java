package net.ibizsys.paas.entity;

import java.util.HashMap;

import org.hibernate.SessionFactory;

import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.service.ServiceBase;
import net.ibizsys.paas.util.StringHelper;

/**
 * 基础数据对象
 * @author lionlau
 *
 */
public abstract class EntityBase extends DataObject implements IEntity
{
	/**
	 * 原来的键值
	 */
	public final static String ORIGINKEY = "srforikey";
	
	
	/**
	 * 调用结果
	 */
	public final static String CALLRESULT = "srfret";
	
	
	private SessionFactory sessionFactory = null;
	
	
	private boolean bMarkFullInfo = false;
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.data.DataObject#onReset()
	 */
	protected void onReset(){
		
	}
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.entity.IEntity#fillMap(java.util.HashMap, boolean)
	 */
	@Override
	public void fillMap(HashMap<String, Object> params, boolean bDirtyOnly)
	{
		this.fillMap(params);
		onFillMap(params,  bDirtyOnly);
	}

	
	/**
	 * 填充Map
	 * @param params
	 * @param bDirtyOnly
	 */
	protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly)
	{
		
	}
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.entity.IEntity#markFullEntity(boolean)
	 */
	@Override
	public void markFullEntity(boolean bMarkFullInfo)
	{
		this.bMarkFullInfo = bMarkFullInfo;
	}
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.entity.IEntity#isFullEntity()
	 */
	@Override
	public boolean isFullEntity()
	{
		return this.bMarkFullInfo;
	}
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.data.DataObject#copyTo(net.ibizsys.paas.data.IDataObject, boolean, boolean)
	 */
	@Override
	public void copyTo(IDataObject dataEntity, boolean bReset,boolean bIncludeEmpty) throws Exception
	{
		super.copyTo(dataEntity, bReset,bIncludeEmpty);
		onCopyTo( dataEntity,bIncludeEmpty);
		
	}
	
	/**
	 * 拷贝数据对目标对象
	 * @param dataEntity
	 * @param bIncludeEmtpy
	 * @throws Exception
	 */
	protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception
	{
		if(dataEntity instanceof IEntity)
		{
			((IEntity)dataEntity).setSessionFactory(this.getSessionFactory());
		}
		
		
	}
	
	
	/**
	 * 是否有草稿标志
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static boolean hasDraftFlag(IEntity iEntity) throws Exception
	{
		Object objValue = iEntity.get(ServiceBase.DRAFTFLAG);
		if(objValue==null)
			return false;
		return true;
	}
	
	/**
	 * 是否为草稿
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static boolean isDraft(IEntity iEntity) throws Exception
	{
		Object objValue = iEntity.get(ServiceBase.DRAFTFLAG);
		if(objValue==null)
			return false;
		if(StringHelper.compare(objValue.toString(),"1",true)==0)
			return true;
		return false;
	}
	
	/**
	 * 设置草稿状态
	 * @param iEntity
	 * @param bDraftFlag
	 * @throws Exception
	 */
	public static void setDraft(IEntity iEntity,boolean bDraftFlag) throws Exception
	{
		iEntity.set(ServiceBase.DRAFTFLAG, bDraftFlag?1:0);
		
		
	}
	
	/**
	 * 获取原来的数据主键
	 * @param iEntity
	 * @return
	 * @throws Exception
	 */
	public static Object getOriginKey(IEntity iEntity)throws Exception
	{
		return iEntity.get(ORIGINKEY);
	}
	
	/**
	 * 设置会话工厂
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	

	/**
	 * 设置会话工厂
	 * @param sessionFactory
	 */
	public SessionFactory getSessionFactory()
	{
		return this.sessionFactory;
	}
}

