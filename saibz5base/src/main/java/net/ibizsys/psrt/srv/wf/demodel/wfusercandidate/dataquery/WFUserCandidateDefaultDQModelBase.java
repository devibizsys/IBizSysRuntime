/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.demodel.wfusercandidate.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="DAEA0DFB-06AD-4D74-BF65-A7D8780794F1",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.CANDIDATEORDER AS CANDIDATEORDER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.WFMAJORUSERID AS WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID AS WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFUSERCANDIDATEID AS WFUSERCANDIDATEID, t1.WFUSERCANDIDATENAME AS WFUSERCANDIDATENAME FROM T_SRFWFUSERCANDIDATE t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="CANDIDATEORDER",expression="t1.CANDIDATEORDER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATEID",expression="t1.WFUSERCANDIDATEID")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATENAME",expression="t1.WFUSERCANDIDATENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CANDIDATEORDER AS CANDIDATEORDER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.WFMAJORUSERID AS WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID AS WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFUSERCANDIDATEID AS WFUSERCANDIDATEID, t1.WFUSERCANDIDATENAME AS WFUSERCANDIDATENAME FROM T_SRFWFUSERCANDIDATE t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="CANDIDATEORDER",expression="t1.CANDIDATEORDER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATEID",expression="t1.WFUSERCANDIDATEID")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATENAME",expression="t1.WFUSERCANDIDATENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CANDIDATEORDER AS CANDIDATEORDER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.WFMAJORUSERID AS WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID AS WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFUSERCANDIDATEID AS WFUSERCANDIDATEID, t1.WFUSERCANDIDATENAME AS WFUSERCANDIDATENAME FROM T_SRFWFUSERCANDIDATE t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="CANDIDATEORDER",expression="t1.CANDIDATEORDER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATEID",expression="t1.WFUSERCANDIDATEID")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATENAME",expression="t1.WFUSERCANDIDATENAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.CANDIDATEORDER AS CANDIDATEORDER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.MEMO AS MEMO, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERDATA AS USERDATA, t1.USERDATA2 AS USERDATA2, t1.WFMAJORUSERID AS WFMAJORUSERID, t11.WFUSERNAME AS WFMAJORUSERNAME, t1.WFMINORUSERID AS WFMINORUSERID, t21.WFUSERNAME AS WFMINORUSERNAME, t1.WFUSERCANDIDATEID AS WFUSERCANDIDATEID, t1.WFUSERCANDIDATENAME AS WFUSERCANDIDATENAME FROM T_SRFWFUSERCANDIDATE t1  LEFT JOIN T_SRFWFUSER t11 ON t1.WFMAJORUSERID = t11.WFUSERID  LEFT JOIN T_SRFWFUSER t21 ON t1.WFMINORUSERID = t21.WFUSERID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="CANDIDATEORDER",expression="t1.CANDIDATEORDER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERDATA",expression="t1.USERDATA")
        ,@DEDataQueryCodeExp(name="USERDATA2",expression="t1.USERDATA2")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERID",expression="t1.WFMAJORUSERID")
        ,@DEDataQueryCodeExp(name="WFMAJORUSERNAME",expression="t11.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFMINORUSERID",expression="t1.WFMINORUSERID")
        ,@DEDataQueryCodeExp(name="WFMINORUSERNAME",expression="t21.WFUSERNAME")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATEID",expression="t1.WFUSERCANDIDATEID")
        ,@DEDataQueryCodeExp(name="WFUSERCANDIDATENAME",expression="t1.WFUSERCANDIDATENAME")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class WFUserCandidateDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public WFUserCandidateDefaultDQModelBase() {
        super();

        this.initAnnotation(WFUserCandidateDefaultDQModelBase.class);
    }

}