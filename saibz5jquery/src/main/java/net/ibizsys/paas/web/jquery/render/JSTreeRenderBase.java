package net.ibizsys.paas.web.jquery.render;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlhandler.CtrlRenderBase;
import net.ibizsys.paas.ctrlhandler.ICtrlRender;

/**
 * JQuery JSTree 绘制器基类
 * @author Administrator
 *
 */
public abstract class JSTreeRenderBase  extends CtrlRenderBase implements ICtrlRender
{
	public final static String TREENODE_COUNTERID = "counterid";
	public final static String TREENODE_COUNTERMODE = "countermode";
	public final static String TREENODE_ID = "id";
	public final static String TREENODE_PID = "pid";
	public final static String TREENODE_TEXT = "text";
	public final static String TREENODE_ICON = "icon";
	public final static String TREENODE_TEXTCLS = "textcls";
//	public final static String TREENODE_ICONCLS = "iconcls";
	public final static String TREENODE_ITEMS = "children";
	public final static String TREENODE_LEAF = "leaf";
	public final static String TREENODE_VIEWID = "viewid";
	public final static String TREENODE_DRITEM = "dritem";
	public final static String TREENODE_VIEWPARAM = "viewparam";
	public final static String TREENODE_EXPANDED = "opened";
	public final static String TREENODE_STATE = "state";
	public final static String TREENODE_TAG = "tag";
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IMDCtrlRender#fillDEDataSetFetchContext(net.ibizsys.paas.core.DEDataSetFetchContext)
	 */
	public void fillDEDataSetFetchContext(DEDataSetFetchContext deDataSetFetchContextImpl) throws Exception
	{
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IMDCtrlRender#getFetchQuickSearch()
	 */
	public String getFetchQuickSearch()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	

	/**
	 * 是否以数组形式下发结果
	 * @return
	 */
	protected boolean isFetchResultArrayMode(){
		return true;
	}
}
