/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.service;


import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import net.ibizsys.paas.exception.ErrorException;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.db.IProcParam;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.util.StringBuilderEx;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.ActionContext;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDELogicModel;
import net.ibizsys.paas.dao.DAOGlobal;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.util.KeyValueHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import net.ibizsys.paas.db.SelectCond;
import net.ibizsys.paas.service.IServiceWork;
import net.ibizsys.paas.service.ITransaction;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.service.CloneSession;
import net.ibizsys.paas.service.ServiceBase;
import net.ibizsys.paas.entity.EntityFieldError;
import net.ibizsys.paas.entity.EntityError;
import java.sql.Timestamp;
import net.ibizsys.paas.util.DefaultValueHelper;
import javax.annotation.PostConstruct;
import net.ibizsys.paas.service.IDataContextParam;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import net.ibizsys.psrt.srv.common.service.TSSDGroupDetailService;
import net.ibizsys.psrt.srv.common.entity.TSSDGroupDetail;

import net.ibizsys.psrt.srv.common.entity.TSSDGroup;
import net.ibizsys.psrt.srv.common.dao.TSSDGroupDAO;
import net.ibizsys.psrt.srv.common.demodel.TSSDGroupDEModel;


/**
 * 实体[TSSDGroup] 服务对象基类
 */
public abstract class TSSDGroupServiceBase extends net.ibizsys.psrt.srv.PSRuntimeSysServiceBase<TSSDGroup> {
    private static final Log log = LogFactory.getLog(TSSDGroupServiceBase.class);
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";


