/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.dedatachgdisp.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="29477383-FCCB-463B-A56E-64FAC297AC24",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEDATACHGDISPID AS DEDATACHGDISPID, t1.DEDATACHGDISPNAME AS DEDATACHGDISPNAME, t1.ENGINEOBJECT AS ENGINEOBJECT, t1.MEMO AS MEMO, t1.ORDERFLAG AS ORDERFLAG, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFDEDATACHGDISP t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPID",expression="t1.DEDATACHGDISPID")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPNAME",expression="t1.DEDATACHGDISPNAME")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.ENGINEOBJECT")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.ORDERFLAG")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DEDATACHGDISPID` AS `DEDATACHGDISPID`, t1.`DEDATACHGDISPNAME` AS `DEDATACHGDISPNAME`, t1.`ENGINEOBJECT` AS `ENGINEOBJECT`, t1.`MEMO` AS `MEMO`, t1.`ORDERFLAG` AS `ORDERFLAG`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`VALIDFLAG` AS `VALIDFLAG` FROM `T_SRFDEDATACHGDISP` t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPID",expression="t1.`DEDATACHGDISPID`")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPNAME",expression="t1.`DEDATACHGDISPNAME`")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.`ENGINEOBJECT`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.`ORDERFLAG`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEDATACHGDISPID AS DEDATACHGDISPID, t1.DEDATACHGDISPNAME AS DEDATACHGDISPNAME, t1.ENGINEOBJECT AS ENGINEOBJECT, t1.MEMO AS MEMO, t1.ORDERFLAG AS ORDERFLAG, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFDEDATACHGDISP t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPID",expression="t1.DEDATACHGDISPID")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPNAME",expression="t1.DEDATACHGDISPNAME")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.ENGINEOBJECT")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.ORDERFLAG")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DEDATACHGDISPID] AS [DEDATACHGDISPID], t1.[DEDATACHGDISPNAME] AS [DEDATACHGDISPNAME], t1.[ENGINEOBJECT] AS [ENGINEOBJECT], t1.[MEMO] AS [MEMO], t1.[ORDERFLAG] AS [ORDERFLAG], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[VALIDFLAG] AS [VALIDFLAG] FROM [T_SRFDEDATACHGDISP] t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPID",expression="t1.[DEDATACHGDISPID]")
        ,@DEDataQueryCodeExp(name="DEDATACHGDISPNAME",expression="t1.[DEDATACHGDISPNAME]")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.[ENGINEOBJECT]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.[ORDERFLAG]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.[VALIDFLAG]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DEDataChgDispDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DEDataChgDispDefaultDQModelBase() {
        super();

        this.initAnnotation(DEDataChgDispDefaultDQModelBase.class);
    }

}