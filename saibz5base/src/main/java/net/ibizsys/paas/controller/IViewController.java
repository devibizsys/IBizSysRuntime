package net.ibizsys.paas.controller;

import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.ctrlhandler.ICtrlHandler;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.web.IWebContext;

import org.hibernate.SessionFactory;

/**
 * 视图控制器接口
 * @author lionlau
 *
 */
public interface IViewController
{
	/**
	 * 获取视图控制器标识
	 * @return
	 */
	String getId();
	
	
	/**
	 * 获取当前访问上下文
	 * @return
	 */
	IWebContext getWebContext();
	
	
	/**
	 * 准备视图控制器
	 * @throws Exception
	 */
	void prepareViewController() throws Exception;
	
	/**
	 * 是否已经准备视图
	 * @return
	 */
	boolean isPrepareViewController();
	
	
	/**
	 * 获取应用程序模型
	 * @return
	 */
	IApplicationModel  getAppModel() ;
	
	
	
	/**
	 * 获取系统模型
	 * @return
	 */
	ISystemModel getSystemModel();
	
	
	
	/**
	 * 获取实体模型
	 * @return
	 */
	IDataEntityModel getDEModel();
	
	
	
	
	/**
	 * 注册控件模型
	 * @param strCtrlId
	 * @param iCtrlModel
	 * @throws Exception
	 */
	void registerCtrlModel(String strCtrlId,ICtrlModel iCtrlModel)throws Exception;
	    
	    
	/**
	 * 注册控件处理对象
	 * @param strCtrlId
	 * @param iCtrlHandler
	 * @throws Exception
	 */
	void registerCtrlHandler(String strCtrlId,ICtrlHandler iCtrlHandler)throws Exception;
	    
	    
	/**
	 * 获取控件模型
	 * @param strName
	 * @return
	 * @throws Exception
	 */
	ICtrlModel getCtrlModel(String strName)throws Exception;
	
	
	
	/**
	 * 获取控件处理对象
	 * @param strName
	 * @return
	 * @throws Exception
	 */
	ICtrlHandler getCtrlHandler(String strName)throws Exception;
	
	
	
	/**
	 * 获取服务对象
	 * @return
	 */
	IService getService();
	
	
	/**
	 * 是否为拾取视图
	 * @return
	 */
	boolean isPickupView();
	
	
	
	/**
	 * 设置会话工厂
	 * @param sessionFactory
	 */
	void setSessionFactory(SessionFactory sessionFactory);
	
	/**
	 * 获取会话工厂
	 * @return
	 */
	SessionFactory getSessionFactory();
	
	
	
	/**
	 * 获取视图标题
	 * @return
	 */
	String getCaption();

	
	 /**
	  * 获取视图抬头
	 * @return
	 */
	String getTitle();

	
	/**
	 * 获取视图子标题
	 * @return
	 */
	 String getSubCaption();
	 
	 
	 
	 /**
	  * 获取视图属性
	 * @param strKey
	 * @return
	 */
	Object getAttribute(String strKey) throws Exception;
	
	
	
	/**
	 * 获取boolean 视图属性
	 * @param strKey
	 * @param bDefault
	 * @return
	 */
	boolean getAttribute(String strKey,boolean bDefault)  throws Exception;
	
	
	/**
	 * 获取String 视图属性
	 * @param strKey
	 * @param strDefault
	 * @return
	 */
	String getAttribute(String strKey,String strDefault)  throws Exception;
	
	/**
	 * 获取Integer 视图属性
	 * @param strKey
	 * @param nDefault
	 * @return
	 */
	int getAttribute(String strKey,int nDefault)  throws Exception;
	
	 
	/**
	 * 获取Double 视图属性
	 * @param strKey
	 * @param fDefault
	 * @return
	 */
	double getAttribute(String strKey,double fDefault)  throws Exception;
	
	
	/**
	 * 设置视图属性
	 * @param strKey
	 * @param objValue
	 */
	void setAttribute(String strKey,Object objValue)  throws Exception;
	
	
	
	
	/**
	 * 获取视图的访问用户模式
	 * @return
	 */
	int getAccessUserMode();  
	
	
	
	/**
	 * 获取视图的访问标识
	 * @return
	 */
	String getAccessKey();
	
	
	
	
	/**
	 * 获取视图的主数据状态
	 * @return
	 */
	String getMSTag() ;
	
	

	/**
	 * 获取界面行为集合
	 * @return
	 * @throws Exception
	 */
	java.util.Iterator<String> getUIActions() throws Exception;

}
