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
 * 实体[DataSyncIn] 数据对象基类
 */
public abstract class DataSyncInBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[数据]
     */
    public final static String FIELD_DATA = "DATA";
    /**
     *   实体属性标识[数据主键]
     */
    public final static String FIELD_DATAKEY = "DATAKEY";
    /**
     *   实体属性标识[数据同步接收队列标识]
     */
    public final static String FIELD_DATASYNCINID = "DATASYNCINID";
    /**
     *   实体属性标识[数据同步接收队列名称]
     */
    public final static String FIELD_DATASYNCINNAME = "DATASYNCINNAME";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DEID = "DEID";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DENAME = "DENAME";
    /**
     *   实体属性标识[事件类型]
     */
    public final static String FIELD_EVENTTYPE = "EVENTTYPE";
    /**
     *   实体属性标识[是否为文件]
     */
    public final static String FIELD_FILEFLAG = "FILEFLAG";
    /**
     *   实体属性标识[逻辑数据]
     */
    public final static String FIELD_LOGICDATA = "LOGICDATA";
    /**
     *   实体属性标识[数据输入代理]
     */
    public final static String FIELD_SYNCAGENT = "SYNCAGENT";
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
    private final static int INDEX_DATA = 2;
    private final static int INDEX_DATAKEY = 3;
    private final static int INDEX_DATASYNCINID = 4;
    private final static int INDEX_DATASYNCINNAME = 5;
    private final static int INDEX_DEID = 6;
    private final static int INDEX_DENAME = 7;
    private final static int INDEX_EVENTTYPE = 8;
    private final static int INDEX_FILEFLAG = 9;
    private final static int INDEX_LOGICDATA = 10;
    private final static int INDEX_SYNCAGENT = 11;
    private final static int INDEX_UPDATEDATE = 12;
    private final static int INDEX_UPDATEMAN = 13;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DATA, INDEX_DATA);
        fieldIndexMap.put( FIELD_DATAKEY, INDEX_DATAKEY);
        fieldIndexMap.put( FIELD_DATASYNCINID, INDEX_DATASYNCINID);
        fieldIndexMap.put( FIELD_DATASYNCINNAME, INDEX_DATASYNCINNAME);
        fieldIndexMap.put( FIELD_DEID, INDEX_DEID);
        fieldIndexMap.put( FIELD_DENAME, INDEX_DENAME);
        fieldIndexMap.put( FIELD_EVENTTYPE, INDEX_EVENTTYPE);
        fieldIndexMap.put( FIELD_FILEFLAG, INDEX_FILEFLAG);
        fieldIndexMap.put( FIELD_LOGICDATA, INDEX_LOGICDATA);
        fieldIndexMap.put( FIELD_SYNCAGENT, INDEX_SYNCAGENT);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
    }

    private DataSyncInBase proxyDataSyncInBase = null;

    public DataSyncInBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean dataDirtyFlag = false;
    private boolean datakeyDirtyFlag = false;
    private boolean datasyncinidDirtyFlag = false;
    private boolean datasyncinnameDirtyFlag = false;
    private boolean deidDirtyFlag = false;
    private boolean denameDirtyFlag = false;
    private boolean eventtypeDirtyFlag = false;
    private boolean fileflagDirtyFlag = false;
    private boolean logicdataDirtyFlag = false;
    private boolean syncagentDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="data")
    private String data;
    @Column(name="datakey")
    private String datakey;
    @Column(name="datasyncinid")
    private String datasyncinid;
    @Column(name="datasyncinname")
    private String datasyncinname;
    @Column(name="deid")
    private String deid;
    @Column(name="dename")
    private String dename;
    @Column(name="eventtype")
    private Integer eventtype;
    @Column(name="fileflag")
    private Integer fileflag;
    @Column(name="logicdata")
    private String logicdata;
    @Column(name="syncagent")
    private String syncagent;
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
     *  设置属性值[数据]
     *  @param data
     */
    public void setData(String data) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setData(data);
            return;
        }
        if(data!=null) {
            data = StringHelper.trimRight(data);
            if(data.length()==0) {
                data = null;
            }
        }
        this.data =  data;
        this.dataDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据]
     */
    public String getData() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getData();
        }
        return this.data;
    }

    /**
     *  获取属性值[数据]是否修改
     */
    public boolean isDataDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDataDirty();
        }
        return this.dataDirtyFlag;
    }

    /**
     *  重置属性值[数据]
     */
    public void resetData() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetData();
            return;
        }

        this.dataDirtyFlag = false;
        this.data = null;
    }
    /**
     *  设置属性值[数据主键]
     *  @param datakey
     */
    public void setDataKey(String datakey) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDataKey(datakey);
            return;
        }
        if(datakey!=null) {
            datakey = StringHelper.trimRight(datakey);
            if(datakey.length()==0) {
                datakey = null;
            }
        }
        this.datakey =  datakey;
        this.datakeyDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据主键]
     */
    public String getDataKey() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDataKey();
        }
        return this.datakey;
    }

    /**
     *  获取属性值[数据主键]是否修改
     */
    public boolean isDataKeyDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDataKeyDirty();
        }
        return this.datakeyDirtyFlag;
    }

    /**
     *  重置属性值[数据主键]
     */
    public void resetDataKey() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDataKey();
            return;
        }

        this.datakeyDirtyFlag = false;
        this.datakey = null;
    }
    /**
     *  设置属性值[数据同步接收队列标识]
     *  @param datasyncinid
     */
    public void setDataSyncInId(String datasyncinid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDataSyncInId(datasyncinid);
            return;
        }
        if(datasyncinid!=null) {
            datasyncinid = StringHelper.trimRight(datasyncinid);
            if(datasyncinid.length()==0) {
                datasyncinid = null;
            }
        }
        this.datasyncinid =  datasyncinid;
        this.datasyncinidDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据同步接收队列标识]
     */
    public String getDataSyncInId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDataSyncInId();
        }
        return this.datasyncinid;
    }

    /**
     *  获取属性值[数据同步接收队列标识]是否修改
     */
    public boolean isDataSyncInIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDataSyncInIdDirty();
        }
        return this.datasyncinidDirtyFlag;
    }

    /**
     *  重置属性值[数据同步接收队列标识]
     */
    public void resetDataSyncInId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDataSyncInId();
            return;
        }

        this.datasyncinidDirtyFlag = false;
        this.datasyncinid = null;
    }
    /**
     *  设置属性值[数据同步接收队列名称]
     *  @param datasyncinname
     */
    public void setDataSyncInName(String datasyncinname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDataSyncInName(datasyncinname);
            return;
        }
        if(datasyncinname!=null) {
            datasyncinname = StringHelper.trimRight(datasyncinname);
            if(datasyncinname.length()==0) {
                datasyncinname = null;
            }
        }
        this.datasyncinname =  datasyncinname;
        this.datasyncinnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据同步接收队列名称]
     */
    public String getDataSyncInName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDataSyncInName();
        }
        return this.datasyncinname;
    }

    /**
     *  获取属性值[数据同步接收队列名称]是否修改
     */
    public boolean isDataSyncInNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDataSyncInNameDirty();
        }
        return this.datasyncinnameDirtyFlag;
    }

    /**
     *  重置属性值[数据同步接收队列名称]
     */
    public void resetDataSyncInName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDataSyncInName();
            return;
        }

        this.datasyncinnameDirtyFlag = false;
        this.datasyncinname = null;
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
     *  设置属性值[数据实体]
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
     *  获取属性值[数据实体]
     */
    public String getDEName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEName();
        }
        return this.dename;
    }

    /**
     *  获取属性值[数据实体]是否修改
     */
    public boolean isDENameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDENameDirty();
        }
        return this.denameDirtyFlag;
    }

    /**
     *  重置属性值[数据实体]
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
     *  设置属性值[事件类型]代码表：net.ibizsys.psrt.srv.codelist.DataChangeEventCodeListModel
     *  @param eventtype
     */
    public void setEventType(Integer eventtype) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setEventType(eventtype);
            return;
        }
        this.eventtype =  eventtype;
        this.eventtypeDirtyFlag  = true;
    }

    /**
     *  获取属性值[事件类型]代码表：net.ibizsys.psrt.srv.codelist.DataChangeEventCodeListModel
     */
    public Integer getEventType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getEventType();
        }
        return this.eventtype;
    }

    /**
     *  获取属性值[事件类型]是否修改
     */
    public boolean isEventTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isEventTypeDirty();
        }
        return this.eventtypeDirtyFlag;
    }

    /**
     *  重置属性值[事件类型]
     */
    public void resetEventType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetEventType();
            return;
        }

        this.eventtypeDirtyFlag = false;
        this.eventtype = null;
    }
    /**
     *  设置属性值[是否为文件]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param fileflag
     */
    public void setFileFlag(Integer fileflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileFlag(fileflag);
            return;
        }
        this.fileflag =  fileflag;
        this.fileflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[是否为文件]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getFileFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileFlag();
        }
        return this.fileflag;
    }

    /**
     *  获取属性值[是否为文件]是否修改
     */
    public boolean isFileFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileFlagDirty();
        }
        return this.fileflagDirtyFlag;
    }

    /**
     *  重置属性值[是否为文件]
     */
    public void resetFileFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileFlag();
            return;
        }

        this.fileflagDirtyFlag = false;
        this.fileflag = null;
    }
    /**
     *  设置属性值[逻辑数据]
     *  @param logicdata
     */
    public void setLogicData(String logicdata) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLogicData(logicdata);
            return;
        }
        if(logicdata!=null) {
            logicdata = StringHelper.trimRight(logicdata);
            if(logicdata.length()==0) {
                logicdata = null;
            }
        }
        this.logicdata =  logicdata;
        this.logicdataDirtyFlag  = true;
    }

    /**
     *  获取属性值[逻辑数据]
     */
    public String getLogicData() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLogicData();
        }
        return this.logicdata;
    }

    /**
     *  获取属性值[逻辑数据]是否修改
     */
    public boolean isLogicDataDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLogicDataDirty();
        }
        return this.logicdataDirtyFlag;
    }

    /**
     *  重置属性值[逻辑数据]
     */
    public void resetLogicData() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLogicData();
            return;
        }

        this.logicdataDirtyFlag = false;
        this.logicdata = null;
    }
    /**
     *  设置属性值[数据输入代理]代码表：net.ibizsys.psrt.srv.codelist.DataSyncInAgentCodeListModel
     *  @param syncagent
     */
    public void setSyncAgent(String syncagent) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSyncAgent(syncagent);
            return;
        }
        if(syncagent!=null) {
            syncagent = StringHelper.trimRight(syncagent);
            if(syncagent.length()==0) {
                syncagent = null;
            }
        }
        this.syncagent =  syncagent;
        this.syncagentDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据输入代理]代码表：net.ibizsys.psrt.srv.codelist.DataSyncInAgentCodeListModel
     */
    public String getSyncAgent() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSyncAgent();
        }
        return this.syncagent;
    }

    /**
     *  获取属性值[数据输入代理]是否修改
     */
    public boolean isSyncAgentDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSyncAgentDirty();
        }
        return this.syncagentDirtyFlag;
    }

    /**
     *  重置属性值[数据输入代理]
     */
    public void resetSyncAgent() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSyncAgent();
            return;
        }

        this.syncagentDirtyFlag = false;
        this.syncagent = null;
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
        DataSyncInBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(DataSyncInBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetData();
        et.resetDataKey();
        et.resetDataSyncInId();
        et.resetDataSyncInName();
        et.resetDEId();
        et.resetDEName();
        et.resetEventType();
        et.resetFileFlag();
        et.resetLogicData();
        et.resetSyncAgent();
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
        if(!bDirtyOnly || isDataDirty()) {
            params.put(FIELD_DATA,getData());
        }
        if(!bDirtyOnly || isDataKeyDirty()) {
            params.put(FIELD_DATAKEY,getDataKey());
        }
        if(!bDirtyOnly || isDataSyncInIdDirty()) {
            params.put(FIELD_DATASYNCINID,getDataSyncInId());
        }
        if(!bDirtyOnly || isDataSyncInNameDirty()) {
            params.put(FIELD_DATASYNCINNAME,getDataSyncInName());
        }
        if(!bDirtyOnly || isDEIdDirty()) {
            params.put(FIELD_DEID,getDEId());
        }
        if(!bDirtyOnly || isDENameDirty()) {
            params.put(FIELD_DENAME,getDEName());
        }
        if(!bDirtyOnly || isEventTypeDirty()) {
            params.put(FIELD_EVENTTYPE,getEventType());
        }
        if(!bDirtyOnly || isFileFlagDirty()) {
            params.put(FIELD_FILEFLAG,getFileFlag());
        }
        if(!bDirtyOnly || isLogicDataDirty()) {
            params.put(FIELD_LOGICDATA,getLogicData());
        }
        if(!bDirtyOnly || isSyncAgentDirty()) {
            params.put(FIELD_SYNCAGENT,getSyncAgent());
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

        return  DataSyncInBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(DataSyncInBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DATA:
            return et.getData();
        case INDEX_DATAKEY:
            return et.getDataKey();
        case INDEX_DATASYNCINID:
            return et.getDataSyncInId();
        case INDEX_DATASYNCINNAME:
            return et.getDataSyncInName();
        case INDEX_DEID:
            return et.getDEId();
        case INDEX_DENAME:
            return et.getDEName();
        case INDEX_EVENTTYPE:
            return et.getEventType();
        case INDEX_FILEFLAG:
            return et.getFileFlag();
        case INDEX_LOGICDATA:
            return et.getLogicData();
        case INDEX_SYNCAGENT:
            return et.getSyncAgent();
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

        DataSyncInBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(DataSyncInBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DATA:
            et.setData(DataObject.getStringValue(obj));
            return ;
        case INDEX_DATAKEY:
            et.setDataKey(DataObject.getStringValue(obj));
            return ;
        case INDEX_DATASYNCINID:
            et.setDataSyncInId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DATASYNCINNAME:
            et.setDataSyncInName(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEID:
            et.setDEId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DENAME:
            et.setDEName(DataObject.getStringValue(obj));
            return ;
        case INDEX_EVENTTYPE:
            et.setEventType(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_FILEFLAG:
            et.setFileFlag(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_LOGICDATA:
            et.setLogicData(DataObject.getStringValue(obj));
            return ;
        case INDEX_SYNCAGENT:
            et.setSyncAgent(DataObject.getStringValue(obj));
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

        return  DataSyncInBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(DataSyncInBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DATA:
            return et.getData()==null;
        case INDEX_DATAKEY:
            return et.getDataKey()==null;
        case INDEX_DATASYNCINID:
            return et.getDataSyncInId()==null;
        case INDEX_DATASYNCINNAME:
            return et.getDataSyncInName()==null;
        case INDEX_DEID:
            return et.getDEId()==null;
        case INDEX_DENAME:
            return et.getDEName()==null;
        case INDEX_EVENTTYPE:
            return et.getEventType()==null;
        case INDEX_FILEFLAG:
            return et.getFileFlag()==null;
        case INDEX_LOGICDATA:
            return et.getLogicData()==null;
        case INDEX_SYNCAGENT:
            return et.getSyncAgent()==null;
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

        return  DataSyncInBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(DataSyncInBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DATA:
            return et.isDataDirty();
        case INDEX_DATAKEY:
            return et.isDataKeyDirty();
        case INDEX_DATASYNCINID:
            return et.isDataSyncInIdDirty();
        case INDEX_DATASYNCINNAME:
            return et.isDataSyncInNameDirty();
        case INDEX_DEID:
            return et.isDEIdDirty();
        case INDEX_DENAME:
            return et.isDENameDirty();
        case INDEX_EVENTTYPE:
            return et.isEventTypeDirty();
        case INDEX_FILEFLAG:
            return et.isFileFlagDirty();
        case INDEX_LOGICDATA:
            return et.isLogicDataDirty();
        case INDEX_SYNCAGENT:
            return et.isSyncAgentDirty();
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
    private static  void fillJSONObject(DataSyncInBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getData()!=null) {
            json.put("data", getJSONValue(et.getData()));
        }
        if(bIncEmpty||et.getDataKey()!=null) {
            json.put("datakey", getJSONValue(et.getDataKey()));
        }
        if(bIncEmpty||et.getDataSyncInId()!=null) {
            json.put("datasyncinid", getJSONValue(et.getDataSyncInId()));
        }
        if(bIncEmpty||et.getDataSyncInName()!=null) {
            json.put("datasyncinname", getJSONValue(et.getDataSyncInName()));
        }
        if(bIncEmpty||et.getDEId()!=null) {
            json.put("deid", getJSONValue(et.getDEId()));
        }
        if(bIncEmpty||et.getDEName()!=null) {
            json.put("dename", getJSONValue(et.getDEName()));
        }
        if(bIncEmpty||et.getEventType()!=null) {
            json.put("eventtype", getJSONValue(et.getEventType()));
        }
        if(bIncEmpty||et.getFileFlag()!=null) {
            json.put("fileflag", getJSONValue(et.getFileFlag()));
        }
        if(bIncEmpty||et.getLogicData()!=null) {
            json.put("logicdata", getJSONValue(et.getLogicData()));
        }
        if(bIncEmpty||et.getSyncAgent()!=null) {
            json.put("syncagent", getJSONValue(et.getSyncAgent()));
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
    private static void fillXmlNode(DataSyncInBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getData()!=null) {
            Object obj = et.getData();
            node.setAttribute("DATA",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDataKey()!=null) {
            Object obj = et.getDataKey();
            node.setAttribute("DATAKEY",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDataSyncInId()!=null) {
            Object obj = et.getDataSyncInId();
            node.setAttribute("DATASYNCINID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDataSyncInName()!=null) {
            Object obj = et.getDataSyncInName();
            node.setAttribute("DATASYNCINNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEId()!=null) {
            Object obj = et.getDEId();
            node.setAttribute("DEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEName()!=null) {
            Object obj = et.getDEName();
            node.setAttribute("DENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEventType()!=null) {
            Object obj = et.getEventType();
            node.setAttribute("EVENTTYPE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getFileFlag()!=null) {
            Object obj = et.getFileFlag();
            node.setAttribute("FILEFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getLogicData()!=null) {
            Object obj = et.getLogicData();
            node.setAttribute("LOGICDATA",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSyncAgent()!=null) {
            Object obj = et.getSyncAgent();
            node.setAttribute("SYNCAGENT",(obj==null)?"":(String)obj);
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
        DataSyncInBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(DataSyncInBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isDataDirty() && (bIncEmpty||et.getData()!=null)) {
            Object obj = et.getData();
            if(obj==null) {
                dst.set(FIELD_DATA,null);
            } else {
                dst.set(FIELD_DATA,obj);
            }
        }
        if(et.isDataKeyDirty() && (bIncEmpty||et.getDataKey()!=null)) {
            Object obj = et.getDataKey();
            if(obj==null) {
                dst.set(FIELD_DATAKEY,null);
            } else {
                dst.set(FIELD_DATAKEY,obj);
            }
        }
        if(et.isDataSyncInIdDirty() && (bIncEmpty||et.getDataSyncInId()!=null)) {
            Object obj = et.getDataSyncInId();
            if(obj==null) {
                dst.set(FIELD_DATASYNCINID,null);
            } else {
                dst.set(FIELD_DATASYNCINID,obj);
            }
        }
        if(et.isDataSyncInNameDirty() && (bIncEmpty||et.getDataSyncInName()!=null)) {
            Object obj = et.getDataSyncInName();
            if(obj==null) {
                dst.set(FIELD_DATASYNCINNAME,null);
            } else {
                dst.set(FIELD_DATASYNCINNAME,obj);
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
        if(et.isEventTypeDirty() && (bIncEmpty||et.getEventType()!=null)) {
            Object obj = et.getEventType();
            if(obj==null) {
                dst.set(FIELD_EVENTTYPE,null);
            } else {
                dst.set(FIELD_EVENTTYPE,obj);
            }
        }
        if(et.isFileFlagDirty() && (bIncEmpty||et.getFileFlag()!=null)) {
            Object obj = et.getFileFlag();
            if(obj==null) {
                dst.set(FIELD_FILEFLAG,null);
            } else {
                dst.set(FIELD_FILEFLAG,obj);
            }
        }
        if(et.isLogicDataDirty() && (bIncEmpty||et.getLogicData()!=null)) {
            Object obj = et.getLogicData();
            if(obj==null) {
                dst.set(FIELD_LOGICDATA,null);
            } else {
                dst.set(FIELD_LOGICDATA,obj);
            }
        }
        if(et.isSyncAgentDirty() && (bIncEmpty||et.getSyncAgent()!=null)) {
            Object obj = et.getSyncAgent();
            if(obj==null) {
                dst.set(FIELD_SYNCAGENT,null);
            } else {
                dst.set(FIELD_SYNCAGENT,obj);
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
        return  DataSyncInBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(DataSyncInBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DATA:
            et.resetData();
            return true;
        case INDEX_DATAKEY:
            et.resetDataKey();
            return true;
        case INDEX_DATASYNCINID:
            et.resetDataSyncInId();
            return true;
        case INDEX_DATASYNCINNAME:
            et.resetDataSyncInName();
            return true;
        case INDEX_DEID:
            et.resetDEId();
            return true;
        case INDEX_DENAME:
            et.resetDEName();
            return true;
        case INDEX_EVENTTYPE:
            et.resetEventType();
            return true;
        case INDEX_FILEFLAG:
            et.resetFileFlag();
            return true;
        case INDEX_LOGICDATA:
            et.resetLogicData();
            return true;
        case INDEX_SYNCAGENT:
            et.resetSyncAgent();
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




    /**
     *  获取代理的数据对象
     */
    private DataSyncInBase getProxyEntity() {
        return this.proxyDataSyncInBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyDataSyncInBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof DataSyncInBase) {
            this.proxyDataSyncInBase = (DataSyncInBase)proxyDataObject;
        }

    }

}