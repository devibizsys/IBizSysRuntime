package net.ibizsys.paas.sysmodel;

import java.util.HashMap;

import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

/**
 * 代码表全局对象
 * @author lionlau
 *
 */
public class CodeListGlobal
{
	private static final Log log = LogFactory.getLog(CodeListGlobal.class);
	private static HashMap<String, ICodeList> codeListMap = new HashMap<String, ICodeList>();
	
	/**
	 * 注册代码表
	 * @param strCodeListClsType
	 * @param iCodeList
	 */
	public static void registerCodeList(String strCodeListClsType,ICodeListModel iCodeList)
	{
		//log.info(StringHelper.format("注册代码表对象[%1$s][%2$s]",strCodeListClsType,iCodeList));
		codeListMap.put(strCodeListClsType, iCodeList);
		codeListMap.put(iCodeList.getId(), iCodeList);
	}
	

	/**
	 * 获取代码表对象
	 * @param strCodeListClsType
	 * @return
	 * @throws Exception
	 */
	public static ICodeList getCodeList(Class cls) throws Exception
	{
		return getCodeList(cls.getCanonicalName());
	}
	
	
	/**
	 * 获取代码表对象
	 * @param strCodeListClsType
	 * @return
	 * @throws Exception
	 */
	public static ICodeList getCodeList(String strCodeListClsType) throws Exception
	{
		return internalGetCodeList(strCodeListClsType);
	}
	
	
	
	
	/**
	 * 获取代码表对象
	 * @param cls
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static ICodeList getCodeList(Class cls,SessionFactory sessionFactory) throws Exception
	{
		return getCodeList(cls.getCanonicalName(),sessionFactory);
	}
	
	/**
	 * 获取代码表对象
	 * @param strCodeListClsType
	 * @param sessionFactory
	 * @return
	 * @throws Exception
	 */
	public static ICodeList getCodeList(String strCodeListClsType,SessionFactory sessionFactory) throws Exception
	{
		ICodeList iCodeList = internalGetCodeList(strCodeListClsType, sessionFactory);
		if(iCodeList.isUserScope() && WebContext.getCurrent()!=null)
		{
			return WebContext.getCurrent().getUserCodeList(iCodeList);
		}
		return iCodeList;
	}
	
	/**
	 * 获取代码表对象
	 * @param strCodeListClsType
	 * @return
	 * @throws Exception
	 */
	private static ICodeList internalGetCodeList(String strCodeListClsType,SessionFactory sessionFactory) throws Exception
	{
		if(sessionFactory==null)
		{
			return getCodeList(strCodeListClsType);
		}
		
		String strFullKeyId = StringHelper.format("%1$s|%2$s",strCodeListClsType, sessionFactory.toString());
		synchronized(codeListMap)
		{
			ICodeList iCodeList = codeListMap.get(strFullKeyId);
			if(iCodeList != null)
				return iCodeList;
			
			iCodeList = codeListMap.get(strCodeListClsType);
			if(iCodeList == null)
				throw new Exception(StringHelper.format("无法获取指定代码表[%1$s]",strCodeListClsType));
			
			//建立新对象 
			ICodeList newCodeList = iCodeList.getClass().newInstance();
			if(newCodeList instanceof ICodeListModel)
			{
				((ICodeListModel)newCodeList).from((ICodeListModel)iCodeList);
				((ICodeListModel)newCodeList).setSessionFactory(sessionFactory);
			}
			codeListMap.put(strFullKeyId, newCodeList);
			return newCodeList;
		}
	}
	
	/**
	 * 获取代码表对象
	 * @param strCodeListClsType
	 * @return
	 * @throws Exception
	 */
	private static ICodeList internalGetCodeList(String strCodeListClsType) throws Exception
	{
		synchronized(codeListMap)
		{
			ICodeList iCodeList = codeListMap.get(strCodeListClsType);
			if(iCodeList == null)
				throw new Exception(StringHelper.format("无法获取指定代码表[%1$s]",strCodeListClsType));
			if(iCodeList.isUserScope() && WebContext.getCurrent()!=null)
			{
				return WebContext.getCurrent().getUserCodeList(iCodeList);
			}
			return iCodeList;
		}
	}
	
	/**
	 * 获取系统全部码表对象
	 * @return
	 */
	public static java.util.Iterator<ICodeList> getAllCodelists()
	{
		return codeListMap.values().iterator();
	}
}
