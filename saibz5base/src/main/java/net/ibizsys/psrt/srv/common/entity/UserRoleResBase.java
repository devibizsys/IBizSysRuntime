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
 * 实体[UserRoleRes] 数据对象基类
 */
public abstract class UserRoleResBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[允许模式]
     */
    public final static String FIELD_ISALLOW = "ISALLOW";
    /**
     *   实体属性标识[统一资源]
     */
    public final static String FIELD_UNIRESID = "UNIRESID";
    /**
     *   实体属性标识[资源]
     */
    public final static String FIELD_UNIRESNAME = "UNIRESNAME";
    /**
     *   实体属性标识[资源类型]
     */
    public final static String FIELD_UNIRESTYPE = "UNIRESTYPE";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[用户角色]
     */
    public final static String FIELD_USERROLEID = "USERROLEID";
    /**
     *   实体属性标识[用户角色]
     */
    public final static String FIELD_USERROLENAME = "USERROLENAME";
    /**
     *   实体属性标识[用户角色资源能力标识]
     */
    public final static String FIELD_USERROLERESID = "USERROLERESID";
    /**
     *   实体属性标识[用户角色资源能力名称]
     */
    public final static String FIELD_USERROLERESNAME = "USERROLERESNAME";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_ISALLOW = 2;
    private final static int INDEX_UNIRESID = 3;
    private final static int INDEX_UNIRESNAME = 4;
    private final static int INDEX_UNIRESTYPE = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;
    private final static int INDEX_USERROLEID = 8;
    private final static int INDEX_USERROLENAME = 9;
    private final static int INDEX_USERROLERESID = 10;
    private final static int INDEX_USERROLERESNAME = 11;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_ISALLOW, INDEX_ISALLOW);
        fieldIndexMap.put( FIELD_UNIRESID, INDEX_UNIRESID);
        fieldIndexMap.put( FIELD_UNIRESNAME, INDEX_UNIRESNAME);
        fieldIndexMap.put( FIELD_UNIRESTYPE, INDEX_UNIRESTYPE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERROLEID, INDEX_USERROLEID);
        fieldIndexMap.put( FIELD_USERROLENAME, INDEX_USERROLENAME);
        fieldIndexMap.put( FIELD_USERROLERESID, INDEX_USERROLERESID);
        fieldIndexMap.put( FIELD_USERROLERESNAME, INDEX_USERROLERESNAME);
    }

    private UserRoleResBase proxyUserRoleResBase = null;

    public UserRoleResBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean isallowDirtyFlag = false;
    private boolean uniresidDirtyFlag = false;
    private boolean uniresnameDirtyFlag = false;
    private boolean unirestypeDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userroleidDirtyFlag = false;
    private boolean userrolenameDirtyFlag = false;
    private boolean userroleresidDirtyFlag = false;
    private boolean userroleresnameDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="isallow")
    private Integer isallow;
    @Column(name="uniresid")
    private String uniresid;
    @Column(name="uniresname")
    private String uniresname;
    @Column(name="unirestype")
    private String unirestype;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userroleid")
    private String userroleid;
    @Column(name="userrolename")
    private String userrolename;
    @Column(name="userroleresid")
    private String userroleresid;
    @Column(name="userroleresname")
    private String userroleresname;


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
     *  设置属性值[允许模式]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param isallow
     */
    public void setIsAllow(Integer isallow) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIsAllow(isallow);
            return;
        }
        this.isallow =  isallow;
        this.isallowDirtyFlag  = true;
    }

    /**
     *  获取属性值[允许模式]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getIsAllow() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIsAllow();
        }
        return this.isallow;
    }

    /**
     *  获取属性值[允许模式]是否修改
     */
    public boolean isIsAllowDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIsAllowDirty();
        }
        return this.isallowDirtyFlag;
    }

    /**
     *  重置属性值[允许模式]
     */
    public void resetIsAllow() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIsAllow();
            return;
        }

        this.isallowDirtyFlag = false;
        this.isallow = null;
    }
    /**
     *  设置属性值[统一资源]
     *  @param uniresid
     */
    public void setUniResId(String uniresid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUniResId(uniresid);
            return;
        }
        if(uniresid!=null) {
            uniresid = StringHelper.trimRight(uniresid);
            if(uniresid.length()==0) {
                uniresid = null;
            }
        }
        this.uniresid =  uniresid;
        this.uniresidDirtyFlag  = true;
    }

    /**
     *  获取属性值[统一资源]
     */
    public String getUniResId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUniResId();
        }
        return this.uniresid;
    }

    /**
     *  获取属性值[统一资源]是否修改
     */
    public boolean isUniResIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUniResIdDirty();
        }
        return this.uniresidDirtyFlag;
    }

    /**
     *  重置属性值[统一资源]
     */
    public void resetUniResId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUniResId();
            return;
        }

        this.uniresidDirtyFlag = false;
        this.uniresid = null;
    }
    /**
     *  设置属性值[资源]
     *  @param uniresname
     */
    public void setUniResName(String uniresname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUniResName(uniresname);
            return;
        }
        if(uniresname!=null) {
            uniresname = StringHelper.trimRight(uniresname);
            if(uniresname.length()==0) {
                uniresname = null;
            }
        }
        this.uniresname =  uniresname;
        this.uniresnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[资源]
     */
    public String getUniResName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUniResName();
        }
        return this.uniresname;
    }

    /**
     *  获取属性值[资源]是否修改
     */
    public boolean isUniResNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUniResNameDirty();
        }
        return this.uniresnameDirtyFlag;
    }

    /**
     *  重置属性值[资源]
     */
    public void resetUniResName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUniResName();
            return;
        }

        this.uniresnameDirtyFlag = false;
        this.uniresname = null;
    }
    /**
     *  设置属性值[资源类型]代码表：net.ibizsys.psrt.srv.codelist.UniResTypeCodeListModel
     *  @param unirestype
     */
    public void setUniResType(String unirestype) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUniResType(unirestype);
            return;
        }
        if(unirestype!=null) {
            unirestype = StringHelper.trimRight(unirestype);
            if(unirestype.length()==0) {
                unirestype = null;
            }
        }
        this.unirestype =  unirestype;
        this.unirestypeDirtyFlag  = true;
    }

    /**
     *  获取属性值[资源类型]代码表：net.ibizsys.psrt.srv.codelist.UniResTypeCodeListModel
     */
    public String getUniResType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUniResType();
        }
        return this.unirestype;
    }

    /**
     *  获取属性值[资源类型]是否修改
     */
    public boolean isUniResTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUniResTypeDirty();
        }
        return this.unirestypeDirtyFlag;
    }

    /**
     *  重置属性值[资源类型]
     */
    public void resetUniResType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUniResType();
            return;
        }

        this.unirestypeDirtyFlag = false;
        this.unirestype = null;
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
     *  设置属性值[用户角色]
     *  @param userroleid
     */
    public void setUserRoleId(String userroleid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleId(userroleid);
            return;
        }
        if(userroleid!=null) {
            userroleid = StringHelper.trimRight(userroleid);
            if(userroleid.length()==0) {
                userroleid = null;
            }
        }
        this.userroleid =  userroleid;
        this.userroleidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色]
     */
    public String getUserRoleId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleId();
        }
        return this.userroleid;
    }

    /**
     *  获取属性值[用户角色]是否修改
     */
    public boolean isUserRoleIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleIdDirty();
        }
        return this.userroleidDirtyFlag;
    }

    /**
     *  重置属性值[用户角色]
     */
    public void resetUserRoleId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleId();
            return;
        }

        this.userroleidDirtyFlag = false;
        this.userroleid = null;
    }
    /**
     *  设置属性值[用户角色]
     *  @param userrolename
     */
    public void setUserRoleName(String userrolename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleName(userrolename);
            return;
        }
        if(userrolename!=null) {
            userrolename = StringHelper.trimRight(userrolename);
            if(userrolename.length()==0) {
                userrolename = null;
            }
        }
        this.userrolename =  userrolename;
        this.userrolenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色]
     */
    public String getUserRoleName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleName();
        }
        return this.userrolename;
    }

    /**
     *  获取属性值[用户角色]是否修改
     */
    public boolean isUserRoleNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleNameDirty();
        }
        return this.userrolenameDirtyFlag;
    }

    /**
     *  重置属性值[用户角色]
     */
    public void resetUserRoleName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleName();
            return;
        }

        this.userrolenameDirtyFlag = false;
        this.userrolename = null;
    }
    /**
     *  设置属性值[用户角色资源能力标识]
     *  @param userroleresid
     */
    public void setUserRoleResId(String userroleresid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleResId(userroleresid);
            return;
        }
        if(userroleresid!=null) {
            userroleresid = StringHelper.trimRight(userroleresid);
            if(userroleresid.length()==0) {
                userroleresid = null;
            }
        }
        this.userroleresid =  userroleresid;
        this.userroleresidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色资源能力标识]
     */
    public String getUserRoleResId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleResId();
        }
        return this.userroleresid;
    }

    /**
     *  获取属性值[用户角色资源能力标识]是否修改
     */
    public boolean isUserRoleResIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleResIdDirty();
        }
        return this.userroleresidDirtyFlag;
    }

    /**
     *  重置属性值[用户角色资源能力标识]
     */
    public void resetUserRoleResId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleResId();
            return;
        }

        this.userroleresidDirtyFlag = false;
        this.userroleresid = null;
    }
    /**
     *  设置属性值[用户角色资源能力名称]
     *  @param userroleresname
     */
    public void setUserRoleResName(String userroleresname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleResName(userroleresname);
            return;
        }
        if(userroleresname!=null) {
            userroleresname = StringHelper.trimRight(userroleresname);
            if(userroleresname.length()==0) {
                userroleresname = null;
            }
        }
        this.userroleresname =  userroleresname;
        this.userroleresnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色资源能力名称]
     */
    public String getUserRoleResName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleResName();
        }
        return this.userroleresname;
    }

    /**
     *  获取属性值[用户角色资源能力名称]是否修改
     */
    public boolean isUserRoleResNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleResNameDirty();
        }
        return this.userroleresnameDirtyFlag;
    }

    /**
     *  重置属性值[用户角色资源能力名称]
     */
    public void resetUserRoleResName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleResName();
            return;
        }

        this.userroleresnameDirtyFlag = false;
        this.userroleresname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        UserRoleResBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserRoleResBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetIsAllow();
        et.resetUniResId();
        et.resetUniResName();
        et.resetUniResType();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserRoleId();
        et.resetUserRoleName();
        et.resetUserRoleResId();
        et.resetUserRoleResName();
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
        if(!bDirtyOnly || isIsAllowDirty()) {
            params.put(FIELD_ISALLOW,getIsAllow());
        }
        if(!bDirtyOnly || isUniResIdDirty()) {
            params.put(FIELD_UNIRESID,getUniResId());
        }
        if(!bDirtyOnly || isUniResNameDirty()) {
            params.put(FIELD_UNIRESNAME,getUniResName());
        }
        if(!bDirtyOnly || isUniResTypeDirty()) {
            params.put(FIELD_UNIRESTYPE,getUniResType());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserRoleIdDirty()) {
            params.put(FIELD_USERROLEID,getUserRoleId());
        }
        if(!bDirtyOnly || isUserRoleNameDirty()) {
            params.put(FIELD_USERROLENAME,getUserRoleName());
        }
        if(!bDirtyOnly || isUserRoleResIdDirty()) {
            params.put(FIELD_USERROLERESID,getUserRoleResId());
        }
        if(!bDirtyOnly || isUserRoleResNameDirty()) {
            params.put(FIELD_USERROLERESNAME,getUserRoleResName());
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

        return  UserRoleResBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserRoleResBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_ISALLOW:
            return et.getIsAllow();
        case INDEX_UNIRESID:
            return et.getUniResId();
        case INDEX_UNIRESNAME:
            return et.getUniResName();
        case INDEX_UNIRESTYPE:
            return et.getUniResType();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERROLEID:
            return et.getUserRoleId();
        case INDEX_USERROLENAME:
            return et.getUserRoleName();
        case INDEX_USERROLERESID:
            return et.getUserRoleResId();
        case INDEX_USERROLERESNAME:
            return et.getUserRoleResName();
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

        UserRoleResBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserRoleResBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ISALLOW:
            et.setIsAllow(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_UNIRESID:
            et.setUniResId(DataObject.getStringValue(obj));
            return ;
        case INDEX_UNIRESNAME:
            et.setUniResName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UNIRESTYPE:
            et.setUniResType(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEID:
            et.setUserRoleId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLENAME:
            et.setUserRoleName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLERESID:
            et.setUserRoleResId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLERESNAME:
            et.setUserRoleResName(DataObject.getStringValue(obj));
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

        return  UserRoleResBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserRoleResBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_ISALLOW:
            return et.getIsAllow()==null;
        case INDEX_UNIRESID:
            return et.getUniResId()==null;
        case INDEX_UNIRESNAME:
            return et.getUniResName()==null;
        case INDEX_UNIRESTYPE:
            return et.getUniResType()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERROLEID:
            return et.getUserRoleId()==null;
        case INDEX_USERROLENAME:
            return et.getUserRoleName()==null;
        case INDEX_USERROLERESID:
            return et.getUserRoleResId()==null;
        case INDEX_USERROLERESNAME:
            return et.getUserRoleResName()==null;
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

        return  UserRoleResBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserRoleResBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_ISALLOW:
            return et.isIsAllowDirty();
        case INDEX_UNIRESID:
            return et.isUniResIdDirty();
        case INDEX_UNIRESNAME:
            return et.isUniResNameDirty();
        case INDEX_UNIRESTYPE:
            return et.isUniResTypeDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERROLEID:
            return et.isUserRoleIdDirty();
        case INDEX_USERROLENAME:
            return et.isUserRoleNameDirty();
        case INDEX_USERROLERESID:
            return et.isUserRoleResIdDirty();
        case INDEX_USERROLERESNAME:
            return et.isUserRoleResNameDirty();
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
    private static  void fillJSONObject(UserRoleResBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getIsAllow()!=null) {
            json.put("isallow", getJSONValue(et.getIsAllow()));
        }
        if(bIncEmpty||et.getUniResId()!=null) {
            json.put("uniresid", getJSONValue(et.getUniResId()));
        }
        if(bIncEmpty||et.getUniResName()!=null) {
            json.put("uniresname", getJSONValue(et.getUniResName()));
        }
        if(bIncEmpty||et.getUniResType()!=null) {
            json.put("unirestype", getJSONValue(et.getUniResType()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserRoleId()!=null) {
            json.put("userroleid", getJSONValue(et.getUserRoleId()));
        }
        if(bIncEmpty||et.getUserRoleName()!=null) {
            json.put("userrolename", getJSONValue(et.getUserRoleName()));
        }
        if(bIncEmpty||et.getUserRoleResId()!=null) {
            json.put("userroleresid", getJSONValue(et.getUserRoleResId()));
        }
        if(bIncEmpty||et.getUserRoleResName()!=null) {
            json.put("userroleresname", getJSONValue(et.getUserRoleResName()));
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
    private static void fillXmlNode(UserRoleResBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getIsAllow()!=null) {
            Object obj = et.getIsAllow();
            node.setAttribute("ISALLOW",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getUniResId()!=null) {
            Object obj = et.getUniResId();
            node.setAttribute("UNIRESID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUniResName()!=null) {
            Object obj = et.getUniResName();
            node.setAttribute("UNIRESNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUniResType()!=null) {
            Object obj = et.getUniResType();
            node.setAttribute("UNIRESTYPE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleId()!=null) {
            Object obj = et.getUserRoleId();
            node.setAttribute("USERROLEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleName()!=null) {
            Object obj = et.getUserRoleName();
            node.setAttribute("USERROLENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleResId()!=null) {
            Object obj = et.getUserRoleResId();
            node.setAttribute("USERROLERESID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleResName()!=null) {
            Object obj = et.getUserRoleResName();
            node.setAttribute("USERROLERESNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        UserRoleResBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserRoleResBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isIsAllowDirty() && (bIncEmpty||et.getIsAllow()!=null)) {
            Object obj = et.getIsAllow();
            if(obj==null) {
                dst.set(FIELD_ISALLOW,null);
            } else {
                dst.set(FIELD_ISALLOW,obj);
            }
        }
        if(et.isUniResIdDirty() && (bIncEmpty||et.getUniResId()!=null)) {
            Object obj = et.getUniResId();
            if(obj==null) {
                dst.set(FIELD_UNIRESID,null);
            } else {
                dst.set(FIELD_UNIRESID,obj);
            }
        }
        if(et.isUniResNameDirty() && (bIncEmpty||et.getUniResName()!=null)) {
            Object obj = et.getUniResName();
            if(obj==null) {
                dst.set(FIELD_UNIRESNAME,null);
            } else {
                dst.set(FIELD_UNIRESNAME,obj);
            }
        }
        if(et.isUniResTypeDirty() && (bIncEmpty||et.getUniResType()!=null)) {
            Object obj = et.getUniResType();
            if(obj==null) {
                dst.set(FIELD_UNIRESTYPE,null);
            } else {
                dst.set(FIELD_UNIRESTYPE,obj);
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
        if(et.isUserRoleIdDirty() && (bIncEmpty||et.getUserRoleId()!=null)) {
            Object obj = et.getUserRoleId();
            if(obj==null) {
                dst.set(FIELD_USERROLEID,null);
            } else {
                dst.set(FIELD_USERROLEID,obj);
            }
        }
        if(et.isUserRoleNameDirty() && (bIncEmpty||et.getUserRoleName()!=null)) {
            Object obj = et.getUserRoleName();
            if(obj==null) {
                dst.set(FIELD_USERROLENAME,null);
            } else {
                dst.set(FIELD_USERROLENAME,obj);
            }
        }
        if(et.isUserRoleResIdDirty() && (bIncEmpty||et.getUserRoleResId()!=null)) {
            Object obj = et.getUserRoleResId();
            if(obj==null) {
                dst.set(FIELD_USERROLERESID,null);
            } else {
                dst.set(FIELD_USERROLERESID,obj);
            }
        }
        if(et.isUserRoleResNameDirty() && (bIncEmpty||et.getUserRoleResName()!=null)) {
            Object obj = et.getUserRoleResName();
            if(obj==null) {
                dst.set(FIELD_USERROLERESNAME,null);
            } else {
                dst.set(FIELD_USERROLERESNAME,obj);
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
        return  UserRoleResBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserRoleResBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_ISALLOW:
            et.resetIsAllow();
            return true;
        case INDEX_UNIRESID:
            et.resetUniResId();
            return true;
        case INDEX_UNIRESNAME:
            et.resetUniResName();
            return true;
        case INDEX_UNIRESTYPE:
            et.resetUniResType();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERROLEID:
            et.resetUserRoleId();
            return true;
        case INDEX_USERROLENAME:
            et.resetUserRoleName();
            return true;
        case INDEX_USERROLERESID:
            et.resetUserRoleResId();
            return true;
        case INDEX_USERROLERESNAME:
            et.resetUserRoleResName();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }




    private Object objUserRoleLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.UserRole userrole = null;
    /**
    * 获取父数据 用户角色
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.UserRole getUserRole() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRole();
        }

        if(this.getUserRoleId()==null)
            return null;
        synchronized(objUserRoleLock) {
            if(userrole==null) {
                userrole = new net.ibizsys.psrt.srv.common.entity.UserRole();
                userrole.setUserRoleId(this.getUserRoleId());
                net.ibizsys.psrt.srv.common.service.UserRoleService service = (net.ibizsys.psrt.srv.common.service.UserRoleService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserRoleService.class,this.getSessionFactory());
                if(this.getUserRoleId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(userrole);
                else
                    service.get(userrole);
            }
            return userrole;
        }
    }

    private Object objUniResLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.UniRes unires = null;
    /**
    * 获取父数据 统一资源
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.UniRes getUniRes() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUniRes();
        }

        if(this.getUniResId()==null)
            return null;
        synchronized(objUniResLock) {
            if(unires==null) {
                unires = new net.ibizsys.psrt.srv.common.entity.UniRes();
                unires.setUniResId(this.getUniResId());
                net.ibizsys.psrt.srv.common.service.UniResService service = (net.ibizsys.psrt.srv.common.service.UniResService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UniResService.class,this.getSessionFactory());
                if(this.getUniResId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(unires);
                else
                    service.get(unires);
            }
            return unires;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private UserRoleResBase getProxyEntity() {
        return this.proxyUserRoleResBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserRoleResBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserRoleResBase) {
            this.proxyUserRoleResBase = (UserRoleResBase)proxyDataObject;
        }

    }

}