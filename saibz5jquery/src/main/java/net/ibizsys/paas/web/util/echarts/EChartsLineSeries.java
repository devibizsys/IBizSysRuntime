package net.ibizsys.paas.web.util.echarts;

import java.util.ArrayList;

import net.sf.json.JSONObject;

/**
 *  ECharts 线图序列
 * @author Administrator
 *
 */
public class EChartsLineSeries extends EChartsSeries
{
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.web.util.echarts.EChartsSeries#onFillSeriesJO(net.sf.json.JSONObject, java.util.ArrayList)
	 */
	@Override
	protected void onFillSeriesJO(JSONObject series,ArrayList<String> globalCatalogNameList) throws Exception
	{
		ArrayList<Double> dataList = new  ArrayList<Double>();
		for(String strCatalogName:globalCatalogNameList)
		{
			EChartsPoint echartsPoint = this.getEChartsPoint(strCatalogName);
			if(echartsPoint!=null)
			{
				dataList.add( echartsPoint.getValue());
			}
			else
			{
				dataList.add( 0.0);
			}
	
		}
		series.put("data", dataList.toArray());
	}
}