    public TSSDGroupServiceBase () {
        super();

    }
    /**
     * Spring注册后执行构造处理
     * @throws Exception
     */
    @PostConstruct
    public void postConstruct() throws Exception {
        ServiceGlobal.registerService(getServiceId(), this);
        ServiceGlobal.registerService(getServiceId(),IDataEntity.DSLINK_DEFAULT,this);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getServiceId()
     */
    @Override
    protected String getServiceId() {
        return "net.ibizsys.psrt.srv.common.service.TSSDGroupService";
    }

    private TSSDGroupDEModel tSSDGroupDEModel;
    /**
     * 获取实体[TSSDGroup]模型对象
     */
    public  TSSDGroupDEModel getTSSDGroupDEModel() {
        if(this.tSSDGroupDEModel==null) {
            try {
                this.tSSDGroupDEModel = (TSSDGroupDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.TSSDGroupDEModel");
            } catch(Exception ex) {
            }
        }
        return this.tSSDGroupDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getTSSDGroupDEModel();
    }


    private TSSDGroupDAO tSSDGroupDAO;

    /**
     * 获取实体[TSSDGroup]数据操作对象
     */
    public  TSSDGroupDAO getTSSDGroupDAO() {
        if(this.tSSDGroupDAO==null) {
            try {
                this.tSSDGroupDAO= (TSSDGroupDAO)DAOGlobal.getDAO("net.ibizsys.psrt.srv.common.dao.TSSDGroupDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.tSSDGroupDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getTSSDGroupDAO();
    }
    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onfetchDataSet(java.lang.String, net.ibizsys.paas.core.IDEDataSetFetchContext)
     */
    @Override
    protected DBFetchResult onfetchDataSet(String strDataSetName,IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {
        if(StringHelper.compare(strDataSetName,DATASET_DEFAULT,true)==0) {
            return this.fetchDefault(iDEDataSetFetchContext);
        }
        return super.onfetchDataSet(strDataSetName,iDEDataSetFetchContext);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onExecuteAction(java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected  void onExecuteAction(String strAction,IEntity entity) throws Exception {
        super.onExecuteAction(strAction,entity);
    }

    /**
     * 获取数据集合[DEFAULT]
     * @param iDEDataSetFetchContext
     * @return
     * @throws Exception
     */
    public DBFetchResult fetchDefault(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception {

        DBFetchResult dbFetchResult =  doServiceFetchWork(iDEDataSetFetchContext,DATASET_DEFAULT,false);
        // dbFetchResult.getDataSet().cacheDataRow();
        // session.close();
        return dbFetchResult;
    }







    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillParentInfo(net.ibizsys.paas.entity.IEntity, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected void onFillParentInfo(TSSDGroup et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        super.onFillParentInfo(et,strParentType,strTypeParam,strParentKey);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncDER1NData(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected String onSyncDER1NData(String strDER1NId, String strParentKey, String strDatas) throws Exception {
        return super.onSyncDER1NData( strDER1NId,  strParentKey,  strDatas);
    }





    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(TSSDGroup et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(TSSDGroup et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }







    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(TSSDGroup et) throws Exception {
        //判断是否可以删除 关系 任务时刻策略组明细 数据
        if(true) {
            TSSDGroupDetailService service = (TSSDGroupDetailService)ServiceGlobal.getService(TSSDGroupDetailService.class,this.getSessionFactory());
            service.testRemoveByTSSDGroup(et);
        }

        //删除 关系 任务时刻策略组明细 数据
        if(true) {
            TSSDGroupDetailService service = (TSSDGroupDetailService)ServiceGlobal.getService(TSSDGroupDetailService.class,this.getSessionFactory());
            service.resetTSSDGroup(et);
        }
        super.onBeforeRemove(et);
    }






    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(TSSDGroup et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,TSSDGroup  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 任务时刻策略组标识
        entityFieldError = onCheckField_TSSDGroupId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 任务时刻策略组名称
        entityFieldError = onCheckField_TSSDGroupName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[TSSDGroupId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_TSSDGroupId(boolean bBaseMode,TSSDGroup et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isTSSDGroupIdDirty())
            return null;

        String value = et.getTSSDGroupId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(TSSDGroup.FIELD_TSSDGROUPID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_TSSDGroupId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(TSSDGroup.FIELD_TSSDGROUPID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[TSSDGroupName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_TSSDGroupName(boolean bBaseMode,TSSDGroup et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isTSSDGroupNameDirty())
            return null;

        String value = et.getTSSDGroupName();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(TSSDGroup.FIELD_TSSDGROUPNAME);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_TSSDGroupName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(TSSDGroup.FIELD_TSSDGROUPNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }




    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncEntity(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncEntity(TSSDGroup et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(TSSDGroup et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(TSSDGroup et,String strField,IDataContextParam iDataContextParam)throws Exception {
        Object objValue = null;
        if(iDataContextParam!=null) {
        }

        objValue = super.getDataContextValue(et,strField,iDataContextParam);
        if(objValue!=null)
            return objValue;

        return null;
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onTestValueRule(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity, boolean, boolean)
     */
    @Override
    protected String onTestValueRule(String strDEFieldName,String strRule,IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        if((StringHelper.compare(strDEFieldName,TSSDGroup.FIELD_TSSDGROUPID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_TSSDGroupId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,TSSDGroup.FIELD_TSSDGROUPNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_TSSDGroupName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,TSSDGroup.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,TSSDGroup.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,TSSDGroup.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,TSSDGroup.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
    }

    /**
     * 判断值规则[任务时刻策略组标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_TSSDGroupId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("TSSDGROUPID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[任务时刻策略组名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_TSSDGroupName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("TSSDGROUPNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[建立人][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CreateMan_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("CREATEMAN", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[建立时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_CreateDate_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[更新人][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UpdateMan_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("UPDATEMAN", et, bTempMode,null,false,60,true,"内容长度必须小于等于[60]")))
                return null;
            return "内容长度必须小于等于[60]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[更新时间][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UpdateDate_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onMergeChild(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected boolean onMergeChild(String strChildType, String strTypeParam, TSSDGroup et) throws Exception {
        boolean bRet = false;
        if(super.onMergeChild( strChildType, strTypeParam,  et))
            bRet = true;
        return bRet;
    }



    /**
     * 更新父数据
     * @param et
     * @throws Exception
     */
    @Override
    protected void onUpdateParent(TSSDGroup et)throws Exception {
        super.onUpdateParent(et);
    }

}