/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.orguserlevel.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="9EEB916C-70EB-4590-B9EA-236FAF5B5694",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSERLEVEL t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSERLEVEL t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSERLEVEL t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.LEVELCODE AS LEVELCODE, t1.MEMO AS MEMO, t1.ORDERVALUE AS ORDERVALUE, t1.ORGUSERLEVELID AS ORGUSERLEVELID, t1.ORGUSERLEVELNAME AS ORGUSERLEVELNAME, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.VALIDFLAG AS VALIDFLAG FROM T_SRFORGUSERLEVEL t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="LEVELCODE",expression="t1.LEVELCODE")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORDERVALUE",expression="t1.ORDERVALUE")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELID",expression="t1.ORGUSERLEVELID")
        ,@DEDataQueryCodeExp(name="ORGUSERLEVELNAME",expression="t1.ORGUSERLEVELNAME")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class OrgUserLevelDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public OrgUserLevelDefaultDQModelBase() {
        super();

        this.initAnnotation(OrgUserLevelDefaultDQModelBase.class);
    }

}