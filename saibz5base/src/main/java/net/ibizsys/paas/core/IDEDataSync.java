package net.ibizsys.paas.core;

/**
 * 实体数据同步接口
 * @author Administrator
 *
 */
public interface IDEDataSync  extends IDataEntityObject
{
	/**
	 * 初始化
	 * @param iDataEntity
	 * @throws Exception
	 */
	void init(IDataEntity iDataEntity)throws Exception;
	
	
	
	
	/**
	 * 获取同步代理标识
	 * @return
	 */
	String getSyncAgent();
	
	
	
	/**
	 * 获取事件类型
	 * @return
	 */
	int getEventType();
	
	
	
	/**
	 * 是否为输入模式
	 * @return
	 */
	boolean isInMode();

}
