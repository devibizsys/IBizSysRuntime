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
 * 实体[UserRoleDEField] 数据对象基类
 */
public abstract class UserRoleDEFieldBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[访问行为]
     */
    public final static String FIELD_DEFACTION = "DEFACTION";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DEID = "DEID";
    /**
     *   实体属性标识[数据实体]
     */
    public final static String FIELD_DENAME = "DENAME";
    /**
     *   实体属性标识[相关属性]
     */
    public final static String FIELD_RELATEDDEFIELD = "RELATEDDEFIELD";
    /**
     *   实体属性标识[框架发布]
     */
    public final static String FIELD_SRFSYSPUB = "SRFSYSPUB";
    /**
     *   实体属性标识[应用发布]
     */
    public final static String FIELD_SRFUSERPUB = "SRFUSERPUB";
    /**
     *   实体属性标识[更新时间]
     */
    public final static String FIELD_UPDATEDATE = "UPDATEDATE";
    /**
     *   实体属性标识[更新人]
     */
    public final static String FIELD_UPDATEMAN = "UPDATEMAN";
    /**
     *   实体属性标识[实体属性访问能力标识]
     */
    public final static String FIELD_USERROLEDEFIELDID = "USERROLEDEFIELDID";
    /**
     *   实体属性标识[实体属性访问能力]
     */
    public final static String FIELD_USERROLEDEFIELDNAME = "USERROLEDEFIELDNAME";

    private final static int INDEX_CREATEDATE = 0;
    private final static int INDEX_CREATEMAN = 1;
    private final static int INDEX_DEFACTION = 2;
    private final static int INDEX_DEID = 3;
    private final static int INDEX_DENAME = 4;
    private final static int INDEX_RELATEDDEFIELD = 5;
    private final static int INDEX_SRFSYSPUB = 6;
    private final static int INDEX_SRFUSERPUB = 7;
    private final static int INDEX_UPDATEDATE = 8;
    private final static int INDEX_UPDATEMAN = 9;
    private final static int INDEX_USERROLEDEFIELDID = 10;
    private final static int INDEX_USERROLEDEFIELDNAME = 11;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DEFACTION, INDEX_DEFACTION);
        fieldIndexMap.put( FIELD_DEID, INDEX_DEID);
        fieldIndexMap.put( FIELD_DENAME, INDEX_DENAME);
        fieldIndexMap.put( FIELD_RELATEDDEFIELD, INDEX_RELATEDDEFIELD);
        fieldIndexMap.put( FIELD_SRFSYSPUB, INDEX_SRFSYSPUB);
        fieldIndexMap.put( FIELD_SRFUSERPUB, INDEX_SRFUSERPUB);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
        fieldIndexMap.put( FIELD_USERROLEDEFIELDID, INDEX_USERROLEDEFIELDID);
        fieldIndexMap.put( FIELD_USERROLEDEFIELDNAME, INDEX_USERROLEDEFIELDNAME);
    }

    private UserRoleDEFieldBase proxyUserRoleDEFieldBase = null;

    public UserRoleDEFieldBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean defactionDirtyFlag = false;
    private boolean deidDirtyFlag = false;
    private boolean denameDirtyFlag = false;
    private boolean relateddefieldDirtyFlag = false;
    private boolean srfsyspubDirtyFlag = false;
    private boolean srfuserpubDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;
    private boolean userroledefieldidDirtyFlag = false;
    private boolean userroledefieldnameDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="defaction")
    private String defaction;
    @Column(name="deid")
    private String deid;
    @Column(name="dename")
    private String dename;
    @Column(name="relateddefield")
    private String relateddefield;
    @Column(name="srfsyspub")
    private Integer srfsyspub;
    @Column(name="srfuserpub")
    private Integer srfuserpub;
    @Column(name="updatedate")
    private Timestamp updatedate;
    @Column(name="updateman")
    private String updateman;
    @Column(name="userroledefieldid")
    private String userroledefieldid;
    @Column(name="userroledefieldname")
    private String userroledefieldname;


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
     *  设置属性值[访问行为]代码表：net.ibizsys.psrt.srv.codelist.DEFieldAccModeCodeListModel
     *  @param defaction
     */
    public void setDEFAction(String defaction) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDEFAction(defaction);
            return;
        }
        if(defaction!=null) {
            defaction = StringHelper.trimRight(defaction);
            if(defaction.length()==0) {
                defaction = null;
            }
        }
        this.defaction =  defaction;
        this.defactionDirtyFlag  = true;
    }

    /**
     *  获取属性值[访问行为]代码表：net.ibizsys.psrt.srv.codelist.DEFieldAccModeCodeListModel
     */
    public String getDEFAction() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDEFAction();
        }
        return this.defaction;
    }

    /**
     *  获取属性值[访问行为]是否修改
     */
    public boolean isDEFActionDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDEFActionDirty();
        }
        return this.defactionDirtyFlag;
    }

    /**
     *  重置属性值[访问行为]
     */
    public void resetDEFAction() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDEFAction();
            return;
        }

        this.defactionDirtyFlag = false;
        this.defaction = null;
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
     *  设置属性值[相关属性]
     *  @param relateddefield
     */
    public void setRelatedDEField(String relateddefield) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setRelatedDEField(relateddefield);
            return;
        }
        if(relateddefield!=null) {
            relateddefield = StringHelper.trimRight(relateddefield);
            if(relateddefield.length()==0) {
                relateddefield = null;
            }
        }
        this.relateddefield =  relateddefield;
        this.relateddefieldDirtyFlag  = true;
    }

    /**
     *  获取属性值[相关属性]
     */
    public String getRelatedDEField() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getRelatedDEField();
        }
        return this.relateddefield;
    }

    /**
     *  获取属性值[相关属性]是否修改
     */
    public boolean isRelatedDEFieldDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isRelatedDEFieldDirty();
        }
        return this.relateddefieldDirtyFlag;
    }

    /**
     *  重置属性值[相关属性]
     */
    public void resetRelatedDEField() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetRelatedDEField();
            return;
        }

        this.relateddefieldDirtyFlag = false;
        this.relateddefield = null;
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
     *  设置属性值[实体属性访问能力标识]
     *  @param userroledefieldid
     */
    public void setUserRoleDEFieldId(String userroledefieldid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDEFieldId(userroledefieldid);
            return;
        }
        if(userroledefieldid!=null) {
            userroledefieldid = StringHelper.trimRight(userroledefieldid);
            if(userroledefieldid.length()==0) {
                userroledefieldid = null;
            }
        }
        this.userroledefieldid =  userroledefieldid;
        this.userroledefieldidDirtyFlag  = true;
    }

    /**
     *  获取属性值[实体属性访问能力标识]
     */
    public String getUserRoleDEFieldId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDEFieldId();
        }
        return this.userroledefieldid;
    }

    /**
     *  获取属性值[实体属性访问能力标识]是否修改
     */
    public boolean isUserRoleDEFieldIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDEFieldIdDirty();
        }
        return this.userroledefieldidDirtyFlag;
    }

    /**
     *  重置属性值[实体属性访问能力标识]
     */
    public void resetUserRoleDEFieldId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDEFieldId();
            return;
        }

        this.userroledefieldidDirtyFlag = false;
        this.userroledefieldid = null;
    }
    /**
     *  设置属性值[实体属性访问能力]
     *  @param userroledefieldname
     */
    public void setUserRoleDEFieldName(String userroledefieldname) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setUserRoleDEFieldName(userroledefieldname);
            return;
        }
        if(userroledefieldname!=null) {
            userroledefieldname = StringHelper.trimRight(userroledefieldname);
            if(userroledefieldname.length()==0) {
                userroledefieldname = null;
            }
        }
        this.userroledefieldname =  userroledefieldname;
        this.userroledefieldnameDirtyFlag  = true;
    }

    /**
     *  获取属性值[实体属性访问能力]
     */
    public String getUserRoleDEFieldName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getUserRoleDEFieldName();
        }
        return this.userroledefieldname;
    }

    /**
     *  获取属性值[实体属性访问能力]是否修改
     */
    public boolean isUserRoleDEFieldNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isUserRoleDEFieldNameDirty();
        }
        return this.userroledefieldnameDirtyFlag;
    }

    /**
     *  重置属性值[实体属性访问能力]
     */
    public void resetUserRoleDEFieldName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetUserRoleDEFieldName();
            return;
        }

        this.userroledefieldnameDirtyFlag = false;
        this.userroledefieldname = null;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onReset()
     */
    @Override
    protected void onReset() {
        UserRoleDEFieldBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(UserRoleDEFieldBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDEFAction();
        et.resetDEId();
        et.resetDEName();
        et.resetRelatedDEField();
        et.resetSRFSysPub();
        et.resetSRFUserPub();
        et.resetUpdateDate();
        et.resetUpdateMan();
        et.resetUserRoleDEFieldId();
        et.resetUserRoleDEFieldName();
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
        if(!bDirtyOnly || isDEFActionDirty()) {
            params.put(FIELD_DEFACTION,getDEFAction());
        }
        if(!bDirtyOnly || isDEIdDirty()) {
            params.put(FIELD_DEID,getDEId());
        }
        if(!bDirtyOnly || isDENameDirty()) {
            params.put(FIELD_DENAME,getDEName());
        }
        if(!bDirtyOnly || isRelatedDEFieldDirty()) {
            params.put(FIELD_RELATEDDEFIELD,getRelatedDEField());
        }
        if(!bDirtyOnly || isSRFSysPubDirty()) {
            params.put(FIELD_SRFSYSPUB,getSRFSysPub());
        }
        if(!bDirtyOnly || isSRFUserPubDirty()) {
            params.put(FIELD_SRFUSERPUB,getSRFUserPub());
        }
        if(!bDirtyOnly || isUpdateDateDirty()) {
            params.put(FIELD_UPDATEDATE,getUpdateDate());
        }
        if(!bDirtyOnly || isUpdateManDirty()) {
            params.put(FIELD_UPDATEMAN,getUpdateMan());
        }
        if(!bDirtyOnly || isUserRoleDEFieldIdDirty()) {
            params.put(FIELD_USERROLEDEFIELDID,getUserRoleDEFieldId());
        }
        if(!bDirtyOnly || isUserRoleDEFieldNameDirty()) {
            params.put(FIELD_USERROLEDEFIELDNAME,getUserRoleDEFieldName());
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

        return  UserRoleDEFieldBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(UserRoleDEFieldBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DEFACTION:
            return et.getDEFAction();
        case INDEX_DEID:
            return et.getDEId();
        case INDEX_DENAME:
            return et.getDEName();
        case INDEX_RELATEDDEFIELD:
            return et.getRelatedDEField();
        case INDEX_SRFSYSPUB:
            return et.getSRFSysPub();
        case INDEX_SRFUSERPUB:
            return et.getSRFUserPub();
        case INDEX_UPDATEDATE:
            return et.getUpdateDate();
        case INDEX_UPDATEMAN:
            return et.getUpdateMan();
        case INDEX_USERROLEDEFIELDID:
            return et.getUserRoleDEFieldId();
        case INDEX_USERROLEDEFIELDNAME:
            return et.getUserRoleDEFieldName();
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

        UserRoleDEFieldBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(UserRoleDEFieldBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEFACTION:
            et.setDEFAction(DataObject.getStringValue(obj));
            return ;
        case INDEX_DEID:
            et.setDEId(DataObject.getStringValue(obj));
            return ;
        case INDEX_DENAME:
            et.setDEName(DataObject.getStringValue(obj));
            return ;
        case INDEX_RELATEDDEFIELD:
            et.setRelatedDEField(DataObject.getStringValue(obj));
            return ;
        case INDEX_SRFSYSPUB:
            et.setSRFSysPub(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_SRFUSERPUB:
            et.setSRFUserPub(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_UPDATEDATE:
            et.setUpdateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_UPDATEMAN:
            et.setUpdateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDEFIELDID:
            et.setUserRoleDEFieldId(DataObject.getStringValue(obj));
            return ;
        case INDEX_USERROLEDEFIELDNAME:
            et.setUserRoleDEFieldName(DataObject.getStringValue(obj));
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

        return  UserRoleDEFieldBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(UserRoleDEFieldBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DEFACTION:
            return et.getDEFAction()==null;
        case INDEX_DEID:
            return et.getDEId()==null;
        case INDEX_DENAME:
            return et.getDEName()==null;
        case INDEX_RELATEDDEFIELD:
            return et.getRelatedDEField()==null;
        case INDEX_SRFSYSPUB:
            return et.getSRFSysPub()==null;
        case INDEX_SRFUSERPUB:
            return et.getSRFUserPub()==null;
        case INDEX_UPDATEDATE:
            return et.getUpdateDate()==null;
        case INDEX_UPDATEMAN:
            return et.getUpdateMan()==null;
        case INDEX_USERROLEDEFIELDID:
            return et.getUserRoleDEFieldId()==null;
        case INDEX_USERROLEDEFIELDNAME:
            return et.getUserRoleDEFieldName()==null;
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

        return  UserRoleDEFieldBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(UserRoleDEFieldBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DEFACTION:
            return et.isDEFActionDirty();
        case INDEX_DEID:
            return et.isDEIdDirty();
        case INDEX_DENAME:
            return et.isDENameDirty();
        case INDEX_RELATEDDEFIELD:
            return et.isRelatedDEFieldDirty();
        case INDEX_SRFSYSPUB:
            return et.isSRFSysPubDirty();
        case INDEX_SRFUSERPUB:
            return et.isSRFUserPubDirty();
        case INDEX_UPDATEDATE:
            return et.isUpdateDateDirty();
        case INDEX_UPDATEMAN:
            return et.isUpdateManDirty();
        case INDEX_USERROLEDEFIELDID:
            return et.isUserRoleDEFieldIdDirty();
        case INDEX_USERROLEDEFIELDNAME:
            return et.isUserRoleDEFieldNameDirty();
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
    private static  void fillJSONObject(UserRoleDEFieldBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getDEFAction()!=null) {
            json.put("defaction", getJSONValue(et.getDEFAction()));
        }
        if(bIncEmpty||et.getDEId()!=null) {
            json.put("deid", getJSONValue(et.getDEId()));
        }
        if(bIncEmpty||et.getDEName()!=null) {
            json.put("dename", getJSONValue(et.getDEName()));
        }
        if(bIncEmpty||et.getRelatedDEField()!=null) {
            json.put("relateddefield", getJSONValue(et.getRelatedDEField()));
        }
        if(bIncEmpty||et.getSRFSysPub()!=null) {
            json.put("srfsyspub", getJSONValue(et.getSRFSysPub()));
        }
        if(bIncEmpty||et.getSRFUserPub()!=null) {
            json.put("srfuserpub", getJSONValue(et.getSRFUserPub()));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            json.put("updatedate", getJSONValue(et.getUpdateDate()));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            json.put("updateman", getJSONValue(et.getUpdateMan()));
        }
        if(bIncEmpty||et.getUserRoleDEFieldId()!=null) {
            json.put("userroledefieldid", getJSONValue(et.getUserRoleDEFieldId()));
        }
        if(bIncEmpty||et.getUserRoleDEFieldName()!=null) {
            json.put("userroledefieldname", getJSONValue(et.getUserRoleDEFieldName()));
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
    private static void fillXmlNode(UserRoleDEFieldBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEFAction()!=null) {
            Object obj = et.getDEFAction();
            node.setAttribute("DEFACTION",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEId()!=null) {
            Object obj = et.getDEId();
            node.setAttribute("DEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDEName()!=null) {
            Object obj = et.getDEName();
            node.setAttribute("DENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getRelatedDEField()!=null) {
            Object obj = et.getRelatedDEField();
            node.setAttribute("RELATEDDEFIELD",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getSRFSysPub()!=null) {
            Object obj = et.getSRFSysPub();
            node.setAttribute("SRFSYSPUB",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getSRFUserPub()!=null) {
            Object obj = et.getSRFUserPub();
            node.setAttribute("SRFUSERPUB",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getUpdateDate()!=null) {
            Object obj = et.getUpdateDate();
            node.setAttribute("UPDATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getUpdateMan()!=null) {
            Object obj = et.getUpdateMan();
            node.setAttribute("UPDATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDEFieldId()!=null) {
            Object obj = et.getUserRoleDEFieldId();
            node.setAttribute("USERROLEDEFIELDID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getUserRoleDEFieldName()!=null) {
            Object obj = et.getUserRoleDEFieldName();
            node.setAttribute("USERROLEDEFIELDNAME",(obj==null)?"":(String)obj);
        }


    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.entity.EntityBase#onCopyTo(net.ibizsys.paas.data.IDataObject, boolean)
     */
    @Override
    protected void onCopyTo(IDataObject dataEntity, boolean bIncludeEmtpy) throws Exception {
        UserRoleDEFieldBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(UserRoleDEFieldBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isDEFActionDirty() && (bIncEmpty||et.getDEFAction()!=null)) {
            Object obj = et.getDEFAction();
            if(obj==null) {
                dst.set(FIELD_DEFACTION,null);
            } else {
                dst.set(FIELD_DEFACTION,obj);
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
        if(et.isRelatedDEFieldDirty() && (bIncEmpty||et.getRelatedDEField()!=null)) {
            Object obj = et.getRelatedDEField();
            if(obj==null) {
                dst.set(FIELD_RELATEDDEFIELD,null);
            } else {
                dst.set(FIELD_RELATEDDEFIELD,obj);
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
        if(et.isUserRoleDEFieldIdDirty() && (bIncEmpty||et.getUserRoleDEFieldId()!=null)) {
            Object obj = et.getUserRoleDEFieldId();
            if(obj==null) {
                dst.set(FIELD_USERROLEDEFIELDID,null);
            } else {
                dst.set(FIELD_USERROLEDEFIELDID,obj);
            }
        }
        if(et.isUserRoleDEFieldNameDirty() && (bIncEmpty||et.getUserRoleDEFieldName()!=null)) {
            Object obj = et.getUserRoleDEFieldName();
            if(obj==null) {
                dst.set(FIELD_USERROLEDEFIELDNAME,null);
            } else {
                dst.set(FIELD_USERROLEDEFIELDNAME,obj);
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
        return  UserRoleDEFieldBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(UserRoleDEFieldBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DEFACTION:
            et.resetDEFAction();
            return true;
        case INDEX_DEID:
            et.resetDEId();
            return true;
        case INDEX_DENAME:
            et.resetDEName();
            return true;
        case INDEX_RELATEDDEFIELD:
            et.resetRelatedDEField();
            return true;
        case INDEX_SRFSYSPUB:
            et.resetSRFSysPub();
            return true;
        case INDEX_SRFUSERPUB:
            et.resetSRFUserPub();
            return true;
        case INDEX_UPDATEDATE:
            et.resetUpdateDate();
            return true;
        case INDEX_UPDATEMAN:
            et.resetUpdateMan();
            return true;
        case INDEX_USERROLEDEFIELDID:
            et.resetUserRoleDEFieldId();
            return true;
        case INDEX_USERROLEDEFIELDNAME:
            et.resetUserRoleDEFieldName();
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
    private UserRoleDEFieldBase getProxyEntity() {
        return this.proxyUserRoleDEFieldBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyUserRoleDEFieldBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof UserRoleDEFieldBase) {
            this.proxyUserRoleDEFieldBase = (UserRoleDEFieldBase)proxyDataObject;
        }

    }

}