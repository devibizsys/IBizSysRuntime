package net.ibizsys.paas.web.jquery.render;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlhandler.CtrlRenderBase;
import net.ibizsys.paas.ctrlhandler.IChartRender;
import net.ibizsys.paas.ctrlmodel.IChartModel;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.web.MDAjaxActionResult;

/**
 * JQuery Echarts 图表绘制器基类
 * @author Administrator
 *
 */
public class ChartEchartsRender extends CtrlRenderBase implements IChartRender
{

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IMDCtrlRender#fillDEDataSetFetchContext(net.ibizsys.paas.core.DEDataSetFetchContext)
	 */
	@Override
	public void fillDEDataSetFetchContext(DEDataSetFetchContext deDataSetFetchContextImpl) throws Exception
	{
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IMDCtrlRender#getFetchQuickSearch()
	 */
	@Override
	public String getFetchQuickSearch()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IChartRender#fillFetchResult(net.ibizsys.paas.ctrlmodel.IChartModel, net.ibizsys.paas.web.MDAjaxActionResult, net.ibizsys.paas.db.IDataTable)
	 */
	@Override
	public void fillFetchResult(IChartModel iChartModel, MDAjaxActionResult fetchResult, IDataTable dt) throws Exception
	{
		iChartModel.fillFetchResult(fetchResult, dt);
	}

}
