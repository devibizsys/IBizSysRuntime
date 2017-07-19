package net.ibizsys.paas.ctrlhandler;

import java.util.HashMap;

import net.ibizsys.paas.util.StringHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 计数器全局对象
 * @author Administrator
 *
 */
public class CounterGlobal
{
	private static final Log log = LogFactory.getLog(CounterGlobal.class);
	private static HashMap<String, ICounterHandler> counterHandlerMap = new HashMap<String, ICounterHandler>();
	
	/**
	 * 注册计数器
	 * @param strCounterHandlerClsType
	 * @param iCounterHandler
	 */
	public static void registerCounterHandler(String strCounterHandlerClsType,ICounterHandler iCounterHandler)
	{
		if(!counterHandlerMap.containsKey(strCounterHandlerClsType))
		{
			//log.info(StringHelper.format("注册计数器[%1$s][%2$s]",strCounterHandlerClsType,iCounterHandler));
			counterHandlerMap.put(strCounterHandlerClsType, iCounterHandler);
		}
	}
	
	
	
	
	
	/**
	 * 获取计数器
	 * @param strCounterHandlerClsType
	 * @return
	 * @throws Exception
	 */
	public static ICounterHandler getCounterHandler(Class cls) throws Exception
	{
		return getCounterHandler(cls.getCanonicalName());
	}
	
	
	/**
	 * 获取计数器
	 * @param strCounterHandlerClsType
	 * @return
	 * @throws Exception
	 */
	public static ICounterHandler getCounterHandler(String strCounterHandlerClsType) throws Exception
	{
		ICounterHandler iCounterHandler = counterHandlerMap.get(strCounterHandlerClsType);
		if(iCounterHandler == null)
			throw new Exception(StringHelper.format("无法获取指定计数器[%1$s]",strCounterHandlerClsType));
		return iCounterHandler;
	}
}
