package net.ibizsys.paas.web.util.bootstrap;

import java.util.ArrayList;

import org.hibernate.SessionFactory;

import net.ibizsys.paas.control.menu.AppMenuItem;
import net.ibizsys.paas.control.menu.IAppMenuItem;
import net.ibizsys.paas.control.menu.MenuItem;
import net.ibizsys.paas.ctrlmodel.IAppMenuModel;
import net.ibizsys.paas.security.AccessUserModes;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.WebContext;
import net.sf.json.JSONObject;

/**
 * 菜单绘制基类
 * @author Administrator
 *
 */
public abstract class MenuRenderBase {

	/**
	 * 绘制模式，常规，以连接的方式独立提供
	 */
	public final static Integer RENDERMODE_NORMAL = 1;
	
	
//	/**
//	 * 绘制模式，常规，以连接的方式独立提供
//	 */
//	public final static Integer RENDERMODE_NORMAL = 1;
	
	
	protected  static ThreadLocal< IWebContext> webContext = new ThreadLocal< IWebContext>();
	
	protected  static ThreadLocal< IAppMenuItem> activeAppMenuItem = new ThreadLocal< IAppMenuItem>();
	
	public MenuRenderBase() {
		
	}

	/**
	 * 输出菜单项
	 * @param sb
	 * @param nMode
	 * @param iAppMenuModel
	 * @param iWebContext
	 * @param strExtCssClass
	 * @throws Exception
	 */
	public static void outputMenuItem(StringBuilderEx sb,int nMode,IAppMenuItem iAppMenuItem,String strExtCssClass)throws Exception
	{
		IWebContext iWebContext = webContext.get();
		
		if(((iAppMenuItem.getAccUserMode() & AccessUserModes.LOGINUSER)>0)||((iAppMenuItem.getAccUserMode() & AccessUserModes.LOGINUSERWITHKEY)>0)){
			//需要身份
			if(iWebContext==null ||StringHelper.isNullOrEmpty(iWebContext.getCurUserId()))
				return;
			if((iAppMenuItem.getAccUserMode()& AccessUserModes.LOGINUSERWITHKEY)>0)
			{
				if(!iWebContext.getUserPrivilegeMgr().test(iWebContext, iAppMenuItem.getAccessKey()))
					return;
			}
		}
		
		if(iAppMenuItem.getItems().size() == 0)
		{
			//无子菜单
		}

		
//		jsonObject = MenuItem.toJSONObject(iAppMenuItem, jsonObject);
//		if(!StringHelper.isNullOrEmpty(iAppMenuItem.getAppFuncId()))
//		{
//			jsonObject.put(APPMENUITEM_APPFUNCID, iAppMenuItem.getAppFuncId());
//		}
//		if(iAppMenuItem.isHideSideBar())
//		{
//			jsonObject.put(APPMENUITEM_HIDESIDEBAR, iAppMenuItem.isHideSideBar());
//		}
//		if(iAppMenuItem.isOpenDefault())
//		{
//			jsonObject.put(APPMENUITEM_OPENDEFAULT, iAppMenuItem.isOpenDefault());
//		}
//			
//		if(iAppMenuItem.getItems().size() == 0)
//		{
//			jsonObject.put(MENUITEM_LEAF, true);
//		}
//		else
//		{
//			ArrayList<JSONObject> items = new ArrayList<JSONObject>();
//			for(IAppMenuItem childExpBarItem:iAppMenuItem.getItems())
//			{
//				JSONObject jsonItem = AppMenuItem.toJSONObject(childExpBarItem,null);
//				if(jsonItem==null)
//					continue;
//				items.add(jsonItem);
//			}
//			if(items.size()==0)
//			{
//				jsonObject.put(MENUITEM_LEAF, true);
//			}
//			else
//				jsonObject.put(MENUITEM_ITEMS, items.toArray());
//		}
//		
//		iAppMenuItem.get
//		<li class="start">
//		<a href="#/dashboard.html">
//		<i class="icon-home"></i>
//		<span class="title">Dashboard</span>
//		</a>
//	</li>
	}

}
