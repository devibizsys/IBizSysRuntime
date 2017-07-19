/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userdict.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="5FD03BE2-5AFA-4929-A01E-D63C3A76E241",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDICTID AS USERDICTID, t1.USERDICTNAME AS USERDICTNAME FROM T_SRFUSERDICT t1 ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t1.USERDICTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDICTID AS USERDICTID, t1.USERDICTNAME AS USERDICTNAME FROM T_SRFUSERDICT t1 ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t1.USERDICTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDICTID AS USERDICTID, t1.USERDICTNAME AS USERDICTNAME FROM T_SRFUSERDICT t1 ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t1.USERDICTNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.OWNERID AS OWNERID, t1.OWNERTYPE AS OWNERTYPE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDICTID AS USERDICTID, t1.USERDICTNAME AS USERDICTNAME FROM T_SRFUSERDICT t1 ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="OWNERID",expression="t1.OWNERID")
        ,@DEDataQueryCodeExp(name="OWNERTYPE",expression="t1.OWNERTYPE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDICTID",expression="t1.USERDICTID")
        ,@DEDataQueryCodeExp(name="USERDICTNAME",expression="t1.USERDICTNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserDictDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserDictDefaultDQModelBase() {
        super();

        this.initAnnotation(UserDictDefaultDQModelBase.class);
    }

}