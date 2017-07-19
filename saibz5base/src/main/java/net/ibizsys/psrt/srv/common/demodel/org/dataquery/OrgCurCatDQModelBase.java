/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.org.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="55EDF036-7AC4-4A3C-99DF-7E33B2A7B0A9",name="CurCat")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.PORGID AS PORGID, t11.ORGNAME AS PORGNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2 FROM T_SRFORG t1  LEFT JOIN T_SRFORG t11 ON t1.PORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="PORGID",expression="t1.PORGID")
        ,@DEDataQueryCodeExp(name="PORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('nodeid','{\"defname\":\"ORGID\",\"dename\":\"ORG\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.PORGID AS PORGID, t11.ORGNAME AS PORGNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2 FROM T_SRFORG t1  LEFT JOIN T_SRFORG t11 ON t1.PORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="PORGID",expression="t1.PORGID")
        ,@DEDataQueryCodeExp(name="PORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('nodeid','{\"defname\":\"ORGID\",\"dename\":\"ORG\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.PORGID AS PORGID, t11.ORGNAME AS PORGNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2 FROM T_SRFORG t1  LEFT JOIN T_SRFORG t11 ON t1.PORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="PORGID",expression="t1.PORGID")
        ,@DEDataQueryCodeExp(name="PORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('nodeid','{\"defname\":\"ORGID\",\"dename\":\"ORG\"}')} )")
    }),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORGCODE AS ORGCODE, t1.ORGID AS ORGID, t1.ORGNAME AS ORGNAME, t1.PORGID AS PORGID, t11.ORGNAME AS PORGNAME, t1.SHORTNAME AS SHORTNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2 FROM T_SRFORG t1  LEFT JOIN T_SRFORG t11 ON t1.PORGID = t11.ORGID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGCODE",expression="t1.ORGCODE")
        ,@DEDataQueryCodeExp(name="ORGID",expression="t1.ORGID")
        ,@DEDataQueryCodeExp(name="ORGNAME",expression="t1.ORGNAME")
        ,@DEDataQueryCodeExp(name="PORGID",expression="t1.PORGID")
        ,@DEDataQueryCodeExp(name="PORGNAME",expression="t11.ORGNAME")
        ,@DEDataQueryCodeExp(name="SHORTNAME",expression="t1.SHORTNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
    },
    conds={
        @DEDataQueryCodeCond(condition="( t1.ORGID =  ${srfdatacontext('nodeid','{\"defname\":\"ORGID\",\"dename\":\"ORG\"}')} )")
    })
})
/**
 *  实体数据查询 [当前分类组织]模型基类
 */
public abstract class OrgCurCatDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgCurCatDQModelBase() {
        super();

        this.initAnnotation(OrgCurCatDQModelBase.class);
    }

}