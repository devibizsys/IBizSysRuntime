package net.ibizsys.paas.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.ctrlhandler.CounterGlobal;
import net.ibizsys.paas.ctrlhandler.CtrlHandler;
import net.ibizsys.paas.ctrlhandler.ICounterHandler;
import net.ibizsys.paas.ctrlhandler.ICtrlHandler;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.db.DataSetCache;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.security.AccessUserModes;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.ViewAjaxActionResult;
import net.ibizsys.paas.web.WebContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图控制器基类
 * @author lionlau
 *
 */
public abstract class ViewControllerBase implements IViewController
{
	private static AjaxActionResult accessDenyResult = new AjaxActionResult();
	private static AjaxActionResult accessDenyResult2 = new AjaxActionResult();
	
	static
	{
		accessDenyResult.setRetCode(Errors.ACCESSDENY);
		accessDenyResult2.setRetCode(Errors.ACCESSDENY);
		accessDenyResult2.setErrorInfo("访问被拒绝，用户身份无效，需要重新登录");
	}

	
	/**
	 * 加载模型
	 */
	public static String VIEWACTION_LOADMODEL = "loadmodel";
	
	private static final Log log = LogFactory.getLog(ViewControllerBase.class);
	
	private Boolean bPrepareViewController = false;
	private  ThreadLocal< SessionFactory> sessionFactory = new ThreadLocal< SessionFactory>();
	
	protected HashMap<String, ICtrlModel> ctrlModelMap = new HashMap<String, ICtrlModel>();
	protected HashMap<String, ICtrlHandler> ctrlHandlerMap = new HashMap<String, ICtrlHandler>();
	protected HashMap<String, String> uiActionMap = new HashMap<String, String>();
	
	private String strCaption = "";
	private String strTitle = "";
	private String strSubCaption = "";
	private String strMSTag = "";
	
	/**
	 * 视图访问用户模式
	 */
	private int nAccessUserMode = AccessUserModes.ALLUSER;
	
	/**
	 * 视图访问标识
	 */
	private String strAccessKey = null;
	
	
	private DataObject attributeDataObject = new DataObject();
	
	private String strId = null;

	public ViewControllerBase() throws Exception{
		
		
	}
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getId()
	 */
	@Override
	public String getId()
	{
		return this.strId ;
	}
	
	/**
	 * 设置视图标识
	 * @param strId
	 */
	protected void setId(String strId)
	{
		this.strId = strId;
	}
	
	
	/**
	 * 获取应用程序模型
	 * @return
	 */
	public  abstract IApplicationModel  getAppModel() ;
	 
	/**
	 * 准备视图参数 
	 * @throws Exception
	 */
	protected void prepareViewParam()throws Exception{
		
	} 
	
	/**
	 * 准备部件模型
	 * @throws Exception
	 */
	protected void prepareCtrlModels()throws Exception{
		
	}
	
	/**
	 * 准备部件处理对象
	 * @throws Exception
	 */
	protected void prepareCtrlHandlers()throws Exception{
		
	}
	
	/**
	 * 准备界面行为集合
	 * @throws Exception
	 */
	protected void prepareUIActions()throws Exception{
		
	}
	
	
	/**
	 * 准备视图控制器
	 * @throws Exception
	 */
	public  void prepareViewController() throws Exception
	{
		synchronized(bPrepareViewController)
		{
			if(bPrepareViewController)
			{
				return;
			}
			
			prepareViewParam();
			prepareUIActions();
			prepareCtrlModels();
			prepareCtrlHandlers();
			bPrepareViewController = true;
		}
	}
	
	/**
	 * 是否已经准备视图
	 * @return
	 */
	public final boolean isPrepareViewController()
	{
		return this.bPrepareViewController;
	}
	
	
	
