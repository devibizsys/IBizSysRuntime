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
 * 实体[OrgSector] 数据对象基类
 */
public abstract class OrgSectorBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[级别编码]
     */
    public final static String FIELD_LEVELCODE = "LEVELCODE";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[显示次序]
     */
    public final static String FIELD_ORDERVALUE = "ORDERVALUE";
    /**
     *   实体属性标识[部门组织编号]
     */
    public final static String FIELD_ORGCODE = "ORGCODE";
    /**
     *   实体属性标识[组织机构]
     */
    public final static String FIELD_ORGID = "ORGID";
    /**
     *   实体属性标识[组织机构]
     */
    public final static String FIELD_ORGNAME = "ORGNAME";
    /**
     *   实体属性标识[部门标识]
     */
    public final static String FIELD_ORGSECTORID = "ORGSECTORID";
    /**
     *   实体属性标识[部门名称]
     */
    public final static String FIELD_ORGSECTORNAME = "ORGSECTORNAME";
    /**
     *   实体属性标识[上级部门]
     */
    public final static String FIELD_PORGSECTORID = "PORGSECTORID";
    /**
     *   实体属性标识[上级部门]
     */
    public final static String FIELD_PORGSECTORNAME = "PORGSECTORNAME";
    /**
     *   实体属性标识[汇报部门]
     */
    public final static String FIELD_REPORGSECTORID = "REPORGSECTORID";
    /**
     *   实体属性标识[汇报部门]
     */
    public final static String FIELD_REPORGSECTORNAME = "REPORGSECTORNAME";
    /**
     *   实体属性标识[简称 ]
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
    /**
     *   实体属性标识[启用标志]
     */
    public final static String FIELD_VALIDFLAG = "VALIDFLAG";
    /**
     *   实体属性标识[虚拟部门]
     */
    public final static String FIELD_VIRTUALFLAG = "VIRTUALFLAG";

    private final static int INDEX_BIZCODE = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_LEVELCODE = 3;
    private final static int INDEX_MEMO = 4;
    private final static int INDEX_ORDERVALUE = 5;
    private final static int INDEX_ORGCODE = 6;
    private final static int INDEX_ORGID = 7;
    private final static int INDEX_ORGNAME = 8;
    private final static int INDEX_ORGSECTORID = 9;
    private final static int INDEX_ORGSECTORNAME = 10;
    private final static int INDEX_PORGSECTORID = 11;
    private final static int INDEX_PORGSECTORNAME = 12;
    private final static int INDEX_REPORGSECTORID = 13;
    private final static int INDEX_REPORGSECTORNAME = 14;
    private final static int INDEX_SHORTNAME = 15;
    private final static int INDEX_UPDATEDATE = 16;
    private final static int INDEX_UPDATEMAN = 17;
    private final static int INDEX_USERDATA = 18;
    private final static int INDEX_USERDATA2 = 19;
    private final static int INDEX_VALIDFLAG = 20;
    private final static int INDEX_VIRTUALFLAG = 21;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_BIZCODE, INDEX_BIZCODE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_LEVELCODE, INDEX_LEVELCODE);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORDERVALUE, INDEX_ORDERVALUE);
        fieldIndexMap.put( FIELD_ORGCODE, INDEX_ORGCODE);
        fieldIndexMap.put( FIELD_ORGID, INDEX_ORGID);
        fieldIndexMap.put( FIELD_ORGNAME, INDEX_ORGNAME);
        fieldIndexMap.put( FIELD_ORGSECTORID, INDEX_ORGSECTORID);
        fieldIndexMap.put( FIELD_ORGSECTORNAME, INDEX_ORGSECTORNAME);
        fieldIndexMap.put( FIELD_PORGSECTORID, INDEX_PORGSECTORID);
        fieldIndexMap.put( FIELD_PORGSECTORNAME, INDEX_PORGSECTORNAME);
        fieldIndexMap.put( FIELD_REPORGSECTORID, INDEX_REPORGSECTORID);
        fieldIndexMap.put( FIELD_REPORGSECTORNAME, INDEX_REPORGSECTORNAME);
        fieldIndexMap.put( FIELD_SHORTNAME, INDEX_SHORTNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
        fieldIndexMap.put( FIELD_VALIDFLAG, INDEX_VALIDFLAG);
        fieldIndexMap.put( FIELD_VIRTUALFLAG, INDEX_VIRTUALFLAG);
    }

    private OrgSectorBase proxyOrgSectorBase = null;

    public OrgSectorBase() {
        super();
    }
    private boolean bizcodeDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean levelcodeDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean ordervalueDirtyFlag = false;
    private boolean orgcodeDirtyFlag = false;
    private boolean orgidDirtyFlag = false;
    private boolean orgnameDirtyFlag = false;
    private boolean orgsectoridDirtyFlag = false;
    private boolean orgsectornameDirtyFlag = false;
    private boolean porgsectoridDirtyFlag = false;
    private boolean porgsectornameDirtyFlag = false;
    private boolean reporgsectoridDirtyFlag = false;
    private boolean reporgsectornameDirtyFlag = false;
    private boolean shortnameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;
    private boolean validflagDirtyFlag = false;
    private boolean virtualflagDirtyFlag = false;

    @Column(name="bizcode")
    private String bizcode;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="levelcode")
    private String levelcode;
    @Column(name="memo")
    private String memo;
    @Column(name="ordervalue")
    private Integer ordervalue;
    @Column(name="orgcode")
    private String orgcode;
    @Column(name="orgid")
    private String orgid;
    @Column(name="orgname")
    private String orgname;
    @Column(name="orgsectorid")
    private String orgsectorid;
    @Column(name="orgsectorname")
    private String orgsectorname;
    @Column(name="porgsectorid")
    private String porgsectorid;
    @Column(name="porgsectorname")
    private String porgsectorname;
    @Column(name="reporgsectorid")
    private String reporgsectorid;
    @Column(name="reporgsectorname")
    private String reporgsectorname;
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
    @Column(name="validflag")
    private Integer validflag;
    @Column(name="virtualflag")
    private Integer virtualflag;


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
     *  设置属性值[显示次序]
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
     *  获取属性值[显示次序]
     */
    public Integer getOrderValue() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrderValue();
        }
        return this.ordervalue;
    }

    /**
     *  获取属性值[显示次序]是否修改
     */
    public boolean isOrderValueDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrderValueDirty();
        }
        return this.ordervalueDirtyFlag;
    }

    /**
     *  重置属性值[显示次序]
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
     *  设置属性值[部门组织编号]
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
     *  获取属性值[部门组织编号]
     */
    public String getOrgCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgCode();
        }
        return this.orgcode;
    }

    /**
     *  获取属性值[部门组织编号]是否修改
     */
    public boolean isOrgCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgCodeDirty();
        }
        return this.orgcodeDirtyFlag;
    }

    /**
     *  重置属性值[部门组织编号]
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
     *  设置属性值[部门标识]
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
     *  获取属性值[部门标识]
     */
    public String getOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorId();
        }
        return this.orgsectorid;
    }

    /**
     *  获取属性值[部门标识]是否修改
     */
    public boolean isOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorIdDirty();
        }
        return this.orgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[部门标识]
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
     *  设置属性值[部门名称]
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
     *  获取属性值[部门名称]
     */
    public String getOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgSectorName();
        }
        return this.orgsectorname;
    }

    /**
     *  获取属性值[部门名称]是否修改
     */
    public boolean isOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgSectorNameDirty();
        }
        return this.orgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[部门名称]
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
     *  设置属性值[上级部门]
     *  @param porgsectorid
     */
    public void setPOrgSectorId(String porgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPOrgSectorId(porgsectorid);
            return;
        }
        if(porgsectorid!=null) {
            porgsectorid = StringHelper.trimRight(porgsectorid);
            if(porgsectorid.length()==0) {
                porgsectorid = null;
            }
        }
        this.porgsectorid =  porgsectorid;
        this.porgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[上级部门]
     */
    public String getPOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgSectorId();
        }
        return this.porgsectorid;
    }

    /**
     *  获取属性值[上级部门]是否修改
     */
    public boolean isPOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOrgSectorIdDirty();
        }
        return this.porgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[上级部门]
     */
    public void resetPOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOrgSectorId();
            return;
        }

        this.porgsectoridDirtyFlag = false;
        this.porgsectorid = null;
    }
    /**
     *  设置属性值[上级部门]
     *  @param porgsectorname
     */
    public void setPOrgSectorName(String porgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPOrgSectorName(porgsectorname);
            return;
        }
        if(porgsectorname!=null) {
            porgsectorname = StringHelper.trimRight(porgsectorname);
            if(porgsectorname.length()==0) {
                porgsectorname = null;
            }
        }
        this.porgsectorname =  porgsectorname;
        this.porgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[上级部门]
     */
    public String getPOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgSectorName();
        }
        return this.porgsectorname;
    }

    /**
     *  获取属性值[上级部门]是否修改
     */
    public boolean isPOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPOrgSectorNameDirty();
        }
        return this.porgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[上级部门]
     */
    public void resetPOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPOrgSectorName();
            return;
        }

        this.porgsectornameDirtyFlag = false;
        this.porgsectorname = null;
    }
    /**
     *  设置属性值[汇报部门]
     *  @param reporgsectorid
     */
    public void setRepOrgSectorId(String reporgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRepOrgSectorId(reporgsectorid);
            return;
        }
        if(reporgsectorid!=null) {
            reporgsectorid = StringHelper.trimRight(reporgsectorid);
            if(reporgsectorid.length()==0) {
                reporgsectorid = null;
            }
        }
        this.reporgsectorid =  reporgsectorid;
        this.reporgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[汇报部门]
     */
    public String getRepOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRepOrgSectorId();
        }
        return this.reporgsectorid;
    }

    /**
     *  获取属性值[汇报部门]是否修改
     */
    public boolean isRepOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRepOrgSectorIdDirty();
        }
        return this.reporgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[汇报部门]
     */
    public void resetRepOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRepOrgSectorId();
            return;
        }

        this.reporgsectoridDirtyFlag = false;
        this.reporgsectorid = null;
    }
    /**
     *  设置属性值[汇报部门]
     *  @param reporgsectorname
     */
    public void setRepOrgSectorName(String reporgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRepOrgSectorName(reporgsectorname);
            return;
        }
        if(reporgsectorname!=null) {
            reporgsectorname = StringHelper.trimRight(reporgsectorname);
            if(reporgsectorname.length()==0) {
                reporgsectorname = null;
            }
        }
        this.reporgsectorname =  reporgsectorname;
        this.reporgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[汇报部门]
     */
    public String getRepOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRepOrgSectorName();
        }
        return this.reporgsectorname;
    }

    /**
     *  获取属性值[汇报部门]是否修改
     */
    public boolean isRepOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRepOrgSectorNameDirty();
        }
        return this.reporgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[汇报部门]
     */
    public void resetRepOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRepOrgSectorName();
            return;
        }

        this.reporgsectornameDirtyFlag = false;
        this.reporgsectorname = null;
    }
    /**
     *  设置属性值[简称 ]
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
     *  获取属性值[简称 ]
     */
    public String getShortName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getShortName();
        }
        return this.shortname;
    }

    /**
     *  获取属性值[简称 ]是否修改
     */
    public boolean isShortNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isShortNameDirty();
        }
        return this.shortnameDirtyFlag;
    }

    /**
     *  重置属性值[简称 ]
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
    /**
     *  设置属性值[虚拟部门]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param virtualflag
     */
    public void setVirtualFlag(Integer virtualflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setVirtualFlag(virtualflag);
            return;
        }
        this.virtualflag =  virtualflag;
        this.virtualflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[虚拟部门]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getVirtualFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getVirtualFlag();
        }
        return this.virtualflag;
    }

    /**
     *  获取属性值[虚拟部门]是否修改
     */
    public boolean isVirtualFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isVirtualFlagDirty();
        }
        return this.virtualflagDirtyFlag;
    }

    /**
     *  重置属性值[虚拟部门]
     */
    public void resetVirtualFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetVirtualFlag();
            return;
        }

        this.virtualflagDirtyFlag = false;
        this.virtualflag = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        OrgSectorBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OrgSectorBase et) {
        et.resetBizCode();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetLevelCode();
        et.resetMemo();
        et.resetOrderValue();
        et.resetOrgCode();
        et.resetOrgId();
        et.resetOrgName();
        et.resetOrgSectorId();
        et.resetOrgSectorName();
        et.resetPOrgSectorId();
        et.resetPOrgSectorName();
        et.resetRepOrgSectorId();
        et.resetRepOrgSectorName();
        et.resetShortName();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserData();
        et.resetUserData2();
        et.resetValidFlag();
        et.resetVirtualFlag();
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
        if(!bDirtyOnly || isLevelCodeDirty()) {
            params.put(FIELD_LEVELCODE,getLevelCode());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrderValueDirty()) {
            params.put(FIELD_ORDERVALUE,getOrderValue());
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
        if(!bDirtyOnly || isOrgSectorIdDirty()) {
            params.put(FIELD_ORGSECTORID,getOrgSectorId());
        }
        if(!bDirtyOnly || isOrgSectorNameDirty()) {
            params.put(FIELD_ORGSECTORNAME,getOrgSectorName());
        }
        if(!bDirtyOnly || isPOrgSectorIdDirty()) {
            params.put(FIELD_PORGSECTORID,getPOrgSectorId());
        }
        if(!bDirtyOnly || isPOrgSectorNameDirty()) {
            params.put(FIELD_PORGSECTORNAME,getPOrgSectorName());
        }
        if(!bDirtyOnly || isRepOrgSectorIdDirty()) {
            params.put(FIELD_REPORGSECTORID,getRepOrgSectorId());
        }
        if(!bDirtyOnly || isRepOrgSectorNameDirty()) {
            params.put(FIELD_REPORGSECTORNAME,getRepOrgSectorName());
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
        if(!bDirtyOnly || isValidFlagDirty()) {
            params.put(FIELD_VALIDFLAG,getValidFlag());
        }
        if(!bDirtyOnly || isVirtualFlagDirty()) {
            params.put(FIELD_VIRTUALFLAG,getVirtualFlag());
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

        return  OrgSectorBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OrgSectorBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.getBizCode();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_LEVELCODE:
            return et.getLevelCode();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ORDERVALUE:
            return et.getOrderValue();
        case INDEX_ORGCODE:
            return et.getOrgCode();
        case INDEX_ORGID:
            return et.getOrgId();
        case INDEX_ORGNAME:
            return et.getOrgName();
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId();
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName();
        case INDEX_PORGSECTORID:
            return et.getPOrgSectorId();
        case INDEX_PORGSECTORNAME:
            return et.getPOrgSectorName();
        case INDEX_REPORGSECTORID:
            return et.getRepOrgSectorId();
        case INDEX_REPORGSECTORNAME:
            return et.getRepOrgSectorName();
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
        case INDEX_VALIDFLAG:
            return et.getValidFlag();
        case INDEX_VIRTUALFLAG:
            return et.getVirtualFlag();
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

        OrgSectorBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OrgSectorBase et,int index,Object obj) throws Exception {
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
        case INDEX_LEVELCODE:
            et.setLevelCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORDERVALUE:
            et.setOrderValue(DataObject.getIntegerValue(obj));
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
        case INDEX_ORGSECTORID:
            et.setOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGSECTORNAME:
            et.setOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_PORGSECTORID:
            et.setPOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_PORGSECTORNAME:
            et.setPOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_REPORGSECTORID:
            et.setRepOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_REPORGSECTORNAME:
            et.setRepOrgSectorName(DataObject.getStringValue(obj));
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
        case INDEX_VALIDFLAG:
            et.setValidFlag(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_VIRTUALFLAG:
            et.setVirtualFlag(DataObject.getIntegerValue(obj));
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

        return  OrgSectorBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OrgSectorBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.getBizCode()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_LEVELCODE:
            return et.getLevelCode()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ORDERVALUE:
            return et.getOrderValue()==null;
        case INDEX_ORGCODE:
            return et.getOrgCode()==null;
        case INDEX_ORGID:
            return et.getOrgId()==null;
        case INDEX_ORGNAME:
            return et.getOrgName()==null;
        case INDEX_ORGSECTORID:
            return et.getOrgSectorId()==null;
        case INDEX_ORGSECTORNAME:
            return et.getOrgSectorName()==null;
        case INDEX_PORGSECTORID:
            return et.getPOrgSectorId()==null;
        case INDEX_PORGSECTORNAME:
            return et.getPOrgSectorName()==null;
        case INDEX_REPORGSECTORID:
            return et.getRepOrgSectorId()==null;
        case INDEX_REPORGSECTORNAME:
            return et.getRepOrgSectorName()==null;
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
        case INDEX_VALIDFLAG:
            return et.getValidFlag()==null;
        case INDEX_VIRTUALFLAG:
            return et.getVirtualFlag()==null;
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

        return  OrgSectorBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OrgSectorBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BIZCODE:
            return et.isBizCodeDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_LEVELCODE:
            return et.isLevelCodeDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ORDERVALUE:
            return et.isOrderValueDirty();
        case INDEX_ORGCODE:
            return et.isOrgCodeDirty();
        case INDEX_ORGID:
            return et.isOrgIdDirty();
        case INDEX_ORGNAME:
            return et.isOrgNameDirty();
        case INDEX_ORGSECTORID:
            return et.isOrgSectorIdDirty();
        case INDEX_ORGSECTORNAME:
            return et.isOrgSectorNameDirty();
        case INDEX_PORGSECTORID:
            return et.isPOrgSectorIdDirty();
        case INDEX_PORGSECTORNAME:
            return et.isPOrgSectorNameDirty();
        case INDEX_REPORGSECTORID:
            return et.isRepOrgSectorIdDirty();
        case INDEX_REPORGSECTORNAME:
            return et.isRepOrgSectorNameDirty();
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
        case INDEX_VALIDFLAG:
            return et.isValidFlagDirty();
        case INDEX_VIRTUALFLAG:
            return et.isVirtualFlagDirty();
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
    private static  void fillJSONObject(OrgSectorBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBizCode()!=null) {
            json.put("bizcode", getJSONValue(et.getBizCode()));
        }
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
        if(bIncEmpty||et.getOrderValue()!=null) {
            json.put("ordervalue", getJSONValue(et.getOrderValue()));
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
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            json.put("orgsectorid", getJSONValue(et.getOrgSectorId()));
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            json.put("orgsectorname", getJSONValue(et.getOrgSectorName()));
        }
        if(bIncEmpty||et.getPOrgSectorId()!=null) {
            json.put("porgsectorid", getJSONValue(et.getPOrgSectorId()));
        }
        if(bIncEmpty||et.getPOrgSectorName()!=null) {
            json.put("porgsectorname", getJSONValue(et.getPOrgSectorName()));
        }
        if(bIncEmpty||et.getRepOrgSectorId()!=null) {
            json.put("reporgsectorid", getJSONValue(et.getRepOrgSectorId()));
        }
        if(bIncEmpty||et.getRepOrgSectorName()!=null) {
            json.put("reporgsectorname", getJSONValue(et.getRepOrgSectorName()));
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
        if(bIncEmpty||et.getValidFlag()!=null) {
            json.put("validflag", getJSONValue(et.getValidFlag()));
        }
        if(bIncEmpty||et.getVirtualFlag()!=null) {
            json.put("virtualflag", getJSONValue(et.getVirtualFlag()));
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
    private static void fillXmlNode(OrgSectorBase et,XmlNode node,boolean bIncEmpty) throws Exception {
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
        if(bIncEmpty||et.getLevelCode()!=null) {
            Object obj = et.getLevelCode();
            node.setAttribute("LEVELCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrderValue()!=null) {
            Object obj = et.getOrderValue();
            node.setAttribute("ORDERVALUE",(obj==null)?"":StringHelper.format("%1$s",obj));
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
        if(bIncEmpty||et.getOrgSectorId()!=null) {
            Object obj = et.getOrgSectorId();
            node.setAttribute("ORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgSectorName()!=null) {
            Object obj = et.getOrgSectorName();
            node.setAttribute("ORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOrgSectorId()!=null) {
            Object obj = et.getPOrgSectorId();
            node.setAttribute("PORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPOrgSectorName()!=null) {
            Object obj = et.getPOrgSectorName();
            node.setAttribute("PORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRepOrgSectorId()!=null) {
            Object obj = et.getRepOrgSectorId();
            node.setAttribute("REPORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRepOrgSectorName()!=null) {
            Object obj = et.getRepOrgSectorName();
            node.setAttribute("REPORGSECTORNAME",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getValidFlag()!=null) {
            Object obj = et.getValidFlag();
            node.setAttribute("VALIDFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getVirtualFlag()!=null) {
            Object obj = et.getVirtualFlag();
            node.setAttribute("VIRTUALFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        OrgSectorBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OrgSectorBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isOrderValueDirty() && (bIncEmpty||et.getOrderValue()!=null)) {
            Object obj = et.getOrderValue();
            if(obj==null) {
                dst.set(FIELD_ORDERVALUE,null);
            } else {
                dst.set(FIELD_ORDERVALUE,obj);
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
        if(et.isPOrgSectorIdDirty() && (bIncEmpty||et.getPOrgSectorId()!=null)) {
            Object obj = et.getPOrgSectorId();
            if(obj==null) {
                dst.set(FIELD_PORGSECTORID,null);
            } else {
                dst.set(FIELD_PORGSECTORID,obj);
            }
        }
        if(et.isPOrgSectorNameDirty() && (bIncEmpty||et.getPOrgSectorName()!=null)) {
            Object obj = et.getPOrgSectorName();
            if(obj==null) {
                dst.set(FIELD_PORGSECTORNAME,null);
            } else {
                dst.set(FIELD_PORGSECTORNAME,obj);
            }
        }
        if(et.isRepOrgSectorIdDirty() && (bIncEmpty||et.getRepOrgSectorId()!=null)) {
            Object obj = et.getRepOrgSectorId();
            if(obj==null) {
                dst.set(FIELD_REPORGSECTORID,null);
            } else {
                dst.set(FIELD_REPORGSECTORID,obj);
            }
        }
        if(et.isRepOrgSectorNameDirty() && (bIncEmpty||et.getRepOrgSectorName()!=null)) {
            Object obj = et.getRepOrgSectorName();
            if(obj==null) {
                dst.set(FIELD_REPORGSECTORNAME,null);
            } else {
                dst.set(FIELD_REPORGSECTORNAME,obj);
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
        if(et.isValidFlagDirty() && (bIncEmpty||et.getValidFlag()!=null)) {
            Object obj = et.getValidFlag();
            if(obj==null) {
                dst.set(FIELD_VALIDFLAG,null);
            } else {
                dst.set(FIELD_VALIDFLAG,obj);
            }
        }
        if(et.isVirtualFlagDirty() && (bIncEmpty||et.getVirtualFlag()!=null)) {
            Object obj = et.getVirtualFlag();
            if(obj==null) {
                dst.set(FIELD_VIRTUALFLAG,null);
            } else {
                dst.set(FIELD_VIRTUALFLAG,obj);
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
        return  OrgSectorBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OrgSectorBase et,int index) throws Exception {

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
        case INDEX_LEVELCODE:
            et.resetLevelCode();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ORDERVALUE:
            et.resetOrderValue();
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
        case INDEX_ORGSECTORID:
            et.resetOrgSectorId();
            return true;
        case INDEX_ORGSECTORNAME:
            et.resetOrgSectorName();
            return true;
        case INDEX_PORGSECTORID:
            et.resetPOrgSectorId();
            return true;
        case INDEX_PORGSECTORNAME:
            et.resetPOrgSectorName();
            return true;
        case INDEX_REPORGSECTORID:
            et.resetRepOrgSectorId();
            return true;
        case INDEX_REPORGSECTORNAME:
            et.resetRepOrgSectorName();
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
        case INDEX_VALIDFLAG:
            et.resetValidFlag();
            return true;
        case INDEX_VIRTUALFLAG:
            et.resetVirtualFlag();
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

    private Object objPOrgSectorLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector porgsector = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getPOrgSector() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPOrgSector();
        }

        if(this.getPOrgSectorId()==null)
            return null;
        synchronized(objPOrgSectorLock) {
            if(porgsector==null) {
                porgsector = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                porgsector.setOrgSectorId(this.getPOrgSectorId());
                net.ibizsys.psrt.srv.common.service.OrgSectorService service = (net.ibizsys.psrt.srv.common.service.OrgSectorService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgSectorService.class,this.getSessionFactory());
                if(this.getPOrgSectorId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(porgsector);
                else
                    service.get(porgsector);
            }
            return porgsector;
        }
    }

    private Object objRepOrgSectorLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector reporgsector = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getRepOrgSector() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRepOrgSector();
        }

        if(this.getRepOrgSectorId()==null)
            return null;
        synchronized(objRepOrgSectorLock) {
            if(reporgsector==null) {
                reporgsector = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                reporgsector.setOrgSectorId(this.getRepOrgSectorId());
                net.ibizsys.psrt.srv.common.service.OrgSectorService service = (net.ibizsys.psrt.srv.common.service.OrgSectorService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgSectorService.class,this.getSessionFactory());
                if(this.getRepOrgSectorId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(reporgsector);
                else
                    service.get(reporgsector);
            }
            return reporgsector;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private OrgSectorBase getProxyEntity() {
        return this.proxyOrgSectorBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOrgSectorBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OrgSectorBase) {
            this.proxyOrgSectorBase = (OrgSectorBase)proxyDataObject;
        }

    }

}