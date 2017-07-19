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
 * 实体[UserRoleDEFields] 数据对象基类
 */
public abstract class UserRoleDEFieldsBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[实体属性访问能力]
     */
    public final static String FIELD_USERROLEDEFIELDID = "USERROLEDEFIELDID";
    /**
     *   实体属性标识[实体属性控制]
     */
    public final static String FIELD_USERROLEDEFIELDNAME = "USERROLEDEFIELDNAME";
    /**
     *   实体属性标识[用户角色相关实体属性访问控制标识]
     */
    public final static String FIELD_USERROLEDEFIELDSID = "USERROLEDEFIELDSID";
    /**
     *   实体属性标识[用户角色相关实体属性访问控制]
     */
    public final static String FIELD_USERROLEDEFIELDSNAME = "USERROLEDEFIELDSNAME";
    /**
     *   实体属性标识[用户角色]
     */
    public final static String FIELD_USERROLEID = "USERROLEID";
    /**
     *   实体属性标识[用户角色]
     */
    public final static String FIELD_USERROLENAME = "USERROLENAME";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_UPDATEDATE = 2;
    private final static int INDEX_UPDATEMAN = 3;
    private final static int INDEX_USERROLEDEFIELDID = 4;
    private final static int INDEX_USERROLEDEFIELDNAME = 5;
    private final static int INDEX_USERROLEDEFIELDSID = 6;
    private final static int INDEX_USERROLEDEFIELDSNAME = 7;
    private final static int INDEX_USERROLEID = 8;
    private final static int INDEX_USERROLENAME = 9;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERROLEDEFIELDID, INDEX_USERROLEDEFIELDID);
        fieldIndexMap.put( FIELD_USERROLEDEFIELDNAME, INDEX_USERROLEDEFIELDNAME);
        fieldIndexMap.put( FIELD_USERROLEDEFIELDSID, INDEX_USERROLEDEFIELDSID);
        fieldIndexMap.put( FIELD_USERROLEDEFIELDSNAME, INDEX_USERROLEDEFIELDSNAME);
        fieldIndexMap.put( FIELD_USERROLEID, INDEX_USERROLEID);
        fieldIndexMap.put( FIELD_USERROLENAME, INDEX_USERROLENAME);
    }

    private UserRoleDEFieldsBase proxyUserRoleDEFieldsBase = null;

    public UserRoleDEFieldsBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userroledefieldidDirtyFlag = false;
    private boolean userroledefieldnameDirtyFlag = false;
    private boolean userroledefieldsidDirtyFlag = false;
    private boolean userroledefieldsnameDirtyFlag = false;
    private boolean userroleidDirtyFlag = false;
    private boolean userrolenameDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userroledefieldid")
    private String userroledefieldid;
    @Column(name="userroledefieldname")
    private String userroledefieldname;
    @Column(name="userroledefieldsid")
    private String userroledefieldsid;
    @Column(name="userroledefieldsname")
    private String userroledefieldsname;
    @Column(name="userroleid")
    private String userroleid;
    @Column(name="userrolename")
    private String userrolename;


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
     *  设置属性值[实体属性访问能力]
     *  @param userroledefieldid
     */
    public void setUserRoleDEFieldId(String userroledefieldid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDEFieldId(userroledefieldid);
            return;
        }
        if(userroledefieldid!=null) {
            userroledefieldid = StringHelper.trimRight(userroledefieldid);
            if(userroledefieldid.length()==0) {
                userroledefieldid = null;
            }
        }
        this.userroledefieldid =  userroledefieldid;
        this.userroledefieldidDirtyFlag  = true;
    }

    /**
     *  获取属性值[实体属性访问能力]
     */
    public String getUserRoleDEFieldId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDEFieldId();
        }
        return this.userroledefieldid;
    }

    /**
     *  获取属性值[实体属性访问能力]是否修改
     */
    public boolean isUserRoleDEFieldIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDEFieldIdDirty();
        }
        return this.userroledefieldidDirtyFlag;
    }

    /**
     *  重置属性值[实体属性访问能力]
     */
    public void resetUserRoleDEFieldId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDEFieldId();
            return;
        }

        this.userroledefieldidDirtyFlag = false;
        this.userroledefieldid = null;
    }
    /**
     *  设置属性值[实体属性控制]
     *  @param userroledefieldname
     */
    public void setUserRoleDEFieldName(String userroledefieldname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDEFieldName(userroledefieldname);
            return;
        }
        if(userroledefieldname!=null) {
            userroledefieldname = StringHelper.trimRight(userroledefieldname);
            if(userroledefieldname.length()==0) {
                userroledefieldname = null;
            }
        }
        this.userroledefieldname =  userroledefieldname;
        this.userroledefieldnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[实体属性控制]
     */
    public String getUserRoleDEFieldName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDEFieldName();
        }
        return this.userroledefieldname;
    }

    /**
     *  获取属性值[实体属性控制]是否修改
     */
    public boolean isUserRoleDEFieldNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDEFieldNameDirty();
        }
        return this.userroledefieldnameDirtyFlag;
    }

    /**
     *  重置属性值[实体属性控制]
     */
    public void resetUserRoleDEFieldName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDEFieldName();
            return;
        }

        this.userroledefieldnameDirtyFlag = false;
        this.userroledefieldname = null;
    }
    /**
     *  设置属性值[用户角色相关实体属性访问控制标识]
     *  @param userroledefieldsid
     */
    public void setUserRoleDEFieldsId(String userroledefieldsid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDEFieldsId(userroledefieldsid);
            return;
        }
        if(userroledefieldsid!=null) {
            userroledefieldsid = StringHelper.trimRight(userroledefieldsid);
            if(userroledefieldsid.length()==0) {
                userroledefieldsid = null;
            }
        }
        this.userroledefieldsid =  userroledefieldsid;
        this.userroledefieldsidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色相关实体属性访问控制标识]
     */
    public String getUserRoleDEFieldsId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDEFieldsId();
        }
        return this.userroledefieldsid;
    }

    /**
     *  获取属性值[用户角色相关实体属性访问控制标识]是否修改
     */
    public boolean isUserRoleDEFieldsIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDEFieldsIdDirty();
        }
        return this.userroledefieldsidDirtyFlag;
    }

    /**
     *  重置属性值[用户角色相关实体属性访问控制标识]
     */
    public void resetUserRoleDEFieldsId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDEFieldsId();
            return;
        }

        this.userroledefieldsidDirtyFlag = false;
        this.userroledefieldsid = null;
    }
    /**
     *  设置属性值[用户角色相关实体属性访问控制]
     *  @param userroledefieldsname
     */
    public void setUserRoleDEFieldsName(String userroledefieldsname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDEFieldsName(userroledefieldsname);
            return;
        }
        if(userroledefieldsname!=null) {
            userroledefieldsname = StringHelper.trimRight(userroledefieldsname);
            if(userroledefieldsname.length()==0) {
                userroledefieldsname = null;
            }
        }
        this.userroledefieldsname =  userroledefieldsname;
        this.userroledefieldsnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色相关实体属性访问控制]
     */
    public String getUserRoleDEFieldsName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDEFieldsName();
        }
        return this.userroledefieldsname;
    }

    /**
     *  获取属性值[用户角色相关实体属性访问控制]是否修改
     */
    public boolean isUserRoleDEFieldsNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDEFieldsNameDirty();
        }
        return this.userroledefieldsnameDirtyFlag;
    }

    /**
     *  重置属性值[用户角色相关实体属性访问控制]
     */
    public void resetUserRoleDEFieldsName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDEFieldsName();
            return;
        }

        this.userroledefieldsnameDirtyFlag = false;
        this.userroledefieldsname = null;
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

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        UserRoleDEFieldsBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserRoleDEFieldsBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserRoleDEFieldId();
        et.resetUserRoleDEFieldName();
        et.resetUserRoleDEFieldsId();
        et.resetUserRoleDEFieldsName();
        et.resetUserRoleId();
        et.resetUserRoleName();
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
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserRoleDEFieldIdDirty()) {
            params.put(FIELD_USERROLEDEFIELDID,getUserRoleDEFieldId());
        }
        if(!bDirtyOnly || isUserRoleDEFieldNameDirty()) {
            params.put(FIELD_USERROLEDEFIELDNAME,getUserRoleDEFieldName());
        }
        if(!bDirtyOnly || isUserRoleDEFieldsIdDirty()) {
            params.put(FIELD_USERROLEDEFIELDSID,getUserRoleDEFieldsId());
        }
        if(!bDirtyOnly || isUserRoleDEFieldsNameDirty()) {
            params.put(FIELD_USERROLEDEFIELDSNAME,getUserRoleDEFieldsName());
        }
        if(!bDirtyOnly || isUserRoleIdDirty()) {
            params.put(FIELD_USERROLEID,getUserRoleId());
        }
        if(!bDirtyOnly || isUserRoleNameDirty()) {
            params.put(FIELD_USERROLENAME,getUserRoleName());
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

        return  UserRoleDEFieldsBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserRoleDEFieldsBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERROLEDEFIELDID:
            return et.getUserRoleDEFieldId();
        case INDEX_USERROLEDEFIELDNAME:
            return et.getUserRoleDEFieldName();
        case INDEX_USERROLEDEFIELDSID:
            return et.getUserRoleDEFieldsId();
        case INDEX_USERROLEDEFIELDSNAME:
            return et.getUserRoleDEFieldsName();
        case INDEX_USERROLEID:
            return et.getUserRoleId();
        case INDEX_USERROLENAME:
            return et.getUserRoleName();
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

        UserRoleDEFieldsBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserRoleDEFieldsBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDEFIELDID:
            et.setUserRoleDEFieldId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDEFIELDNAME:
            et.setUserRoleDEFieldName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDEFIELDSID:
            et.setUserRoleDEFieldsId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDEFIELDSNAME:
            et.setUserRoleDEFieldsName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEID:
            et.setUserRoleId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLENAME:
            et.setUserRoleName(DataObject.getStringValue(obj));
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

        return  UserRoleDEFieldsBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserRoleDEFieldsBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERROLEDEFIELDID:
            return et.getUserRoleDEFieldId()==null;
        case INDEX_USERROLEDEFIELDNAME:
            return et.getUserRoleDEFieldName()==null;
        case INDEX_USERROLEDEFIELDSID:
            return et.getUserRoleDEFieldsId()==null;
        case INDEX_USERROLEDEFIELDSNAME:
            return et.getUserRoleDEFieldsName()==null;
        case INDEX_USERROLEID:
            return et.getUserRoleId()==null;
        case INDEX_USERROLENAME:
            return et.getUserRoleName()==null;
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

        return  UserRoleDEFieldsBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserRoleDEFieldsBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERROLEDEFIELDID:
            return et.isUserRoleDEFieldIdDirty();
        case INDEX_USERROLEDEFIELDNAME:
            return et.isUserRoleDEFieldNameDirty();
        case INDEX_USERROLEDEFIELDSID:
            return et.isUserRoleDEFieldsIdDirty();
        case INDEX_USERROLEDEFIELDSNAME:
            return et.isUserRoleDEFieldsNameDirty();
        case INDEX_USERROLEID:
            return et.isUserRoleIdDirty();
        case INDEX_USERROLENAME:
            return et.isUserRoleNameDirty();
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
    private static  void fillJSONObject(UserRoleDEFieldsBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserRoleDEFieldId()!=null) {
            json.put("userroledefieldid", getJSONValue(et.getUserRoleDEFieldId()));
        }
        if(bIncEmpty||et.getUserRoleDEFieldName()!=null) {
            json.put("userroledefieldname", getJSONValue(et.getUserRoleDEFieldName()));
        }
        if(bIncEmpty||et.getUserRoleDEFieldsId()!=null) {
            json.put("userroledefieldsid", getJSONValue(et.getUserRoleDEFieldsId()));
        }
        if(bIncEmpty||et.getUserRoleDEFieldsName()!=null) {
            json.put("userroledefieldsname", getJSONValue(et.getUserRoleDEFieldsName()));
        }
        if(bIncEmpty||et.getUserRoleId()!=null) {
            json.put("userroleid", getJSONValue(et.getUserRoleId()));
        }
        if(bIncEmpty||et.getUserRoleName()!=null) {
            json.put("userrolename", getJSONValue(et.getUserRoleName()));
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
    private static void fillXmlNode(UserRoleDEFieldsBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDEFieldId()!=null) {
            Object obj = et.getUserRoleDEFieldId();
            node.setAttribute("USERROLEDEFIELDID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDEFieldName()!=null) {
            Object obj = et.getUserRoleDEFieldName();
            node.setAttribute("USERROLEDEFIELDNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDEFieldsId()!=null) {
            Object obj = et.getUserRoleDEFieldsId();
            node.setAttribute("USERROLEDEFIELDSID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDEFieldsName()!=null) {
            Object obj = et.getUserRoleDEFieldsName();
            node.setAttribute("USERROLEDEFIELDSNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleId()!=null) {
            Object obj = et.getUserRoleId();
            node.setAttribute("USERROLEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleName()!=null) {
            Object obj = et.getUserRoleName();
            node.setAttribute("USERROLENAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        UserRoleDEFieldsBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserRoleDEFieldsBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isUserRoleDEFieldIdDirty() && (bIncEmpty||et.getUserRoleDEFieldId()!=null)) {
            Object obj = et.getUserRoleDEFieldId();
            if(obj==null) {
                dst.set(FIELD_USERROLEDEFIELDID,null);
            } else {
                dst.set(FIELD_USERROLEDEFIELDID,obj);
            }
        }
        if(et.isUserRoleDEFieldNameDirty() && (bIncEmpty||et.getUserRoleDEFieldName()!=null)) {
            Object obj = et.getUserRoleDEFieldName();
            if(obj==null) {
                dst.set(FIELD_USERROLEDEFIELDNAME,null);
            } else {
                dst.set(FIELD_USERROLEDEFIELDNAME,obj);
            }
        }
        if(et.isUserRoleDEFieldsIdDirty() && (bIncEmpty||et.getUserRoleDEFieldsId()!=null)) {
            Object obj = et.getUserRoleDEFieldsId();
            if(obj==null) {
                dst.set(FIELD_USERROLEDEFIELDSID,null);
            } else {
                dst.set(FIELD_USERROLEDEFIELDSID,obj);
            }
        }
        if(et.isUserRoleDEFieldsNameDirty() && (bIncEmpty||et.getUserRoleDEFieldsName()!=null)) {
            Object obj = et.getUserRoleDEFieldsName();
            if(obj==null) {
                dst.set(FIELD_USERROLEDEFIELDSNAME,null);
            } else {
                dst.set(FIELD_USERROLEDEFIELDSNAME,obj);
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
        return  UserRoleDEFieldsBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserRoleDEFieldsBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERROLEDEFIELDID:
            et.resetUserRoleDEFieldId();
            return true;
        case INDEX_USERROLEDEFIELDNAME:
            et.resetUserRoleDEFieldName();
            return true;
        case INDEX_USERROLEDEFIELDSID:
            et.resetUserRoleDEFieldsId();
            return true;
        case INDEX_USERROLEDEFIELDSNAME:
            et.resetUserRoleDEFieldsName();
            return true;
        case INDEX_USERROLEID:
            et.resetUserRoleId();
            return true;
        case INDEX_USERROLENAME:
            et.resetUserRoleName();
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

    private Object objUserRoleDEFieldLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.UserRoleDEField userroledefield = null;
    /**
    * 获取父数据 用户角色实体属性访问
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.UserRoleDEField getUserRoleDEField() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDEField();
        }

        if(this.getUserRoleDEFieldId()==null)
            return null;
        synchronized(objUserRoleDEFieldLock) {
            if(userroledefield==null) {
                userroledefield = new net.ibizsys.psrt.srv.common.entity.UserRoleDEField();
                userroledefield.setUserRoleDEFieldId(this.getUserRoleDEFieldId());
                net.ibizsys.psrt.srv.common.service.UserRoleDEFieldService service = (net.ibizsys.psrt.srv.common.service.UserRoleDEFieldService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserRoleDEFieldService.class,this.getSessionFactory());
                if(this.getUserRoleDEFieldId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(userroledefield);
                else
                    service.get(userroledefield);
            }
            return userroledefield;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private UserRoleDEFieldsBase getProxyEntity() {
        return this.proxyUserRoleDEFieldsBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserRoleDEFieldsBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserRoleDEFieldsBase) {
            this.proxyUserRoleDEFieldsBase = (UserRoleDEFieldsBase)proxyDataObject;
        }

    }

}