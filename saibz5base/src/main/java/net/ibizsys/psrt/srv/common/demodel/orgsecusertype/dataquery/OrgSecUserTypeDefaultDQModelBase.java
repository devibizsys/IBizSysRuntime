/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.orgsecusertype.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="C8D55807-6E69-4A41-A3A6-0C316E2AE8DC",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.TYPECODE AS TYPECODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSERTYPE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="TYPECODE",expression="t1.TYPECODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.TYPECODE AS TYPECODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSERTYPE t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="TYPECODE",expression="t1.TYPECODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.TYPECODE AS TYPECODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSERTYPE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="TYPECODE",expression="t1.TYPECODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGSECUSERTYPEID AS ORGSECUSERTYPEID, t1.ORGSECUSERTYPENAME AS ORGSECUSERTYPENAME, t1.TYPECODE AS TYPECODE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGSECUSERTYPE t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPEID",expression="t1.ORGSECUSERTYPEID")
        ,@DEDataQueryCodeExp(name="ORGSECUSERTYPENAME",expression="t1.ORGSECUSERTYPENAME")
        ,@DEDataQueryCodeExp(name="TYPECODE",expression="t1.TYPECODE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class OrgSecUserTypeDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgSecUserTypeDefaultDQModelBase() {
        super();

        this.initAnnotation(OrgSecUserTypeDefaultDQModelBase.class);
    }

}