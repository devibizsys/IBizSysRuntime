package net.ibizsys.paas.ctrlhandler;

/**
 * 表格处理对象接口
 * @author lionlau
 *
 */
public interface IGridHandler extends IMDCtrlHandler,ISDCtrlHandler
{
	public final static String ITEMACTIONTYPE_GRIDEDITITEM = "GEI:";
	
	public final static String ITEMACTIONTYPE_GRIDEDITITEMUPDATE = "GEIU:";
	
	
	/**
	 * 表单项数据
	 */
	final static String ACTION_ITEMFETCH = "itemfetch";
	

	/**
	 * 获取草稿数据
	 */
	final static String ACTION_LOADDRAFT = "loaddraft";
	
	
	/**
	 * 获取草稿数据（从源数据）
	 */
	final static String ACTION_LOADDRAFTFROM = "loaddraftfrom";
	
	
	/**
	 * 更新表格编辑项
	 */
	final static String ACTION_UPDATEGRIDEDITITEM = "updategridedititem";
}
