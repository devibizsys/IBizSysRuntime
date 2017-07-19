/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.userroledata.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="9C190E15-614B-4F36-AB8B-B41D84F7F3D4",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.BCDR AS BCDR, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.DSTORGID AS DSTORGID, t21.ORGNAME AS DSTORGNAME, t1.DSTORGSECTORID AS DSTORGSECTORID, t31.ORGSECTORNAME AS DSTORGSECTORNAME, t1.DSTSECBC AS DSTSECBC, t1.ISALLDATA AS ISALLDATA, t1.MEMO AS MEMO, t1.ORGDR AS ORGDR, t1.SECDR AS SECDR, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UDVERSION AS UDVERSION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDR AS USERDR, t1.USERROLEDATAID AS USERROLEDATAID, t1.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATA t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID  LEFT JOIN T_SRFORG t21 ON t1.DSTORGID = t21.ORGID  LEFT JOIN T_SRFORGSECTOR t31 ON t1.DSTORGSECTORID = t31.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="BCDR",expression="t1.BCDR")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="DSTORGID",expression="t1.DSTORGID")
        ,@DEDataQueryCodeExp(name="DSTORGNAME",expression="t21.ORGNAME")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORID",expression="t1.DSTORGSECTORID")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORNAME",expression="t31.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="DSTSECBC",expression="t1.DSTSECBC")
        ,@DEDataQueryCodeExp(name="ISALLDATA",expression="t1.ISALLDATA")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGDR",expression="t1.ORGDR")
        ,@DEDataQueryCodeExp(name="SECDR",expression="t1.SECDR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UDVERSION",expression="t1.UDVERSION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDR",expression="t1.USERDR")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t1.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.BCDR AS BCDR, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.DSTORGID AS DSTORGID, t21.ORGNAME AS DSTORGNAME, t1.DSTORGSECTORID AS DSTORGSECTORID, t31.ORGSECTORNAME AS DSTORGSECTORNAME, t1.DSTSECBC AS DSTSECBC, t1.ISALLDATA AS ISALLDATA, t1.MEMO AS MEMO, t1.ORGDR AS ORGDR, t1.SECDR AS SECDR, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UDVERSION AS UDVERSION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDR AS USERDR, t1.USERROLEDATAID AS USERROLEDATAID, t1.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATA t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID  LEFT JOIN T_SRFORG t21 ON t1.DSTORGID = t21.ORGID  LEFT JOIN T_SRFORGSECTOR t31 ON t1.DSTORGSECTORID = t31.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="BCDR",expression="t1.BCDR")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="DSTORGID",expression="t1.DSTORGID")
        ,@DEDataQueryCodeExp(name="DSTORGNAME",expression="t21.ORGNAME")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORID",expression="t1.DSTORGSECTORID")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORNAME",expression="t31.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="DSTSECBC",expression="t1.DSTSECBC")
        ,@DEDataQueryCodeExp(name="ISALLDATA",expression="t1.ISALLDATA")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGDR",expression="t1.ORGDR")
        ,@DEDataQueryCodeExp(name="SECDR",expression="t1.SECDR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UDVERSION",expression="t1.UDVERSION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDR",expression="t1.USERDR")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t1.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.BCDR AS BCDR, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.DSTORGID AS DSTORGID, t21.ORGNAME AS DSTORGNAME, t1.DSTORGSECTORID AS DSTORGSECTORID, t31.ORGSECTORNAME AS DSTORGSECTORNAME, t1.DSTSECBC AS DSTSECBC, t1.ISALLDATA AS ISALLDATA, t1.MEMO AS MEMO, t1.ORGDR AS ORGDR, t1.SECDR AS SECDR, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UDVERSION AS UDVERSION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDR AS USERDR, t1.USERROLEDATAID AS USERROLEDATAID, t1.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATA t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID  LEFT JOIN T_SRFORG t21 ON t1.DSTORGID = t21.ORGID  LEFT JOIN T_SRFORGSECTOR t31 ON t1.DSTORGSECTORID = t31.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="BCDR",expression="t1.BCDR")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="DSTORGID",expression="t1.DSTORGID")
        ,@DEDataQueryCodeExp(name="DSTORGNAME",expression="t21.ORGNAME")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORID",expression="t1.DSTORGSECTORID")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORNAME",expression="t31.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="DSTSECBC",expression="t1.DSTSECBC")
        ,@DEDataQueryCodeExp(name="ISALLDATA",expression="t1.ISALLDATA")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGDR",expression="t1.ORGDR")
        ,@DEDataQueryCodeExp(name="SECDR",expression="t1.SECDR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UDVERSION",expression="t1.UDVERSION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDR",expression="t1.USERDR")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t1.USERROLEDATANAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.BCDR AS BCDR, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DEID AS DEID, t11.DENAME AS DENAME, t1.DSTORGID AS DSTORGID, t21.ORGNAME AS DSTORGNAME, t1.DSTORGSECTORID AS DSTORGSECTORID, t31.ORGSECTORNAME AS DSTORGSECTORNAME, t1.DSTSECBC AS DSTSECBC, t1.ISALLDATA AS ISALLDATA, t1.MEMO AS MEMO, t1.ORGDR AS ORGDR, t1.SECDR AS SECDR, t1.SRFSYSPUB AS SRFSYSPUB, t1.SRFUSERPUB AS SRFUSERPUB, t1.UDVERSION AS UDVERSION, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDR AS USERDR, t1.USERROLEDATAID AS USERROLEDATAID, t1.USERROLEDATANAME AS USERROLEDATANAME FROM T_SRFUSERROLEDATA t1  LEFT JOIN t_srfdataentity t11 ON t1.DEID = t11.DEID  LEFT JOIN T_SRFORG t21 ON t1.DSTORGID = t21.ORGID  LEFT JOIN T_SRFORGSECTOR t31 ON t1.DSTORGSECTORID = t31.ORGSECTORID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="BCDR",expression="t1.BCDR")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t11.DENAME")
        ,@DEDataQueryCodeExp(name="DSTORGID",expression="t1.DSTORGID")
        ,@DEDataQueryCodeExp(name="DSTORGNAME",expression="t21.ORGNAME")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORID",expression="t1.DSTORGSECTORID")
        ,@DEDataQueryCodeExp(name="DSTORGSECTORNAME",expression="t31.ORGSECTORNAME")
        ,@DEDataQueryCodeExp(name="DSTSECBC",expression="t1.DSTSECBC")
        ,@DEDataQueryCodeExp(name="ISALLDATA",expression="t1.ISALLDATA")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="ORGDR",expression="t1.ORGDR")
        ,@DEDataQueryCodeExp(name="SECDR",expression="t1.SECDR")
        ,@DEDataQueryCodeExp(name="SRFSYSPUB",expression="t1.SRFSYSPUB")
        ,@DEDataQueryCodeExp(name="SRFUSERPUB",expression="t1.SRFUSERPUB")
        ,@DEDataQueryCodeExp(name="UDVERSION",expression="t1.UDVERSION")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDR",expression="t1.USERDR")
        ,@DEDataQueryCodeExp(name="USERROLEDATAID",expression="t1.USERROLEDATAID")
        ,@DEDataQueryCodeExp(name="USERROLEDATANAME",expression="t1.USERROLEDATANAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class UserRoleDataDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public UserRoleDataDefaultDQModelBase() {
        super();

        this.initAnnotation(UserRoleDataDefaultDQModelBase.class);
    }

}