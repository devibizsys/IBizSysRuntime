/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfworklist.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="D38F06FD-408B-47C3-ABA6-94899C66529C",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CANCELFLAG AS CANCELFLAG, t1.CANCELINFORM AS CANCELINFORM, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ORIGINALWFUSERID AS ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME AS ORIGINALWFUSERNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.WFACTORID AS WFACTORID, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t1.WFWORKFLOWNAME AS WFWORKFLOWNAME, t1.WFWORKLISTID AS WFWORKLISTID, t1.WFWORKLISTNAME AS WFWORKLISTNAME, t1.WORKINFORM AS WORKINFORM FROM T_SRFWFWORKLIST t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELFLAG",expression="t1.CANCELFLAG")
        ,@DEDataQueryCodeExp(name="CANCELINFORM",expression="t1.CANCELINFORM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWORKLISTID",expression="t1.WFWORKLISTID")
        ,@DEDataQueryCodeExp(name="WFWORKLISTNAME",expression="t1.WFWORKLISTNAME")
        ,@DEDataQueryCodeExp(name="WORKINFORM",expression="t1.WORKINFORM")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CANCELFLAG AS CANCELFLAG, t1.CANCELINFORM AS CANCELINFORM, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ORIGINALWFUSERID AS ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME AS ORIGINALWFUSERNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.WFACTORID AS WFACTORID, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t1.WFWORKFLOWNAME AS WFWORKFLOWNAME, t1.WFWORKLISTID AS WFWORKLISTID, t1.WFWORKLISTNAME AS WFWORKLISTNAME, t1.WORKINFORM AS WORKINFORM FROM T_SRFWFWORKLIST t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELFLAG",expression="t1.CANCELFLAG")
        ,@DEDataQueryCodeExp(name="CANCELINFORM",expression="t1.CANCELINFORM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWORKLISTID",expression="t1.WFWORKLISTID")
        ,@DEDataQueryCodeExp(name="WFWORKLISTNAME",expression="t1.WFWORKLISTNAME")
        ,@DEDataQueryCodeExp(name="WORKINFORM",expression="t1.WORKINFORM")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CANCELFLAG AS CANCELFLAG, t1.CANCELINFORM AS CANCELINFORM, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ORIGINALWFUSERID AS ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME AS ORIGINALWFUSERNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.WFACTORID AS WFACTORID, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t1.WFWORKFLOWNAME AS WFWORKFLOWNAME, t1.WFWORKLISTID AS WFWORKLISTID, t1.WFWORKLISTNAME AS WFWORKLISTNAME, t1.WORKINFORM AS WORKINFORM FROM T_SRFWFWORKLIST t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELFLAG",expression="t1.CANCELFLAG")
        ,@DEDataQueryCodeExp(name="CANCELINFORM",expression="t1.CANCELINFORM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWORKLISTID",expression="t1.WFWORKLISTID")
        ,@DEDataQueryCodeExp(name="WFWORKLISTNAME",expression="t1.WFWORKLISTNAME")
        ,@DEDataQueryCodeExp(name="WORKINFORM",expression="t1.WORKINFORM")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CANCELFLAG AS CANCELFLAG, t1.CANCELINFORM AS CANCELINFORM, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ORIGINALWFUSERID AS ORIGINALWFUSERID, t1.ORIGINALWFUSERNAME AS ORIGINALWFUSERNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERDATAINFO AS USERDATAINFO, t1.WFACTORID AS WFACTORID, t1.WFINSTANCEID AS WFINSTANCEID, t1.WFINSTANCENAME AS WFINSTANCENAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME, t1.WFWORKFLOWID AS WFWORKFLOWID, t1.WFWORKFLOWNAME AS WFWORKFLOWNAME, t1.WFWORKLISTID AS WFWORKLISTID, t1.WFWORKLISTNAME AS WFWORKLISTNAME, t1.WORKINFORM AS WORKINFORM FROM T_SRFWFWORKLIST t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CANCELFLAG",expression="t1.CANCELFLAG")
        ,@DEDataQueryCodeExp(name="CANCELINFORM",expression="t1.CANCELINFORM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERID",expression="t1.ORIGINALWFUSERID")
        ,@DEDataQueryCodeExp(name="ORIGINALWFUSERNAME",expression="t1.ORIGINALWFUSERNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERDATAINFO",expression="t1.USERDATAINFO")
        ,@DEDataQueryCodeExp(name="WFACTORID",expression="t1.WFACTORID")
        ,@DEDataQueryCodeExp(name="WFINSTANCEID",expression="t1.WFINSTANCEID")
        ,@DEDataQueryCodeExp(name="WFINSTANCENAME",expression="t1.WFINSTANCENAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWID",expression="t1.WFWORKFLOWID")
        ,@DEDataQueryCodeExp(name="WFWORKFLOWNAME",expression="t1.WFWORKFLOWNAME")
        ,@DEDataQueryCodeExp(name="WFWORKLISTID",expression="t1.WFWORKLISTID")
        ,@DEDataQueryCodeExp(name="WFWORKLISTNAME",expression="t1.WFWORKLISTNAME")
        ,@DEDataQueryCodeExp(name="WORKINFORM",expression="t1.WORKINFORM")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFWorkListDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFWorkListDefaultDQModelBase() {
        super();

        this.initAnnotation(WFWorkListDefaultDQModelBase.class);
    }

}