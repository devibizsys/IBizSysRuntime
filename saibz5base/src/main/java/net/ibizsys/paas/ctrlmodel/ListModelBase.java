package net.ibizsys.paas.ctrlmodel;

import java.util.ArrayList;
import java.util.Iterator;

import net.ibizsys.paas.control.ControlTypes;
import net.ibizsys.paas.control.list.IListDataItem;
import net.ibizsys.paas.db.IDataRow;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;

/**
 * 列表部件模型
 * @author lionlau
 *
 */
public abstract class ListModelBase extends CtrlModelBase implements IListModel
{
	private ArrayList<IListDataItem> listDataItemList = new ArrayList<IListDataItem>();
	private int nPageSize = -1;
	
	@Override
	protected void onInit() throws Exception
	{
		super.onInit();
		prepareListDataItemModels();
	}
	
	@Override
	public String getControlType()
	{
		return ControlTypes.List;
	}
	
	
	/**
	 * 准备列表数据项
	 * @throws Exception
	 */
	protected void prepareListDataItemModels()throws Exception
	{
		
	}
	
	/**
	 * 增加列表数据项
	 * @param iListDataItem
	 */
	protected void registerListDataItem(IListDataItem iListDataItem)
	{
		this.listDataItemList.add(iListDataItem);
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.list.IList#getListDataItems()
	 */
	@Override
	public Iterator<IListDataItem> getListDataItems()
	{
		return this.listDataItemList.iterator();
	}
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.IListModel#fillFetchResult(net.ibizsys.paas.web.MDAjaxActionResult, net.ibizsys.paas.db.IDataTable)
	 */
	@Override
	public void fillFetchResult(MDAjaxActionResult fetchResult, IDataTable dt) throws Exception
	{
		if(dt.getCachedRowCount()==-1)
		{
			while(true )
			{
				IDataRow iDataRow = dt.next();
				if(iDataRow==null)
					break;
				
				JSONObject jo = new JSONObject();
				for(IListDataItem iListDataItem:this.listDataItemList){
					Object objValue = getListDataItemValue(iListDataItem,iDataRow);
					jo.put(iListDataItem.getName(), objValue);
				}
				fetchResult.getRows().add(jo);
			}
		}
		else
		{
			int nRows = dt.getCachedRowCount();
			for(int i=0;i<nRows;i++)
			{
				IDataRow iDataRow = dt.getCachedRow(i);
				
				JSONObject jo = new JSONObject();
				for(IListDataItem iListDataItem:this.listDataItemList){
					Object objValue = getListDataItemValue(iListDataItem,iDataRow);
					jo.put(iListDataItem.getName(), objValue);
				}
				fetchResult.getRows().add(jo);
			}
		}
	}
	
	
	/**
	 * 获取列表数据项结果值
	 * @param iListDataItem
	 * @param iDataRow
	 * @return
	 * @throws Exception
	 */
	protected Object getListDataItemValue(IListDataItem iListDataItem,IDataRow iDataRow)throws Exception{
		Object objValue = iListDataItem.getValue(this.getViewController().getWebContext(), iDataRow);
		if(objValue == null)
			return JSONNull.getInstance();
		return objValue;
	}

	@Override
	public int getPageSize() 
	{
		return this.nPageSize;
	}
	
	/**
	 * 设置默认数据分页大小
	 * @param nPageSize
	 */
	public void setPageSize(int nPageSize){
		this.nPageSize = nPageSize;
	}
	
	
	
}
