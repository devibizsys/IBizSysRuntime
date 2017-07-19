package net.ibizsys.paas.demodel;

import net.ibizsys.paas.core.IDEDataSet;
import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.db.DBFetchResult;

/**
 * 实体数据集合模型
 * @author Administrator
 *
 */
public interface IDEDataSetModel extends IDEDataSet
{
	
	
	
	/**
	 * 是否为自定义的数据集
	 * @return
	 */
	boolean isCustomDS();
	
	

	/**
	 * 获取数据集合
	 * @param iDEDataSetFetchContext
	 * @return
	 * @throws Exception
	 */
	DBFetchResult fetchDEDataSet(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception;
}