	/**
	 * 处理请求入口
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="")
	public void process( HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		prepareViewController();
		
		this.addTimeOutHeaders(response);
		response.setCharacterEncoding("utf-8");   
		response.setContentType("application/json;charset=UTF-8");
		
		try
		{
			IWebContext iWebContext = this.createWebContext(request, response);
			WebContext.setCurrent(iWebContext);
			ViewController.setCurrent(this);
			DataSetCache.enableCurrent();
			
			String strCtrlId = WebContext.getCtrlId(iWebContext);
			String strCtrlAction = WebContext.getAction(iWebContext);
			
			if(!this.testUserAccess(iWebContext))
			{
				resetCurrent();
				return;
			}
			
			if(this.getAppModel().doFilter(this, request, response))
			{
				resetCurrent();
				return;
			}
					
			if(!StringHelper.isNullOrEmpty(strCtrlId))
			{
				AjaxActionResult ajaxActionResult = onCtrlAjaxAction(request,response,strCtrlId,strCtrlAction); 
				response.getWriter().print(ajaxActionResult.toJSONString());
				response.getWriter().flush();
				response.getWriter().close();
				
				resetCurrent();
				return;
			}
			
			String strCounterId = WebContext.getCounterId(iWebContext);
			if(!StringHelper.isNullOrEmpty(strCounterId))
			{
				AjaxActionResult ajaxActionResult = onCounterAjaxAction(strCounterId,strCtrlAction); 
				response.getWriter().print(ajaxActionResult.toJSONString());
				response.getWriter().flush();
				response.getWriter().close();
				
				resetCurrent();
				return;
			}
			
			
			if(!StringHelper.isNullOrEmpty(strCtrlAction))
			{
				AjaxActionResult ajaxActionResult = onViewAjaxAction(strCtrlAction); 
				ajaxActionResult = getAppModel().doFilterViewAction(this, request, response,strCtrlAction, ajaxActionResult);
				response.getWriter().print(ajaxActionResult.toJSONString());
				response.getWriter().flush();
				response.getWriter().close();
				resetCurrent();
				return;
			}

		}
		catch (Exception ex)
		{
			log.error(ex.getMessage(),ex);
			
			resetCurrent();
			
			AjaxActionResult ajaxActionResult = new AjaxActionResult();
			ajaxActionResult.setRetCode(Errors.INTERNALERROR);
			ajaxActionResult.setErrorInfo(ex.getMessage());
			if(ex instanceof ErrorException)
			{
				ErrorException errorException  = (ErrorException)ex;
				ajaxActionResult.setRetCode(errorException.getErrorCode());
			}
			
			response.getWriter().print(ajaxActionResult.toJSONString());
			response.getWriter().flush();
			response.getWriter().close();
			//throw new ServletException(ex);
		}
    }
	
	/**
	 * 重置当前变量
	 */
	protected void resetCurrent()
	{
		this.setSessionFactory(null);
		WebContext.setCurrent(null);
		ViewController.setCurrent(null);
		CtrlHandler.setCurrent(null);
		DataSetCache.resetCurrent();
	}
	
