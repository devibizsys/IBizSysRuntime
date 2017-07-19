package net.ibizsys.paas.security;

import java.util.HashMap;

import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.psrt.srv.common.entity.Org;
import net.ibizsys.psrt.srv.common.entity.OrgSector;
import net.ibizsys.psrt.srv.common.service.OrgSectorService;
import net.ibizsys.psrt.srv.common.service.OrgService;



/**
 * 组织全局对象
 * @author Administrator
 *
 */
public class OrgGlobal
{
	private static HashMap<String, Org> orgMap = new HashMap<String, Org>();

	private static HashMap<String, OrgSector> orgSectorMap = new HashMap<String, OrgSector>();
	
	/**
	 * 获取组织对象
	 * @param strOrgId
	 * @return
	 * @throws Exception
	 */
	public static Org getOrg(String strOrgId)throws Exception
	{
		Org org = null;
		synchronized(orgMap)
		{
			org = orgMap.get(strOrgId);
		}
		if(org!=null)
		{
			return org;
		}
		
		org = new Org();
		org.setOrgId(strOrgId);
		OrgService orgService = (OrgService)ServiceGlobal.getService(OrgService.class);
		orgService.get(org);
		synchronized(orgMap)
		{
			orgMap.put(strOrgId,	org);
		}
		return org;
	}
	
	/**
	 * 获取组织部门
	 * @param strOrgSectorId
	 * @return
	 * @throws Exception
	 */
	public static OrgSector getOrgSector(String strOrgSectorId)throws Exception
	{
		OrgSector orgSector = null;
		synchronized(orgSectorMap)
		{
			orgSector = orgSectorMap.get(strOrgSectorId);
		}
		if(orgSector!=null)
		{
			return orgSector;
		}
		
		orgSector = new OrgSector();
		orgSector.setOrgSectorId(strOrgSectorId);
		OrgSectorService orgSectorService = (OrgSectorService)ServiceGlobal.getService(OrgSectorService.class);
		orgSectorService.get(orgSector);
		synchronized(orgSectorMap)
		{
			orgSectorMap.put(strOrgSectorId,	orgSector);
		}
		return orgSector;
	}
	
	/**
	 * 重置缓存的组织清单
	 */
	public static void reset(){
		synchronized(orgMap)
		{
			orgMap.clear();
		}
		synchronized(orgSectorMap)
		{
			orgSectorMap.clear();
		}
	}
	
}
