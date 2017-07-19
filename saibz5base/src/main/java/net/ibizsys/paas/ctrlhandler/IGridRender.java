package net.ibizsys.paas.ctrlhandler;

import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.web.MDAjaxActionResult;

/**
 * 表格绘制器接口
 * @author Administrator
 *
 */
public interface IGridRender extends IMDCtrlRender
{

	/**
	 * 填充数据获取结果
	 * @param fetchResult
	 * @param dt
	 * @throws Exception
	 */
	void fillFetchResult(IGridModel iGridModel, MDAjaxActionResult fetchResult,IDataTable dt)throws Exception;
	
	
}
