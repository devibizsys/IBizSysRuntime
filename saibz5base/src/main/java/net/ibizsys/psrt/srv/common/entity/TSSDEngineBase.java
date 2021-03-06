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
 * 实体[TSSDEngine] 数据对象基类
 */
public abstract class TSSDEngineBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[引擎对象]
     */
    public final static String FIELD_ENGINEOBJECT = "ENGINEOBJECT";
    /**
     *   实体属性标识[引擎参数]
     */
    public final static String FIELD_ENGINEPARAM = "ENGINEPARAM";
    /**
     *   实体属性标识[任务调度引擎标识]
     */
    public final static String FIELD_TSSDENGINEID = "TSSDENGINEID";
    /**
     *   实体属性标识[任务调度引擎名称]
     */
    public final static String FIELD_TSSDENGINENAME = "TSSDENGINENAME";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_ENGINEOBJECT = 2;
    private final static int INDEX_ENGINEPARAM = 3;
    private final static int INDEX_TSSDENGINEID = 4;
    private final static int INDEX_TSSDENGINENAME = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_ENGINEOBJECT, INDEX_ENGINEOBJECT);
        fieldIndexMap.put( FIELD_ENGINEPARAM, INDEX_ENGINEPARAM);
        fieldIndexMap.put( FIELD_TSSDENGINEID, INDEX_TSSDENGINEID);
        fieldIndexMap.put( FIELD_TSSDENGINENAME, INDEX_TSSDENGINENAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
    }

    private TSSDEngineBase proxyTSSDEngineBase = null;

    public TSSDEngineBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean engineobjectDirtyFlag = false;
    private boolean engineparamDirtyFlag = false;
    private boolean tssdengineidDirtyFlag = false;
    private boolean tssdenginenameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="engineobject")
    private String engineobject;
    @Column(name="engineparam")
    private String engineparam;
    @Column(name="tssdengineid")
    private String tssdengineid;
    @Column(name="tssdenginename")
    private String tssdenginename;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;


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
     *  设置属性值[引擎参数]
     *  @param engineparam
     */
    public void setEngineParam(String engineparam) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setEngineParam(engineparam);
            return;
        }
        if(engineparam!=null) {
            engineparam = StringHelper.trimRight(engineparam);
            if(engineparam.length()==0) {
                engineparam = null;
            }
        }
        this.engineparam =  engineparam;
        this.engineparamDirtyFlag  = true;
    }

    /**
     *  获取属性值[引擎参数]
     */
    public String getEngineParam() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getEngineParam();
        }
        return this.engineparam;
    }

    /**
     *  获取属性值[引擎参数]是否修改
     */
    public boolean isEngineParamDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isEngineParamDirty();
        }
        return this.engineparamDirtyFlag;
    }

    /**
     *  重置属性值[引擎参数]
     */
    public void resetEngineParam() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetEngineParam();
            return;
        }

        this.engineparamDirtyFlag = false;
        this.engineparam = null;
    }
    /**
     *  设置属性值[任务调度引擎标识]
     *  @param tssdengineid
     */
    public void setTSSDEngineId(String tssdengineid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDEngineId(tssdengineid);
            return;
        }
        if(tssdengineid!=null) {
            tssdengineid = StringHelper.trimRight(tssdengineid);
            if(tssdengineid.length()==0) {
                tssdengineid = null;
            }
        }
        this.tssdengineid =  tssdengineid;
        this.tssdengineidDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务调度引擎标识]
     */
    public String getTSSDEngineId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDEngineId();
        }
        return this.tssdengineid;
    }

    /**
     *  获取属性值[任务调度引擎标识]是否修改
     */
    public boolean isTSSDEngineIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDEngineIdDirty();
        }
        return this.tssdengineidDirtyFlag;
    }

    /**
     *  重置属性值[任务调度引擎标识]
     */
    public void resetTSSDEngineId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDEngineId();
            return;
        }

        this.tssdengineidDirtyFlag = false;
        this.tssdengineid = null;
    }
    /**
     *  设置属性值[任务调度引擎名称]
     *  @param tssdenginename
     */
    public void setTSSDEngineName(String tssdenginename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDEngineName(tssdenginename);
            return;
        }
        if(tssdenginename!=null) {
            tssdenginename = StringHelper.trimRight(tssdenginename);
            if(tssdenginename.length()==0) {
                tssdenginename = null;
            }
        }
        this.tssdenginename =  tssdenginename;
        this.tssdenginenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务调度引擎名称]
     */
    public String getTSSDEngineName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDEngineName();
        }
        return this.tssdenginename;
    }

    /**
     *  获取属性值[任务调度引擎名称]是否修改
     */
    public boolean isTSSDEngineNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDEngineNameDirty();
        }
        return this.tssdenginenameDirtyFlag;
    }

    /**
     *  重置属性值[任务调度引擎名称]
     */
    public void resetTSSDEngineName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDEngineName();
            return;
        }

        this.tssdenginenameDirtyFlag = false;
        this.tssdenginename = null;
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

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        TSSDEngineBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(TSSDEngineBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetEngineObject();
        et.resetEngineParam();
        et.resetTSSDEngineId();
        et.resetTSSDEngineName();
        et.resetUpdateDate();
        et.resetUpdateMan();
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
        if(!bDirtyOnly || isEngineObjectDirty()) {
            params.put(FIELD_ENGINEOBJECT,getEngineObject());
        }
        if(!bDirtyOnly || isEngineParamDirty()) {
            params.put(FIELD_ENGINEPARAM,getEngineParam());
        }
        if(!bDirtyOnly || isTSSDEngineIdDirty()) {
            params.put(FIELD_TSSDENGINEID,getTSSDEngineId());
        }
        if(!bDirtyOnly || isTSSDEngineNameDirty()) {
            params.put(FIELD_TSSDENGINENAME,getTSSDEngineName());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
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

        return  TSSDEngineBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(TSSDEngineBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_ENGINEOBJECT:
            return et.getEngineObject();
        case INDEX_ENGINEPARAM:
            return et.getEngineParam();
        case INDEX_TSSDENGINEID:
            return et.getTSSDEngineId();
        case INDEX_TSSDENGINENAME:
            return et.getTSSDEngineName();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
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

        TSSDEngineBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(TSSDEngineBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENGINEOBJECT:
            et.setEngineObject(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENGINEPARAM:
            et.setEngineParam(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDENGINEID:
            et.setTSSDEngineId(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDENGINENAME:
            et.setTSSDEngineName(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
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

        return  TSSDEngineBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(TSSDEngineBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_ENGINEOBJECT:
            return et.getEngineObject()==null;
        case INDEX_ENGINEPARAM:
            return et.getEngineParam()==null;
        case INDEX_TSSDENGINEID:
            return et.getTSSDEngineId()==null;
        case INDEX_TSSDENGINENAME:
            return et.getTSSDEngineName()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
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

        return  TSSDEngineBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(TSSDEngineBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_ENGINEOBJECT:
            return et.isEngineObjectDirty();
        case INDEX_ENGINEPARAM:
            return et.isEngineParamDirty();
        case INDEX_TSSDENGINEID:
            return et.isTSSDEngineIdDirty();
        case INDEX_TSSDENGINENAME:
            return et.isTSSDEngineNameDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
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
    private static  void fillJSONObject(TSSDEngineBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getEngineObject()!=null) {
            json.put("engineobject", getJSONValue(et.getEngineObject()));
        }
        if(bIncEmpty||et.getEngineParam()!=null) {
            json.put("engineparam", getJSONValue(et.getEngineParam()));
        }
        if(bIncEmpty||et.getTSSDEngineId()!=null) {
            json.put("tssdengineid", getJSONValue(et.getTSSDEngineId()));
        }
        if(bIncEmpty||et.getTSSDEngineName()!=null) {
            json.put("tssdenginename", getJSONValue(et.getTSSDEngineName()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
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
    private static void fillXmlNode(TSSDEngineBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEngineObject()!=null) {
            Object obj = et.getEngineObject();
            node.setAttribute("ENGINEOBJECT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEngineParam()!=null) {
            Object obj = et.getEngineParam();
            node.setAttribute("ENGINEPARAM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDEngineId()!=null) {
            Object obj = et.getTSSDEngineId();
            node.setAttribute("TSSDENGINEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDEngineName()!=null) {
            Object obj = et.getTSSDEngineName();
            node.setAttribute("TSSDENGINENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        TSSDEngineBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(TSSDEngineBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isEngineObjectDirty() && (bIncEmpty||et.getEngineObject()!=null)) {
            Object obj = et.getEngineObject();
            if(obj==null) {
                dst.set(FIELD_ENGINEOBJECT,null);
            } else {
                dst.set(FIELD_ENGINEOBJECT,obj);
            }
        }
        if(et.isEngineParamDirty() && (bIncEmpty||et.getEngineParam()!=null)) {
            Object obj = et.getEngineParam();
            if(obj==null) {
                dst.set(FIELD_ENGINEPARAM,null);
            } else {
                dst.set(FIELD_ENGINEPARAM,obj);
            }
        }
        if(et.isTSSDEngineIdDirty() && (bIncEmpty||et.getTSSDEngineId()!=null)) {
            Object obj = et.getTSSDEngineId();
            if(obj==null) {
                dst.set(FIELD_TSSDENGINEID,null);
            } else {
                dst.set(FIELD_TSSDENGINEID,obj);
            }
        }
        if(et.isTSSDEngineNameDirty() && (bIncEmpty||et.getTSSDEngineName()!=null)) {
            Object obj = et.getTSSDEngineName();
            if(obj==null) {
                dst.set(FIELD_TSSDENGINENAME,null);
            } else {
                dst.set(FIELD_TSSDENGINENAME,obj);
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
        return  TSSDEngineBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(TSSDEngineBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_ENGINEOBJECT:
            et.resetEngineObject();
            return true;
        case INDEX_ENGINEPARAM:
            et.resetEngineParam();
            return true;
        case INDEX_TSSDENGINEID:
            et.resetTSSDEngineId();
            return true;
        case INDEX_TSSDENGINENAME:
            et.resetTSSDEngineName();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }







    /**
     *  获取代理的数据对象
     */
    private TSSDEngineBase getProxyEntity() {
        return this.proxyTSSDEngineBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyTSSDEngineBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof TSSDEngineBase) {
            this.proxyTSSDEngineBase = (TSSDEngineBase)proxyDataObject;
        }

    }

}