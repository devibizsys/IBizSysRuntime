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
 * 实体[OrgUserLevel] 数据对象基类
 */
public abstract class OrgUserLevelBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[级别代码]
     */
    public final static String FIELD_LEVELCODE = "LEVELCODE";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[排序值]
     */
    public final static String FIELD_ORDERVALUE = "ORDERVALUE";
    /**
     *   实体属性标识[组织人员级别标识]
     */
    public final static String FIELD_ORGUSERLEVELID = "ORGUSERLEVELID";
    /**
     *   实体属性标识[人员级别名称]
     */
    public final static String FIELD_ORGUSERLEVELNAME = "ORGUSERLEVELNAME";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[启用标志]
     */
    public final static String FIELD_VALIDFLAG = "VALIDFLAG";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_LEVELCODE = 2;
    private final static int INDEX_MEMO = 3;
    private final static int INDEX_ORDERVALUE = 4;
    private final static int INDEX_ORGUSERLEVELID = 5;
    private final static int INDEX_ORGUSERLEVELNAME = 6;
    private final static int INDEX_UPDATEDATE = 7;
    private final static int INDEX_UPDATEMAN = 8;
    private final static int INDEX_VALIDFLAG = 9;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_LEVELCODE, INDEX_LEVELCODE);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORDERVALUE, INDEX_ORDERVALUE);
        fieldIndexMap.put( FIELD_ORGUSERLEVELID, INDEX_ORGUSERLEVELID);
        fieldIndexMap.put( FIELD_ORGUSERLEVELNAME, INDEX_ORGUSERLEVELNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_VALIDFLAG, INDEX_VALIDFLAG);
    }

    private OrgUserLevelBase proxyOrgUserLevelBase = null;

    public OrgUserLevelBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean levelcodeDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean ordervalueDirtyFlag = false;
    private boolean orguserlevelidDirtyFlag = false;
    private boolean orguserlevelnameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean validflagDirtyFlag = false;

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
    @Column(name="orguserlevelid")
    private String orguserlevelid;
    @Column(name="orguserlevelname")
    private String orguserlevelname;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
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
     *  设置属性值[级别代码]
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
     *  获取属性值[级别代码]
     */
    public String getLevelCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLevelCode();
        }
        return this.levelcode;
    }

    /**
     *  获取属性值[级别代码]是否修改
     */
    public boolean isLevelCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLevelCodeDirty();
        }
        return this.levelcodeDirtyFlag;
    }

    /**
     *  重置属性值[级别代码]
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
     *  设置属性值[排序值]
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
     *  获取属性值[排序值]
     */
    public Integer getOrderValue() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrderValue();
        }
        return this.ordervalue;
    }

    /**
     *  获取属性值[排序值]是否修改
     */
    public boolean isOrderValueDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrderValueDirty();
        }
        return this.ordervalueDirtyFlag;
    }

    /**
     *  重置属性值[排序值]
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
     *  设置属性值[组织人员级别标识]
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
     *  获取属性值[组织人员级别标识]
     */
    public String getOrgUserLevelId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserLevelId();
        }
        return this.orguserlevelid;
    }

    /**
     *  获取属性值[组织人员级别标识]是否修改
     */
    public boolean isOrgUserLevelIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserLevelIdDirty();
        }
        return this.orguserlevelidDirtyFlag;
    }

    /**
     *  重置属性值[组织人员级别标识]
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
     *  设置属性值[人员级别名称]
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
     *  获取属性值[人员级别名称]
     */
    public String getOrgUserLevelName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrgUserLevelName();
        }
        return this.orguserlevelname;
    }

    /**
     *  获取属性值[人员级别名称]是否修改
     */
    public boolean isOrgUserLevelNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrgUserLevelNameDirty();
        }
        return this.orguserlevelnameDirtyFlag;
    }

    /**
     *  重置属性值[人员级别名称]
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
        OrgUserLevelBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(OrgUserLevelBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetLevelCode();
        et.resetMemo();
        et.resetOrderValue();
        et.resetOrgUserLevelId();
        et.resetOrgUserLevelName();
        et.resetUpdateDate();
        et.resetUpdateMan();
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
        if(!bDirtyOnly || isLevelCodeDirty()) {
            params.put(FIELD_LEVELCODE,getLevelCode());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrderValueDirty()) {
            params.put(FIELD_ORDERVALUE,getOrderValue());
        }
        if(!bDirtyOnly || isOrgUserLevelIdDirty()) {
            params.put(FIELD_ORGUSERLEVELID,getOrgUserLevelId());
        }
        if(!bDirtyOnly || isOrgUserLevelNameDirty()) {
            params.put(FIELD_ORGUSERLEVELNAME,getOrgUserLevelName());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
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

        return  OrgUserLevelBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(OrgUserLevelBase et,int index) throws Exception {

        switch(index) {
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
        case INDEX_ORGUSERLEVELID:
            return et.getOrgUserLevelId();
        case INDEX_ORGUSERLEVELNAME:
            return et.getOrgUserLevelName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
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

        OrgUserLevelBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(OrgUserLevelBase et,int index,Object obj) throws Exception {
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
        case INDEX_ORDERVALUE:
            et.setOrderValue(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_ORGUSERLEVELID:
            et.setOrgUserLevelId(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORGUSERLEVELNAME:
            et.setOrgUserLevelName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
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

        return  OrgUserLevelBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(OrgUserLevelBase et,int index) throws Exception {

        switch(index) {
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
        case INDEX_ORGUSERLEVELID:
            return et.getOrgUserLevelId()==null;
        case INDEX_ORGUSERLEVELNAME:
            return et.getOrgUserLevelName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
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

        return  OrgUserLevelBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(OrgUserLevelBase et,int index) throws Exception {

        switch(index) {
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
        case INDEX_ORGUSERLEVELID:
            return et.isOrgUserLevelIdDirty();
        case INDEX_ORGUSERLEVELNAME:
            return et.isOrgUserLevelNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
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
    private static  void fillJSONObject(OrgUserLevelBase et,JSONObject json, boolean bIncEmpty) throws Exception {
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
        if(bIncEmpty||et.getOrgUserLevelId()!=null) {
            json.put("orguserlevelid", getJSONValue(et.getOrgUserLevelId()));
        }
        if(bIncEmpty||et.getOrgUserLevelName()!=null) {
            json.put("orguserlevelname", getJSONValue(et.getOrgUserLevelName()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
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
    private static void fillXmlNode(OrgUserLevelBase et,XmlNode node,boolean bIncEmpty) throws Exception {
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
        if(bIncEmpty||et.getOrgUserLevelId()!=null) {
            Object obj = et.getOrgUserLevelId();
            node.setAttribute("ORGUSERLEVELID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrgUserLevelName()!=null) {
            Object obj = et.getOrgUserLevelName();
            node.setAttribute("ORGUSERLEVELNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
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
        OrgUserLevelBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(OrgUserLevelBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        return  OrgUserLevelBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(OrgUserLevelBase et,int index) throws Exception {

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
        case INDEX_ORDERVALUE:
            et.resetOrderValue();
            return true;
        case INDEX_ORGUSERLEVELID:
            et.resetOrgUserLevelId();
            return true;
        case INDEX_ORGUSERLEVELNAME:
            et.resetOrgUserLevelName();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_VALIDFLAG:
            et.resetValidFlag();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }







    /**
     *  获取代理的数据对象
     */
    private OrgUserLevelBase getProxyEntity() {
        return this.proxyOrgUserLevelBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyOrgUserLevelBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof OrgUserLevelBase) {
            this.proxyOrgUserLevelBase = (OrgUserLevelBase)proxyDataObject;
        }

    }

}