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
 * 实体[MsgSendQueue] 数据对象基类
 */
public abstract class MsgSendQueueBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     *   实体属性标识[消息内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[内容类型]
     */
    public final static String FIELD_CONTENTTYPE = "CONTENTTYPE";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[目标地址]
     */
    public final static String FIELD_DSTADDRESSES = "DSTADDRESSES";
    /**
     *   实体属性标识[目标用户]
     */
    public final static String FIELD_DSTUSERS = "DSTUSERS";
    /**
     *   实体属性标识[错误信息]
     */
    public final static String FIELD_ERRORINFO = "ERRORINFO";
    /**
     *   实体属性标识[文件附件]
     */
    public final static String FIELD_FILEAT = "FILEAT";
    /**
     *   实体属性标识[文件附件2]
     */
    public final static String FIELD_FILEAT2 = "FILEAT2";
    /**
     *   实体属性标识[文件附件3]
     */
    public final static String FIELD_FILEAT3 = "FILEAT3";
    /**
     *   实体属性标识[文件附件4]
     */
    public final static String FIELD_FILEAT4 = "FILEAT4";
    /**
     *   实体属性标识[重要程度]
     */
    public final static String FIELD_IMPORTANCEFLAG = "IMPORTANCEFLAG";
    /**
     *   实体属性标识[处理错误]
     */
    public final static String FIELD_ISERROR = "ISERROR";
    /**
     *   实体属性标识[是否发送]
     */
    public final static String FIELD_ISSEND = "ISSEND";
    /**
     *   实体属性标识[消息发送队列标识]
     */
    public final static String FIELD_MSGSENDQUEUEID = "MSGSENDQUEUEID";
    /**
     *   实体属性标识[消息发送队列名称]
     */
    public final static String FIELD_MSGSENDQUEUENAME = "MSGSENDQUEUENAME";
    /**
     *   实体属性标识[消息类型]
     */
    public final static String FIELD_MSGTYPE = "MSGTYPE";
    /**
     *   实体属性标识[计划发送时间]
     */
    public final static String FIELD_PLANSENDTIME = "PLANSENDTIME";
    /**
     *   实体属性标识[处理时间]
     */
    public final static String FIELD_PROCESSTIME = "PROCESSTIME";
    /**
     *   实体属性标识[发送者标识]
     */
    public final static String FIELD_SENDTAG = "SENDTAG";
    /**
     *   实体属性标识[消息标题]
     */
    public final static String FIELD_SUBJECT = "SUBJECT";
    /**
     *   实体属性标识[全部地址]
     */
    public final static String FIELD_TOTALDSTADDRESSES = "TOTALDSTADDRESSES";
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
     *   实体属性标识[用户数据3]
     */
    public final static String FIELD_USERDATA3 = "USERDATA3";
    /**
     *   实体属性标识[用户数据4]
     */
    public final static String FIELD_USERDATA4 = "USERDATA4";

    private final static int INDEX_CONTENT = 0;
    private final static int INDEX_CONTENTTYPE = 1;
    private final static int INDEX_CREATEDATE = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_DSTADDRESSES = 4;
    private final static int INDEX_DSTUSERS = 5;
    private final static int INDEX_ERRORINFO = 6;
    private final static int INDEX_FILEAT = 7;
    private final static int INDEX_FILEAT2 = 8;
    private final static int INDEX_FILEAT3 = 9;
    private final static int INDEX_FILEAT4 = 10;
    private final static int INDEX_IMPORTANCEFLAG = 11;
    private final static int INDEX_ISERROR = 12;
    private final static int INDEX_ISSEND = 13;
    private final static int INDEX_MSGSENDQUEUEID = 14;
    private final static int INDEX_MSGSENDQUEUENAME = 15;
    private final static int INDEX_MSGTYPE = 16;
    private final static int INDEX_PLANSENDTIME = 17;
    private final static int INDEX_PROCESSTIME = 18;
    private final static int INDEX_SENDTAG = 19;
    private final static int INDEX_SUBJECT = 20;
    private final static int INDEX_TOTALDSTADDRESSES = 21;
    private final static int INDEX_UPDATEDATE = 22;
    private final static int INDEX_UPDATEMAN = 23;
    private final static int INDEX_USERDATA = 24;
    private final static int INDEX_USERDATA2 = 25;
    private final static int INDEX_USERDATA3 = 26;
    private final static int INDEX_USERDATA4 = 27;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_CONTENTTYPE, INDEX_CONTENTTYPE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DSTADDRESSES, INDEX_DSTADDRESSES);
        fieldIndexMap.put( FIELD_DSTUSERS, INDEX_DSTUSERS);
        fieldIndexMap.put( FIELD_ERRORINFO, INDEX_ERRORINFO);
        fieldIndexMap.put( FIELD_FILEAT, INDEX_FILEAT);
        fieldIndexMap.put( FIELD_FILEAT2, INDEX_FILEAT2);
        fieldIndexMap.put( FIELD_FILEAT3, INDEX_FILEAT3);
        fieldIndexMap.put( FIELD_FILEAT4, INDEX_FILEAT4);
        fieldIndexMap.put( FIELD_IMPORTANCEFLAG, INDEX_IMPORTANCEFLAG);
        fieldIndexMap.put( FIELD_ISERROR, INDEX_ISERROR);
        fieldIndexMap.put( FIELD_ISSEND, INDEX_ISSEND);
        fieldIndexMap.put( FIELD_MSGSENDQUEUEID, INDEX_MSGSENDQUEUEID);
        fieldIndexMap.put( FIELD_MSGSENDQUEUENAME, INDEX_MSGSENDQUEUENAME);
        fieldIndexMap.put( FIELD_MSGTYPE, INDEX_MSGTYPE);
        fieldIndexMap.put( FIELD_PLANSENDTIME, INDEX_PLANSENDTIME);
        fieldIndexMap.put( FIELD_PROCESSTIME, INDEX_PROCESSTIME);
        fieldIndexMap.put( FIELD_SENDTAG, INDEX_SENDTAG);
        fieldIndexMap.put( FIELD_SUBJECT, INDEX_SUBJECT);
        fieldIndexMap.put( FIELD_TOTALDSTADDRESSES, INDEX_TOTALDSTADDRESSES);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDATA, INDEX_USERDATA);
        fieldIndexMap.put( FIELD_USERDATA2, INDEX_USERDATA2);
        fieldIndexMap.put( FIELD_USERDATA3, INDEX_USERDATA3);
        fieldIndexMap.put( FIELD_USERDATA4, INDEX_USERDATA4);
    }

    private MsgSendQueueBase proxyMsgSendQueueBase = null;

    public MsgSendQueueBase() {
        super();
    }
    private boolean contentDirtyFlag = false;
    private boolean contenttypeDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean dstaddressesDirtyFlag = false;
    private boolean dstusersDirtyFlag = false;
    private boolean errorinfoDirtyFlag = false;
    private boolean fileatDirtyFlag = false;
    private boolean fileat2DirtyFlag = false;
    private boolean fileat3DirtyFlag = false;
    private boolean fileat4DirtyFlag = false;
    private boolean importanceflagDirtyFlag = false;
    private boolean iserrorDirtyFlag = false;
    private boolean issendDirtyFlag = false;
    private boolean msgsendqueueidDirtyFlag = false;
    private boolean msgsendqueuenameDirtyFlag = false;
    private boolean msgtypeDirtyFlag = false;
    private boolean plansendtimeDirtyFlag = false;
    private boolean processtimeDirtyFlag = false;
    private boolean sendtagDirtyFlag = false;
    private boolean subjectDirtyFlag = false;
    private boolean totaldstaddressesDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdataDirtyFlag = false;
    private boolean userdata2DirtyFlag = false;
    private boolean userdata3DirtyFlag = false;
    private boolean userdata4DirtyFlag = false;

    @Column(name="content")
    private String content;
    @Column(name="contenttype")
    private String contenttype;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="dstaddresses")
    private String dstaddresses;
    @Column(name="dstusers")
    private String dstusers;
    @Column(name="errorinfo")
    private String errorinfo;
    @Column(name="fileat")
    private String fileat;
    @Column(name="fileat2")
    private String fileat2;
    @Column(name="fileat3")
    private String fileat3;
    @Column(name="fileat4")
    private String fileat4;
    @Column(name="importanceflag")
    private Integer importanceflag;
    @Column(name="iserror")
    private Integer iserror;
    @Column(name="issend")
    private Integer issend;
    @Column(name="msgsendqueueid")
    private String msgsendqueueid;
    @Column(name="msgsendqueuename")
    private String msgsendqueuename;
    @Column(name="msgtype")
    private Integer msgtype;
    @Column(name="plansendtime")
    private Timestamp plansendtime;
    @Column(name="processtime")
    private Timestamp processtime;
    @Column(name="sendtag")
    private String sendtag;
    @Column(name="subject")
    private String subject;
    @Column(name="totaldstaddresses")
    private String totaldstaddresses;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdata")
    private String userdata;
    @Column(name="userdata2")
    private String userdata2;
    @Column(name="userdata3")
    private String userdata3;
    @Column(name="userdata4")
    private String userdata4;


    /**
     *  设置属性值[消息内容]
     *  @param content
     */
    public void setContent(String content) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setContent(content);
            return;
        }
        if(content!=null) {
            content = StringHelper.trimRight(content);
            if(content.length()==0) {
                content = null;
            }
        }
        this.content =  content;
        this.contentDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息内容]
     */
    public String getContent() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getContent();
        }
        return this.content;
    }

    /**
     *  获取属性值[消息内容]是否修改
     */
    public boolean isContentDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isContentDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[消息内容]
     */
    public void resetContent() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetContent();
            return;
        }

        this.contentDirtyFlag = false;
        this.content = null;
    }
    /**
     *  设置属性值[内容类型]代码表：net.ibizsys.psrt.srv.codelist.MsgContentTypeCodeListModel
     *  @param contenttype
     */
    public void setContentType(String contenttype) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setContentType(contenttype);
            return;
        }
        if(contenttype!=null) {
            contenttype = StringHelper.trimRight(contenttype);
            if(contenttype.length()==0) {
                contenttype = null;
            }
        }
        this.contenttype =  contenttype;
        this.contenttypeDirtyFlag  = true;
    }

    /**
     *  获取属性值[内容类型]代码表：net.ibizsys.psrt.srv.codelist.MsgContentTypeCodeListModel
     */
    public String getContentType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getContentType();
        }
        return this.contenttype;
    }

    /**
     *  获取属性值[内容类型]是否修改
     */
    public boolean isContentTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isContentTypeDirty();
        }
        return this.contenttypeDirtyFlag;
    }

    /**
     *  重置属性值[内容类型]
     */
    public void resetContentType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetContentType();
            return;
        }

        this.contenttypeDirtyFlag = false;
        this.contenttype = null;
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
     *  设置属性值[目标地址]
     *  @param dstaddresses
     */
    public void setDstAddresses(String dstaddresses) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDstAddresses(dstaddresses);
            return;
        }
        if(dstaddresses!=null) {
            dstaddresses = StringHelper.trimRight(dstaddresses);
            if(dstaddresses.length()==0) {
                dstaddresses = null;
            }
        }
        this.dstaddresses =  dstaddresses;
        this.dstaddressesDirtyFlag  = true;
    }

    /**
     *  获取属性值[目标地址]
     */
    public String getDstAddresses() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstAddresses();
        }
        return this.dstaddresses;
    }

    /**
     *  获取属性值[目标地址]是否修改
     */
    public boolean isDstAddressesDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDstAddressesDirty();
        }
        return this.dstaddressesDirtyFlag;
    }

    /**
     *  重置属性值[目标地址]
     */
    public void resetDstAddresses() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDstAddresses();
            return;
        }

        this.dstaddressesDirtyFlag = false;
        this.dstaddresses = null;
    }
    /**
     *  设置属性值[目标用户]
     *  @param dstusers
     */
    public void setDstUsers(String dstusers) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDstUsers(dstusers);
            return;
        }
        if(dstusers!=null) {
            dstusers = StringHelper.trimRight(dstusers);
            if(dstusers.length()==0) {
                dstusers = null;
            }
        }
        this.dstusers =  dstusers;
        this.dstusersDirtyFlag  = true;
    }

    /**
     *  获取属性值[目标用户]
     */
    public String getDstUsers() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDstUsers();
        }
        return this.dstusers;
    }

    /**
     *  获取属性值[目标用户]是否修改
     */
    public boolean isDstUsersDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDstUsersDirty();
        }
        return this.dstusersDirtyFlag;
    }

    /**
     *  重置属性值[目标用户]
     */
    public void resetDstUsers() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDstUsers();
            return;
        }

        this.dstusersDirtyFlag = false;
        this.dstusers = null;
    }
    /**
     *  设置属性值[错误信息]
     *  @param errorinfo
     */
    public void setErrorInfo(String errorinfo) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setErrorInfo(errorinfo);
            return;
        }
        if(errorinfo!=null) {
            errorinfo = StringHelper.trimRight(errorinfo);
            if(errorinfo.length()==0) {
                errorinfo = null;
            }
        }
        this.errorinfo =  errorinfo;
        this.errorinfoDirtyFlag  = true;
    }

    /**
     *  获取属性值[错误信息]
     */
    public String getErrorInfo() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getErrorInfo();
        }
        return this.errorinfo;
    }

    /**
     *  获取属性值[错误信息]是否修改
     */
    public boolean isErrorInfoDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isErrorInfoDirty();
        }
        return this.errorinfoDirtyFlag;
    }

    /**
     *  重置属性值[错误信息]
     */
    public void resetErrorInfo() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetErrorInfo();
            return;
        }

        this.errorinfoDirtyFlag = false;
        this.errorinfo = null;
    }
    /**
     *  设置属性值[文件附件]
     *  @param fileat
     */
    public void setFileAT(String fileat) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileAT(fileat);
            return;
        }
        if(fileat!=null) {
            fileat = StringHelper.trimRight(fileat);
            if(fileat.length()==0) {
                fileat = null;
            }
        }
        this.fileat =  fileat;
        this.fileatDirtyFlag  = true;
    }

    /**
     *  获取属性值[文件附件]
     */
    public String getFileAT() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileAT();
        }
        return this.fileat;
    }

    /**
     *  获取属性值[文件附件]是否修改
     */
    public boolean isFileATDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileATDirty();
        }
        return this.fileatDirtyFlag;
    }

    /**
     *  重置属性值[文件附件]
     */
    public void resetFileAT() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileAT();
            return;
        }

        this.fileatDirtyFlag = false;
        this.fileat = null;
    }
    /**
     *  设置属性值[文件附件2]
     *  @param fileat2
     */
    public void setFileAT2(String fileat2) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileAT2(fileat2);
            return;
        }
        if(fileat2!=null) {
            fileat2 = StringHelper.trimRight(fileat2);
            if(fileat2.length()==0) {
                fileat2 = null;
            }
        }
        this.fileat2 =  fileat2;
        this.fileat2DirtyFlag  = true;
    }

    /**
     *  获取属性值[文件附件2]
     */
    public String getFileAT2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileAT2();
        }
        return this.fileat2;
    }

    /**
     *  获取属性值[文件附件2]是否修改
     */
    public boolean isFileAT2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileAT2Dirty();
        }
        return this.fileat2DirtyFlag;
    }

    /**
     *  重置属性值[文件附件2]
     */
    public void resetFileAT2() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileAT2();
            return;
        }

        this.fileat2DirtyFlag = false;
        this.fileat2 = null;
    }
    /**
     *  设置属性值[文件附件3]
     *  @param fileat3
     */
    public void setFileAT3(String fileat3) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileAT3(fileat3);
            return;
        }
        if(fileat3!=null) {
            fileat3 = StringHelper.trimRight(fileat3);
            if(fileat3.length()==0) {
                fileat3 = null;
            }
        }
        this.fileat3 =  fileat3;
        this.fileat3DirtyFlag  = true;
    }

    /**
     *  获取属性值[文件附件3]
     */
    public String getFileAT3() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileAT3();
        }
        return this.fileat3;
    }

    /**
     *  获取属性值[文件附件3]是否修改
     */
    public boolean isFileAT3Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileAT3Dirty();
        }
        return this.fileat3DirtyFlag;
    }

    /**
     *  重置属性值[文件附件3]
     */
    public void resetFileAT3() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileAT3();
            return;
        }

        this.fileat3DirtyFlag = false;
        this.fileat3 = null;
    }
    /**
     *  设置属性值[文件附件4]
     *  @param fileat4
     */
    public void setFileAT4(String fileat4) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileAT4(fileat4);
            return;
        }
        if(fileat4!=null) {
            fileat4 = StringHelper.trimRight(fileat4);
            if(fileat4.length()==0) {
                fileat4 = null;
            }
        }
        this.fileat4 =  fileat4;
        this.fileat4DirtyFlag  = true;
    }

    /**
     *  获取属性值[文件附件4]
     */
    public String getFileAT4() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileAT4();
        }
        return this.fileat4;
    }

    /**
     *  获取属性值[文件附件4]是否修改
     */
    public boolean isFileAT4Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileAT4Dirty();
        }
        return this.fileat4DirtyFlag;
    }

    /**
     *  重置属性值[文件附件4]
     */
    public void resetFileAT4() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileAT4();
            return;
        }

        this.fileat4DirtyFlag = false;
        this.fileat4 = null;
    }
    /**
     *  设置属性值[重要程度]代码表：net.ibizsys.psrt.srv.codelist.CodeList8CodeListModel
     *  @param importanceflag
     */
    public void setImportanceFlag(Integer importanceflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setImportanceFlag(importanceflag);
            return;
        }
        this.importanceflag =  importanceflag;
        this.importanceflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[重要程度]代码表：net.ibizsys.psrt.srv.codelist.CodeList8CodeListModel
     */
    public Integer getImportanceFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getImportanceFlag();
        }
        return this.importanceflag;
    }

    /**
     *  获取属性值[重要程度]是否修改
     */
    public boolean isImportanceFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isImportanceFlagDirty();
        }
        return this.importanceflagDirtyFlag;
    }

    /**
     *  重置属性值[重要程度]
     */
    public void resetImportanceFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetImportanceFlag();
            return;
        }

        this.importanceflagDirtyFlag = false;
        this.importanceflag = null;
    }
    /**
     *  设置属性值[处理错误]代码表：net.ibizsys.psrt.srv.codelist.CodeList50CodeListModel
     *  @param iserror
     */
    public void setIsError(Integer iserror) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIsError(iserror);
            return;
        }
        this.iserror =  iserror;
        this.iserrorDirtyFlag  = true;
    }

    /**
     *  获取属性值[处理错误]代码表：net.ibizsys.psrt.srv.codelist.CodeList50CodeListModel
     */
    public Integer getIsError() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIsError();
        }
        return this.iserror;
    }

    /**
     *  获取属性值[处理错误]是否修改
     */
    public boolean isIsErrorDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIsErrorDirty();
        }
        return this.iserrorDirtyFlag;
    }

    /**
     *  重置属性值[处理错误]
     */
    public void resetIsError() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIsError();
            return;
        }

        this.iserrorDirtyFlag = false;
        this.iserror = null;
    }
    /**
     *  设置属性值[是否发送]代码表：net.ibizsys.psrt.srv.codelist.CodeList50CodeListModel
     *  @param issend
     */
    public void setIsSend(Integer issend) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIsSend(issend);
            return;
        }
        this.issend =  issend;
        this.issendDirtyFlag  = true;
    }

    /**
     *  获取属性值[是否发送]代码表：net.ibizsys.psrt.srv.codelist.CodeList50CodeListModel
     */
    public Integer getIsSend() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIsSend();
        }
        return this.issend;
    }

    /**
     *  获取属性值[是否发送]是否修改
     */
    public boolean isIsSendDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIsSendDirty();
        }
        return this.issendDirtyFlag;
    }

    /**
     *  重置属性值[是否发送]
     */
    public void resetIsSend() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIsSend();
            return;
        }

        this.issendDirtyFlag = false;
        this.issend = null;
    }
    /**
     *  设置属性值[消息发送队列标识]
     *  @param msgsendqueueid
     */
    public void setMsgSendQueueId(String msgsendqueueid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgSendQueueId(msgsendqueueid);
            return;
        }
        if(msgsendqueueid!=null) {
            msgsendqueueid = StringHelper.trimRight(msgsendqueueid);
            if(msgsendqueueid.length()==0) {
                msgsendqueueid = null;
            }
        }
        this.msgsendqueueid =  msgsendqueueid;
        this.msgsendqueueidDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息发送队列标识]
     */
    public String getMsgSendQueueId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgSendQueueId();
        }
        return this.msgsendqueueid;
    }

    /**
     *  获取属性值[消息发送队列标识]是否修改
     */
    public boolean isMsgSendQueueIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgSendQueueIdDirty();
        }
        return this.msgsendqueueidDirtyFlag;
    }

    /**
     *  重置属性值[消息发送队列标识]
     */
    public void resetMsgSendQueueId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgSendQueueId();
            return;
        }

        this.msgsendqueueidDirtyFlag = false;
        this.msgsendqueueid = null;
    }
    /**
     *  设置属性值[消息发送队列名称]
     *  @param msgsendqueuename
     */
    public void setMsgSendQueueName(String msgsendqueuename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgSendQueueName(msgsendqueuename);
            return;
        }
        if(msgsendqueuename!=null) {
            msgsendqueuename = StringHelper.trimRight(msgsendqueuename);
            if(msgsendqueuename.length()==0) {
                msgsendqueuename = null;
            }
        }
        this.msgsendqueuename =  msgsendqueuename;
        this.msgsendqueuenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息发送队列名称]
     */
    public String getMsgSendQueueName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgSendQueueName();
        }
        return this.msgsendqueuename;
    }

    /**
     *  获取属性值[消息发送队列名称]是否修改
     */
    public boolean isMsgSendQueueNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgSendQueueNameDirty();
        }
        return this.msgsendqueuenameDirtyFlag;
    }

    /**
     *  重置属性值[消息发送队列名称]
     */
    public void resetMsgSendQueueName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgSendQueueName();
            return;
        }

        this.msgsendqueuenameDirtyFlag = false;
        this.msgsendqueuename = null;
    }
    /**
     *  设置属性值[消息类型]代码表：net.ibizsys.psrt.srv.codelist.MsgTypeCodeListModel
     *  @param msgtype
     */
    public void setMsgType(Integer msgtype) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgType(msgtype);
            return;
        }
        this.msgtype =  msgtype;
        this.msgtypeDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息类型]代码表：net.ibizsys.psrt.srv.codelist.MsgTypeCodeListModel
     */
    public Integer getMsgType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgType();
        }
        return this.msgtype;
    }

    /**
     *  获取属性值[消息类型]是否修改
     */
    public boolean isMsgTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgTypeDirty();
        }
        return this.msgtypeDirtyFlag;
    }

    /**
     *  重置属性值[消息类型]
     */
    public void resetMsgType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgType();
            return;
        }

        this.msgtypeDirtyFlag = false;
        this.msgtype = null;
    }
    /**
     *  设置属性值[计划发送时间]
     *  @param plansendtime
     */
    public void setPlanSendTime(Timestamp plansendtime) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPlanSendTime(plansendtime);
            return;
        }
        this.plansendtime =  plansendtime;
        this.plansendtimeDirtyFlag  = true;
    }

    /**
     *  获取属性值[计划发送时间]
     */
    public Timestamp getPlanSendTime() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPlanSendTime();
        }
        return this.plansendtime;
    }

    /**
     *  获取属性值[计划发送时间]是否修改
     */
    public boolean isPlanSendTimeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPlanSendTimeDirty();
        }
        return this.plansendtimeDirtyFlag;
    }

    /**
     *  重置属性值[计划发送时间]
     */
    public void resetPlanSendTime() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPlanSendTime();
            return;
        }

        this.plansendtimeDirtyFlag = false;
        this.plansendtime = null;
    }
    /**
     *  设置属性值[处理时间]
     *  @param processtime
     */
    public void setProcessTime(Timestamp processtime) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setProcessTime(processtime);
            return;
        }
        this.processtime =  processtime;
        this.processtimeDirtyFlag  = true;
    }

    /**
     *  获取属性值[处理时间]
     */
    public Timestamp getProcessTime() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getProcessTime();
        }
        return this.processtime;
    }

    /**
     *  获取属性值[处理时间]是否修改
     */
    public boolean isProcessTimeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isProcessTimeDirty();
        }
        return this.processtimeDirtyFlag;
    }

    /**
     *  重置属性值[处理时间]
     */
    public void resetProcessTime() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetProcessTime();
            return;
        }

        this.processtimeDirtyFlag = false;
        this.processtime = null;
    }
    /**
     *  设置属性值[发送者标识]
     *  @param sendtag
     */
    public void setSendTag(String sendtag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSendTag(sendtag);
            return;
        }
        if(sendtag!=null) {
            sendtag = StringHelper.trimRight(sendtag);
            if(sendtag.length()==0) {
                sendtag = null;
            }
        }
        this.sendtag =  sendtag;
        this.sendtagDirtyFlag  = true;
    }

    /**
     *  获取属性值[发送者标识]
     */
    public String getSendTag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSendTag();
        }
        return this.sendtag;
    }

    /**
     *  获取属性值[发送者标识]是否修改
     */
    public boolean isSendTagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSendTagDirty();
        }
        return this.sendtagDirtyFlag;
    }

    /**
     *  重置属性值[发送者标识]
     */
    public void resetSendTag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSendTag();
            return;
        }

        this.sendtagDirtyFlag = false;
        this.sendtag = null;
    }
    /**
     *  设置属性值[消息标题]
     *  @param subject
     */
    public void setSubject(String subject) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSubject(subject);
            return;
        }
        if(subject!=null) {
            subject = StringHelper.trimRight(subject);
            if(subject.length()==0) {
                subject = null;
            }
        }
        this.subject =  subject;
        this.subjectDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息标题]
     */
    public String getSubject() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSubject();
        }
        return this.subject;
    }

    /**
     *  获取属性值[消息标题]是否修改
     */
    public boolean isSubjectDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSubjectDirty();
        }
        return this.subjectDirtyFlag;
    }

    /**
     *  重置属性值[消息标题]
     */
    public void resetSubject() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSubject();
            return;
        }

        this.subjectDirtyFlag = false;
        this.subject = null;
    }
    /**
     *  设置属性值[全部地址]
     *  @param totaldstaddresses
     */
    public void setTotalDstAddresses(String totaldstaddresses) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTotalDstAddresses(totaldstaddresses);
            return;
        }
        if(totaldstaddresses!=null) {
            totaldstaddresses = StringHelper.trimRight(totaldstaddresses);
            if(totaldstaddresses.length()==0) {
                totaldstaddresses = null;
            }
        }
        this.totaldstaddresses =  totaldstaddresses;
        this.totaldstaddressesDirtyFlag  = true;
    }

    /**
     *  获取属性值[全部地址]
     */
    public String getTotalDstAddresses() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTotalDstAddresses();
        }
        return this.totaldstaddresses;
    }

    /**
     *  获取属性值[全部地址]是否修改
     */
    public boolean isTotalDstAddressesDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTotalDstAddressesDirty();
        }
        return this.totaldstaddressesDirtyFlag;
    }

    /**
     *  重置属性值[全部地址]
     */
    public void resetTotalDstAddresses() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTotalDstAddresses();
            return;
        }

        this.totaldstaddressesDirtyFlag = false;
        this.totaldstaddresses = null;
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
     *  设置属性值[用户数据3]
     *  @param userdata3
     */
    public void setUserData3(String userdata3) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData3(userdata3);
            return;
        }
        if(userdata3!=null) {
            userdata3 = StringHelper.trimRight(userdata3);
            if(userdata3.length()==0) {
                userdata3 = null;
            }
        }
        this.userdata3 =  userdata3;
        this.userdata3DirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据3]
     */
    public String getUserData3() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData3();
        }
        return this.userdata3;
    }

    /**
     *  获取属性值[用户数据3]是否修改
     */
    public boolean isUserData3Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserData3Dirty();
        }
        return this.userdata3DirtyFlag;
    }

    /**
     *  重置属性值[用户数据3]
     */
    public void resetUserData3() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData3();
            return;
        }

        this.userdata3DirtyFlag = false;
        this.userdata3 = null;
    }
    /**
     *  设置属性值[用户数据4]
     *  @param userdata4
     */
    public void setUserData4(String userdata4) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserData4(userdata4);
            return;
        }
        if(userdata4!=null) {
            userdata4 = StringHelper.trimRight(userdata4);
            if(userdata4.length()==0) {
                userdata4 = null;
            }
        }
        this.userdata4 =  userdata4;
        this.userdata4DirtyFlag  = true;
    }

    /**
     *  获取属性值[用户数据4]
     */
    public String getUserData4() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserData4();
        }
        return this.userdata4;
    }

    /**
     *  获取属性值[用户数据4]是否修改
     */
    public boolean isUserData4Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserData4Dirty();
        }
        return this.userdata4DirtyFlag;
    }

    /**
     *  重置属性值[用户数据4]
     */
    public void resetUserData4() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserData4();
            return;
        }

        this.userdata4DirtyFlag = false;
        this.userdata4 = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        MsgSendQueueBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(MsgSendQueueBase et) {
        et.resetContent();
        et.resetContentType();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDstAddresses();
        et.resetDstUsers();
        et.resetErrorInfo();
        et.resetFileAT();
        et.resetFileAT2();
        et.resetFileAT3();
        et.resetFileAT4();
        et.resetImportanceFlag();
        et.resetIsError();
        et.resetIsSend();
        et.resetMsgSendQueueId();
        et.resetMsgSendQueueName();
        et.resetMsgType();
        et.resetPlanSendTime();
        et.resetProcessTime();
        et.resetSendTag();
        et.resetSubject();
        et.resetTotalDstAddresses();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserData();
        et.resetUserData2();
        et.resetUserData3();
        et.resetUserData4();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isContentDirty()) {
            params.put(FIELD_CONTENT,getContent());
        }
        if(!bDirtyOnly || isContentTypeDirty()) {
            params.put(FIELD_CONTENTTYPE,getContentType());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isDstAddressesDirty()) {
            params.put(FIELD_DSTADDRESSES,getDstAddresses());
        }
        if(!bDirtyOnly || isDstUsersDirty()) {
            params.put(FIELD_DSTUSERS,getDstUsers());
        }
        if(!bDirtyOnly || isErrorInfoDirty()) {
            params.put(FIELD_ERRORINFO,getErrorInfo());
        }
        if(!bDirtyOnly || isFileATDirty()) {
            params.put(FIELD_FILEAT,getFileAT());
        }
        if(!bDirtyOnly || isFileAT2Dirty()) {
            params.put(FIELD_FILEAT2,getFileAT2());
        }
        if(!bDirtyOnly || isFileAT3Dirty()) {
            params.put(FIELD_FILEAT3,getFileAT3());
        }
        if(!bDirtyOnly || isFileAT4Dirty()) {
            params.put(FIELD_FILEAT4,getFileAT4());
        }
        if(!bDirtyOnly || isImportanceFlagDirty()) {
            params.put(FIELD_IMPORTANCEFLAG,getImportanceFlag());
        }
        if(!bDirtyOnly || isIsErrorDirty()) {
            params.put(FIELD_ISERROR,getIsError());
        }
        if(!bDirtyOnly || isIsSendDirty()) {
            params.put(FIELD_ISSEND,getIsSend());
        }
        if(!bDirtyOnly || isMsgSendQueueIdDirty()) {
            params.put(FIELD_MSGSENDQUEUEID,getMsgSendQueueId());
        }
        if(!bDirtyOnly || isMsgSendQueueNameDirty()) {
            params.put(FIELD_MSGSENDQUEUENAME,getMsgSendQueueName());
        }
        if(!bDirtyOnly || isMsgTypeDirty()) {
            params.put(FIELD_MSGTYPE,getMsgType());
        }
        if(!bDirtyOnly || isPlanSendTimeDirty()) {
            params.put(FIELD_PLANSENDTIME,getPlanSendTime());
        }
        if(!bDirtyOnly || isProcessTimeDirty()) {
            params.put(FIELD_PROCESSTIME,getProcessTime());
        }
        if(!bDirtyOnly || isSendTagDirty()) {
            params.put(FIELD_SENDTAG,getSendTag());
        }
        if(!bDirtyOnly || isSubjectDirty()) {
            params.put(FIELD_SUBJECT,getSubject());
        }
        if(!bDirtyOnly || isTotalDstAddressesDirty()) {
            params.put(FIELD_TOTALDSTADDRESSES,getTotalDstAddresses());
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
        if(!bDirtyOnly || isUserData3Dirty()) {
            params.put(FIELD_USERDATA3,getUserData3());
        }
        if(!bDirtyOnly || isUserData4Dirty()) {
            params.put(FIELD_USERDATA4,getUserData4());
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

        return  MsgSendQueueBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(MsgSendQueueBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.getContent();
        case INDEX_CONTENTTYPE:
            return et.getContentType();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DSTADDRESSES:
            return et.getDstAddresses();
        case INDEX_DSTUSERS:
            return et.getDstUsers();
        case INDEX_ERRORINFO:
            return et.getErrorInfo();
        case INDEX_FILEAT:
            return et.getFileAT();
        case INDEX_FILEAT2:
            return et.getFileAT2();
        case INDEX_FILEAT3:
            return et.getFileAT3();
        case INDEX_FILEAT4:
            return et.getFileAT4();
        case INDEX_IMPORTANCEFLAG:
            return et.getImportanceFlag();
        case INDEX_ISERROR:
            return et.getIsError();
        case INDEX_ISSEND:
            return et.getIsSend();
        case INDEX_MSGSENDQUEUEID:
            return et.getMsgSendQueueId();
        case INDEX_MSGSENDQUEUENAME:
            return et.getMsgSendQueueName();
        case INDEX_MSGTYPE:
            return et.getMsgType();
        case INDEX_PLANSENDTIME:
            return et.getPlanSendTime();
        case INDEX_PROCESSTIME:
            return et.getProcessTime();
        case INDEX_SENDTAG:
            return et.getSendTag();
        case INDEX_SUBJECT:
            return et.getSubject();
        case INDEX_TOTALDSTADDRESSES:
            return et.getTotalDstAddresses();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDATA:
            return et.getUserData();
        case INDEX_USERDATA2:
            return et.getUserData2();
        case INDEX_USERDATA3:
            return et.getUserData3();
        case INDEX_USERDATA4:
            return et.getUserData4();
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

        MsgSendQueueBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(MsgSendQueueBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CONTENT:
            et.setContent(DataObject.getStringValue(obj));
            return ;
        case INDEX_CONTENTTYPE:
            et.setContentType(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSTADDRESSES:
            et.setDstAddresses(DataObject.getStringValue(obj));
            return ;
        case INDEX_DSTUSERS:
            et.setDstUsers(DataObject.getStringValue(obj));
            return ;
        case INDEX_ERRORINFO:
            et.setErrorInfo(DataObject.getStringValue(obj));
            return ;
        case INDEX_FILEAT:
            et.setFileAT(DataObject.getStringValue(obj));
            return ;
        case INDEX_FILEAT2:
            et.setFileAT2(DataObject.getStringValue(obj));
            return ;
        case INDEX_FILEAT3:
            et.setFileAT3(DataObject.getStringValue(obj));
            return ;
        case INDEX_FILEAT4:
            et.setFileAT4(DataObject.getStringValue(obj));
            return ;
        case INDEX_IMPORTANCEFLAG:
            et.setImportanceFlag(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_ISERROR:
            et.setIsError(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_ISSEND:
            et.setIsSend(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MSGSENDQUEUEID:
            et.setMsgSendQueueId(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSGSENDQUEUENAME:
            et.setMsgSendQueueName(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSGTYPE:
            et.setMsgType(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_PLANSENDTIME:
            et.setPlanSendTime(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_PROCESSTIME:
            et.setProcessTime(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_SENDTAG:
            et.setSendTag(DataObject.getStringValue(obj));
            return ;
        case INDEX_SUBJECT:
            et.setSubject(DataObject.getStringValue(obj));
            return ;
        case INDEX_TOTALDSTADDRESSES:
            et.setTotalDstAddresses(DataObject.getStringValue(obj));
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
        case INDEX_USERDATA3:
            et.setUserData3(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDATA4:
            et.setUserData4(DataObject.getStringValue(obj));
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

        return  MsgSendQueueBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(MsgSendQueueBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.getContent()==null;
        case INDEX_CONTENTTYPE:
            return et.getContentType()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DSTADDRESSES:
            return et.getDstAddresses()==null;
        case INDEX_DSTUSERS:
            return et.getDstUsers()==null;
        case INDEX_ERRORINFO:
            return et.getErrorInfo()==null;
        case INDEX_FILEAT:
            return et.getFileAT()==null;
        case INDEX_FILEAT2:
            return et.getFileAT2()==null;
        case INDEX_FILEAT3:
            return et.getFileAT3()==null;
        case INDEX_FILEAT4:
            return et.getFileAT4()==null;
        case INDEX_IMPORTANCEFLAG:
            return et.getImportanceFlag()==null;
        case INDEX_ISERROR:
            return et.getIsError()==null;
        case INDEX_ISSEND:
            return et.getIsSend()==null;
        case INDEX_MSGSENDQUEUEID:
            return et.getMsgSendQueueId()==null;
        case INDEX_MSGSENDQUEUENAME:
            return et.getMsgSendQueueName()==null;
        case INDEX_MSGTYPE:
            return et.getMsgType()==null;
        case INDEX_PLANSENDTIME:
            return et.getPlanSendTime()==null;
        case INDEX_PROCESSTIME:
            return et.getProcessTime()==null;
        case INDEX_SENDTAG:
            return et.getSendTag()==null;
        case INDEX_SUBJECT:
            return et.getSubject()==null;
        case INDEX_TOTALDSTADDRESSES:
            return et.getTotalDstAddresses()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDATA:
            return et.getUserData()==null;
        case INDEX_USERDATA2:
            return et.getUserData2()==null;
        case INDEX_USERDATA3:
            return et.getUserData3()==null;
        case INDEX_USERDATA4:
            return et.getUserData4()==null;
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

        return  MsgSendQueueBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(MsgSendQueueBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.isContentDirty();
        case INDEX_CONTENTTYPE:
            return et.isContentTypeDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DSTADDRESSES:
            return et.isDstAddressesDirty();
        case INDEX_DSTUSERS:
            return et.isDstUsersDirty();
        case INDEX_ERRORINFO:
            return et.isErrorInfoDirty();
        case INDEX_FILEAT:
            return et.isFileATDirty();
        case INDEX_FILEAT2:
            return et.isFileAT2Dirty();
        case INDEX_FILEAT3:
            return et.isFileAT3Dirty();
        case INDEX_FILEAT4:
            return et.isFileAT4Dirty();
        case INDEX_IMPORTANCEFLAG:
            return et.isImportanceFlagDirty();
        case INDEX_ISERROR:
            return et.isIsErrorDirty();
        case INDEX_ISSEND:
            return et.isIsSendDirty();
        case INDEX_MSGSENDQUEUEID:
            return et.isMsgSendQueueIdDirty();
        case INDEX_MSGSENDQUEUENAME:
            return et.isMsgSendQueueNameDirty();
        case INDEX_MSGTYPE:
            return et.isMsgTypeDirty();
        case INDEX_PLANSENDTIME:
            return et.isPlanSendTimeDirty();
        case INDEX_PROCESSTIME:
            return et.isProcessTimeDirty();
        case INDEX_SENDTAG:
            return et.isSendTagDirty();
        case INDEX_SUBJECT:
            return et.isSubjectDirty();
        case INDEX_TOTALDSTADDRESSES:
            return et.isTotalDstAddressesDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDATA:
            return et.isUserDataDirty();
        case INDEX_USERDATA2:
            return et.isUserData2Dirty();
        case INDEX_USERDATA3:
            return et.isUserData3Dirty();
        case INDEX_USERDATA4:
            return et.isUserData4Dirty();
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
    private static  void fillJSONObject(MsgSendQueueBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getContent()!=null) {
            json.put("content", getJSONValue(et.getContent()));
        }
        if(bIncEmpty||et.getContentType()!=null) {
            json.put("contenttype", getJSONValue(et.getContentType()));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getDstAddresses()!=null) {
            json.put("dstaddresses", getJSONValue(et.getDstAddresses()));
        }
        if(bIncEmpty||et.getDstUsers()!=null) {
            json.put("dstusers", getJSONValue(et.getDstUsers()));
        }
        if(bIncEmpty||et.getErrorInfo()!=null) {
            json.put("errorinfo", getJSONValue(et.getErrorInfo()));
        }
        if(bIncEmpty||et.getFileAT()!=null) {
            json.put("fileat", getJSONValue(et.getFileAT()));
        }
        if(bIncEmpty||et.getFileAT2()!=null) {
            json.put("fileat2", getJSONValue(et.getFileAT2()));
        }
        if(bIncEmpty||et.getFileAT3()!=null) {
            json.put("fileat3", getJSONValue(et.getFileAT3()));
        }
        if(bIncEmpty||et.getFileAT4()!=null) {
            json.put("fileat4", getJSONValue(et.getFileAT4()));
        }
        if(bIncEmpty||et.getImportanceFlag()!=null) {
            json.put("importanceflag", getJSONValue(et.getImportanceFlag()));
        }
        if(bIncEmpty||et.getIsError()!=null) {
            json.put("iserror", getJSONValue(et.getIsError()));
        }
        if(bIncEmpty||et.getIsSend()!=null) {
            json.put("issend", getJSONValue(et.getIsSend()));
        }
        if(bIncEmpty||et.getMsgSendQueueId()!=null) {
            json.put("msgsendqueueid", getJSONValue(et.getMsgSendQueueId()));
        }
        if(bIncEmpty||et.getMsgSendQueueName()!=null) {
            json.put("msgsendqueuename", getJSONValue(et.getMsgSendQueueName()));
        }
        if(bIncEmpty||et.getMsgType()!=null) {
            json.put("msgtype", getJSONValue(et.getMsgType()));
        }
        if(bIncEmpty||et.getPlanSendTime()!=null) {
            json.put("plansendtime", getJSONValue(et.getPlanSendTime()));
        }
        if(bIncEmpty||et.getProcessTime()!=null) {
            json.put("processtime", getJSONValue(et.getProcessTime()));
        }
        if(bIncEmpty||et.getSendTag()!=null) {
            json.put("sendtag", getJSONValue(et.getSendTag()));
        }
        if(bIncEmpty||et.getSubject()!=null) {
            json.put("subject", getJSONValue(et.getSubject()));
        }
        if(bIncEmpty||et.getTotalDstAddresses()!=null) {
            json.put("totaldstaddresses", getJSONValue(et.getTotalDstAddresses()));
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
        if(bIncEmpty||et.getUserData3()!=null) {
            json.put("userdata3", getJSONValue(et.getUserData3()));
        }
        if(bIncEmpty||et.getUserData4()!=null) {
            json.put("userdata4", getJSONValue(et.getUserData4()));
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
    private static void fillXmlNode(MsgSendQueueBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getContent()!=null) {
            Object obj = et.getContent();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getContentType()!=null) {
            Object obj = et.getContentType();
            node.setAttribute("CONTENTTYPE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDstAddresses()!=null) {
            Object obj = et.getDstAddresses();
            node.setAttribute("DSTADDRESSES",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDstUsers()!=null) {
            Object obj = et.getDstUsers();
            node.setAttribute("DSTUSERS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getErrorInfo()!=null) {
            Object obj = et.getErrorInfo();
            node.setAttribute("ERRORINFO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFileAT()!=null) {
            Object obj = et.getFileAT();
            node.setAttribute("FILEAT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFileAT2()!=null) {
            Object obj = et.getFileAT2();
            node.setAttribute("FILEAT2",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFileAT3()!=null) {
            Object obj = et.getFileAT3();
            node.setAttribute("FILEAT3",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFileAT4()!=null) {
            Object obj = et.getFileAT4();
            node.setAttribute("FILEAT4",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getImportanceFlag()!=null) {
            Object obj = et.getImportanceFlag();
            node.setAttribute("IMPORTANCEFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getIsError()!=null) {
            Object obj = et.getIsError();
            node.setAttribute("ISERROR",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getIsSend()!=null) {
            Object obj = et.getIsSend();
            node.setAttribute("ISSEND",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMsgSendQueueId()!=null) {
            Object obj = et.getMsgSendQueueId();
            node.setAttribute("MSGSENDQUEUEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMsgSendQueueName()!=null) {
            Object obj = et.getMsgSendQueueName();
            node.setAttribute("MSGSENDQUEUENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMsgType()!=null) {
            Object obj = et.getMsgType();
            node.setAttribute("MSGTYPE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getPlanSendTime()!=null) {
            Object obj = et.getPlanSendTime();
            node.setAttribute("PLANSENDTIME",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getProcessTime()!=null) {
            Object obj = et.getProcessTime();
            node.setAttribute("PROCESSTIME",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getSendTag()!=null) {
            Object obj = et.getSendTag();
            node.setAttribute("SENDTAG",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSubject()!=null) {
            Object obj = et.getSubject();
            node.setAttribute("SUBJECT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTotalDstAddresses()!=null) {
            Object obj = et.getTotalDstAddresses();
            node.setAttribute("TOTALDSTADDRESSES",(obj==null)?"":(String)obj);
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
        if(bIncEmpty||et.getUserData3()!=null) {
            Object obj = et.getUserData3();
            node.setAttribute("USERDATA3",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserData4()!=null) {
            Object obj = et.getUserData4();
            node.setAttribute("USERDATA4",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        MsgSendQueueBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(MsgSendQueueBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isContentDirty() && (bIncEmpty||et.getContent()!=null)) {
            Object obj = et.getContent();
            if(obj==null) {
                dst.set(FIELD_CONTENT,null);
            } else {
                dst.set(FIELD_CONTENT,obj);
            }
        }
        if(et.isContentTypeDirty() && (bIncEmpty||et.getContentType()!=null)) {
            Object obj = et.getContentType();
            if(obj==null) {
                dst.set(FIELD_CONTENTTYPE,null);
            } else {
                dst.set(FIELD_CONTENTTYPE,obj);
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
        if(et.isDstAddressesDirty() && (bIncEmpty||et.getDstAddresses()!=null)) {
            Object obj = et.getDstAddresses();
            if(obj==null) {
                dst.set(FIELD_DSTADDRESSES,null);
            } else {
                dst.set(FIELD_DSTADDRESSES,obj);
            }
        }
        if(et.isDstUsersDirty() && (bIncEmpty||et.getDstUsers()!=null)) {
            Object obj = et.getDstUsers();
            if(obj==null) {
                dst.set(FIELD_DSTUSERS,null);
            } else {
                dst.set(FIELD_DSTUSERS,obj);
            }
        }
        if(et.isErrorInfoDirty() && (bIncEmpty||et.getErrorInfo()!=null)) {
            Object obj = et.getErrorInfo();
            if(obj==null) {
                dst.set(FIELD_ERRORINFO,null);
            } else {
                dst.set(FIELD_ERRORINFO,obj);
            }
        }
        if(et.isFileATDirty() && (bIncEmpty||et.getFileAT()!=null)) {
            Object obj = et.getFileAT();
            if(obj==null) {
                dst.set(FIELD_FILEAT,null);
            } else {
                dst.set(FIELD_FILEAT,obj);
            }
        }
        if(et.isFileAT2Dirty() && (bIncEmpty||et.getFileAT2()!=null)) {
            Object obj = et.getFileAT2();
            if(obj==null) {
                dst.set(FIELD_FILEAT2,null);
            } else {
                dst.set(FIELD_FILEAT2,obj);
            }
        }
        if(et.isFileAT3Dirty() && (bIncEmpty||et.getFileAT3()!=null)) {
            Object obj = et.getFileAT3();
            if(obj==null) {
                dst.set(FIELD_FILEAT3,null);
            } else {
                dst.set(FIELD_FILEAT3,obj);
            }
        }
        if(et.isFileAT4Dirty() && (bIncEmpty||et.getFileAT4()!=null)) {
            Object obj = et.getFileAT4();
            if(obj==null) {
                dst.set(FIELD_FILEAT4,null);
            } else {
                dst.set(FIELD_FILEAT4,obj);
            }
        }
        if(et.isImportanceFlagDirty() && (bIncEmpty||et.getImportanceFlag()!=null)) {
            Object obj = et.getImportanceFlag();
            if(obj==null) {
                dst.set(FIELD_IMPORTANCEFLAG,null);
            } else {
                dst.set(FIELD_IMPORTANCEFLAG,obj);
            }
        }
        if(et.isIsErrorDirty() && (bIncEmpty||et.getIsError()!=null)) {
            Object obj = et.getIsError();
            if(obj==null) {
                dst.set(FIELD_ISERROR,null);
            } else {
                dst.set(FIELD_ISERROR,obj);
            }
        }
        if(et.isIsSendDirty() && (bIncEmpty||et.getIsSend()!=null)) {
            Object obj = et.getIsSend();
            if(obj==null) {
                dst.set(FIELD_ISSEND,null);
            } else {
                dst.set(FIELD_ISSEND,obj);
            }
        }
        if(et.isMsgSendQueueIdDirty() && (bIncEmpty||et.getMsgSendQueueId()!=null)) {
            Object obj = et.getMsgSendQueueId();
            if(obj==null) {
                dst.set(FIELD_MSGSENDQUEUEID,null);
            } else {
                dst.set(FIELD_MSGSENDQUEUEID,obj);
            }
        }
        if(et.isMsgSendQueueNameDirty() && (bIncEmpty||et.getMsgSendQueueName()!=null)) {
            Object obj = et.getMsgSendQueueName();
            if(obj==null) {
                dst.set(FIELD_MSGSENDQUEUENAME,null);
            } else {
                dst.set(FIELD_MSGSENDQUEUENAME,obj);
            }
        }
        if(et.isMsgTypeDirty() && (bIncEmpty||et.getMsgType()!=null)) {
            Object obj = et.getMsgType();
            if(obj==null) {
                dst.set(FIELD_MSGTYPE,null);
            } else {
                dst.set(FIELD_MSGTYPE,obj);
            }
        }
        if(et.isPlanSendTimeDirty() && (bIncEmpty||et.getPlanSendTime()!=null)) {
            Object obj = et.getPlanSendTime();
            if(obj==null) {
                dst.set(FIELD_PLANSENDTIME,null);
            } else {
                dst.set(FIELD_PLANSENDTIME,obj);
            }
        }
        if(et.isProcessTimeDirty() && (bIncEmpty||et.getProcessTime()!=null)) {
            Object obj = et.getProcessTime();
            if(obj==null) {
                dst.set(FIELD_PROCESSTIME,null);
            } else {
                dst.set(FIELD_PROCESSTIME,obj);
            }
        }
        if(et.isSendTagDirty() && (bIncEmpty||et.getSendTag()!=null)) {
            Object obj = et.getSendTag();
            if(obj==null) {
                dst.set(FIELD_SENDTAG,null);
            } else {
                dst.set(FIELD_SENDTAG,obj);
            }
        }
        if(et.isSubjectDirty() && (bIncEmpty||et.getSubject()!=null)) {
            Object obj = et.getSubject();
            if(obj==null) {
                dst.set(FIELD_SUBJECT,null);
            } else {
                dst.set(FIELD_SUBJECT,obj);
            }
        }
        if(et.isTotalDstAddressesDirty() && (bIncEmpty||et.getTotalDstAddresses()!=null)) {
            Object obj = et.getTotalDstAddresses();
            if(obj==null) {
                dst.set(FIELD_TOTALDSTADDRESSES,null);
            } else {
                dst.set(FIELD_TOTALDSTADDRESSES,obj);
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
        if(et.isUserData3Dirty() && (bIncEmpty||et.getUserData3()!=null)) {
            Object obj = et.getUserData3();
            if(obj==null) {
                dst.set(FIELD_USERDATA3,null);
            } else {
                dst.set(FIELD_USERDATA3,obj);
            }
        }
        if(et.isUserData4Dirty() && (bIncEmpty||et.getUserData4()!=null)) {
            Object obj = et.getUserData4();
            if(obj==null) {
                dst.set(FIELD_USERDATA4,null);
            } else {
                dst.set(FIELD_USERDATA4,obj);
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
        return  MsgSendQueueBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(MsgSendQueueBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            et.resetContent();
            return true;
        case INDEX_CONTENTTYPE:
            et.resetContentType();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DSTADDRESSES:
            et.resetDstAddresses();
            return true;
        case INDEX_DSTUSERS:
            et.resetDstUsers();
            return true;
        case INDEX_ERRORINFO:
            et.resetErrorInfo();
            return true;
        case INDEX_FILEAT:
            et.resetFileAT();
            return true;
        case INDEX_FILEAT2:
            et.resetFileAT2();
            return true;
        case INDEX_FILEAT3:
            et.resetFileAT3();
            return true;
        case INDEX_FILEAT4:
            et.resetFileAT4();
            return true;
        case INDEX_IMPORTANCEFLAG:
            et.resetImportanceFlag();
            return true;
        case INDEX_ISERROR:
            et.resetIsError();
            return true;
        case INDEX_ISSEND:
            et.resetIsSend();
            return true;
        case INDEX_MSGSENDQUEUEID:
            et.resetMsgSendQueueId();
            return true;
        case INDEX_MSGSENDQUEUENAME:
            et.resetMsgSendQueueName();
            return true;
        case INDEX_MSGTYPE:
            et.resetMsgType();
            return true;
        case INDEX_PLANSENDTIME:
            et.resetPlanSendTime();
            return true;
        case INDEX_PROCESSTIME:
            et.resetProcessTime();
            return true;
        case INDEX_SENDTAG:
            et.resetSendTag();
            return true;
        case INDEX_SUBJECT:
            et.resetSubject();
            return true;
        case INDEX_TOTALDSTADDRESSES:
            et.resetTotalDstAddresses();
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
        case INDEX_USERDATA3:
            et.resetUserData3();
            return true;
        case INDEX_USERDATA4:
            et.resetUserData4();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }







    /**
     *  获取代理的数据对象
     */
    private MsgSendQueueBase getProxyEntity() {
        return this.proxyMsgSendQueueBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyMsgSendQueueBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof MsgSendQueueBase) {
            this.proxyMsgSendQueueBase = (MsgSendQueueBase)proxyDataObject;
        }

    }

}