/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.orgsecuser.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="CC3A8987-87A1-4A7E-AAEA-285BB224ADDA",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEFAULTFLAG AS DEFAULTFLAG, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERID AS ORGSECUSERID, t1.ORGSECUSERNAME AS ORGSECUSERNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSER t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFAULTFLAG",expression="t1.DEFAULTFLAG")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERID",expression="t1.ORGSECUSERID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERNAME",expression="t1.ORGSECUSERNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEFAULTFLAG AS DEFAULTFLAG, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERID AS ORGSECUSERID, t1.ORGSECUSERNAME AS ORGSECUSERNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSER t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFAULTFLAG",expression="t1.DEFAULTFLAG")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERID",expression="t1.ORGSECUSERID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERNAME",expression="t1.ORGSECUSERNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEFAULTFLAG AS DEFAULTFLAG, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERID AS ORGSECUSERID, t1.ORGSECUSERNAME AS ORGSECUSERNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSER t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFAULTFLAG",expression="t1.DEFAULTFLAG")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERID",expression="t1.ORGSECUSERID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERNAME",expression="t1.ORGSECUSERNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEFAULTFLAG AS DEFAULTFLAG, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERID AS ORGSECUSERID, t1.ORGSECUSERNAME AS ORGSECUSERNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSER t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEFAULTFLAG",expression="t1.DEFAULTFLAG")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERID",expression="t1.ORGSECUSERID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERNAME",expression="t1.ORGSECUSERNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class OrgSecUserDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgSecUserDefaultDQModelBase() {
        super();

        this.initAnnotation(OrgSecUserDefaultDQModelBase.class);
    }

}