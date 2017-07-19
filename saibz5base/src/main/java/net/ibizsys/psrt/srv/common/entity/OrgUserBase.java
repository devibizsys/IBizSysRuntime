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
 * 实体[OrgUser] 数据对象基类
 */
public abstract class OrgUserBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     *   实体属性标识[条线代码]
     */
    public final static String FIELD_BIZCODE = "BIZCODE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[人员排序]
     */
    public final static String FIELD_ORDERVALUE = "ORDERVALUE";
    /**
     *   实体属性标识[所属组织]
     */
    public final static String FIELD_ORGID = "ORGID";
    /**
     *   实体属性标识[所属组织]
     */
    public final static String FIELD_ORGNAME = "ORGNAME";
    /**
     *   实体属性标识[所属部门]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[所属部门]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[部门人员关系]
     */
    public final static String FIELD_ORGSECUSERTYPEID = "ORGSECUSERTYPEID";
    /**
     *   实体属性标识[部门人员关系]
     */
    public final static String FIELD_ORGSECUSERTYPENAME = "ORGSECUSERTYPENAME";
    /**
     *   实体属性标识[组织人员标识]
     */
    public final static String FIELD_ORGUSERID = "ORGUSERID";
    /**
     *   实体属性标识[人员级别]
     */
    public final static String FIELD_ORGUSERLEVELID = "ORGUSERLEVELID";
    /**
     *   实体属性标识[人员级别]
     */
    public final static String FIELD_ORGUSERLEVELNAME = "ORGUSERLEVELNAME";
    /**
     *   实体属性标识[人员名称]
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
     *   实体属性标识[用户编号]
     */
    public final static String FIELD_USERCODE = "USERCODE";
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

    private final static int INDEX_BIZCODE = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_MEMO = 3;
    private final static int INDEX_ORDERVALUE = 4;
    private final static int INDEX_ORGID = 5;
    private final static int INDEX_ORGNAME = 6;
    private final static int INDEX_ORGSECTORID = 7;
    private final static int INDEX_ORGSECTORNAME = 8;
    private final static int INDEX_ORGSECUSERTYPEID = 9;
    private final static int INDEX_ORGSECUSERTYPENAME = 10;
    private final static int INDEX_ORGUSERID = 11;
    private final static int INDEX_ORGUSERLEVELID = 12;
    private final static int INDEX_ORGUSERLEVELNAME = 13;
    private final static int INDEX_ORGUSERNAME = 14;
    private final static int INDEX_TITLENAME = 15;
    private final static int INDEX_UPDATEDATE = 16;
    private final static int INDEX_UPDATEMAN = 17;
    private final static int INDEX_USERCODE = 18;
    private final static int INDEX_USERDATA = 19;
    private final static int INDEX_USERDATA2 = 20;
    private final static int INDEX_VALIDFLAG = 21;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_BIZCODE, INDEX_BIZCODE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORDERVALUE, INDEX_ORDERVALUE);
        fieldIndexMap.put( FIELD_ORGID, INDEX_ORGID);
        fieldIndexMap.put( FIELD_ORGNAME, INDEX_ORGNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_ORGSECUSERTYPEID, INDEX_ORGSECUSERTYPEID);
        fieldIndexMap.put( FIELD_ORGSECUSERTYPENAME, INDEX_ORGSECUSERTYPENAME);
        fieldIndexMap.put( FIELD_ORGUSERID, INDEX_ORGUSERID);
        fieldIndexMap.put( FIELD_ORGUSERLEVELID, INDEX_ORGUSERLEVELID);
        fieldIndexMap.put( FIELD_ORGUSERLEVELNAME, INDEX_ORGUSERLEVELNAME);
        fieldIndexMap.put( FIELD_ORGUSERNAME, INDEX_ORGUSERNAME);
        fieldIndexMap.put( FIELD_TITLENAME, INDEX_TITLENAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERCODE, INDEX_USERCODE);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
        fieldIndexMap.put( FIELD_VALIDFLAG, INDEX_VALIDFLAG);
    }

    private OrgUserBase proxyOrgUserBase = null;

    public OrgUserBase() {
        super();
    }
    private boolean bizcodeDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean ordervalueDirtyFlag = false;
    private boolean orgidDirtyFlag = false;
    private boolean orgnameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean orgsecusertypeidDirtyFlag = false;
    private boolean orgsecusertypenameDirtyFlag = false;
    private boolean orguseridDirtyFlag = false;
    private boolean orguserlevelidDirtyFlag = false;
    private boolean orguserlevelnameDirtyFlag = false;
    private boolean orgusernameDirtyFlag = false;
    private boolean titlenameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean usercodeDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;
    private boolean validflagDirtyFlag = false;

    @Column(name="bizcode")
    private String bizcode;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="memo")
    private String memo;
    @Column(name="ordervalue")
    private Integer ordervalue;
    @Column(name="orgid")
    private String orgid;
    @Column(name="orgname")
    private String orgname;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="orgsecusertypeid")
    private String orgsecusertypeid;
    @Column(name="orgsecusertypename")
    private String orgsecusertypename;
    @Column(name="orguserid")
    private String orguserid;
    @Column(name="orguserlevelid")
    private String orguserlevelid;
    @Column(name="orguserlevelname")
    private String orguserlevelname;
    @Column(name="orgusername")
    private String orgusername;
    @Column(name="titlename")
    private String titlename;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="usercode")
    private String usercode;
    @Column(name="userdata")
    private String userdata;
    @Column(name="userdata2")
    private String userdata2;
    @Column(name="validflag")
    private Integer validflag;


    /**
     *  设置属性值[条线代码]
     *  @param bizcode
     */
    public void setBizCode(String bizcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBizCode(bizcode);
            return;
        }
        if(bizcode!=null) {
            bizcode = StringHelper.trimRight(bizcode);
            if(bizcode.length()==0) {
                bizcode = null;
            }
        }
        this.bizcode =  bizcode;
        this.bizcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[条线代码]
     */
    public String getBizCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBizCode();
        }
        return this.bizcode;
    }

    /**
     *  获取属性值[条线代码]是否修改
     */
    public boolean isBizCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBizCodeDirty();
        }
        return this.bizcodeDirtyFlag;
    }

    /**
     *  重置属性值[条线代码]
     */
    public void resetBizCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBizCode();
            return;
        }

        this.bizcodeDirtyFlag = false;
        this.bizcode = null;
    }
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
     *  设置属性值[人员排序]
     *  @param ordervalue
     */
    public void setOrderValue(Integer ordervalue) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrderValue(ordervalue);
            return;
        }
        this.ordervalue =  ordervalue;
        this.ordervalueDirtyFlag  = true;
    }

    /**
     *  获取属性值[人员排序]
     */
    public Integer getOrderValue() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrderValue();
        }
        return this.ordervalue;
    }

    /**
     *  获取属性值[人员排序]是否修改
     */
    public boolean isOrderValueDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrderValueDirty();
        }
        return this.ordervalueDirtyFlag;
    }

    /**
     *  重置属性值[人员排序]
     */
    public void resetOrderValue() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrderValue();
            return;
        }

        this.ordervalueDirtyFlag = false;
        this.ordervalue = null;
    }
    /**
     *  设置属性值[所属组织]
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
     *  获取属性值[所属组织]
     */
    public String getOrgId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgId();
        }
        return this.orgid;
    }

    /**
     *  获取属性值[所属组织]是否修改
     */
    public boolean isOrgIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgIdDirty();
        }
        return this.orgidDirtyFlag;
    }

    /**
     *  重置属性值[所属组织]
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
     *  设置属性值[所属组织]
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
     *  获取属性值[所属组织]
     */
    public String getOrgName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgName();
        }
        return this.orgname;
    }

    /**
     *  获取属性值[所属组织]是否修改
     */
    public boolean isOrgNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgNameDirty();
        }
        return this.orgnameDirtyFlag;
    }

    /**
     *  重置属性值[所属组织]
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
     *  设置属性值[所属部门]
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
     *  获取属性值[所属部门]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[所属部门]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[所属部门]
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
     *  设置属性值[所属部门]
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
     *  获取属性值[所属部门]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[所属部门]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[所属部门]
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
     *  设置属性值[组织人员标识]
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
     *  获取属性值[组织人员标识]
     */
    public String getOrgUserId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserId();
        }
        return this.orguserid;
    }

    /**
     *  获取属性值[组织人员标识]是否修改
     */
    public boolean isOrgUserIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserIdDirty();
        }
        return this.orguseridDirtyFlag;
    }

    /**
     *  重置属性值[组织人员标识]
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
     *  设置属性值[人员级别]
     *  @param orguserlevelid
     */
    public void setOrgUserLevelId(String orguserlevelid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserLevelId(orguserlevelid);
            return;
        }
        if(orguserlevelid!=null) {
            orguserlevelid = StringHelper.trimRight(orguserlevelid);
            if(orguserlevelid.length()==0) {
                orguserlevelid = null;
            }
        }
        this.orguserlevelid =  orguserlevelid;
        this.orguserlevelidDirtyFlag  = true;
    }

    /**
     *  获取属性值[人员级别]
     */
    public String getOrgUserLevelId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserLevelId();
        }
        return this.orguserlevelid;
    }

    /**
     *  获取属性值[人员级别]是否修改
     */
    public boolean isOrgUserLevelIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserLevelIdDirty();
        }
        return this.orguserlevelidDirtyFlag;
    }

    /**
     *  重置属性值[人员级别]
     */
    public void resetOrgUserLevelId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserLevelId();
            return;
        }

        this.orguserlevelidDirtyFlag = false;
        this.orguserlevelid = null;
    }
    /**
     *  设置属性值[人员级别]
     *  @param orguserlevelname
     */
    public void setOrgUserLevelName(String orguserlevelname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgUserLevelName(orguserlevelname);
            return;
        }
        if(orguserlevelname!=null) {
            orguserlevelname = StringHelper.trimRight(orguserlevelname);
            if(orguserlevelname.length()==0) {
                orguserlevelname = null;
            }
        }
        this.orguserlevelname =  orguserlevelname;
        this.orguserlevelnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[人员级别]
     */
    public String getOrgUserLevelName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserLevelName();
        }
        return this.orguserlevelname;
    }

    /**
     *  获取属性值[人员级别]是否修改
     */
    public boolean isOrgUserLevelNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserLevelNameDirty();
        }
        return this.orguserlevelnameDirtyFlag;
    }

    /**
     *  重置属性值[人员级别]
     */
    public void resetOrgUserLevelName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgUserLevelName();
            return;
        }

        this.orguserlevelnameDirtyFlag = false;
        this.orguserlevelname = null;
    }
    /**
     *  设置属性值[人员名称]
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
     *  获取属性值[人员名称]
     */
    public String getOrgUserName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserName();
        }
        return this.orgusername;
    }

    /**
     *  获取属性值[人员名称]是否修改
     */
    public boolean isOrgUserNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserNameDirty();
        }
        return this.orgusernameDirtyFlag;
    }

    /**
     *  重置属性值[人员名称]
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
     *  设置属性值[用户编号]
     *  @param usercode
     */
    public void setUserCode(String usercode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserCode(usercode);
            return;
        }
        if(usercode!=null) {
            usercode = StringHelper.trimRight(usercode);
            if(usercode.length()==0) {
                usercode = null;
            }
        }
        this.usercode =  usercode;
        this.usercodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户编号]
     */
    public String getUserCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserCode();
        }
        return this.usercode;
    }

    /**
     *  获取属性值[用户编号]是否修改
     */
    public boolean isUserCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserCodeDirty();
        }
        return this.usercodeDirtyFlag;
    }

    /**
     *  重置属性值[用户编号]
     */
    public void resetUserCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserCode();
            return;
        }

        this.usercodeDirtyFlag = false;
        this.usercode = null;
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
        OrgUserBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OrgUserBase et) {
        et.resetBizCode();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetMemo();
        et.resetOrderValue();
        et.resetOrgId();
        et.resetOrgName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetOrgSecUserTypeId();
        et.resetOrgSecUserTypeName();
        et.resetOrgUserId();
        et.resetOrgUserLevelId();
        et.resetOrgUserLevelName();
        et.resetOrgUserName();
        et.resetTitleName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserCode();
        et.resetUserData();
        et.resetUserData2();
        et.resetValidFlag();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isBizCodeDirty()) {
            params.put(FIELD_BIZCODE,getBizCode());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrderValueDirty()) {
            params.put(FIELD_ORDERVALUE,getOrderValue());
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
        if(!bDirtyOnly || isOrgSecUserTypeIdDirty()) {
            params.put(FIELD_ORGSECUSERTYPEID,getOrgSecUserTypeId());
        }
        if(!bDirtyOnly || isOrgSecUserTypeNameDirty()) {
            params.put(FIELD_ORGSECUSERTYPENAME,getOrgSecUserTypeName());
        }
        if(!bDirtyOnly || isOrgUserIdDirty()) {
            params.put(FIELD_ORGUSERID,getOrgUserId());
        }
        if(!bDirtyOnly || isOrgUserLevelIdDirty()) {
            params.put(FIELD_ORGUSERLEVELID,getOrgUserLevelId());
        }
        if(!bDirtyOnly || isOrgUserLevelNameDirty()) {
            params.put(FIELD_ORGUSERLEVELNAME,getOrgUserLevelName());
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
        if(!bDirtyOnly || isUserCodeDirty()) {
            params.put(FIELD_USERCODE,getUserCode());
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

        return  OrgUserBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OrgUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.getBizCode();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ORDERVALUE:
            return et.getOrderValue();
        case INDEX_ORGID:
            return et.getOrgId();
        case INDEX_ORGNAME:
            return et.getOrgName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_ORGSECUSERTYPEID:
            return et.getOrgSecUserTypeId();
        case INDEX_ORGSECUSERTYPENAME:
            return et.getOrgSecUserTypeName();
        case INDEX_ORGUSERID:
            return et.getOrgUserId();
        case INDEX_ORGUSERLEVELID:
            return et.getOrgUserLevelId();
        case INDEX_ORGUSERLEVELNAME:
            return et.getOrgUserLevelName();
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName();
        case INDEX_TITLENAME:
            return et.getTitleName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERCODE:
            return et.getUserCode();
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

        OrgUserBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OrgUserBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_BIZCODE:
            et.setBizCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORDERVALUE:
            et.setOrderValue(DataObject.getIntegerValue(obj));
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
        case INDEX_ORGSECUSERTYPEID:
            et.setOrgSecUserTypeId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECUSERTYPENAME:
            et.setOrgSecUserTypeName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERID:
            et.setOrgUserId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERLEVELID:
            et.setOrgUserLevelId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERLEVELNAME:
            et.setOrgUserLevelName(DataObject.getStringValue(obj));
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
        case INDEX_USERCODE:
            et.setUserCode(DataObject.getStringValue(obj));
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

        return  OrgUserBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OrgUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.getBizCode()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ORDERVALUE:
            return et.getOrderValue()==null;
        case INDEX_ORGID:
            return et.getOrgId()==null;
        case INDEX_ORGNAME:
            return et.getOrgName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_ORGSECUSERTYPEID:
            return et.getOrgSecUserTypeId()==null;
        case INDEX_ORGSECUSERTYPENAME:
            return et.getOrgSecUserTypeName()==null;
        case INDEX_ORGUSERID:
            return et.getOrgUserId()==null;
        case INDEX_ORGUSERLEVELID:
            return et.getOrgUserLevelId()==null;
        case INDEX_ORGUSERLEVELNAME:
            return et.getOrgUserLevelName()==null;
        case INDEX_ORGUSERNAME:
            return et.getOrgUserName()==null;
        case INDEX_TITLENAME:
            return et.getTitleName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERCODE:
            return et.getUserCode()==null;
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

        return  OrgUserBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OrgUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.isBizCodeDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ORDERVALUE:
            return et.isOrderValueDirty();
        case INDEX_ORGID:
            return et.isOrgIdDirty();
        case INDEX_ORGNAME:
            return et.isOrgNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_ORGSECUSERTYPEID:
            return et.isOrgSecUserTypeIdDirty();
        case INDEX_ORGSECUSERTYPENAME:
            return et.isOrgSecUserTypeNameDirty();
        case INDEX_ORGUSERID:
            return et.isOrgUserIdDirty();
        case INDEX_ORGUSERLEVELID:
            return et.isOrgUserLevelIdDirty();
        case INDEX_ORGUSERLEVELNAME:
            return et.isOrgUserLevelNameDirty();
        case INDEX_ORGUSERNAME:
            return et.isOrgUserNameDirty();
        case INDEX_TITLENAME:
            return et.isTitleNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERCODE:
            return et.isUserCodeDirty();
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
    private static  void fillJSONObject(OrgUserBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBizCode()!=null) {
            json.put("bizcode", getJSONValue(et.getBizCode()));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            json.put("memo", getJSONValue(et.getMemo()));
        }
        if(bIncEmpty||et.getOrderValue()!=null) {
            json.put("ordervalue", getJSONValue(et.getOrderValue()));
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
        if(bIncEmpty||et.getOrgSecUserTypeId()!=null) {
            json.put("orgsecusertypeid", getJSONValue(et.getOrgSecUserTypeId()));
        }
        if(bIncEmpty||et.getOrgSecUserTypeName()!=null) {
            json.put("orgsecusertypename", getJSONValue(et.getOrgSecUserTypeName()));
        }
        if(bIncEmpty||et.getOrgUserId()!=null) {
            json.put("orguserid", getJSONValue(et.getOrgUserId()));
        }
        if(bIncEmpty||et.getOrgUserLevelId()!=null) {
            json.put("orguserlevelid", getJSONValue(et.getOrgUserLevelId()));
        }
        if(bIncEmpty||et.getOrgUserLevelName()!=null) {
            json.put("orguserlevelname", getJSONValue(et.getOrgUserLevelName()));
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
        if(bIncEmpty||et.getUserCode()!=null) {
            json.put("usercode", getJSONValue(et.getUserCode()));
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
    private static void fillXmlNode(OrgUserBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBizCode()!=null) {
            Object obj = et.getBizCode();
            node.setAttribute("BIZCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrderValue()!=null) {
            Object obj = et.getOrderValue();
            node.setAttribute("ORDERVALUE",(obj==null)?"":StringHelper.format("%1$s",obj));
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
        if(bIncEmpty||et.getOrgUserLevelId()!=null) {
            Object obj = et.getOrgUserLevelId();
            node.setAttribute("ORGUSERLEVELID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserLevelName()!=null) {
            Object obj = et.getOrgUserLevelName();
            node.setAttribute("ORGUSERLEVELNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getUserCode()!=null) {
            Object obj = et.getUserCode();
            node.setAttribute("USERCODE",(obj==null)?"":(String)obj);
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
        OrgUserBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OrgUserBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isBizCodeDirty() && (bIncEmpty||et.getBizCode()!=null)) {
            Object obj = et.getBizCode();
            if(obj==null) {
                dst.set(FIELD_BIZCODE,null);
            } else {
                dst.set(FIELD_BIZCODE,obj);
            }
        }
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
        if(et.isMemoDirty() && (bIncEmpty||et.getMemo()!=null)) {
            Object obj = et.getMemo();
            if(obj==null) {
                dst.set(FIELD_MEMO,null);
            } else {
                dst.set(FIELD_MEMO,obj);
            }
        }
        if(et.isOrderValueDirty() && (bIncEmpty||et.getOrderValue()!=null)) {
            Object obj = et.getOrderValue();
            if(obj==null) {
                dst.set(FIELD_ORDERVALUE,null);
            } else {
                dst.set(FIELD_ORDERVALUE,obj);
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
        if(et.isOrgUserLevelIdDirty() && (bIncEmpty||et.getOrgUserLevelId()!=null)) {
            Object obj = et.getOrgUserLevelId();
            if(obj==null) {
                dst.set(FIELD_ORGUSERLEVELID,null);
            } else {
                dst.set(FIELD_ORGUSERLEVELID,obj);
            }
        }
        if(et.isOrgUserLevelNameDirty() && (bIncEmpty||et.getOrgUserLevelName()!=null)) {
            Object obj = et.getOrgUserLevelName();
            if(obj==null) {
                dst.set(FIELD_ORGUSERLEVELNAME,null);
            } else {
                dst.set(FIELD_ORGUSERLEVELNAME,obj);
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
        if(et.isUserCodeDirty() && (bIncEmpty||et.getUserCode()!=null)) {
            Object obj = et.getUserCode();
            if(obj==null) {
                dst.set(FIELD_USERCODE,null);
            } else {
                dst.set(FIELD_USERCODE,obj);
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
        return  OrgUserBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OrgUserBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            et.resetBizCode();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ORDERVALUE:
            et.resetOrderValue();
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
        case INDEX_ORGSECUSERTYPEID:
            et.resetOrgSecUserTypeId();
            return true;
        case INDEX_ORGSECUSERTYPENAME:
            et.resetOrgSecUserTypeName();
            return true;
        case INDEX_ORGUSERID:
            et.resetOrgUserId();
            return true;
        case INDEX_ORGUSERLEVELID:
            et.resetOrgUserLevelId();
            return true;
        case INDEX_ORGUSERLEVELNAME:
            et.resetOrgUserLevelName();
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
        case INDEX_USERCODE:
            et.resetUserCode();
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

    private Object objOrgUserLevelLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgUserLevel orguserlevel = null;
    /**
    * 获取父数据 组织人员级别
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgUserLevel getOrgUserLevel() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserLevel();
        }

        if(this.getOrgUserLevelId()==null)
            return null;
        synchronized(objOrgUserLevelLock) {
            if(orguserlevel==null) {
                orguserlevel = new net.ibizsys.psrt.srv.common.entity.OrgUserLevel();
                orguserlevel.setOrgUserLevelId(this.getOrgUserLevelId());
                net.ibizsys.psrt.srv.common.service.OrgUserLevelService service = (net.ibizsys.psrt.srv.common.service.OrgUserLevelService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgUserLevelService.class,this.getSessionFactory());
                if(this.getOrgUserLevelId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(orguserlevel);
                else
                    service.get(orguserlevel);
            }
            return orguserlevel;
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




    /**
     *  获取代理的数据对象
     */
    private OrgUserBase getProxyEntity() {
        return this.proxyOrgUserBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOrgUserBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OrgUserBase) {
            this.proxyOrgUserBase = (OrgUserBase)proxyDataObject;
        }

    }

}