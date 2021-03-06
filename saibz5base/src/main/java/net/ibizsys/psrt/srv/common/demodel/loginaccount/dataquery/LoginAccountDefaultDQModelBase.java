/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.loginaccount.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="5D2DAA40-8DC0-45FC-9D72-D5BBDBF55957",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.APPUITHEME AS APPUITHEME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISENABLE AS ISENABLE, t1.LANGUAGE AS LANGUAGE, t1.LASTCHGPWDTIME AS LASTCHGPWDTIME, t1.LASTLOGINTIME AS LASTLOGINTIME, t1.LOGINACCOUNTID AS LOGINACCOUNTID, t1.LOGINACCOUNTNAME AS LOGINACCOUNTNAME, t1.ORGADMIN AS ORGADMIN, t1.PWD AS PWD, t1.SUPERUSER AS SUPERUSER, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERID AS USERID, t11.USERNAME AS USERNAME FROM T_SRFLOGINACCOUNT t1  LEFT JOIN T_SRFUSER t11 ON t1.USERID = t11.USERID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="APPUITHEME",expression="t1.APPUITHEME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISENABLE",expression="t1.ISENABLE")
        ,@DEDataQueryCodeExp(name="LANGUAGE",expression="t1.LANGUAGE")
        ,@DEDataQueryCodeExp(name="LASTCHGPWDTIME",expression="t1.LASTCHGPWDTIME")
        ,@DEDataQueryCodeExp(name="LASTLOGINTIME",expression="t1.LASTLOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="ORGADMIN",expression="t1.ORGADMIN")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SUPERUSER",expression="t1.SUPERUSER")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t11.USERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APPUITHEME AS APPUITHEME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISENABLE AS ISENABLE, t1.LANGUAGE AS LANGUAGE, t1.LASTCHGPWDTIME AS LASTCHGPWDTIME, t1.LASTLOGINTIME AS LASTLOGINTIME, t1.LOGINACCOUNTID AS LOGINACCOUNTID, t1.LOGINACCOUNTNAME AS LOGINACCOUNTNAME, t1.ORGADMIN AS ORGADMIN, t1.PWD AS PWD, t1.SUPERUSER AS SUPERUSER, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERID AS USERID, t11.USERNAME AS USERNAME FROM T_SRFLOGINACCOUNT t1  LEFT JOIN T_SRFUSER t11 ON t1.USERID = t11.USERID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="APPUITHEME",expression="t1.APPUITHEME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISENABLE",expression="t1.ISENABLE")
        ,@DEDataQueryCodeExp(name="LANGUAGE",expression="t1.LANGUAGE")
        ,@DEDataQueryCodeExp(name="LASTCHGPWDTIME",expression="t1.LASTCHGPWDTIME")
        ,@DEDataQueryCodeExp(name="LASTLOGINTIME",expression="t1.LASTLOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="ORGADMIN",expression="t1.ORGADMIN")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SUPERUSER",expression="t1.SUPERUSER")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t11.USERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APPUITHEME AS APPUITHEME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISENABLE AS ISENABLE, t1.LANGUAGE AS LANGUAGE, t1.LASTCHGPWDTIME AS LASTCHGPWDTIME, t1.LASTLOGINTIME AS LASTLOGINTIME, t1.LOGINACCOUNTID AS LOGINACCOUNTID, t1.LOGINACCOUNTNAME AS LOGINACCOUNTNAME, t1.ORGADMIN AS ORGADMIN, t1.PWD AS PWD, t1.SUPERUSER AS SUPERUSER, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERID AS USERID, t11.USERNAME AS USERNAME FROM T_SRFLOGINACCOUNT t1  LEFT JOIN T_SRFUSER t11 ON t1.USERID = t11.USERID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="APPUITHEME",expression="t1.APPUITHEME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISENABLE",expression="t1.ISENABLE")
        ,@DEDataQueryCodeExp(name="LANGUAGE",expression="t1.LANGUAGE")
        ,@DEDataQueryCodeExp(name="LASTCHGPWDTIME",expression="t1.LASTCHGPWDTIME")
        ,@DEDataQueryCodeExp(name="LASTLOGINTIME",expression="t1.LASTLOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="ORGADMIN",expression="t1.ORGADMIN")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SUPERUSER",expression="t1.SUPERUSER")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t11.USERNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.APPUITHEME AS APPUITHEME, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.ISENABLE AS ISENABLE, t1.LANGUAGE AS LANGUAGE, t1.LASTCHGPWDTIME AS LASTCHGPWDTIME, t1.LASTLOGINTIME AS LASTLOGINTIME, t1.LOGINACCOUNTID AS LOGINACCOUNTID, t1.LOGINACCOUNTNAME AS LOGINACCOUNTNAME, t1.ORGADMIN AS ORGADMIN, t1.PWD AS PWD, t1.SUPERUSER AS SUPERUSER, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.USERDATA3 AS USERDATA3, t1.USERDATA4 AS USERDATA4, t1.USERID AS USERID, t11.USERNAME AS USERNAME FROM T_SRFLOGINACCOUNT t1  LEFT JOIN T_SRFUSER t11 ON t1.USERID = t11.USERID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="APPUITHEME",expression="t1.APPUITHEME")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="ISENABLE",expression="t1.ISENABLE")
        ,@DEDataQueryCodeExp(name="LANGUAGE",expression="t1.LANGUAGE")
        ,@DEDataQueryCodeExp(name="LASTCHGPWDTIME",expression="t1.LASTCHGPWDTIME")
        ,@DEDataQueryCodeExp(name="LASTLOGINTIME",expression="t1.LASTLOGINTIME")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTID",expression="t1.LOGINACCOUNTID")
        ,@DEDataQueryCodeExp(name="LOGINACCOUNTNAME",expression="t1.LOGINACCOUNTNAME")
        ,@DEDataQueryCodeExp(name="ORGADMIN",expression="t1.ORGADMIN")
        ,@DEDataQueryCodeExp(name="PWD",expression="t1.PWD")
        ,@DEDataQueryCodeExp(name="SUPERUSER",expression="t1.SUPERUSER")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="USERDATA3",expression="t1.USERDATA3")
        ,@DEDataQueryCodeExp(name="USERDATA4",expression="t1.USERDATA4")
        ,@DEDataQueryCodeExp(name="USERID",expression="t1.USERID")
        ,@DEDataQueryCodeExp(name="USERNAME",expression="t11.USERNAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class LoginAccountDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public LoginAccountDefaultDQModelBase() {
        super();

        this.initAnnotation(LoginAccountDefaultDQModelBase.class);
    }

}