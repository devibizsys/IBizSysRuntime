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
 * 实体[TSSDTaskPolicy] 数据对象基类
 */
public abstract class TSSDTaskPolicyBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[任务运行策略]
     */
    public final static String FIELD_TSSDPOLICYID = "TSSDPOLICYID";
    /**
     *   实体属性标识[任务运行策略]
     */
    public final static String FIELD_TSSDPOLICYNAME = "TSSDPOLICYNAME";
    /**
     *   实体属性标识[调度任务]
     */
    public final static String FIELD_TSSDTASKID = "TSSDTASKID";
    /**
     *   实体属性标识[调度任务]
     */
    public final static String FIELD_TSSDTASKNAME = "TSSDTASKNAME";
    /**
     *   实体属性标识[调度任务项策略标识]
     */
    public final static String FIELD_TSSDTASKPOLICYID = "TSSDTASKPOLICYID";
    /**
     *   实体属性标识[调度任务项策略名称]
     */
    public final static String FIELD_TSSDTASKPOLICYNAME = "TSSDTASKPOLICYNAME";
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
    private final static int INDEX_TSSDPOLICYID = 2;
    private final static int INDEX_TSSDPOLICYNAME = 3;
    private final static int INDEX_TSSDTASKID = 4;
    private final static int INDEX_TSSDTASKNAME = 5;
    private final static int INDEX_TSSDTASKPOLICYID = 6;
    private final static int INDEX_TSSDTASKPOLICYNAME = 7;
    private final static int INDEX_UPDATEDATE = 8;
    private final static int INDEX_UPDATEMAN = 9;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_TSSDPOLICYID, INDEX_TSSDPOLICYID);
        fieldIndexMap.put( FIELD_TSSDPOLICYNAME, INDEX_TSSDPOLICYNAME);
        fieldIndexMap.put( FIELD_TSSDTASKID, INDEX_TSSDTASKID);
        fieldIndexMap.put( FIELD_TSSDTASKNAME, INDEX_TSSDTASKNAME);
        fieldIndexMap.put( FIELD_TSSDTASKPOLICYID, INDEX_TSSDTASKPOLICYID);
        fieldIndexMap.put( FIELD_TSSDTASKPOLICYNAME, INDEX_TSSDTASKPOLICYNAME);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
    }

    private TSSDTaskPolicyBase proxyTSSDTaskPolicyBase = null;

    public TSSDTaskPolicyBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean tssdpolicyidDirtyFlag = false;
    private boolean tssdpolicynameDirtyFlag = false;
    private boolean tssdtaskidDirtyFlag = false;
    private boolean tssdtasknameDirtyFlag = false;
    private boolean tssdtaskpolicyidDirtyFlag = false;
    private boolean tssdtaskpolicynameDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="tssdpolicyid")
    private String tssdpolicyid;
    @Column(name="tssdpolicyname")
    private String tssdpolicyname;
    @Column(name="tssdtaskid")
    private String tssdtaskid;
    @Column(name="tssdtaskname")
    private String tssdtaskname;
    @Column(name="tssdtaskpolicyid")
    private String tssdtaskpolicyid;
    @Column(name="tssdtaskpolicyname")
    private String tssdtaskpolicyname;
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
     *  设置属性值[任务运行策略]
     *  @param tssdpolicyid
     */
    public void setTSSDPolicyId(String tssdpolicyid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDPolicyId(tssdpolicyid);
            return;
        }
        if(tssdpolicyid!=null) {
            tssdpolicyid = StringHelper.trimRight(tssdpolicyid);
            if(tssdpolicyid.length()==0) {
                tssdpolicyid = null;
            }
        }
        this.tssdpolicyid =  tssdpolicyid;
        this.tssdpolicyidDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务运行策略]
     */
    public String getTSSDPolicyId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDPolicyId();
        }
        return this.tssdpolicyid;
    }

    /**
     *  获取属性值[任务运行策略]是否修改
     */
    public boolean isTSSDPolicyIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDPolicyIdDirty();
        }
        return this.tssdpolicyidDirtyFlag;
    }

    /**
     *  重置属性值[任务运行策略]
     */
    public void resetTSSDPolicyId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDPolicyId();
            return;
        }

        this.tssdpolicyidDirtyFlag = false;
        this.tssdpolicyid = null;
    }
    /**
     *  设置属性值[任务运行策略]
     *  @param tssdpolicyname
     */
    public void setTSSDPolicyName(String tssdpolicyname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDPolicyName(tssdpolicyname);
            return;
        }
        if(tssdpolicyname!=null) {
            tssdpolicyname = StringHelper.trimRight(tssdpolicyname);
            if(tssdpolicyname.length()==0) {
                tssdpolicyname = null;
            }
        }
        this.tssdpolicyname =  tssdpolicyname;
        this.tssdpolicynameDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务运行策略]
     */
    public String getTSSDPolicyName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDPolicyName();
        }
        return this.tssdpolicyname;
    }

    /**
     *  获取属性值[任务运行策略]是否修改
     */
    public boolean isTSSDPolicyNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDPolicyNameDirty();
        }
        return this.tssdpolicynameDirtyFlag;
    }

    /**
     *  重置属性值[任务运行策略]
     */
    public void resetTSSDPolicyName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDPolicyName();
            return;
        }

        this.tssdpolicynameDirtyFlag = false;
        this.tssdpolicyname = null;
    }
    /**
     *  设置属性值[调度任务]
     *  @param tssdtaskid
     */
    public void setTSSDTaskId(String tssdtaskid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDTaskId(tssdtaskid);
            return;
        }
        if(tssdtaskid!=null) {
            tssdtaskid = StringHelper.trimRight(tssdtaskid);
            if(tssdtaskid.length()==0) {
                tssdtaskid = null;
            }
        }
        this.tssdtaskid =  tssdtaskid;
        this.tssdtaskidDirtyFlag  = true;
    }

    /**
     *  获取属性值[调度任务]
     */
    public String getTSSDTaskId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDTaskId();
        }
        return this.tssdtaskid;
    }

    /**
     *  获取属性值[调度任务]是否修改
     */
    public boolean isTSSDTaskIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDTaskIdDirty();
        }
        return this.tssdtaskidDirtyFlag;
    }

    /**
     *  重置属性值[调度任务]
     */
    public void resetTSSDTaskId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDTaskId();
            return;
        }

        this.tssdtaskidDirtyFlag = false;
        this.tssdtaskid = null;
    }
    /**
     *  设置属性值[调度任务]
     *  @param tssdtaskname
     */
    public void setTSSDTaskName(String tssdtaskname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDTaskName(tssdtaskname);
            return;
        }
        if(tssdtaskname!=null) {
            tssdtaskname = StringHelper.trimRight(tssdtaskname);
            if(tssdtaskname.length()==0) {
                tssdtaskname = null;
            }
        }
        this.tssdtaskname =  tssdtaskname;
        this.tssdtasknameDirtyFlag  = true;
    }

    /**
     *  获取属性值[调度任务]
     */
    public String getTSSDTaskName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDTaskName();
        }
        return this.tssdtaskname;
    }

    /**
     *  获取属性值[调度任务]是否修改
     */
    public boolean isTSSDTaskNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDTaskNameDirty();
        }
        return this.tssdtasknameDirtyFlag;
    }

    /**
     *  重置属性值[调度任务]
     */
    public void resetTSSDTaskName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDTaskName();
            return;
        }

        this.tssdtasknameDirtyFlag = false;
        this.tssdtaskname = null;
    }
    /**
     *  设置属性值[调度任务项策略标识]
     *  @param tssdtaskpolicyid
     */
    public void setTSSDTaskPolicyId(String tssdtaskpolicyid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDTaskPolicyId(tssdtaskpolicyid);
            return;
        }
        if(tssdtaskpolicyid!=null) {
            tssdtaskpolicyid = StringHelper.trimRight(tssdtaskpolicyid);
            if(tssdtaskpolicyid.length()==0) {
                tssdtaskpolicyid = null;
            }
        }
        this.tssdtaskpolicyid =  tssdtaskpolicyid;
        this.tssdtaskpolicyidDirtyFlag  = true;
    }

    /**
     *  获取属性值[调度任务项策略标识]
     */
    public String getTSSDTaskPolicyId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDTaskPolicyId();
        }
        return this.tssdtaskpolicyid;
    }

    /**
     *  获取属性值[调度任务项策略标识]是否修改
     */
    public boolean isTSSDTaskPolicyIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDTaskPolicyIdDirty();
        }
        return this.tssdtaskpolicyidDirtyFlag;
    }

    /**
     *  重置属性值[调度任务项策略标识]
     */
    public void resetTSSDTaskPolicyId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDTaskPolicyId();
            return;
        }

        this.tssdtaskpolicyidDirtyFlag = false;
        this.tssdtaskpolicyid = null;
    }
    /**
     *  设置属性值[调度任务项策略名称]
     *  @param tssdtaskpolicyname
     */
    public void setTSSDTaskPolicyName(String tssdtaskpolicyname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDTaskPolicyName(tssdtaskpolicyname);
            return;
        }
        if(tssdtaskpolicyname!=null) {
            tssdtaskpolicyname = StringHelper.trimRight(tssdtaskpolicyname);
            if(tssdtaskpolicyname.length()==0) {
                tssdtaskpolicyname = null;
            }
        }
        this.tssdtaskpolicyname =  tssdtaskpolicyname;
        this.tssdtaskpolicynameDirtyFlag  = true;
    }

    /**
     *  获取属性值[调度任务项策略名称]
     */
    public String getTSSDTaskPolicyName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDTaskPolicyName();
        }
        return this.tssdtaskpolicyname;
    }

    /**
     *  获取属性值[调度任务项策略名称]是否修改
     */
    public boolean isTSSDTaskPolicyNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDTaskPolicyNameDirty();
        }
        return this.tssdtaskpolicynameDirtyFlag;
    }

    /**
     *  重置属性值[调度任务项策略名称]
     */
    public void resetTSSDTaskPolicyName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDTaskPolicyName();
            return;
        }

        this.tssdtaskpolicynameDirtyFlag = false;
        this.tssdtaskpolicyname = null;
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
        TSSDTaskPolicyBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(TSSDTaskPolicyBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetTSSDPolicyId();
        et.resetTSSDPolicyName();
        et.resetTSSDTaskId();
        et.resetTSSDTaskName();
        et.resetTSSDTaskPolicyId();
        et.resetTSSDTaskPolicyName();
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
        if(!bDirtyOnly || isTSSDPolicyIdDirty()) {
            params.put(FIELD_TSSDPOLICYID,getTSSDPolicyId());
        }
        if(!bDirtyOnly || isTSSDPolicyNameDirty()) {
            params.put(FIELD_TSSDPOLICYNAME,getTSSDPolicyName());
        }
        if(!bDirtyOnly || isTSSDTaskIdDirty()) {
            params.put(FIELD_TSSDTASKID,getTSSDTaskId());
        }
        if(!bDirtyOnly || isTSSDTaskNameDirty()) {
            params.put(FIELD_TSSDTASKNAME,getTSSDTaskName());
        }
        if(!bDirtyOnly || isTSSDTaskPolicyIdDirty()) {
            params.put(FIELD_TSSDTASKPOLICYID,getTSSDTaskPolicyId());
        }
        if(!bDirtyOnly || isTSSDTaskPolicyNameDirty()) {
            params.put(FIELD_TSSDTASKPOLICYNAME,getTSSDTaskPolicyName());
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

        return  TSSDTaskPolicyBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(TSSDTaskPolicyBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_TSSDPOLICYID:
            return et.getTSSDPolicyId();
        case INDEX_TSSDPOLICYNAME:
            return et.getTSSDPolicyName();
        case INDEX_TSSDTASKID:
            return et.getTSSDTaskId();
        case INDEX_TSSDTASKNAME:
            return et.getTSSDTaskName();
        case INDEX_TSSDTASKPOLICYID:
            return et.getTSSDTaskPolicyId();
        case INDEX_TSSDTASKPOLICYNAME:
            return et.getTSSDTaskPolicyName();
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

        TSSDTaskPolicyBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(TSSDTaskPolicyBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDPOLICYID:
            et.setTSSDPolicyId(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDPOLICYNAME:
            et.setTSSDPolicyName(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDTASKID:
            et.setTSSDTaskId(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDTASKNAME:
            et.setTSSDTaskName(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDTASKPOLICYID:
            et.setTSSDTaskPolicyId(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDTASKPOLICYNAME:
            et.setTSSDTaskPolicyName(DataObject.getStringValue(obj));
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

        return  TSSDTaskPolicyBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(TSSDTaskPolicyBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_TSSDPOLICYID:
            return et.getTSSDPolicyId()==null;
        case INDEX_TSSDPOLICYNAME:
            return et.getTSSDPolicyName()==null;
        case INDEX_TSSDTASKID:
            return et.getTSSDTaskId()==null;
        case INDEX_TSSDTASKNAME:
            return et.getTSSDTaskName()==null;
        case INDEX_TSSDTASKPOLICYID:
            return et.getTSSDTaskPolicyId()==null;
        case INDEX_TSSDTASKPOLICYNAME:
            return et.getTSSDTaskPolicyName()==null;
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

        return  TSSDTaskPolicyBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(TSSDTaskPolicyBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_TSSDPOLICYID:
            return et.isTSSDPolicyIdDirty();
        case INDEX_TSSDPOLICYNAME:
            return et.isTSSDPolicyNameDirty();
        case INDEX_TSSDTASKID:
            return et.isTSSDTaskIdDirty();
        case INDEX_TSSDTASKNAME:
            return et.isTSSDTaskNameDirty();
        case INDEX_TSSDTASKPOLICYID:
            return et.isTSSDTaskPolicyIdDirty();
        case INDEX_TSSDTASKPOLICYNAME:
            return et.isTSSDTaskPolicyNameDirty();
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
    private static  void fillJSONObject(TSSDTaskPolicyBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getTSSDPolicyId()!=null) {
            json.put("tssdpolicyid", getJSONValue(et.getTSSDPolicyId()));
        }
        if(bIncEmpty||et.getTSSDPolicyName()!=null) {
            json.put("tssdpolicyname", getJSONValue(et.getTSSDPolicyName()));
        }
        if(bIncEmpty||et.getTSSDTaskId()!=null) {
            json.put("tssdtaskid", getJSONValue(et.getTSSDTaskId()));
        }
        if(bIncEmpty||et.getTSSDTaskName()!=null) {
            json.put("tssdtaskname", getJSONValue(et.getTSSDTaskName()));
        }
        if(bIncEmpty||et.getTSSDTaskPolicyId()!=null) {
            json.put("tssdtaskpolicyid", getJSONValue(et.getTSSDTaskPolicyId()));
        }
        if(bIncEmpty||et.getTSSDTaskPolicyName()!=null) {
            json.put("tssdtaskpolicyname", getJSONValue(et.getTSSDTaskPolicyName()));
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
    private static void fillXmlNode(TSSDTaskPolicyBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDPolicyId()!=null) {
            Object obj = et.getTSSDPolicyId();
            node.setAttribute("TSSDPOLICYID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDPolicyName()!=null) {
            Object obj = et.getTSSDPolicyName();
            node.setAttribute("TSSDPOLICYNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDTaskId()!=null) {
            Object obj = et.getTSSDTaskId();
            node.setAttribute("TSSDTASKID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDTaskName()!=null) {
            Object obj = et.getTSSDTaskName();
            node.setAttribute("TSSDTASKNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDTaskPolicyId()!=null) {
            Object obj = et.getTSSDTaskPolicyId();
            node.setAttribute("TSSDTASKPOLICYID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDTaskPolicyName()!=null) {
            Object obj = et.getTSSDTaskPolicyName();
            node.setAttribute("TSSDTASKPOLICYNAME",(obj==null)?"":(String)obj);
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
        TSSDTaskPolicyBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(TSSDTaskPolicyBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isTSSDPolicyIdDirty() && (bIncEmpty||et.getTSSDPolicyId()!=null)) {
            Object obj = et.getTSSDPolicyId();
            if(obj==null) {
                dst.set(FIELD_TSSDPOLICYID,null);
            } else {
                dst.set(FIELD_TSSDPOLICYID,obj);
            }
        }
        if(et.isTSSDPolicyNameDirty() && (bIncEmpty||et.getTSSDPolicyName()!=null)) {
            Object obj = et.getTSSDPolicyName();
            if(obj==null) {
                dst.set(FIELD_TSSDPOLICYNAME,null);
            } else {
                dst.set(FIELD_TSSDPOLICYNAME,obj);
            }
        }
        if(et.isTSSDTaskIdDirty() && (bIncEmpty||et.getTSSDTaskId()!=null)) {
            Object obj = et.getTSSDTaskId();
            if(obj==null) {
                dst.set(FIELD_TSSDTASKID,null);
            } else {
                dst.set(FIELD_TSSDTASKID,obj);
            }
        }
        if(et.isTSSDTaskNameDirty() && (bIncEmpty||et.getTSSDTaskName()!=null)) {
            Object obj = et.getTSSDTaskName();
            if(obj==null) {
                dst.set(FIELD_TSSDTASKNAME,null);
            } else {
                dst.set(FIELD_TSSDTASKNAME,obj);
            }
        }
        if(et.isTSSDTaskPolicyIdDirty() && (bIncEmpty||et.getTSSDTaskPolicyId()!=null)) {
            Object obj = et.getTSSDTaskPolicyId();
            if(obj==null) {
                dst.set(FIELD_TSSDTASKPOLICYID,null);
            } else {
                dst.set(FIELD_TSSDTASKPOLICYID,obj);
            }
        }
        if(et.isTSSDTaskPolicyNameDirty() && (bIncEmpty||et.getTSSDTaskPolicyName()!=null)) {
            Object obj = et.getTSSDTaskPolicyName();
            if(obj==null) {
                dst.set(FIELD_TSSDTASKPOLICYNAME,null);
            } else {
                dst.set(FIELD_TSSDTASKPOLICYNAME,obj);
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
        return  TSSDTaskPolicyBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(TSSDTaskPolicyBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_TSSDPOLICYID:
            et.resetTSSDPolicyId();
            return true;
        case INDEX_TSSDPOLICYNAME:
            et.resetTSSDPolicyName();
            return true;
        case INDEX_TSSDTASKID:
            et.resetTSSDTaskId();
            return true;
        case INDEX_TSSDTASKNAME:
            et.resetTSSDTaskName();
            return true;
        case INDEX_TSSDTASKPOLICYID:
            et.resetTSSDTaskPolicyId();
            return true;
        case INDEX_TSSDTASKPOLICYNAME:
            et.resetTSSDTaskPolicyName();
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




    private Object objTSSDPolicyLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.TSSDPolicy tssdpolicy = null;
    /**
    * 获取父数据 任务时刻策略
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.TSSDPolicy getTSSDPolicy() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDPolicy();
        }

        if(this.getTSSDPolicyId()==null)
            return null;
        synchronized(objTSSDPolicyLock) {
            if(tssdpolicy==null) {
                tssdpolicy = new net.ibizsys.psrt.srv.common.entity.TSSDPolicy();
                tssdpolicy.setTSSDPolicyId(this.getTSSDPolicyId());
                net.ibizsys.psrt.srv.common.service.TSSDPolicyService service = (net.ibizsys.psrt.srv.common.service.TSSDPolicyService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.TSSDPolicyService.class,this.getSessionFactory());
                if(this.getTSSDPolicyId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(tssdpolicy);
                else
                    service.get(tssdpolicy);
            }
            return tssdpolicy;
        }
    }

    private Object objTSSDTaskLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.TSSDTask tssdtask = null;
    /**
    * 获取父数据 任务调度任务项
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.TSSDTask getTSSDTask() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDTask();
        }

        if(this.getTSSDTaskId()==null)
            return null;
        synchronized(objTSSDTaskLock) {
            if(tssdtask==null) {
                tssdtask = new net.ibizsys.psrt.srv.common.entity.TSSDTask();
                tssdtask.setTSSDTaskId(this.getTSSDTaskId());
                net.ibizsys.psrt.srv.common.service.TSSDTaskService service = (net.ibizsys.psrt.srv.common.service.TSSDTaskService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.TSSDTaskService.class,this.getSessionFactory());
                if(this.getTSSDTaskId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(tssdtask);
                else
                    service.get(tssdtask);
            }
            return tssdtask;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private TSSDTaskPolicyBase getProxyEntity() {
        return this.proxyTSSDTaskPolicyBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyTSSDTaskPolicyBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof TSSDTaskPolicyBase) {
            this.proxyTSSDTaskPolicyBase = (TSSDTaskPolicyBase)proxyDataObject;
        }

    }

}