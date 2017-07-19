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
 * 实体[UserRoleDetail] 数据对象基类
 */
public abstract class UserRoleDetailBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[用户角色]
     */
    public final static String FIELD_USERROLENAME = "UESRROLENAME";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[用户数据]
     */
    public final static String FIELD_USERDATA = "USERDATA";
    /**
     *   实体属性标识[用户数据2]
     */
    public final static String FIELD_USERDATA2 = "USERDATA2";
    /**
     *   实体属性标识[用户对象]
     */
    public final static String FIELD_USEROBJECTID = "USEROBJECTID";
    /**
     *   实体属性标识[用户对象]
     */
    public final static String FIELD_USEROBJECTNAME = "USEROBJECTNAME";
    /**
     *   实体属性标识[用户角色成员标识]
     */
    public final static String FIELD_USERROLEDETAILID = "USERROLEDETAILID";
    /**
     *   实体属性标识[用户角色成员名称]
     */
    public final static String FIELD_USERROLEDETAILNAME = "USERROLEDETAILNAME";
    /**
     *   实体属性标识[用户角色]
     */
    public final static String FIELD_USERROLEID = "USERROLEID";
    /**
     *   实体属性标识[用户自定义]
     */
    public final static String FIELD_USERTAG = "USERTAG";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_USERROLENAME = 2;
    private final static int INDEX_UPDATEDATE = 3;
    private final static int INDEX_UPDATEMAN = 4;
    private final static int INDEX_USERDATA = 5;
    private final static int INDEX_USERDATA2 = 6;
    private final static int INDEX_USEROBJECTID = 7;
    private final static int INDEX_USEROBJECTNAME = 8;
    private final static int INDEX_USERROLEDETAILID = 9;
    private final static int INDEX_USERROLEDETAILNAME = 10;
    private final static int INDEX_USERROLEID = 11;
    private final static int INDEX_USERTAG = 12;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_USERROLENAME, INDEX_USERROLENAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
        fieldIndexMap.put( FIELD_USEROBJECTID, INDEX_USEROBJECTID);
        fieldIndexMap.put( FIELD_USEROBJECTNAME, INDEX_USEROBJECTNAME);
        fieldIndexMap.put( FIELD_USERROLEDETAILID, INDEX_USERROLEDETAILID);
        fieldIndexMap.put( FIELD_USERROLEDETAILNAME, INDEX_USERROLEDETAILNAME);
        fieldIndexMap.put( FIELD_USERROLEID, INDEX_USERROLEID);
        fieldIndexMap.put( FIELD_USERTAG, INDEX_USERTAG);
    }

    private UserRoleDetailBase proxyUserRoleDetailBase = null;

    public UserRoleDetailBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean userrolenameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;
    private boolean userobjectidDirtyFlag = false;
    private boolean userobjectnameDirtyFlag = false;
    private boolean userroledetailidDirtyFlag = false;
    private boolean userroledetailnameDirtyFlag = false;
    private boolean userroleidDirtyFlag = false;
    private boolean usertagDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="userrolename")
    private String userrolename;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdata")
    private String userdata;
    @Column(name="userdata2")
    private String userdata2;
    @Column(name="userobjectid")
    private String userobjectid;
    @Column(name="userobjectname")
    private String userobjectname;
    @Column(name="userroledetailid")
    private String userroledetailid;
    @Column(name="userroledetailname")
    private String userroledetailname;
    @Column(name="userroleid")
    private String userroleid;
    @Column(name="usertag")
    private String usertag;


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
     *  设置属性值[用户数据]
     *  @param userdata
     */
    public void setUserData(String userdata) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData(userdata);
            return;
        }
        if(userdata!=null) {
            userdata = StringHelper.trimRight(userdata);
            if(userdata.length()==0) {
                userdata = null;
            }
        }
        this.userdata =  userdata;
        this.userdataDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据]
     */
    public String getUserData() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData();
        }
        return this.userdata;
    }

    /**
     *  获取属性值[用户数据]是否修改
     */
    public boolean isUserDataDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDataDirty();
        }
        return this.userdataDirtyFlag;
    }

    /**
     *  重置属性值[用户数据]
     */
    public void resetUserData() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData();
            return;
        }

        this.userdataDirtyFlag = false;
        this.userdata = null;
    }
    /**
     *  设置属性值[用户数据2]
     *  @param userdata2
     */
    public void setUserData2(String userdata2) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData2(userdata2);
            return;
        }
        if(userdata2!=null) {
            userdata2 = StringHelper.trimRight(userdata2);
            if(userdata2.length()==0) {
                userdata2 = null;
            }
        }
        this.userdata2 =  userdata2;
        this.userdata2DirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据2]
     */
    public String getUserData2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData2();
        }
        return this.userdata2;
    }

    /**
     *  获取属性值[用户数据2]是否修改
     */
    public boolean isUserData2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserData2Dirty();
        }
        return this.userdata2DirtyFlag;
    }

    /**
     *  重置属性值[用户数据2]
     */
    public void resetUserData2() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData2();
            return;
        }

        this.userdata2DirtyFlag = false;
        this.userdata2 = null;
    }
    /**
     *  设置属性值[用户对象]
     *  @param userobjectid
     */
    public void setUserObjectId(String userobjectid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserObjectId(userobjectid);
            return;
        }
        if(userobjectid!=null) {
            userobjectid = StringHelper.trimRight(userobjectid);
            if(userobjectid.length()==0) {
                userobjectid = null;
            }
        }
        this.userobjectid =  userobjectid;
        this.userobjectidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户对象]
     */
    public String getUserObjectId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserObjectId();
        }
        return this.userobjectid;
    }

    /**
     *  获取属性值[用户对象]是否修改
     */
    public boolean isUserObjectIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserObjectIdDirty();
        }
        return this.userobjectidDirtyFlag;
    }

    /**
     *  重置属性值[用户对象]
     */
    public void resetUserObjectId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserObjectId();
            return;
        }

        this.userobjectidDirtyFlag = false;
        this.userobjectid = null;
    }
    /**
     *  设置属性值[用户对象]
     *  @param userobjectname
     */
    public void setUserObjectName(String userobjectname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserObjectName(userobjectname);
            return;
        }
        if(userobjectname!=null) {
            userobjectname = StringHelper.trimRight(userobjectname);
            if(userobjectname.length()==0) {
                userobjectname = null;
            }
        }
        this.userobjectname =  userobjectname;
        this.userobjectnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户对象]
     */
    public String getUserObjectName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserObjectName();
        }
        return this.userobjectname;
    }

    /**
     *  获取属性值[用户对象]是否修改
     */
    public boolean isUserObjectNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserObjectNameDirty();
        }
        return this.userobjectnameDirtyFlag;
    }

    /**
     *  重置属性值[用户对象]
     */
    public void resetUserObjectName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserObjectName();
            return;
        }

        this.userobjectnameDirtyFlag = false;
        this.userobjectname = null;
    }
    /**
     *  设置属性值[用户角色成员标识]
     *  @param userroledetailid
     */
    public void setUserRoleDetailId(String userroledetailid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDetailId(userroledetailid);
            return;
        }
        if(userroledetailid!=null) {
            userroledetailid = StringHelper.trimRight(userroledetailid);
            if(userroledetailid.length()==0) {
                userroledetailid = null;
            }
        }
        this.userroledetailid =  userroledetailid;
        this.userroledetailidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色成员标识]
     */
    public String getUserRoleDetailId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDetailId();
        }
        return this.userroledetailid;
    }

    /**
     *  获取属性值[用户角色成员标识]是否修改
     */
    public boolean isUserRoleDetailIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDetailIdDirty();
        }
        return this.userroledetailidDirtyFlag;
    }

    /**
     *  重置属性值[用户角色成员标识]
     */
    public void resetUserRoleDetailId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDetailId();
            return;
        }

        this.userroledetailidDirtyFlag = false;
        this.userroledetailid = null;
    }
    /**
     *  设置属性值[用户角色成员名称]
     *  @param userroledetailname
     */
    public void setUserRoleDetailName(String userroledetailname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDetailName(userroledetailname);
            return;
        }
        if(userroledetailname!=null) {
            userroledetailname = StringHelper.trimRight(userroledetailname);
            if(userroledetailname.length()==0) {
                userroledetailname = null;
            }
        }
        this.userroledetailname =  userroledetailname;
        this.userroledetailnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色成员名称]
     */
    public String getUserRoleDetailName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDetailName();
        }
        return this.userroledetailname;
    }

    /**
     *  获取属性值[用户角色成员名称]是否修改
     */
    public boolean isUserRoleDetailNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDetailNameDirty();
        }
        return this.userroledetailnameDirtyFlag;
    }

    /**
     *  重置属性值[用户角色成员名称]
     */
    public void resetUserRoleDetailName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDetailName();
            return;
        }

        this.userroledetailnameDirtyFlag = false;
        this.userroledetailname = null;
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
     *  设置属性值[用户自定义]
     *  @param usertag
     */
    public void setUserTag(String usertag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserTag(usertag);
            return;
        }
        if(usertag!=null) {
            usertag = StringHelper.trimRight(usertag);
            if(usertag.length()==0) {
                usertag = null;
            }
        }
        this.usertag =  usertag;
        this.usertagDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户自定义]
     */
    public String getUserTag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserTag();
        }
        return this.usertag;
    }

    /**
     *  获取属性值[用户自定义]是否修改
     */
    public boolean isUserTagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserTagDirty();
        }
        return this.usertagDirtyFlag;
    }

    /**
     *  重置属性值[用户自定义]
     */
    public void resetUserTag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserTag();
            return;
        }

        this.usertagDirtyFlag = false;
        this.usertag = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        UserRoleDetailBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserRoleDetailBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetUserRoleName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserData();
        et.resetUserData2();
        et.resetUserObjectId();
        et.resetUserObjectName();
        et.resetUserRoleDetailId();
        et.resetUserRoleDetailName();
        et.resetUserRoleId();
        et.resetUserTag();
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
        if(!bDirtyOnly || isUserRoleNameDirty()) {
            params.put(FIELD_USERROLENAME,getUserRoleName());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserDataDirty()) {
            params.put(FIELD_USERDATA,getUserData());
        }
        if(!bDirtyOnly || isUserData2Dirty()) {
            params.put(FIELD_USERDATA2,getUserData2());
        }
        if(!bDirtyOnly || isUserObjectIdDirty()) {
            params.put(FIELD_USEROBJECTID,getUserObjectId());
        }
        if(!bDirtyOnly || isUserObjectNameDirty()) {
            params.put(FIELD_USEROBJECTNAME,getUserObjectName());
        }
        if(!bDirtyOnly || isUserRoleDetailIdDirty()) {
            params.put(FIELD_USERROLEDETAILID,getUserRoleDetailId());
        }
        if(!bDirtyOnly || isUserRoleDetailNameDirty()) {
            params.put(FIELD_USERROLEDETAILNAME,getUserRoleDetailName());
        }
        if(!bDirtyOnly || isUserRoleIdDirty()) {
            params.put(FIELD_USERROLEID,getUserRoleId());
        }
        if(!bDirtyOnly || isUserTagDirty()) {
            params.put(FIELD_USERTAG,getUserTag());
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

        return  UserRoleDetailBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserRoleDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_USERROLENAME:
            return et.getUserRoleName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDATA:
            return et.getUserData();
        case INDEX_USERDATA2:
            return et.getUserData2();
        case INDEX_USEROBJECTID:
            return et.getUserObjectId();
        case INDEX_USEROBJECTNAME:
            return et.getUserObjectName();
        case INDEX_USERROLEDETAILID:
            return et.getUserRoleDetailId();
        case INDEX_USERROLEDETAILNAME:
            return et.getUserRoleDetailName();
        case INDEX_USERROLEID:
            return et.getUserRoleId();
        case INDEX_USERTAG:
            return et.getUserTag();
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

        UserRoleDetailBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserRoleDetailBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLENAME:
            et.setUserRoleName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDATA:
            et.setUserData(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDATA2:
            et.setUserData2(DataObject.getStringValue(obj));
            return ;
        case INDEX_USEROBJECTID:
            et.setUserObjectId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USEROBJECTNAME:
            et.setUserObjectName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDETAILID:
            et.setUserRoleDetailId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDETAILNAME:
            et.setUserRoleDetailName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEID:
            et.setUserRoleId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERTAG:
            et.setUserTag(DataObject.getStringValue(obj));
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

        return  UserRoleDetailBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserRoleDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_USERROLENAME:
            return et.getUserRoleName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDATA:
            return et.getUserData()==null;
        case INDEX_USERDATA2:
            return et.getUserData2()==null;
        case INDEX_USEROBJECTID:
            return et.getUserObjectId()==null;
        case INDEX_USEROBJECTNAME:
            return et.getUserObjectName()==null;
        case INDEX_USERROLEDETAILID:
            return et.getUserRoleDetailId()==null;
        case INDEX_USERROLEDETAILNAME:
            return et.getUserRoleDetailName()==null;
        case INDEX_USERROLEID:
            return et.getUserRoleId()==null;
        case INDEX_USERTAG:
            return et.getUserTag()==null;
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

        return  UserRoleDetailBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserRoleDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_USERROLENAME:
            return et.isUserRoleNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDATA:
            return et.isUserDataDirty();
        case INDEX_USERDATA2:
            return et.isUserData2Dirty();
        case INDEX_USEROBJECTID:
            return et.isUserObjectIdDirty();
        case INDEX_USEROBJECTNAME:
            return et.isUserObjectNameDirty();
        case INDEX_USERROLEDETAILID:
            return et.isUserRoleDetailIdDirty();
        case INDEX_USERROLEDETAILNAME:
            return et.isUserRoleDetailNameDirty();
        case INDEX_USERROLEID:
            return et.isUserRoleIdDirty();
        case INDEX_USERTAG:
            return et.isUserTagDirty();
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
    private static  void fillJSONObject(UserRoleDetailBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getUserRoleName()!=null) {
            json.put("uesrrolename", getJSONValue(et.getUserRoleName()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserData()!=null) {
            json.put("userdata", getJSONValue(et.getUserData()));
        }
        if(bIncEmpty||et.getUserData2()!=null) {
            json.put("userdata2", getJSONValue(et.getUserData2()));
        }
        if(bIncEmpty||et.getUserObjectId()!=null) {
            json.put("userobjectid", getJSONValue(et.getUserObjectId()));
        }
        if(bIncEmpty||et.getUserObjectName()!=null) {
            json.put("userobjectname", getJSONValue(et.getUserObjectName()));
        }
        if(bIncEmpty||et.getUserRoleDetailId()!=null) {
            json.put("userroledetailid", getJSONValue(et.getUserRoleDetailId()));
        }
        if(bIncEmpty||et.getUserRoleDetailName()!=null) {
            json.put("userroledetailname", getJSONValue(et.getUserRoleDetailName()));
        }
        if(bIncEmpty||et.getUserRoleId()!=null) {
            json.put("userroleid", getJSONValue(et.getUserRoleId()));
        }
        if(bIncEmpty||et.getUserTag()!=null) {
            json.put("usertag", getJSONValue(et.getUserTag()));
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
    private static void fillXmlNode(UserRoleDetailBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleName()!=null) {
            Object obj = et.getUserRoleName();
            node.setAttribute("USERROLENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserData()!=null) {
            Object obj = et.getUserData();
            node.setAttribute("USERDATA",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserData2()!=null) {
            Object obj = et.getUserData2();
            node.setAttribute("USERDATA2",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserObjectId()!=null) {
            Object obj = et.getUserObjectId();
            node.setAttribute("USEROBJECTID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserObjectName()!=null) {
            Object obj = et.getUserObjectName();
            node.setAttribute("USEROBJECTNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDetailId()!=null) {
            Object obj = et.getUserRoleDetailId();
            node.setAttribute("USERROLEDETAILID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDetailName()!=null) {
            Object obj = et.getUserRoleDetailName();
            node.setAttribute("USERROLEDETAILNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleId()!=null) {
            Object obj = et.getUserRoleId();
            node.setAttribute("USERROLEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserTag()!=null) {
            Object obj = et.getUserTag();
            node.setAttribute("USERTAG",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        UserRoleDetailBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserRoleDetailBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isUserRoleNameDirty() && (bIncEmpty||et.getUserRoleName()!=null)) {
            Object obj = et.getUserRoleName();
            if(obj==null) {
                dst.set(FIELD_USERROLENAME,null);
            } else {
                dst.set(FIELD_USERROLENAME,obj);
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
        if(et.isUserDataDirty() && (bIncEmpty||et.getUserData()!=null)) {
            Object obj = et.getUserData();
            if(obj==null) {
                dst.set(FIELD_USERDATA,null);
            } else {
                dst.set(FIELD_USERDATA,obj);
            }
        }
        if(et.isUserData2Dirty() && (bIncEmpty||et.getUserData2()!=null)) {
            Object obj = et.getUserData2();
            if(obj==null) {
                dst.set(FIELD_USERDATA2,null);
            } else {
                dst.set(FIELD_USERDATA2,obj);
            }
        }
        if(et.isUserObjectIdDirty() && (bIncEmpty||et.getUserObjectId()!=null)) {
            Object obj = et.getUserObjectId();
            if(obj==null) {
                dst.set(FIELD_USEROBJECTID,null);
            } else {
                dst.set(FIELD_USEROBJECTID,obj);
            }
        }
        if(et.isUserObjectNameDirty() && (bIncEmpty||et.getUserObjectName()!=null)) {
            Object obj = et.getUserObjectName();
            if(obj==null) {
                dst.set(FIELD_USEROBJECTNAME,null);
            } else {
                dst.set(FIELD_USEROBJECTNAME,obj);
            }
        }
        if(et.isUserRoleDetailIdDirty() && (bIncEmpty||et.getUserRoleDetailId()!=null)) {
            Object obj = et.getUserRoleDetailId();
            if(obj==null) {
                dst.set(FIELD_USERROLEDETAILID,null);
            } else {
                dst.set(FIELD_USERROLEDETAILID,obj);
            }
        }
        if(et.isUserRoleDetailNameDirty() && (bIncEmpty||et.getUserRoleDetailName()!=null)) {
            Object obj = et.getUserRoleDetailName();
            if(obj==null) {
                dst.set(FIELD_USERROLEDETAILNAME,null);
            } else {
                dst.set(FIELD_USERROLEDETAILNAME,obj);
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
        if(et.isUserTagDirty() && (bIncEmpty||et.getUserTag()!=null)) {
            Object obj = et.getUserTag();
            if(obj==null) {
                dst.set(FIELD_USERTAG,null);
            } else {
                dst.set(FIELD_USERTAG,obj);
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
        return  UserRoleDetailBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserRoleDetailBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_USERROLENAME:
            et.resetUserRoleName();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERDATA:
            et.resetUserData();
            return true;
        case INDEX_USERDATA2:
            et.resetUserData2();
            return true;
        case INDEX_USEROBJECTID:
            et.resetUserObjectId();
            return true;
        case INDEX_USEROBJECTNAME:
            et.resetUserObjectName();
            return true;
        case INDEX_USERROLEDETAILID:
            et.resetUserRoleDetailId();
            return true;
        case INDEX_USERROLEDETAILNAME:
            et.resetUserRoleDetailName();
            return true;
        case INDEX_USERROLEID:
            et.resetUserRoleId();
            return true;
        case INDEX_USERTAG:
            et.resetUserTag();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }




    private Object objUserObjectLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.UserObject userobject = null;
    /**
    * 获取父数据 用户对象
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.UserObject getUserObject() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserObject();
        }

        if(this.getUserObjectId()==null)
            return null;
        synchronized(objUserObjectLock) {
            if(userobject==null) {
                userobject = new net.ibizsys.psrt.srv.common.entity.UserObject();
                userobject.setUserObjectId(this.getUserObjectId());
                net.ibizsys.psrt.srv.common.service.UserObjectService service = (net.ibizsys.psrt.srv.common.service.UserObjectService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserObjectService.class,this.getSessionFactory());
                if(this.getUserObjectId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(userobject);
                else
                    service.get(userobject);
            }
            return userobject;
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




    /**
     *  获取代理的数据对象
     */
    private UserRoleDetailBase getProxyEntity() {
        return this.proxyUserRoleDetailBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserRoleDetailBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserRoleDetailBase) {
            this.proxyUserRoleDetailBase = (UserRoleDetailBase)proxyDataObject;
        }

    }

}