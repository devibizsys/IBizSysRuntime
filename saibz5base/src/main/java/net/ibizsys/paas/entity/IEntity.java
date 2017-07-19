package net.ibizsys.paas.entity;

import java.util.HashMap;

import org.hibernate.SessionFactory;

import net.ibizsys.paas.data.IDataObject;

/**
 * 数据对象(Entity)接口
 * @author lionlau
 *
 */
public interface IEntity extends IDataObject
{
	/**
	 * 填充到Map中
	 * @param params
	 * @param bDirtyOnly
	 */
	void fillMap(HashMap<String, Object> params,boolean bDirtyOnly);
	
	
	/**
	 * 标记为完整的信息
	 * @param bMarkFullInfo
	 */
	void markFullEntity(boolean bMarkFullInfo);
	
	/**
	 * 是否为完整信息
	 * @return
	 */
	boolean isFullEntity();
	
	
	/**
	 * 设置会话工厂
	 * @param sessionFactory
	 */
	void setSessionFactory(SessionFactory sessionFactory);
	
	/**
	 * 获取会话工厂
	 * @return
	 */
	SessionFactory getSessionFactory();
}
