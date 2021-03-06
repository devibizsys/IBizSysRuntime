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
 * 实体[DataSyncIn2] 数据对象基类
 */
public abstract class DataSyncIn2Base extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[数据同步接收队列2标识]
     */
    public final static String FIELD_DATASYNCIN2ID = "DATASYNCIN2ID";
    /**
     *   实体属性标识[数据同步接收队列2名称]
     */
    public final static String FIELD_DATASYNCIN2NAME = "DATASYNCIN2NAME";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DEID = "DEID";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DENAME = "DENAME";
    /**
     *   实体属性标识[同步错误信息]
     */
    public final static String FIELD_ERROR = "ERROR";
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
    private final static int INDEX_DATASYNCIN2ID = 4;
    private final static int INDEX_DATASYNCIN2NAME = 5;
    private final static int INDEX_DEID = 6;
    private final static int INDEX_DENAME = 7;
    private final static int INDEX_ERROR = 8;
    private final static int INDEX_EVENTTYPE = 9;
    private final static int INDEX_FILEFLAG = 10;
    private final static int INDEX_LOGICDATA = 11;
    private final static int INDEX_SYNCAGENT = 12;
    private final static int INDEX_UPDATEDATE = 13;
    private final static int INDEX_UPDATEMAN = 14;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DATA, INDEX_DATA);
        fieldIndexMap.put( FIELD_DATAKEY, INDEX_DATAKEY);
        fieldIndexMap.put( FIELD_DATASYNCIN2ID, INDEX_DATASYNCIN2ID);
        fieldIndexMap.put( FIELD_DATASYNCIN2NAME, INDEX_DATASYNCIN2NAME);
        fieldIndexMap.put( FIELD_DEID, INDEX_DEID);
        fieldIndexMap.put( FIELD_DENAME, INDEX_DENAME);
        fieldIndexMap.put( FIELD_ERROR, INDEX_ERROR);
        fieldIndexMap.put( FIELD_EVENTTYPE, INDEX_EVENTTYPE);
        fieldIndexMap.put( FIELD_FILEFLAG, INDEX_FILEFLAG);
        fieldIndexMap.put( FIELD_LOGICDATA, INDEX_LOGICDATA);
        fieldIndexMap.put( FIELD_SYNCAGENT, INDEX_SYNCAGENT);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
    }

    private DataSyncIn2Base proxyDataSyncIn2Base = null;

    public DataSyncIn2Base() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean dataDirtyFlag = false;
    private boolean datakeyDirtyFlag = false;
    private boolean datasyncin2idDirtyFlag = false;
    private boolean datasyncin2nameDirtyFlag = false;
    private boolean deidDirtyFlag = false;
    private boolean denameDirtyFlag = false;
    private boolean errorDirtyFlag = false;
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
    @Column(name="datasyncin2id")
    private String datasyncin2id;
    @Column(name="datasyncin2name")
    private String datasyncin2name;
    @Column(name="deid")
    private String deid;
    @Column(name="dename")
    private String dename;
    @Column(name="error")
    private String error;
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
     *  设置属性值[数据同步接收队列2标识]
     *  @param datasyncin2id
     */
    public void setDataSyncIn2Id(String datasyncin2id) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDataSyncIn2Id(datasyncin2id);
            return;
        }
        if(datasyncin2id!=null) {
            datasyncin2id = StringHelper.trimRight(datasyncin2id);
            if(datasyncin2id.length()==0) {
                datasyncin2id = null;
            }
        }
        this.datasyncin2id =  datasyncin2id;
        this.datasyncin2idDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据同步接收队列2标识]
     */
    public String getDataSyncIn2Id() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDataSyncIn2Id();
        }
        return this.datasyncin2id;
    }

    /**
     *  获取属性值[数据同步接收队列2标识]是否修改
     */
    public boolean isDataSyncIn2IdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDataSyncIn2IdDirty();
        }
        return this.datasyncin2idDirtyFlag;
    }

    /**
     *  重置属性值[数据同步接收队列2标识]
     */
    public void resetDataSyncIn2Id() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDataSyncIn2Id();
            return;
        }

        this.datasyncin2idDirtyFlag = false;
        this.datasyncin2id = null;
    }
    /**
     *  设置属性值[数据同步接收队列2名称]
     *  @param datasyncin2name
     */
    public void setDataSyncIn2Name(String datasyncin2name) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDataSyncIn2Name(datasyncin2name);
            return;
        }
        if(datasyncin2name!=null) {
            datasyncin2name = StringHelper.trimRight(datasyncin2name);
            if(datasyncin2name.length()==0) {
                datasyncin2name = null;
            }
        }
        this.datasyncin2name =  datasyncin2name;
        this.datasyncin2nameDirtyFlag  = true;
    }

    /**
     *  获取属性值[数据同步接收队列2名称]
     */
    public String getDataSyncIn2Name() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDataSyncIn2Name();
        }
        return this.datasyncin2name;
    }

    /**
     *  获取属性值[数据同步接收队列2名称]是否修改
     */
    public boolean isDataSyncIn2NameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDataSyncIn2NameDirty();
        }
        return this.datasyncin2nameDirtyFlag;
    }

    /**
     *  重置属性值[数据同步接收队列2名称]
     */
    public void resetDataSyncIn2Name() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDataSyncIn2Name();
            return;
        }

        this.datasyncin2nameDirtyFlag = false;
        this.datasyncin2name = null;
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
     *  设置属性值[同步错误信息]
     *  @param error
     */
    public void setError(String error) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setError(error);
            return;
        }
        if(error!=null) {
            error = StringHelper.trimRight(error);
            if(error.length()==0) {
                error = null;
            }
        }
        this.error =  error;
        this.errorDirtyFlag  = true;
    }

    /**
     *  获取属性值[同步错误信息]
     */
    public String getError() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getError();
        }
        return this.error;
    }

    /**
     *  获取属性值[同步错误信息]是否修改
     */
    public boolean isErrorDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isErrorDirty();
        }
        return this.errorDirtyFlag;
    }

    /**
     *  重置属性值[同步错误信息]
     */
    public void resetError() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetError();
            return;
        }

        this.errorDirtyFlag = false;
        this.error = null;
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
        DataSyncIn2Base.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(DataSyncIn2Base et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetData();
        et.resetDataKey();
        et.resetDataSyncIn2Id();
        et.resetDataSyncIn2Name();
        et.resetDEId();
        et.resetDEName();
        et.resetError();
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
        if(!bDirtyOnly || isDataSyncIn2IdDirty()) {
            params.put(FIELD_DATASYNCIN2ID,getDataSyncIn2Id());
        }
        if(!bDirtyOnly || isDataSyncIn2NameDirty()) {
            params.put(FIELD_DATASYNCIN2NAME,getDataSyncIn2Name());
        }
        if(!bDirtyOnly || isDEIdDirty()) {
            params.put(FIELD_DEID,getDEId());
        }
        if(!bDirtyOnly || isDENameDirty()) {
            params.put(FIELD_DENAME,getDEName());
        }
        if(!bDirtyOnly || isErrorDirty()) {
            params.put(FIELD_ERROR,getError());
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

        return  DataSyncIn2Base.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(DataSyncIn2Base et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DATA:
            return et.getData();
        case INDEX_DATAKEY:
            return et.getDataKey();
        case INDEX_DATASYNCIN2ID:
            return et.getDataSyncIn2Id();
        case INDEX_DATASYNCIN2NAME:
            return et.getDataSyncIn2Name();
        case INDEX_DEID:
            return et.getDEId();
        case INDEX_DENAME:
            return et.getDEName();
        case INDEX_ERROR:
            return et.getError();
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

        DataSyncIn2Base.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(DataSyncIn2Base et,int index,Object obj) throws Exception {
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
        case INDEX_DATASYNCIN2ID:
            et.setDataSyncIn2Id(DataObject.getStringValue(obj));
            return ;
        case INDEX_DATASYNCIN2NAME:
            et.setDataSyncIn2Name(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEID:
            et.setDEId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DENAME:
            et.setDEName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ERROR:
            et.setError(DataObject.getStringValue(obj));
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

        return  DataSyncIn2Base.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(DataSyncIn2Base et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DATA:
            return et.getData()==null;
        case INDEX_DATAKEY:
            return et.getDataKey()==null;
        case INDEX_DATASYNCIN2ID:
            return et.getDataSyncIn2Id()==null;
        case INDEX_DATASYNCIN2NAME:
            return et.getDataSyncIn2Name()==null;
        case INDEX_DEID:
            return et.getDEId()==null;
        case INDEX_DENAME:
            return et.getDEName()==null;
        case INDEX_ERROR:
            return et.getError()==null;
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

        return  DataSyncIn2Base.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(DataSyncIn2Base et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DATA:
            return et.isDataDirty();
        case INDEX_DATAKEY:
            return et.isDataKeyDirty();
        case INDEX_DATASYNCIN2ID:
            return et.isDataSyncIn2IdDirty();
        case INDEX_DATASYNCIN2NAME:
            return et.isDataSyncIn2NameDirty();
        case INDEX_DEID:
            return et.isDEIdDirty();
        case INDEX_DENAME:
            return et.isDENameDirty();
        case INDEX_ERROR:
            return et.isErrorDirty();
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
    private static  void fillJSONObject(DataSyncIn2Base et,JSONObject json, boolean bIncEmpty) throws Exception {
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
        if(bIncEmpty||et.getDataSyncIn2Id()!=null) {
            json.put("datasyncin2id", getJSONValue(et.getDataSyncIn2Id()));
        }
        if(bIncEmpty||et.getDataSyncIn2Name()!=null) {
            json.put("datasyncin2name", getJSONValue(et.getDataSyncIn2Name()));
        }
        if(bIncEmpty||et.getDEId()!=null) {
            json.put("deid", getJSONValue(et.getDEId()));
        }
        if(bIncEmpty||et.getDEName()!=null) {
            json.put("dename", getJSONValue(et.getDEName()));
        }
        if(bIncEmpty||et.getError()!=null) {
            json.put("error", getJSONValue(et.getError()));
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
    private static void fillXmlNode(DataSyncIn2Base et,XmlNode node,boolean bIncEmpty) throws Exception {
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
        if(bIncEmpty||et.getDataSyncIn2Id()!=null) {
            Object obj = et.getDataSyncIn2Id();
            node.setAttribute("DATASYNCIN2ID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDataSyncIn2Name()!=null) {
            Object obj = et.getDataSyncIn2Name();
            node.setAttribute("DATASYNCIN2NAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEId()!=null) {
            Object obj = et.getDEId();
            node.setAttribute("DEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEName()!=null) {
            Object obj = et.getDEName();
            node.setAttribute("DENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getError()!=null) {
            Object obj = et.getError();
            node.setAttribute("ERROR",(obj==null)?"":(String)obj);
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
        DataSyncIn2Base.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(DataSyncIn2Base et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isDataSyncIn2IdDirty() && (bIncEmpty||et.getDataSyncIn2Id()!=null)) {
            Object obj = et.getDataSyncIn2Id();
            if(obj==null) {
                dst.set(FIELD_DATASYNCIN2ID,null);
            } else {
                dst.set(FIELD_DATASYNCIN2ID,obj);
            }
        }
        if(et.isDataSyncIn2NameDirty() && (bIncEmpty||et.getDataSyncIn2Name()!=null)) {
            Object obj = et.getDataSyncIn2Name();
            if(obj==null) {
                dst.set(FIELD_DATASYNCIN2NAME,null);
            } else {
                dst.set(FIELD_DATASYNCIN2NAME,obj);
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
        if(et.isErrorDirty() && (bIncEmpty||et.getError()!=null)) {
            Object obj = et.getError();
            if(obj==null) {
                dst.set(FIELD_ERROR,null);
            } else {
                dst.set(FIELD_ERROR,obj);
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
        return  DataSyncIn2Base.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(DataSyncIn2Base et,int index) throws Exception {

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
        case INDEX_DATASYNCIN2ID:
            et.resetDataSyncIn2Id();
            return true;
        case INDEX_DATASYNCIN2NAME:
            et.resetDataSyncIn2Name();
            return true;
        case INDEX_DEID:
            et.resetDEId();
            return true;
        case INDEX_DENAME:
            et.resetDEName();
            return true;
        case INDEX_ERROR:
            et.resetError();
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
    private DataSyncIn2Base getProxyEntity() {
        return this.proxyDataSyncIn2Base;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyDataSyncIn2Base = null;
        if(proxyDataObject!=null && proxyDataObject instanceof DataSyncIn2Base) {
            this.proxyDataSyncIn2Base = (DataSyncIn2Base)proxyDataObject;
        }

    }

}