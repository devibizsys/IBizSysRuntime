/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.registry.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="18FD18E5-9F07-4F2C-B94E-D2F542AB2897",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.PARAM1 AS PARAM1, t1.PARAM2 AS PARAM2, t1.PARAM3 AS PARAM3, t1.PARAM4 AS PARAM4, t1.PARAM5 AS PARAM5, t1.PARAM6 AS PARAM6, t1.PARAM7 AS PARAM7, t1.PARAM8 AS PARAM8, t1.REGISTRYID AS REGISTRYID, t1.REGISTRYNAME AS REGISTRYNAME, t1.SECTION AS SECTION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFREGISTRY t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAM9",expression="t1.PARAM9")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM1",expression="t1.PARAM1")
        ,@DEDataQueryCodeExp(name="PARAM2",expression="t1.PARAM2")
        ,@DEDataQueryCodeExp(name="PARAM3",expression="t1.PARAM3")
        ,@DEDataQueryCodeExp(name="PARAM4",expression="t1.PARAM4")
        ,@DEDataQueryCodeExp(name="PARAM5",expression="t1.PARAM5")
        ,@DEDataQueryCodeExp(name="PARAM6",expression="t1.PARAM6")
        ,@DEDataQueryCodeExp(name="PARAM7",expression="t1.PARAM7")
        ,@DEDataQueryCodeExp(name="PARAM8",expression="t1.PARAM8")
        ,@DEDataQueryCodeExp(name="REGISTRYID",expression="t1.REGISTRYID")
        ,@DEDataQueryCodeExp(name="REGISTRYNAME",expression="t1.REGISTRYNAME")
        ,@DEDataQueryCodeExp(name="SECTION",expression="t1.SECTION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.PARAM1 AS PARAM1, t1.PARAM2 AS PARAM2, t1.PARAM3 AS PARAM3, t1.PARAM4 AS PARAM4, t1.PARAM5 AS PARAM5, t1.PARAM6 AS PARAM6, t1.PARAM7 AS PARAM7, t1.PARAM8 AS PARAM8, t1.REGISTRYID AS REGISTRYID, t1.REGISTRYNAME AS REGISTRYNAME, t1.SECTION AS SECTION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFREGISTRY t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAM9",expression="t1.PARAM9")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM1",expression="t1.PARAM1")
        ,@DEDataQueryCodeExp(name="PARAM2",expression="t1.PARAM2")
        ,@DEDataQueryCodeExp(name="PARAM3",expression="t1.PARAM3")
        ,@DEDataQueryCodeExp(name="PARAM4",expression="t1.PARAM4")
        ,@DEDataQueryCodeExp(name="PARAM5",expression="t1.PARAM5")
        ,@DEDataQueryCodeExp(name="PARAM6",expression="t1.PARAM6")
        ,@DEDataQueryCodeExp(name="PARAM7",expression="t1.PARAM7")
        ,@DEDataQueryCodeExp(name="PARAM8",expression="t1.PARAM8")
        ,@DEDataQueryCodeExp(name="REGISTRYID",expression="t1.REGISTRYID")
        ,@DEDataQueryCodeExp(name="REGISTRYNAME",expression="t1.REGISTRYNAME")
        ,@DEDataQueryCodeExp(name="SECTION",expression="t1.SECTION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.PARAM1 AS PARAM1, t1.PARAM2 AS PARAM2, t1.PARAM3 AS PARAM3, t1.PARAM4 AS PARAM4, t1.PARAM5 AS PARAM5, t1.PARAM6 AS PARAM6, t1.PARAM7 AS PARAM7, t1.PARAM8 AS PARAM8, t1.REGISTRYID AS REGISTRYID, t1.REGISTRYNAME AS REGISTRYNAME, t1.SECTION AS SECTION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFREGISTRY t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAM9",expression="t1.PARAM9")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM1",expression="t1.PARAM1")
        ,@DEDataQueryCodeExp(name="PARAM2",expression="t1.PARAM2")
        ,@DEDataQueryCodeExp(name="PARAM3",expression="t1.PARAM3")
        ,@DEDataQueryCodeExp(name="PARAM4",expression="t1.PARAM4")
        ,@DEDataQueryCodeExp(name="PARAM5",expression="t1.PARAM5")
        ,@DEDataQueryCodeExp(name="PARAM6",expression="t1.PARAM6")
        ,@DEDataQueryCodeExp(name="PARAM7",expression="t1.PARAM7")
        ,@DEDataQueryCodeExp(name="PARAM8",expression="t1.PARAM8")
        ,@DEDataQueryCodeExp(name="REGISTRYID",expression="t1.REGISTRYID")
        ,@DEDataQueryCodeExp(name="REGISTRYNAME",expression="t1.REGISTRYNAME")
        ,@DEDataQueryCodeExp(name="SECTION",expression="t1.SECTION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.PARAM1 AS PARAM1, t1.PARAM2 AS PARAM2, t1.PARAM3 AS PARAM3, t1.PARAM4 AS PARAM4, t1.PARAM5 AS PARAM5, t1.PARAM6 AS PARAM6, t1.PARAM7 AS PARAM7, t1.PARAM8 AS PARAM8, t1.REGISTRYID AS REGISTRYID, t1.REGISTRYNAME AS REGISTRYNAME, t1.SECTION AS SECTION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFREGISTRY t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="PARAM9",expression="t1.PARAM9")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="PARAM1",expression="t1.PARAM1")
        ,@DEDataQueryCodeExp(name="PARAM2",expression="t1.PARAM2")
        ,@DEDataQueryCodeExp(name="PARAM3",expression="t1.PARAM3")
        ,@DEDataQueryCodeExp(name="PARAM4",expression="t1.PARAM4")
        ,@DEDataQueryCodeExp(name="PARAM5",expression="t1.PARAM5")
        ,@DEDataQueryCodeExp(name="PARAM6",expression="t1.PARAM6")
        ,@DEDataQueryCodeExp(name="PARAM7",expression="t1.PARAM7")
        ,@DEDataQueryCodeExp(name="PARAM8",expression="t1.PARAM8")
        ,@DEDataQueryCodeExp(name="REGISTRYID",expression="t1.REGISTRYID")
        ,@DEDataQueryCodeExp(name="REGISTRYNAME",expression="t1.REGISTRYNAME")
        ,@DEDataQueryCodeExp(name="SECTION",expression="t1.SECTION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class RegistryDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public RegistryDefaultDQModelBase() {
        super();

        this.initAnnotation(RegistryDefaultDQModelBase.class);
    }

}