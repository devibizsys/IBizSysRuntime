package net.ibizsys.paas;

import net.ibizsys.paas.util.StringHelper;

/**
 * Runtime 版本信息
 * @author Administrator

 * @version 5.0.3.6
 * (1) 增加自定义部件相关对象
 * 
 * 
 * @version 5.0.3.5
 * (1) net.ibizsys.paas.util.JSONObjectHelper 添加新的Put方法
 * 
 * 
 * @version 5.0.3.4
 * (1) 提供对JQuery R2的默认支持
 * (2) 修复工作流表格视图多项数据批操作（有弹出窗口）问题
 * 
 * @version 5.0.3.3
 * (1) 修复统一认证组件多服务器模式路径的问题
 * 
 * @version 5.0.3.2
 * (1) 调整工作流处理节点组条件，组逻辑在无任何子逻辑的情况下值为TRUE。
 * 
 * @version 5.0.3.1
 * (1) 调整工作流处理节点组条件，组逻辑在无任何子逻辑的情况下值为TRUE。
 * 
 * @version 5.0.3.0
 * (1) 编辑表单默认添加 srfsourcekey ，用于标注新建数据的来源（如果是复制）
 * (2) IService 增加copyDetails 方法，create 方法中，如传入参数中存在属性 srfsourcekey ,则会调用此方法进一步复制源数据的明细
 * 
 * @version 5.0.2.0
 * (1) 添加实体数据变更日志等实体
 * (2) 修复工作流处理节点组条件（OR）判断异常的问题
 * (3) 增加了数据变更派发相关功能
 * 
 * 
 * @version 5.0.1.103
 * (1) 完成视图更新面板后台处理对象  net.ibizsys.paas.ctrlhandler.UpdatePanelHandler
 * (2) 添加消息模板全局管理对象 net.ibizsys.psmsg.util.MsgTemplateGlobal
 * 
 * @version 5.0.1.102
 * (1) 添加系统间数据同步、定时任务调度等相关实体
 * (2) 修复获取多项代码表文本的错误
 * (3) 添加视图更新面板相关
 * 
 * @version 5.0.1.100
 * (1) 添加了表格行编辑能力
 */
public class Version
{
	public final static Integer MAJOR = 5;
	public final static Integer MINOR = 0;
	public final static Integer FUNC = 3;
	public final static Integer FIX = 6;
	public final static Integer DATE = 161107;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return StringHelper.format("%1$s.%2$s.%3$s.%4$s",MAJOR,MINOR,FUNC,FIX);
	}
	
	/**
	 * 输出版本字符串
	 * @return
	 */
	public static String toVersionString()
	{
		return StringHelper.format("%1$s.%2$s.%3$s.%4$s",MAJOR,MINOR,FUNC,FIX);
	}
}
