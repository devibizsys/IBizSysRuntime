/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfstep.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="AA5AE176-2F5B-4651-A48F-4AC799C44D82",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEADLINE AS DEADLINE, t1.ENDTIME AS ENDTIME, t1.FROMWFSTEPID AS FROMWFSTEPID, t1.ISFINISH AS ISFINISH, t1.ISINTERACTIVE AS ISINTERACTIVE, t1.LASTACTORID AS LASTACTORID, t1.MEMO AS MEMO, t1.STARTTIME AS STARTTIME, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFINSTANCEID AS WFINSTANCEID, t11.WFINSTANCENAME AS WFINSTANCENAME, t1.WFPLOGICNAME AS WFPLOGICNAME, t1.WFPNAME AS WFPNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFVERSION AS WFVERSION FROM T_SRFWFSTEP t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="WFPMODEL",expression="t1.WFPMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEADLINE",expression="t1.DEADLINE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="FROMWFSTEPID",expression="t1.FROMWFSTEPID")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISINTERACTIVE",expression="t1.ISINTERACTIVE")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFPNAME",expression="t1.WFPNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEADLINE AS DEADLINE, t1.ENDTIME AS ENDTIME, t1.FROMWFSTEPID AS FROMWFSTEPID, t1.ISFINISH AS ISFINISH, t1.ISINTERACTIVE AS ISINTERACTIVE, t1.LASTACTORID AS LASTACTORID, t1.MEMO AS MEMO, t1.STARTTIME AS STARTTIME, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFINSTANCEID AS WFINSTANCEID, t11.WFINSTANCENAME AS WFINSTANCENAME, t1.WFPLOGICNAME AS WFPLOGICNAME, t1.WFPNAME AS WFPNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFVERSION AS WFVERSION FROM T_SRFWFSTEP t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="WFPMODEL",expression="t1.WFPMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEADLINE",expression="t1.DEADLINE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="FROMWFSTEPID",expression="t1.FROMWFSTEPID")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISINTERACTIVE",expression="t1.ISINTERACTIVE")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFPNAME",expression="t1.WFPNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEADLINE AS DEADLINE, t1.ENDTIME AS ENDTIME, t1.FROMWFSTEPID AS FROMWFSTEPID, t1.ISFINISH AS ISFINISH, t1.ISINTERACTIVE AS ISINTERACTIVE, t1.LASTACTORID AS LASTACTORID, t1.MEMO AS MEMO, t1.STARTTIME AS STARTTIME, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFINSTANCEID AS WFINSTANCEID, t11.WFINSTANCENAME AS WFINSTANCENAME, t1.WFPLOGICNAME AS WFPLOGICNAME, t1.WFPNAME AS WFPNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFVERSION AS WFVERSION FROM T_SRFWFSTEP t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="WFPMODEL",expression="t1.WFPMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEADLINE",expression="t1.DEADLINE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="FROMWFSTEPID",expression="t1.FROMWFSTEPID")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISINTERACTIVE",expression="t1.ISINTERACTIVE")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFPNAME",expression="t1.WFPNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEADLINE AS DEADLINE, t1.ENDTIME AS ENDTIME, t1.FROMWFSTEPID AS FROMWFSTEPID, t1.ISFINISH AS ISFINISH, t1.ISINTERACTIVE AS ISINTERACTIVE, t1.LASTACTORID AS LASTACTORID, t1.MEMO AS MEMO, t1.STARTTIME AS STARTTIME, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFINSTANCEID AS WFINSTANCEID, t11.WFINSTANCENAME AS WFINSTANCENAME, t1.WFPLOGICNAME AS WFPLOGICNAME, t1.WFPNAME AS WFPNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFVERSION AS WFVERSION FROM T_SRFWFSTEP t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.WFINSTANCEID = t11.WFINSTANCEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="WFPMODEL",expression="t1.WFPMODEL")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEADLINE",expression="t1.DEADLINE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="FROMWFSTEPID",expression="t1.FROMWFSTEPID")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="ISINTERACTIVE",expression="t1.ISINTERACTIVE")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFPLOGICNAME",expression="t1.WFPLOGICNAME")
        ,@DEDataQueryCodeExp(name="WFPNAME",expression="t1.WFPNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFStepDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFStepDefaultDQModelBase() {
        super();

        this.initAnnotation(WFStepDefaultDQModelBase.class);
    }

}