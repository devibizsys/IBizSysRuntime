/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.tssdengine.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="5FC72289-4F52-43EE-AB72-855389DF00CD",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENGINEOBJECT AS ENGINEOBJECT, t1.TSSDENGINEID AS TSSDENGINEID, t1.TSSDENGINENAME AS TSSDENGINENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDENGINE t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ENGINEPARAM",expression="t1.ENGINEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.ENGINEOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t1.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENGINEOBJECT AS ENGINEOBJECT, t1.TSSDENGINEID AS TSSDENGINEID, t1.TSSDENGINENAME AS TSSDENGINENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDENGINE t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ENGINEPARAM",expression="t1.ENGINEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.ENGINEOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t1.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENGINEOBJECT AS ENGINEOBJECT, t1.TSSDENGINEID AS TSSDENGINEID, t1.TSSDENGINENAME AS TSSDENGINENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDENGINE t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ENGINEPARAM",expression="t1.ENGINEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.ENGINEOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t1.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ENGINEOBJECT AS ENGINEOBJECT, t1.TSSDENGINEID AS TSSDENGINEID, t1.TSSDENGINENAME AS TSSDENGINENAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFTSSDENGINE t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ENGINEPARAM",expression="t1.ENGINEPARAM")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ENGINEOBJECT",expression="t1.ENGINEOBJECT")
        ,@DEDataQueryCodeExp(name="TSSDENGINEID",expression="t1.TSSDENGINEID")
        ,@DEDataQueryCodeExp(name="TSSDENGINENAME",expression="t1.TSSDENGINENAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class TSSDEngineDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public TSSDEngineDefaultDQModelBase() {
        super();

        this.initAnnotation(TSSDEngineDefaultDQModelBase.class);
    }

}