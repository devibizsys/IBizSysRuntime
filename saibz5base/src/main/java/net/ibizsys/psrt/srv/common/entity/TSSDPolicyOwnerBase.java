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
 * 实体[TSSDPolicyOwner] 数据对象基类
 */
public abstract class TSSDPolicyOwnerBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[任务时刻策略所有者标识]
     */
    public final static String FIELD_TSSDPOLICYOWNERID = "TSSDPOLICYOWNERID";
    /**
     *   实体属性标识[实际主键]
     */
    public final static String FIELD_TSSDPOLICYOWNERID2 = "TSSDPOLICYOWNERID2";
    /**
     *   实体属性标识[任务时刻策略所有者名称]
     */
    public final static String FIELD_TSSDPOLICYOWNERNAME = "TSSDPOLICYOWNERNAME";
    /**
     *   实体属性标识[所有者类型]
     */
    public final static String FIELD_TSSDPOLICYOWNERTYPE = "TSSDPOLICYOWNERTYPE";
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
    private final static int INDEX_TSSDPOLICYOWNERID = 2;
    private final static int INDEX_TSSDPOLICYOWNERID2 = 3;
    private final static int INDEX_TSSDPOLICYOWNERNAME = 4;
    private final static int INDEX_TSSDPOLICYOWNERTYPE = 5;
    private final static int INDEX_UPDATEDATE = 6;
    private final static int INDEX_UPDATEMAN = 7;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_TSSDPOLICYOWNERID, INDEX_TSSDPOLICYOWNERID);
        fieldIndexMap.put( FIELD_TSSDPOLICYOWNERID2, INDEX_TSSDPOLICYOWNERID2);
        fieldIndexMap.put( FIELD_TSSDPOLICYOWNERNAME, INDEX_TSSDPOLICYOWNERNAME);
        fieldIndexMap.put( FIELD_TSSDPOLICYOWNERTYPE, INDEX_TSSDPOLICYOWNERTYPE);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
    }

    private TSSDPolicyOwnerBase proxyTSSDPolicyOwnerBase = null;

    public TSSDPolicyOwnerBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean tssdpolicyowneridDirtyFlag = false;
    private boolean tssdpolicyownerid2DirtyFlag = false;
    private boolean tssdpolicyownernameDirtyFlag = false;
    private boolean tssdpolicyownertypeDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="tssdpolicyownerid")
    private String tssdpolicyownerid;
    @Column(name="tssdpolicyownerid2")
    private String tssdpolicyownerid2;
    @Column(name="tssdpolicyownername")
    private String tssdpolicyownername;
    @Column(name="tssdpolicyownertype")
    private String tssdpolicyownertype;
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
     *  设置属性值[任务时刻策略所有者标识]
     *  @param tssdpolicyownerid
     */
    public void setTSSDPolicyOwnerId(String tssdpolicyownerid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDPolicyOwnerId(tssdpolicyownerid);
            return;
        }
        if(tssdpolicyownerid!=null) {
            tssdpolicyownerid = StringHelper.trimRight(tssdpolicyownerid);
            if(tssdpolicyownerid.length()==0) {
                tssdpolicyownerid = null;
            }
        }
        this.tssdpolicyownerid =  tssdpolicyownerid;
        this.tssdpolicyowneridDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务时刻策略所有者标识]
     */
    public String getTSSDPolicyOwnerId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDPolicyOwnerId();
        }
        return this.tssdpolicyownerid;
    }

    /**
     *  获取属性值[任务时刻策略所有者标识]是否修改
     */
    public boolean isTSSDPolicyOwnerIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDPolicyOwnerIdDirty();
        }
        return this.tssdpolicyowneridDirtyFlag;
    }

    /**
     *  重置属性值[任务时刻策略所有者标识]
     */
    public void resetTSSDPolicyOwnerId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDPolicyOwnerId();
            return;
        }

        this.tssdpolicyowneridDirtyFlag = false;
        this.tssdpolicyownerid = null;
    }
    /**
     *  设置属性值[实际主键]
     *  @param tssdpolicyownerid2
     */
    public void setTSSDPolicyOwnerId2(String tssdpolicyownerid2) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDPolicyOwnerId2(tssdpolicyownerid2);
            return;
        }
        if(tssdpolicyownerid2!=null) {
            tssdpolicyownerid2 = StringHelper.trimRight(tssdpolicyownerid2);
            if(tssdpolicyownerid2.length()==0) {
                tssdpolicyownerid2 = null;
            }
        }
        this.tssdpolicyownerid2 =  tssdpolicyownerid2;
        this.tssdpolicyownerid2DirtyFlag  = true;
    }

    /**
     *  获取属性值[实际主键]
     */
    public String getTSSDPolicyOwnerId2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDPolicyOwnerId2();
        }
        return this.tssdpolicyownerid2;
    }

    /**
     *  获取属性值[实际主键]是否修改
     */
    public boolean isTSSDPolicyOwnerId2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDPolicyOwnerId2Dirty();
        }
        return this.tssdpolicyownerid2DirtyFlag;
    }

    /**
     *  重置属性值[实际主键]
     */
    public void resetTSSDPolicyOwnerId2() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDPolicyOwnerId2();
            return;
        }

        this.tssdpolicyownerid2DirtyFlag = false;
        this.tssdpolicyownerid2 = null;
    }
    /**
     *  设置属性值[任务时刻策略所有者名称]
     *  @param tssdpolicyownername
     */
    public void setTSSDPolicyOwnerName(String tssdpolicyownername) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDPolicyOwnerName(tssdpolicyownername);
            return;
        }
        if(tssdpolicyownername!=null) {
            tssdpolicyownername = StringHelper.trimRight(tssdpolicyownername);
            if(tssdpolicyownername.length()==0) {
                tssdpolicyownername = null;
            }
        }
        this.tssdpolicyownername =  tssdpolicyownername;
        this.tssdpolicyownernameDirtyFlag  = true;
    }

    /**
     *  获取属性值[任务时刻策略所有者名称]
     */
    public String getTSSDPolicyOwnerName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDPolicyOwnerName();
        }
        return this.tssdpolicyownername;
    }

    /**
     *  获取属性值[任务时刻策略所有者名称]是否修改
     */
    public boolean isTSSDPolicyOwnerNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDPolicyOwnerNameDirty();
        }
        return this.tssdpolicyownernameDirtyFlag;
    }

    /**
     *  重置属性值[任务时刻策略所有者名称]
     */
    public void resetTSSDPolicyOwnerName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDPolicyOwnerName();
            return;
        }

        this.tssdpolicyownernameDirtyFlag = false;
        this.tssdpolicyownername = null;
    }
    /**
     *  设置属性值[所有者类型]
     *  @param tssdpolicyownertype
     */
    public void setTSSDPolicyOwnerType(String tssdpolicyownertype) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setTSSDPolicyOwnerType(tssdpolicyownertype);
            return;
        }
        if(tssdpolicyownertype!=null) {
            tssdpolicyownertype = StringHelper.trimRight(tssdpolicyownertype);
            if(tssdpolicyownertype.length()==0) {
                tssdpolicyownertype = null;
            }
        }
        this.tssdpolicyownertype =  tssdpolicyownertype;
        this.tssdpolicyownertypeDirtyFlag  = true;
    }

    /**
     *  获取属性值[所有者类型]
     */
    public String getTSSDPolicyOwnerType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getTSSDPolicyOwnerType();
        }
        return this.tssdpolicyownertype;
    }

    /**
     *  获取属性值[所有者类型]是否修改
     */
    public boolean isTSSDPolicyOwnerTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isTSSDPolicyOwnerTypeDirty();
        }
        return this.tssdpolicyownertypeDirtyFlag;
    }

    /**
     *  重置属性值[所有者类型]
     */
    public void resetTSSDPolicyOwnerType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetTSSDPolicyOwnerType();
            return;
        }

        this.tssdpolicyownertypeDirtyFlag = false;
        this.tssdpolicyownertype = null;
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
        TSSDPolicyOwnerBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(TSSDPolicyOwnerBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetTSSDPolicyOwnerId();
        et.resetTSSDPolicyOwnerId2();
        et.resetTSSDPolicyOwnerName();
        et.resetTSSDPolicyOwnerType();
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
        if(!bDirtyOnly || isTSSDPolicyOwnerIdDirty()) {
            params.put(FIELD_TSSDPOLICYOWNERID,getTSSDPolicyOwnerId());
        }
        if(!bDirtyOnly || isTSSDPolicyOwnerId2Dirty()) {
            params.put(FIELD_TSSDPOLICYOWNERID2,getTSSDPolicyOwnerId2());
        }
        if(!bDirtyOnly || isTSSDPolicyOwnerNameDirty()) {
            params.put(FIELD_TSSDPOLICYOWNERNAME,getTSSDPolicyOwnerName());
        }
        if(!bDirtyOnly || isTSSDPolicyOwnerTypeDirty()) {
            params.put(FIELD_TSSDPOLICYOWNERTYPE,getTSSDPolicyOwnerType());
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

        return  TSSDPolicyOwnerBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(TSSDPolicyOwnerBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_TSSDPOLICYOWNERID:
            return et.getTSSDPolicyOwnerId();
        case INDEX_TSSDPOLICYOWNERID2:
            return et.getTSSDPolicyOwnerId2();
        case INDEX_TSSDPOLICYOWNERNAME:
            return et.getTSSDPolicyOwnerName();
        case INDEX_TSSDPOLICYOWNERTYPE:
            return et.getTSSDPolicyOwnerType();
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

        TSSDPolicyOwnerBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(TSSDPolicyOwnerBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDPOLICYOWNERID:
            et.setTSSDPolicyOwnerId(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDPOLICYOWNERID2:
            et.setTSSDPolicyOwnerId2(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDPOLICYOWNERNAME:
            et.setTSSDPolicyOwnerName(DataObject.getStringValue(obj));
            return ;
        case INDEX_TSSDPOLICYOWNERTYPE:
            et.setTSSDPolicyOwnerType(DataObject.getStringValue(obj));
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

        return  TSSDPolicyOwnerBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(TSSDPolicyOwnerBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_TSSDPOLICYOWNERID:
            return et.getTSSDPolicyOwnerId()==null;
        case INDEX_TSSDPOLICYOWNERID2:
            return et.getTSSDPolicyOwnerId2()==null;
        case INDEX_TSSDPOLICYOWNERNAME:
            return et.getTSSDPolicyOwnerName()==null;
        case INDEX_TSSDPOLICYOWNERTYPE:
            return et.getTSSDPolicyOwnerType()==null;
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

        return  TSSDPolicyOwnerBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(TSSDPolicyOwnerBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_TSSDPOLICYOWNERID:
            return et.isTSSDPolicyOwnerIdDirty();
        case INDEX_TSSDPOLICYOWNERID2:
            return et.isTSSDPolicyOwnerId2Dirty();
        case INDEX_TSSDPOLICYOWNERNAME:
            return et.isTSSDPolicyOwnerNameDirty();
        case INDEX_TSSDPOLICYOWNERTYPE:
            return et.isTSSDPolicyOwnerTypeDirty();
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
    private static  void fillJSONObject(TSSDPolicyOwnerBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerId()!=null) {
            json.put("tssdpolicyownerid", getJSONValue(et.getTSSDPolicyOwnerId()));
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerId2()!=null) {
            json.put("tssdpolicyownerid2", getJSONValue(et.getTSSDPolicyOwnerId2()));
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerName()!=null) {
            json.put("tssdpolicyownername", getJSONValue(et.getTSSDPolicyOwnerName()));
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerType()!=null) {
            json.put("tssdpolicyownertype", getJSONValue(et.getTSSDPolicyOwnerType()));
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
    private static void fillXmlNode(TSSDPolicyOwnerBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerId()!=null) {
            Object obj = et.getTSSDPolicyOwnerId();
            node.setAttribute("TSSDPOLICYOWNERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerId2()!=null) {
            Object obj = et.getTSSDPolicyOwnerId2();
            node.setAttribute("TSSDPOLICYOWNERID2",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerName()!=null) {
            Object obj = et.getTSSDPolicyOwnerName();
            node.setAttribute("TSSDPOLICYOWNERNAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getTSSDPolicyOwnerType()!=null) {
            Object obj = et.getTSSDPolicyOwnerType();
            node.setAttribute("TSSDPOLICYOWNERTYPE",(obj==null)?"":(String)obj);
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
        TSSDPolicyOwnerBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(TSSDPolicyOwnerBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isTSSDPolicyOwnerIdDirty() && (bIncEmpty||et.getTSSDPolicyOwnerId()!=null)) {
            Object obj = et.getTSSDPolicyOwnerId();
            if(obj==null) {
                dst.set(FIELD_TSSDPOLICYOWNERID,null);
            } else {
                dst.set(FIELD_TSSDPOLICYOWNERID,obj);
            }
        }
        if(et.isTSSDPolicyOwnerId2Dirty() && (bIncEmpty||et.getTSSDPolicyOwnerId2()!=null)) {
            Object obj = et.getTSSDPolicyOwnerId2();
            if(obj==null) {
                dst.set(FIELD_TSSDPOLICYOWNERID2,null);
            } else {
                dst.set(FIELD_TSSDPOLICYOWNERID2,obj);
            }
        }
        if(et.isTSSDPolicyOwnerNameDirty() && (bIncEmpty||et.getTSSDPolicyOwnerName()!=null)) {
            Object obj = et.getTSSDPolicyOwnerName();
            if(obj==null) {
                dst.set(FIELD_TSSDPOLICYOWNERNAME,null);
            } else {
                dst.set(FIELD_TSSDPOLICYOWNERNAME,obj);
            }
        }
        if(et.isTSSDPolicyOwnerTypeDirty() && (bIncEmpty||et.getTSSDPolicyOwnerType()!=null)) {
            Object obj = et.getTSSDPolicyOwnerType();
            if(obj==null) {
                dst.set(FIELD_TSSDPOLICYOWNERTYPE,null);
            } else {
                dst.set(FIELD_TSSDPOLICYOWNERTYPE,obj);
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
        return  TSSDPolicyOwnerBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(TSSDPolicyOwnerBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_TSSDPOLICYOWNERID:
            et.resetTSSDPolicyOwnerId();
            return true;
        case INDEX_TSSDPOLICYOWNERID2:
            et.resetTSSDPolicyOwnerId2();
            return true;
        case INDEX_TSSDPOLICYOWNERNAME:
            et.resetTSSDPolicyOwnerName();
            return true;
        case INDEX_TSSDPOLICYOWNERTYPE:
            et.resetTSSDPolicyOwnerType();
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
    private TSSDPolicyOwnerBase getProxyEntity() {
        return this.proxyTSSDPolicyOwnerBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyTSSDPolicyOwnerBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof TSSDPolicyOwnerBase) {
            this.proxyTSSDPolicyOwnerBase = (TSSDPolicyOwnerBase)proxyDataObject;
        }

    }

}