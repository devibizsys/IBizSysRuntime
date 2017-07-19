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
 * 实体[DEDataChgDisp] 数据对象基类
 */
public abstract class DEDataChgDispBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[实体数据变更派发标识]
     */
    public final static String FIELD_DEDATACHGDISPID = "DEDATACHGDISPID";
    /**
     *   实体属性标识[数据变更派发引擎]
     */
    public final static String FIELD_DEDATACHGDISPNAME = "DEDATACHGDISPNAME";
    /**
     *   实体属性标识[引擎对象]
     */
    public final static String FIELD_ENGINEOBJECT = "ENGINEOBJECT";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[引擎次序]
     */
    public final static String FIELD_ORDERFLAG = "ORDERFLAG";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[是否启用]
     */
    public final static String FIELD_VALIDFLAG = "VALIDFLAG";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_DEDATACHGDISPID = 2;
    private final static int INDEX_DEDATACHGDISPNAME = 3;
    private final static int INDEX_ENGINEOBJECT = 4;
    private final static int INDEX_MEMO = 5;
    private final static int INDEX_ORDERFLAG = 6;
    private final static int INDEX_UPDATEDATE = 7;
    private final static int INDEX_UPDATEMAN = 8;
    private final static int INDEX_VALIDFLAG = 9;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DEDATACHGDISPID, INDEX_DEDATACHGDISPID);
        fieldIndexMap.put( FIELD_DEDATACHGDISPNAME, INDEX_DEDATACHGDISPNAME);
        fieldIndexMap.put( FIELD_ENGINEOBJECT, INDEX_ENGINEOBJECT);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_ORDERFLAG, INDEX_ORDERFLAG);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_VALIDFLAG, INDEX_VALIDFLAG);
    }

    private DEDataChgDispBase proxyDEDataChgDispBase = null;

    public DEDataChgDispBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean dedatachgdispidDirtyFlag = false;
    private boolean dedatachgdispnameDirtyFlag = false;
    private boolean engineobjectDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean orderflagDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean validflagDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="dedatachgdispid")
    private String dedatachgdispid;
    @Column(name="dedatachgdispname")
    private String dedatachgdispname;
    @Column(name="engineobject")
    private String engineobject;
    @Column(name="memo")
    private String memo;
    @Column(name="orderflag")
    private Integer orderflag;
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
     *  设置属性值[实体数据变更派发标识]
     *  @param dedatachgdispid
     */
    public void setDEDataChgDispId(String dedatachgdispid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDEDataChgDispId(dedatachgdispid);
            return;
        }
        if(dedatachgdispid!=null) {
            dedatachgdispid = StringHelper.trimRight(dedatachgdispid);
            if(dedatachgdispid.length()==0) {
                dedatachgdispid = null;
            }
        }
        this.dedatachgdispid =  dedatachgdispid;
        this.dedatachgdispidDirtyFlag  = true;
    }

    /**
     *  获取属性值[实体数据变更派发标识]
     */
    public String getDEDataChgDispId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEDataChgDispId();
        }
        return this.dedatachgdispid;
    }

    /**
     *  获取属性值[实体数据变更派发标识]是否修改
     */
    public boolean isDEDataChgDispIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDEDataChgDispIdDirty();
        }
        return this.dedatachgdispidDirtyFlag;
    }

    /**
     *  重置属性值[实体数据变更派发标识]
     */
    public void resetDEDataChgDispId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDEDataChgDispId();
            return;
        }

        this.dedatachgdispidDirtyFlag = false;
        this.dedatachgdispid = null;
    }
    /**
     *  设置属性值[数据变更派发引擎]
     *  @param dedatachgdispname
     */
    public void setDEDataChgDispName(String dedatachgdispname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDEDataChgDispName(dedatachgdispname);
            return;
        }
        if(dedatachgdispname!=null) {
            dedatachgdispname = StringHelper.trimRight(dedatachgdispname);
            if(dedatachgdispname.length()==0) {
                dedatachgdispname = null;
            }
        }
        this.dedatachgdispname =  dedatachgdispname;
        this.dedatachgdispnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据变更派发引擎]
     */
    public String getDEDataChgDispName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEDataChgDispName();
        }
        return this.dedatachgdispname;
    }

    /**
     *  获取属性值[数据变更派发引擎]是否修改
     */
    public boolean isDEDataChgDispNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDEDataChgDispNameDirty();
        }
        return this.dedatachgdispnameDirtyFlag;
    }

    /**
     *  重置属性值[数据变更派发引擎]
     */
    public void resetDEDataChgDispName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDEDataChgDispName();
            return;
        }

        this.dedatachgdispnameDirtyFlag = false;
        this.dedatachgdispname = null;
    }
    /**
     *  设置属性值[引擎对象]
     *  @param engineobject
     */
    public void setEngineObject(String engineobject) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setEngineObject(engineobject);
            return;
        }
        if(engineobject!=null) {
            engineobject = StringHelper.trimRight(engineobject);
            if(engineobject.length()==0) {
                engineobject = null;
            }
        }
        this.engineobject =  engineobject;
        this.engineobjectDirtyFlag  = true;
    }

    /**
     *  获取属性值[引擎对象]
     */
    public String getEngineObject() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getEngineObject();
        }
        return this.engineobject;
    }

    /**
     *  获取属性值[引擎对象]是否修改
     */
    public boolean isEngineObjectDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isEngineObjectDirty();
        }
        return this.engineobjectDirtyFlag;
    }

    /**
     *  重置属性值[引擎对象]
     */
    public void resetEngineObject() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetEngineObject();
            return;
        }

        this.engineobjectDirtyFlag = false;
        this.engineobject = null;
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
     *  设置属性值[引擎次序]
     *  @param orderflag
     */
    public void setOrderFlag(Integer orderflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOrderFlag(orderflag);
            return;
        }
        this.orderflag =  orderflag;
        this.orderflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[引擎次序]
     */
    public Integer getOrderFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOrderFlag();
        }
        return this.orderflag;
    }

    /**
     *  获取属性值[引擎次序]是否修改
     */
    public boolean isOrderFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOrderFlagDirty();
        }
        return this.orderflagDirtyFlag;
    }

    /**
     *  重置属性值[引擎次序]
     */
    public void resetOrderFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOrderFlag();
            return;
        }

        this.orderflagDirtyFlag = false;
        this.orderflag = null;
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
     *  设置属性值[是否启用]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
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
     *  获取属性值[是否启用]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getValidFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getValidFlag();
        }
        return this.validflag;
    }

    /**
     *  获取属性值[是否启用]是否修改
     */
    public boolean isValidFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isValidFlagDirty();
        }
        return this.validflagDirtyFlag;
    }

    /**
     *  重置属性值[是否启用]
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
        DEDataChgDispBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(DEDataChgDispBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDEDataChgDispId();
        et.resetDEDataChgDispName();
        et.resetEngineObject();
        et.resetMemo();
        et.resetOrderFlag();
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
        if(!bDirtyOnly || isDEDataChgDispIdDirty()) {
            params.put(FIELD_DEDATACHGDISPID,getDEDataChgDispId());
        }
        if(!bDirtyOnly || isDEDataChgDispNameDirty()) {
            params.put(FIELD_DEDATACHGDISPNAME,getDEDataChgDispName());
        }
        if(!bDirtyOnly || isEngineObjectDirty()) {
            params.put(FIELD_ENGINEOBJECT,getEngineObject());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOrderFlagDirty()) {
            params.put(FIELD_ORDERFLAG,getOrderFlag());
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

        return  DEDataChgDispBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(DEDataChgDispBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DEDATACHGDISPID:
            return et.getDEDataChgDispId();
        case INDEX_DEDATACHGDISPNAME:
            return et.getDEDataChgDispName();
        case INDEX_ENGINEOBJECT:
            return et.getEngineObject();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_ORDERFLAG:
            return et.getOrderFlag();
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

        DEDataChgDispBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(DEDataChgDispBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEDATACHGDISPID:
            et.setDEDataChgDispId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEDATACHGDISPNAME:
            et.setDEDataChgDispName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENGINEOBJECT:
            et.setEngineObject(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_ORDERFLAG:
            et.setOrderFlag(DataObject.getIntegerValue(obj));
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

        return  DEDataChgDispBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(DEDataChgDispBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DEDATACHGDISPID:
            return et.getDEDataChgDispId()==null;
        case INDEX_DEDATACHGDISPNAME:
            return et.getDEDataChgDispName()==null;
        case INDEX_ENGINEOBJECT:
            return et.getEngineObject()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_ORDERFLAG:
            return et.getOrderFlag()==null;
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

        return  DEDataChgDispBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(DEDataChgDispBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DEDATACHGDISPID:
            return et.isDEDataChgDispIdDirty();
        case INDEX_DEDATACHGDISPNAME:
            return et.isDEDataChgDispNameDirty();
        case INDEX_ENGINEOBJECT:
            return et.isEngineObjectDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_ORDERFLAG:
            return et.isOrderFlagDirty();
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
    private static  void fillJSONObject(DEDataChgDispBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getDEDataChgDispId()!=null) {
            json.put("dedatachgdispid", getJSONValue(et.getDEDataChgDispId()));
        }
        if(bIncEmpty||et.getDEDataChgDispName()!=null) {
            json.put("dedatachgdispname", getJSONValue(et.getDEDataChgDispName()));
        }
        if(bIncEmpty||et.getEngineObject()!=null) {
            json.put("engineobject", getJSONValue(et.getEngineObject()));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            json.put("memo", getJSONValue(et.getMemo()));
        }
        if(bIncEmpty||et.getOrderFlag()!=null) {
            json.put("orderflag", getJSONValue(et.getOrderFlag()));
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
    private static void fillXmlNode(DEDataChgDispBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEDataChgDispId()!=null) {
            Object obj = et.getDEDataChgDispId();
            node.setAttribute("DEDATACHGDISPID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEDataChgDispName()!=null) {
            Object obj = et.getDEDataChgDispName();
            node.setAttribute("DEDATACHGDISPNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEngineObject()!=null) {
            Object obj = et.getEngineObject();
            node.setAttribute("ENGINEOBJECT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOrderFlag()!=null) {
            Object obj = et.getOrderFlag();
            node.setAttribute("ORDERFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
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
        DEDataChgDispBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(DEDataChgDispBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isDEDataChgDispIdDirty() && (bIncEmpty||et.getDEDataChgDispId()!=null)) {
            Object obj = et.getDEDataChgDispId();
            if(obj==null) {
                dst.set(FIELD_DEDATACHGDISPID,null);
            } else {
                dst.set(FIELD_DEDATACHGDISPID,obj);
            }
        }
        if(et.isDEDataChgDispNameDirty() && (bIncEmpty||et.getDEDataChgDispName()!=null)) {
            Object obj = et.getDEDataChgDispName();
            if(obj==null) {
                dst.set(FIELD_DEDATACHGDISPNAME,null);
            } else {
                dst.set(FIELD_DEDATACHGDISPNAME,obj);
            }
        }
        if(et.isEngineObjectDirty() && (bIncEmpty||et.getEngineObject()!=null)) {
            Object obj = et.getEngineObject();
            if(obj==null) {
                dst.set(FIELD_ENGINEOBJECT,null);
            } else {
                dst.set(FIELD_ENGINEOBJECT,obj);
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
        if(et.isOrderFlagDirty() && (bIncEmpty||et.getOrderFlag()!=null)) {
            Object obj = et.getOrderFlag();
            if(obj==null) {
                dst.set(FIELD_ORDERFLAG,null);
            } else {
                dst.set(FIELD_ORDERFLAG,obj);
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
        return  DEDataChgDispBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(DEDataChgDispBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DEDATACHGDISPID:
            et.resetDEDataChgDispId();
            return true;
        case INDEX_DEDATACHGDISPNAME:
            et.resetDEDataChgDispName();
            return true;
        case INDEX_ENGINEOBJECT:
            et.resetEngineObject();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_ORDERFLAG:
            et.resetOrderFlag();
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
    private DEDataChgDispBase getProxyEntity() {
        return this.proxyDEDataChgDispBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyDEDataChgDispBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof DEDataChgDispBase) {
            this.proxyDEDataChgDispBase = (DEDataChgDispBase)proxyDataObject;
        }

    }

}