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
 * 实体[UserRoleDatas] 数据对象基类
 */
public abstract class UserRoleDatasBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[数据对象]
     */
    public final static String FIELD_DENAME = "DENAME";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[实体数据角色能力]
     */
    public final static String FIELD_USERROLEDATAID = "USERROLEDATAID";
    /**
     *   实体属性标识[实体数据能力]
     */
    public final static String FIELD_USERROLEDATANAME = "USERROLEDATANAME";
    /**
     *   实体属性标识[用户角色数据能力标识]
     */
    public final static String FIELD_USERROLEDATASID = "USERROLEDATASID";
    /**
     *   实体属性标识[用户角色数据能力名称]
     */
    public final static String FIELD_USERROLEDATASNAME = "USERROLEDATASNAME";
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
    private final static int INDEX_DENAME = 2;
    private final static int INDEX_UPDATEDATE = 3;
    private final static int INDEX_UPDATEMAN = 4;
    private final static int INDEX_USERROLEDATAID = 5;
    private final static int INDEX_USERROLEDATANAME = 6;
    private final static int INDEX_USERROLEDATASID = 7;
    private final static int INDEX_USERROLEDATASNAME = 8;
    private final static int INDEX_USERROLEID = 9;
    private final static int INDEX_USERROLENAME = 10;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DENAME, INDEX_DENAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERROLEDATAID, INDEX_USERROLEDATAID);
        fieldIndexMap.put( FIELD_USERROLEDATANAME, INDEX_USERROLEDATANAME);
        fieldIndexMap.put( FIELD_USERROLEDATASID, INDEX_USERROLEDATASID);
        fieldIndexMap.put( FIELD_USERROLEDATASNAME, INDEX_USERROLEDATASNAME);
        fieldIndexMap.put( FIELD_USERROLEID, INDEX_USERROLEID);
        fieldIndexMap.put( FIELD_USERROLENAME, INDEX_USERROLENAME);
    }

    private UserRoleDatasBase proxyUserRoleDatasBase = null;

    public UserRoleDatasBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean denameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userroledataidDirtyFlag = false;
    private boolean userroledatanameDirtyFlag = false;
    private boolean userroledatasidDirtyFlag = false;
    private boolean userroledatasnameDirtyFlag = false;
    private boolean userroleidDirtyFlag = false;
    private boolean userrolenameDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="dename")
    private String dename;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userroledataid")
    private String userroledataid;
    @Column(name="userroledataname")
    private String userroledataname;
    @Column(name="userroledatasid")
    private String userroledatasid;
    @Column(name="userroledatasname")
    private String userroledatasname;
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
     *  设置属性值[数据对象]
     *  @param dename
     */
    public void setDEName(String dename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDEName(dename);
            return;
        }
        if(dename!=null) {
            dename = StringHelper.trimRight(dename);
            if(dename.length()==0) {
                dename = null;
            }
        }
        this.dename =  dename;
        this.denameDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据对象]
     */
    public String getDEName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEName();
        }
        return this.dename;
    }

    /**
     *  获取属性值[数据对象]是否修改
     */
    public boolean isDENameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDENameDirty();
        }
        return this.denameDirtyFlag;
    }

    /**
     *  重置属性值[数据对象]
     */
    public void resetDEName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDEName();
            return;
        }

        this.denameDirtyFlag = false;
        this.dename = null;
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
     *  设置属性值[实体数据角色能力]
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
     *  获取属性值[实体数据角色能力]
     */
    public String getUserRoleDataId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataId();
        }
        return this.userroledataid;
    }

    /**
     *  获取属性值[实体数据角色能力]是否修改
     */
    public boolean isUserRoleDataIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataIdDirty();
        }
        return this.userroledataidDirtyFlag;
    }

    /**
     *  重置属性值[实体数据角色能力]
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
     *  设置属性值[实体数据能力]
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
     *  获取属性值[实体数据能力]
     */
    public String getUserRoleDataName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataName();
        }
        return this.userroledataname;
    }

    /**
     *  获取属性值[实体数据能力]是否修改
     */
    public boolean isUserRoleDataNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataNameDirty();
        }
        return this.userroledatanameDirtyFlag;
    }

    /**
     *  重置属性值[实体数据能力]
     */
    public void resetUserRoleDataName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDataName();
            return;
        }

        this.userroledatanameDirtyFlag = false;
        this.userroledataname = null;
    }
    /**
     *  设置属性值[用户角色数据能力标识]
     *  @param userroledatasid
     */
    public void setUserRoleDatasId(String userroledatasid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDatasId(userroledatasid);
            return;
        }
        if(userroledatasid!=null) {
            userroledatasid = StringHelper.trimRight(userroledatasid);
            if(userroledatasid.length()==0) {
                userroledatasid = null;
            }
        }
        this.userroledatasid =  userroledatasid;
        this.userroledatasidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色数据能力标识]
     */
    public String getUserRoleDatasId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDatasId();
        }
        return this.userroledatasid;
    }

    /**
     *  获取属性值[用户角色数据能力标识]是否修改
     */
    public boolean isUserRoleDatasIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDatasIdDirty();
        }
        return this.userroledatasidDirtyFlag;
    }

    /**
     *  重置属性值[用户角色数据能力标识]
     */
    public void resetUserRoleDatasId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDatasId();
            return;
        }

        this.userroledatasidDirtyFlag = false;
        this.userroledatasid = null;
    }
    /**
     *  设置属性值[用户角色数据能力名称]
     *  @param userroledatasname
     */
    public void setUserRoleDatasName(String userroledatasname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDatasName(userroledatasname);
            return;
        }
        if(userroledatasname!=null) {
            userroledatasname = StringHelper.trimRight(userroledatasname);
            if(userroledatasname.length()==0) {
                userroledatasname = null;
            }
        }
        this.userroledatasname =  userroledatasname;
        this.userroledatasnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户角色数据能力名称]
     */
    public String getUserRoleDatasName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDatasName();
        }
        return this.userroledatasname;
    }

    /**
     *  获取属性值[用户角色数据能力名称]是否修改
     */
    public boolean isUserRoleDatasNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDatasNameDirty();
        }
        return this.userroledatasnameDirtyFlag;
    }

    /**
     *  重置属性值[用户角色数据能力名称]
     */
    public void resetUserRoleDatasName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDatasName();
            return;
        }

        this.userroledatasnameDirtyFlag = false;
        this.userroledatasname = null;
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
        UserRoleDatasBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserRoleDatasBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDEName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserRoleDataId();
        et.resetUserRoleDataName();
        et.resetUserRoleDatasId();
        et.resetUserRoleDatasName();
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
        if(!bDirtyOnly || isDENameDirty()) {
            params.put(FIELD_DENAME,getDEName());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserRoleDataIdDirty()) {
            params.put(FIELD_USERROLEDATAID,getUserRoleDataId());
        }
        if(!bDirtyOnly || isUserRoleDataNameDirty()) {
            params.put(FIELD_USERROLEDATANAME,getUserRoleDataName());
        }
        if(!bDirtyOnly || isUserRoleDatasIdDirty()) {
            params.put(FIELD_USERROLEDATASID,getUserRoleDatasId());
        }
        if(!bDirtyOnly || isUserRoleDatasNameDirty()) {
            params.put(FIELD_USERROLEDATASNAME,getUserRoleDatasName());
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

        return  UserRoleDatasBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserRoleDatasBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DENAME:
            return et.getDEName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERROLEDATAID:
            return et.getUserRoleDataId();
        case INDEX_USERROLEDATANAME:
            return et.getUserRoleDataName();
        case INDEX_USERROLEDATASID:
            return et.getUserRoleDatasId();
        case INDEX_USERROLEDATASNAME:
            return et.getUserRoleDatasName();
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

        UserRoleDatasBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserRoleDatasBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DENAME:
            et.setDEName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATAID:
            et.setUserRoleDataId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATANAME:
            et.setUserRoleDataName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATASID:
            et.setUserRoleDatasId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDATASNAME:
            et.setUserRoleDatasName(DataObject.getStringValue(obj));
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

        return  UserRoleDatasBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserRoleDatasBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DENAME:
            return et.getDEName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERROLEDATAID:
            return et.getUserRoleDataId()==null;
        case INDEX_USERROLEDATANAME:
            return et.getUserRoleDataName()==null;
        case INDEX_USERROLEDATASID:
            return et.getUserRoleDatasId()==null;
        case INDEX_USERROLEDATASNAME:
            return et.getUserRoleDatasName()==null;
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

        return  UserRoleDatasBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserRoleDatasBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DENAME:
            return et.isDENameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERROLEDATAID:
            return et.isUserRoleDataIdDirty();
        case INDEX_USERROLEDATANAME:
            return et.isUserRoleDataNameDirty();
        case INDEX_USERROLEDATASID:
            return et.isUserRoleDatasIdDirty();
        case INDEX_USERROLEDATASNAME:
            return et.isUserRoleDatasNameDirty();
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
    private static  void fillJSONObject(UserRoleDatasBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getDEName()!=null) {
            json.put("dename", getJSONValue(et.getDEName()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserRoleDataId()!=null) {
            json.put("userroledataid", getJSONValue(et.getUserRoleDataId()));
        }
        if(bIncEmpty||et.getUserRoleDataName()!=null) {
            json.put("userroledataname", getJSONValue(et.getUserRoleDataName()));
        }
        if(bIncEmpty||et.getUserRoleDatasId()!=null) {
            json.put("userroledatasid", getJSONValue(et.getUserRoleDatasId()));
        }
        if(bIncEmpty||et.getUserRoleDatasName()!=null) {
            json.put("userroledatasname", getJSONValue(et.getUserRoleDatasName()));
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
    private static void fillXmlNode(UserRoleDatasBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEName()!=null) {
            Object obj = et.getDEName();
            node.setAttribute("DENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDataId()!=null) {
            Object obj = et.getUserRoleDataId();
            node.setAttribute("USERROLEDATAID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDataName()!=null) {
            Object obj = et.getUserRoleDataName();
            node.setAttribute("USERROLEDATANAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDatasId()!=null) {
            Object obj = et.getUserRoleDatasId();
            node.setAttribute("USERROLEDATASID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDatasName()!=null) {
            Object obj = et.getUserRoleDatasName();
            node.setAttribute("USERROLEDATASNAME",(obj==null)?"":(String)obj);
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
        UserRoleDatasBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserRoleDatasBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isDENameDirty() && (bIncEmpty||et.getDEName()!=null)) {
            Object obj = et.getDEName();
            if(obj==null) {
                dst.set(FIELD_DENAME,null);
            } else {
                dst.set(FIELD_DENAME,obj);
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
        if(et.isUserRoleDatasIdDirty() && (bIncEmpty||et.getUserRoleDatasId()!=null)) {
            Object obj = et.getUserRoleDatasId();
            if(obj==null) {
                dst.set(FIELD_USERROLEDATASID,null);
            } else {
                dst.set(FIELD_USERROLEDATASID,obj);
            }
        }
        if(et.isUserRoleDatasNameDirty() && (bIncEmpty||et.getUserRoleDatasName()!=null)) {
            Object obj = et.getUserRoleDatasName();
            if(obj==null) {
                dst.set(FIELD_USERROLEDATASNAME,null);
            } else {
                dst.set(FIELD_USERROLEDATASNAME,obj);
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
        return  UserRoleDatasBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserRoleDatasBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DENAME:
            et.resetDEName();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERROLEDATAID:
            et.resetUserRoleDataId();
            return true;
        case INDEX_USERROLEDATANAME:
            et.resetUserRoleDataName();
            return true;
        case INDEX_USERROLEDATASID:
            et.resetUserRoleDatasId();
            return true;
        case INDEX_USERROLEDATASNAME:
            et.resetUserRoleDatasName();
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
    private UserRoleDatasBase getProxyEntity() {
        return this.proxyUserRoleDatasBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserRoleDatasBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserRoleDatasBase) {
            this.proxyUserRoleDatasBase = (UserRoleDatasBase)proxyDataObject;
        }

    }

}