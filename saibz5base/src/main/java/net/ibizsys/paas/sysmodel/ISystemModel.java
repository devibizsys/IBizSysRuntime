package net.ibizsys.paas.sysmodel;

import net.ibizsys.paas.core.IDERBase;
import net.ibizsys.paas.core.IDynamicModelStorage;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.core.IValueTranslator;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.security.IDEDataAccMgr;
import net.ibizsys.pswf.core.IWFModel;
import net.ibizsys.pswf.core.IWFRoleModel;

/**
 * 系统模型接口
 * @author lionlau
 *
 */
public interface ISystemModel extends ISystem
{
	/**
	 * 用户词典分类
	 */
	final static String USERDICTCAT  =	"USERDICTCAT";
	
	/**
	 * 用户词典分类（全局）
	 */
	final static String USERDICTCAT_GLOBAL  =	"GLOBAL";
	
	/**
	 * 用户词典分类（用户）
	 */
	final static String USERDICTCAT_USER  =	"USER";
	
	/**
	 * 获取指定实体模型
	 * @param strDEName
	 * @return
	 * @throws Exception
	 */
	IDataEntityModel getDataEntityModel(String strDEName)throws Exception;
	
	
	/**
	 * 获取系统流程模型
	 * @param strWFModelId
	 * @return
	 * @throws Exception
	 */
	IWFModel getWFModel(String strWFModelId) throws Exception;
	
	
	
	/**
	 * 获取流程角色模型
	 * @param strWFRoleModelId
	 * @return
	 * @throws Exception
	 */
	IWFRoleModel getWFRoleModel(String strWFRoleModelId) throws Exception;
	
	
	
	/**
	 * 获取流程角色集合
	 * @return
	 */
	java.util.Iterator<IWFRoleModel> getWFRoleModels();
	
	
	
	
	/**
	 * 值转换器
	 * @param strTranslator
	 * @return
	 * @throws Exception
	 */
	IValueTranslator getValueTranslator(String strTranslator) throws Exception;
	
	
	
	
	/**
	 * 安装运行时数据
	 */
	void installRTDatas() throws Exception;
	
	
	
	/**
	 * 获取实体相关关系
	 * @param strDEId
	 * @param bMajor 主关系或从关系
	 * @return
	 */
	java.util.Iterator<IDERBase> getDERs(String strDEId,boolean bMajor);
	
	
	
	
	/**
	 * 获取系统动态模型存储对象
	 * @return
	 */
	IDynamicModelStorage getDynamicModelStorage() throws Exception;
	
	
	
	
	
	/**
	 * 建立实体数据访问对象
	 * @param iDEModel
	 * @return
	 * @throws Exception
	 */
	IDEDataAccMgr createDEDataAccMgr(IDataEntityModel iDEModel)throws Exception;
}
