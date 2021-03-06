package net.ibizsys.paas.web.jquery.render;

import net.ibizsys.paas.ctrlhandler.IGridRender;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.web.MDAjaxActionResult;

/**
 * JQuery Bootstrap 表格绘制器基类
 * @author Administrator
 *
 */
public class GridBootstrapTableRender extends BootstrapTableRenderBase implements IGridRender
{

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IGridRender#fillFetchResult(net.ibizsys.paas.ctrlmodel.IGridModel, net.ibizsys.paas.web.MDAjaxActionResult, net.ibizsys.paas.db.IDataTable)
	 */
	@Override
	public void fillFetchResult(IGridModel iGridModel, MDAjaxActionResult fetchResult, IDataTable dt) throws Exception
	{
		iGridModel.fillFetchResult(fetchResult, dt);
	}

}
