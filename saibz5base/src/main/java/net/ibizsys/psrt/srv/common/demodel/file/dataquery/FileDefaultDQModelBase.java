/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.file.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="160D07ED-4D8E-4292-A60C-63F66CCFAE27",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DIGESTCODE AS DIGESTCODE, t1.ENABLE AS ENABLE, t1.FILENAME2 AS FILENAME2, t1.FILESIZE AS FILESIZE, t1.FILE_ID AS FILE_ID, t1.FILE_NAME AS FILE_NAME, t1.FOLDER AS FOLDER, t1.LOCALPATH AS LOCALPATH, t1.LOCALPATH2 AS LOCALPATH2, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.PICHEIGHT AS PICHEIGHT, t1.PICWIDTH AS PICWIDTH, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DIGESTCODE AS DIGESTCODE, t1.ENABLE AS ENABLE, t1.FILENAME2 AS FILENAME2, t1.FILESIZE AS FILESIZE, t1.FILE_ID AS FILE_ID, t1.FILE_NAME AS FILE_NAME, t1.FOLDER AS FOLDER, t1.LOCALPATH AS LOCALPATH, t1.LOCALPATH2 AS LOCALPATH2, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.PICHEIGHT AS PICHEIGHT, t1.PICWIDTH AS PICWIDTH, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DIGESTCODE AS DIGESTCODE, t1.ENABLE AS ENABLE, t1.FILENAME2 AS FILENAME2, t1.FILESIZE AS FILESIZE, t1.FILE_ID AS FILE_ID, t1.FILE_NAME AS FILE_NAME, t1.FOLDER AS FOLDER, t1.LOCALPATH AS LOCALPATH, t1.LOCALPATH2 AS LOCALPATH2, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.PICHEIGHT AS PICHEIGHT, t1.PICWIDTH AS PICWIDTH, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DIGESTCODE AS DIGESTCODE, t1.ENABLE AS ENABLE, t1.FILENAME2 AS FILENAME2, t1.FILESIZE AS FILESIZE, t1.FILE_ID AS FILE_ID, t1.FILE_NAME AS FILE_NAME, t1.FOLDER AS FOLDER, t1.LOCALPATH AS LOCALPATH, t1.LOCALPATH2 AS LOCALPATH2, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.PICHEIGHT AS PICHEIGHT, t1.PICWIDTH AS PICWIDTH, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFFILE t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DIGESTCODE",expression="t1.DIGESTCODE")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="FILENAME2",expression="t1.FILENAME2")
        ,@DEDataQueryCodeExp(name="FILESIZE",expression="t1.FILESIZE")
        ,@DEDataQueryCodeExp(name="FILE_ID",expression="t1.FILE_ID")
        ,@DEDataQueryCodeExp(name="FILE_NAME",expression="t1.FILE_NAME")
        ,@DEDataQueryCodeExp(name="FOLDER",expression="t1.FOLDER")
        ,@DEDataQueryCodeExp(name="LOCALPATH",expression="t1.LOCALPATH")
        ,@DEDataQueryCodeExp(name="LOCALPATH2",expression="t1.LOCALPATH2")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="PICHEIGHT",expression="t1.PICHEIGHT")
        ,@DEDataQueryCodeExp(name="PICWIDTH",expression="t1.PICWIDTH")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class FileDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public FileDefaultDQModelBase() {
        super();

        this.initAnnotation(FileDefaultDQModelBase.class);
    }

}