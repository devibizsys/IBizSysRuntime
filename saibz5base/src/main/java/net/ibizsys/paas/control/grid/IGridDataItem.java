package net.ibizsys.paas.control.grid;

import net.ibizsys.paas.data.IDataItem;

/**
 * 表格数据项
 * @author lionlau
 *
 */
public interface IGridDataItem extends IDataItem
{
	/**
	 * 数据范围控制
	 * @return
	 */
	boolean isDataAccessAction();
}
