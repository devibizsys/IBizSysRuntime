/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.orgsector.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="D0497225-1A76-456E-B856-BA3EE26806FA",name="CurOrg")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.PORGSECTORID AS PORGSECTORID, t1.PORGSECTORNAME AS PORGSECTORNAME, t1.REPORGSECTORID AS REPORGSECTORID, t1.REPORGSECTORNAME AS REPORGSECTORNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG, t1.VIRTUALFLAG AS VIRTUALFLAG FROM T_SRFORGSECTOR t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t1.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="PORGSECTORID",expression="t1.PORGSECTORID")
        ,@DEDataQueryCodeExp(name="PORGSECTORNAME",expression="t1.PORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="REPORGSECTORID",expression="t1.REPORGSECTORID")
        ,@DEDataQueryCodeExp(name="REPORGSECTORNAME",expression="t1.REPORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="VIRTUALFLAG",expression="t1.VIRTUALFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('orgid','{\"defname\":\"ORGID\",\"dename\":\"ORGSECTOR\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.PORGSECTORID AS PORGSECTORID, t1.PORGSECTORNAME AS PORGSECTORNAME, t1.REPORGSECTORID AS REPORGSECTORID, t1.REPORGSECTORNAME AS REPORGSECTORNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG, t1.VIRTUALFLAG AS VIRTUALFLAG FROM T_SRFORGSECTOR t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t1.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="PORGSECTORID",expression="t1.PORGSECTORID")
        ,@DEDataQueryCodeExp(name="PORGSECTORNAME",expression="t1.PORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="REPORGSECTORID",expression="t1.REPORGSECTORID")
        ,@DEDataQueryCodeExp(name="REPORGSECTORNAME",expression="t1.REPORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="VIRTUALFLAG",expression="t1.VIRTUALFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('orgid','{\"defname\":\"ORGID\",\"dename\":\"ORGSECTOR\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.PORGSECTORID AS PORGSECTORID, t1.PORGSECTORNAME AS PORGSECTORNAME, t1.REPORGSECTORID AS REPORGSECTORID, t1.REPORGSECTORNAME AS REPORGSECTORNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG, t1.VIRTUALFLAG AS VIRTUALFLAG FROM T_SRFORGSECTOR t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t1.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="PORGSECTORID",expression="t1.PORGSECTORID")
        ,@DEDataQueryCodeExp(name="PORGSECTORNAME",expression="t1.PORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="REPORGSECTORID",expression="t1.REPORGSECTORID")
        ,@DEDataQueryCodeExp(name="REPORGSECTORNAME",expression="t1.REPORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="VIRTUALFLAG",expression="t1.VIRTUALFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('orgid','{\"defname\":\"ORGID\",\"dename\":\"ORGSECTOR\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.BIZCODE AS BIZCODE, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.ORGSECTORID AS ORGSECTORID, t1.ORGSECTORNAME AS ORGSECTORNAME, t1.PORGSECTORID AS PORGSECTORID, t1.PORGSECTORNAME AS PORGSECTORNAME, t1.REPORGSECTORID AS REPORGSECTORID, t1.REPORGSECTORNAME AS REPORGSECTORNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.VALIDFLAG AS VALIDFLAG, t1.VIRTUALFLAG AS VIRTUALFLAG FROM T_SRFORGSECTOR t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="BIZCODE",expression="t1.BIZCODE")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="ORGSECTORID",expression="t1.ORGSECTORID")
        ,@DEDataQueryCodeExp(name="ORGSECTORNAME",expression="t1.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="PORGSECTORID",expression="t1.PORGSECTORID")
        ,@DEDataQueryCodeExp(name="PORGSECTORNAME",expression="t1.PORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="REPORGSECTORID",expression="t1.REPORGSECTORID")
        ,@DEDataQueryCodeExp(name="REPORGSECTORNAME",expression="t1.REPORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="VIRTUALFLAG",expression="t1.VIRTUALFLAG")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('orgid','{\"defname\":\"ORGID\",\"dename\":\"ORGSECTOR\"}')} )")
    })
})
/**
 *  实体数据查询 [当前组织部门]模型基类
 */
public abstract class OrgSectorCurOrgDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgSectorCurOrgDQModelBase() {
        super();

        this.initAnnotation(OrgSectorCurOrgDQModelBase.class);
    }

}