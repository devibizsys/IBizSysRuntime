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
 * 实体[MsgTemplate] 数据对象基类
 */
public abstract class MsgTemplateBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     *   实体属性标识[内容]
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
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DEID = "DEID";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DENAME = "DENAME";
    /**
     *   实体属性标识[逻辑有效标志]
     */
    public final static String FIELD_ENABLE = "ENABLE";
    /**
     *   实体属性标识[IM消息内容]
     */
    public final static String FIELD_IMCONTENT = "IMCONTENT";
    /**
     *   实体属性标识[邮件群组发送]
     */
    public final static String FIELD_MAILGROUPSEND = "MAILGROUPSEND";
    /**
     *   实体属性标识[消息模板标识]
     */
    public final static String FIELD_MSGTEMPLATEID = "MSGTEMPLATEID";
    /**
     *   实体属性标识[消息模板名称]
     */
    public final static String FIELD_MSGTEMPLATENAME = "MSGTEMPLATENAME";
    /**
     *   实体属性标识[手机消息内容]
     */
    public final static String FIELD_SMSCONTENT = "SMSCONTENT";
    /**
     *   实体属性标识[框架发布]
     */
    public final static String FIELD_SRFSYSPUB = "SRFSYSPUB";
    /**
     *   实体属性标识[应用发布]
     */
    public final static String FIELD_SRFUSERPUB = "SRFUSERPUB";
    /**
     *   实体属性标识[标题]
     */
    public final static String FIELD_SUBJECT = "SUBJECT";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[微信内容]
     */
    public final static String FIELD_WCCONTENT = "WCCONTENT";

    private final static int INDEX_CONTENT = 0;
    private final static int INDEX_CONTENTTYPE = 1;
    private final static int INDEX_CREATEDATE = 2;
    private final static int INDEX_CREATEMAN = 3;
    private final static int INDEX_DEID = 4;
    private final static int INDEX_DENAME = 5;
    private final static int INDEX_ENABLE = 6;
    private final static int INDEX_IMCONTENT = 7;
    private final static int INDEX_MAILGROUPSEND = 8;
    private final static int INDEX_MSGTEMPLATEID = 9;
    private final static int INDEX_MSGTEMPLATENAME = 10;
    private final static int INDEX_SMSCONTENT = 11;
    private final static int INDEX_SRFSYSPUB = 12;
    private final static int INDEX_SRFUSERPUB = 13;
    private final static int INDEX_SUBJECT = 14;
    private final static int INDEX_UPDATEDATE = 15;
    private final static int INDEX_UPDATEMAN = 16;
    private final static int INDEX_WCCONTENT = 17;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_CONTENTTYPE, INDEX_CONTENTTYPE);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DEID, INDEX_DEID);
        fieldIndexMap.put( FIELD_DENAME, INDEX_DENAME);
        fieldIndexMap.put( FIELD_ENABLE, INDEX_ENABLE);
        fieldIndexMap.put( FIELD_IMCONTENT, INDEX_IMCONTENT);
        fieldIndexMap.put( FIELD_MAILGROUPSEND, INDEX_MAILGROUPSEND);
        fieldIndexMap.put( FIELD_MSGTEMPLATEID, INDEX_MSGTEMPLATEID);
        fieldIndexMap.put( FIELD_MSGTEMPLATENAME, INDEX_MSGTEMPLATENAME);
        fieldIndexMap.put( FIELD_SMSCONTENT, INDEX_SMSCONTENT);
        fieldIndexMap.put( FIELD_SRFSYSPUB, INDEX_SRFSYSPUB);
        fieldIndexMap.put( FIELD_SRFUSERPUB, INDEX_SRFUSERPUB);
        fieldIndexMap.put( FIELD_SUBJECT, INDEX_SUBJECT);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_WCCONTENT, INDEX_WCCONTENT);
    }

    private MsgTemplateBase proxyMsgTemplateBase = null;

    public MsgTemplateBase() {
        super();
    }
    private boolean contentDirtyFlag = false;
    private boolean contenttypeDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean deidDirtyFlag = false;
    private boolean denameDirtyFlag = false;
    private boolean enableDirtyFlag = false;
    private boolean imcontentDirtyFlag = false;
    private boolean mailgroupsendDirtyFlag = false;
    private boolean msgtemplateidDirtyFlag = false;
    private boolean msgtemplatenameDirtyFlag = false;
    private boolean smscontentDirtyFlag = false;
    private boolean srfsyspubDirtyFlag = false;
    private boolean srfuserpubDirtyFlag = false;
    private boolean subjectDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean wccontentDirtyFlag = false;

    @Column(name="content")
    private String content;
    @Column(name="contenttype")
    private String contenttype;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="deid")
    private String deid;
    @Column(name="dename")
    private String dename;
    @Column(name="enable")
    private Integer enable;
    @Column(name="imcontent")
    private String imcontent;
    @Column(name="mailgroupsend")
    private Integer mailgroupsend;
    @Column(name="msgtemplateid")
    private String msgtemplateid;
    @Column(name="msgtemplatename")
    private String msgtemplatename;
    @Column(name="smscontent")
    private String smscontent;
    @Column(name="srfsyspub")
    private Integer srfsyspub;
    @Column(name="srfuserpub")
    private Integer srfuserpub;
    @Column(name="subject")
    private String subject;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="wccontent")
    private String wccontent;


    /**
     *  设置属性值[内容]
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
     *  获取属性值[内容]
     */
    public String getContent() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getContent();
        }
        return this.content;
    }

    /**
     *  获取属性值[内容]是否修改
     */
    public boolean isContentDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isContentDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[内容]
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
     *  设置属性值[逻辑有效标志]
     *  @param enable
     */
    public void setEnable(Integer enable) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setEnable(enable);
            return;
        }
        this.enable =  enable;
        this.enableDirtyFlag  = true;
    }

    /**
     *  获取属性值[逻辑有效标志]
     */
    public Integer getEnable() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getEnable();
        }
        return this.enable;
    }

    /**
     *  获取属性值[逻辑有效标志]是否修改
     */
    public boolean isEnableDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isEnableDirty();
        }
        return this.enableDirtyFlag;
    }

    /**
     *  重置属性值[逻辑有效标志]
     */
    public void resetEnable() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetEnable();
            return;
        }

        this.enableDirtyFlag = false;
        this.enable = null;
    }
    /**
     *  设置属性值[IM消息内容]
     *  @param imcontent
     */
    public void setIMContent(String imcontent) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIMContent(imcontent);
            return;
        }
        if(imcontent!=null) {
            imcontent = StringHelper.trimRight(imcontent);
            if(imcontent.length()==0) {
                imcontent = null;
            }
        }
        this.imcontent =  imcontent;
        this.imcontentDirtyFlag  = true;
    }

    /**
     *  获取属性值[IM消息内容]
     */
    public String getIMContent() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIMContent();
        }
        return this.imcontent;
    }

    /**
     *  获取属性值[IM消息内容]是否修改
     */
    public boolean isIMContentDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIMContentDirty();
        }
        return this.imcontentDirtyFlag;
    }

    /**
     *  重置属性值[IM消息内容]
     */
    public void resetIMContent() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIMContent();
            return;
        }

        this.imcontentDirtyFlag = false;
        this.imcontent = null;
    }
    /**
     *  设置属性值[邮件群组发送]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param mailgroupsend
     */
    public void setMailGroupSend(Integer mailgroupsend) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMailGroupSend(mailgroupsend);
            return;
        }
        this.mailgroupsend =  mailgroupsend;
        this.mailgroupsendDirtyFlag  = true;
    }

    /**
     *  获取属性值[邮件群组发送]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getMailGroupSend() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMailGroupSend();
        }
        return this.mailgroupsend;
    }

    /**
     *  获取属性值[邮件群组发送]是否修改
     */
    public boolean isMailGroupSendDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMailGroupSendDirty();
        }
        return this.mailgroupsendDirtyFlag;
    }

    /**
     *  重置属性值[邮件群组发送]
     */
    public void resetMailGroupSend() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMailGroupSend();
            return;
        }

        this.mailgroupsendDirtyFlag = false;
        this.mailgroupsend = null;
    }
    /**
     *  设置属性值[消息模板标识]
     *  @param msgtemplateid
     */
    public void setMsgTemplateId(String msgtemplateid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgTemplateId(msgtemplateid);
            return;
        }
        if(msgtemplateid!=null) {
            msgtemplateid = StringHelper.trimRight(msgtemplateid);
            if(msgtemplateid.length()==0) {
                msgtemplateid = null;
            }
        }
        this.msgtemplateid =  msgtemplateid;
        this.msgtemplateidDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息模板标识]
     */
    public String getMsgTemplateId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgTemplateId();
        }
        return this.msgtemplateid;
    }

    /**
     *  获取属性值[消息模板标识]是否修改
     */
    public boolean isMsgTemplateIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgTemplateIdDirty();
        }
        return this.msgtemplateidDirtyFlag;
    }

    /**
     *  重置属性值[消息模板标识]
     */
    public void resetMsgTemplateId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgTemplateId();
            return;
        }

        this.msgtemplateidDirtyFlag = false;
        this.msgtemplateid = null;
    }
    /**
     *  设置属性值[消息模板名称]
     *  @param msgtemplatename
     */
    public void setMsgTemplateName(String msgtemplatename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgTemplateName(msgtemplatename);
            return;
        }
        if(msgtemplatename!=null) {
            msgtemplatename = StringHelper.trimRight(msgtemplatename);
            if(msgtemplatename.length()==0) {
                msgtemplatename = null;
            }
        }
        this.msgtemplatename =  msgtemplatename;
        this.msgtemplatenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息模板名称]
     */
    public String getMsgTemplateName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgTemplateName();
        }
        return this.msgtemplatename;
    }

    /**
     *  获取属性值[消息模板名称]是否修改
     */
    public boolean isMsgTemplateNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgTemplateNameDirty();
        }
        return this.msgtemplatenameDirtyFlag;
    }

    /**
     *  重置属性值[消息模板名称]
     */
    public void resetMsgTemplateName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgTemplateName();
            return;
        }

        this.msgtemplatenameDirtyFlag = false;
        this.msgtemplatename = null;
    }
    /**
     *  设置属性值[手机消息内容]
     *  @param smscontent
     */
    public void setSMSContent(String smscontent) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setSMSContent(smscontent);
            return;
        }
        if(smscontent!=null) {
            smscontent = StringHelper.trimRight(smscontent);
            if(smscontent.length()==0) {
                smscontent = null;
            }
        }
        this.smscontent =  smscontent;
        this.smscontentDirtyFlag  = true;
    }

    /**
     *  获取属性值[手机消息内容]
     */
    public String getSMSContent() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSMSContent();
        }
        return this.smscontent;
    }

    /**
     *  获取属性值[手机消息内容]是否修改
     */
    public boolean isSMSContentDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSMSContentDirty();
        }
        return this.smscontentDirtyFlag;
    }

    /**
     *  重置属性值[手机消息内容]
     */
    public void resetSMSContent() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetSMSContent();
            return;
        }

        this.smscontentDirtyFlag = false;
        this.smscontent = null;
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
     *  设置属性值[标题]
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
     *  获取属性值[标题]
     */
    public String getSubject() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getSubject();
        }
        return this.subject;
    }

    /**
     *  获取属性值[标题]是否修改
     */
    public boolean isSubjectDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isSubjectDirty();
        }
        return this.subjectDirtyFlag;
    }

    /**
     *  重置属性值[标题]
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
     *  设置属性值[微信内容]
     *  @param wccontent
     */
    public void setWCContent(String wccontent) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWCContent(wccontent);
            return;
        }
        if(wccontent!=null) {
            wccontent = StringHelper.trimRight(wccontent);
            if(wccontent.length()==0) {
                wccontent = null;
            }
        }
        this.wccontent =  wccontent;
        this.wccontentDirtyFlag  = true;
    }

    /**
     *  获取属性值[微信内容]
     */
    public String getWCContent() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWCContent();
        }
        return this.wccontent;
    }

    /**
     *  获取属性值[微信内容]是否修改
     */
    public boolean isWCContentDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWCContentDirty();
        }
        return this.wccontentDirtyFlag;
    }

    /**
     *  重置属性值[微信内容]
     */
    public void resetWCContent() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWCContent();
            return;
        }

        this.wccontentDirtyFlag = false;
        this.wccontent = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        MsgTemplateBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(MsgTemplateBase et) {
        et.resetContent();
        et.resetContentType();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDEId();
        et.resetDEName();
        et.resetEnable();
        et.resetIMContent();
        et.resetMailGroupSend();
        et.resetMsgTemplateId();
        et.resetMsgTemplateName();
        et.resetSMSContent();
        et.resetSRFSysPub();
        et.resetSRFUserPub();
        et.resetSubject();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetWCContent();
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
        if(!bDirtyOnly || isDEIdDirty()) {
            params.put(FIELD_DEID,getDEId());
        }
        if(!bDirtyOnly || isDENameDirty()) {
            params.put(FIELD_DENAME,getDEName());
        }
        if(!bDirtyOnly || isEnableDirty()) {
            params.put(FIELD_ENABLE,getEnable());
        }
        if(!bDirtyOnly || isIMContentDirty()) {
            params.put(FIELD_IMCONTENT,getIMContent());
        }
        if(!bDirtyOnly || isMailGroupSendDirty()) {
            params.put(FIELD_MAILGROUPSEND,getMailGroupSend());
        }
        if(!bDirtyOnly || isMsgTemplateIdDirty()) {
            params.put(FIELD_MSGTEMPLATEID,getMsgTemplateId());
        }
        if(!bDirtyOnly || isMsgTemplateNameDirty()) {
            params.put(FIELD_MSGTEMPLATENAME,getMsgTemplateName());
        }
        if(!bDirtyOnly || isSMSContentDirty()) {
            params.put(FIELD_SMSCONTENT,getSMSContent());
        }
        if(!bDirtyOnly || isSRFSysPubDirty()) {
            params.put(FIELD_SRFSYSPUB,getSRFSysPub());
        }
        if(!bDirtyOnly || isSRFUserPubDirty()) {
            params.put(FIELD_SRFUSERPUB,getSRFUserPub());
        }
        if(!bDirtyOnly || isSubjectDirty()) {
            params.put(FIELD_SUBJECT,getSubject());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isWCContentDirty()) {
            params.put(FIELD_WCCONTENT,getWCContent());
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

        return  MsgTemplateBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(MsgTemplateBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.getContent();
        case INDEX_CONTENTTYPE:
            return et.getContentType();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DEID:
            return et.getDEId();
        case INDEX_DENAME:
            return et.getDEName();
        case INDEX_ENABLE:
            return et.getEnable();
        case INDEX_IMCONTENT:
            return et.getIMContent();
        case INDEX_MAILGROUPSEND:
            return et.getMailGroupSend();
        case INDEX_MSGTEMPLATEID:
            return et.getMsgTemplateId();
        case INDEX_MSGTEMPLATENAME:
            return et.getMsgTemplateName();
        case INDEX_SMSCONTENT:
            return et.getSMSContent();
        case INDEX_SRFSYSPUB:
            return et.getSRFSysPub();
        case INDEX_SRFUSERPUB:
            return et.getSRFUserPub();
        case INDEX_SUBJECT:
            return et.getSubject();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_WCCONTENT:
            return et.getWCContent();
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

        MsgTemplateBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(MsgTemplateBase et,int index,Object obj) throws Exception {
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
        case INDEX_DEID:
            et.setDEId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DENAME:
            et.setDEName(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENABLE:
            et.setEnable(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_IMCONTENT:
            et.setIMContent(DataObject.getStringValue(obj));
            return ;
        case INDEX_MAILGROUPSEND:
            et.setMailGroupSend(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MSGTEMPLATEID:
            et.setMsgTemplateId(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSGTEMPLATENAME:
            et.setMsgTemplateName(DataObject.getStringValue(obj));
            return ;
        case INDEX_SMSCONTENT:
            et.setSMSContent(DataObject.getStringValue(obj));
            return ;
        case INDEX_SRFSYSPUB:
            et.setSRFSysPub(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SRFUSERPUB:
            et.setSRFUserPub(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SUBJECT:
            et.setSubject(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_WCCONTENT:
            et.setWCContent(DataObject.getStringValue(obj));
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

        return  MsgTemplateBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(MsgTemplateBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.getContent()==null;
        case INDEX_CONTENTTYPE:
            return et.getContentType()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DEID:
            return et.getDEId()==null;
        case INDEX_DENAME:
            return et.getDEName()==null;
        case INDEX_ENABLE:
            return et.getEnable()==null;
        case INDEX_IMCONTENT:
            return et.getIMContent()==null;
        case INDEX_MAILGROUPSEND:
            return et.getMailGroupSend()==null;
        case INDEX_MSGTEMPLATEID:
            return et.getMsgTemplateId()==null;
        case INDEX_MSGTEMPLATENAME:
            return et.getMsgTemplateName()==null;
        case INDEX_SMSCONTENT:
            return et.getSMSContent()==null;
        case INDEX_SRFSYSPUB:
            return et.getSRFSysPub()==null;
        case INDEX_SRFUSERPUB:
            return et.getSRFUserPub()==null;
        case INDEX_SUBJECT:
            return et.getSubject()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_WCCONTENT:
            return et.getWCContent()==null;
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

        return  MsgTemplateBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(MsgTemplateBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.isContentDirty();
        case INDEX_CONTENTTYPE:
            return et.isContentTypeDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DEID:
            return et.isDEIdDirty();
        case INDEX_DENAME:
            return et.isDENameDirty();
        case INDEX_ENABLE:
            return et.isEnableDirty();
        case INDEX_IMCONTENT:
            return et.isIMContentDirty();
        case INDEX_MAILGROUPSEND:
            return et.isMailGroupSendDirty();
        case INDEX_MSGTEMPLATEID:
            return et.isMsgTemplateIdDirty();
        case INDEX_MSGTEMPLATENAME:
            return et.isMsgTemplateNameDirty();
        case INDEX_SMSCONTENT:
            return et.isSMSContentDirty();
        case INDEX_SRFSYSPUB:
            return et.isSRFSysPubDirty();
        case INDEX_SRFUSERPUB:
            return et.isSRFUserPubDirty();
        case INDEX_SUBJECT:
            return et.isSubjectDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_WCCONTENT:
            return et.isWCContentDirty();
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
    private static  void fillJSONObject(MsgTemplateBase et,JSONObject json, boolean bIncEmpty) throws Exception {
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
        if(bIncEmpty||et.getDEId()!=null) {
            json.put("deid", getJSONValue(et.getDEId()));
        }
        if(bIncEmpty||et.getDEName()!=null) {
            json.put("dename", getJSONValue(et.getDEName()));
        }
        if(bIncEmpty||et.getEnable()!=null) {
            json.put("enable", getJSONValue(et.getEnable()));
        }
        if(bIncEmpty||et.getIMContent()!=null) {
            json.put("imcontent", getJSONValue(et.getIMContent()));
        }
        if(bIncEmpty||et.getMailGroupSend()!=null) {
            json.put("mailgroupsend", getJSONValue(et.getMailGroupSend()));
        }
        if(bIncEmpty||et.getMsgTemplateId()!=null) {
            json.put("msgtemplateid", getJSONValue(et.getMsgTemplateId()));
        }
        if(bIncEmpty||et.getMsgTemplateName()!=null) {
            json.put("msgtemplatename", getJSONValue(et.getMsgTemplateName()));
        }
        if(bIncEmpty||et.getSMSContent()!=null) {
            json.put("smscontent", getJSONValue(et.getSMSContent()));
        }
        if(bIncEmpty||et.getSRFSysPub()!=null) {
            json.put("srfsyspub", getJSONValue(et.getSRFSysPub()));
        }
        if(bIncEmpty||et.getSRFUserPub()!=null) {
            json.put("srfuserpub", getJSONValue(et.getSRFUserPub()));
        }
        if(bIncEmpty||et.getSubject()!=null) {
            json.put("subject", getJSONValue(et.getSubject()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getWCContent()!=null) {
            json.put("wccontent", getJSONValue(et.getWCContent()));
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
    private static void fillXmlNode(MsgTemplateBase et,XmlNode node,boolean bIncEmpty) throws Exception {
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
        if(bIncEmpty||et.getDEId()!=null) {
            Object obj = et.getDEId();
            node.setAttribute("DEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEName()!=null) {
            Object obj = et.getDEName();
            node.setAttribute("DENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEnable()!=null) {
            Object obj = et.getEnable();
            node.setAttribute("ENABLE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getIMContent()!=null) {
            Object obj = et.getIMContent();
            node.setAttribute("IMCONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMailGroupSend()!=null) {
            Object obj = et.getMailGroupSend();
            node.setAttribute("MAILGROUPSEND",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMsgTemplateId()!=null) {
            Object obj = et.getMsgTemplateId();
            node.setAttribute("MSGTEMPLATEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMsgTemplateName()!=null) {
            Object obj = et.getMsgTemplateName();
            node.setAttribute("MSGTEMPLATENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSMSContent()!=null) {
            Object obj = et.getSMSContent();
            node.setAttribute("SMSCONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSRFSysPub()!=null) {
            Object obj = et.getSRFSysPub();
            node.setAttribute("SRFSYSPUB",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSRFUserPub()!=null) {
            Object obj = et.getSRFUserPub();
            node.setAttribute("SRFUSERPUB",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSubject()!=null) {
            Object obj = et.getSubject();
            node.setAttribute("SUBJECT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWCContent()!=null) {
            Object obj = et.getWCContent();
            node.setAttribute("WCCONTENT",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        MsgTemplateBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(MsgTemplateBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isEnableDirty() && (bIncEmpty||et.getEnable()!=null)) {
            Object obj = et.getEnable();
            if(obj==null) {
                dst.set(FIELD_ENABLE,null);
            } else {
                dst.set(FIELD_ENABLE,obj);
            }
        }
        if(et.isIMContentDirty() && (bIncEmpty||et.getIMContent()!=null)) {
            Object obj = et.getIMContent();
            if(obj==null) {
                dst.set(FIELD_IMCONTENT,null);
            } else {
                dst.set(FIELD_IMCONTENT,obj);
            }
        }
        if(et.isMailGroupSendDirty() && (bIncEmpty||et.getMailGroupSend()!=null)) {
            Object obj = et.getMailGroupSend();
            if(obj==null) {
                dst.set(FIELD_MAILGROUPSEND,null);
            } else {
                dst.set(FIELD_MAILGROUPSEND,obj);
            }
        }
        if(et.isMsgTemplateIdDirty() && (bIncEmpty||et.getMsgTemplateId()!=null)) {
            Object obj = et.getMsgTemplateId();
            if(obj==null) {
                dst.set(FIELD_MSGTEMPLATEID,null);
            } else {
                dst.set(FIELD_MSGTEMPLATEID,obj);
            }
        }
        if(et.isMsgTemplateNameDirty() && (bIncEmpty||et.getMsgTemplateName()!=null)) {
            Object obj = et.getMsgTemplateName();
            if(obj==null) {
                dst.set(FIELD_MSGTEMPLATENAME,null);
            } else {
                dst.set(FIELD_MSGTEMPLATENAME,obj);
            }
        }
        if(et.isSMSContentDirty() && (bIncEmpty||et.getSMSContent()!=null)) {
            Object obj = et.getSMSContent();
            if(obj==null) {
                dst.set(FIELD_SMSCONTENT,null);
            } else {
                dst.set(FIELD_SMSCONTENT,obj);
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
        if(et.isSubjectDirty() && (bIncEmpty||et.getSubject()!=null)) {
            Object obj = et.getSubject();
            if(obj==null) {
                dst.set(FIELD_SUBJECT,null);
            } else {
                dst.set(FIELD_SUBJECT,obj);
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
        if(et.isWCContentDirty() && (bIncEmpty||et.getWCContent()!=null)) {
            Object obj = et.getWCContent();
            if(obj==null) {
                dst.set(FIELD_WCCONTENT,null);
            } else {
                dst.set(FIELD_WCCONTENT,obj);
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
        return  MsgTemplateBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(MsgTemplateBase et,int index) throws Exception {

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
        case INDEX_DEID:
            et.resetDEId();
            return true;
        case INDEX_DENAME:
            et.resetDEName();
            return true;
        case INDEX_ENABLE:
            et.resetEnable();
            return true;
        case INDEX_IMCONTENT:
            et.resetIMContent();
            return true;
        case INDEX_MAILGROUPSEND:
            et.resetMailGroupSend();
            return true;
        case INDEX_MSGTEMPLATEID:
            et.resetMsgTemplateId();
            return true;
        case INDEX_MSGTEMPLATENAME:
            et.resetMsgTemplateName();
            return true;
        case INDEX_SMSCONTENT:
            et.resetSMSContent();
            return true;
        case INDEX_SRFSYSPUB:
            et.resetSRFSysPub();
            return true;
        case INDEX_SRFUSERPUB:
            et.resetSRFUserPub();
            return true;
        case INDEX_SUBJECT:
            et.resetSubject();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_WCCONTENT:
            et.resetWCContent();
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
    private MsgTemplateBase getProxyEntity() {
        return this.proxyMsgTemplateBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyMsgTemplateBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof MsgTemplateBase) {
            this.proxyMsgTemplateBase = (MsgTemplateBase)proxyDataObject;
        }

    }

}