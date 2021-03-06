/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.unires.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="92E66630-E3B4-4E37-90D3-3F46C1E35936",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESOURCEID AS RESOURCEID, t1.UNIRESID AS UNIRESID, t1.UNIRESNAME AS UNIRESNAME, t1.UNIRESTYPE AS UNIRESTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFUNIRES t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESOURCEID",expression="t1.RESOURCEID")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t1.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t1.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESOURCEID AS RESOURCEID, t1.UNIRESID AS UNIRESID, t1.UNIRESNAME AS UNIRESNAME, t1.UNIRESTYPE AS UNIRESTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFUNIRES t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESOURCEID",expression="t1.RESOURCEID")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t1.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t1.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESOURCEID AS RESOURCEID, t1.UNIRESID AS UNIRESID, t1.UNIRESNAME AS UNIRESNAME, t1.UNIRESTYPE AS UNIRESTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFUNIRES t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESOURCEID",expression="t1.RESOURCEID")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t1.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t1.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.RESOURCEID AS RESOURCEID, t1.UNIRESID AS UNIRESID, t1.UNIRESNAME AS UNIRESNAME, t1.UNIRESTYPE AS UNIRESTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN FROM T_SRFUNIRES t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="RESOURCEID",expression="t1.RESOURCEID")
        ,@DEDataQueryCodeExp(name="UNIRESID",expression="t1.UNIRESID")
        ,@DEDataQueryCodeExp(name="UNIRESNAME",expression="t1.UNIRESNAME")
        ,@DEDataQueryCodeExp(name="UNIRESTYPE",expression="t1.UNIRESTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UniResDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UniResDefaultDQModelBase() {
        super();

        this.initAnnotation(UniResDefaultDQModelBase.class);
    }

}