	/**
	 * 部件后台处理触发
	 * @param request
	 * @param response
	 * @param strCtrlId
	 * @param strAction
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onCtrlAjaxAction(HttpServletRequest request,HttpServletResponse response,String strCtrlId,String strAction) throws Exception
	{
		ICtrlHandler iCtrlHandler =  ctrlHandlerMap.get(strCtrlId);
		if(iCtrlHandler == null)
			throw new Exception(StringHelper.format("无法获取指定部件处理对象[%1$s]", strCtrlId));
		
		CtrlHandler.setCurrent(iCtrlHandler);
		return getAppModel().doViewCtrlAjaxAction(this, request, response, strCtrlId, strAction, iCtrlHandler);
	}
	
	
	/**
	 * 计数器后台处理触发
	 * @param strCounterId
	 * @param strAction
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onCounterAjaxAction(String strCounterId,String strAction) throws Exception
	{
		ICounterHandler iCounterHandler = CounterGlobal.getCounterHandler(strCounterId);
		if(iCounterHandler == null)
			throw new Exception(StringHelper.format("无法获取指定计数器处理对象[%1$s]", strCounterId));
		
		return iCounterHandler.processAction(strAction,this, this.getWebContext());
	}
	
	
	/**
	 * 视图后台处理触发
	 * @param strAction
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onViewAjaxAction(String strAction) throws Exception
	{
		if(StringHelper.compare(strAction, VIEWACTION_LOADMODEL, true) == 0)
		{
			return onLoadViewModel();
		}
		throw new Exception(StringHelper.format("没有处理视图请求[%1$s]", strAction));
	}
	
	/**
	 * 加载页面模型
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onLoadViewModel() throws Exception
	{
		return new ViewAjaxActionResult();
	}
	
	/**
     * 增加超时标记
     *
     * @param response
     */
    protected void addTimeOutHeaders(HttpServletResponse response)
    {
        response.setDateHeader("Expires", System.currentTimeMillis());
    }
    
    
    /**
     * 获取上下文访问对象
     * @return
     */
    public  IWebContext getWebContext()
    {
    	return WebContext.getCurrent();
    }
    
    
    @Override
	public  void registerCtrlModel(String strCtrlId,ICtrlModel iCtrlModel)throws Exception{
    	ctrlModelMap.put(strCtrlId,iCtrlModel);
    }
    
    
    @Override
	public  void registerCtrlHandler(String strCtrlId,ICtrlHandler iCtrlHandler)throws Exception{
    	ctrlHandlerMap.put(strCtrlId,iCtrlHandler);
    }
    
