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
 * 实体[OrgSecUser] 数据对象基类
 */
public abstract class OrgSecUserBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[默认关系]
     */
    public final static String FIELD_DEFAULTFLAG = "DEFAULTFLAG";
    /**
     *   实体属性标识[组织机构]
     */
    public final static String FIELD_ORGID = "ORGID";
    /**
     *   实体属性标识[组织机构]
     */
    public final static String FIELD_ORGNAME = "ORGNAME";
    /**
     *   实体属性标识[组织部门]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[组织部门]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[组织部门人员标识]
     */
    public final static String FIELD_ORGSECUSERID = "ORGSECUSERID";
    /**
     *   实体属性标识[组织部门人员名称]
     */
    public final static String FIELD_ORGSECUSERNAME = "ORGSECUSERNAME";
    /**
     *   实体属性标识[部门人员关系]
     */
    public final static String FIELD_ORGSECUSERTYPEID = "ORGSECUSERTYPEID";
    /**
     *   实体属性标识[部门人员关系]
     */
    public final static String FIELD_ORGSECUSERTYPENAME = "ORGSECUSERTYPENAME";
    /**
     *   实体属性标识[组织人员]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[组织人员]
     */
    public final static String FIELD_ORGUSERNAME = "ORGUSERNAME";
    /**
     *   实体属性标识[头衔名称]
     */
    public final static String FIELD_TITLENAME = "TITLENAME";
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
     *   实体属性标识[启用标志]
     */
    public final static String FIELD_VALIDFLAG = "VALIDFLAG";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_DEFAULTFLAG = 2;
    private final static int INDEX_ORGID = 3;
    private final static int INDEX_ORGNAME = 4;
    private final static int INDEX_ORGSECTORID = 5;
    private final static int INDEX_ORGSECTORNAME = 6;
    private final static int INDEX_ORGSECUSERID = 7;
    private final static int INDEX_ORGSECUSERNAME = 8;
    private final static int INDEX_ORGSECUSERTYPEID = 9;
    private final static int INDEX_ORGSECUSERTYPENAME = 10;
    private final static int INDEX_ORGUSERID = 11;
    private final static int INDEX_ORGUSERNAME = 12;
    private final static int INDEX_TITLENAME = 13;
    private final static int INDEX_UPDATEDATE = 14;
    private final static int INDEX_UPDATEMAN = 15;
    private final static int INDEX_USERDATA = 16;
    private final static int INDEX_USERDATA2 = 17;
    private final static int INDEX_VALIDFLAG = 18;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DEFAULTFLAG, INDEX_DEFAULTFLAG);
        fieldIndexMap.put( FIELD_ORGID, INDEX_ORGID);
        fieldIndexMap.put( FIELD_ORGNAME, INDEX_ORGNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_ORGSECUSERID, INDEX_ORGSECUSERID);
        fieldIndexMap.put( FIELD_ORGSECUSERNAME, INDEX_ORGSECUSERNAME);
        fieldIndexMap.put( FIELD_ORGSECUSERTYPEID, INDEX_ORGSECUSERTYPEID);
        fieldIndexMap.put( FIELD_ORGSECUSERTYPENAME, INDEX_ORGSECUSERTYPENAME);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_TITLENAME, INDEX_TITLENAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
        fieldIndexMap.put( FIELD_VALIDFLAG, INDEX_VALIDFLAG);
    }

    private OrgSecUserBase proxyOrgSecUserBase = null;

    public OrgSecUserBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean defaultflagDirtyFlag = false;
    private boolean orgidDirtyFlag = false;
    private boolean orgnameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean orgsecuseridDirtyFlag = false;
    private boolean orgsecusernameDirtyFlag = false;
    private boolean orgsecusertypeidDirtyFlag = false;
    private boolean orgsecusertypenameDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean titlenameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;
    private boolean validflagDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="defaultflag")
    private Integer defaultflag;
    @Column(name="orgid")
    private String orgid;
    @Column(name="orgname")
    private String orgname;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="orgsecuserid")
    private String orgsecuserid;
    @Column(name="orgsecusername")
    private String orgsecusername;
    @Column(name="orgsecusertypeid")
    private String orgsecusertypeid;
    @Column(name="orgsecusertypename")
    private String orgsecusertypename;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="titlename")
    private String titlename;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdata")
    private String userdata;
    @Column(name="userdata2")
    private String userdata2;
    @Column(name="validflag")
    private Integer validflag;


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
     *  设置属性值[默认关系]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param defaultflag
     */
    public void setDefaultFlag(Integer defaultflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDefaultFlag(defaultflag);
            return;
        }
        this.defaultflag =  defaultflag;
        this.defaultflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[默认关系]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getDefaultFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDefaultFlag();
        }
        return this.defaultflag;
    }

    /**
     *  获取属性值[默认关系]是否修改
     */
    public boolean isDefaultFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDefaultFlagDirty();
        }
        return this.defaultflagDirtyFlag;
    }

    /**
     *  重置属性值[默认关系]
     */
    public void resetDefaultFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDefaultFlag();
            return;
        }

        this.defaultflagDirtyFlag = false;
        this.defaultflag = null;
    }
    /**
     *  设置属性值[组织机构]
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
     *  获取属性值[组织机构]
     */
    public String getOrgId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgId();
        }
        return this.orgid;
    }

    /**
     *  获取属性值[组织机构]是否修改
     */
    public boolean isOrgIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgIdDirty();
        }
        return this.orgidDirtyFlag;
    }

    /**
     *  重置属性值[组织机构]
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
     *  设置属性值[组织机构]
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
     *  获取属性值[组织机构]
     */
    public String getOrgName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgName();
        }
        return this.orgname;
    }

    /**
     *  获取属性值[组织机构]是否修改
     */
    public boolean isOrgNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgNameDirty();
        }
        return this.orgnameDirtyFlag;
    }

    /**
     *  重置属性值[组织机构]
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
     *  设置属性值[组织部门]
     *  @param orgsectorid
     */
    public void setOrgSectorId(String orgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorId(orgsectorid);
            return;
        }
        if(orgsectorid!=null) {
            orgsectorid = StringHelper.trimRight(orgsectorid);
            if(orgsectorid.length()==0) {
                orgsectorid = null;
            }
        }
        this.orgsectorid =  orgsectorid;
        this.orgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织部门]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[组织部门]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[组织部门]
     */
    public void resetOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorId();
            return;
        }

        this.orgsectoridDirtyFlag = false;
        this.orgsectorid = null;
    }
    /**
     *  设置属性值[组织部门]
     *  @param orgsectorname
     */
    public void setOrgSectorName(String orgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSectorName(orgsectorname);
            return;
        }
        if(orgsectorname!=null) {
            orgsectorname = StringHelper.trimRight(orgsectorname);
            if(orgsectorname.length()==0) {
                orgsectorname = null;
            }
        }
        this.orgsectorname =  orgsectorname;
        this.orgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织部门]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[组织部门]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[组织部门]
     */
    public void resetOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSectorName();
            return;
        }

        this.orgsectornameDirtyFlag = false;
        this.orgsectorname = null;
    }
    /**
     *  设置属性值[组织部门人员标识]
     *  @param orgsecuserid
     */
    public void setOrgSecUserId(String orgsecuserid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSecUserId(orgsecuserid);
            return;
        }
        if(orgsecuserid!=null) {
            orgsecuserid = StringHelper.trimRight(orgsecuserid);
            if(orgsecuserid.length()==0) {
                orgsecuserid = null;
            }
        }
        this.orgsecuserid =  orgsecuserid;
        this.orgsecuseridDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织部门人员标识]
     */
    public String getOrgSecUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSecUserId();
        }
        return this.orgsecuserid;
    }

    /**
     *  获取属性值[组织部门人员标识]是否修改
     */
    public boolean isOrgSecUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSecUserIdDirty();
        }
        return this.orgsecuseridDirtyFlag;
    }

    /**
     *  重置属性值[组织部门人员标识]
     */
    public void resetOrgSecUserId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSecUserId();
            return;
        }

        this.orgsecuseridDirtyFlag = false;
        this.orgsecuserid = null;
    }
    /**
     *  设置属性值[组织部门人员名称]
     *  @param orgsecusername
     */
    public void setOrgSecUserName(String orgsecusername) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSecUserName(orgsecusername);
            return;
        }
        if(orgsecusername!=null) {
            orgsecusername = StringHelper.trimRight(orgsecusername);
            if(orgsecusername.length()==0) {
                orgsecusername = null;
            }
        }
        this.orgsecusername =  orgsecusername;
        this.orgsecusernameDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织部门人员名称]
     */
    public String getOrgSecUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSecUserName();
        }
        return this.orgsecusername;
    }

    /**
     *  获取属性值[组织部门人员名称]是否修改
     */
    public boolean isOrgSecUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSecUserNameDirty();
        }
        return this.orgsecusernameDirtyFlag;
    }

    /**
     *  重置属性值[组织部门人员名称]
     */
    public void resetOrgSecUserName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSecUserName();
            return;
        }

        this.orgsecusernameDirtyFlag = false;
        this.orgsecusername = null;
    }
    /**
     *  设置属性值[部门人员关系]
     *  @param orgsecusertypeid
     */
    public void setOrgSecUserTypeId(String orgsecusertypeid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSecUserTypeId(orgsecusertypeid);
            return;
        }
        if(orgsecusertypeid!=null) {
            orgsecusertypeid = StringHelper.trimRight(orgsecusertypeid);
            if(orgsecusertypeid.length()==0) {
                orgsecusertypeid = null;
            }
        }
        this.orgsecusertypeid =  orgsecusertypeid;
        this.orgsecusertypeidDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门人员关系]
     */
    public String getOrgSecUserTypeId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSecUserTypeId();
        }
        return this.orgsecusertypeid;
    }

    /**
     *  获取属性值[部门人员关系]是否修改
     */
    public boolean isOrgSecUserTypeIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSecUserTypeIdDirty();
        }
        return this.orgsecusertypeidDirtyFlag;
    }

    /**
     *  重置属性值[部门人员关系]
     */
    public void resetOrgSecUserTypeId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSecUserTypeId();
            return;
        }

        this.orgsecusertypeidDirtyFlag = false;
        this.orgsecusertypeid = null;
    }
    /**
     *  设置属性值[部门人员关系]
     *  @param orgsecusertypename
     */
    public void setOrgSecUserTypeName(String orgsecusertypename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgSecUserTypeName(orgsecusertypename);
            return;
        }
        if(orgsecusertypename!=null) {
            orgsecusertypename = StringHelper.trimRight(orgsecusertypename);
            if(orgsecusertypename.length()==0) {
                orgsecusertypename = null;
            }
        }
        this.orgsecusertypename =  orgsecusertypename;
        this.orgsecusertypenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门人员关系]
     */
    public String getOrgSecUserTypeName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSecUserTypeName();
        }
        return this.orgsecusertypename;
    }

    /**
     *  获取属性值[部门人员关系]是否修改
     */
    public boolean isOrgSecUserTypeNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSecUserTypeNameDirty();
        }
        return this.orgsecusertypenameDirtyFlag;
    }

    /**
     *  重置属性值[部门人员关系]
     */
    public void resetOrgSecUserTypeName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgSecUserTypeName();
            return;
        }

        this.orgsecusertypenameDirtyFlag = false;
        this.orgsecusertypename = null;
    }
    /**
     *  设置属性值[组织人员]
     *  @param orguserid
     */
    public void setOrgUserId(String orguserid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserId(orguserid);
            return;
        }
        if(orguserid!=null) {
            orguserid = StringHelper.trimRight(orguserid);
            if(orguserid.length()==0) {
                orguserid = null;
            }
        }
        this.orguserid =  orguserid;
        this.orguseridDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织人员]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[组织人员]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[组织人员]
     */
    public void resetOrgUserId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserId();
            return;
        }

        this.orguseridDirtyFlag = false;
        this.orguserid = null;
    }
    /**
     *  设置属性值[组织人员]
     *  @param orgusername
     */
    public void setOrgUserName(String orgusername) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserName(orgusername);
            return;
        }
        if(orgusername!=null) {
            orgusername = StringHelper.trimRight(orgusername);
            if(orgusername.length()==0) {
                orgusername = null;
            }
        }
        this.orgusername =  orgusername;
        this.orgusernameDirtyFlag  = true;
    }

    /**
     *  获取属性值[组织人员]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[组织人员]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[组织人员]
     */
    public void resetOrgUserName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserName();
            return;
        }

        this.orgusernameDirtyFlag = false;
        this.orgusername = null;
    }
    /**
     *  设置属性值[头衔名称]
     *  @param titlename
     */
    public void setTitleName(String titlename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTitleName(titlename);
            return;
        }
        if(titlename!=null) {
            titlename = StringHelper.trimRight(titlename);
            if(titlename.length()==0) {
                titlename = null;
            }
        }
        this.titlename =  titlename;
        this.titlenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[头衔名称]
     */
    public String getTitleName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTitleName();
        }
        return this.titlename;
    }

    /**
     *  获取属性值[头衔名称]是否修改
     */
    public boolean isTitleNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTitleNameDirty();
        }
        return this.titlenameDirtyFlag;
    }

    /**
     *  重置属性值[头衔名称]
     */
    public void resetTitleName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTitleName();
            return;
        }

        this.titlenameDirtyFlag = false;
        this.titlename = null;
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
     *  设置属性值[启用标志]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param validflag
     */
    public void setValidFlag(Integer validflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setValidFlag(validflag);
            return;
        }
        this.validflag =  validflag;
        this.validflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[启用标志]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getValidFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getValidFlag();
        }
        return this.validflag;
    }

    /**
     *  获取属性值[启用标志]是否修改
     */
    public boolean isValidFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isValidFlagDirty();
        }
        return this.validflagDirtyFlag;
    }

    /**
     *  重置属性值[启用标志]
     */
    public void resetValidFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetValidFlag();
            return;
        }

        this.validflagDirtyFlag = false;
        this.validflag = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OrgSecUserBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OrgSecUserBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDefaultFlag();
        et.resetOrgId();
        et.resetOrgName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetOrgSecUserId();
        et.resetOrgSecUserName();
        et.resetOrgSecUserTypeId();
        et.resetOrgSecUserTypeName();
        et.resetOrgUserId();
        et.resetOrgUserName();
        et.resetTitleName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserData();
        et.resetUserData2();
        et.resetValidFlag();
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
        if(!bDirtyOnly || isDefaultFlagDirty()) {
            params.put(FIELD_DEFAULTFLAG,getDefaultFlag());
        }
        if(!bDirtyOnly || isOrgIdDirty()) {
            params.put(FIELD_ORGID,getOrgId());
        }
        if(!bDirtyOnly || isOrgNameDirty()) {
            params.put(FIELD_ORGNAME,getOrgName());
        }
        if(!bDirtyOnly || isOrgSectorIdDirty()) {
            params.put(FIELD_ORGSECTORID,getOrgSectorId());
        }
        if(!bDirtyOnly || isOrgSectorNameDirty()) {
            params.put(FIELD_ORGSECTORNAME,getOrgSectorName());
        }
        if(!bDirtyOnly || isOrgSecUserIdDirty()) {
            params.put(FIELD_ORGSECUSERID,getOrgSecUserId());
        }
        if(!bDirtyOnly || isOrgSecUserNameDirty()) {
            params.put(FIELD_ORGSECUSERNAME,getOrgSecUserName());
        }
        if(!bDirtyOnly || isOrgSecUserTypeIdDirty()) {
            params.put(FIELD_ORGSECUSERTYPEID,getOrgSecUserTypeId());
        }
        if(!bDirtyOnly || isOrgSecUserTypeNameDirty()) {
            params.put(FIELD_ORGSECUSERTYPENAME,getOrgSecUserTypeName());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserNameDirty()) {
            params.put(FIELD_ORGUSERNAME,getOrgUserName());
        }
        if(!bDirtyOnly || isTitleNameDirty()) {
            params.put(FIELD_TITLENAME,getTitleName());
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
        if(!bDirtyOnly || isValidFlagDirty()) {
            params.put(FIELD_VALIDFLAG,getValidFlag());
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

        return  OrgSecUserBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OrgSecUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DEFAULTFLAG:
            return et.getDefaultFlag();
        case INDEX_ORGID:
            return et.getOrgId();
        case INDEX_ORGNAME:
            return et.getOrgName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_ORGSECUSERID:
            return et.getOrgSecUserId();
        case INDEX_ORGSECUSERNAME:
            return et.getOrgSecUserName();
        case INDEX_ORGSECUSERTYPEID:
            return et.getOrgSecUserTypeId();
        case INDEX_ORGSECUSERTYPENAME:
            return et.getOrgSecUserTypeName();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_TITLENAME:
            return et.getTitleName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDATA:
            return et.getUserData();
        case INDEX_USERDATA2:
            return et.getUserData2();
        case INDEX_VALIDFLAG:
            return et.getValidFlag();
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

        OrgSecUserBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OrgSecUserBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEFAULTFLAG:
            et.setDefaultFlag(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_ORGID:
            et.setOrgId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGNAME:
            et.setOrgName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORID:
            et.setOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORNAME:
            et.setOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECUSERID:
            et.setOrgSecUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECUSERNAME:
            et.setOrgSecUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECUSERTYPEID:
            et.setOrgSecUserTypeId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECUSERTYPENAME:
            et.setOrgSecUserTypeName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERNAME:
            et.setOrgUserName(DataObject.getStringValue(obj));
            return ;
        case INDEX_TITLENAME:
            et.setTitleName(DataObject.getStringValue(obj));
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
        case INDEX_VALIDFLAG:
            et.setValidFlag(DataObject.getIntegerValue(obj));
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

        return  OrgSecUserBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OrgSecUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DEFAULTFLAG:
            return et.getDefaultFlag()==null;
        case INDEX_ORGID:
            return et.getOrgId()==null;
        case INDEX_ORGNAME:
            return et.getOrgName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_ORGSECUSERID:
            return et.getOrgSecUserId()==null;
        case INDEX_ORGSECUSERNAME:
            return et.getOrgSecUserName()==null;
        case INDEX_ORGSECUSERTYPEID:
            return et.getOrgSecUserTypeId()==null;
        case INDEX_ORGSECUSERTYPENAME:
            return et.getOrgSecUserTypeName()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_TITLENAME:
            return et.getTitleName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDATA:
            return et.getUserData()==null;
        case INDEX_USERDATA2:
            return et.getUserData2()==null;
        case INDEX_VALIDFLAG:
            return et.getValidFlag()==null;
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

        return  OrgSecUserBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OrgSecUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DEFAULTFLAG:
            return et.isDefaultFlagDirty();
        case INDEX_ORGID:
            return et.isOrgIdDirty();
        case INDEX_ORGNAME:
            return et.isOrgNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_ORGSECUSERID:
            return et.isOrgSecUserIdDirty();
        case INDEX_ORGSECUSERNAME:
            return et.isOrgSecUserNameDirty();
        case INDEX_ORGSECUSERTYPEID:
            return et.isOrgSecUserTypeIdDirty();
        case INDEX_ORGSECUSERTYPENAME:
            return et.isOrgSecUserTypeNameDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_TITLENAME:
            return et.isTitleNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDATA:
            return et.isUserDataDirty();
        case INDEX_USERDATA2:
            return et.isUserData2Dirty();
        case INDEX_VALIDFLAG:
            return et.isValidFlagDirty();
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
    private static  void fillJSONObject(OrgSecUserBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getDefaultFlag()!=null) {
            json.put("defaultflag", getJSONValue(et.getDefaultFlag()));
        }
        if(bIncEmpty||et.getOrgId()!=null) {
            json.put("orgid", getJSONValue(et.getOrgId()));
        }
        if(bIncEmpty||et.getOrgName()!=null) {
            json.put("orgname", getJSONValue(et.getOrgName()));
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            json.put("orgsectorid", getJSONValue(et.getOrgSectorId()));
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            json.put("orgsectorname", getJSONValue(et.getOrgSectorName()));
        }
        if(bIncEmpty||et.getOrgSecUserId()!=null) {
            json.put("orgsecuserid", getJSONValue(et.getOrgSecUserId()));
        }
        if(bIncEmpty||et.getOrgSecUserName()!=null) {
            json.put("orgsecusername", getJSONValue(et.getOrgSecUserName()));
        }
        if(bIncEmpty||et.getOrgSecUserTypeId()!=null) {
            json.put("orgsecusertypeid", getJSONValue(et.getOrgSecUserTypeId()));
        }
        if(bIncEmpty||et.getOrgSecUserTypeName()!=null) {
            json.put("orgsecusertypename", getJSONValue(et.getOrgSecUserTypeName()));
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            json.put("orguserid", getJSONValue(et.getOrgUserId()));
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            json.put("orgusername", getJSONValue(et.getOrgUserName()));
        }
        if(bIncEmpty||et.getTitleName()!=null) {
            json.put("titlename", getJSONValue(et.getTitleName()));
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
        if(bIncEmpty||et.getValidFlag()!=null) {
            json.put("validflag", getJSONValue(et.getValidFlag()));
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
    private static void fillXmlNode(OrgSecUserBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDefaultFlag()!=null) {
            Object obj = et.getDefaultFlag();
            node.setAttribute("DEFAULTFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getOrgId()!=null) {
            Object obj = et.getOrgId();
            node.setAttribute("ORGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgName()!=null) {
            Object obj = et.getOrgName();
            node.setAttribute("ORGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            Object obj = et.getOrgSectorId();
            node.setAttribute("ORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            Object obj = et.getOrgSectorName();
            node.setAttribute("ORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSecUserId()!=null) {
            Object obj = et.getOrgSecUserId();
            node.setAttribute("ORGSECUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSecUserName()!=null) {
            Object obj = et.getOrgSecUserName();
            node.setAttribute("ORGSECUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSecUserTypeId()!=null) {
            Object obj = et.getOrgSecUserTypeId();
            node.setAttribute("ORGSECUSERTYPEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSecUserTypeName()!=null) {
            Object obj = et.getOrgSecUserTypeName();
            node.setAttribute("ORGSECUSERTYPENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            Object obj = et.getOrgUserId();
            node.setAttribute("ORGUSERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserName()!=null) {
            Object obj = et.getOrgUserName();
            node.setAttribute("ORGUSERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTitleName()!=null) {
            Object obj = et.getTitleName();
            node.setAttribute("TITLENAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getValidFlag()!=null) {
            Object obj = et.getValidFlag();
            node.setAttribute("VALIDFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OrgSecUserBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OrgSecUserBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isDefaultFlagDirty() && (bIncEmpty||et.getDefaultFlag()!=null)) {
            Object obj = et.getDefaultFlag();
            if(obj==null) {
                dst.set(FIELD_DEFAULTFLAG,null);
            } else {
                dst.set(FIELD_DEFAULTFLAG,obj);
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
        if(et.isOrgSectorIdDirty() && (bIncEmpty||et.getOrgSectorId()!=null)) {
            Object obj = et.getOrgSectorId();
            if(obj==null) {
                dst.set(FIELD_ORGSECTORID,null);
            } else {
                dst.set(FIELD_ORGSECTORID,obj);
            }
        }
        if(et.isOrgSectorNameDirty() && (bIncEmpty||et.getOrgSectorName()!=null)) {
            Object obj = et.getOrgSectorName();
            if(obj==null) {
                dst.set(FIELD_ORGSECTORNAME,null);
            } else {
                dst.set(FIELD_ORGSECTORNAME,obj);
            }
        }
        if(et.isOrgSecUserIdDirty() && (bIncEmpty||et.getOrgSecUserId()!=null)) {
            Object obj = et.getOrgSecUserId();
            if(obj==null) {
                dst.set(FIELD_ORGSECUSERID,null);
            } else {
                dst.set(FIELD_ORGSECUSERID,obj);
            }
        }
        if(et.isOrgSecUserNameDirty() && (bIncEmpty||et.getOrgSecUserName()!=null)) {
            Object obj = et.getOrgSecUserName();
            if(obj==null) {
                dst.set(FIELD_ORGSECUSERNAME,null);
            } else {
                dst.set(FIELD_ORGSECUSERNAME,obj);
            }
        }
        if(et.isOrgSecUserTypeIdDirty() && (bIncEmpty||et.getOrgSecUserTypeId()!=null)) {
            Object obj = et.getOrgSecUserTypeId();
            if(obj==null) {
                dst.set(FIELD_ORGSECUSERTYPEID,null);
            } else {
                dst.set(FIELD_ORGSECUSERTYPEID,obj);
            }
        }
        if(et.isOrgSecUserTypeNameDirty() && (bIncEmpty||et.getOrgSecUserTypeName()!=null)) {
            Object obj = et.getOrgSecUserTypeName();
            if(obj==null) {
                dst.set(FIELD_ORGSECUSERTYPENAME,null);
            } else {
                dst.set(FIELD_ORGSECUSERTYPENAME,obj);
            }
        }
        if(et.isOrgUserIdDirty() && (bIncEmpty||et.getOrgUserId()!=null)) {
            Object obj = et.getOrgUserId();
            if(obj==null) {
                dst.set(FIELD_ORGUSERID,null);
            } else {
                dst.set(FIELD_ORGUSERID,obj);
            }
        }
        if(et.isOrgUserNameDirty() && (bIncEmpty||et.getOrgUserName()!=null)) {
            Object obj = et.getOrgUserName();
            if(obj==null) {
                dst.set(FIELD_ORGUSERNAME,null);
            } else {
                dst.set(FIELD_ORGUSERNAME,obj);
            }
        }
        if(et.isTitleNameDirty() && (bIncEmpty||et.getTitleName()!=null)) {
            Object obj = et.getTitleName();
            if(obj==null) {
                dst.set(FIELD_TITLENAME,null);
            } else {
                dst.set(FIELD_TITLENAME,obj);
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
        if(et.isValidFlagDirty() && (bIncEmpty||et.getValidFlag()!=null)) {
            Object obj = et.getValidFlag();
            if(obj==null) {
                dst.set(FIELD_VALIDFLAG,null);
            } else {
                dst.set(FIELD_VALIDFLAG,obj);
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
        return  OrgSecUserBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OrgSecUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DEFAULTFLAG:
            et.resetDefaultFlag();
            return true;
        case INDEX_ORGID:
            et.resetOrgId();
            return true;
        case INDEX_ORGNAME:
            et.resetOrgName();
            return true;
        case INDEX_ORGSECTORID:
            et.resetOrgSectorId();
            return true;
        case INDEX_ORGSECTORNAME:
            et.resetOrgSectorName();
            return true;
        case INDEX_ORGSECUSERID:
            et.resetOrgSecUserId();
            return true;
        case INDEX_ORGSECUSERNAME:
            et.resetOrgSecUserName();
            return true;
        case INDEX_ORGSECUSERTYPEID:
            et.resetOrgSecUserTypeId();
            return true;
        case INDEX_ORGSECUSERTYPENAME:
            et.resetOrgSecUserTypeName();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERNAME:
            et.resetOrgUserName();
            return true;
        case INDEX_TITLENAME:
            et.resetTitleName();
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
        case INDEX_VALIDFLAG:
            et.resetValidFlag();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }




    private Object objOrgLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.Org org = null;
    /**
    * 获取父数据 组织机构
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.Org getOrg() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrg();
        }

        if(this.getOrgId()==null)
            return null;
        synchronized(objOrgLock) {
            if(org==null) {
                org = new net.ibizsys.psrt.srv.common.entity.Org();
                org.setOrgId(this.getOrgId());
                net.ibizsys.psrt.srv.common.service.OrgService service = (net.ibizsys.psrt.srv.common.service.OrgService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgService.class,this.getSessionFactory());
                if(this.getOrgId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(org);
                else
                    service.get(org);
            }
            return org;
        }
    }

    private Object objOrgSectorLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector orgsector = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getOrgSector() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSector();
        }

        if(this.getOrgSectorId()==null)
            return null;
        synchronized(objOrgSectorLock) {
            if(orgsector==null) {
                orgsector = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                orgsector.setOrgSectorId(this.getOrgSectorId());
                net.ibizsys.psrt.srv.common.service.OrgSectorService service = (net.ibizsys.psrt.srv.common.service.OrgSectorService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgSectorService.class,this.getSessionFactory());
                if(this.getOrgSectorId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(orgsector);
                else
                    service.get(orgsector);
            }
            return orgsector;
        }
    }

    private Object objOrgSecUserTypeLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSecUserType orgsecusertype = null;
    /**
    * 获取父数据 部门人员关系类型
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSecUserType getOrgSecUserType() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSecUserType();
        }

        if(this.getOrgSecUserTypeId()==null)
            return null;
        synchronized(objOrgSecUserTypeLock) {
            if(orgsecusertype==null) {
                orgsecusertype = new net.ibizsys.psrt.srv.common.entity.OrgSecUserType();
                orgsecusertype.setOrgSecUserTypeId(this.getOrgSecUserTypeId());
                net.ibizsys.psrt.srv.common.service.OrgSecUserTypeService service = (net.ibizsys.psrt.srv.common.service.OrgSecUserTypeService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgSecUserTypeService.class,this.getSessionFactory());
                if(this.getOrgSecUserTypeId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(orgsecusertype);
                else
                    service.get(orgsecusertype);
            }
            return orgsecusertype;
        }
    }

    private Object objOrgUserLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUser orguser = null;
    /**
    * 获取父数据 组织人员
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUser getOrgUser() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUser();
        }

        if(this.getOrgUserId()==null)
            return null;
        synchronized(objOrgUserLock) {
            if(orguser==null) {
                orguser = new net.ibizsys.psrt.srv.common.entity.OrgUser();
                orguser.setOrgUserId(this.getOrgUserId());
                net.ibizsys.psrt.srv.common.service.OrgUserService service = (net.ibizsys.psrt.srv.common.service.OrgUserService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgUserService.class,this.getSessionFactory());
                if(this.getOrgUserId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(orguser);
                else
                    service.get(orguser);
            }
            return orguser;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private OrgSecUserBase getProxyEntity() {
        return this.proxyOrgSecUserBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOrgSecUserBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OrgSecUserBase) {
            this.proxyOrgSecUserBase = (OrgSecUserBase)proxyDataObject;
        }

    }

}