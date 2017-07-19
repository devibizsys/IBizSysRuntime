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
 * 实体[UserDictItem] 数据对象基类
 */
public abstract class UserDictItemBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     *   实体属性标识[完整内容]
     */
    public final static String FIELD_CONTENT = "CONTENT";
    /**
     *   实体属性标识[建立时间]
     */
    public final static String FIELD_CREATEDATE = "CREATEDATE";
    /**
     *   实体属性标识[建立人]
     */
    public final static String FIELD_CREATEMAN = "CREATEMAN";
    /**
     *   实体属性标识[标记常用]
     */
    public final static String FIELD_MARKFLAG = "MARKFLAG";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[词条类别]
     */
    public final static String FIELD_USERDICTCATID = "USERDICTCATID";
    /**
     *   实体属性标识[词条类别]
     */
    public final static String FIELD_USERDICTCATNAME = "USERDICTCATNAME";
    /**
     *   实体属性标识[用户词典]
     */
    public final static String FIELD_USERDICTID = "USERDICTID";
    /**
     *   实体属性标识[用户词典词条标识]
     */
    public final static String FIELD_USERDICTITEMID = "USERDICTITEMID";
    /**
     *   实体属性标识[词条名称]
     */
    public final static String FIELD_USERDICTITEMNAME = "USERDICTITEMNAME";
    /**
     *   实体属性标识[用户词典]
     */
    public final static String FIELD_USERDICTNAME = "USERDICTNAME";

    private final static int INDEX_CONTENT = 0;
    private final static int INDEX_CREATEDATE = 1;
    private final static int INDEX_CREATEMAN = 2;
    private final static int INDEX_MARKFLAG = 3;
    private final static int INDEX_MEMO = 4;
    private final static int INDEX_UPDATEDATE = 5;
    private final static int INDEX_UPDATEMAN = 6;
    private final static int INDEX_USERDICTCATID = 7;
    private final static int INDEX_USERDICTCATNAME = 8;
    private final static int INDEX_USERDICTID = 9;
    private final static int INDEX_USERDICTITEMID = 10;
    private final static int INDEX_USERDICTITEMNAME = 11;
    private final static int INDEX_USERDICTNAME = 12;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CONTENT, INDEX_CONTENT);
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_MARKFLAG, INDEX_MARKFLAG);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERDICTCATID, INDEX_USERDICTCATID);
        fieldIndexMap.put( FIELD_USERDICTCATNAME, INDEX_USERDICTCATNAME);
        fieldIndexMap.put( FIELD_USERDICTID, INDEX_USERDICTID);
        fieldIndexMap.put( FIELD_USERDICTITEMID, INDEX_USERDICTITEMID);
        fieldIndexMap.put( FIELD_USERDICTITEMNAME, INDEX_USERDICTITEMNAME);
        fieldIndexMap.put( FIELD_USERDICTNAME, INDEX_USERDICTNAME);
    }

    private UserDictItemBase proxyUserDictItemBase = null;

    public UserDictItemBase() {
        super();
    }
    private boolean contentDirtyFlag = false;
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean markflagDirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userdictcatidDirtyFlag = false;
    private boolean userdictcatnameDirtyFlag = false;
    private boolean userdictidDirtyFlag = false;
    private boolean userdictitemidDirtyFlag = false;
    private boolean userdictitemnameDirtyFlag = false;
    private boolean userdictnameDirtyFlag = false;

    @Column(name="content")
    private String content;
    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="markflag")
    private Integer markflag;
    @Column(name="memo")
    private String memo;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userdictcatid")
    private String userdictcatid;
    @Column(name="userdictcatname")
    private String userdictcatname;
    @Column(name="userdictid")
    private String userdictid;
    @Column(name="userdictitemid")
    private String userdictitemid;
    @Column(name="userdictitemname")
    private String userdictitemname;
    @Column(name="userdictname")
    private String userdictname;


    /**
     *  设置属性值[完整内容]
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
     *  获取属性值[完整内容]
     */
    public String getContent() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getContent();
        }
        return this.content;
    }

    /**
     *  获取属性值[完整内容]是否修改
     */
    public boolean isContentDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isContentDirty();
        }
        return this.contentDirtyFlag;
    }

    /**
     *  重置属性值[完整内容]
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
     *  设置属性值[标记常用]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     *  @param markflag
     */
    public void setMarkFlag(Integer markflag) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setMarkFlag(markflag);
            return;
        }
        this.markflag =  markflag;
        this.markflagDirtyFlag  = true;
    }

    /**
     *  获取属性值[标记常用]代码表：net.ibizsys.psrt.srv.codelist.YesNoCodeListModel
     */
    public Integer getMarkFlag() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getMarkFlag();
        }
        return this.markflag;
    }

    /**
     *  获取属性值[标记常用]是否修改
     */
    public boolean isMarkFlagDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isMarkFlagDirty();
        }
        return this.markflagDirtyFlag;
    }

    /**
     *  重置属性值[标记常用]
     */
    public void resetMarkFlag() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetMarkFlag();
            return;
        }

        this.markflagDirtyFlag = false;
        this.markflag = null;
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
     *  设置属性值[词条类别]
     *  @param userdictcatid
     */
    public void setUserDictCatId(String userdictcatid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDictCatId(userdictcatid);
            return;
        }
        if(userdictcatid!=null) {
            userdictcatid = StringHelper.trimRight(userdictcatid);
            if(userdictcatid.length()==0) {
                userdictcatid = null;
            }
        }
        this.userdictcatid =  userdictcatid;
        this.userdictcatidDirtyFlag  = true;
    }

    /**
     *  获取属性值[词条类别]
     */
    public String getUserDictCatId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDictCatId();
        }
        return this.userdictcatid;
    }

    /**
     *  获取属性值[词条类别]是否修改
     */
    public boolean isUserDictCatIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDictCatIdDirty();
        }
        return this.userdictcatidDirtyFlag;
    }

    /**
     *  重置属性值[词条类别]
     */
    public void resetUserDictCatId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDictCatId();
            return;
        }

        this.userdictcatidDirtyFlag = false;
        this.userdictcatid = null;
    }
    /**
     *  设置属性值[词条类别]
     *  @param userdictcatname
     */
    public void setUserDictCatName(String userdictcatname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDictCatName(userdictcatname);
            return;
        }
        if(userdictcatname!=null) {
            userdictcatname = StringHelper.trimRight(userdictcatname);
            if(userdictcatname.length()==0) {
                userdictcatname = null;
            }
        }
        this.userdictcatname =  userdictcatname;
        this.userdictcatnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[词条类别]
     */
    public String getUserDictCatName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDictCatName();
        }
        return this.userdictcatname;
    }

    /**
     *  获取属性值[词条类别]是否修改
     */
    public boolean isUserDictCatNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDictCatNameDirty();
        }
        return this.userdictcatnameDirtyFlag;
    }

    /**
     *  重置属性值[词条类别]
     */
    public void resetUserDictCatName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDictCatName();
            return;
        }

        this.userdictcatnameDirtyFlag = false;
        this.userdictcatname = null;
    }
    /**
     *  设置属性值[用户词典]
     *  @param userdictid
     */
    public void setUserDictId(String userdictid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDictId(userdictid);
            return;
        }
        if(userdictid!=null) {
            userdictid = StringHelper.trimRight(userdictid);
            if(userdictid.length()==0) {
                userdictid = null;
            }
        }
        this.userdictid =  userdictid;
        this.userdictidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户词典]
     */
    public String getUserDictId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDictId();
        }
        return this.userdictid;
    }

    /**
     *  获取属性值[用户词典]是否修改
     */
    public boolean isUserDictIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDictIdDirty();
        }
        return this.userdictidDirtyFlag;
    }

    /**
     *  重置属性值[用户词典]
     */
    public void resetUserDictId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDictId();
            return;
        }

        this.userdictidDirtyFlag = false;
        this.userdictid = null;
    }
    /**
     *  设置属性值[用户词典词条标识]
     *  @param userdictitemid
     */
    public void setUserDictItemId(String userdictitemid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDictItemId(userdictitemid);
            return;
        }
        if(userdictitemid!=null) {
            userdictitemid = StringHelper.trimRight(userdictitemid);
            if(userdictitemid.length()==0) {
                userdictitemid = null;
            }
        }
        this.userdictitemid =  userdictitemid;
        this.userdictitemidDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户词典词条标识]
     */
    public String getUserDictItemId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDictItemId();
        }
        return this.userdictitemid;
    }

    /**
     *  获取属性值[用户词典词条标识]是否修改
     */
    public boolean isUserDictItemIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDictItemIdDirty();
        }
        return this.userdictitemidDirtyFlag;
    }

    /**
     *  重置属性值[用户词典词条标识]
     */
    public void resetUserDictItemId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDictItemId();
            return;
        }

        this.userdictitemidDirtyFlag = false;
        this.userdictitemid = null;
    }
    /**
     *  设置属性值[词条名称]
     *  @param userdictitemname
     */
    public void setUserDictItemName(String userdictitemname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDictItemName(userdictitemname);
            return;
        }
        if(userdictitemname!=null) {
            userdictitemname = StringHelper.trimRight(userdictitemname);
            if(userdictitemname.length()==0) {
                userdictitemname = null;
            }
        }
        this.userdictitemname =  userdictitemname;
        this.userdictitemnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[词条名称]
     */
    public String getUserDictItemName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDictItemName();
        }
        return this.userdictitemname;
    }

    /**
     *  获取属性值[词条名称]是否修改
     */
    public boolean isUserDictItemNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDictItemNameDirty();
        }
        return this.userdictitemnameDirtyFlag;
    }

    /**
     *  重置属性值[词条名称]
     */
    public void resetUserDictItemName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDictItemName();
            return;
        }

        this.userdictitemnameDirtyFlag = false;
        this.userdictitemname = null;
    }
    /**
     *  设置属性值[用户词典]
     *  @param userdictname
     */
    public void setUserDictName(String userdictname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserDictName(userdictname);
            return;
        }
        if(userdictname!=null) {
            userdictname = StringHelper.trimRight(userdictname);
            if(userdictname.length()==0) {
                userdictname = null;
            }
        }
        this.userdictname =  userdictname;
        this.userdictnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[用户词典]
     */
    public String getUserDictName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDictName();
        }
        return this.userdictname;
    }

    /**
     *  获取属性值[用户词典]是否修改
     */
    public boolean isUserDictNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserDictNameDirty();
        }
        return this.userdictnameDirtyFlag;
    }

    /**
     *  重置属性值[用户词典]
     */
    public void resetUserDictName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserDictName();
            return;
        }

        this.userdictnameDirtyFlag = false;
        this.userdictname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        UserDictItemBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserDictItemBase et) {
        et.resetContent();
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetMarkFlag();
        et.resetMemo();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserDictCatId();
        et.resetUserDictCatName();
        et.resetUserDictId();
        et.resetUserDictItemId();
        et.resetUserDictItemName();
        et.resetUserDictName();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onFillMap(java.util.HashMap, boolean)
     */
    @Override
    protected void onFillMap(HashMap<String, Object> params, boolean bDirtyOnly) {
        if(!bDirtyOnly || isContentDirty()) {
            params.put(FIELD_CONTENT,getContent());
        }
        if(!bDirtyOnly || isCreateDateDirty()) {
            params.put(FIELD_CREATEDATE,getCreateDate());
        }
        if(!bDirtyOnly || isCreateManDirty()) {
            params.put(FIELD_CREATEMAN,getCreateMan());
        }
        if(!bDirtyOnly || isMarkFlagDirty()) {
            params.put(FIELD_MARKFLAG,getMarkFlag());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserDictCatIdDirty()) {
            params.put(FIELD_USERDICTCATID,getUserDictCatId());
        }
        if(!bDirtyOnly || isUserDictCatNameDirty()) {
            params.put(FIELD_USERDICTCATNAME,getUserDictCatName());
        }
        if(!bDirtyOnly || isUserDictIdDirty()) {
            params.put(FIELD_USERDICTID,getUserDictId());
        }
        if(!bDirtyOnly || isUserDictItemIdDirty()) {
            params.put(FIELD_USERDICTITEMID,getUserDictItemId());
        }
        if(!bDirtyOnly || isUserDictItemNameDirty()) {
            params.put(FIELD_USERDICTITEMNAME,getUserDictItemName());
        }
        if(!bDirtyOnly || isUserDictNameDirty()) {
            params.put(FIELD_USERDICTNAME,getUserDictName());
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

        return  UserDictItemBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserDictItemBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.getContent();
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_MARKFLAG:
            return et.getMarkFlag();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERDICTCATID:
            return et.getUserDictCatId();
        case INDEX_USERDICTCATNAME:
            return et.getUserDictCatName();
        case INDEX_USERDICTID:
            return et.getUserDictId();
        case INDEX_USERDICTITEMID:
            return et.getUserDictItemId();
        case INDEX_USERDICTITEMNAME:
            return et.getUserDictItemName();
        case INDEX_USERDICTNAME:
            return et.getUserDictName();
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

        UserDictItemBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserDictItemBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CONTENT:
            et.setContent(DataObject.getStringValue(obj));
            return ;
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_MARKFLAG:
            et.setMarkFlag(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDICTCATID:
            et.setUserDictCatId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDICTCATNAME:
            et.setUserDictCatName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDICTID:
            et.setUserDictId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDICTITEMID:
            et.setUserDictItemId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDICTITEMNAME:
            et.setUserDictItemName(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERDICTNAME:
            et.setUserDictName(DataObject.getStringValue(obj));
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

        return  UserDictItemBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserDictItemBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.getContent()==null;
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_MARKFLAG:
            return et.getMarkFlag()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERDICTCATID:
            return et.getUserDictCatId()==null;
        case INDEX_USERDICTCATNAME:
            return et.getUserDictCatName()==null;
        case INDEX_USERDICTID:
            return et.getUserDictId()==null;
        case INDEX_USERDICTITEMID:
            return et.getUserDictItemId()==null;
        case INDEX_USERDICTITEMNAME:
            return et.getUserDictItemName()==null;
        case INDEX_USERDICTNAME:
            return et.getUserDictName()==null;
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

        return  UserDictItemBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserDictItemBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            return et.isContentDirty();
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_MARKFLAG:
            return et.isMarkFlagDirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERDICTCATID:
            return et.isUserDictCatIdDirty();
        case INDEX_USERDICTCATNAME:
            return et.isUserDictCatNameDirty();
        case INDEX_USERDICTID:
            return et.isUserDictIdDirty();
        case INDEX_USERDICTITEMID:
            return et.isUserDictItemIdDirty();
        case INDEX_USERDICTITEMNAME:
            return et.isUserDictItemNameDirty();
        case INDEX_USERDICTNAME:
            return et.isUserDictNameDirty();
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
    private static  void fillJSONObject(UserDictItemBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getContent()!=null) {
            json.put("content", getJSONValue(et.getContent()));
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getMarkFlag()!=null) {
            json.put("markflag", getJSONValue(et.getMarkFlag()));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            json.put("memo", getJSONValue(et.getMemo()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserDictCatId()!=null) {
            json.put("userdictcatid", getJSONValue(et.getUserDictCatId()));
        }
        if(bIncEmpty||et.getUserDictCatName()!=null) {
            json.put("userdictcatname", getJSONValue(et.getUserDictCatName()));
        }
        if(bIncEmpty||et.getUserDictId()!=null) {
            json.put("userdictid", getJSONValue(et.getUserDictId()));
        }
        if(bIncEmpty||et.getUserDictItemId()!=null) {
            json.put("userdictitemid", getJSONValue(et.getUserDictItemId()));
        }
        if(bIncEmpty||et.getUserDictItemName()!=null) {
            json.put("userdictitemname", getJSONValue(et.getUserDictItemName()));
        }
        if(bIncEmpty||et.getUserDictName()!=null) {
            json.put("userdictname", getJSONValue(et.getUserDictName()));
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
    private static void fillXmlNode(UserDictItemBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getContent()!=null) {
            Object obj = et.getContent();
            node.setAttribute("CONTENT",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMarkFlag()!=null) {
            Object obj = et.getMarkFlag();
            node.setAttribute("MARKFLAG",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDictCatId()!=null) {
            Object obj = et.getUserDictCatId();
            node.setAttribute("USERDICTCATID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDictCatName()!=null) {
            Object obj = et.getUserDictCatName();
            node.setAttribute("USERDICTCATNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDictId()!=null) {
            Object obj = et.getUserDictId();
            node.setAttribute("USERDICTID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDictItemId()!=null) {
            Object obj = et.getUserDictItemId();
            node.setAttribute("USERDICTITEMID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDictItemName()!=null) {
            Object obj = et.getUserDictItemName();
            node.setAttribute("USERDICTITEMNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserDictName()!=null) {
            Object obj = et.getUserDictName();
            node.setAttribute("USERDICTNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        UserDictItemBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserDictItemBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
        if(et.isContentDirty() && (bIncEmpty||et.getContent()!=null)) {
            Object obj = et.getContent();
            if(obj==null) {
                dst.set(FIELD_CONTENT,null);
            } else {
                dst.set(FIELD_CONTENT,obj);
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
        if(et.isMarkFlagDirty() && (bIncEmpty||et.getMarkFlag()!=null)) {
            Object obj = et.getMarkFlag();
            if(obj==null) {
                dst.set(FIELD_MARKFLAG,null);
            } else {
                dst.set(FIELD_MARKFLAG,obj);
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
        if(et.isUserDictCatIdDirty() && (bIncEmpty||et.getUserDictCatId()!=null)) {
            Object obj = et.getUserDictCatId();
            if(obj==null) {
                dst.set(FIELD_USERDICTCATID,null);
            } else {
                dst.set(FIELD_USERDICTCATID,obj);
            }
        }
        if(et.isUserDictCatNameDirty() && (bIncEmpty||et.getUserDictCatName()!=null)) {
            Object obj = et.getUserDictCatName();
            if(obj==null) {
                dst.set(FIELD_USERDICTCATNAME,null);
            } else {
                dst.set(FIELD_USERDICTCATNAME,obj);
            }
        }
        if(et.isUserDictIdDirty() && (bIncEmpty||et.getUserDictId()!=null)) {
            Object obj = et.getUserDictId();
            if(obj==null) {
                dst.set(FIELD_USERDICTID,null);
            } else {
                dst.set(FIELD_USERDICTID,obj);
            }
        }
        if(et.isUserDictItemIdDirty() && (bIncEmpty||et.getUserDictItemId()!=null)) {
            Object obj = et.getUserDictItemId();
            if(obj==null) {
                dst.set(FIELD_USERDICTITEMID,null);
            } else {
                dst.set(FIELD_USERDICTITEMID,obj);
            }
        }
        if(et.isUserDictItemNameDirty() && (bIncEmpty||et.getUserDictItemName()!=null)) {
            Object obj = et.getUserDictItemName();
            if(obj==null) {
                dst.set(FIELD_USERDICTITEMNAME,null);
            } else {
                dst.set(FIELD_USERDICTITEMNAME,obj);
            }
        }
        if(et.isUserDictNameDirty() && (bIncEmpty||et.getUserDictName()!=null)) {
            Object obj = et.getUserDictName();
            if(obj==null) {
                dst.set(FIELD_USERDICTNAME,null);
            } else {
                dst.set(FIELD_USERDICTNAME,obj);
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
        return  UserDictItemBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserDictItemBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CONTENT:
            et.resetContent();
            return true;
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_MARKFLAG:
            et.resetMarkFlag();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERDICTCATID:
            et.resetUserDictCatId();
            return true;
        case INDEX_USERDICTCATNAME:
            et.resetUserDictCatName();
            return true;
        case INDEX_USERDICTID:
            et.resetUserDictId();
            return true;
        case INDEX_USERDICTITEMID:
            et.resetUserDictItemId();
            return true;
        case INDEX_USERDICTITEMNAME:
            et.resetUserDictItemName();
            return true;
        case INDEX_USERDICTNAME:
            et.resetUserDictName();
            return true;
        default:
            throw new Exception("不明属性标识");
        }
    }




    private Object objUserDictLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.UserDict userdict = null;
    /**
    * 获取父数据 用户词典
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.UserDict getUserDict() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDict();
        }

        if(this.getUserDictId()==null)
            return null;
        synchronized(objUserDictLock) {
            if(userdict==null) {
                userdict = new net.ibizsys.psrt.srv.common.entity.UserDict();
                userdict.setUserDictId(this.getUserDictId());
                net.ibizsys.psrt.srv.common.service.UserDictService service = (net.ibizsys.psrt.srv.common.service.UserDictService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserDictService.class,this.getSessionFactory());
                if(this.getUserDictId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(userdict);
                else
                    service.get(userdict);
            }
            return userdict;
        }
    }

    private Object objUserDictCatLock = new Object();
    private net.ibizsys.psrt.srv.common.entity.UserDictCat userdictcat = null;
    /**
    * 获取父数据 用户词条类别
     * @throws Exception
    */
    public net.ibizsys.psrt.srv.common.entity.UserDictCat getUserDictCat() throws Exception {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserDictCat();
        }

        if(this.getUserDictCatId()==null)
            return null;
        synchronized(objUserDictCatLock) {
            if(userdictcat==null) {
                userdictcat = new net.ibizsys.psrt.srv.common.entity.UserDictCat();
                userdictcat.setUserDictCatId(this.getUserDictCatId());
                net.ibizsys.psrt.srv.common.service.UserDictCatService service = (net.ibizsys.psrt.srv.common.service.UserDictCatService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.UserDictCatService.class,this.getSessionFactory());
                if(this.getUserDictCatId().indexOf(net.ibizsys.paas.service.ServiceBase.TEMPKEY) == 0)
                    service.getTemp(userdictcat);
                else
                    service.get(userdictcat);
            }
            return userdictcat;
        }
    }




    /**
     *  获取代理的数据对象
     */
    private UserDictItemBase getProxyEntity() {
        return this.proxyUserDictItemBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserDictItemBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserDictItemBase) {
            this.proxyUserDictItemBase = (UserDictItemBase)proxyDataObject;
        }

    }

}