/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfiaaction.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="8D5194BA-3765-4525-9028-CD93DBFB2DD0",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCOUNT AS ACTIONCOUNT, t1.ACTIONLOGICNAME AS ACTIONLOGICNAME, t1.ACTIONNAME AS ACTIONNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.FAHELPER AS FAHELPER, t1.NEXTCONDITION AS NEXTCONDITION, t1.NEXTTO AS NEXTTO, t1.ORDERFLAG AS ORDERFLAG, t1.PAGEPATH AS PAGEPATH, t1.PANELID AS PANELID, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFIAACTIONID AS WFIAACTIONID, t1.WFIAACTIONNAME AS WFIAACTIONNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME FROM T_SRFWFIAACTION t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ACTIONCOUNT",expression="t1.ACTIONCOUNT")
        ,@DEDataQueryCodeExp(name="ACTIONLOGICNAME",expression="t1.ACTIONLOGICNAME")
        ,@DEDataQueryCodeExp(name="ACTIONNAME",expression="t1.ACTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FAHELPER",expression="t1.FAHELPER")
        ,@DEDataQueryCodeExp(name="NEXTCONDITION",expression="t1.NEXTCONDITION")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.ORDERFLAG")
        ,@DEDataQueryCodeExp(name="PAGEPATH",expression="t1.PAGEPATH")
        ,@DEDataQueryCodeExp(name="PANELID",expression="t1.PANELID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFIAACTIONID",expression="t1.WFIAACTIONID")
        ,@DEDataQueryCodeExp(name="WFIAACTIONNAME",expression="t1.WFIAACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCOUNT AS ACTIONCOUNT, t1.ACTIONLOGICNAME AS ACTIONLOGICNAME, t1.ACTIONNAME AS ACTIONNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.FAHELPER AS FAHELPER, t1.NEXTCONDITION AS NEXTCONDITION, t1.NEXTTO AS NEXTTO, t1.ORDERFLAG AS ORDERFLAG, t1.PAGEPATH AS PAGEPATH, t1.PANELID AS PANELID, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFIAACTIONID AS WFIAACTIONID, t1.WFIAACTIONNAME AS WFIAACTIONNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME FROM T_SRFWFIAACTION t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ACTIONCOUNT",expression="t1.ACTIONCOUNT")
        ,@DEDataQueryCodeExp(name="ACTIONLOGICNAME",expression="t1.ACTIONLOGICNAME")
        ,@DEDataQueryCodeExp(name="ACTIONNAME",expression="t1.ACTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FAHELPER",expression="t1.FAHELPER")
        ,@DEDataQueryCodeExp(name="NEXTCONDITION",expression="t1.NEXTCONDITION")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.ORDERFLAG")
        ,@DEDataQueryCodeExp(name="PAGEPATH",expression="t1.PAGEPATH")
        ,@DEDataQueryCodeExp(name="PANELID",expression="t1.PANELID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFIAACTIONID",expression="t1.WFIAACTIONID")
        ,@DEDataQueryCodeExp(name="WFIAACTIONNAME",expression="t1.WFIAACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCOUNT AS ACTIONCOUNT, t1.ACTIONLOGICNAME AS ACTIONLOGICNAME, t1.ACTIONNAME AS ACTIONNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.FAHELPER AS FAHELPER, t1.NEXTCONDITION AS NEXTCONDITION, t1.NEXTTO AS NEXTTO, t1.ORDERFLAG AS ORDERFLAG, t1.PAGEPATH AS PAGEPATH, t1.PANELID AS PANELID, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFIAACTIONID AS WFIAACTIONID, t1.WFIAACTIONNAME AS WFIAACTIONNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME FROM T_SRFWFIAACTION t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ACTIONCOUNT",expression="t1.ACTIONCOUNT")
        ,@DEDataQueryCodeExp(name="ACTIONLOGICNAME",expression="t1.ACTIONLOGICNAME")
        ,@DEDataQueryCodeExp(name="ACTIONNAME",expression="t1.ACTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FAHELPER",expression="t1.FAHELPER")
        ,@DEDataQueryCodeExp(name="NEXTCONDITION",expression="t1.NEXTCONDITION")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.ORDERFLAG")
        ,@DEDataQueryCodeExp(name="PAGEPATH",expression="t1.PAGEPATH")
        ,@DEDataQueryCodeExp(name="PANELID",expression="t1.PANELID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFIAACTIONID",expression="t1.WFIAACTIONID")
        ,@DEDataQueryCodeExp(name="WFIAACTIONNAME",expression="t1.WFIAACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACTIONCOUNT AS ACTIONCOUNT, t1.ACTIONLOGICNAME AS ACTIONLOGICNAME, t1.ACTIONNAME AS ACTIONNAME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.FAHELPER AS FAHELPER, t1.NEXTCONDITION AS NEXTCONDITION, t1.NEXTTO AS NEXTTO, t1.ORDERFLAG AS ORDERFLAG, t1.PAGEPATH AS PAGEPATH, t1.PANELID AS PANELID, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.WFIAACTIONID AS WFIAACTIONID, t1.WFIAACTIONNAME AS WFIAACTIONNAME, t1.WFSTEPID AS WFSTEPID, t1.WFSTEPNAME AS WFSTEPNAME FROM T_SRFWFIAACTION t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ACTIONCOUNT",expression="t1.ACTIONCOUNT")
        ,@DEDataQueryCodeExp(name="ACTIONLOGICNAME",expression="t1.ACTIONLOGICNAME")
        ,@DEDataQueryCodeExp(name="ACTIONNAME",expression="t1.ACTIONNAME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="FAHELPER",expression="t1.FAHELPER")
        ,@DEDataQueryCodeExp(name="NEXTCONDITION",expression="t1.NEXTCONDITION")
        ,@DEDataQueryCodeExp(name="NEXTTO",expression="t1.NEXTTO")
        ,@DEDataQueryCodeExp(name="ORDERFLAG",expression="t1.ORDERFLAG")
        ,@DEDataQueryCodeExp(name="PAGEPATH",expression="t1.PAGEPATH")
        ,@DEDataQueryCodeExp(name="PANELID",expression="t1.PANELID")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="WFIAACTIONID",expression="t1.WFIAACTIONID")
        ,@DEDataQueryCodeExp(name="WFIAACTIONNAME",expression="t1.WFIAACTIONNAME")
        ,@DEDataQueryCodeExp(name="WFSTEPID",expression="t1.WFSTEPID")
        ,@DEDataQueryCodeExp(name="WFSTEPNAME",expression="t1.WFSTEPNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFIAActionDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFIAActionDefaultDQModelBase() {
        super();

        this.initAnnotation(WFIAActionDefaultDQModelBase.class);
    }

}