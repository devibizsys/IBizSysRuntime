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
 * 实体[File] 数据对象基类
 */
public abstract class FileBase extends net.ibizsys.paas.entity.EntityBase implements Serializable {

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
     *   实体属性标识[摘要数据]
     */
    public final static String FIELD_DIGESTCODE = "DIGESTCODE";
    /**
     *   实体属性标识[逻辑有效标志]
     */
    public final static String FIELD_ENABLE = "ENABLE";
    /**
     *   实体属性标识[原始文件名称]
     */
    public final static String FIELD_FILENAME2 = "FILENAME2";
    /**
     *   实体属性标识[文件大小]
     */
    public final static String FIELD_FILESIZE = "FILESIZE";
    /**
     *   实体属性标识[文件标识]
     */
    public final static String FIELD_FILEID = "FILE_ID";
    /**
     *   实体属性标识[文件名称]
     */
    public final static String FIELD_FILENAME = "FILE_NAME";
    /**
     *   实体属性标识[指定目录]
     */
    public final static String FIELD_FOLDER = "FOLDER";
    /**
     *   实体属性标识[存储路径]
     */
    public final static String FIELD_LOCALPATH = "LOCALPATH";
    /**
     *   实体属性标识[存储路径2]
     */
    public final static String FIELD_LOCALPATH2 = "LOCALPATH2";
    /**
     *   实体属性标识[备注]
     */
    public final static String FIELD_MEMO = "MEMO";
    /**
     *   实体属性标识[所有者标识]
     */
    public final static String FIELD_OWNERID = "OWNERID";
    /**
     *   实体属性标识[所有者类型]
     */
    public final static String FIELD_OWNERTYPE = "OWNERTYPE";
    /**
     *   实体属性标识[图片高度]
     */
    public final static String FIELD_PICHEIGHT = "PICHEIGHT";
    /**
     *   实体属性标识[图片宽度]
     */
    public final static String FIELD_PICWIDTH = "PICWIDTH";
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
    private final static int INDEX_DIGESTCODE = 2;
    private final static int INDEX_ENABLE = 3;
    private final static int INDEX_FILENAME2 = 4;
    private final static int INDEX_FILESIZE = 5;
    private final static int INDEX_FILEID = 6;
    private final static int INDEX_FILENAME = 7;
    private final static int INDEX_FOLDER = 8;
    private final static int INDEX_LOCALPATH = 9;
    private final static int INDEX_LOCALPATH2 = 10;
    private final static int INDEX_MEMO = 11;
    private final static int INDEX_OWNERID = 12;
    private final static int INDEX_OWNERTYPE = 13;
    private final static int INDEX_PICHEIGHT = 14;
    private final static int INDEX_PICWIDTH = 15;
    private final static int INDEX_UPDATEDATE = 16;
    private final static int INDEX_UPDATEMAN = 17;

    private final static HashMap<String, Integer> fieldIndexMap = new HashMap<String, Integer>();
    static {
        fieldIndexMap.put( FIELD_CREATEDATE, INDEX_CREATEDATE);
        fieldIndexMap.put( FIELD_CREATEMAN, INDEX_CREATEMAN);
        fieldIndexMap.put( FIELD_DIGESTCODE, INDEX_DIGESTCODE);
        fieldIndexMap.put( FIELD_ENABLE, INDEX_ENABLE);
        fieldIndexMap.put( FIELD_FILENAME2, INDEX_FILENAME2);
        fieldIndexMap.put( FIELD_FILESIZE, INDEX_FILESIZE);
        fieldIndexMap.put( FIELD_FILEID, INDEX_FILEID);
        fieldIndexMap.put( FIELD_FILENAME, INDEX_FILENAME);
        fieldIndexMap.put( FIELD_FOLDER, INDEX_FOLDER);
        fieldIndexMap.put( FIELD_LOCALPATH, INDEX_LOCALPATH);
        fieldIndexMap.put( FIELD_LOCALPATH2, INDEX_LOCALPATH2);
        fieldIndexMap.put( FIELD_MEMO, INDEX_MEMO);
        fieldIndexMap.put( FIELD_OWNERID, INDEX_OWNERID);
        fieldIndexMap.put( FIELD_OWNERTYPE, INDEX_OWNERTYPE);
        fieldIndexMap.put( FIELD_PICHEIGHT, INDEX_PICHEIGHT);
        fieldIndexMap.put( FIELD_PICWIDTH, INDEX_PICWIDTH);
        fieldIndexMap.put( FIELD_UPDATEDATE, INDEX_UPDATEDATE);
        fieldIndexMap.put( FIELD_UPDATEMAN, INDEX_UPDATEMAN);
    }

