/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.datasyncin.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="A14D2C92-C1B1-474B-BE28-C46CCD41DD59",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAKEY AS DATAKEY, t1.DATASYNCINID AS DATASYNCINID, t1.DATASYNCINNAME AS DATASYNCINNAME, t1.DEID AS DEID, t1.DENAME AS DENAME, t1.EVENTTYPE AS EVENTTYPE, t1.FILEFLAG AS FILEFLAG, t1.SYNCAGENT AS SYNCAGENT, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFDATASYNCIN t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DATASYNCINID",expression="t1.DATASYNCINID")
        ,@DEDataQueryCodeExp(name="DATASYNCINNAME",expression="t1.DATASYNCINNAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="FILEFLAG",expression="t1.FILEFLAG")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.SYNCAGENT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DATAKEY` AS `DATAKEY`, t1.`DATASYNCINID` AS `DATASYNCINID`, t1.`DATASYNCINNAME` AS `DATASYNCINNAME`, t1.`DEID` AS `DEID`, t1.`DENAME` AS `DENAME`, t1.`EVENTTYPE` AS `EVENTTYPE`, t1.`FILEFLAG` AS `FILEFLAG`, t1.`SYNCAGENT` AS `SYNCAGENT`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN` FROM `T_SRFDATASYNCIN` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.`DATA`")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.`LOGICDATA`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.`DATAKEY`")
        ,@DEDataQueryCodeExp(name="DATASYNCINID",expression="t1.`DATASYNCINID`")
        ,@DEDataQueryCodeExp(name="DATASYNCINNAME",expression="t1.`DATASYNCINNAME`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.`DENAME`")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.`EVENTTYPE`")
        ,@DEDataQueryCodeExp(name="FILEFLAG",expression="t1.`FILEFLAG`")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.`SYNCAGENT`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAKEY AS DATAKEY, t1.DATASYNCINID AS DATASYNCINID, t1.DATASYNCINNAME AS DATASYNCINNAME, t1.DEID AS DEID, t1.DENAME AS DENAME, t1.EVENTTYPE AS EVENTTYPE, t1.FILEFLAG AS FILEFLAG, t1.SYNCAGENT AS SYNCAGENT, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFDATASYNCIN t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.DATA")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.LOGICDATA")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.DATAKEY")
        ,@DEDataQueryCodeExp(name="DATASYNCINID",expression="t1.DATASYNCINID")
        ,@DEDataQueryCodeExp(name="DATASYNCINNAME",expression="t1.DATASYNCINNAME")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.EVENTTYPE")
        ,@DEDataQueryCodeExp(name="FILEFLAG",expression="t1.FILEFLAG")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.SYNCAGENT")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DATAKEY] AS [DATAKEY], t1.[DATASYNCINID] AS [DATASYNCINID], t1.[DATASYNCINNAME] AS [DATASYNCINNAME], t1.[DEID] AS [DEID], t1.[DENAME] AS [DENAME], t1.[EVENTTYPE] AS [EVENTTYPE], t1.[FILEFLAG] AS [FILEFLAG], t1.[SYNCAGENT] AS [SYNCAGENT], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN] FROM [T_SRFDATASYNCIN] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="DATA",expression="t1.[DATA]")
        ,@DEDataQueryCodeExp(name="LOGICDATA",expression="t1.[LOGICDATA]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAKEY",expression="t1.[DATAKEY]")
        ,@DEDataQueryCodeExp(name="DATASYNCINID",expression="t1.[DATASYNCINID]")
        ,@DEDataQueryCodeExp(name="DATASYNCINNAME",expression="t1.[DATASYNCINNAME]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.[DENAME]")
        ,@DEDataQueryCodeExp(name="EVENTTYPE",expression="t1.[EVENTTYPE]")
        ,@DEDataQueryCodeExp(name="FILEFLAG",expression="t1.[FILEFLAG]")
        ,@DEDataQueryCodeExp(name="SYNCAGENT",expression="t1.[SYNCAGENT]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DataSyncInDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DataSyncInDefaultDQModelBase() {
        super();

        this.initAnnotation(DataSyncInDefaultDQModelBase.class);
    }

}