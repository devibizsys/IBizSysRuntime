package net.ibizsys.paas.db;

/**
 * 数据选择上下文参数接口对象
 * @author Administrator
 *
 */
public interface ISelectContext extends ISelectCond {

	/**
	 * 获取查询字段集合
	 * @return
	 */
	java.util.Iterator<ISelectField> getSelectFields();
}
