package net.ibizsys.paas.core.valuerule;

import net.ibizsys.paas.core.IActionContext;
import net.ibizsys.paas.util.IGlobalContext;

/**
 * 属性规则检查引擎接口
 * @author Administrator
 *
 */
public interface IDEFValueRuleEngine
{
	
	/**
	 * 初始化
	 * @param iGlobalContext
	 * @param iDEFValueRule
	 * @throws Exception
	 */
	void init(IGlobalContext iGlobalContext,IDEFValueRule iDEFValueRule) throws Exception;
	
	/**
	 * 测试规则的条件是否成立
	 * @param iActionContext
	 * @return
	 * @throws Exception
	 */
	boolean testCondition(IActionContext iActionContext) throws Exception;
	
	
	/**
	 * 关闭
	 */
	void close();
}
