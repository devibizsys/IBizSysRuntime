package net.ibizsys.paas.db;

import net.ibizsys.paas.entity.IEntity;

/**
 * 简单查询条件对象接口
 * @author lionlau
 *
 */
public interface ISelectCond extends IEntity
{
//	/**
//	 * 设置条件
//	 * @param strCond
//	 * @param objValue
//	 */
//	void setConditon(String strCond,Object objValue) throws Exception;
	
	
	/**
	 * 获取排序信息
	 * @return
	 */
	String getOrderInfo();
	

	
	/**
	 * 只获取第一行
	 * @return
	 */
	boolean isFetchFirst();
	
	
	
	
	/**
	 * 设置最大行记录
	 * @return
	 */
	int getMaxRowCount();
}
