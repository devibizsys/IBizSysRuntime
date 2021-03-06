/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfinstance.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="DE8AB080-8956-418E-B7AA-6DD48BEBB703",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.ACTIVESTEPID AS ACTIVESTEPID, t1.ACTIVESTEPNAME AS ACTIVESTEPNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t1.ENDTIME AS ENDTIME, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISCANCEL AS ISCANCEL, t1.ISCLOSE AS ISCLOSE, t1.ISERROR AS ISERROR, t1.ISFINISH AS ISFINISH, t1.LASTACTION AS LASTACTION, t1.LASTACTORID AS LASTACTORID, t1.LASTWFSTEPID AS LASTWFSTEPID, t1.MEMO AS MEMO, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.OWNER AS OWNER, t1.PARALLELINST AS PARALLELINST, t1.PSTEPID AS PSTEPID, t1.PWFINSTANCEID AS PWFINSTANCEID, t11.WFINSTANCENAME AS PWFINSTANCENAME, t1.RESULT AS RESULT, t1.STARTTIME AS STARTTIME, t1.SUSPENDFLAG AS SUSPENDFLAG, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.USERTAG AS USERTAG, t1.USERTAG2 AS USERTAG2, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFVERSION AS WFVERSION, t1.WFWORKFLOWID AS WFWORKFLOWID, t21.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFINSTANCE t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.PWFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFWORKFLOW t21 ON t1.WFWORKFLOWID = t21.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELREASON",expression="t1.CANCELREASON")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t1.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPNAME",expression="t1.ACTIVESTEPNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISCANCEL",expression="t1.ISCANCEL")
        ,@DEDataQueryCodeExp(name="ISCLOSE",expression="t1.ISCLOSE")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="LASTACTION",expression="t1.LASTACTION")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="LASTWFSTEPID",expression="t1.LASTWFSTEPID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="OWNER",expression="t1.OWNER")
        ,@DEDataQueryCodeExp(name="PARALLELINST",expression="t1.PARALLELINST")
        ,@DEDataQueryCodeExp(name="PSTEPID",expression="t1.PSTEPID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCEID",expression="t1.PWFINSTANCEID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="RESULT",expression="t1.RESULT")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="SUSPENDFLAG",expression="t1.SUSPENDFLAG")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
        ,@DEDataQueryCodeExp(name="USERTAG2",expression="t1.USERTAG2")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t21.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.ACTIVESTEPID AS ACTIVESTEPID, t1.ACTIVESTEPNAME AS ACTIVESTEPNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t1.ENDTIME AS ENDTIME, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISCANCEL AS ISCANCEL, t1.ISCLOSE AS ISCLOSE, t1.ISERROR AS ISERROR, t1.ISFINISH AS ISFINISH, t1.LASTACTION AS LASTACTION, t1.LASTACTORID AS LASTACTORID, t1.LASTWFSTEPID AS LASTWFSTEPID, t1.MEMO AS MEMO, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.OWNER AS OWNER, t1.PARALLELINST AS PARALLELINST, t1.PSTEPID AS PSTEPID, t1.PWFINSTANCEID AS PWFINSTANCEID, t11.WFINSTANCENAME AS PWFINSTANCENAME, t1.RESULT AS RESULT, t1.STARTTIME AS STARTTIME, t1.SUSPENDFLAG AS SUSPENDFLAG, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.USERTAG AS USERTAG, t1.USERTAG2 AS USERTAG2, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFVERSION AS WFVERSION, t1.WFWORKFLOWID AS WFWORKFLOWID, t21.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFINSTANCE t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.PWFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFWORKFLOW t21 ON t1.WFWORKFLOWID = t21.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELREASON",expression="t1.CANCELREASON")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t1.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPNAME",expression="t1.ACTIVESTEPNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISCANCEL",expression="t1.ISCANCEL")
        ,@DEDataQueryCodeExp(name="ISCLOSE",expression="t1.ISCLOSE")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="LASTACTION",expression="t1.LASTACTION")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="LASTWFSTEPID",expression="t1.LASTWFSTEPID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="OWNER",expression="t1.OWNER")
        ,@DEDataQueryCodeExp(name="PARALLELINST",expression="t1.PARALLELINST")
        ,@DEDataQueryCodeExp(name="PSTEPID",expression="t1.PSTEPID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCEID",expression="t1.PWFINSTANCEID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="RESULT",expression="t1.RESULT")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="SUSPENDFLAG",expression="t1.SUSPENDFLAG")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
        ,@DEDataQueryCodeExp(name="USERTAG2",expression="t1.USERTAG2")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t21.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.ACTIVESTEPID AS ACTIVESTEPID, t1.ACTIVESTEPNAME AS ACTIVESTEPNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t1.ENDTIME AS ENDTIME, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISCANCEL AS ISCANCEL, t1.ISCLOSE AS ISCLOSE, t1.ISERROR AS ISERROR, t1.ISFINISH AS ISFINISH, t1.LASTACTION AS LASTACTION, t1.LASTACTORID AS LASTACTORID, t1.LASTWFSTEPID AS LASTWFSTEPID, t1.MEMO AS MEMO, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.OWNER AS OWNER, t1.PARALLELINST AS PARALLELINST, t1.PSTEPID AS PSTEPID, t1.PWFINSTANCEID AS PWFINSTANCEID, t11.WFINSTANCENAME AS PWFINSTANCENAME, t1.RESULT AS RESULT, t1.STARTTIME AS STARTTIME, t1.SUSPENDFLAG AS SUSPENDFLAG, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.USERTAG AS USERTAG, t1.USERTAG2 AS USERTAG2, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFVERSION AS WFVERSION, t1.WFWORKFLOWID AS WFWORKFLOWID, t21.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFINSTANCE t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.PWFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFWORKFLOW t21 ON t1.WFWORKFLOWID = t21.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELREASON",expression="t1.CANCELREASON")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t1.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPNAME",expression="t1.ACTIVESTEPNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISCANCEL",expression="t1.ISCANCEL")
        ,@DEDataQueryCodeExp(name="ISCLOSE",expression="t1.ISCLOSE")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="LASTACTION",expression="t1.LASTACTION")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="LASTWFSTEPID",expression="t1.LASTWFSTEPID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="OWNER",expression="t1.OWNER")
        ,@DEDataQueryCodeExp(name="PARALLELINST",expression="t1.PARALLELINST")
        ,@DEDataQueryCodeExp(name="PSTEPID",expression="t1.PSTEPID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCEID",expression="t1.PWFINSTANCEID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="RESULT",expression="t1.RESULT")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="SUSPENDFLAG",expression="t1.SUSPENDFLAG")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
        ,@DEDataQueryCodeExp(name="USERTAG2",expression="t1.USERTAG2")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t21.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    }),
    @DEDataQueryCode(querycode="SELECT t1.ACTIVESTEPID AS ACTIVESTEPID, t1.ACTIVESTEPNAME AS ACTIVESTEPNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENABLE AS ENABLE, t1.ENDTIME AS ENDTIME, t1.IMPORTANCEFLAG AS IMPORTANCEFLAG, t1.ISCANCEL AS ISCANCEL, t1.ISCLOSE AS ISCLOSE, t1.ISERROR AS ISERROR, t1.ISFINISH AS ISFINISH, t1.LASTACTION AS LASTACTION, t1.LASTACTORID AS LASTACTORID, t1.LASTWFSTEPID AS LASTWFSTEPID, t1.MEMO AS MEMO, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.OWNER AS OWNER, t1.PARALLELINST AS PARALLELINST, t1.PSTEPID AS PSTEPID, t1.PWFINSTANCEID AS PWFINSTANCEID, t11.WFINSTANCENAME AS PWFINSTANCENAME, t1.RESULT AS RESULT, t1.STARTTIME AS STARTTIME, t1.SUSPENDFLAG AS SUSPENDFLAG, t1.TRACESTEP AS TRACESTEP, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.USERTAG AS USERTAG, t1.USERTAG2 AS USERTAG2, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFVERSION AS WFVERSION, t1.WFWORKFLOWID AS WFWORKFLOWID, t21.WFWORKFLOWNAME AS WFWORKFLOWNAME FROM T_SRFWFINSTANCE t1  LEFT JOIN T_SRFWFINSTANCE t11 ON t1.PWFINSTANCEID = t11.WFINSTANCEID  LEFT JOIN T_SRFWFWORKFLOW t21 ON t1.WFWORKFLOWID = t21.WFWORKFLOWID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELREASON",expression="t1.CANCELREASON")
        ,@DEDataQueryCodeExp(name="ERRORINFO",expression="t1.ERRORINFO")
        ,@DEDataQueryCodeExp(name="WFMODEL",expression="t1.WFMODEL")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPID",expression="t1.ACTIVESTEPID")
        ,@DEDataQueryCodeExp(name="ACTIVESTEPNAME",expression="t1.ACTIVESTEPNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENABLE",expression="t1.ENABLE")
        ,@DEDataQueryCodeExp(name="ENDTIME",expression="t1.ENDTIME")
        ,@DEDataQueryCodeExp(name="IMPORTANCEFLAG",expression="t1.IMPORTANCEFLAG")
        ,@DEDataQueryCodeExp(name="ISCANCEL",expression="t1.ISCANCEL")
        ,@DEDataQueryCodeExp(name="ISCLOSE",expression="t1.ISCLOSE")
        ,@DEDataQueryCodeExp(name="ISERROR",expression="t1.ISERROR")
        ,@DEDataQueryCodeExp(name="ISFINISH",expression="t1.ISFINISH")
        ,@DEDataQueryCodeExp(name="LASTACTION",expression="t1.LASTACTION")
        ,@DEDataQueryCodeExp(name="LASTACTORID",expression="t1.LASTACTORID")
        ,@DEDataQueryCodeExp(name="LASTWFSTEPID",expression="t1.LASTWFSTEPID")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="OWNER",expression="t1.OWNER")
        ,@DEDataQueryCodeExp(name="PARALLELINST",expression="t1.PARALLELINST")
        ,@DEDataQueryCodeExp(name="PSTEPID",expression="t1.PSTEPID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCEID",expression="t1.PWFINSTANCEID")
        ,@DEDataQueryCodeExp(name="PWFINSTANCENAME",expression="t11.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="RESULT",expression="t1.RESULT")
        ,@DEDataQueryCodeExp(name="STARTTIME",expression="t1.STARTTIME")
        ,@DEDataQueryCodeExp(name="SUSPENDFLAG",expression="t1.SUSPENDFLAG")
        ,@DEDataQueryCodeExp(name="TRACESTEP",expression="t1.TRACESTEP")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="USERTAG",expression="t1.USERTAG")
        ,@DEDataQueryCodeExp(name="USERTAG2",expression="t1.USERTAG2")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFVERSION",expression="t1.WFVERSION")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t21.WFWORKFLOWNAME")
    },
    conds={
        @DEDataQueryCodeCond(condition="t1.ENABLE = 1")
    })
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFInstanceDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFInstanceDefaultDQModelBase() {
        super();

        this.initAnnotation(WFInstanceDefaultDQModelBase.class);
    }

}