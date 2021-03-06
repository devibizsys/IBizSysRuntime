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



import net.ibizsys.psrt.srv.common.entity.OrgSecUser;
import net.ibizsys.psrt.srv.common.dao.OrgSecUserDAO;
import net.ibizsys.psrt.srv.common.demodel.OrgSecUserDEModel;


/**
 * 实体[OrgSecUser] 服务对象基类
 */
public abstract class OrgSecUserServiceBase extends net.ibizsys.psrt.srv.PSRuntimeSysServiceBase<OrgSecUser> {
    private static final Log log = LogFactory.getLog(OrgSecUserServiceBase.class);
    /**
     * 实体数据集合[DEFAULT]标识
     */
    public final static String DATASET_DEFAULT = "DEFAULT";

    /**
     * 实体行为[删除默认关系]标识
     */
    public final static String ACTION_REMOVEDEFAULT = "RemoveDefault";

    public OrgSecUserServiceBase () {
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
        return "net.ibizsys.psrt.srv.common.service.OrgSecUserService";
    }

    private OrgSecUserDEModel orgSecUserDEModel;
    /**
     * 获取实体[OrgSecUser]模型对象
     */
    public  OrgSecUserDEModel getOrgSecUserDEModel() {
        if(this.orgSecUserDEModel==null) {
            try {
                this.orgSecUserDEModel = (OrgSecUserDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.OrgSecUserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgSecUserDEModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getOrgSecUserDEModel();
    }


    private OrgSecUserDAO orgSecUserDAO;

    /**
     * 获取实体[OrgSecUser]数据操作对象
     */
    public  OrgSecUserDAO getOrgSecUserDAO() {
        if(this.orgSecUserDAO==null) {
            try {
                this.orgSecUserDAO= (OrgSecUserDAO)DAOGlobal.getDAO("net.ibizsys.psrt.srv.common.dao.OrgSecUserDAO",this.getSessionFactory());
            } catch(Exception ex) {
            }
        }
        return this.orgSecUserDAO;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.IService#getDAO()
     */
    @Override
    public  IDAO getDAO() {
        return this.getOrgSecUserDAO();
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
        if(StringHelper.compare(strAction,ACTION_REMOVEDEFAULT,true)==0) {
            this.removeDefault((OrgSecUser)entity);
            return;
        }
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





    /*
     * 执行操作[RemoveDefault]
     */
    public void removeDefault(OrgSecUser orgSecUser) throws Exception {

        final OrgSecUser orgSecUser2 = orgSecUser;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onRemoveDefault(orgSecUser2);
            }
        });
    }

    /*
     * 执行操作[RemoveDefault]
     */
    protected void onRemoveDefault(OrgSecUser orgSecUser) throws Exception {

        throw new Exception("没有实现自定义行为[RemoveDefault]");
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillParentInfo(net.ibizsys.paas.entity.IEntity, java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected void onFillParentInfo(OrgSecUser et,String strParentType,String strTypeParam,String strParentKey) throws Exception {
        //关系类型 : DER1N ,主实体 :ORG / 组织机构
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_ORGSECUSER_ORG_ORGID", true)==0)) {
            IService iService= ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.OrgService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.Org parentEntity = ( net.ibizsys.psrt.srv.common.entity.Org)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.Org.FIELD_ORGID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_Org(et,parentEntity );
            return;
        }
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_ORGSECUSER_ORGSECTOR_ORGSECTORID", true)==0)) {
            IService iService= ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.OrgSectorService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgSector)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgSector.FIELD_ORGSECTORID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_OrgSector(et,parentEntity );
            return;
        }
        //关系类型 : DER1N ,主实体 :ORGSECUSERTYPE / 部门人员关系类型
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_ORGSECUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID", true)==0)) {
            IService iService= ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.OrgSecUserTypeService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgSecUserType)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgSecUserType.FIELD_ORGSECUSERTYPEID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_OrgSecUserType(et,parentEntity );
            return;
        }
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        if (((StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_DER1N, true) == 0)
                ||(StringHelper.compare(strParentType, WebContext.PARAM_PARENTTYPE_SYSDER1N, true) == 0))
                && (StringHelper.compare(strTypeParam, "DER1N_ORGSECUSER_ORGUSER_ORGUSERID", true)==0)) {
            IService iService= ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.OrgUserService",this.getSessionFactory());
            net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity = ( net.ibizsys.psrt.srv.common.entity.OrgUser)iService.getDEModel().createEntity();
            parentEntity.set(net.ibizsys.psrt.srv.common.entity.OrgUser.FIELD_ORGUSERID,DataTypeHelper.parse(25,strParentKey));
            if(strParentKey.indexOf(ServiceBase.TEMPKEY) == 0)
                iService.getTemp(parentEntity);
            else
                iService.get(parentEntity);
            this.onFillParentInfo_OrgUser(et,parentEntity );
            return;
        }
        super.onFillParentInfo(et,strParentType,strTypeParam,strParentKey);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncDER1NData(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    protected String onSyncDER1NData(String strDER1NId, String strParentKey, String strDatas) throws Exception {
        return super.onSyncDER1NData( strDER1NId,  strParentKey,  strDatas);
    }


    /**
    * 填充数据的父数据信息[组织机构]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_Org(OrgSecUser et,net.ibizsys.psrt.srv.common.entity.Org parentEntity) throws Exception {
        et.setOrgId(parentEntity.getOrgId());
        et.setOrgName(parentEntity.getOrgName());
    }

    /**
    * 填充数据的父数据信息[组织部门]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_OrgSector(OrgSecUser et,net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        et.setOrgSectorId(parentEntity.getOrgSectorId());
        et.setOrgSectorName(parentEntity.getOrgSectorName());
        //执行关系等价操作
        if(parentEntity.getOrg()!=null) {
            onFillParentInfo_Org(et,parentEntity.getOrg());
        }
    }

    /**
    * 填充数据的父数据信息[部门人员关系类型]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_OrgSecUserType(OrgSecUser et,net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity) throws Exception {
        et.setOrgSecUserTypeId(parentEntity.getOrgSecUserTypeId());
        et.setOrgSecUserTypeName(parentEntity.getOrgSecUserTypeName());
    }

    /**
    * 填充数据的父数据信息[组织人员]
    * @param et 当前数据对象
    * @param parentEntity 父数据对象
    * @throws Exception
    */
    protected void onFillParentInfo_OrgUser(OrgSecUser et,net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        et.setOrgUserId(parentEntity.getOrgUserId());
        et.setOrgUserName(parentEntity.getOrgUserName());
    }


    /**
    * 填充主键
     * @param et
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onFillEntityKeyValue(OrgSecUser et,boolean bTempMode) throws Exception {
        StringBuilderEx sb  = new StringBuilderEx();
        //属性 OrgSectorId - 组织部门
        Object objOrgSectorId = et.get(OrgSecUser.FIELD_ORGSECTORID);
        if(objOrgSectorId==null)
            objOrgSectorId = "__EMTPY__";
        sb.append("%1$s", objOrgSectorId);
        //属性 OrgUserId - 组织人员
        sb.append("||");
        Object objOrgUserId = et.get(OrgSecUser.FIELD_ORGUSERID);
        if(objOrgUserId==null)
            objOrgUserId = "__EMTPY__";
        sb.append("%1$s", objOrgUserId);
        String strValue = sb.toString();
        et.set(this.getOrgSecUserDEModel().getKeyDEField().getName(),KeyValueHelper.genUniqueId(strValue));
        return true;
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onFillEntityFullInfo(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onFillEntityFullInfo(OrgSecUser et, boolean bCreate) throws Exception {
        //填充新建默认值
        if(bCreate) {
            if(et.getDefaultFlag()==null) {
                et.setDefaultFlag((Integer)DefaultValueHelper.getValue(this.getWebContext(),"","0",9));
            }
            if(et.getValidFlag()==null) {
                et.setValidFlag((Integer)DefaultValueHelper.getValue(this.getWebContext(),"","1",9));
            }
        }
        super.onFillEntityFullInfo(et, bCreate);

        //填充物理化外键相关属性
        //关系类型 : DER1N ,主实体 :ORG / 组织机构
        onFillEntityFullInfo_Org(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
        onFillEntityFullInfo_OrgSector(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGSECUSERTYPE / 部门人员关系类型
        onFillEntityFullInfo_OrgSecUserType(et, bCreate);
        //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
        onFillEntityFullInfo_OrgUser(et, bCreate);
    }

    /**
    * 填充实体的数据信息 组织机构
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_Org(OrgSecUser et, boolean bCreate) throws Exception {
        if(et.isOrgIdDirty()) {
            if(et.getOrgId()!=null) {
                if((true&&et.getOrgId()==null)||(true&&et.getOrgName()==null)) {
                    net.ibizsys.psrt.srv.common.entity.Org parentEntity  = et.getOrg();
                    et.setOrgName(parentEntity.getOrgName());
                }

            } else {
                et.setOrgName(null);
            }
        }
    }
    /**
    * 填充实体的数据信息 组织部门
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_OrgSector(OrgSecUser et, boolean bCreate) throws Exception {
        if(et.isOrgSectorIdDirty()) {
            if(et.getOrgSectorId()!=null) {
                if((true&&et.getOrgSectorId()==null)||(true&&et.getOrgSectorName()==null)) {
                    net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity  = et.getOrgSector();
                    et.setOrgSectorName(parentEntity.getOrgSectorName());
                }
                if(true) {
                    net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity  = et.getOrgSector();
                    //执行关系等价操作
                    if(DataTypeHelper.compare(25,parentEntity.getOrgId(),et.getOrgId())!=0) {
                        et.setOrgId(parentEntity.getOrgId());
                        onFillEntityFullInfo_Org(et,  bCreate) ;
                    }
                }

            } else {
                et.setOrgSectorName(null);
            }
        }
    }
    /**
    * 填充实体的数据信息 部门人员关系类型
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_OrgSecUserType(OrgSecUser et, boolean bCreate) throws Exception {
        if(et.isOrgSecUserTypeIdDirty()) {
            if(et.getOrgSecUserTypeId()!=null) {
                if((true&&et.getOrgSecUserTypeId()==null)||(true&&et.getOrgSecUserTypeName()==null)) {
                    net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity  = et.getOrgSecUserType();
                    et.setOrgSecUserTypeName(parentEntity.getOrgSecUserTypeName());
                }

            } else {
                et.setOrgSecUserTypeName(null);
            }
        }
    }
    /**
    * 填充实体的数据信息 组织人员
    * @param et
    * @param bCreate 是否建立
    * @throws Exception
    */
    protected void onFillEntityFullInfo_OrgUser(OrgSecUser et, boolean bCreate) throws Exception {
        if(et.isOrgUserIdDirty()) {
            if(et.getOrgUserId()!=null) {
                if((true&&et.getOrgUserId()==null)||(true&&et.getOrgUserName()==null)) {
                    net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity  = et.getOrgUser();
                    et.setOrgUserName(parentEntity.getOrgUserName());
                }

            } else {
                et.setOrgUserName(null);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onWriteBackParent(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onWriteBackParent(OrgSecUser et, boolean bCreate) throws Exception {
        super.onWriteBackParent(et, bCreate);
    }




    /**
     * 通过关系[组织机构]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrg(net.ibizsys.psrt.srv.common.entity.OrgBase parentEntity) throws Exception {
        return selectByOrg( parentEntity,"");
    }
    /**
     * 通过关系[组织机构]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrg(net.ibizsys.psrt.srv.common.entity.OrgBase parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OrgSecUser.FIELD_ORGID, parentEntity.getOrgId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByOrgCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织机构]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByOrgCond(SelectCond selectCond) throws Exception {

    }

    /**
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSectorBase parentEntity) throws Exception {
        return selectByOrgSector( parentEntity,"");
    }
    /**
     * 通过关系[组织部门]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSectorBase parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OrgSecUser.FIELD_ORGSECTORID, parentEntity.getOrgSectorId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByOrgSectorCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织部门]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByOrgSectorCond(SelectCond selectCond) throws Exception {

    }

    /**
     * 通过关系[部门人员关系类型]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserTypeBase parentEntity) throws Exception {
        return selectByOrgSecUserType( parentEntity,"");
    }
    /**
     * 通过关系[部门人员关系类型]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserTypeBase parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OrgSecUser.FIELD_ORGSECUSERTYPEID, parentEntity.getOrgSecUserTypeId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByOrgSecUserTypeCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[部门人员关系类型]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByOrgSecUserTypeCond(SelectCond selectCond) throws Exception {

    }

    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUserBase parentEntity) throws Exception {
        return selectByOrgUser( parentEntity,"");
    }
    /**
     * 通过关系[组织人员]父数据查询数据
     * @param parentEntity 父数据
     * @param strOrderInfo 排序信息
     * @throws Exception
     */
    public java.util.ArrayList<OrgSecUser> selectByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUserBase parentEntity,String strOrderInfo) throws Exception {
        SelectCond selectCond = new SelectCond();
        selectCond.setConditon(OrgSecUser.FIELD_ORGUSERID, parentEntity.getOrgUserId());
        selectCond.setOrderInfo(strOrderInfo);
        onFillSelectByOrgUserCond(selectCond);
        return this.select(selectCond);
    }

    /**
     * 填充关系[组织人员]父数据查询附加条件
     * @param selectCond 查询条件对象
     * @throws Exception
     */
    protected void onFillSelectByOrgUserCond(SelectCond selectCond) throws Exception {

    }




    /**
     * 判断是否能够通过关系[组织机构]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrg(parentEntity);
        if(list.size()>0) {
            IDataEntityModel parentDEModel = this.getDEModel().getSystemRuntime().getDataEntityModel("ORG");
            parentDEModel.getService(this.getSessionFactory()).getCache(parentEntity);
            throw new Exception(getRemoveRejectMsg("DER1N_ORGSECUSER_ORG_ORGID","" ,parentDEModel.getName(),"ORGSECUSER",parentDEModel.getDataInfo(parentEntity)));
        }
    }


    /**
     * 通过关系[组织机构]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrg(parentEntity);
        for(OrgSecUser item:list) {
            OrgSecUser item2 = (OrgSecUser)getDEModel().createEntity();
            item2.setOrgSecUserId(item.getOrgSecUserId());
            item2.setOrgId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织机构]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.Org parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByOrg(parentEntity2);
                internalRemoveByOrg(parentEntity2);
                onAfterRemoveByOrg(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织机构]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织机构]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> removeList = selectByOrg(parentEntity);
        onBeforeRemoveByOrg(parentEntity,removeList );

        // 执行删除
        for (OrgSecUser item : removeList ) {
            remove(item );
        }
        onAfterRemoveByOrg(parentEntity,removeList );
    }

    /**
     * 通过关系[组织机构]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织机构]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /**
     * 通过关系[组织机构]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByOrg(net.ibizsys.psrt.srv.common.entity.Org parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[组织部门]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrgSector(parentEntity);
        if(list.size()>0) {
            IDataEntityModel parentDEModel = this.getDEModel().getSystemRuntime().getDataEntityModel("ORGSECTOR");
            parentDEModel.getService(this.getSessionFactory()).getCache(parentEntity);
            throw new Exception(getRemoveRejectMsg("DER1N_ORGSECUSER_ORGSECTOR_ORGSECTORID","" ,parentDEModel.getName(),"ORGSECUSER",parentDEModel.getDataInfo(parentEntity)));
        }
    }


    /**
     * 通过关系[组织部门]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrgSector(parentEntity);
        for(OrgSecUser item:list) {
            OrgSecUser item2 = (OrgSecUser)getDEModel().createEntity();
            item2.setOrgSecUserId(item.getOrgSecUserId());
            item2.setOrgSectorId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织部门]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByOrgSector(parentEntity2);
                internalRemoveByOrgSector(parentEntity2);
                onAfterRemoveByOrgSector(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织部门]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织部门]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> removeList = selectByOrgSector(parentEntity);
        onBeforeRemoveByOrgSector(parentEntity,removeList );

        // 执行删除
        for (OrgSecUser item : removeList ) {
            remove(item );
        }
        onAfterRemoveByOrgSector(parentEntity,removeList );
    }

    /**
     * 通过关系[组织部门]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织部门]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /**
     * 通过关系[组织部门]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByOrgSector(net.ibizsys.psrt.srv.common.entity.OrgSector parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[部门人员关系类型]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrgSecUserType(parentEntity);
        if(list.size()>0) {
            IDataEntityModel parentDEModel = this.getDEModel().getSystemRuntime().getDataEntityModel("ORGSECUSERTYPE");
            parentDEModel.getService(this.getSessionFactory()).getCache(parentEntity);
            throw new Exception(getRemoveRejectMsg("DER1N_ORGSECUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID","" ,parentDEModel.getName(),"ORGSECUSER",parentDEModel.getDataInfo(parentEntity)));
        }
    }


    /**
     * 通过关系[部门人员关系类型]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrgSecUserType(parentEntity);
        for(OrgSecUser item:list) {
            OrgSecUser item2 = (OrgSecUser)getDEModel().createEntity();
            item2.setOrgSecUserId(item.getOrgSecUserId());
            item2.setOrgSecUserTypeId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[部门人员关系类型]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByOrgSecUserType(parentEntity2);
                internalRemoveByOrgSecUserType(parentEntity2);
                onAfterRemoveByOrgSecUserType(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[部门人员关系类型]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[部门人员关系类型]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> removeList = selectByOrgSecUserType(parentEntity);
        onBeforeRemoveByOrgSecUserType(parentEntity,removeList );

        // 执行删除
        for (OrgSecUser item : removeList ) {
            remove(item );
        }
        onAfterRemoveByOrgSecUserType(parentEntity,removeList );
    }

    /**
     * 通过关系[部门人员关系类型]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity) throws Exception {

    }

    /**
     * 通过关系[部门人员关系类型]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /**
     * 通过关系[部门人员关系类型]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByOrgSecUserType(net.ibizsys.psrt.srv.common.entity.OrgSecUserType parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /**
     * 判断是否能够通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void testRemoveByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrgUser(parentEntity);
        if(list.size()>0) {
            IDataEntityModel parentDEModel = this.getDEModel().getSystemRuntime().getDataEntityModel("ORGUSER");
            parentDEModel.getService(this.getSessionFactory()).getCache(parentEntity);
            throw new Exception(getRemoveRejectMsg("DER1N_ORGSECUSER_ORGUSER_ORGUSERID","" ,parentDEModel.getName(),"ORGSECUSER",parentDEModel.getDataInfo(parentEntity)));
        }
    }


    /**
     * 通过关系[组织人员]重置数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void resetOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> list =  this.selectByOrgUser(parentEntity);
        for(OrgSecUser item:list) {
            OrgSecUser item2 = (OrgSecUser)getDEModel().createEntity();
            item2.setOrgSecUserId(item.getOrgSecUserId());
            item2.setOrgUserId(null);
            this.update(item2);
        }
    }


    /**
     * 通过关系[组织人员]删除数据
     * @param parentEntity 父数据
     * @throws Exception
     */
    public void removeByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        final net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity2 = parentEntity;
        this.doServiceWork(new IServiceWork() {
            @Override
            public void execute(ITransaction iTransaction) throws Exception {
                onBeforeRemoveByOrgUser(parentEntity2);
                internalRemoveByOrgUser(parentEntity2);
                onAfterRemoveByOrgUser(parentEntity2);
            }
        });
    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onBeforeRemoveByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
    * 内部删除数据，通过关系[组织人员]
    * @param parentEntity 父数据
    * @throws Exception
    */
    protected void internalRemoveByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {
        java.util.ArrayList<OrgSecUser> removeList = selectByOrgUser(parentEntity);
        onBeforeRemoveByOrgUser(parentEntity,removeList );

        // 执行删除
        for (OrgSecUser item : removeList ) {
            remove(item );
        }
        onAfterRemoveByOrgUser(parentEntity,removeList );
    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @throws Exception
     */
    protected void onAfterRemoveByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之前调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onBeforeRemoveByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /**
     * 通过关系[组织人员]删除数据之后调用
     * @param parentEntity 父数据
     * @param removeList 要删除的数据清单
     * @throws Exception
     */
    protected void onAfterRemoveByOrgUser(net.ibizsys.psrt.srv.common.entity.OrgUser parentEntity,java.util.ArrayList<OrgSecUser> removeList) throws Exception {

    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onBeforeRemove(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected void onBeforeRemove(OrgSecUser et) throws Exception {
        super.onBeforeRemove(et);
    }





    /**
     * 替换父数据信息
     * @param et
     * @throws Exception
     */
    @Override
    protected void replaceParentInfo(OrgSecUser et,CloneSession cloneSession) throws Exception {
        super.replaceParentInfo(et, cloneSession);
        //循环所有的从关系，判断有误替换
        if(et.getOrgId()!=null) {
            IEntity entity = cloneSession.getEntity("ORG",et.getOrgId());
            if(entity !=null) {
                onFillParentInfo_Org(et,(net.ibizsys.psrt.srv.common.entity.Org) entity);
            }
        }
        if(et.getOrgSectorId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGSECTOR",et.getOrgSectorId());
            if(entity !=null) {
                onFillParentInfo_OrgSector(et,(net.ibizsys.psrt.srv.common.entity.OrgSector) entity);
            }
        }
        if(et.getOrgSecUserTypeId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGSECUSERTYPE",et.getOrgSecUserTypeId());
            if(entity !=null) {
                onFillParentInfo_OrgSecUserType(et,(net.ibizsys.psrt.srv.common.entity.OrgSecUserType) entity);
            }
        }
        if(et.getOrgUserId()!=null) {
            IEntity entity = cloneSession.getEntity("ORGUSER",et.getOrgUserId());
            if(entity !=null) {
                onFillParentInfo_OrgUser(et,(net.ibizsys.psrt.srv.common.entity.OrgUser) entity);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onRemoveEntityUncopyValues(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onRemoveEntityUncopyValues(OrgSecUser et, boolean bTempMode) throws Exception {
        super.onRemoveEntityUncopyValues(et,  bTempMode);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onCheckEntity(boolean, net.ibizsys.paas.entity.IEntity, boolean, boolean, net.ibizsys.paas.entity.EntityError)
     */
    @Override
    protected void onCheckEntity(boolean bBaseMode,OrgSecUser  et, boolean bCreate, boolean bTempMode,EntityError entityError) throws Exception {
        EntityFieldError entityFieldError = null;
        //检查属性 默认关系
        entityFieldError = onCheckField_DefaultFlag( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 组织部门人员标识
        entityFieldError = onCheckField_OrgSecUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 组织部门人员名称
        entityFieldError = onCheckField_OrgSecUserName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 部门人员关系
        entityFieldError = onCheckField_OrgSecUserTypeId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 部门人员关系
        entityFieldError = onCheckField_OrgSecUserTypeName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 组织人员
        entityFieldError = onCheckField_OrgUserId( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 组织人员
        entityFieldError = onCheckField_OrgUserName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 头衔名称
        entityFieldError = onCheckField_TitleName( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 用户数据
        entityFieldError = onCheckField_UserData( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 用户数据2
        entityFieldError = onCheckField_UserData2( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        //检查属性 启用标志
        entityFieldError = onCheckField_ValidFlag( bBaseMode,  et,  bCreate,  bTempMode);
        if(entityFieldError!=null) {
            entityError.register(entityFieldError);
        }
        super.onCheckEntity(bBaseMode,et,  bCreate,bTempMode,entityError);
    }


    /**
     * 获取属性[DefaultFlag]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_DefaultFlag(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isDefaultFlagDirty())
            return null;

        Integer value = et.getDefaultFlag();
        if(bBaseMode) {
            if(bCreate) {
                if(value==null) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OrgSecUser.FIELD_DEFAULTFLAG);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_DefaultFlag_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_DEFAULTFLAG);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgSecUserId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgSecUserId(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgSecUserIdDirty())
            return null;

        String value = et.getOrgSecUserId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OrgSecUser.FIELD_ORGSECUSERID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgSecUserId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_ORGSECUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgSecUserName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgSecUserName(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgSecUserNameDirty())
            return null;

        String value = et.getOrgSecUserName();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OrgSecUser.FIELD_ORGSECUSERNAME);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgSecUserName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_ORGSECUSERNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgSecUserTypeId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgSecUserTypeId(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgSecUserTypeIdDirty())
            return null;

        String value = et.getOrgSecUserTypeId();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgSecUserTypeId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_ORGSECUSERTYPEID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgSecUserTypeName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgSecUserTypeName(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgSecUserTypeNameDirty())
            return null;

        String value = et.getOrgSecUserTypeName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgSecUserTypeName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_ORGSECUSERTYPENAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgUserId]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgUserId(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgUserIdDirty())
            return null;

        String value = et.getOrgUserId();
        if(bBaseMode) {
            if(bCreate) {
                if(StringHelper.isNullOrEmpty(value)) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OrgSecUser.FIELD_ORGUSERID);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgUserId_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_ORGUSERID);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[OrgUserName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_OrgUserName(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isOrgUserNameDirty())
            return null;

        String value = et.getOrgUserName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_OrgUserName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_ORGUSERNAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[TitleName]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_TitleName(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isTitleNameDirty())
            return null;

        String value = et.getTitleName();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_TitleName_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_TITLENAME);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[UserData]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_UserData(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isUserDataDirty())
            return null;

        String value = et.getUserData();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_UserData_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_USERDATA);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[UserData2]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_UserData2(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isUserData2Dirty())
            return null;

        String value = et.getUserData2();
        if(bBaseMode) {
            if(bCreate) {
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_UserData2_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_USERDATA2);
                entityFieldError.setErrorType(EntityFieldError.ERROR_VALUERULE);
                entityFieldError.setErrorInfo(strRuleInfo);
                return entityFieldError;
            }
        } else {
        }
        return null;
    }


    /**
     * 获取属性[ValidFlag]值错误
     * @param bBaseMode 是否为基本检查模式，基本检查模式执行值类型，长度及属性值规则检查，非基本模式进行重复值检查
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据
     * @param bTempMode 是否为临时数据模式
     * @throws Exception
     */
    protected EntityFieldError onCheckField_ValidFlag(boolean bBaseMode,OrgSecUser et, boolean bCreate, boolean bTempMode) throws Exception {
        //判断是否有值
        if(!et.isValidFlagDirty())
            return null;

        Integer value = et.getValidFlag();
        if(bBaseMode) {
            if(bCreate) {
                if(value==null) {
                    EntityFieldError entityFieldError = new EntityFieldError();
                    entityFieldError.setFieldName(OrgSecUser.FIELD_VALIDFLAG);
                    entityFieldError.setErrorType(EntityFieldError.ERROR_EMPTY);
                    return entityFieldError;
                }
            }

            String strRuleInfo  = null;
            //检查值规则[默认规则]
            strRuleInfo =onTestValueRule_ValidFlag_Default( et,  bCreate,  bTempMode);
            if(!StringHelper.isNullOrEmpty(strRuleInfo)) {
                EntityFieldError entityFieldError = new EntityFieldError();
                entityFieldError.setFieldName(OrgSecUser.FIELD_VALIDFLAG);
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
    protected void onSyncEntity(OrgSecUser et, boolean bRemove) throws Exception {
        super.onSyncEntity( et,  bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onSyncIndexEntities(net.ibizsys.paas.entity.IEntity, boolean)
     */
    @Override
    protected void onSyncIndexEntities(OrgSecUser et,boolean bRemove) throws Exception {
        super.onSyncIndexEntities(et,bRemove);
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#getDataContextValue(net.ibizsys.paas.entity.IEntity, java.lang.String, net.ibizsys.paas.service.IDataContextParam)
     */
    @Override
    public Object getDataContextValue(OrgSecUser et,String strField,IDataContextParam iDataContextParam)throws Exception {
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
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGSECUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSecUserId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGSECUSERNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSecUserName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_CREATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_CREATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_CreateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_UPDATEMAN,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateMan_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_UPDATEDATE,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UpdateDate_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_DEFAULTFLAG,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_DefaultFlag_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_VALIDFLAG,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_ValidFlag_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_TITLENAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_TitleName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_USERDATA,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UserData_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_USERDATA2,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_UserData2_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGSECTORNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGSECUSERTYPENAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSecUserTypeName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGUSERNAME,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserName_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGSECTORID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSectorId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGSECUSERTYPEID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgSecUserTypeId_Default(et,bCreate,bTempMode);
        if((StringHelper.compare(strDEFieldName,OrgSecUser.FIELD_ORGUSERID,true)==0)
                &&(StringHelper.compare(strRule,"DEFAULT",true)==0))
            return onTestValueRule_OrgUserId_Default(et,bCreate,bTempMode);

        return super.onTestValueRule( strDEFieldName, strRule, et,bCreate, bTempMode);
    }

    /**
     * 判断值规则[组织部门人员标识][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSecUserId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECUSERID", et, bTempMode,null,false,100,true,"内容长度必须小于等于[100]")))
                return null;
            return "内容长度必须小于等于[100]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织部门人员名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSecUserName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECUSERNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
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

    /**
     * 判断值规则[默认关系][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_DefaultFlag_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[启用标志][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_ValidFlag_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        return null;
    }

    /**
     * 判断值规则[头衔名称][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_TitleName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("TITLENAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[用户数据][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UserData_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("USERDATA", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[用户数据2][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_UserData2_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("USERDATA2", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织机构][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织部门][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSectorName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECTORNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[部门人员关系][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSecUserTypeName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECUSERTYPENAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织人员][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgUserName_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGUSERNAME", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织机构][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGID", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织部门][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSectorId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECTORID", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[部门人员关系][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgSecUserTypeId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGSECUSERTYPEID", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 判断值规则[组织人员][默认规则]
     * @param et 当前数据对象
     * @param bCreate 是否为新建数据模式
     * @param bTempMode 是否为临时数据模式
     * @return
     * @throws Exception
     */
    protected String onTestValueRule_OrgUserId_Default(IEntity et,boolean bCreate,boolean bTempMode) throws Exception {
        try {
            if((checkFieldStringLengthRule("ORGUSERID", et, bTempMode,null,false,200,true,"内容长度必须小于等于[200]")))
                return null;
            return "内容长度必须小于等于[200]";
        } catch(Exception ex) {
            return ex.getMessage();
        }
    }



    /* (non-Javadoc)
     * @see net.ibizsys.paas.service.ServiceBase#onMergeChild(java.lang.String, java.lang.String, net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected boolean onMergeChild(String strChildType, String strTypeParam, OrgSecUser et) throws Exception {
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
    protected void onUpdateParent(OrgSecUser et)throws Exception {
        super.onUpdateParent(et);
    }

}