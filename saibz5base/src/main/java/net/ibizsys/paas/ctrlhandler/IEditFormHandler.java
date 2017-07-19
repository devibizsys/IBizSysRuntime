package net.ibizsys.paas.ctrlhandler;

/**
 * 编辑表单处理对象接口
 * @author lionlau
 *
 */
public interface IEditFormHandler extends ISDCtrlHandler
{
	public final static String ITEMACTIONTYPE_FORMITEM = "FI:";
	
	public final static String ITEMACTIONTYPE_FORMITEMUPDATE = "FIU:";
	
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
	 * 更新表单项
	 */
	final static String ACTION_UPDATEFORMITEM = "updateformitem";
	
}
