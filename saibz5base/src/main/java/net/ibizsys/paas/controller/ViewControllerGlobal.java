package net.ibizsys.paas.controller;

import java.util.HashMap;

import net.ibizsys.paas.util.StringHelper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 视图控制器全局对象
 * @author lionlau
 *
 */
public class ViewControllerGlobal
{
	private static final Log log = LogFactory.getLog(ViewControllerGlobal.class);
	private static HashMap<String, IViewController> viewControllerMap = new HashMap<String, IViewController>();
	
	/**
	 * 注册视图控制器
	 * @param strViewControllerClsType
	 * @param iViewController
	 */
	public static void registerViewController(String strViewControllerClsType,IViewController iViewController)
	{
		if(!viewControllerMap.containsKey(strViewControllerClsType))
		{
			//log.info(StringHelper.format("注册视图控制器[%1$s][%2$s]",strViewControllerClsType,iViewController));
			viewControllerMap.put(strViewControllerClsType, iViewController);
		}
	}
	
	
	/**
	 * 获取视图控制器
	 * @param strViewControllerClsType
	 * @return
	 * @throws Exception
	 */
	public static IViewController getViewController(Class cls) throws Exception
	{
		return getViewController(cls.getCanonicalName());
	}
	
	
	/**
	 * 获取视图控制器
	 * @param strViewControllerClsType
	 * @return
	 * @throws Exception
	 */
	public static IViewController getViewController(String strViewControllerClsType) throws Exception
	{
		IViewController iViewController = viewControllerMap.get(strViewControllerClsType);
		if(iViewController == null)
			throw new Exception(StringHelper.format("无法获取指定控制器[%1$s]",strViewControllerClsType));
		return iViewController;
	}
	
	
}
