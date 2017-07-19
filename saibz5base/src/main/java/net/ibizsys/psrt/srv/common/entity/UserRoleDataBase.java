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
 * 实体[UserRoleData] 数据对象基类
 */
public abstract class UserRoleDataBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     *   实体属性标识[条线数据类型]
     */
    public final static String FIELD_BCDR = "BCDR";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DEID = "DEID";
    /**
     *   实体属性标识[数据对象]
     */
    public final static String FIELD_DENAME = "DENAME";
    /**
     *   实体属性标识[指定当前机构]
     */
    public final static String FIELD_DSTORGID = "DSTORGID";
    /**
     *   实体属性标识[指定当前机构]
     */
    public final static String FIELD_DSTORGNAME = "DSTORGNAME";
    /**
     *   实体属性标识[指定当前部门]
     */
    public final static String FIELD_DSTORGSECTORID = "DSTORGSECTORID";
    /**
     *   实体属性标识[指定当前部门]
     */
    public final static String FIELD_DSTORGSECTORNAME = "DSTORGSECTORNAME";
    /**
     *   实体属性标识[指定部门业务类型]
     */
    public final static String FIELD_DSTSECBC = "DSTSECBC";
    /**
     *   实体属性标识[全部数据]
     */
    public final static String FIELD_ISALLDATA = "ISALLDATA";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[机构数据类型]
     */
    public final static String FIELD_ORGDR = "ORGDR";
    /**
     *   实体属性标识[部门数据类型]
     */
    public final static String FIELD_SECDR = "SECDR";
    /**
     *   实体属性标识[框架发布]
     */
    public final static String FIELD_SRFSYSPUB = "SRFSYSPUB";
    /**
     *   实体属性标识[应用发布]
     */
    public final static String FIELD_SRFUSERPUB = "SRFUSERPUB";
    /**
     *   实体属性标识[版本]
     */
    public final static String FIELD_UDVERSION = "UDVERSION";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[用户数据类型]
     */
    public final static String FIELD_USERDR = "USERDR";
    /**
     *   实体属性标识[数据对象能力标识]
     */
    public final static String FIELD_USERROLEDATAID = "USERROLEDATAID";
    /**
     *   实体属性标识[能力名称]
     */
    public final static String FIELD_USERROLEDATANAME = "USERROLEDATANAME";

    private final static int INDEX_BCDR = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_DEID = 3;
    private final static int INDEX_DENAME = 4;
    private final static int INDEX_DSTORGID = 5;
    private final static int INDEX_DSTORGNAME = 6;
    private final static int INDEX_DSTORGSECTORID = 7;
    private final static int INDEX_DSTORGSECTORNAME = 8;
    private final static int INDEX_DSTSECBC = 9;
    private final static int INDEX_ISALLDATA = 10;
    private final static int INDEX_MEMO = 11;
    private final static int INDEX_ORGDR = 12;
    private final static int INDEX_SECDR = 13;
    private final static int INDEX_SRFSYSPUB = 14;
    private final static int INDEX_SRFUSERPUB = 15;
    private final static int INDEX_UDVERSION = 16;
    private final static int INDEX_UPDATEDATE = 17;
    private final static int INDEX_UPDATEMAN = 18;
    private final static int INDEX_USERDR = 19;
    private final static int INDEX_USERROLEDATAID = 20;
    private final static int INDEX_USERROLEDATANAME = 21;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_BCDR, INDEX_BCDR);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DEID, INDEX_DEID);
        fieldIndexMap.put( FIELD_DENAME, INDEX_DENAME);
        fieldIndexMap.put( FIELD_DSTORGID, INDEX_DSTORGID);
        fieldIndexMap.put( FIELD_DSTORGNAME, INDEX_DSTORGNAME);
        fieldIndexMap.put( FIELD_DSTORGSECTORID, INDEX_DSTORGSECTORID);
        fieldIndexMap.put( FIELD_DSTORGSECTORNAME, INDEX_DSTORGSECTORNAME);
        fieldIndexMap.put( FIELD_DSTSECBC, INDEX_DSTSECBC);
        fieldIndexMap.put( FIELD_ISALLDATA, INDEX_ISALLDATA);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORGDR, INDEX_ORGDR);
        fieldIndexMap.put( FIELD_SECDR, INDEX_SECDR);
        fieldIndexMap.put( FIELD_SRFSYSPUB, INDEX_SRFSYSPUB);
        fieldIndexMap.put( FIELD_SRFUSERPUB, INDEX_SRFUSERPUB);
        fieldIndexMap.put( FIELD_UDVERSION, INDEX_UDVERSION);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDR, INDEX_USERDR);
        fieldIndexMap.put( FIELD_USERROLEDATAID, INDEX_USERROLEDATAID);
        fieldIndexMap.put( FIELD_USERROLEDATANAME, INDEX_USERROLEDATANAME);
    }

    private UserRoleDataBase proxyUserRoleDataBase = null;

    public UserRoleDataBase() {
        super();
    }
    private boolean bcdrDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean deidDirtyFlag = false;
    private boolean denameDirtyFlag = false;
    private boolean dstorgidDirtyFlag = false;
    private boolean dstorgnameDirtyFlag = false;
    private boolean dstorgsectoridDirtyFlag = false;
    private boolean dstorgsectornameDirtyFlag = false;
    private boolean dstsecbcDirtyFlag = false;
    private boolean isalldataDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean orgdrDirtyFlag = false;
    private boolean secdrDirtyFlag = false;
    private boolean srfsyspubDirtyFlag = false;
    private boolean srfuserpubDirtyFlag = false;
    private boolean udversionDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdrDirtyFlag = false;
    private boolean userroledataidDirtyFlag = false;
    private boolean userroledatanameDirtyFlag = false;

    @Column(name="bcdr")
    private Integer bcdr;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="deid")
    private String deid;
    @Column(name="dename")
    private String dename;
    @Column(name="dstorgid")
    private String dstorgid;
    @Column(name="dstorgname")
    private String dstorgname;
    @Column(name="dstorgsectorid")
    private String dstorgsectorid;
    @Column(name="dstorgsectorname")
    private String dstorgsectorname;
    @Column(name="dstsecbc")
    private String dstsecbc;
    @Column(name="isalldata")
    private Integer isalldata;
    @Column(name="memo")
    private String memo;
    @Column(name="orgdr")
    private Integer orgdr;
    @Column(name="secdr")
    private Integer secdr;
    @Column(name="srfsyspub")
    private Integer srfsyspub;
    @Column(name="srfuserpub")
    private Integer srfuserpub;
    @Column(name="udversion")
    private Integer udversion;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdr")
    private Integer userdr;
    @Column(name="userroledataid")
    private String userroledataid;
    @Column(name="userroledataname")
    private String userroledataname;


    /**
     *  设置属性值[条线数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDBCDRCodeListModel
     *  @param bcdr
     */
    public void setBCDR(Integer bcdr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setBCDR(bcdr);
            return;
        }
        this.bcdr =  bcdr;
        this.bcdrDirtyFlag  = true;
    }

    /**
     *  获取属性值[条线数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDBCDRCodeListModel
     */
    public Integer getBCDR() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getBCDR();
        }
        return this.bcdr;
    }

    /**
     *  获取属性值[条线数据类型]是否修改
     */
    public boolean isBCDRDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isBCDRDirty();
        }
        return this.bcdrDirtyFlag;
    }

    /**
     *  重置属性值[条线数据类型]
     */
    public void resetBCDR() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetBCDR();
            return;
        }

        this.bcdrDirtyFlag = false;
        this.bcdr = null;
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
     *  设置属性值[数据实体]
     *  @param deid
     */
    public void setDEId(String deid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDEId(deid);
            return;
        }
        if(deid!=null) {
            deid = StringHelper.trimRight(deid);
            if(deid.length()==0) {
                deid = null;
            }
        }
        this.deid =  deid;
        this.deidDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据实体]
     */
    public String getDEId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEId();
        }
        return this.deid;
    }

    /**
     *  获取属性值[数据实体]是否修改
     */
    public boolean isDEIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDEIdDirty();
        }
        return this.deidDirtyFlag;
    }

    /**
     *  重置属性值[数据实体]
     */
    public void resetDEId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDEId();
            return;
        }

        this.deidDirtyFlag = false;
        this.deid = null;
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
     *  设置属性值[指定当前机构]
     *  @param dstorgid
     */
    public void setDstOrgId(String dstorgid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDstOrgId(dstorgid);
            return;
        }
        if(dstorgid!=null) {
            dstorgid = StringHelper.trimRight(dstorgid);
            if(dstorgid.length()==0) {
                dstorgid = null;
            }
        }
        this.dstorgid =  dstorgid;
        this.dstorgidDirtyFlag  = true;
    }

    /**
     *  获取属性值[指定当前机构]
     */
    public String getDstOrgId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstOrgId();
        }
        return this.dstorgid;
    }

    /**
     *  获取属性值[指定当前机构]是否修改
     */
    public boolean isDstOrgIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDstOrgIdDirty();
        }
        return this.dstorgidDirtyFlag;
    }

    /**
     *  重置属性值[指定当前机构]
     */
    public void resetDstOrgId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDstOrgId();
            return;
        }

        this.dstorgidDirtyFlag = false;
        this.dstorgid = null;
    }
    /**
     *  设置属性值[指定当前机构]
     *  @param dstorgname
     */
    public void setDstOrgName(String dstorgname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDstOrgName(dstorgname);
            return;
        }
        if(dstorgname!=null) {
            dstorgname = StringHelper.trimRight(dstorgname);
            if(dstorgname.length()==0) {
                dstorgname = null;
            }
        }
        this.dstorgname =  dstorgname;
        this.dstorgnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[指定当前机构]
     */
    public String getDstOrgName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstOrgName();
        }
        return this.dstorgname;
    }

    /**
     *  获取属性值[指定当前机构]是否修改
     */
    public boolean isDstOrgNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDstOrgNameDirty();
        }
        return this.dstorgnameDirtyFlag;
    }

    /**
     *  重置属性值[指定当前机构]
     */
    public void resetDstOrgName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDstOrgName();
            return;
        }

        this.dstorgnameDirtyFlag = false;
        this.dstorgname = null;
    }
    /**
     *  设置属性值[指定当前部门]
     *  @param dstorgsectorid
     */
    public void setDstOrgSectorId(String dstorgsectorid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDstOrgSectorId(dstorgsectorid);
            return;
        }
        if(dstorgsectorid!=null) {
            dstorgsectorid = StringHelper.trimRight(dstorgsectorid);
            if(dstorgsectorid.length()==0) {
                dstorgsectorid = null;
            }
        }
        this.dstorgsectorid =  dstorgsectorid;
        this.dstorgsectoridDirtyFlag  = true;
    }

    /**
     *  获取属性值[指定当前部门]
     */
    public String getDstOrgSectorId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstOrgSectorId();
        }
        return this.dstorgsectorid;
    }

    /**
     *  获取属性值[指定当前部门]是否修改
     */
    public boolean isDstOrgSectorIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDstOrgSectorIdDirty();
        }
        return this.dstorgsectoridDirtyFlag;
    }

    /**
     *  重置属性值[指定当前部门]
     */
    public void resetDstOrgSectorId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDstOrgSectorId();
            return;
        }

        this.dstorgsectoridDirtyFlag = false;
        this.dstorgsectorid = null;
    }
    /**
     *  设置属性值[指定当前部门]
     *  @param dstorgsectorname
     */
    public void setDstOrgSectorName(String dstorgsectorname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDstOrgSectorName(dstorgsectorname);
            return;
        }
        if(dstorgsectorname!=null) {
            dstorgsectorname = StringHelper.trimRight(dstorgsectorname);
            if(dstorgsectorname.length()==0) {
                dstorgsectorname = null;
            }
        }
        this.dstorgsectorname =  dstorgsectorname;
        this.dstorgsectornameDirtyFlag  = true;
    }

    /**
     *  获取属性值[指定当前部门]
     */
    public String getDstOrgSectorName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstOrgSectorName();
        }
        return this.dstorgsectorname;
    }

    /**
     *  获取属性值[指定当前部门]是否修改
     */
    public boolean isDstOrgSectorNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDstOrgSectorNameDirty();
        }
        return this.dstorgsectornameDirtyFlag;
    }

    /**
     *  重置属性值[指定当前部门]
     */
    public void resetDstOrgSectorName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDstOrgSectorName();
            return;
        }

        this.dstorgsectornameDirtyFlag = false;
        this.dstorgsectorname = null;
    }
    /**
     *  设置属性值[指定部门业务类型]
     *  @param dstsecbc
     */
    public void setDstSecBC(String dstsecbc) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDstSecBC(dstsecbc);
            return;
        }
        if(dstsecbc!=null) {
            dstsecbc = StringHelper.trimRight(dstsecbc);
            if(dstsecbc.length()==0) {
                dstsecbc = null;
            }
        }
        this.dstsecbc =  dstsecbc;
        this.dstsecbcDirtyFlag  = true;
    }

    /**
     *  获取属性值[指定部门业务类型]
     */
    public String getDstSecBC() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstSecBC();
        }
        return this.dstsecbc;
    }

    /**
     *  获取属性值[指定部门业务类型]是否修改
     */
    public boolean isDstSecBCDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDstSecBCDirty();
        }
        return this.dstsecbcDirtyFlag;
    }

    /**
     *  重置属性值[指定部门业务类型]
     */
    public void resetDstSecBC() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDstSecBC();
            return;
        }

        this.dstsecbcDirtyFlag = false;
        this.dstsecbc = null;
    }
    /**
     *  设置属性值[全部数据]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param isalldata
     */
    public void setIsAllData(Integer isalldata) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIsAllData(isalldata);
            return;
        }
        this.isalldata =  isalldata;
        this.isalldataDirtyFlag  = true;
    }

    /**
     *  获取属性值[全部数据]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getIsAllData() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIsAllData();
        }
        return this.isalldata;
    }

    /**
     *  获取属性值[全部数据]是否修改
     */
    public boolean isIsAllDataDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIsAllDataDirty();
        }
        return this.isalldataDirtyFlag;
    }

    /**
     *  重置属性值[全部数据]
     */
    public void resetIsAllData() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIsAllData();
            return;
        }

        this.isalldataDirtyFlag = false;
        this.isalldata = null;
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
     *  设置属性值[机构数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDOrgDRCodeListModel
     *  @param orgdr
     */
    public void setOrgDR(Integer orgdr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrgDR(orgdr);
            return;
        }
        this.orgdr =  orgdr;
        this.orgdrDirtyFlag  = true;
    }

    /**
     *  获取属性值[机构数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDOrgDRCodeListModel
     */
    public Integer getOrgDR() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgDR();
        }
        return this.orgdr;
    }

    /**
     *  获取属性值[机构数据类型]是否修改
     */
    public boolean isOrgDRDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgDRDirty();
        }
        return this.orgdrDirtyFlag;
    }

    /**
     *  重置属性值[机构数据类型]
     */
    public void resetOrgDR() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrgDR();
            return;
        }

        this.orgdrDirtyFlag = false;
        this.orgdr = null;
    }
    /**
     *  设置属性值[部门数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDSecDRCodeListModel
     *  @param secdr
     */
    public void setSecDR(Integer secdr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSecDR(secdr);
            return;
        }
        this.secdr =  secdr;
        this.secdrDirtyFlag  = true;
    }

    /**
     *  获取属性值[部门数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDSecDRCodeListModel
     */
    public Integer getSecDR() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSecDR();
        }
        return this.secdr;
    }

    /**
     *  获取属性值[部门数据类型]是否修改
     */
    public boolean isSecDRDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSecDRDirty();
        }
        return this.secdrDirtyFlag;
    }

    /**
     *  重置属性值[部门数据类型]
     */
    public void resetSecDR() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSecDR();
            return;
        }

        this.secdrDirtyFlag = false;
        this.secdr = null;
    }
    /**
     *  设置属性值[框架发布]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param srfsyspub
     */
    public void setSRFSysPub(Integer srfsyspub) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSRFSysPub(srfsyspub);
            return;
        }
        this.srfsyspub =  srfsyspub;
        this.srfsyspubDirtyFlag  = true;
    }

    /**
     *  获取属性值[框架发布]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getSRFSysPub() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSRFSysPub();
        }
        return this.srfsyspub;
    }

    /**
     *  获取属性值[框架发布]是否修改
     */
    public boolean isSRFSysPubDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSRFSysPubDirty();
        }
        return this.srfsyspubDirtyFlag;
    }

    /**
     *  重置属性值[框架发布]
     */
    public void resetSRFSysPub() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSRFSysPub();
            return;
        }

        this.srfsyspubDirtyFlag = false;
        this.srfsyspub = null;
    }
    /**
     *  设置属性值[应用发布]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param srfuserpub
     */
    public void setSRFUserPub(Integer srfuserpub) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSRFUserPub(srfuserpub);
            return;
        }
        this.srfuserpub =  srfuserpub;
        this.srfuserpubDirtyFlag  = true;
    }

    /**
     *  获取属性值[应用发布]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getSRFUserPub() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSRFUserPub();
        }
        return this.srfuserpub;
    }

    /**
     *  获取属性值[应用发布]是否修改
     */
    public boolean isSRFUserPubDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSRFUserPubDirty();
        }
        return this.srfuserpubDirtyFlag;
    }

    /**
     *  重置属性值[应用发布]
     */
    public void resetSRFUserPub() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSRFUserPub();
            return;
        }

        this.srfuserpubDirtyFlag = false;
        this.srfuserpub = null;
    }
    /**
     *  设置属性值[版本]
     *  @param udversion
     */
    public void setUDVersion(Integer udversion) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUDVersion(udversion);
            return;
        }
        this.udversion =  udversion;
        this.udversionDirtyFlag  = true;
    }

    /**
     *  获取属性值[版本]
     */
    public Integer getUDVersion() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUDVersion();
        }
        return this.udversion;
    }

    /**
     *  获取属性值[版本]是否修改
     */
    public boolean isUDVersionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUDVersionDirty();
        }
        return this.udversionDirtyFlag;
    }

    /**
     *  重置属性值[版本]
     */
    public void resetUDVersion() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUDVersion();
            return;
        }

        this.udversionDirtyFlag = false;
        this.udversion = null;
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
     *  设置属性值[用户数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDUserDRCodeListModel
     *  @param userdr
     */
    public void setUserDR(Integer userdr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDR(userdr);
            return;
        }
        this.userdr =  userdr;
        this.userdrDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据类型]代码表：net.ibizsys.psrt.srv.codelist.URDUserDRCodeListModel
     */
    public Integer getUserDR() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDR();
        }
        return this.userdr;
    }

    /**
     *  获取属性值[用户数据类型]是否修改
     */
    public boolean isUserDRDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDRDirty();
        }
        return this.userdrDirtyFlag;
    }

    /**
     *  重置属性值[用户数据类型]
     */
    public void resetUserDR() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDR();
            return;
        }

        this.userdrDirtyFlag = false;
        this.userdr = null;
    }
    /**
     *  设置属性值[数据对象能力标识]
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
     *  获取属性值[数据对象能力标识]
     */
    public String getUserRoleDataId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataId();
        }
        return this.userroledataid;
    }

    /**
     *  获取属性值[数据对象能力标识]是否修改
     */
    public boolean isUserRoleDataIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataIdDirty();
        }
        return this.userroledataidDirtyFlag;
    }

    /**
     *  重置属性值[数据对象能力标识]
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
     *  设置属性值[能力名称]
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
     *  获取属性值[能力名称]
     */
    public String getUserRoleDataName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDataName();
        }
        return this.userroledataname;
    }

    /**
     *  获取属性值[能力名称]是否修改
     */
    public boolean isUserRoleDataNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDataNameDirty();
        }
        return this.userroledatanameDirtyFlag;
    }

    /**
     *  重置属性值[能力名称]
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
        UserRoleDataBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserRoleDataBase et) {
        et.resetBCDR();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDEId();
        et.resetDEName();
        et.resetDstOrgId();
        et.resetDstOrgName();
        et.resetDstOrgSectorId();
        et.resetDstOrgSectorName();
        et.resetDstSecBC();
        et.resetIsAllData();
        et.resetMemo();
        et.resetOrgDR();
        et.resetSecDR();
        et.resetSRFSysPub();
        et.resetSRFUserPub();
        et.resetUDVersion();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserDR();
        et.resetUserRoleDataId();
        et.resetUserRoleDataName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isBCDRDirty()) {
            params.put(FIELD_BCDR,getBCDR());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isDEIdDirty()) {
            params.put(FIELD_DEID,getDEId());
        }
        if(!bDirtyOnly || isDENameDirty()) {
            params.put(FIELD_DENAME,getDEName());
        }
        if(!bDirtyOnly || isDstOrgIdDirty()) {
            params.put(FIELD_DSTORGID,getDstOrgId());
        }
        if(!bDirtyOnly || isDstOrgNameDirty()) {
            params.put(FIELD_DSTORGNAME,getDstOrgName());
        }
        if(!bDirtyOnly || isDstOrgSectorIdDirty()) {
            params.put(FIELD_DSTORGSECTORID,getDstOrgSectorId());
        }
        if(!bDirtyOnly || isDstOrgSectorNameDirty()) {
            params.put(FIELD_DSTORGSECTORNAME,getDstOrgSectorName());
        }
        if(!bDirtyOnly || isDstSecBCDirty()) {
            params.put(FIELD_DSTSECBC,getDstSecBC());
        }
        if(!bDirtyOnly || isIsAllDataDirty()) {
            params.put(FIELD_ISALLDATA,getIsAllData());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrgDRDirty()) {
            params.put(FIELD_ORGDR,getOrgDR());
        }
        if(!bDirtyOnly || isSecDRDirty()) {
            params.put(FIELD_SECDR,getSecDR());
        }
        if(!bDirtyOnly || isSRFSysPubDirty()) {
            params.put(FIELD_SRFSYSPUB,getSRFSysPub());
        }
        if(!bDirtyOnly || isSRFUserPubDirty()) {
            params.put(FIELD_SRFUSERPUB,getSRFUserPub());
        }
        if(!bDirtyOnly || isUDVersionDirty()) {
            params.put(FIELD_UDVERSION,getUDVersion());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserDRDirty()) {
            params.put(FIELD_USERDR,getUserDR());
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

        return  UserRoleDataBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserRoleDataBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BCDR:
            return et.getBCDR();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DEID:
            return et.getDEId();
        case INDEX_DENAME:
            return et.getDEName();
        case INDEX_DSTORGID:
            return et.getDstOrgId();
        case INDEX_DSTORGNAME:
            return et.getDstOrgName();
        case INDEX_DSTORGSECTORID:
            return et.getDstOrgSectorId();
        case INDEX_DSTORGSECTORNAME:
            return et.getDstOrgSectorName();
        case INDEX_DSTSECBC:
            return et.getDstSecBC();
        case INDEX_ISALLDATA:
            return et.getIsAllData();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ORGDR:
            return et.getOrgDR();
        case INDEX_SECDR:
            return et.getSecDR();
        case INDEX_SRFSYSPUB:
            return et.getSRFSysPub();
        case INDEX_SRFUSERPUB:
            return et.getSRFUserPub();
        case INDEX_UDVERSION:
            return et.getUDVersion();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDR:
            return et.getUserDR();
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

        UserRoleDataBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserRoleDataBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_BCDR:
            et.setBCDR(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEID:
            et.setDEId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DENAME:
            et.setDEName(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSTORGID:
            et.setDstOrgId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSTORGNAME:
            et.setDstOrgName(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSTORGSECTORID:
            et.setDstOrgSectorId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSTORGSECTORNAME:
            et.setDstOrgSectorName(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSTSECBC:
            et.setDstSecBC(DataObject.getStringValue(obj));
            return ;
        case INDEX_ISALLDATA:
            et.setIsAllData(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGDR:
            et.setOrgDR(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SECDR:
            et.setSecDR(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SRFSYSPUB:
            et.setSRFSysPub(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SRFUSERPUB:
            et.setSRFUserPub(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_UDVERSION:
            et.setUDVersion(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDR:
            et.setUserDR(DataObject.getIntegerValue(obj));
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

        return  UserRoleDataBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserRoleDataBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BCDR:
            return et.getBCDR()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DEID:
            return et.getDEId()==null;
        case INDEX_DENAME:
            return et.getDEName()==null;
        case INDEX_DSTORGID:
            return et.getDstOrgId()==null;
        case INDEX_DSTORGNAME:
            return et.getDstOrgName()==null;
        case INDEX_DSTORGSECTORID:
            return et.getDstOrgSectorId()==null;
        case INDEX_DSTORGSECTORNAME:
            return et.getDstOrgSectorName()==null;
        case INDEX_DSTSECBC:
            return et.getDstSecBC()==null;
        case INDEX_ISALLDATA:
            return et.getIsAllData()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ORGDR:
            return et.getOrgDR()==null;
        case INDEX_SECDR:
            return et.getSecDR()==null;
        case INDEX_SRFSYSPUB:
            return et.getSRFSysPub()==null;
        case INDEX_SRFUSERPUB:
            return et.getSRFUserPub()==null;
        case INDEX_UDVERSION:
            return et.getUDVersion()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDR:
            return et.getUserDR()==null;
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

        return  UserRoleDataBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserRoleDataBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BCDR:
            return et.isBCDRDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DEID:
            return et.isDEIdDirty();
        case INDEX_DENAME:
            return et.isDENameDirty();
        case INDEX_DSTORGID:
            return et.isDstOrgIdDirty();
        case INDEX_DSTORGNAME:
            return et.isDstOrgNameDirty();
        case INDEX_DSTORGSECTORID:
            return et.isDstOrgSectorIdDirty();
        case INDEX_DSTORGSECTORNAME:
            return et.isDstOrgSectorNameDirty();
        case INDEX_DSTSECBC:
            return et.isDstSecBCDirty();
        case INDEX_ISALLDATA:
            return et.isIsAllDataDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ORGDR:
            return et.isOrgDRDirty();
        case INDEX_SECDR:
            return et.isSecDRDirty();
        case INDEX_SRFSYSPUB:
            return et.isSRFSysPubDirty();
        case INDEX_SRFUSERPUB:
            return et.isSRFUserPubDirty();
        case INDEX_UDVERSION:
            return et.isUDVersionDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDR:
            return et.isUserDRDirty();
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
    private static  void fillJSONObject(UserRoleDataBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBCDR()!=null) {
            json.put("bcdr", getJSONValue(et.getBCDR()));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getDEId()!=null) {
            json.put("deid", getJSONValue(et.getDEId()));
        }
        if(bIncEmpty||et.getDEName()!=null) {
            json.put("dename", getJSONValue(et.getDEName()));
        }
        if(bIncEmpty||et.getDstOrgId()!=null) {
            json.put("dstorgid", getJSONValue(et.getDstOrgId()));
        }
        if(bIncEmpty||et.getDstOrgName()!=null) {
            json.put("dstorgname", getJSONValue(et.getDstOrgName()));
        }
        if(bIncEmpty||et.getDstOrgSectorId()!=null) {
            json.put("dstorgsectorid", getJSONValue(et.getDstOrgSectorId()));
        }
        if(bIncEmpty||et.getDstOrgSectorName()!=null) {
            json.put("dstorgsectorname", getJSONValue(et.getDstOrgSectorName()));
        }
        if(bIncEmpty||et.getDstSecBC()!=null) {
            json.put("dstsecbc", getJSONValue(et.getDstSecBC()));
        }
        if(bIncEmpty||et.getIsAllData()!=null) {
            json.put("isalldata", getJSONValue(et.getIsAllData()));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            json.put("memo", getJSONValue(et.getMemo()));
        }
        if(bIncEmpty||et.getOrgDR()!=null) {
            json.put("orgdr", getJSONValue(et.getOrgDR()));
        }
        if(bIncEmpty||et.getSecDR()!=null) {
            json.put("secdr", getJSONValue(et.getSecDR()));
        }
        if(bIncEmpty||et.getSRFSysPub()!=null) {
            json.put("srfsyspub", getJSONValue(et.getSRFSysPub()));
        }
        if(bIncEmpty||et.getSRFUserPub()!=null) {
            json.put("srfuserpub", getJSONValue(et.getSRFUserPub()));
        }
        if(bIncEmpty||et.getUDVersion()!=null) {
            json.put("udversion", getJSONValue(et.getUDVersion()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserDR()!=null) {
            json.put("userdr", getJSONValue(et.getUserDR()));
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
    private static void fillXmlNode(UserRoleDataBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getBCDR()!=null) {
            Object obj = et.getBCDR();
            node.setAttribute("BCDR",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEId()!=null) {
            Object obj = et.getDEId();
            node.setAttribute("DEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEName()!=null) {
            Object obj = et.getDEName();
            node.setAttribute("DENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDstOrgId()!=null) {
            Object obj = et.getDstOrgId();
            node.setAttribute("DSTORGID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDstOrgName()!=null) {
            Object obj = et.getDstOrgName();
            node.setAttribute("DSTORGNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDstOrgSectorId()!=null) {
            Object obj = et.getDstOrgSectorId();
            node.setAttribute("DSTORGSECTORID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDstOrgSectorName()!=null) {
            Object obj = et.getDstOrgSectorName();
            node.setAttribute("DSTORGSECTORNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDstSecBC()!=null) {
            Object obj = et.getDstSecBC();
            node.setAttribute("DSTSECBC",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getIsAllData()!=null) {
            Object obj = et.getIsAllData();
            node.setAttribute("ISALLDATA",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgDR()!=null) {
            Object obj = et.getOrgDR();
            node.setAttribute("ORGDR",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSecDR()!=null) {
            Object obj = et.getSecDR();
            node.setAttribute("SECDR",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSRFSysPub()!=null) {
            Object obj = et.getSRFSysPub();
            node.setAttribute("SRFSYSPUB",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSRFUserPub()!=null) {
            Object obj = et.getSRFUserPub();
            node.setAttribute("SRFUSERPUB",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getUDVersion()!=null) {
            Object obj = et.getUDVersion();
            node.setAttribute("UDVERSION",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDR()!=null) {
            Object obj = et.getUserDR();
            node.setAttribute("USERDR",(obj==null)?"":StringHelper.format("%1$s",obj));
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
        UserRoleDataBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserRoleDataBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isBCDRDirty() && (bIncEmpty||et.getBCDR()!=null)) {
            Object obj = et.getBCDR();
            if(obj==null) {
                dst.set(FIELD_BCDR,null);
            } else {
                dst.set(FIELD_BCDR,obj);
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
        if(et.isDEIdDirty() && (bIncEmpty||et.getDEId()!=null)) {
            Object obj = et.getDEId();
            if(obj==null) {
                dst.set(FIELD_DEID,null);
            } else {
                dst.set(FIELD_DEID,obj);
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
        if(et.isDstOrgIdDirty() && (bIncEmpty||et.getDstOrgId()!=null)) {
            Object obj = et.getDstOrgId();
            if(obj==null) {
                dst.set(FIELD_DSTORGID,null);
            } else {
                dst.set(FIELD_DSTORGID,obj);
            }
        }
        if(et.isDstOrgNameDirty() && (bIncEmpty||et.getDstOrgName()!=null)) {
            Object obj = et.getDstOrgName();
            if(obj==null) {
                dst.set(FIELD_DSTORGNAME,null);
            } else {
                dst.set(FIELD_DSTORGNAME,obj);
            }
        }
        if(et.isDstOrgSectorIdDirty() && (bIncEmpty||et.getDstOrgSectorId()!=null)) {
            Object obj = et.getDstOrgSectorId();
            if(obj==null) {
                dst.set(FIELD_DSTORGSECTORID,null);
            } else {
                dst.set(FIELD_DSTORGSECTORID,obj);
            }
        }
        if(et.isDstOrgSectorNameDirty() && (bIncEmpty||et.getDstOrgSectorName()!=null)) {
            Object obj = et.getDstOrgSectorName();
            if(obj==null) {
                dst.set(FIELD_DSTORGSECTORNAME,null);
            } else {
                dst.set(FIELD_DSTORGSECTORNAME,obj);
            }
        }
        if(et.isDstSecBCDirty() && (bIncEmpty||et.getDstSecBC()!=null)) {
            Object obj = et.getDstSecBC();
            if(obj==null) {
                dst.set(FIELD_DSTSECBC,null);
            } else {
                dst.set(FIELD_DSTSECBC,obj);
            }
        }
        if(et.isIsAllDataDirty() && (bIncEmpty||et.getIsAllData()!=null)) {
            Object obj = et.getIsAllData();
            if(obj==null) {
                dst.set(FIELD_ISALLDATA,null);
            } else {
                dst.set(FIELD_ISALLDATA,obj);
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
        if(et.isOrgDRDirty() && (bIncEmpty||et.getOrgDR()!=null)) {
            Object obj = et.getOrgDR();
            if(obj==null) {
                dst.set(FIELD_ORGDR,null);
            } else {
                dst.set(FIELD_ORGDR,obj);
            }
        }
        if(et.isSecDRDirty() && (bIncEmpty||et.getSecDR()!=null)) {
            Object obj = et.getSecDR();
            if(obj==null) {
                dst.set(FIELD_SECDR,null);
            } else {
                dst.set(FIELD_SECDR,obj);
            }
        }
        if(et.isSRFSysPubDirty() && (bIncEmpty||et.getSRFSysPub()!=null)) {
            Object obj = et.getSRFSysPub();
            if(obj==null) {
                dst.set(FIELD_SRFSYSPUB,null);
            } else {
                dst.set(FIELD_SRFSYSPUB,obj);
            }
        }
        if(et.isSRFUserPubDirty() && (bIncEmpty||et.getSRFUserPub()!=null)) {
            Object obj = et.getSRFUserPub();
            if(obj==null) {
                dst.set(FIELD_SRFUSERPUB,null);
            } else {
                dst.set(FIELD_SRFUSERPUB,obj);
            }
        }
        if(et.isUDVersionDirty() && (bIncEmpty||et.getUDVersion()!=null)) {
            Object obj = et.getUDVersion();
            if(obj==null) {
                dst.set(FIELD_UDVERSION,null);
            } else {
                dst.set(FIELD_UDVERSION,obj);
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
        if(et.isUserDRDirty() && (bIncEmpty||et.getUserDR()!=null)) {
            Object obj = et.getUserDR();
            if(obj==null) {
                dst.set(FIELD_USERDR,null);
            } else {
                dst.set(FIELD_USERDR,obj);
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
        return  UserRoleDataBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserRoleDataBase et,int index) throws Exception {

        switch(index) {
        case INDEX_BCDR:
            et.resetBCDR();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DEID:
            et.resetDEId();
            return true;
        case INDEX_DENAME:
            et.resetDEName();
            return true;
        case INDEX_DSTORGID:
            et.resetDstOrgId();
            return true;
        case INDEX_DSTORGNAME:
            et.resetDstOrgName();
            return true;
        case INDEX_DSTORGSECTORID:
            et.resetDstOrgSectorId();
            return true;
        case INDEX_DSTORGSECTORNAME:
            et.resetDstOrgSectorName();
            return true;
        case INDEX_DSTSECBC:
            et.resetDstSecBC();
            return true;
        case INDEX_ISALLDATA:
            et.resetIsAllData();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ORGDR:
            et.resetOrgDR();
            return true;
        case INDEX_SECDR:
            et.resetSecDR();
            return true;
        case INDEX_SRFSYSPUB:
            et.resetSRFSysPub();
            return true;
        case INDEX_SRFUSERPUB:
            et.resetSRFUserPub();
            return true;
        case INDEX_UDVERSION:
            et.resetUDVersion();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERDR:
            et.resetUserDR();
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




    private Object objDELock = new Object();
    private net.ibizsys.psrt.srv.demodel.entity.DataEntity de = null;
    /**
    * 获取父数据 实体
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.demodel.entity.DataEntity getDE() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDE();
        }

        if(this.getDEId()==null)
            return null;
        synchronized(objDELock) {
            if(de==null) {
                de = new net.ibizsys.psrt.srv.demodel.entity.DataEntity();
                de.setDEId(this.getDEId());
                net.ibizsys.psrt.srv.demodel.service.DataEntityService service = (net.ibizsys.psrt.srv.demodel.service.DataEntityService)ServiceGlobal.getService(net.ibizsys.psrt.srv.demodel.service.DataEntityService.class,this.getSessionFactory());
                if(this.getDEId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(de);
                else
                    service.get(de);
            }
            return de;
        }
    }

    private Object objDstOrgLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.Org dstorg = null;
    /**
    * 获取父数据 组织机构
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.Org getDstOrg() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstOrg();
        }

        if(this.getDstOrgId()==null)
            return null;
        synchronized(objDstOrgLock) {
            if(dstorg==null) {
                dstorg = new net.ibizsys.psrt.srv.common.entity.Org();
                dstorg.setOrgId(this.getDstOrgId());
                net.ibizsys.psrt.srv.common.service.OrgService service = (net.ibizsys.psrt.srv.common.service.OrgService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgService.class,this.getSessionFactory());
                if(this.getDstOrgId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(dstorg);
                else
                    service.get(dstorg);
            }
            return dstorg;
        }
    }

    private Object objDstOrgSectorLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.OrgSector dstorgsector = null;
    /**
    * 获取父数据 组织部门
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.OrgSector getDstOrgSector() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstOrgSector();
        }

        if(this.getDstOrgSectorId()==null)
            return null;
        synchronized(objDstOrgSectorLock) {
            if(dstorgsector==null) {
                dstorgsector = new net.ibizsys.psrt.srv.common.entity.OrgSector();
                dstorgsector.setOrgSectorId(this.getDstOrgSectorId());
                net.ibizsys.psrt.srv.common.service.OrgSectorService service = (net.ibizsys.psrt.srv.common.service.OrgSectorService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.OrgSectorService.class,this.getSessionFactory());
                if(this.getDstOrgSectorId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(dstorgsector);
                else
                    service.get(dstorgsector);
            }
            return dstorgsector;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private UserRoleDataBase getProxyEntity() {
        return this.proxyUserRoleDataBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserRoleDataBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserRoleDataBase) {
            this.proxyUserRoleDataBase = (UserRoleDataBase)proxyDataObject;
        }

    }

}