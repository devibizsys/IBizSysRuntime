package net.ibizsys.paas.ctrlmodel;

import net.ibizsys.paas.control.list.IList;
import net.ibizsys.paas.control.list.IListDataItem;
import net.ibizsys.paas.core.IActionContext;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.datamodel.DataItemModel;

/**
 * 列表数据项参数
 * @author lionlau
 *
 */
public class ListDataItemModel extends DataItemModel implements IListDataItem
{
	protected IList iList = null;
	
	public ListDataItemModel(){
		
	}
	
	/**
	 * 初始化
	 * @param iList
	 * @throws Exception
	 */
	public void init(IList iList)throws Exception{
		this.setList(iList);
		this.onInit();
	}
	

	

	/**
	 * 获取列表部件对象
	 * @return the iList
	 */
	protected IList getList()
	{
		return iList;
	}

	/**
	 * 设置列表部件对象
	 * @param iList the iList to set
	 */
	protected void setList(IList iList)
	{
		this.iList = iList;
	}

	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.data.impl.DataItemImpl#getCurSystem(net.ibizsys.paas.core.IActionContext)
	 */
	@Override
	public ISystem getCurSystem(IActionContext iActionContext ) throws Exception
	{
		return this.getList().getDataEntity().getSystem();
	}
}
