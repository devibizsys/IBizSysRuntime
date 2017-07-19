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
 * 实体[Org] 数据对象基类
 */
public abstract class OrgBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[级别编码]
     */
    public final static String FIELD_LEVELCODE = "LEVELCODE";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[组织编号]
     */
    public final static String FIELD_ORGCODE = "ORGCODE";
    /**
     *   实体属性标识[组织机构标识]
     */
    public final static String FIELD_ORGID = "ORGID";
    /**
     *   实体属性标识[组织机构名称]
     */
    public final static String FIELD_ORGNAME = "ORGNAME";
    /**
     *   实体属性标识[组织机构]
     */
    public final static String FIELD_PORGID = "PORGID";
    /**
     *   实体属性标识[上级机构]
     */
    public final static String FIELD_PORGNAME = "PORGNAME";
    /**
     *   实体属性标识[简称]
     */
    public final static String FIELD_SHORTNAME = "SHORTNAME";
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

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_LEVELCODE = 2;
    private final static int INDEX_MEMO = 3;
    private final static int INDEX_ORGCODE = 4;
    private final static int INDEX_ORGID = 5;
    private final static int INDEX_ORGNAME = 6;
    private final static int INDEX_PORGID = 7;
    private final static int INDEX_PORGNAME = 8;
    private final static int INDEX_SHORTNAME = 9;
    private final static int INDEX_UPDATEDATE = 10;
    private final static int INDEX_UPDATEMAN = 11;
    private final static int INDEX_USERDATA = 12;
    private final static int INDEX_USERDATA2 = 13;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_LEVELCODE, INDEX_LEVELCODE);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORGCODE, INDEX_ORGCODE);
        fieldIndexMap.put( FIELD_ORGID, INDEX_ORGID);
        fieldIndexMap.put( FIELD_ORGNAME, INDEX_ORGNAME);
        fieldIndexMap.put( FIELD_PORGID, INDEX_PORGID);
        fieldIndexMap.put( FIELD_PORGNAME, INDEX_PORGNAME);
        fieldIndexMap.put( FIELD_SHORTNAME, INDEX_SHORTNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
    }

    private OrgBase proxyOrgBase = null;

    public OrgBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean levelcodeDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean orgcodeDirtyFlag = false;
    private boolean orgidDirtyFlag = false;
    private boolean orgnameDirtyFlag = false;
    private boolean porgidDirtyFlag = false;
    private boolean porgnameDirtyFlag = false;
    private boolean shortnameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="levelcode")
    private String levelcode;
    @Column(name="memo")
    private String memo;
    @Column(name="orgcode")
    private String orgcode;
    @Column(name="orgid")
    private String orgid;
    @Column(name="orgname")
    private String orgname;
    @Column(name="porgid")
    private String porgid;
    @Column(name="porgname")
    private String porgname;
    @Column(name="shortname")
    private String shortname;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdata")
    private String userdata;
    @Column(name="userdata2")
    private String userdata2;


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
     *  设置属性值[级别编码]
     *  @param levelcode
     */
    public void setLevelCode(String levelcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLevelCode(levelcode);
            return;
        }
        if(levelcode!=null) {
            levelcode = StringHelper.trimRight(levelcode);
            if(levelcode.length()==0) {
                levelcode = null;
            }
        }
        this.levelcode =  levelcode;
        this.levelcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[级别编码]
     */
    public String getLevelCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLevelCode();
        }
        return this.levelcode;
    }

    /**
     *  获取属性值[级别编码]是否修改
     */
    public boolean isLevelCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLevelCodeDirty();
        }
        return this.levelcodeDirtyFlag;
    }

    /**
     *  重置属性值[级别编码]
     */
    public void resetLevelCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLevelCode();
            return;
        }

        this.levelcodeDirtyFlag = false;
        this.levelcode = null;
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
     *  设置属性值[组织编号]
     *  @param orgcode
     */
    public void setOrgCode(String orgcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgCode(orgcode);
            return;
        }
        if(orgcode!=null) {
            orgcode = StringHelper.trimRight(orgcode);
            if(orgcode.length()==0) {
                orgcode = null;
            }
        }
        this.orgcode =  orgcode;
        this.orgcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织编号]
     */
    public String getOrgCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgCode();
        }
        return this.orgcode;
    }

    /**
     *  获取属性值[组织编号]是否修改
     */
    public boolean isOrgCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgCodeDirty();
        }
        return this.orgcodeDirtyFlag;
    }

    /**
     *  重置属性值[组织编号]
     */
    public void resetOrgCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgCode();
            return;
        }

        this.orgcodeDirtyFlag = false;
        this.orgcode = null;
    }
    /**
     *  设置属性值[组织机构标识]
     *  @param orgid
     */
    public void setOrgId(String orgid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgId(orgid);
            return;
        }
        if(orgid!=null) {
            orgid = StringHelper.trimRight(orgid);
            if(orgid.length()==0) {
                orgid = null;
            }
        }
        this.orgid =  orgid;
        this.orgidDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织机构标识]
     */
    public String getOrgId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgId();
        }
        return this.orgid;
    }

    /**
     *  获取属性值[组织机构标识]是否修改
     */
    public boolean isOrgIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgIdDirty();
        }
        return this.orgidDirtyFlag;
    }

    /**
     *  重置属性值[组织机构标识]
     */
    public void resetOrgId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgId();
            return;
        }

        this.orgidDirtyFlag = false;
        this.orgid = null;
    }
    /**
     *  设置属性值[组织机构名称]
     *  @param orgname
     */
    public void setOrgName(String orgname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgName(orgname);
            return;
        }
        if(orgname!=null) {
            orgname = StringHelper.trimRight(orgname);
            if(orgname.length()==0) {
                orgname = null;
            }
        }
        this.orgname =  orgname;
        this.orgnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织机构名称]
     */
    public String getOrgName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgName();
        }
        return this.orgname;
    }

    /**
     *  获取属性值[组织机构名称]是否修改
     */
    public boolean isOrgNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgNameDirty();
        }
        return this.orgnameDirtyFlag;
    }

    /**
     *  重置属性值[组织机构名称]
     */
    public void resetOrgName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgName();
            return;
        }

        this.orgnameDirtyFlag = false;
        this.orgname = null;
    }
    /**
     *  设置属性值[组织机构]
     *  @param porgid
     */
    public void setPOrgId(String porgid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPOrgId(porgid);
            return;
        }
        if(porgid!=null) {
            porgid = StringHelper.trimRight(porgid);
            if(porgid.length()==0) {
                porgid = null;
            }
        }
        this.porgid =  porgid;
        this.porgidDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织机构]
     */
    public String getPOrgId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgId();
        }
        return this.porgid;
    }

    /**
     *  获取属性值[组织机构]是否修改
     */
    public boolean isPOrgIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOrgIdDirty();
        }
        return this.porgidDirtyFlag;
    }

    /**
     *  重置属性值[组织机构]
     */
    public void resetPOrgId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOrgId();
            return;
        }

        this.porgidDirtyFlag = false;
        this.porgid = null;
    }
    /**
     *  设置属性值[上级机构]
     *  @param porgname
     */
    public void setPOrgName(String porgname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPOrgName(porgname);
            return;
        }
        if(porgname!=null) {
            porgname = StringHelper.trimRight(porgname);
            if(porgname.length()==0) {
                porgname = null;
            }
        }
        this.porgname =  porgname;
        this.porgnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[上级机构]
     */
    public String getPOrgName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgName();
        }
        return this.porgname;
    }

    /**
     *  获取属性值[上级机构]是否修改
     */
    public boolean isPOrgNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOrgNameDirty();
        }
        return this.porgnameDirtyFlag;
    }

    /**
     *  重置属性值[上级机构]
     */
    public void resetPOrgName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOrgName();
            return;
        }

        this.porgnameDirtyFlag = false;
        this.porgname = null;
    }
    /**
     *  设置属性值[简称]
     *  @param shortname
     */
    public void setShortName(String shortname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setShortName(shortname);
            return;
        }
        if(shortname!=null) {
            shortname = StringHelper.trimRight(shortname);
            if(shortname.length()==0) {
                shortname = null;
            }
        }
        this.shortname =  shortname;
        this.shortnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[简称]
     */
    public String getShortName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getShortName();
        }
        return this.shortname;
    }

    /**
     *  获取属性值[简称]是否修改
     */
    public boolean isShortNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isShortNameDirty();
        }
        return this.shortnameDirtyFlag;
    }

    /**
     *  重置属性值[简称]
     */
    public void resetShortName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetShortName();
            return;
        }

        this.shortnameDirtyFlag = false;
        this.shortname = null;
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

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OrgBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OrgBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetLevelCode();
        et.resetMemo();
        et.resetOrgCode();
        et.resetOrgId();
        et.resetOrgName();
        et.resetPOrgId();
        et.resetPOrgName();
        et.resetShortName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserData();
        et.resetUserData2();
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
        if(!bDirtyOnly || isLevelCodeDirty()) {
            params.put(FIELD_LEVELCODE,getLevelCode());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrgCodeDirty()) {
            params.put(FIELD_ORGCODE,getOrgCode());
        }
        if(!bDirtyOnly || isOrgIdDirty()) {
            params.put(FIELD_ORGID,getOrgId());
        }
        if(!bDirtyOnly || isOrgNameDirty()) {
            params.put(FIELD_ORGNAME,getOrgName());
        }
        if(!bDirtyOnly || isPOrgIdDirty()) {
            params.put(FIELD_PORGID,getPOrgId());
        }
        if(!bDirtyOnly || isPOrgNameDirty()) {
            params.put(FIELD_PORGNAME,getPOrgName());
        }
        if(!bDirtyOnly || isShortNameDirty()) {
            params.put(FIELD_SHORTNAME,getShortName());
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

        return  OrgBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OrgBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_LEVELCODE:
            return et.getLevelCode();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ORGCODE:
            return et.getOrgCode();
        case INDEX_ORGID:
            return et.getOrgId();
        case INDEX_ORGNAME:
            return et.getOrgName();
        case INDEX_PORGID:
            return et.getPOrgId();
        case INDEX_PORGNAME:
            return et.getPOrgName();
        case INDEX_SHORTNAME:
            return et.getShortName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDATA:
            return et.getUserData();
        case INDEX_USERDATA2:
            return et.getUserData2();
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

        OrgBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OrgBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_LEVELCODE:
            et.setLevelCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGCODE:
            et.setOrgCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGID:
            et.setOrgId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGNAME:
            et.setOrgName(DataObject.getStringValue(obj));
            return ;
        case INDEX_PORGID:
            et.setPOrgId(DataObject.getStringValue(obj));
            return ;
        case INDEX_PORGNAME:
            et.setPOrgName(DataObject.getStringValue(obj));
            return ;
        case INDEX_SHORTNAME:
            et.setShortName(DataObject.getStringValue(obj));
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

        return  OrgBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OrgBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_LEVELCODE:
            return et.getLevelCode()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ORGCODE:
            return et.getOrgCode()==null;
        case INDEX_ORGID:
            return et.getOrgId()==null;
        case INDEX_ORGNAME:
            return et.getOrgName()==null;
        case INDEX_PORGID:
            return et.getPOrgId()==null;
        case INDEX_PORGNAME:
            return et.getPOrgName()==null;
        case INDEX_SHORTNAME:
            return et.getShortName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDATA:
            return et.getUserData()==null;
        case INDEX_USERDATA2:
            return et.getUserData2()==null;
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

        return  OrgBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OrgBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_LEVELCODE:
            return et.isLevelCodeDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ORGCODE:
            return et.isOrgCodeDirty();
        case INDEX_ORGID:
            return et.isOrgIdDirty();
        case INDEX_ORGNAME:
            return et.isOrgNameDirty();
        case INDEX_PORGID:
            return et.isPOrgIdDirty();
        case INDEX_PORGNAME:
            return et.isPOrgNameDirty();
        case INDEX_SHORTNAME:
            return et.isShortNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDATA:
            return et.isUserDataDirty();
        case INDEX_USERDATA2:
            return et.isUserData2Dirty();
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
    private static  void fillJSONObject(OrgBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getLevelCode()!=null) {
            json.put("levelcode", getJSONValue(et.getLevelCode()));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            json.put("memo", getJSONValue(et.getMemo()));
        }
        if(bIncEmpty||et.getOrgCode()!=null) {
            json.put("orgcode", getJSONValue(et.getOrgCode()));
        }
        if(bIncEmpty||et.getOrgId()!=null) {
            json.put("orgid", getJSONValue(et.getOrgId()));
        }
        if(bIncEmpty||et.getOrgName()!=null) {
            json.put("orgname", getJSONValue(et.getOrgName()));
        }
        if(bIncEmpty||et.getPOrgId()!=null) {
            json.put("porgid", getJSONValue(et.getPOrgId()));
        }
        if(bIncEmpty||et.getPOrgName()!=null) {
            json.put("porgname", getJSONValue(et.getPOrgName()));
        }
        if(bIncEmpty||et.getShortName()!=null) {
            json.put("shortname", getJSONValue(et.getShortName()));
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
    private static void fillXmlNode(OrgBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLevelCode()!=null) {
            Object obj = et.getLevelCode();
            node.setAttribute("LEVELCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgCode()!=null) {
            Object obj = et.getOrgCode();
            node.setAttribute("ORGCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgId()!=null) {
            Object obj = et.getOrgId();
            node.setAttribute("ORGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgName()!=null) {
            Object obj = et.getOrgName();
            node.setAttribute("ORGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOrgId()!=null) {
            Object obj = et.getPOrgId();
            node.setAttribute("PORGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOrgName()!=null) {
            Object obj = et.getPOrgName();
            node.setAttribute("PORGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getShortName()!=null) {
            Object obj = et.getShortName();
            node.setAttribute("SHORTNAME",(obj==null)?"":(String)obj);
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


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OrgBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OrgBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isLevelCodeDirty() && (bIncEmpty||et.getLevelCode()!=null)) {
            Object obj = et.getLevelCode();
            if(obj==null) {
                dst.set(FIELD_LEVELCODE,null);
            } else {
                dst.set(FIELD_LEVELCODE,obj);
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
        if(et.isOrgCodeDirty() && (bIncEmpty||et.getOrgCode()!=null)) {
            Object obj = et.getOrgCode();
            if(obj==null) {
                dst.set(FIELD_ORGCODE,null);
            } else {
                dst.set(FIELD_ORGCODE,obj);
            }
        }
        if(et.isOrgIdDirty() && (bIncEmpty||et.getOrgId()!=null)) {
            Object obj = et.getOrgId();
            if(obj==null) {
                dst.set(FIELD_ORGID,null);
            } else {
                dst.set(FIELD_ORGID,obj);
            }
        }
        if(et.isOrgNameDirty() && (bIncEmpty||et.getOrgName()!=null)) {
            Object obj = et.getOrgName();
            if(obj==null) {
                dst.set(FIELD_ORGNAME,null);
            } else {
                dst.set(FIELD_ORGNAME,obj);
            }
        }
        if(et.isPOrgIdDirty() && (bIncEmpty||et.getPOrgId()!=null)) {
            Object obj = et.getPOrgId();
            if(obj==null) {
                dst.set(FIELD_PORGID,null);
            } else {
                dst.set(FIELD_PORGID,obj);
            }
        }
        if(et.isPOrgNameDirty() && (bIncEmpty||et.getPOrgName()!=null)) {
            Object obj = et.getPOrgName();
            if(obj==null) {
                dst.set(FIELD_PORGNAME,null);
            } else {
                dst.set(FIELD_PORGNAME,obj);
            }
        }
        if(et.isShortNameDirty() && (bIncEmpty||et.getShortName()!=null)) {
            Object obj = et.getShortName();
            if(obj==null) {
                dst.set(FIELD_SHORTNAME,null);
            } else {
                dst.set(FIELD_SHORTNAME,obj);
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
        return  OrgBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OrgBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_LEVELCODE:
            et.resetLevelCode();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ORGCODE:
            et.resetOrgCode();
            return true;
        case INDEX_ORGID:
            et.resetOrgId();
            return true;
        case INDEX_ORGNAME:
            et.resetOrgName();
            return true;
        case INDEX_PORGID:
            et.resetPOrgId();
            return true;
        case INDEX_PORGNAME:
            et.resetPOrgName();
            return true;
        case INDEX_SHORTNAME:
            et.resetShortName();
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
        default:
            throw new Exception("不明属性标识");
        }
    }




    private Object objPorgLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.Org porg = null;
    /**
    * 获取父数据 组织机构
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.Org getPorg() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPorg();
        }

        if(this.getPOrgId()==null)
            return null;
        synchronized(objPorgLock) {
            if(porg==null) {
                porg = new net.ibizsys.psrt.srv.common.entity.Org();
                porg.setOrgId(this.getPOrgId());
                net.ibizsys.psrt.srv.common.service.OrgService service = (net.ibizsys.psrt.srv.common.service.OrgService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgService.class,this.getSessionFactory());
                if(this.getPOrgId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(porg);
                else
                    service.get(porg);
            }
            return porg;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private OrgBase getProxyEntity() {
        return this.proxyOrgBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOrgBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OrgBase) {
            this.proxyOrgBase = (OrgBase)proxyDataObject;
        }

    }

}