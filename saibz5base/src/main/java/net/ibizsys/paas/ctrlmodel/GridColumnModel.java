package net.ibizsys.paas.ctrlmodel;

import net.ibizsys.paas.control.grid.IGrid;
import net.ibizsys.paas.control.grid.IGridColumn;
import net.ibizsys.paas.control.grid.IGridDataItem;
import net.ibizsys.paas.core.ModelBaseImpl;
import net.ibizsys.paas.data.IDataItemParam;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.sysmodel.ICodeListModel;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.IWebContext;

/**
 * 表格列模型
 * @author lionlau
 *
 */
public class GridColumnModel extends ModelBaseImpl implements IGridColumn
{
	protected IGrid iGrid = null;

	protected String strCaption = "";
	protected String strDataItemName = "";
	private String strCodeListId = null;
	private String strAlign = ALIGN_LEFT;
	
	public GridColumnModel(){
		
	}
	
	
	/**
	 * 初始化
	 * @param iGrid 表格对象
	 * @throws Exception
	 */
	public void init(IGrid iGrid)throws Exception{
		this.setGrid(iGrid);
		this.onInit();
	}
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.grid.IGridColumn#getCaption()
	 */
	@Override
	public String getCaption()
	{
		return strCaption;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.grid.IGridColumn#getDataItemName()
	 */
	@Override
	public String getDataItemName()
	{
		return strDataItemName;
	}

	/**
	 * 设置标题
	 * @param strCaption the strCaption to set
	 */
	public void setCaption(String strCaption)
	{
		this.strCaption = strCaption;
	}

	/**
	 * 设置数据项名称
	 * @param strDataItemName the strDataItemName to set
	 */
	public void setDataItemName(String strDataItemName)
	{
		this.strDataItemName = strDataItemName;
	}
	
	/**
	 * 设置列名称
	 * @param strDataItemName the strDataItemName to set
	 */
	public void setName(String strName)
	{
		this.strName = strName;
	}
	
	/**
	 * 获取表格对象
	 * @return the iGrid
	 */
	protected IGrid getGrid()
	{
		return iGrid;
	}

	/**
	 * 设置表格对象
	 * @param iGrid the iGrid to set
	 */
	protected void setGrid(IGrid iGrid)
	{
		this.iGrid = iGrid;
	}


	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.grid.IGridColumn#getExcelCaption()
	 */
	@Override
	public String getExcelCaption()
	{
		return getCaption();
	}


	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.grid.IGridColumn#getCodeListId()
	 */
	@Override
	public String getCodeListId()
	{
		return this.strCodeListId;
	}

	/**
	 * 设置代码表标识
	 * @param strCodeListId
	 */
	public void setCodeListId(String strCodeListId)
	{
		this.strCodeListId = strCodeListId;
	}
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.grid.IGridColumn#getAlign()
	 */
	@Override
	public String getAlign()
	{
		return this.strAlign;
	}
	
	/**
	 * 设置水平对齐方式
	 * @param strAlign
	 */
	public void setAlign(String strAlign)
	{
		this.strAlign = strAlign;
	}
	

	/**
	 * 获取表格模型对象
	 * @return
	 */
	public IGridModel getGridModel()
	{
		return (IGridModel)this.getGrid();
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.grid.IGridColumn#getExcelText(net.ibizsys.paas.web.IWebContext, java.lang.Object)
	 */
	@Override
	public String getExcelText(IWebContext iWebContext, Object object) throws Exception
	{
		try{
			IGridDataItem iGridDataItem = getGridModel().getGridDataItem(this.getDataItemName());
			Object objValue = iGridDataItem.getValue(iWebContext, object);
			
			ICodeListModel iCodeListModel = null;
			if(!StringHelper.isNullOrEmpty(this.getCodeListId()))
			{
				boolean bConvertCL = true;
				if(!StringHelper.isNullOrEmpty(iGridDataItem.getCodeListId()))
				{
					bConvertCL = false;
				}
				else
					if(iGridDataItem.getDataItemParams()!=null)
					{
						for(IDataItemParam iDataItemParam:iGridDataItem.getDataItemParams())
						{
							if(!StringHelper.isNullOrEmpty(iDataItemParam.getCodeListId()))
							{
								bConvertCL = false;
								break;
							}
						}
					}
				if(bConvertCL)
					iCodeListModel = (ICodeListModel) CodeListGlobal.getCodeList(this.getCodeListId());
			}
			
			if(objValue == null)
			{
				if(iCodeListModel!=null)
					return iCodeListModel.getEmptyText();
				return "";
			}
			else
			{
				if(iCodeListModel!=null)
					return iCodeListModel.getCodeListText(objValue.toString(), true);
				return objValue.toString();
			}
		}
		catch(Exception ex){
			return ex.getMessage();
		}
		
	}
	
}
