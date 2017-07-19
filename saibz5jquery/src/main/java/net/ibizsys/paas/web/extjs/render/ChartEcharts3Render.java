package net.ibizsys.paas.web.extjs.render;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlhandler.CtrlRenderBase;
import net.ibizsys.paas.ctrlhandler.IChartRender;
import net.ibizsys.paas.ctrlmodel.IChartModel;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.web.util.echarts.EChartsOption;
import net.sf.json.JSONObject;

/**
 * Echarts3 图表绘制器
 * @author Administrator
 *
 */
public class ChartEcharts3Render extends CtrlRenderBase implements IChartRender
{

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IMDCtrlRender#fillDEDataSetFetchContext(net.ibizsys.paas.core.DEDataSetFetchContext)
	 */
	@Override
	public void fillDEDataSetFetchContext(DEDataSetFetchContext deDataSetFetchContextImpl) throws Exception
	{
		
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IMDCtrlRender#getFetchQuickSearch()
	 */
	@Override
	public String getFetchQuickSearch()
	{
		return null;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.IChartRender#fillFetchResult(net.ibizsys.paas.ctrlmodel.IChartModel, net.ibizsys.paas.web.MDAjaxActionResult, net.ibizsys.paas.db.IDataTable)
	 */
	@Override
	public void fillFetchResult(IChartModel iChartModel, MDAjaxActionResult fetchResult, IDataTable dt) throws Exception
	{
		EChartsOption echartsOption = EChartsOption.createEChartsOption(iChartModel);
		echartsOption.loadDataTable(dt);
		
		JSONObject opt  = echartsOption.getOptionJO();
		if(opt!=null)
		{
			fetchResult.setData(opt);
			return;
		}
		
//		IChartSeriesModel iChartSeriesModel = null;
//		java.util.Iterator<IChartSeriesModel> chartSeriesModels = iChartModel.getChartSeriesModels();
//		if(chartSeriesModels!=null)
//		{
//			while(chartSeriesModels.hasNext())
//			{
//				iChartSeriesModel = chartSeriesModels.next();
//				break;
//			}
//		}
//		if(iChartSeriesModel!=null)
//		{
//			if(dt.getCachedRowCount()==-1)
//				dt.cacheRows(-1);
//			
//			JSONObject opt = null;
//			//判断类型
//			if(StringHelper.compare(iChartSeriesModel.getSeriesType(),IChartSeriesModel.SERIESTYPE_PIE,true) == 0)
//			{
//				opt = getPieChartOption( iChartModel, iChartSeriesModel,  fetchResult,  dt) ;
//			}
//			else
//				if(StringHelper.compare(iChartSeriesModel.getSeriesType(),IChartSeriesModel.SERIESTYPE_LINE,true) == 0)
//				{
//					opt = getLineChartOption( iChartModel, iChartSeriesModel,  fetchResult,  dt) ;
//				}
//			
//			if(opt!=null)
//			{
//				fetchResult.setData(opt);
//				return;
//			}
//		}
		iChartModel.fillFetchResult(fetchResult, dt);
	}

}