    /**
     * 注册界面行为
     * @param strUIActionId
     * @throws Exception
     */
    protected  void registerUIAction(String strUIActionId)throws Exception
    {
    	uiActionMap.put(strUIActionId, "");
    }
    

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getSystemModel()
	 */
	@Override
	public ISystemModel getSystemModel()
	{
		return null;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getDataEntityModel()
	 */
	@Override
	public IDataEntityModel getDEModel()
	{
		return null;
	}
	
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getService()
	 */
	@Override
	public IService getService()
	{
		return null;
	}
    
    
    
	/**
	 * 获取控件模型
	 * @param strName
	 * @return
	 * @throws Exception
	 */
	@Override
	public ICtrlModel getCtrlModel(String strName)throws Exception
	{
		ICtrlModel iCtrlModel = this.ctrlModelMap.get(strName);
		if(iCtrlModel == null)
			throw new Exception(StringHelper.format("无法获取指定部件模型[%1$s]", strName));
		return iCtrlModel;
	}
	
	
	/**
	 * 获取控件处理对象
	 * @param strName
	 * @return
	 * @throws Exception
	 */
	@Override
	public ICtrlHandler getCtrlHandler(String strName)throws Exception
	{
		ICtrlHandler iCtrlHandler = this.ctrlHandlerMap.get(strName);
		if(iCtrlHandler == null)
			throw new Exception(StringHelper.format("无法获取指定部件处理对象[%1$s]", strName));
		return iCtrlHandler;
	}

	
	/**
	 * 是否为拾取视图
	 * @return
	 */
	@Override
	public boolean isPickupView()
	{
		return false;
	}
	
	
	/**
	 * 建立网络访问上下文
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	protected IWebContext createWebContext(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		return getAppModel().createWebContext(this,request, response);
	}
	
	
	/**
	 * 设置会话工厂
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory.set(sessionFactory);
	}
	
	
	/**
	 * 获取会话工厂
	 * @return
	 */
	public SessionFactory getSessionFactory()
	{
		return this.sessionFactory.get();
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getCaption()
	 */
	public String getCaption() 
	{
		return strCaption;
	}

	/**
	 * 设置标题
	 * @param strCaption
	 */
	protected void setCaption(String strCaption)
	{
		this.strCaption = strCaption;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getTitle()
	 */
	public String getTitle()
	{
		return strTitle;
	}

	/**
	 * 设置抬头
	 * @param strTitle
	 */
	protected void setTitle(String strTitle)
	{
		this.strTitle = strTitle;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getSubCaption()
	 */
	public String getSubCaption() 
	{
		return strSubCaption;
	}

	/**
	 * 设置子标题
	 * @param strSubCaption
	 */
	protected void setSubCaption(String strSubCaption) 
	{
		this.strSubCaption = strSubCaption;
	}

	@Override
	public Object getAttribute(String strKey) throws Exception
	{
		return attributeDataObject.get(strKey);
	}

	@Override
	public void setAttribute(String strKey, Object objValue)throws Exception
	{
		this.attributeDataObject.set(strKey,objValue);
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getAttribute(java.lang.String, boolean)
	 */
	@Override
	public boolean getAttribute(String strKey, boolean bDefault) throws Exception
	{
		return DataObject.getBoolValue(this.attributeDataObject, strKey,bDefault);
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getAttribute(java.lang.String, java.lang.String)
	 */
	@Override
	public String getAttribute(String strKey, String strDefault) throws Exception
	{
		return DataObject.getStringValue(this.attributeDataObject, strKey,strDefault);
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getAttribute(java.lang.String, int)
	 */
	@Override
	public int getAttribute(String strKey, int nDefault) throws Exception
	{
		return DataObject.getIntegerValue(this.attributeDataObject, strKey,nDefault);
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getAttribute(java.lang.String, double)
	 */
	@Override
	public double getAttribute(String strKey, double fDefault) throws Exception
	{
		return DataObject.getDoubleValue(this.attributeDataObject, strKey,fDefault);
	}
	
	
	/**
	 * 获取视图的访问用户模式
	 * @return
	 */
	@Override
	public int getAccessUserMode()
	{
		return this.nAccessUserMode;
	}
	
	/**
	 * 设置访问用户模式
	 * @param nAccessUserMode
	 */
	protected void setAccessUserMode(int nAccessUserMode)
	{
		this.nAccessUserMode = nAccessUserMode;
	}
	
	
	
	/**
	 * 获取视图的访问标识
	 * @return
	 */
	@Override
	public String getAccessKey()
	{
		return this.strAccessKey;
	}
	
	/**
	 * 设置视图的访问标识
	 * @return
	 */
	protected void setAccessKey(String strAccessKey)
	{
		this.strAccessKey = strAccessKey;
	}

	
	/**
	 * 判断用户是否能够访问视图
	 * @return
	 * @throws Exception
	 */
	public boolean testUserAccess(IWebContext iWebContext)throws Exception
	{
		String strPersonId = iWebContext.getCurUserId();
		if(StringHelper.isNullOrEmpty(strPersonId))
		{
			//匿名用户
			if((this.getAccessUserMode() & AccessUserModes.ANONYMOUS) > 0)
			{
				return true;
			}
			
			iWebContext.getResponse().getWriter().print(accessDenyResult2.toJSONString());
			iWebContext.getResponse().getWriter().flush();
			iWebContext.getResponse().getWriter().close();
			return false;
		}
		else
		{
			//匿名用户
			if((this.getAccessUserMode() & AccessUserModes.LOGINUSER) > 0)
			{
				return true;
			}
			
			if((this.getAccessUserMode() & AccessUserModes.LOGINUSERWITHKEY) > 0)
			{
				if(iWebContext.getUserPrivilegeMgr().test(this.getWebContext(), this.getAccessKey()))
					return true;
			}
		}
		
		iWebContext.getResponse().getWriter().print(accessDenyResult.toJSONString());
		iWebContext.getResponse().getWriter().flush();
		iWebContext.getResponse().getWriter().close();
		return false;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.controller.IViewController#getMSTag()
	 */
	@Override
	public String getMSTag()
	{
		return strMSTag;
	}
	
	/**
	 * 设置主状态标记
	 * @param strMSTag
	 */
	protected void setMSTag(String strMSTag)
	{
		this.strMSTag = strMSTag;
	}
	
	/**
	 * 获取界面行为集合
	 * @return
	 * @throws Exception
	 */
	@Override
	public java.util.Iterator<String> getUIActions() throws Exception
	{
		if(uiActionMap.size()==0)
			return null;
		return uiActionMap.keySet().iterator();
	}

}
