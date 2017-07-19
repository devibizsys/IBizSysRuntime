package net.ibizsys.paas.ctrlmodel;

import net.ibizsys.paas.control.grid.IGridEditItem;
import net.ibizsys.paas.web.IWebContext;
import net.sf.json.JSONObject;

/**
 * 表格编辑项模型
 * @author lionlau
 *
 */
public interface IGridEditItemModel extends IGridEditItem
{
	/**
	 * 获取表格模型对象
	 * @return
	 */
	IGridModel getGridModel();
	
	
	/**
	 * 是否输出代码表配置
	 * @return
	 */
	boolean isOutputCodeListConfig();
	
	
	/**
	 * 获取表格编辑项输入的值（WEB请求）
	 * @param iWebContext
	 * @return
	 */
	Object getInputValue(IWebContext iWebContext) throws Exception;
	
	
	
	/**
	 * 获取表格编辑项输入的值（JSON对象）
	 * @param jsonObject
	 * @return
	 * @throws Exception
	 */
	Object getInputValue(JSONObject jsonObject) throws Exception;
	
	/**
	 * 获取表格编辑项默认值
	 * @param iWebContext
	 * @param bUpdate 是否为更新模式
	 * @return
	 */
	Object getDefaultValue(IWebContext iWebContext,boolean bUpdate) throws Exception;
}
