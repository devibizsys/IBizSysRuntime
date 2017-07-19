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
 * 实体[MsgAccount] 数据对象基类
 */
public abstract class MsgAccountBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[逻辑有效标志]
     */
    public final static String FIELD_ENABLE = "ENABLE";
    /**
     *   实体属性标识[目录模型]
     */
    public final static String FIELD_FOLDERMODEL = "FOLDERMODEL";
    /**
     *   实体属性标识[消息账户组]
     */
    public final static String FIELD_ISLIST = "ISLIST";
    /**
     *   实体属性标识[邮件地址]
     */
    public final static String FIELD_MAILADDRESS = "MAILADDRESS";
    /**
     *   实体属性标识[移动电话]
     */
    public final static String FIELD_MOBILE = "MOBILE";
    /**
     *   实体属性标识[消息账户标识]
     */
    public final static String FIELD_MSGACCOUNTID = "MSGACCOUNTID";
    /**
     *   实体属性标识[消息账户名称]
     */
    public final static String FIELD_MSGACCOUNTNAME = "MSGACCOUNTNAME";
    /**
     *   实体属性标识[地址]
     */
    public final static String FIELD_MSGADDRESS = "MSGADDRESS";
    /**
     *   实体属性标识[MSN邮件地址]
     */
    public final static String FIELD_MSNEMAIL = "MSNEMAIL";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[微信地址]
     */
    public final static String FIELD_WECHARADDR = "WECHARADDR";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_ENABLE = 2;
    private final static int INDEX_FOLDERMODEL = 3;
    private final static int INDEX_ISLIST = 4;
    private final static int INDEX_MAILADDRESS = 5;
    private final static int INDEX_MOBILE = 6;
    private final static int INDEX_MSGACCOUNTID = 7;
    private final static int INDEX_MSGACCOUNTNAME = 8;
    private final static int INDEX_MSGADDRESS = 9;
    private final static int INDEX_MSNEMAIL = 10;
    private final static int INDEX_UPDATEDATE = 11;
    private final static int INDEX_UPDATEMAN = 12;
    private final static int INDEX_WECHARADDR = 13;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_ENABLE, INDEX_ENABLE);
        fieldIndexMap.put( FIELD_FOLDERMODEL, INDEX_FOLDERMODEL);
        fieldIndexMap.put( FIELD_ISLIST, INDEX_ISLIST);
        fieldIndexMap.put( FIELD_MAILADDRESS, INDEX_MAILADDRESS);
        fieldIndexMap.put( FIELD_MOBILE, INDEX_MOBILE);
        fieldIndexMap.put( FIELD_MSGACCOUNTID, INDEX_MSGACCOUNTID);
        fieldIndexMap.put( FIELD_MSGACCOUNTNAME, INDEX_MSGACCOUNTNAME);
        fieldIndexMap.put( FIELD_MSGADDRESS, INDEX_MSGADDRESS);
        fieldIndexMap.put( FIELD_MSNEMAIL, INDEX_MSNEMAIL);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_WECHARADDR, INDEX_WECHARADDR);
    }

    private MsgAccountBase proxyMsgAccountBase = null;

    public MsgAccountBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean enableDirtyFlag = false;
    private boolean foldermodelDirtyFlag = false;
    private boolean islistDirtyFlag = false;
    private boolean mailaddressDirtyFlag = false;
    private boolean mobileDirtyFlag = false;
    private boolean msgaccountidDirtyFlag = false;
    private boolean msgaccountnameDirtyFlag = false;
    private boolean msgaddressDirtyFlag = false;
    private boolean msnemailDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean wecharaddrDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="enable")
    private Integer enable;
    @Column(name="foldermodel")
    private String foldermodel;
    @Column(name="islist")
    private Integer islist;
    @Column(name="mailaddress")
    private String mailaddress;
    @Column(name="mobile")
    private String mobile;
    @Column(name="msgaccountid")
    private String msgaccountid;
    @Column(name="msgaccountname")
    private String msgaccountname;
    @Column(name="msgaddress")
    private String msgaddress;
    @Column(name="msnemail")
    private String msnemail;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="wecharaddr")
    private String wecharaddr;


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
     *  设置属性值[目录模型]
     *  @param foldermodel
     */
    public void setFolderModel(String foldermodel) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFolderModel(foldermodel);
            return;
        }
        if(foldermodel!=null) {
            foldermodel = StringHelper.trimRight(foldermodel);
            if(foldermodel.length()==0) {
                foldermodel = null;
            }
        }
        this.foldermodel =  foldermodel;
        this.foldermodelDirtyFlag  = true;
    }

    /**
     *  获取属性值[目录模型]
     */
    public String getFolderModel() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFolderModel();
        }
        return this.foldermodel;
    }

    /**
     *  获取属性值[目录模型]是否修改
     */
    public boolean isFolderModelDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFolderModelDirty();
        }
        return this.foldermodelDirtyFlag;
    }

    /**
     *  重置属性值[目录模型]
     */
    public void resetFolderModel() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFolderModel();
            return;
        }

        this.foldermodelDirtyFlag = false;
        this.foldermodel = null;
    }
    /**
     *  设置属性值[消息账户组]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param islist
     */
    public void setIsList(Integer islist) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setIsList(islist);
            return;
        }
        this.islist =  islist;
        this.islistDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息账户组]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getIsList() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getIsList();
        }
        return this.islist;
    }

    /**
     *  获取属性值[消息账户组]是否修改
     */
    public boolean isIsListDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isIsListDirty();
        }
        return this.islistDirtyFlag;
    }

    /**
     *  重置属性值[消息账户组]
     */
    public void resetIsList() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetIsList();
            return;
        }

        this.islistDirtyFlag = false;
        this.islist = null;
    }
    /**
     *  设置属性值[邮件地址]
     *  @param mailaddress
     */
    public void setMailAddress(String mailaddress) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMailAddress(mailaddress);
            return;
        }
        if(mailaddress!=null) {
            mailaddress = StringHelper.trimRight(mailaddress);
            if(mailaddress.length()==0) {
                mailaddress = null;
            }
        }
        this.mailaddress =  mailaddress;
        this.mailaddressDirtyFlag  = true;
    }

    /**
     *  获取属性值[邮件地址]
     */
    public String getMailAddress() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMailAddress();
        }
        return this.mailaddress;
    }

    /**
     *  获取属性值[邮件地址]是否修改
     */
    public boolean isMailAddressDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMailAddressDirty();
        }
        return this.mailaddressDirtyFlag;
    }

    /**
     *  重置属性值[邮件地址]
     */
    public void resetMailAddress() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMailAddress();
            return;
        }

        this.mailaddressDirtyFlag = false;
        this.mailaddress = null;
    }
    /**
     *  设置属性值[移动电话]
     *  @param mobile
     */
    public void setMobile(String mobile) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMobile(mobile);
            return;
        }
        if(mobile!=null) {
            mobile = StringHelper.trimRight(mobile);
            if(mobile.length()==0) {
                mobile = null;
            }
        }
        this.mobile =  mobile;
        this.mobileDirtyFlag  = true;
    }

    /**
     *  获取属性值[移动电话]
     */
    public String getMobile() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMobile();
        }
        return this.mobile;
    }

    /**
     *  获取属性值[移动电话]是否修改
     */
    public boolean isMobileDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMobileDirty();
        }
        return this.mobileDirtyFlag;
    }

    /**
     *  重置属性值[移动电话]
     */
    public void resetMobile() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMobile();
            return;
        }

        this.mobileDirtyFlag = false;
        this.mobile = null;
    }
    /**
     *  设置属性值[消息账户标识]
     *  @param msgaccountid
     */
    public void setMsgAccountId(String msgaccountid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgAccountId(msgaccountid);
            return;
        }
        if(msgaccountid!=null) {
            msgaccountid = StringHelper.trimRight(msgaccountid);
            if(msgaccountid.length()==0) {
                msgaccountid = null;
            }
        }
        this.msgaccountid =  msgaccountid;
        this.msgaccountidDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息账户标识]
     */
    public String getMsgAccountId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgAccountId();
        }
        return this.msgaccountid;
    }

    /**
     *  获取属性值[消息账户标识]是否修改
     */
    public boolean isMsgAccountIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgAccountIdDirty();
        }
        return this.msgaccountidDirtyFlag;
    }

    /**
     *  重置属性值[消息账户标识]
     */
    public void resetMsgAccountId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgAccountId();
            return;
        }

        this.msgaccountidDirtyFlag = false;
        this.msgaccountid = null;
    }
    /**
     *  设置属性值[消息账户名称]
     *  @param msgaccountname
     */
    public void setMsgAccountName(String msgaccountname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgAccountName(msgaccountname);
            return;
        }
        if(msgaccountname!=null) {
            msgaccountname = StringHelper.trimRight(msgaccountname);
            if(msgaccountname.length()==0) {
                msgaccountname = null;
            }
        }
        this.msgaccountname =  msgaccountname;
        this.msgaccountnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[消息账户名称]
     */
    public String getMsgAccountName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgAccountName();
        }
        return this.msgaccountname;
    }

    /**
     *  获取属性值[消息账户名称]是否修改
     */
    public boolean isMsgAccountNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgAccountNameDirty();
        }
        return this.msgaccountnameDirtyFlag;
    }

    /**
     *  重置属性值[消息账户名称]
     */
    public void resetMsgAccountName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgAccountName();
            return;
        }

        this.msgaccountnameDirtyFlag = false;
        this.msgaccountname = null;
    }
    /**
     *  设置属性值[地址]
     *  @param msgaddress
     */
    public void setMsgAddress(String msgaddress) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsgAddress(msgaddress);
            return;
        }
        if(msgaddress!=null) {
            msgaddress = StringHelper.trimRight(msgaddress);
            if(msgaddress.length()==0) {
                msgaddress = null;
            }
        }
        this.msgaddress =  msgaddress;
        this.msgaddressDirtyFlag  = true;
    }

    /**
     *  获取属性值[地址]
     */
    public String getMsgAddress() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsgAddress();
        }
        return this.msgaddress;
    }

    /**
     *  获取属性值[地址]是否修改
     */
    public boolean isMsgAddressDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsgAddressDirty();
        }
        return this.msgaddressDirtyFlag;
    }

    /**
     *  重置属性值[地址]
     */
    public void resetMsgAddress() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsgAddress();
            return;
        }

        this.msgaddressDirtyFlag = false;
        this.msgaddress = null;
    }
    /**
     *  设置属性值[MSN邮件地址]
     *  @param msnemail
     */
    public void setMsnEmail(String msnemail) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMsnEmail(msnemail);
            return;
        }
        if(msnemail!=null) {
            msnemail = StringHelper.trimRight(msnemail);
            if(msnemail.length()==0) {
                msnemail = null;
            }
        }
        this.msnemail =  msnemail;
        this.msnemailDirtyFlag  = true;
    }

    /**
     *  获取属性值[MSN邮件地址]
     */
    public String getMsnEmail() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMsnEmail();
        }
        return this.msnemail;
    }

    /**
     *  获取属性值[MSN邮件地址]是否修改
     */
    public boolean isMsnEmailDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMsnEmailDirty();
        }
        return this.msnemailDirtyFlag;
    }

    /**
     *  重置属性值[MSN邮件地址]
     */
    public void resetMsnEmail() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMsnEmail();
            return;
        }

        this.msnemailDirtyFlag = false;
        this.msnemail = null;
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
     *  设置属性值[微信地址]
     *  @param wecharaddr
     */
    public void setWeCharAddr(String wecharaddr) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setWeCharAddr(wecharaddr);
            return;
        }
        if(wecharaddr!=null) {
            wecharaddr = StringHelper.trimRight(wecharaddr);
            if(wecharaddr.length()==0) {
                wecharaddr = null;
            }
        }
        this.wecharaddr =  wecharaddr;
        this.wecharaddrDirtyFlag  = true;
    }

    /**
     *  获取属性值[微信地址]
     */
    public String getWeCharAddr() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getWeCharAddr();
        }
        return this.wecharaddr;
    }

    /**
     *  获取属性值[微信地址]是否修改
     */
    public boolean isWeCharAddrDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isWeCharAddrDirty();
        }
        return this.wecharaddrDirtyFlag;
    }

    /**
     *  重置属性值[微信地址]
     */
    public void resetWeCharAddr() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetWeCharAddr();
            return;
        }

        this.wecharaddrDirtyFlag = false;
        this.wecharaddr = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        MsgAccountBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(MsgAccountBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetEnable();
        et.resetFolderModel();
        et.resetIsList();
        et.resetMailAddress();
        et.resetMobile();
        et.resetMsgAccountId();
        et.resetMsgAccountName();
        et.resetMsgAddress();
        et.resetMsnEmail();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetWeCharAddr();
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
        if(!bDirtyOnly || isEnableDirty()) {
            params.put(FIELD_ENABLE,getEnable());
        }
        if(!bDirtyOnly || isFolderModelDirty()) {
            params.put(FIELD_FOLDERMODEL,getFolderModel());
        }
        if(!bDirtyOnly || isIsListDirty()) {
            params.put(FIELD_ISLIST,getIsList());
        }
        if(!bDirtyOnly || isMailAddressDirty()) {
            params.put(FIELD_MAILADDRESS,getMailAddress());
        }
        if(!bDirtyOnly || isMobileDirty()) {
            params.put(FIELD_MOBILE,getMobile());
        }
        if(!bDirtyOnly || isMsgAccountIdDirty()) {
            params.put(FIELD_MSGACCOUNTID,getMsgAccountId());
        }
        if(!bDirtyOnly || isMsgAccountNameDirty()) {
            params.put(FIELD_MSGACCOUNTNAME,getMsgAccountName());
        }
        if(!bDirtyOnly || isMsgAddressDirty()) {
            params.put(FIELD_MSGADDRESS,getMsgAddress());
        }
        if(!bDirtyOnly || isMsnEmailDirty()) {
            params.put(FIELD_MSNEMAIL,getMsnEmail());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isWeCharAddrDirty()) {
            params.put(FIELD_WECHARADDR,getWeCharAddr());
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

        return  MsgAccountBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(MsgAccountBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_ENABLE:
            return et.getEnable();
        case INDEX_FOLDERMODEL:
            return et.getFolderModel();
        case INDEX_ISLIST:
            return et.getIsList();
        case INDEX_MAILADDRESS:
            return et.getMailAddress();
        case INDEX_MOBILE:
            return et.getMobile();
        case INDEX_MSGACCOUNTID:
            return et.getMsgAccountId();
        case INDEX_MSGACCOUNTNAME:
            return et.getMsgAccountName();
        case INDEX_MSGADDRESS:
            return et.getMsgAddress();
        case INDEX_MSNEMAIL:
            return et.getMsnEmail();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_WECHARADDR:
            return et.getWeCharAddr();
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

        MsgAccountBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(MsgAccountBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENABLE:
            et.setEnable(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_FOLDERMODEL:
            et.setFolderModel(DataObject.getStringValue(obj));
            return ;
        case INDEX_ISLIST:
            et.setIsList(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MAILADDRESS:
            et.setMailAddress(DataObject.getStringValue(obj));
            return ;
        case INDEX_MOBILE:
            et.setMobile(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSGACCOUNTID:
            et.setMsgAccountId(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSGACCOUNTNAME:
            et.setMsgAccountName(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSGADDRESS:
            et.setMsgAddress(DataObject.getStringValue(obj));
            return ;
        case INDEX_MSNEMAIL:
            et.setMsnEmail(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_WECHARADDR:
            et.setWeCharAddr(DataObject.getStringValue(obj));
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

        return  MsgAccountBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(MsgAccountBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_ENABLE:
            return et.getEnable()==null;
        case INDEX_FOLDERMODEL:
            return et.getFolderModel()==null;
        case INDEX_ISLIST:
            return et.getIsList()==null;
        case INDEX_MAILADDRESS:
            return et.getMailAddress()==null;
        case INDEX_MOBILE:
            return et.getMobile()==null;
        case INDEX_MSGACCOUNTID:
            return et.getMsgAccountId()==null;
        case INDEX_MSGACCOUNTNAME:
            return et.getMsgAccountName()==null;
        case INDEX_MSGADDRESS:
            return et.getMsgAddress()==null;
        case INDEX_MSNEMAIL:
            return et.getMsnEmail()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_WECHARADDR:
            return et.getWeCharAddr()==null;
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

        return  MsgAccountBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(MsgAccountBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_ENABLE:
            return et.isEnableDirty();
        case INDEX_FOLDERMODEL:
            return et.isFolderModelDirty();
        case INDEX_ISLIST:
            return et.isIsListDirty();
        case INDEX_MAILADDRESS:
            return et.isMailAddressDirty();
        case INDEX_MOBILE:
            return et.isMobileDirty();
        case INDEX_MSGACCOUNTID:
            return et.isMsgAccountIdDirty();
        case INDEX_MSGACCOUNTNAME:
            return et.isMsgAccountNameDirty();
        case INDEX_MSGADDRESS:
            return et.isMsgAddressDirty();
        case INDEX_MSNEMAIL:
            return et.isMsnEmailDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_WECHARADDR:
            return et.isWeCharAddrDirty();
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
    private static  void fillJSONObject(MsgAccountBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getEnable()!=null) {
            json.put("enable", getJSONValue(et.getEnable()));
        }
        if(bIncEmpty||et.getFolderModel()!=null) {
            json.put("foldermodel", getJSONValue(et.getFolderModel()));
        }
        if(bIncEmpty||et.getIsList()!=null) {
            json.put("islist", getJSONValue(et.getIsList()));
        }
        if(bIncEmpty||et.getMailAddress()!=null) {
            json.put("mailaddress", getJSONValue(et.getMailAddress()));
        }
        if(bIncEmpty||et.getMobile()!=null) {
            json.put("mobile", getJSONValue(et.getMobile()));
        }
        if(bIncEmpty||et.getMsgAccountId()!=null) {
            json.put("msgaccountid", getJSONValue(et.getMsgAccountId()));
        }
        if(bIncEmpty||et.getMsgAccountName()!=null) {
            json.put("msgaccountname", getJSONValue(et.getMsgAccountName()));
        }
        if(bIncEmpty||et.getMsgAddress()!=null) {
            json.put("msgaddress", getJSONValue(et.getMsgAddress()));
        }
        if(bIncEmpty||et.getMsnEmail()!=null) {
            json.put("msnemail", getJSONValue(et.getMsnEmail()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getWeCharAddr()!=null) {
            json.put("wecharaddr", getJSONValue(et.getWeCharAddr()));
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
    private static void fillXmlNode(MsgAccountBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEnable()!=null) {
            Object obj = et.getEnable();
            node.setAttribute("ENABLE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getFolderModel()!=null) {
            Object obj = et.getFolderModel();
            node.setAttribute("FOLDERMODEL",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getIsList()!=null) {
            Object obj = et.getIsList();
            node.setAttribute("ISLIST",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMailAddress()!=null) {
            Object obj = et.getMailAddress();
            node.setAttribute("MAILADDRESS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMobile()!=null) {
            Object obj = et.getMobile();
            node.setAttribute("MOBILE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMsgAccountId()!=null) {
            Object obj = et.getMsgAccountId();
            node.setAttribute("MSGACCOUNTID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMsgAccountName()!=null) {
            Object obj = et.getMsgAccountName();
            node.setAttribute("MSGACCOUNTNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMsgAddress()!=null) {
            Object obj = et.getMsgAddress();
            node.setAttribute("MSGADDRESS",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMsnEmail()!=null) {
            Object obj = et.getMsnEmail();
            node.setAttribute("MSNEMAIL",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getWeCharAddr()!=null) {
            Object obj = et.getWeCharAddr();
            node.setAttribute("WECHARADDR",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        MsgAccountBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(MsgAccountBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isEnableDirty() && (bIncEmpty||et.getEnable()!=null)) {
            Object obj = et.getEnable();
            if(obj==null) {
                dst.set(FIELD_ENABLE,null);
            } else {
                dst.set(FIELD_ENABLE,obj);
            }
        }
        if(et.isFolderModelDirty() && (bIncEmpty||et.getFolderModel()!=null)) {
            Object obj = et.getFolderModel();
            if(obj==null) {
                dst.set(FIELD_FOLDERMODEL,null);
            } else {
                dst.set(FIELD_FOLDERMODEL,obj);
            }
        }
        if(et.isIsListDirty() && (bIncEmpty||et.getIsList()!=null)) {
            Object obj = et.getIsList();
            if(obj==null) {
                dst.set(FIELD_ISLIST,null);
            } else {
                dst.set(FIELD_ISLIST,obj);
            }
        }
        if(et.isMailAddressDirty() && (bIncEmpty||et.getMailAddress()!=null)) {
            Object obj = et.getMailAddress();
            if(obj==null) {
                dst.set(FIELD_MAILADDRESS,null);
            } else {
                dst.set(FIELD_MAILADDRESS,obj);
            }
        }
        if(et.isMobileDirty() && (bIncEmpty||et.getMobile()!=null)) {
            Object obj = et.getMobile();
            if(obj==null) {
                dst.set(FIELD_MOBILE,null);
            } else {
                dst.set(FIELD_MOBILE,obj);
            }
        }
        if(et.isMsgAccountIdDirty() && (bIncEmpty||et.getMsgAccountId()!=null)) {
            Object obj = et.getMsgAccountId();
            if(obj==null) {
                dst.set(FIELD_MSGACCOUNTID,null);
            } else {
                dst.set(FIELD_MSGACCOUNTID,obj);
            }
        }
        if(et.isMsgAccountNameDirty() && (bIncEmpty||et.getMsgAccountName()!=null)) {
            Object obj = et.getMsgAccountName();
            if(obj==null) {
                dst.set(FIELD_MSGACCOUNTNAME,null);
            } else {
                dst.set(FIELD_MSGACCOUNTNAME,obj);
            }
        }
        if(et.isMsgAddressDirty() && (bIncEmpty||et.getMsgAddress()!=null)) {
            Object obj = et.getMsgAddress();
            if(obj==null) {
                dst.set(FIELD_MSGADDRESS,null);
            } else {
                dst.set(FIELD_MSGADDRESS,obj);
            }
        }
        if(et.isMsnEmailDirty() && (bIncEmpty||et.getMsnEmail()!=null)) {
            Object obj = et.getMsnEmail();
            if(obj==null) {
                dst.set(FIELD_MSNEMAIL,null);
            } else {
                dst.set(FIELD_MSNEMAIL,obj);
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
        if(et.isWeCharAddrDirty() && (bIncEmpty||et.getWeCharAddr()!=null)) {
            Object obj = et.getWeCharAddr();
            if(obj==null) {
                dst.set(FIELD_WECHARADDR,null);
            } else {
                dst.set(FIELD_WECHARADDR,obj);
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
        return  MsgAccountBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(MsgAccountBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_ENABLE:
            et.resetEnable();
            return true;
        case INDEX_FOLDERMODEL:
            et.resetFolderModel();
            return true;
        case INDEX_ISLIST:
            et.resetIsList();
            return true;
        case INDEX_MAILADDRESS:
            et.resetMailAddress();
            return true;
        case INDEX_MOBILE:
            et.resetMobile();
            return true;
        case INDEX_MSGACCOUNTID:
            et.resetMsgAccountId();
            return true;
        case INDEX_MSGACCOUNTNAME:
            et.resetMsgAccountName();
            return true;
        case INDEX_MSGADDRESS:
            et.resetMsgAddress();
            return true;
        case INDEX_MSNEMAIL:
            et.resetMsnEmail();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_WECHARADDR:
            et.resetWeCharAddr();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }







    /**
     *  获取代理的数据对象
     */
    private MsgAccountBase getProxyEntity() {
        return this.proxyMsgAccountBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyMsgAccountBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof MsgAccountBase) {
            this.proxyMsgAccountBase = (MsgAccountBase)proxyDataObject;
        }

    }

}