/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.entity;


import java.io.Serializable;
import java.util.HashMap;
import java.util.ArrayList;

import javax.persistence.Column;

import java.sql.Timestamp;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.util.StringHelper;
import net.sf.json.JSONObject;
import net.ibizsys.paas.xml.XmlNode;
import net.ibizsys.paas.service.ServiceGlobal;



/**
 * 实体[UserRoleDataDetail] 数据对象基类
 */
public abstract class UserRoleDataDetailBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[排除数据范围]
     */
    public final static String FIELD_ISEXCLUDE = "ISEXCLUDE";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[查询模型]
     */
    public final static String FIELD_QUERYMODELID = "QUERYMODELID";
    /**
     *   实体属性标识[查询模型]
     */
    public final static String FIELD_QUERYMODELNAME = "QUERYMODELNAME";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[数据对象能力明细标识]
     */
    public final static String FIELD_USERROLEDATADETAILID = "USERROLEDATADETAILID";
    /**
     *   实体属性标识[数据对象能力明细名称]
     */
    public final static String FIELD_USERROLEDATADETAILNAME = "USERROLEDATADETAILNAME";
    /**
     *   实体属性标识[数据对象能力]
     */
    public final static String FIELD_USERROLEDATAID = "USERROLEDATAID";
    /**
     *   实体属性标识[数据对象能力]
     */
    public final static String FIELD_USERROLEDATANAME = "USERROLEDATANAME";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_ISEXCLUDE = 2;
    private final static int INDEX_MEMO = 3;
    private final static int INDEX_QUERYMODELID = 4;
    private final static int INDEX_QUERYMODELNAME = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_USERROLEDATADETAILID = 8;
    private final static int INDEX_USERROLEDATADETAILNAME = 9;
    private final static int INDEX_USERROLEDATAID = 10;
    private final static int INDEX_USERROLEDATANAME = 11;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_ISEXCLUDE, INDEX_ISEXCLUDE);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_QUERYMODELID, INDEX_QUERYMODELID);
        fieldIndexMap.put( FIELD_QUERYMODELNAME, INDEX_QUERYMODELNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERROLEDATADETAILID, INDEX_USERROLEDATADETAILID);
        fieldIndexMap.put( FIELD_USERROLEDATADETAILNAME, INDEX_USERROLEDATADETAILNAME);
        fieldIndexMap.put( FIELD_USERROLEDATAID, INDEX_USERROLEDATAID);
        fieldIndexMap.put( FIELD_USERROLEDATANAME, INDEX_USERROLEDATANAME);
    }

    private UserRoleDataDetailBase proxyUserRoleDataDetailBase = null;

    public UserRoleDataDetailBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean isexcludeDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean querymodelidDirtyFlag = false;
    private boolean querymodelnameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userroledatadetailidDirtyFlag = false;
    private boolean userroledatadetailnameDirtyFlag = false;
    private boolean userroledataidDirtyFlag = false;
    private boolean userroledatanameDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="isexclude")
    private Integer isexclude;
    @Column(name="memo")
    private String memo;
    @Column(name="querymodelid")
    private String querymodelid;
    @Column(name="querymodelname")
    private String querymodelname;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userroledatadetailid")
    private String userroledatadetailid;
    @Column(name="userroledatadetailname")
    private String userroledatadetailname;
    @Column(name="userroledataid")
    private String userroledataid;
    @Column(name="userroledataname")
    private String userroledataname;


    /**
     *  设置属性值[建立时间]
     *  @param createdate
     */
    public void setCreateDate(Timestamp createdate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateDate(createdate);
            return;
        }
        this.createdate =  createdate;
        this.createdateDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立时间]
     */
    public Timestamp getCreateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateDate();
        }
        return this.createdate;
    }

    /**
     *  获取属性值[建立时间]是否修改
     */
    public boolean isCreateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateDateDirty();
        }
        return this.createdateDirtyFlag;
    }

    /**
     *  重置属性值[建立时间]
     */
    public void resetCreateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateDate();
            return;
        }

        this.createdateDirtyFlag = false;
        this.createdate = null;
    }
    /**
     *  设置属性值[建立人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     *  @param createman
     */
    public void setCreateMan(String createman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setCreateMan(createman);
            return;
        }
        if(createman!=null) {
            createman = StringHelper.trimRight(createman);
            if(createman.length()==0) {
                createman = null;
            }
        }
        this.createman =  createman;
        this.createmanDirtyFlag  = true;
    }

    /**
     *  获取属性值[建立人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     */
    public String getCreateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getCreateMan();
        }
        return this.createman;
    }

    /**
     *  获取属性值[建立人]是否修改
     */
    public boolean isCreateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isCreateManDirty();
        }
        return this.createmanDirtyFlag;
    }

    /**
     *  重置属性值[建立人]
     */
    public void resetCreateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetCreateMan();
            return;
        }

        this.createmanDirtyFlag = false;
        this.createman = null;
    }
    /**
     *  设置属性值[排除数据范围]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param isexclude
     */
    public void setIsExclude(Integer isexclude) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIsExclude(isexclude);
            return;
        }
        this.isexclude =  isexclude;
        this.isexcludeDirtyFlag  = true;
    }

    /**
     *  获取属性值[排除数据范围]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getIsExclude() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIsExclude();
        }
        return this.isexclude;
    }

    /**
     *  获取属性值[排除数据范围]是否修改
     */
    public boolean isIsExcludeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIsExcludeDirty();
        }
        return this.isexcludeDirtyFlag;
    }

    /**
     *  重置属性值[排除数据范围]
     */
    public void resetIsExclude() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIsExclude();
            return;
        }

        this.isexcludeDirtyFlag = false;
        this.isexclude = null;
    }
    /**
     *  设置属性值[备注]
     *  @param memo
     */
    public void setMemo(String memo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMemo(memo);
            return;
        }
        if(memo!=null) {
            memo = StringHelper.trimRight(memo);
            if(memo.length()==0) {
                memo = null;
            }
        }
        this.memo =  memo;
        this.memoDirtyFlag  = true;
    }

    /**
     *  获取属性值[备注]
     */
    public String getMemo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMemo();
        }
        return this.memo;
    }

    /**
     *  获取属性值[备注]是否修改
     */
    public boolean isMemoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMemoDirty();
        }
        return this.memoDirtyFlag;
    }

    /**
     *  重置属性值[备注]
     */
    public void resetMemo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMemo();
            return;
        }

        this.memoDirtyFlag = false;
        this.memo = null;
    }
    /**
     *  设置属性值[查询模型]
     *  @param querymodelid
     */
    public void setQueryModelId(String querymodelid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setQueryModelId(querymodelid);
            return;
        }
        if(querymodelid!=null) {
            querymodelid = StringHelper.trimRight(querymodelid);
            if(querymodelid.length()==0) {
                querymodelid = null;
            }
        }
        this.querymodelid =  querymodelid;
        this.querymodelidDirtyFlag  = true;
    }

    /**
     *  获取属性值[查询模型]
     */
    public String getQueryModelId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQueryModelId();
        }
        return this.querymodelid;
    }

    /**
     *  获取属性值[查询模型]是否修改
     */
    public boolean isQueryModelIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isQueryModelIdDirty();
        }
        return this.querymodelidDirtyFlag;
    }

    /**
     *  重置属性值[查询模型]
     */
    public void resetQueryModelId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetQueryModelId();
            return;
        }

        this.querymodelidDirtyFlag = false;
        this.querymodelid = null;
    }
    /**
     *  设置属性值[查询模型]
     *  @param querymodelname
     */
    public void setQueryModelName(String querymodelname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setQueryModelName(querymodelname);
            return;
        }
        if(querymodelname!=null) {
            querymodelname = StringHelper.trimRight(querymodelname);
            if(querymodelname.length()==0) {
                querymodelname = null;
            }
        }
        this.querymodelname =  querymodelname;
        this.querymodelnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[查询模型]
     */
    public String getQueryModelName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQueryModelName();
        }
        return this.querymodelname;
    }

    /**
     *  获取属性值[查询模型]是否修改
     */
    public boolean isQueryModelNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isQueryModelNameDirty();
        }
        return this.querymodelnameDirtyFlag;
    }

    /**
     *  重置属性值[查询模型]
     */
    public void resetQueryModelName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetQueryModelName();
            return;
        }

        this.querymodelnameDirtyFlag = false;
        this.querymodelname = null;
    }
    /**
     *  设置属性值[更新时间]
     *  @param updatedate
     */
    public void setUpdateDate(Timestamp updatedate) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateDate(updatedate);
            return;
        }
        this.updatedate =  updatedate;
        this.updatedateDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新时间]
     */
    public Timestamp getUpdateDate() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateDate();
        }
        return this.updatedate;
    }

    /**
     *  获取属性值[更新时间]是否修改
     */
    public boolean isUpdateDateDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateDateDirty();
        }
        return this.updatedateDirtyFlag;
    }

    /**
     *  重置属性值[更新时间]
     */
    public void resetUpdateDate() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateDate();
            return;
        }

        this.updatedateDirtyFlag = false;
        this.updatedate = null;
    }
    /**
     *  设置属性值[更新人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     *  @param updateman
     */
    public void setUpdateMan(String updateman) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUpdateMan(updateman);
            return;
        }
        if(updateman!=null) {
            updateman = StringHelper.trimRight(updateman);
            if(updateman.length()==0) {
                updateman = null;
            }
        }
        this.updateman =  updateman;
        this.updatemanDirtyFlag  = true;
    }

    /**
     *  获取属性值[更新人]代码表：net.ibizsys.psrt.srv.codelist.SysOperatorCodeListModel
     */
    public String getUpdateMan() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUpdateMan();
        }
        return this.updateman;
    }

    /**
     *  获取属性值[更新人]是否修改
     */
    public boolean isUpdateManDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUpdateManDirty();
        }
        return this.updatemanDirtyFlag;
    }

    /**
     *  重置属性值[更新人]
     */
    public void resetUpdateMan() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUpdateMan();
            return;
        }

        this.updatemanDirtyFlag = false;
        this.updateman = null;
    }
    /**
     *  设置属性值[数据对象能力明细标识]
     *  @param userroledatadetailid
     */
    public void setUserRoleDataDetailId(String userroledatadetailid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDataDetailId(userroledatadetailid);
            return;
        }
        if(userroledatadetailid!=null) {
            userroledatadetailid = StringHelper.trimRight(userroledatadetailid);
            if(userroledatadetailid.length()==0) {
                userroledatadetailid = null;
            }
        }
        this.userroledatadetailid =  userroledatadetailid;
        this.userroledatadetailidDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据对象能力明细标识]
     */
    public String getUserRoleDataDetailId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataDetailId();
        }
        return this.userroledatadetailid;
    }

    /**
     *  获取属性值[数据对象能力明细标识]是否修改
     */
    public boolean isUserRoleDataDetailIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataDetailIdDirty();
        }
        return this.userroledatadetailidDirtyFlag;
    }

    /**
     *  重置属性值[数据对象能力明细标识]
     */
    public void resetUserRoleDataDetailId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDataDetailId();
            return;
        }

        this.userroledatadetailidDirtyFlag = false;
        this.userroledatadetailid = null;
    }
    /**
     *  设置属性值[数据对象能力明细名称]
     *  @param userroledatadetailname
     */
    public void setUserRoleDataDetailName(String userroledatadetailname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDataDetailName(userroledatadetailname);
            return;
        }
        if(userroledatadetailname!=null) {
            userroledatadetailname = StringHelper.trimRight(userroledatadetailname);
            if(userroledatadetailname.length()==0) {
                userroledatadetailname = null;
            }
        }
        this.userroledatadetailname =  userroledatadetailname;
        this.userroledatadetailnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据对象能力明细名称]
     */
    public String getUserRoleDataDetailName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataDetailName();
        }
        return this.userroledatadetailname;
    }

    /**
     *  获取属性值[数据对象能力明细名称]是否修改
     */
    public boolean isUserRoleDataDetailNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataDetailNameDirty();
        }
        return this.userroledatadetailnameDirtyFlag;
    }

    /**
     *  重置属性值[数据对象能力明细名称]
     */
    public void resetUserRoleDataDetailName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDataDetailName();
            return;
        }

        this.userroledatadetailnameDirtyFlag = false;
        this.userroledatadetailname = null;
    }
    /**
     *  设置属性值[数据对象能力]
     *  @param userroledataid
     */
    public void setUserRoleDataId(String userroledataid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDataId(userroledataid);
            return;
        }
        if(userroledataid!=null) {
            userroledataid = StringHelper.trimRight(userroledataid);
            if(userroledataid.length()==0) {
                userroledataid = null;
            }
        }
        this.userroledataid =  userroledataid;
        this.userroledataidDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据对象能力]
     */
    public String getUserRoleDataId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataId();
        }
        return this.userroledataid;
    }

    /**
     *  获取属性值[数据对象能力]是否修改
     */
    public boolean isUserRoleDataIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataIdDirty();
        }
        return this.userroledataidDirtyFlag;
    }

    /**
     *  重置属性值[数据对象能力]
     */
    public void resetUserRoleDataId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDataId();
            return;
        }

        this.userroledataidDirtyFlag = false;
        this.userroledataid = null;
    }
    /**
     *  设置属性值[数据对象能力]
     *  @param userroledataname
     */
    public void setUserRoleDataName(String userroledataname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDataName(userroledataname);
            return;
        }
        if(userroledataname!=null) {
            userroledataname = StringHelper.trimRight(userroledataname);
            if(userroledataname.length()==0) {
                userroledataname = null;
            }
        }
        this.userroledataname =  userroledataname;
        this.userroledatanameDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据对象能力]
     */
    public String getUserRoleDataName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataName();
        }
        return this.userroledataname;
    }

    /**
     *  获取属性值[数据对象能力]是否修改
     */
    public boolean isUserRoleDataNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataNameDirty();
        }
        return this.userroledatanameDirtyFlag;
    }

    /**
     *  重置属性值[数据对象能力]
     */
    public void resetUserRoleDataName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDataName();
            return;
        }

        this.userroledatanameDirtyFlag = false;
        this.userroledataname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        UserRoleDataDetailBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserRoleDataDetailBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetIsExclude();
        et.resetMemo();
        et.resetQueryModelId();
        et.resetQueryModelName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserRoleDataDetailId();
        et.resetUserRoleDataDetailName();
        et.resetUserRoleDataId();
        et.resetUserRoleDataName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isIsExcludeDirty()) {
            params.put(FIELD_ISEXCLUDE,getIsExclude());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isQueryModelIdDirty()) {
            params.put(FIELD_QUERYMODELID,getQueryModelId());
        }
        if(!bDirtyOnly || isQueryModelNameDirty()) {
            params.put(FIELD_QUERYMODELNAME,getQueryModelName());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserRoleDataDetailIdDirty()) {
            params.put(FIELD_USERROLEDATADETAILID,getUserRoleDataDetailId());
        }
        if(!bDirtyOnly || isUserRoleDataDetailNameDirty()) {
            params.put(FIELD_USERROLEDATADETAILNAME,getUserRoleDataDetailName());
        }
        if(!bDirtyOnly || isUserRoleDataIdDirty()) {
            params.put(FIELD_USERROLEDATAID,getUserRoleDataId());
        }
        if(!bDirtyOnly || isUserRoleDataNameDirty()) {
            params.put(FIELD_USERROLEDATANAME,getUserRoleDataName());
        }
        super.onFillMap(params, bDirtyOnly);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#get(java.lang.String)
     */
    @Override
    public Object get(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().get(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.get(strParamName);

        return  UserRoleDataDetailBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserRoleDataDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_ISEXCLUDE:
            return et.getIsExclude();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_QUERYMODELID:
            return et.getQueryModelId();
        case INDEX_QUERYMODELNAME:
            return et.getQueryModelName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERROLEDATADETAILID:
            return et.getUserRoleDataDetailId();
        case INDEX_USERROLEDATADETAILNAME:
            return et.getUserRoleDataDetailName();
        case INDEX_USERROLEDATAID:
            return et.getUserRoleDataId();
        case INDEX_USERROLEDATANAME:
            return et.getUserRoleDataName();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#set(java.lang.String, java.lang.Object)
     */
    @Override
    public void set(String strParamName,Object objValue) throws Exception {
        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().set(strParamName,objValue);
            return;
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null) {
            super.set(strParamName,objValue);
            return;
        }

        UserRoleDataDetailBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserRoleDataDetailBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ISEXCLUDE:
            et.setIsExclude(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_QUERYMODELID:
            et.setQueryModelId(DataObject.getStringValue(obj));
            return ;
        case INDEX_QUERYMODELNAME:
            et.setQueryModelName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATADETAILID:
            et.setUserRoleDataDetailId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATADETAILNAME:
            et.setUserRoleDataDetailName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATAID:
            et.setUserRoleDataId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATANAME:
            et.setUserRoleDataName(DataObject.getStringValue(obj));
            return ;
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#isNull(java.lang.String)
     */
    @Override
    public boolean isNull(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isNull(strParamName);
        }
        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");

        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.isNull(strParamName);

        return  UserRoleDataDetailBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserRoleDataDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_ISEXCLUDE:
            return et.getIsExclude()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_QUERYMODELID:
            return et.getQueryModelId()==null;
        case INDEX_QUERYMODELNAME:
            return et.getQueryModelName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERROLEDATADETAILID:
            return et.getUserRoleDataDetailId()==null;
        case INDEX_USERROLEDATADETAILNAME:
            return et.getUserRoleDataDetailName()==null;
        case INDEX_USERROLEDATAID:
            return et.getUserRoleDataId()==null;
        case INDEX_USERROLEDATANAME:
            return et.getUserRoleDataName()==null;
        default:
            throw new Exception("不明属性标识");
        }
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#contains(java.lang.String)
     */
    @Override
    public boolean contains(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().contains(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.contains(strParamName);

        return  UserRoleDataDetailBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserRoleDataDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_ISEXCLUDE:
            return et.isIsExcludeDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_QUERYMODELID:
            return et.isQueryModelIdDirty();
        case INDEX_QUERYMODELNAME:
            return et.isQueryModelNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERROLEDATADETAILID:
            return et.isUserRoleDataDetailIdDirty();
        case INDEX_USERROLEDATADETAILNAME:
            return et.isUserRoleDataDetailNameDirty();
        case INDEX_USERROLEDATAID:
            return et.isUserRoleDataIdDirty();
        case INDEX_USERROLEDATANAME:
            return et.isUserRoleDataNameDirty();
        default:
            throw new Exception("不明属性标识");
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillJSONObject(net.sf.json.JSONObject, boolean)
     */
    @Override
    protected void onFillJSONObject(JSONObject objJSON, boolean bIncludeEmpty) throws Exception {
        fillJSONObject(this,objJSON,bIncludeEmpty);
        super.onFillJSONObject(objJSON, bIncludeEmpty);
    }

    /**
     * 填充当前对象到JSON
     * @param et 当前数据对象
     * @param json JSON对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static  void fillJSONObject(UserRoleDataDetailBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getIsExclude()!=null) {
            json.put("isexclude", getJSONValue(et.getIsExclude()));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            json.put("memo", getJSONValue(et.getMemo()));
        }
        if(bIncEmpty||et.getQueryModelId()!=null) {
            json.put("querymodelid", getJSONValue(et.getQueryModelId()));
        }
        if(bIncEmpty||et.getQueryModelName()!=null) {
            json.put("querymodelname", getJSONValue(et.getQueryModelName()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserRoleDataDetailId()!=null) {
            json.put("userroledatadetailid", getJSONValue(et.getUserRoleDataDetailId()));
        }
        if(bIncEmpty||et.getUserRoleDataDetailName()!=null) {
            json.put("userroledatadetailname", getJSONValue(et.getUserRoleDataDetailName()));
        }
        if(bIncEmpty||et.getUserRoleDataId()!=null) {
            json.put("userroledataid", getJSONValue(et.getUserRoleDataId()));
        }
        if(bIncEmpty||et.getUserRoleDataName()!=null) {
            json.put("userroledataname", getJSONValue(et.getUserRoleDataName()));
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onFillXmlNode(net.ibizsys.paas.xml.XmlNode, boolean)
     */
    @Override
    protected void onFillXmlNode(XmlNode xmlNode,boolean bIncludeEmpty) throws Exception {
        fillXmlNode(this,xmlNode,bIncludeEmpty);
        super.onFillXmlNode(xmlNode, bIncludeEmpty);
    }

    /**
     * 填充当前对象到Xml节点中
     * @param et 当前数据对象
     * @param node Xml节点
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void fillXmlNode(UserRoleDataDetailBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getIsExclude()!=null) {
            Object obj = et.getIsExclude();
            node.setAttribute("ISEXCLUDE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getQueryModelId()!=null) {
            Object obj = et.getQueryModelId();
            node.setAttribute("QUERYMODELID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getQueryModelName()!=null) {
            Object obj = et.getQueryModelName();
            node.setAttribute("QUERYMODELNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDataDetailId()!=null) {
            Object obj = et.getUserRoleDataDetailId();
            node.setAttribute("USERROLEDATADETAILID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDataDetailName()!=null) {
            Object obj = et.getUserRoleDataDetailName();
            node.setAttribute("USERROLEDATADETAILNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDataId()!=null) {
            Object obj = et.getUserRoleDataId();
            node.setAttribute("USERROLEDATAID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDataName()!=null) {
            Object obj = et.getUserRoleDataName();
            node.setAttribute("USERROLEDATANAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        UserRoleDataDetailBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserRoleDataDetailBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isCreateDateDirty() && (bIncEmpty||et.getCreateDate()!=null)) {
            Object obj = et.getCreateDate();
            if(obj==null) {
                dst.set(FIELD_CREATEDATE,null);
            } else {
                dst.set(FIELD_CREATEDATE,obj);
            }
        }
        if(et.isCreateManDirty() && (bIncEmpty||et.getCreateMan()!=null)) {
            Object obj = et.getCreateMan();
            if(obj==null) {
                dst.set(FIELD_CREATEMAN,null);
            } else {
                dst.set(FIELD_CREATEMAN,obj);
            }
        }
        if(et.isIsExcludeDirty() && (bIncEmpty||et.getIsExclude()!=null)) {
            Object obj = et.getIsExclude();
            if(obj==null) {
                dst.set(FIELD_ISEXCLUDE,null);
            } else {
                dst.set(FIELD_ISEXCLUDE,obj);
            }
        }
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            Object obj = et.getMemo();
            if(obj==null) {
                dst.set(FIELD_MEMO,null);
            } else {
                dst.set(FIELD_MEMO,obj);
            }
        }
        if(et.isQueryModelIdDirty() && (bIncEmpty||et.getQueryModelId()!=null)) {
            Object obj = et.getQueryModelId();
            if(obj==null) {
                dst.set(FIELD_QUERYMODELID,null);
            } else {
                dst.set(FIELD_QUERYMODELID,obj);
            }
        }
        if(et.isQueryModelNameDirty() && (bIncEmpty||et.getQueryModelName()!=null)) {
            Object obj = et.getQueryModelName();
            if(obj==null) {
                dst.set(FIELD_QUERYMODELNAME,null);
            } else {
                dst.set(FIELD_QUERYMODELNAME,obj);
            }
        }
        if(et.isUpdateDateDirty() && (bIncEmpty||et.getUpdateDate()!=null)) {
            Object obj = et.getUpdateDate();
            if(obj==null) {
                dst.set(FIELD_UPDATEDATE,null);
            } else {
                dst.set(FIELD_UPDATEDATE,obj);
            }
        }
        if(et.isUpdateManDirty() && (bIncEmpty||et.getUpdateMan()!=null)) {
            Object obj = et.getUpdateMan();
            if(obj==null) {
                dst.set(FIELD_UPDATEMAN,null);
            } else {
                dst.set(FIELD_UPDATEMAN,obj);
            }
        }
        if(et.isUserRoleDataDetailIdDirty() && (bIncEmpty||et.getUserRoleDataDetailId()!=null)) {
            Object obj = et.getUserRoleDataDetailId();
            if(obj==null) {
                dst.set(FIELD_USERROLEDATADETAILID,null);
            } else {
                dst.set(FIELD_USERROLEDATADETAILID,obj);
            }
        }
        if(et.isUserRoleDataDetailNameDirty() && (bIncEmpty||et.getUserRoleDataDetailName()!=null)) {
            Object obj = et.getUserRoleDataDetailName();
            if(obj==null) {
                dst.set(FIELD_USERROLEDATADETAILNAME,null);
            } else {
                dst.set(FIELD_USERROLEDATADETAILNAME,obj);
            }
        }
        if(et.isUserRoleDataIdDirty() && (bIncEmpty||et.getUserRoleDataId()!=null)) {
            Object obj = et.getUserRoleDataId();
            if(obj==null) {
                dst.set(FIELD_USERROLEDATAID,null);
            } else {
                dst.set(FIELD_USERROLEDATAID,obj);
            }
        }
        if(et.isUserRoleDataNameDirty() && (bIncEmpty||et.getUserRoleDataName()!=null)) {
            Object obj = et.getUserRoleDataName();
            if(obj==null) {
                dst.set(FIELD_USERROLEDATANAME,null);
            } else {
                dst.set(FIELD_USERROLEDATANAME,obj);
            }
        }
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#remove(java.lang.String)
     */
    @Override
    public boolean remove(String strParamName) throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().remove(strParamName);
        }

        if(StringHelper.isNullOrEmpty(strParamName))
            throw new Exception("没有指定属性");
        Integer index=fieldIndexMap.get(strParamName.toUpperCase());
        if(index==null)
            return super.remove(strParamName);
        return  UserRoleDataDetailBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserRoleDataDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_ISEXCLUDE:
            et.resetIsExclude();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_QUERYMODELID:
            et.resetQueryModelId();
            return true;
        case INDEX_QUERYMODELNAME:
            et.resetQueryModelName();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERROLEDATADETAILID:
            et.resetUserRoleDataDetailId();
            return true;
        case INDEX_USERROLEDATADETAILNAME:
            et.resetUserRoleDataDetailName();
            return true;
        case INDEX_USERROLEDATAID:
            et.resetUserRoleDataId();
            return true;
        case INDEX_USERROLEDATANAME:
            et.resetUserRoleDataName();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }




    private Object objQueryModelLock = new Object();
    private net.ibizsys.psrt.srv.demodel.entity.QueryModel querymodel = null;
    /**
    * 获取父数据 实体查询模型
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.demodel.entity.QueryModel getQueryModel() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getQueryModel();
        }

        if(this.getQueryModelId()==null)
            return null;
        synchronized(objQueryModelLock) {
            if(querymodel==null) {
                querymodel = new net.ibizsys.psrt.srv.demodel.entity.QueryModel();
                querymodel.setQueryModelId(this.getQueryModelId());
                net.ibizsys.psrt.srv.demodel.service.QueryModelService service = (net.ibizsys.psrt.srv.demodel.service.QueryModelService)ServiceGlobal.getService(net.ibizsys.psrt.srv.demodel.service.QueryModelService.class,this.getSessionFactory());
                if(this.getQueryModelId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(querymodel);
                else
                    service.get(querymodel);
            }
            return querymodel;
        }
    }

    private Object objUserRoleDataLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.UserRoleData userroledata = null;
    /**
    * 获取父数据 数据对象能力
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.UserRoleData getUserRoleData() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleData();
        }

        if(this.getUserRoleDataId()==null)
            return null;
        synchronized(objUserRoleDataLock) {
            if(userroledata==null) {
                userroledata = new net.ibizsys.psrt.srv.common.entity.UserRoleData();
                userroledata.setUserRoleDataId(this.getUserRoleDataId());
                net.ibizsys.psrt.srv.common.service.UserRoleDataService service = (net.ibizsys.psrt.srv.common.service.UserRoleDataService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserRoleDataService.class,this.getSessionFactory());
                if(this.getUserRoleDataId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(userroledata);
                else
                    service.get(userroledata);
            }
            return userroledata;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private UserRoleDataDetailBase getProxyEntity() {
        return this.proxyUserRoleDataDetailBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserRoleDataDetailBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserRoleDataDetailBase) {
            this.proxyUserRoleDataDetailBase = (UserRoleDataDetailBase)proxyDataObject;
        }

    }

}