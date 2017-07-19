package net.ibizsys.paas.control.menu;

import net.ibizsys.paas.security.AccessUserModes;
import net.sf.json.JSONObject;

/**
 * 菜单项
 * @author lionlau
 *
 */
public class MenuItem implements IMenuItem
{
	/**
	 * 计数器标识
	 */
	public final static String MENUITEM_COUNTERID = "counterid";
	
	/**
	 * 菜单项标识
	 */
	public final static String MENUITEM_ID = "id";
	
	/**
	 * 父菜单项标识
	 */
	public final static String MENUITEM_PID = "pid";
	
	/**
	 * 显示文本
	 */
	public final static String MENUITEM_TEXT = "text";
	
	/**
	 * 图标路径
	 */
	public final static String MENUITEM_ICONPATH = "icon";
	
	/**
	 * 文本显示样式
	 */
	public final static String MENUITEM_TEXTCLS = "textcls";
	
	/**
	 * 图标显示样式
	 */
	public final static String MENUITEM_ICONCLS = "iconcls";
	
	/**
	 * 子项集合
	 */
	public final static String MENUITEM_ITEMS = "items";
	

	/**
	 * 是否为子节点
	 */
	public final static String MENUITEM_LEAF = "leaf";
	
	/**
	 * 是否默认展开
	 */
	public final static String MENUITEM_EXPANDED = "expanded";
	
	private String strId = "";
	private String strText = "";
	private boolean bExpanded = false;
	private String strItemType = null;
	private int nAccUserMode = AccessUserModes.UNKNOWN;
	private String strAccessKey = null;
	
	/**
	 * 获取父标识
	 * @return
	 */
	private String strPId = "";
	
	/**
	 * 获取文本样式
	 * @return
	 */
	private  String strTextCls= "";
	
	
	
	/**
	 * 获取图标样式
	 * @return
	 */
	private  String strIconCls= "";
	
	
	/**
	 * 获取图标路径
	 * @return
	 */
	private  String strIconPath= "";
	
	
	
	/**
	 * 获取计数器标识
	 * @return
	 */
	private String strCounterId= "";
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getId()
	 */
	@Override
	public String getId()
	{
		return strId;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getText()
	 */
	@Override
	public String getText()
	{
		return this.strText;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#isExpanded()
	 */
	@Override
	public boolean isExpanded()
	{
		return this.bExpanded;
	}
	
		
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getPId()
	 */
	@Override
	public String getPId()
	{
		return this.strPId;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getTextCls()
	 */
	@Override
	public String getTextCls()
	{
		return this.strTextCls;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getIconCls()
	 */
	@Override
	public String getIconCls()
	{
		return this.strIconCls;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getIconPath()
	 */
	@Override
	public String getIconPath()
	{
		return this.strIconPath;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getCounterId()
	 */
	@Override
	public String getCounterId()
	{
	return this.strCounterId;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#setAttribute(java.lang.String, java.lang.Object)
	 */
	@Override
	public void setAttribute(String strName, Object objValue)
	{
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.expbar.IExpBarItem#getAttribute(java.lang.String)
	 */
	@Override
	public Object getAttribute(String strName)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *  设置标识
	 * @param strId the strId to set
	 */
	public void setId(String strId)
	{
		this.strId = strId;
	}

	/**
	 * 设置文本
	 * @param strText the strText to set
	 */
	public void setText(String strText)
	{
		this.strText = strText;
	}

	/**
	 * 设置默认展开
	 * @param bExpanded the bExpanded to set
	 */
	public void setExpanded(boolean bExpanded)
	{
		this.bExpanded = bExpanded;
	}

	/**
	 * 设置父菜单项标识
	 * @param strPId the strPId to set
	 */
	public void setPId(String strPId)
	{
		this.strPId = strPId;
	}

	/**
	 * 设置文本样式
	 * @param strTextCls the strTextCls to set
	 */
	public void setTextCls(String strTextCls)
	{
		this.strTextCls = strTextCls;
	}

	/**
	 * 设置图标样式
	 * @param strIconCls the strIconCls to set
	 */
	public void setIconCls(String strIconCls)
	{
		this.strIconCls = strIconCls;
	}

	/**
	 * 设置图标路径
	 * @param strIconPath the strIconPath to set
	 */
	public void setIconPath(String strIconPath)
	{
		this.strIconPath = strIconPath;
	}

	/**
	 * 设置计数器标识
	 * @param strCounterId the strCounterId to set
	 */
	public void setCounterId(String strCounterId)
	{
		this.strCounterId = strCounterId;
	}

	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.menu.IMenuItem#getItemType()
	 */
	@Override
	public String getItemType()
	{
		return this.strItemType;
	}

	/**
	 * 设置菜单项类型
	 * @param strItemType
	 */
	public void setItemType(String strItemType)
	{
		this.strItemType = strItemType;
	}
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.menu.IMenuItem#getAccessKey()
	 */
	@Override
	public String getAccessKey()
	{
		return this.strAccessKey;
	}

	
	
	/**
	 * 设置菜单项资源编号
	 * @param strAccessKey
	 */
	public void setAccessKey(String strAccessKey)
	{
		this.strAccessKey = strAccessKey;
	}
	
	
	
	/**
	 * 导出到JSON对象
	 * @param iExpBarItem
	 * @param jsonObject
	 * @return
	 * @throws Exception
	 */
	public static JSONObject toJSONObject(IMenuItem iExpBarItem,JSONObject jsonObject)throws Exception
	{
		if(jsonObject == null)
			jsonObject = new JSONObject();
		jsonObject.put(MENUITEM_ID, iExpBarItem.getId());
		jsonObject.put(MENUITEM_TEXT, iExpBarItem.getText());
		jsonObject.put(MENUITEM_TEXTCLS, iExpBarItem.getTextCls());
		jsonObject.put(MENUITEM_ICONPATH, iExpBarItem.getIconPath());
		jsonObject.put(MENUITEM_ICONCLS, iExpBarItem.getIconCls());
		jsonObject.put(MENUITEM_COUNTERID, iExpBarItem.getCounterId());
		jsonObject.put(MENUITEM_EXPANDED, iExpBarItem.isExpanded());
		
		return jsonObject;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.menu.IMenuItem#getAccUserMode()
	 */
	@Override
	public int getAccUserMode()
	{
		return nAccUserMode;
	}
	
	/**
	 * 设置用户访问模式
	 * @param nAccUserMode
	 */
	public void setAccUserMode(int nAccUserMode)
	{
		this.nAccUserMode = nAccUserMode;
	}
	
}