    private FileBase proxyFileBase = null;

    public FileBase() {
        super();
    }
    private boolean createdateDirtyFlag = false;
    private boolean createmanDirtyFlag = false;
    private boolean digestcodeDirtyFlag = false;
    private boolean enableDirtyFlag = false;
    private boolean filename2DirtyFlag = false;
    private boolean filesizeDirtyFlag = false;
    private boolean fileidDirtyFlag = false;
    private boolean filenameDirtyFlag = false;
    private boolean folderDirtyFlag = false;
    private boolean localpathDirtyFlag = false;
    private boolean localpath2DirtyFlag = false;
    private boolean memoDirtyFlag = false;
    private boolean owneridDirtyFlag = false;
    private boolean ownertypeDirtyFlag = false;
    private boolean picheightDirtyFlag = false;
    private boolean picwidthDirtyFlag = false;
    private boolean updatedateDirtyFlag = false;
    private boolean updatemanDirtyFlag = false;

    @Column(name="createdate")
    private Timestamp createdate;
    @Column(name="createman")
    private String createman;
    @Column(name="digestcode")
    private String digestcode;
    @Column(name="enable")
    private Integer enable;
    @Column(name="filename2")
    private String filename2;
    @Column(name="filesize")
    private Integer filesize;
    @Column(name="fileid")
    private String fileid;
    @Column(name="filename")
    private String filename;
    @Column(name="folder")
    private String folder;
    @Column(name="localpath")
    private String localpath;
    @Column(name="localpath2")
    private String localpath2;
    @Column(name="memo")
    private String memo;
    @Column(name="ownerid")
    private String ownerid;
    @Column(name="ownertype")
    private String ownertype;
    @Column(name="picheight")
    private Integer picheight;
    @Column(name="picwidth")
    private Integer picwidth;
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
     *  设置属性值[摘要数据]
     *  @param digestcode
     */
    public void setDigestCode(String digestcode) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setDigestCode(digestcode);
            return;
        }
        if(digestcode!=null) {
            digestcode = StringHelper.trimRight(digestcode);
            if(digestcode.length()==0) {
                digestcode = null;
            }
        }
        this.digestcode =  digestcode;
        this.digestcodeDirtyFlag  = true;
    }

    /**
     *  获取属性值[摘要数据]
     */
    public String getDigestCode() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getDigestCode();
        }
        return this.digestcode;
    }

    /**
     *  获取属性值[摘要数据]是否修改
     */
    public boolean isDigestCodeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isDigestCodeDirty();
        }
        return this.digestcodeDirtyFlag;
    }

    /**
     *  重置属性值[摘要数据]
     */
    public void resetDigestCode() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetDigestCode();
            return;
        }

        this.digestcodeDirtyFlag = false;
        this.digestcode = null;
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
     *  设置属性值[原始文件名称]
     *  @param filename2
     */
    public void setFileName2(String filename2) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileName2(filename2);
            return;
        }
        if(filename2!=null) {
            filename2 = StringHelper.trimRight(filename2);
            if(filename2.length()==0) {
                filename2 = null;
            }
        }
        this.filename2 =  filename2;
        this.filename2DirtyFlag  = true;
    }

    /**
     *  获取属性值[原始文件名称]
     */
    public String getFileName2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileName2();
        }
        return this.filename2;
    }

    /**
     *  获取属性值[原始文件名称]是否修改
     */
    public boolean isFileName2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileName2Dirty();
        }
        return this.filename2DirtyFlag;
    }

    /**
     *  重置属性值[原始文件名称]
     */
    public void resetFileName2() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileName2();
            return;
        }

        this.filename2DirtyFlag = false;
        this.filename2 = null;
    }
    /**
     *  设置属性值[文件大小]
     *  @param filesize
     */
    public void setFileSize(Integer filesize) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileSize(filesize);
            return;
        }
        this.filesize =  filesize;
        this.filesizeDirtyFlag  = true;
    }

    /**
     *  获取属性值[文件大小]
     */
    public Integer getFileSize() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileSize();
        }
        return this.filesize;
    }

    /**
     *  获取属性值[文件大小]是否修改
     */
    public boolean isFileSizeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileSizeDirty();
        }
        return this.filesizeDirtyFlag;
    }

    /**
     *  重置属性值[文件大小]
     */
    public void resetFileSize() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileSize();
            return;
        }

        this.filesizeDirtyFlag = false;
        this.filesize = null;
    }
    /**
     *  设置属性值[文件标识]
     *  @param fileid
     */
    public void setFileId(String fileid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileId(fileid);
            return;
        }
        if(fileid!=null) {
            fileid = StringHelper.trimRight(fileid);
            if(fileid.length()==0) {
                fileid = null;
            }
        }
        this.fileid =  fileid;
        this.fileidDirtyFlag  = true;
    }

    /**
     *  获取属性值[文件标识]
     */
    public String getFileId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileId();
        }
        return this.fileid;
    }

    /**
     *  获取属性值[文件标识]是否修改
     */
    public boolean isFileIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileIdDirty();
        }
        return this.fileidDirtyFlag;
    }

    /**
     *  重置属性值[文件标识]
     */
    public void resetFileId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileId();
            return;
        }

        this.fileidDirtyFlag = false;
        this.fileid = null;
    }
    /**
     *  设置属性值[文件名称]
     *  @param filename
     */
    public void setFileName(String filename) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFileName(filename);
            return;
        }
        if(filename!=null) {
            filename = StringHelper.trimRight(filename);
            if(filename.length()==0) {
                filename = null;
            }
        }
        this.filename =  filename;
        this.filenameDirtyFlag  = true;
    }

    /**
     *  获取属性值[文件名称]
     */
    public String getFileName() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFileName();
        }
        return this.filename;
    }

    /**
     *  获取属性值[文件名称]是否修改
     */
    public boolean isFileNameDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFileNameDirty();
        }
        return this.filenameDirtyFlag;
    }

    /**
     *  重置属性值[文件名称]
     */
    public void resetFileName() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFileName();
            return;
        }

        this.filenameDirtyFlag = false;
        this.filename = null;
    }
    /**
     *  设置属性值[指定目录]
     *  @param folder
     */
    public void setFolder(String folder) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setFolder(folder);
            return;
        }
        if(folder!=null) {
            folder = StringHelper.trimRight(folder);
            if(folder.length()==0) {
                folder = null;
            }
        }
        this.folder =  folder;
        this.folderDirtyFlag  = true;
    }

    /**
     *  获取属性值[指定目录]
     */
    public String getFolder() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getFolder();
        }
        return this.folder;
    }

    /**
     *  获取属性值[指定目录]是否修改
     */
    public boolean isFolderDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isFolderDirty();
        }
        return this.folderDirtyFlag;
    }

    /**
     *  重置属性值[指定目录]
     */
    public void resetFolder() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetFolder();
            return;
        }

        this.folderDirtyFlag = false;
        this.folder = null;
    }
    /**
     *  设置属性值[存储路径]
     *  @param localpath
     */
    public void setLocalPath(String localpath) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLocalPath(localpath);
            return;
        }
        if(localpath!=null) {
            localpath = StringHelper.trimRight(localpath);
            if(localpath.length()==0) {
                localpath = null;
            }
        }
        this.localpath =  localpath;
        this.localpathDirtyFlag  = true;
    }

    /**
     *  获取属性值[存储路径]
     */
    public String getLocalPath() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLocalPath();
        }
        return this.localpath;
    }

    /**
     *  获取属性值[存储路径]是否修改
     */
    public boolean isLocalPathDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLocalPathDirty();
        }
        return this.localpathDirtyFlag;
    }

    /**
     *  重置属性值[存储路径]
     */
    public void resetLocalPath() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLocalPath();
            return;
        }

        this.localpathDirtyFlag = false;
        this.localpath = null;
    }
    /**
     *  设置属性值[存储路径2]
     *  @param localpath2
     */
    public void setLocalPath2(String localpath2) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setLocalPath2(localpath2);
            return;
        }
        if(localpath2!=null) {
            localpath2 = StringHelper.trimRight(localpath2);
            if(localpath2.length()==0) {
                localpath2 = null;
            }
        }
        this.localpath2 =  localpath2;
        this.localpath2DirtyFlag  = true;
    }

    /**
     *  获取属性值[存储路径2]
     */
    public String getLocalPath2() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getLocalPath2();
        }
        return this.localpath2;
    }

    /**
     *  获取属性值[存储路径2]是否修改
     */
    public boolean isLocalPath2Dirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isLocalPath2Dirty();
        }
        return this.localpath2DirtyFlag;
    }

    /**
     *  重置属性值[存储路径2]
     */
    public void resetLocalPath2() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetLocalPath2();
            return;
        }

        this.localpath2DirtyFlag = false;
        this.localpath2 = null;
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
     *  设置属性值[所有者标识]
     *  @param ownerid
     */
    public void setOwnerId(String ownerid) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOwnerId(ownerid);
            return;
        }
        if(ownerid!=null) {
            ownerid = StringHelper.trimRight(ownerid);
            if(ownerid.length()==0) {
                ownerid = null;
            }
        }
        this.ownerid =  ownerid;
        this.owneridDirtyFlag  = true;
    }

    /**
     *  获取属性值[所有者标识]
     */
    public String getOwnerId() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOwnerId();
        }
        return this.ownerid;
    }

    /**
     *  获取属性值[所有者标识]是否修改
     */
    public boolean isOwnerIdDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOwnerIdDirty();
        }
        return this.owneridDirtyFlag;
    }

    /**
     *  重置属性值[所有者标识]
     */
    public void resetOwnerId() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOwnerId();
            return;
        }

        this.owneridDirtyFlag = false;
        this.ownerid = null;
    }
    /**
     *  设置属性值[所有者类型]
     *  @param ownertype
     */
    public void setOwnerType(String ownertype) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setOwnerType(ownertype);
            return;
        }
        if(ownertype!=null) {
            ownertype = StringHelper.trimRight(ownertype);
            if(ownertype.length()==0) {
                ownertype = null;
            }
        }
        this.ownertype =  ownertype;
        this.ownertypeDirtyFlag  = true;
    }

    /**
     *  获取属性值[所有者类型]
     */
    public String getOwnerType() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getOwnerType();
        }
        return this.ownertype;
    }

    /**
     *  获取属性值[所有者类型]是否修改
     */
    public boolean isOwnerTypeDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isOwnerTypeDirty();
        }
        return this.ownertypeDirtyFlag;
    }

    /**
     *  重置属性值[所有者类型]
     */
    public void resetOwnerType() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetOwnerType();
            return;
        }

        this.ownertypeDirtyFlag = false;
        this.ownertype = null;
    }
    /**
     *  设置属性值[图片高度]
     *  @param picheight
     */
    public void setPicHeight(Integer picheight) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPicHeight(picheight);
            return;
        }
        this.picheight =  picheight;
        this.picheightDirtyFlag  = true;
    }

    /**
     *  获取属性值[图片高度]
     */
    public Integer getPicHeight() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPicHeight();
        }
        return this.picheight;
    }

    /**
     *  获取属性值[图片高度]是否修改
     */
    public boolean isPicHeightDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPicHeightDirty();
        }
        return this.picheightDirtyFlag;
    }

    /**
     *  重置属性值[图片高度]
     */
    public void resetPicHeight() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPicHeight();
            return;
        }

        this.picheightDirtyFlag = false;
        this.picheight = null;
    }
    /**
     *  设置属性值[图片宽度]
     *  @param picwidth
     */
    public void setPicWidth(Integer picwidth) {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().setPicWidth(picwidth);
            return;
        }
        this.picwidth =  picwidth;
        this.picwidthDirtyFlag  = true;
    }

    /**
     *  获取属性值[图片宽度]
     */
    public Integer getPicWidth() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().getPicWidth();
        }
        return this.picwidth;
    }

    /**
     *  获取属性值[图片宽度]是否修改
     */
    public boolean isPicWidthDirty() {
        if(this.getProxyEntity()!=null) {
            return this.getProxyEntity().isPicWidthDirty();
        }
        return this.picwidthDirtyFlag;
    }

    /**
     *  重置属性值[图片宽度]
     */
    public void resetPicWidth() {

        if(this.getProxyEntity()!=null) {
            this.getProxyEntity().resetPicWidth();
            return;
        }

        this.picwidthDirtyFlag = false;
        this.picwidth = null;
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
        FileBase.resetAll(this);
        super.onReset();
    }

    /**
     * 重置当前数据对象属性值
     * @param entity
     */
    private static void resetAll(FileBase et) {
        et.resetCreateDate();
        et.resetCreateMan();
        et.resetDigestCode();
        et.resetEnable();
        et.resetFileName2();
        et.resetFileSize();
        et.resetFileId();
        et.resetFileName();
        et.resetFolder();
        et.resetLocalPath();
        et.resetLocalPath2();
        et.resetMemo();
        et.resetOwnerId();
        et.resetOwnerType();
        et.resetPicHeight();
        et.resetPicWidth();
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
        if(!bDirtyOnly || isDigestCodeDirty()) {
            params.put(FIELD_DIGESTCODE,getDigestCode());
        }
        if(!bDirtyOnly || isEnableDirty()) {
            params.put(FIELD_ENABLE,getEnable());
        }
        if(!bDirtyOnly || isFileName2Dirty()) {
            params.put(FIELD_FILENAME2,getFileName2());
        }
        if(!bDirtyOnly || isFileSizeDirty()) {
            params.put(FIELD_FILESIZE,getFileSize());
        }
        if(!bDirtyOnly || isFileIdDirty()) {
            params.put(FIELD_FILEID,getFileId());
        }
        if(!bDirtyOnly || isFileNameDirty()) {
            params.put(FIELD_FILENAME,getFileName());
        }
        if(!bDirtyOnly || isFolderDirty()) {
            params.put(FIELD_FOLDER,getFolder());
        }
        if(!bDirtyOnly || isLocalPathDirty()) {
            params.put(FIELD_LOCALPATH,getLocalPath());
        }
        if(!bDirtyOnly || isLocalPath2Dirty()) {
            params.put(FIELD_LOCALPATH2,getLocalPath2());
        }
        if(!bDirtyOnly || isMemoDirty()) {
            params.put(FIELD_MEMO,getMemo());
        }
        if(!bDirtyOnly || isOwnerIdDirty()) {
            params.put(FIELD_OWNERID,getOwnerId());
        }
        if(!bDirtyOnly || isOwnerTypeDirty()) {
            params.put(FIELD_OWNERTYPE,getOwnerType());
        }
        if(!bDirtyOnly || isPicHeightDirty()) {
            params.put(FIELD_PICHEIGHT,getPicHeight());
        }
        if(!bDirtyOnly || isPicWidthDirty()) {
            params.put(FIELD_PICWIDTH,getPicWidth());
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

        return  FileBase.get(this, index);
    }

    /**
     * 通过属性标识获取属性值
     * @param et 数据对象
     * @param index 属性标识
     * @return
     * @throws Exception
     */
    private static Object get(FileBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate();
        case INDEX_CREATEMAN:
            return et.getCreateMan();
        case INDEX_DIGESTCODE:
            return et.getDigestCode();
        case INDEX_ENABLE:
            return et.getEnable();
        case INDEX_FILENAME2:
            return et.getFileName2();
        case INDEX_FILESIZE:
            return et.getFileSize();
        case INDEX_FILEID:
            return et.getFileId();
        case INDEX_FILENAME:
            return et.getFileName();
        case INDEX_FOLDER:
            return et.getFolder();
        case INDEX_LOCALPATH:
            return et.getLocalPath();
        case INDEX_LOCALPATH2:
            return et.getLocalPath2();
        case INDEX_MEMO:
            return et.getMemo();
        case INDEX_OWNERID:
            return et.getOwnerId();
        case INDEX_OWNERTYPE:
            return et.getOwnerType();
        case INDEX_PICHEIGHT:
            return et.getPicHeight();
        case INDEX_PICWIDTH:
            return et.getPicWidth();
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

        FileBase.set(this,index,objValue);
    }

    /**
     * 通过属性标识设定属性值
     * @param et 数据对象
     * @param index 属性标识
     * @param obj 值
     * @throws Exception
     */
    private static void set(FileBase et,int index,Object obj) throws Exception {
        switch(index) {
        case INDEX_CREATEDATE:
            et.setCreateDate(DataObject.getTimestampValue(obj));
            return ;
        case INDEX_CREATEMAN:
            et.setCreateMan(DataObject.getStringValue(obj));
            return ;
        case INDEX_DIGESTCODE:
            et.setDigestCode(DataObject.getStringValue(obj));
            return ;
        case INDEX_ENABLE:
            et.setEnable(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_FILENAME2:
            et.setFileName2(DataObject.getStringValue(obj));
            return ;
        case INDEX_FILESIZE:
            et.setFileSize(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_FILEID:
            et.setFileId(DataObject.getStringValue(obj));
            return ;
        case INDEX_FILENAME:
            et.setFileName(DataObject.getStringValue(obj));
            return ;
        case INDEX_FOLDER:
            et.setFolder(DataObject.getStringValue(obj));
            return ;
        case INDEX_LOCALPATH:
            et.setLocalPath(DataObject.getStringValue(obj));
            return ;
        case INDEX_LOCALPATH2:
            et.setLocalPath2(DataObject.getStringValue(obj));
            return ;
        case INDEX_MEMO:
            et.setMemo(DataObject.getStringValue(obj));
            return ;
        case INDEX_OWNERID:
            et.setOwnerId(DataObject.getStringValue(obj));
            return ;
        case INDEX_OWNERTYPE:
            et.setOwnerType(DataObject.getStringValue(obj));
            return ;
        case INDEX_PICHEIGHT:
            et.setPicHeight(DataObject.getIntegerValue(obj));
            return ;
        case INDEX_PICWIDTH:
            et.setPicWidth(DataObject.getIntegerValue(obj));
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

        return  FileBase.isNull(this, index);
    }

    /**
     * 判断指定属性值是否为空值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean isNull(FileBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.getCreateDate()==null;
        case INDEX_CREATEMAN:
            return et.getCreateMan()==null;
        case INDEX_DIGESTCODE:
            return et.getDigestCode()==null;
        case INDEX_ENABLE:
            return et.getEnable()==null;
        case INDEX_FILENAME2:
            return et.getFileName2()==null;
        case INDEX_FILESIZE:
            return et.getFileSize()==null;
        case INDEX_FILEID:
            return et.getFileId()==null;
        case INDEX_FILENAME:
            return et.getFileName()==null;
        case INDEX_FOLDER:
            return et.getFolder()==null;
        case INDEX_LOCALPATH:
            return et.getLocalPath()==null;
        case INDEX_LOCALPATH2:
            return et.getLocalPath2()==null;
        case INDEX_MEMO:
            return et.getMemo()==null;
        case INDEX_OWNERID:
            return et.getOwnerId()==null;
        case INDEX_OWNERTYPE:
            return et.getOwnerType()==null;
        case INDEX_PICHEIGHT:
            return et.getPicHeight()==null;
        case INDEX_PICWIDTH:
            return et.getPicWidth()==null;
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

        return  FileBase.contains(this, index);
    }

    /**
     * 获取判断对象是否存在指定属性值
     * @param et
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean contains(FileBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            return et.isCreateDateDirty();
        case INDEX_CREATEMAN:
            return et.isCreateManDirty();
        case INDEX_DIGESTCODE:
            return et.isDigestCodeDirty();
        case INDEX_ENABLE:
            return et.isEnableDirty();
        case INDEX_FILENAME2:
            return et.isFileName2Dirty();
        case INDEX_FILESIZE:
            return et.isFileSizeDirty();
        case INDEX_FILEID:
            return et.isFileIdDirty();
        case INDEX_FILENAME:
            return et.isFileNameDirty();
        case INDEX_FOLDER:
            return et.isFolderDirty();
        case INDEX_LOCALPATH:
            return et.isLocalPathDirty();
        case INDEX_LOCALPATH2:
            return et.isLocalPath2Dirty();
        case INDEX_MEMO:
            return et.isMemoDirty();
        case INDEX_OWNERID:
            return et.isOwnerIdDirty();
        case INDEX_OWNERTYPE:
            return et.isOwnerTypeDirty();
        case INDEX_PICHEIGHT:
            return et.isPicHeightDirty();
        case INDEX_PICWIDTH:
            return et.isPicWidthDirty();
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
    private static  void fillJSONObject(FileBase et,JSONObject json, boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            json.put("createdate", getJSONValue(et.getCreateDate()));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            json.put("createman", getJSONValue(et.getCreateMan()));
        }
        if(bIncEmpty||et.getDigestCode()!=null) {
            json.put("digestcode", getJSONValue(et.getDigestCode()));
        }
        if(bIncEmpty||et.getEnable()!=null) {
            json.put("enable", getJSONValue(et.getEnable()));
        }
        if(bIncEmpty||et.getFileName2()!=null) {
            json.put("filename2", getJSONValue(et.getFileName2()));
        }
        if(bIncEmpty||et.getFileSize()!=null) {
            json.put("filesize", getJSONValue(et.getFileSize()));
        }
        if(bIncEmpty||et.getFileId()!=null) {
            json.put("file_id", getJSONValue(et.getFileId()));
        }
        if(bIncEmpty||et.getFileName()!=null) {
            json.put("file_name", getJSONValue(et.getFileName()));
        }
        if(bIncEmpty||et.getFolder()!=null) {
            json.put("folder", getJSONValue(et.getFolder()));
        }
        if(bIncEmpty||et.getLocalPath()!=null) {
            json.put("localpath", getJSONValue(et.getLocalPath()));
        }
        if(bIncEmpty||et.getLocalPath2()!=null) {
            json.put("localpath2", getJSONValue(et.getLocalPath2()));
        }
        if(bIncEmpty||et.getMemo()!=null) {
            json.put("memo", getJSONValue(et.getMemo()));
        }
        if(bIncEmpty||et.getOwnerId()!=null) {
            json.put("ownerid", getJSONValue(et.getOwnerId()));
        }
        if(bIncEmpty||et.getOwnerType()!=null) {
            json.put("ownertype", getJSONValue(et.getOwnerType()));
        }
        if(bIncEmpty||et.getPicHeight()!=null) {
            json.put("picheight", getJSONValue(et.getPicHeight()));
        }
        if(bIncEmpty||et.getPicWidth()!=null) {
            json.put("picwidth", getJSONValue(et.getPicWidth()));
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
    private static void fillXmlNode(FileBase et,XmlNode node,boolean bIncEmpty) throws Exception {
        if(bIncEmpty||et.getCreateDate()!=null) {
            Object obj = et.getCreateDate();
            node.setAttribute("CREATEDATE",(obj==null)?"":StringHelper.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS",obj));
        }
        if(bIncEmpty||et.getCreateMan()!=null) {
            Object obj = et.getCreateMan();
            node.setAttribute("CREATEMAN",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getDigestCode()!=null) {
            Object obj = et.getDigestCode();
            node.setAttribute("DIGESTCODE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getEnable()!=null) {
            Object obj = et.getEnable();
            node.setAttribute("ENABLE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getFileName2()!=null) {
            Object obj = et.getFileName2();
            node.setAttribute("FILENAME2",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFileSize()!=null) {
            Object obj = et.getFileSize();
            node.setAttribute("FILESIZE",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getFileId()!=null) {
            Object obj = et.getFileId();
            node.setAttribute("FILEID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFileName()!=null) {
            Object obj = et.getFileName();
            node.setAttribute("FILENAME",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getFolder()!=null) {
            Object obj = et.getFolder();
            node.setAttribute("FOLDER",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLocalPath()!=null) {
            Object obj = et.getLocalPath();
            node.setAttribute("LOCALPATH",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getLocalPath2()!=null) {
            Object obj = et.getLocalPath2();
            node.setAttribute("LOCALPATH2",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getMemo()!=null) {
            Object obj = et.getMemo();
            node.setAttribute("MEMO",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOwnerId()!=null) {
            Object obj = et.getOwnerId();
            node.setAttribute("OWNERID",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getOwnerType()!=null) {
            Object obj = et.getOwnerType();
            node.setAttribute("OWNERTYPE",(obj==null)?"":(String)obj);
        }
        if(bIncEmpty||et.getPicHeight()!=null) {
            Object obj = et.getPicHeight();
            node.setAttribute("PICHEIGHT",(obj==null)?"":StringHelper.format("%1$s",obj));
        }
        if(bIncEmpty||et.getPicWidth()!=null) {
            Object obj = et.getPicWidth();
            node.setAttribute("PICWIDTH",(obj==null)?"":StringHelper.format("%1$s",obj));
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
        FileBase.copyTo(this,dataEntity,bIncludeEmtpy);
        super.onCopyTo(dataEntity,bIncludeEmtpy);
    }

    /**
     * 复制当前对象数据到目标对象
     * @param et 当前数据对象
     * @param dst 目标数据对象
     * @param bIncEmpty 是否包括空值
     * @throws Exception
     */
    private static void copyTo(FileBase et,IDataObject dst,boolean bIncEmpty) throws Exception {
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
        if(et.isDigestCodeDirty() && (bIncEmpty||et.getDigestCode()!=null)) {
            Object obj = et.getDigestCode();
            if(obj==null) {
                dst.set(FIELD_DIGESTCODE,null);
            } else {
                dst.set(FIELD_DIGESTCODE,obj);
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
        if(et.isFileName2Dirty() && (bIncEmpty||et.getFileName2()!=null)) {
            Object obj = et.getFileName2();
            if(obj==null) {
                dst.set(FIELD_FILENAME2,null);
            } else {
                dst.set(FIELD_FILENAME2,obj);
            }
        }
        if(et.isFileSizeDirty() && (bIncEmpty||et.getFileSize()!=null)) {
            Object obj = et.getFileSize();
            if(obj==null) {
                dst.set(FIELD_FILESIZE,null);
            } else {
                dst.set(FIELD_FILESIZE,obj);
            }
        }
        if(et.isFileIdDirty() && (bIncEmpty||et.getFileId()!=null)) {
            Object obj = et.getFileId();
            if(obj==null) {
                dst.set(FIELD_FILEID,null);
            } else {
                dst.set(FIELD_FILEID,obj);
            }
        }
        if(et.isFileNameDirty() && (bIncEmpty||et.getFileName()!=null)) {
            Object obj = et.getFileName();
            if(obj==null) {
                dst.set(FIELD_FILENAME,null);
            } else {
                dst.set(FIELD_FILENAME,obj);
            }
        }
        if(et.isFolderDirty() && (bIncEmpty||et.getFolder()!=null)) {
            Object obj = et.getFolder();
            if(obj==null) {
                dst.set(FIELD_FOLDER,null);
            } else {
                dst.set(FIELD_FOLDER,obj);
            }
        }
        if(et.isLocalPathDirty() && (bIncEmpty||et.getLocalPath()!=null)) {
            Object obj = et.getLocalPath();
            if(obj==null) {
                dst.set(FIELD_LOCALPATH,null);
            } else {
                dst.set(FIELD_LOCALPATH,obj);
            }
        }
        if(et.isLocalPath2Dirty() && (bIncEmpty||et.getLocalPath2()!=null)) {
            Object obj = et.getLocalPath2();
            if(obj==null) {
                dst.set(FIELD_LOCALPATH2,null);
            } else {
                dst.set(FIELD_LOCALPATH2,obj);
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
        if(et.isOwnerIdDirty() && (bIncEmpty||et.getOwnerId()!=null)) {
            Object obj = et.getOwnerId();
            if(obj==null) {
                dst.set(FIELD_OWNERID,null);
            } else {
                dst.set(FIELD_OWNERID,obj);
            }
        }
        if(et.isOwnerTypeDirty() && (bIncEmpty||et.getOwnerType()!=null)) {
            Object obj = et.getOwnerType();
            if(obj==null) {
                dst.set(FIELD_OWNERTYPE,null);
            } else {
                dst.set(FIELD_OWNERTYPE,obj);
            }
        }
        if(et.isPicHeightDirty() && (bIncEmpty||et.getPicHeight()!=null)) {
            Object obj = et.getPicHeight();
            if(obj==null) {
                dst.set(FIELD_PICHEIGHT,null);
            } else {
                dst.set(FIELD_PICHEIGHT,obj);
            }
        }
        if(et.isPicWidthDirty() && (bIncEmpty||et.getPicWidth()!=null)) {
            Object obj = et.getPicWidth();
            if(obj==null) {
                dst.set(FIELD_PICWIDTH,null);
            } else {
                dst.set(FIELD_PICWIDTH,obj);
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
        return  FileBase.remove(this, index);
    }

    /**
     * 通过属性标识删除属性值
     * @param entity
     * @param index
     * @return
     * @throws Exception
     */
    private static boolean remove(FileBase et,int index) throws Exception {

        switch(index) {
        case INDEX_CREATEDATE:
            et.resetCreateDate();
            return true;
        case INDEX_CREATEMAN:
            et.resetCreateMan();
            return true;
        case INDEX_DIGESTCODE:
            et.resetDigestCode();
            return true;
        case INDEX_ENABLE:
            et.resetEnable();
            return true;
        case INDEX_FILENAME2:
            et.resetFileName2();
            return true;
        case INDEX_FILESIZE:
            et.resetFileSize();
            return true;
        case INDEX_FILEID:
            et.resetFileId();
            return true;
        case INDEX_FILENAME:
            et.resetFileName();
            return true;
        case INDEX_FOLDER:
            et.resetFolder();
            return true;
        case INDEX_LOCALPATH:
            et.resetLocalPath();
            return true;
        case INDEX_LOCALPATH2:
            et.resetLocalPath2();
            return true;
        case INDEX_MEMO:
            et.resetMemo();
            return true;
        case INDEX_OWNERID:
            et.resetOwnerId();
            return true;
        case INDEX_OWNERTYPE:
            et.resetOwnerType();
            return true;
        case INDEX_PICHEIGHT:
            et.resetPicHeight();
            return true;
        case INDEX_PICWIDTH:
            et.resetPicWidth();
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
    private FileBase getProxyEntity() {
        return this.proxyFileBase;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.data.DataObject#onProxy(net.ibizsys.paas.data.IDataObject)
     */
    @Override
    protected void onProxy(IDataObject proxyDataObject) {
        this.proxyFileBase = null;
        if(proxyDataObject!=null && proxyDataObject instanceof FileBase) {
            this.proxyFileBase = (FileBase)proxyDataObject;
        }

    }

}