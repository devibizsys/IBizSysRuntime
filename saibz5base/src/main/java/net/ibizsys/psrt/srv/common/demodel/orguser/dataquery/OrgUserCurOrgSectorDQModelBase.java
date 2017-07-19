/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.orguser.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="F2F5158B-2435-4A40-90B9-3B5569B793AD",name="CurOrgSector")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t11.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERCODE AS USERCODE, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSER t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t11.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERCODE",expression="t1.USERCODE")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGSECTORID =  ${srfdatacontext('orgsectorid','{\"defname\":\"ORGSECTORID\",\"dename\":\"ORGUSER\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t11.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERCODE AS USERCODE, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSER t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t11.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERCODE",expression="t1.USERCODE")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGSECTORID =  ${srfdatacontext('orgsectorid','{\"defname\":\"ORGSECTORID\",\"dename\":\"ORGUSER\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t11.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERCODE AS USERCODE, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSER t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t11.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERCODE",expression="t1.USERCODE")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGSECTORID =  ${srfdatacontext('orgsectorid','{\"defname\":\"ORGSECTORID\",\"dename\":\"ORGUSER\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t11.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.ORGUSERID AS ORGUSERID, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.ORGUSERNAME AS ORGUSERNAME, t1.TITLENAME AS TITLENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERCODE AS USERCODE, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSER t1  LEFT JOIN T_SRFORGSECTOR t11 ON t1.ORGSECTORID = t11.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t11.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="ORGUSERID",expression="t1.ORGUSERID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="ORGUSERNAME",expression="t1.ORGUSERNAME")
        ,@DEDataQueryCodeExp(name="TITLENAME",expression="t1.TITLENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERCODE",expression="t1.USERCODE")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGSECTORID =  ${srfdatacontext('orgsectorid','{\"defname\":\"ORGSECTORID\",\"dename\":\"ORGUSER\"}')} )")
    })
})
/**
 *  实体数据查询 [当前部门]模型基类
 */
public abstract class OrgUserCurOrgSectorDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgUserCurOrgSectorDQModelBase() {
        super();

        this.initAnnotation(OrgUserCurOrgSectorDQModelBase.class);
    }

}