package net.ibizsys.paas.core;

/**
 * 实体数据范围
 * @author Administrator
 *
 */
public interface IDEDataRange
{
	public final static int ORG_CURRENT = 1;
	
	public final static int ORG_PARENT = 2;
	
	public final static int ORG_CHILD = 4;
	
	
	public final static int SECTOR_CURRENT = 1;
	
	public final static int SECTOR_PARENT = 2;
	
	public final static int SECTOR_CHILD = 4;
	
	
	
	/**
	 * 是否启用机构数据范围
	 * @return
	 */
	boolean isEnableOrgDR();
	
	
	
	/**
	 * 是否启用部门数据范围
	 * @return
	 */
	boolean isEnableSecDR();

	
	
	/**
	 * 是否启用部门业务代码
	 * @return
	 */
	boolean isEnableSecBC();
	
	
	
	/**
	 * 获取机构数据范围
	 * @return
	 */
	long getOrgDR();
	
	
	
	
	/**
	 * 获取部门数据范围
	 * @return
	 */
	long getSecDR();
	
	
	/**
	 * 获取部门业务代码，多个使用 [;]间隔
	 * @return
	 */
	String getSecBC();
	
	
	
	/**
	 * 是否启用用户数据范围
	 * @return
	 */
	boolean isEnableUserDR();
	
	
	
	/**
	 * 获取用户数据范围对应的操作
	 * @return
	 */
	String getUserDRAction();
}
