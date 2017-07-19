package net.ibizsys.paas.db;

import java.sql.SQLException;


/**
 * 数据表对象接口
 * @author Administrator
 *
 */
public interface IDataTable
{
	/**
	 * 获取数据表列数量
	 * @return
	 */
	int getColumnCount();
	
	/**
	 * 通过名称获取数据表列位置
	 * @param strColumnName
	 * @return
	 */
	int getColumnIndex(String strColumnName);
	
	
	/**
	 * 获取数据列
	 * @param nIndex
	 * @return
	 */
	IDataColumn getDataColumn(int nIndex); 
	
	/**
	 * 下一台数据
	 * @return
	 * @throws SQLException
	 */
	IDataRow next()throws SQLException;

	
	/**
	 * 获取结果集合
	 * @return
	 */
	java.sql.ResultSet getResultSet();
	
	/**
	 * 关闭数据表
	 */
	void close();
	
	/**
	 * 读记录
	 * @param nSize
	 * @return
	 * @throws SQLException
	 */
	int cacheRows(int nSize)throws SQLException;
	
	
	/**
	 * 读记录
	 * @param nIndex 行记录标识
	 * @return
	 * @throws SQLException
	 */
	IDataRow getCachedRow(int nIndex)throws Exception;
	
	
	
	/**
	 * 获取缓存的数据记录数
	 * @return
	 */
	int getCachedRowCount();
}
