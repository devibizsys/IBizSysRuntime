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
 * 实体[TSSDTaskType] 数据对象基类
 */
public abstract class TSSDTaskTypeBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[任务对象]
     */
    public final static String FIELD_TASKOBJECT = "TASKOBJECT";
    /**
     *   实体属性标识[任务类型参数]
     */
    public final static String FIELD_TASKTYPEPARAM = "TASKTYPEPARAM";
    /**
     *   实体属性标识[任务调度任务类型标识]
     */
    public final static String FIELD_TSSDTASKTYPEID = "TSSDTASKTYPEID";
    /**
     *   实体属性标识[任务类型名称]
     */
    public final static String FIELD_TSSDTASKTYPENAME = "TSSDTASKTYPENAME";
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
    private final static int INDEX_TASKOBJECT = 2;
    private final static int INDEX_TASKTYPEPARAM = 3;
    private final static int INDEX_TSSDTASKTYPEID = 4;
    private final static int INDEX_TSSDTASKTYPENAME = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_TASKOBJECT, INDEX_TASKOBJECT);
        fieldIndexMap.put( FIELD_TASKTYPEPARAM, INDEX_TASKTYPEPARAM);
        fieldIndexMap.put( FIELD_TSSDTASKTYPEID, INDEX_TSSDTASKTYPEID);
        fieldIndexMap.put( FIELD_TSSDTASKTYPENAME, INDEX_TSSDTASKTYPENAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
    }

    private TSSDTaskTypeBase proxyTSSDTaskTypeBase = null;

    public TSSDTaskTypeBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean taskobjectDirtyFlag = false;
    private boolean tasktypeparamDirtyFlag = false;
    private boolean tssdtasktypeidDirtyFlag = false;
    private boolean tssdtasktypenameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="taskobject")
    private String taskobject;
    @Column(name="tasktypeparam")
    private String tasktypeparam;
    @Column(name="tssdtasktypeid")
    private String tssdtasktypeid;
    @Column(name="tssdtasktypename")
    private String tssdtasktypename;
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
     *  设置属性值[任务对象]
     *  @param taskobject
     */
    public void setTaskObject(String taskobject) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTaskObject(taskobject);
            return;
        }
        if(taskobject!=null) {
            taskobject = StringHelper.trimRight(taskobject);
            if(taskobject.length()==0) {
                taskobject = null;
            }
        }
        this.taskobject =  taskobject;
        this.taskobjectDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务对象]
     */
    public String getTaskObject() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTaskObject();
        }
        return this.taskobject;
    }

    /**
     *  获取属性值[任务对象]是否修改
     */
    public boolean isTaskObjectDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTaskObjectDirty();
        }
        return this.taskobjectDirtyFlag;
    }

    /**
     *  重置属性值[任务对象]
     */
    public void resetTaskObject() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTaskObject();
            return;
        }

        this.taskobjectDirtyFlag = false;
        this.taskobject = null;
    }
    /**
     *  设置属性值[任务类型参数]
     *  @param tasktypeparam
     */
    public void setTaskTypeParam(String tasktypeparam) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTaskTypeParam(tasktypeparam);
            return;
        }
        if(tasktypeparam!=null) {
            tasktypeparam = StringHelper.trimRight(tasktypeparam);
            if(tasktypeparam.length()==0) {
                tasktypeparam = null;
            }
        }
        this.tasktypeparam =  tasktypeparam;
        this.tasktypeparamDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务类型参数]
     */
    public String getTaskTypeParam() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTaskTypeParam();
        }
        return this.tasktypeparam;
    }

    /**
     *  获取属性值[任务类型参数]是否修改
     */
    public boolean isTaskTypeParamDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTaskTypeParamDirty();
        }
        return this.tasktypeparamDirtyFlag;
    }

    /**
     *  重置属性值[任务类型参数]
     */
    public void resetTaskTypeParam() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTaskTypeParam();
            return;
        }

        this.tasktypeparamDirtyFlag = false;
        this.tasktypeparam = null;
    }
    /**
     *  设置属性值[任务调度任务类型标识]
     *  @param tssdtasktypeid
     */
    public void setTSSDTaskTypeId(String tssdtasktypeid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDTaskTypeId(tssdtasktypeid);
            return;
        }
        if(tssdtasktypeid!=null) {
            tssdtasktypeid = StringHelper.trimRight(tssdtasktypeid);
            if(tssdtasktypeid.length()==0) {
                tssdtasktypeid = null;
            }
        }
        this.tssdtasktypeid =  tssdtasktypeid;
        this.tssdtasktypeidDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务调度任务类型标识]
     */
    public String getTSSDTaskTypeId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDTaskTypeId();
        }
        return this.tssdtasktypeid;
    }

    /**
     *  获取属性值[任务调度任务类型标识]是否修改
     */
    public boolean isTSSDTaskTypeIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDTaskTypeIdDirty();
        }
        return this.tssdtasktypeidDirtyFlag;
    }

    /**
     *  重置属性值[任务调度任务类型标识]
     */
    public void resetTSSDTaskTypeId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDTaskTypeId();
            return;
        }

        this.tssdtasktypeidDirtyFlag = false;
        this.tssdtasktypeid = null;
    }
    /**
     *  设置属性值[任务类型名称]
     *  @param tssdtasktypename
     */
    public void setTSSDTaskTypeName(String tssdtasktypename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDTaskTypeName(tssdtasktypename);
            return;
        }
        if(tssdtasktypename!=null) {
            tssdtasktypename = StringHelper.trimRight(tssdtasktypename);
            if(tssdtasktypename.length()==0) {
                tssdtasktypename = null;
            }
        }
        this.tssdtasktypename =  tssdtasktypename;
        this.tssdtasktypenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务类型名称]
     */
    public String getTSSDTaskTypeName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDTaskTypeName();
        }
        return this.tssdtasktypename;
    }

    /**
     *  获取属性值[任务类型名称]是否修改
     */
    public boolean isTSSDTaskTypeNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDTaskTypeNameDirty();
        }
        return this.tssdtasktypenameDirtyFlag;
    }

    /**
     *  重置属性值[任务类型名称]
     */
    public void resetTSSDTaskTypeName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDTaskTypeName();
            return;
        }

        this.tssdtasktypenameDirtyFlag = false;
        this.tssdtasktypename = null;
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
        TSSDTaskTypeBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(TSSDTaskTypeBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetTaskObject();
        et.resetTaskTypeParam();
        et.resetTSSDTaskTypeId();
        et.resetTSSDTaskTypeName();
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
        if(!bDirtyOnly || isTaskObjectDirty()) {
            params.put(FIELD_TASKOBJECT,getTaskObject());
        }
        if(!bDirtyOnly || isTaskTypeParamDirty()) {
            params.put(FIELD_TASKTYPEPARAM,getTaskTypeParam());
        }
        if(!bDirtyOnly || isTSSDTaskTypeIdDirty()) {
            params.put(FIELD_TSSDTASKTYPEID,getTSSDTaskTypeId());
        }
        if(!bDirtyOnly || isTSSDTaskTypeNameDirty()) {
            params.put(FIELD_TSSDTASKTYPENAME,getTSSDTaskTypeName());
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

        return  TSSDTaskTypeBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(TSSDTaskTypeBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_TASKOBJECT:
            return et.getTaskObject();
        case INDEX_TASKTYPEPARAM:
            return et.getTaskTypeParam();
        case INDEX_TSSDTASKTYPEID:
            return et.getTSSDTaskTypeId();
        case INDEX_TSSDTASKTYPENAME:
            return et.getTSSDTaskTypeName();
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

        TSSDTaskTypeBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(TSSDTaskTypeBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_TASKOBJECT:
            et.setTaskObject(DataObject.getStringValue(obj));
            return ;
        case INDEX_TASKTYPEPARAM:
            et.setTaskTypeParam(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDTASKTYPEID:
            et.setTSSDTaskTypeId(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDTASKTYPENAME:
            et.setTSSDTaskTypeName(DataObject.getStringValue(obj));
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

        return  TSSDTaskTypeBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(TSSDTaskTypeBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_TASKOBJECT:
            return et.getTaskObject()==null;
        case INDEX_TASKTYPEPARAM:
            return et.getTaskTypeParam()==null;
        case INDEX_TSSDTASKTYPEID:
            return et.getTSSDTaskTypeId()==null;
        case INDEX_TSSDTASKTYPENAME:
            return et.getTSSDTaskTypeName()==null;
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

        return  TSSDTaskTypeBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(TSSDTaskTypeBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_TASKOBJECT:
            return et.isTaskObjectDirty();
        case INDEX_TASKTYPEPARAM:
            return et.isTaskTypeParamDirty();
        case INDEX_TSSDTASKTYPEID:
            return et.isTSSDTaskTypeIdDirty();
        case INDEX_TSSDTASKTYPENAME:
            return et.isTSSDTaskTypeNameDirty();
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
    private static  void fillJSONObject(TSSDTaskTypeBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getTaskObject()!=null) {
            json.put("taskobject", getJSONValue(et.getTaskObject()));
        }
        if(bIncEmpty||et.getTaskTypeParam()!=null) {
            json.put("tasktypeparam", getJSONValue(et.getTaskTypeParam()));
        }
        if(bIncEmpty||et.getTSSDTaskTypeId()!=null) {
            json.put("tssdtasktypeid", getJSONValue(et.getTSSDTaskTypeId()));
        }
        if(bIncEmpty||et.getTSSDTaskTypeName()!=null) {
            json.put("tssdtasktypename", getJSONValue(et.getTSSDTaskTypeName()));
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
    private static void fillXmlNode(TSSDTaskTypeBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTaskObject()!=null) {
            Object obj = et.getTaskObject();
            node.setAttribute("TASKOBJECT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTaskTypeParam()!=null) {
            Object obj = et.getTaskTypeParam();
            node.setAttribute("TASKTYPEPARAM",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDTaskTypeId()!=null) {
            Object obj = et.getTSSDTaskTypeId();
            node.setAttribute("TSSDTASKTYPEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDTaskTypeName()!=null) {
            Object obj = et.getTSSDTaskTypeName();
            node.setAttribute("TSSDTASKTYPENAME",(obj==null)?"":(String)obj);
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
        TSSDTaskTypeBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(TSSDTaskTypeBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isTaskObjectDirty() && (bIncEmpty||et.getTaskObject()!=null)) {
            Object obj = et.getTaskObject();
            if(obj==null) {
                dst.set(FIELD_TASKOBJECT,null);
            } else {
                dst.set(FIELD_TASKOBJECT,obj);
            }
        }
        if(et.isTaskTypeParamDirty() && (bIncEmpty||et.getTaskTypeParam()!=null)) {
            Object obj = et.getTaskTypeParam();
            if(obj==null) {
                dst.set(FIELD_TASKTYPEPARAM,null);
            } else {
                dst.set(FIELD_TASKTYPEPARAM,obj);
            }
        }
        if(et.isTSSDTaskTypeIdDirty() && (bIncEmpty||et.getTSSDTaskTypeId()!=null)) {
            Object obj = et.getTSSDTaskTypeId();
            if(obj==null) {
                dst.set(FIELD_TSSDTASKTYPEID,null);
            } else {
                dst.set(FIELD_TSSDTASKTYPEID,obj);
            }
        }
        if(et.isTSSDTaskTypeNameDirty() && (bIncEmpty||et.getTSSDTaskTypeName()!=null)) {
            Object obj = et.getTSSDTaskTypeName();
            if(obj==null) {
                dst.set(FIELD_TSSDTASKTYPENAME,null);
            } else {
                dst.set(FIELD_TSSDTASKTYPENAME,obj);
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
        return  TSSDTaskTypeBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(TSSDTaskTypeBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_TASKOBJECT:
            et.resetTaskObject();
            return true;
        case INDEX_TASKTYPEPARAM:
            et.resetTaskTypeParam();
            return true;
        case INDEX_TSSDTASKTYPEID:
            et.resetTSSDTaskTypeId();
            return true;
        case INDEX_TSSDTASKTYPENAME:
            et.resetTSSDTaskTypeName();
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
    private TSSDTaskTypeBase getProxyEntity() {
        return this.proxyTSSDTaskTypeBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyTSSDTaskTypeBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof TSSDTaskTypeBase) {
            this.proxyTSSDTaskTypeBase = (TSSDTaskTypeBase)proxyDataObject;
        }

    }

}