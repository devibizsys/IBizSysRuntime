/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.demodel.demodel.dataentity.dataquery;



import net.ibizsys.paas.core.DEDataQuery;
import net.ibizsys.paas.core.DEDataQueryCodes;
import net.ibizsys.paas.core.DEDataQueryCode;
import net.ibizsys.paas.core.DEDataQueryCodeExp;
import net.ibizsys.paas.core.DEDataQueryCodeCond;

@DEDataQuery(id="85EB2DA6-F398-48D0-9F15-F21BFBDEBEE4",name="DEFAULT")
@DEDataQueryCodes({
    @DEDataQueryCode(querycode="SELECT t1.`ACENABLEDP` AS `ACENABLEDP`, t1.`ACINFOFORMAT` AS `ACINFOFORMAT`, t1.`ACINFOPARAM` AS `ACINFOPARAM`, t1.`ACMAXCNT` AS `ACMAXCNT`, t1.`ACOBJECT` AS `ACOBJECT`, t1.`ACQUERYMODELID` AS `ACQUERYMODELID`, t11.`QUERYMODELNAME` AS `ACQUERYMODELNAME`, t1.`ACSORTDIR` AS `ACSORTDIR`, t1.`ACSORTFIELD` AS `ACSORTFIELD`, t1.`BIGICON` AS `BIGICON`, t1.`CONFIGHELPER` AS `CONFIGHELPER`, t1.`CREATEDATE` AS `CREATEDATE`, t1.`CREATEMAN` AS `CREATEMAN`, t1.`DATAACCOBJECT` AS `DATAACCOBJECT`, t1.`DATACHGLOGMODE` AS `DATACHGLOGMODE`, t1.`DATACTRLINT` AS `DATACTRLINT`, t1.`DATACTRLOBJECT` AS `DATACTRLOBJECT`, t1.`DATANOTIFYHELPER` AS `DATANOTIFYHELPER`, t1.`DBSTORAGE` AS `DBSTORAGE`, t1.`DBVERSION` AS `DBVERSION`, t1.`DEGROUP` AS `DEGROUP`, t1.`DEHELPER` AS `DEHELPER`, t1.`DEID` AS `DEID`, t1.`DELOGICNAME` AS `DELOGICNAME`, t1.`DENAME` AS `DENAME`, t1.`DEOBJECT` AS `DEOBJECT`, t1.`DEORDER` AS `DEORDER`, t1.`DER11DEID` AS `DER11DEID`, t21.`DENAME` AS `DER11DENAME`, t1.`DETYPE` AS `DETYPE`, t1.`DEVERSION` AS `DEVERSION`, t1.`DGROWCLASSHELPER` AS `DGROWCLASSHELPER`, t1.`DGSUMMARYHEIGHT` AS `DGSUMMARYHEIGHT`, t1.`DLKHELPER` AS `DLKHELPER`, t1.`DYNAMICINTERVAL` AS `DYNAMICINTERVAL`, t1.`ENABLECOLPRIV` AS `ENABLECOLPRIV`, t1.`ENABLEGLOBALMODEL` AS `ENABLEGLOBALMODEL`, t1.`EXITINGMODEL` AS `EXITINGMODEL`, t1.`EXPORTINCEMPTY` AS `EXPORTINCEMPTY`, t1.`EXTABLENAME` AS `EXTABLENAME`, t1.`GLOBALMODELOBJ` AS `GLOBALMODELOBJ`, t1.`INDEXMODE` AS `INDEXMODE`, t1.`INFOFIELD` AS `INFOFIELD`, t1.`INFOFORMAT` AS `INFOFORMAT`, t1.`INHERITMODE` AS `INHERITMODE`, t1.`ISDGROWEDIT` AS `ISDGROWEDIT`, t1.`ISENABLEAUDIT` AS `ISENABLEAUDIT`, t1.`ISENABLEDP` AS `ISENABLEDP`, t1.`ISINDEXDE` AS `ISINDEXDE`, t1.`ISLOGICVALID` AS `ISLOGICVALID`, t1.`ISMULTIPRINT` AS `ISMULTIPRINT`, t1.`ISSUPPORTFA` AS `ISSUPPORTFA`, t1.`ISSYSTEM` AS `ISSYSTEM`, t1.`KEYPARAMS` AS `KEYPARAMS`, t1.`LICENSECODE` AS `LICENSECODE`, t1.`LOGAUDITDETAIL` AS `LOGAUDITDETAIL`, t1.`MINORFIELDNAME` AS `MINORFIELDNAME`, t1.`MINORFIELDVALUE` AS `MINORFIELDVALUE`, t1.`MINORTABLENAME` AS `MINORTABLENAME`, t1.`MULTIMAJOR` AS `MULTIMAJOR`, t1.`NODATAINFO` AS `NODATAINFO`, t1.`PRINTFUNC` AS `PRINTFUNC`, t1.`RESERVER` AS `RESERVER`, t1.`RESERVER2` AS `RESERVER2`, t1.`ROWAMOUNT` AS `ROWAMOUNT`, 1 AS `RTINFO`, t1.`SMALLICON` AS `SMALLICON`, t1.`STORAGETYPE` AS `STORAGETYPE`, t1.`TABLENAME` AS `TABLENAME`, t1.`TABLESPACE` AS `TABLESPACE`, t1.`UPDATEDATE` AS `UPDATEDATE`, t1.`UPDATEMAN` AS `UPDATEMAN`, t1.`USERACTION` AS `USERACTION`, t1.`VALIDFLAG` AS `VALIDFLAG`, t1.`VCFLAG` AS `VCFLAG`, t1.`VERCHECKTIMER` AS `VERCHECKTIMER`, t1.`VERFIELD` AS `VERFIELD`, t1.`VERHELPER` AS `VERHELPER`, t1.`VERSIONCHECK` AS `VERSIONCHECK`, t1.`VIEWNAME` AS `VIEWNAME` FROM `t_srfdataentity` t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.ACQUERYMODELID = t11.QUERYMODELID  LEFT JOIN t_srfdataentity t21 ON t1.DER11DEID = t21.DEID ",querycodetemp="",declarecode="",dbtype="MYSQL5",
    fieldexps={
        @DEDataQueryCodeExp(name="ACEXTINFO",expression="t1.`ACEXTINFO`")
        ,@DEDataQueryCodeExp(name="DEPARAM",expression="t1.`DEPARAM`")
        ,@DEDataQueryCodeExp(name="DEUSERPARAM",expression="t1.`DEUSERPARAM`")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.`MEMO`")
        ,@DEDataQueryCodeExp(name="TIPSINFO",expression="t1.`TIPSINFO`")
        ,@DEDataQueryCodeExp(name="ACENABLEDP",expression="t1.`ACENABLEDP`")
        ,@DEDataQueryCodeExp(name="ACINFOFORMAT",expression="t1.`ACINFOFORMAT`")
        ,@DEDataQueryCodeExp(name="ACINFOPARAM",expression="t1.`ACINFOPARAM`")
        ,@DEDataQueryCodeExp(name="ACMAXCNT",expression="t1.`ACMAXCNT`")
        ,@DEDataQueryCodeExp(name="ACOBJECT",expression="t1.`ACOBJECT`")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELID",expression="t1.`ACQUERYMODELID`")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELNAME",expression="t11.`QUERYMODELNAME`")
        ,@DEDataQueryCodeExp(name="ACSORTDIR",expression="t1.`ACSORTDIR`")
        ,@DEDataQueryCodeExp(name="ACSORTFIELD",expression="t1.`ACSORTFIELD`")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.`BIGICON`")
        ,@DEDataQueryCodeExp(name="CONFIGHELPER",expression="t1.`CONFIGHELPER`")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.`CREATEDATE`")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.`CREATEMAN`")
        ,@DEDataQueryCodeExp(name="DATAACCOBJECT",expression="t1.`DATAACCOBJECT`")
        ,@DEDataQueryCodeExp(name="DATACHGLOGMODE",expression="t1.`DATACHGLOGMODE`")
        ,@DEDataQueryCodeExp(name="DATACTRLINT",expression="t1.`DATACTRLINT`")
        ,@DEDataQueryCodeExp(name="DATACTRLOBJECT",expression="t1.`DATACTRLOBJECT`")
        ,@DEDataQueryCodeExp(name="DATANOTIFYHELPER",expression="t1.`DATANOTIFYHELPER`")
        ,@DEDataQueryCodeExp(name="DBSTORAGE",expression="t1.`DBSTORAGE`")
        ,@DEDataQueryCodeExp(name="DBVERSION",expression="t1.`DBVERSION`")
        ,@DEDataQueryCodeExp(name="DEGROUP",expression="t1.`DEGROUP`")
        ,@DEDataQueryCodeExp(name="DEHELPER",expression="t1.`DEHELPER`")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.`DEID`")
        ,@DEDataQueryCodeExp(name="DELOGICNAME",expression="t1.`DELOGICNAME`")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.`DENAME`")
        ,@DEDataQueryCodeExp(name="DEOBJECT",expression="t1.`DEOBJECT`")
        ,@DEDataQueryCodeExp(name="DEORDER",expression="t1.`DEORDER`")
        ,@DEDataQueryCodeExp(name="DER11DEID",expression="t1.`DER11DEID`")
        ,@DEDataQueryCodeExp(name="DER11DENAME",expression="t21.`DENAME`")
        ,@DEDataQueryCodeExp(name="DETYPE",expression="t1.`DETYPE`")
        ,@DEDataQueryCodeExp(name="DEVERSION",expression="t1.`DEVERSION`")
        ,@DEDataQueryCodeExp(name="DGROWCLASSHELPER",expression="t1.`DGROWCLASSHELPER`")
        ,@DEDataQueryCodeExp(name="DGSUMMARYHEIGHT",expression="t1.`DGSUMMARYHEIGHT`")
        ,@DEDataQueryCodeExp(name="DLKHELPER",expression="t1.`DLKHELPER`")
        ,@DEDataQueryCodeExp(name="DYNAMICINTERVAL",expression="t1.`DYNAMICINTERVAL`")
        ,@DEDataQueryCodeExp(name="ENABLECOLPRIV",expression="t1.`ENABLECOLPRIV`")
        ,@DEDataQueryCodeExp(name="ENABLEGLOBALMODEL",expression="t1.`ENABLEGLOBALMODEL`")
        ,@DEDataQueryCodeExp(name="EXITINGMODEL",expression="t1.`EXITINGMODEL`")
        ,@DEDataQueryCodeExp(name="EXPORTINCEMPTY",expression="t1.`EXPORTINCEMPTY`")
        ,@DEDataQueryCodeExp(name="EXTABLENAME",expression="t1.`EXTABLENAME`")
        ,@DEDataQueryCodeExp(name="GLOBALMODELOBJ",expression="t1.`GLOBALMODELOBJ`")
        ,@DEDataQueryCodeExp(name="INDEXMODE",expression="t1.`INDEXMODE`")
        ,@DEDataQueryCodeExp(name="INFOFIELD",expression="t1.`INFOFIELD`")
        ,@DEDataQueryCodeExp(name="INFOFORMAT",expression="t1.`INFOFORMAT`")
        ,@DEDataQueryCodeExp(name="INHERITMODE",expression="t1.`INHERITMODE`")
        ,@DEDataQueryCodeExp(name="ISDGROWEDIT",expression="t1.`ISDGROWEDIT`")
        ,@DEDataQueryCodeExp(name="ISENABLEAUDIT",expression="t1.`ISENABLEAUDIT`")
        ,@DEDataQueryCodeExp(name="ISENABLEDP",expression="t1.`ISENABLEDP`")
        ,@DEDataQueryCodeExp(name="ISINDEXDE",expression="t1.`ISINDEXDE`")
        ,@DEDataQueryCodeExp(name="ISLOGICVALID",expression="t1.`ISLOGICVALID`")
        ,@DEDataQueryCodeExp(name="ISMULTIPRINT",expression="t1.`ISMULTIPRINT`")
        ,@DEDataQueryCodeExp(name="ISSUPPORTFA",expression="t1.`ISSUPPORTFA`")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.`ISSYSTEM`")
        ,@DEDataQueryCodeExp(name="KEYPARAMS",expression="t1.`KEYPARAMS`")
        ,@DEDataQueryCodeExp(name="LICENSECODE",expression="t1.`LICENSECODE`")
        ,@DEDataQueryCodeExp(name="LOGAUDITDETAIL",expression="t1.`LOGAUDITDETAIL`")
        ,@DEDataQueryCodeExp(name="MINORFIELDNAME",expression="t1.`MINORFIELDNAME`")
        ,@DEDataQueryCodeExp(name="MINORFIELDVALUE",expression="t1.`MINORFIELDVALUE`")
        ,@DEDataQueryCodeExp(name="MINORTABLENAME",expression="t1.`MINORTABLENAME`")
        ,@DEDataQueryCodeExp(name="MULTIMAJOR",expression="t1.`MULTIMAJOR`")
        ,@DEDataQueryCodeExp(name="NODATAINFO",expression="t1.`NODATAINFO`")
        ,@DEDataQueryCodeExp(name="PRINTFUNC",expression="t1.`PRINTFUNC`")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.`RESERVER`")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.`RESERVER2`")
        ,@DEDataQueryCodeExp(name="ROWAMOUNT",expression="t1.`ROWAMOUNT`")
        ,@DEDataQueryCodeExp(name="RTINFO",expression="1")
        ,@DEDataQueryCodeExp(name="SMALLICON",expression="t1.`SMALLICON`")
        ,@DEDataQueryCodeExp(name="STORAGETYPE",expression="t1.`STORAGETYPE`")
        ,@DEDataQueryCodeExp(name="TABLENAME",expression="t1.`TABLENAME`")
        ,@DEDataQueryCodeExp(name="TABLESPACE",expression="t1.`TABLESPACE`")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.`UPDATEDATE`")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.`UPDATEMAN`")
        ,@DEDataQueryCodeExp(name="USERACTION",expression="t1.`USERACTION`")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.`VALIDFLAG`")
        ,@DEDataQueryCodeExp(name="VCFLAG",expression="t1.`VCFLAG`")
        ,@DEDataQueryCodeExp(name="VERCHECKTIMER",expression="t1.`VERCHECKTIMER`")
        ,@DEDataQueryCodeExp(name="VERFIELD",expression="t1.`VERFIELD`")
        ,@DEDataQueryCodeExp(name="VERHELPER",expression="t1.`VERHELPER`")
        ,@DEDataQueryCodeExp(name="VERSIONCHECK",expression="t1.`VERSIONCHECK`")
        ,@DEDataQueryCodeExp(name="VIEWNAME",expression="t1.`VIEWNAME`")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACENABLEDP AS ACENABLEDP, t1.ACINFOFORMAT AS ACINFOFORMAT, t1.ACINFOPARAM AS ACINFOPARAM, t1.ACMAXCNT AS ACMAXCNT, t1.ACOBJECT AS ACOBJECT, t1.ACQUERYMODELID AS ACQUERYMODELID, t11.QUERYMODELNAME AS ACQUERYMODELNAME, t1.ACSORTDIR AS ACSORTDIR, t1.ACSORTFIELD AS ACSORTFIELD, t1.BIGICON AS BIGICON, t1.CONFIGHELPER AS CONFIGHELPER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAACCOBJECT AS DATAACCOBJECT, t1.DATACHGLOGMODE AS DATACHGLOGMODE, t1.DATACTRLINT AS DATACTRLINT, t1.DATACTRLOBJECT AS DATACTRLOBJECT, t1.DATANOTIFYHELPER AS DATANOTIFYHELPER, t1.DBSTORAGE AS DBSTORAGE, t1.DBVERSION AS DBVERSION, t1.DEGROUP AS DEGROUP, t1.DEHELPER AS DEHELPER, t1.DEID AS DEID, t1.DELOGICNAME AS DELOGICNAME, t1.DENAME AS DENAME, t1.DEOBJECT AS DEOBJECT, t1.DEORDER AS DEORDER, t1.DER11DEID AS DER11DEID, t21.DENAME AS DER11DENAME, t1.DETYPE AS DETYPE, t1.DEVERSION AS DEVERSION, t1.DGROWCLASSHELPER AS DGROWCLASSHELPER, t1.DGSUMMARYHEIGHT AS DGSUMMARYHEIGHT, t1.DLKHELPER AS DLKHELPER, t1.DYNAMICINTERVAL AS DYNAMICINTERVAL, t1.ENABLECOLPRIV AS ENABLECOLPRIV, t1.ENABLEGLOBALMODEL AS ENABLEGLOBALMODEL, t1.EXITINGMODEL AS EXITINGMODEL, t1.EXPORTINCEMPTY AS EXPORTINCEMPTY, t1.EXTABLENAME AS EXTABLENAME, t1.GLOBALMODELOBJ AS GLOBALMODELOBJ, t1.INDEXMODE AS INDEXMODE, t1.INFOFIELD AS INFOFIELD, t1.INFOFORMAT AS INFOFORMAT, t1.INHERITMODE AS INHERITMODE, t1.ISDGROWEDIT AS ISDGROWEDIT, t1.ISENABLEAUDIT AS ISENABLEAUDIT, t1.ISENABLEDP AS ISENABLEDP, t1.ISINDEXDE AS ISINDEXDE, t1.ISLOGICVALID AS ISLOGICVALID, t1.ISMULTIPRINT AS ISMULTIPRINT, t1.ISSUPPORTFA AS ISSUPPORTFA, t1.ISSYSTEM AS ISSYSTEM, t1.KEYPARAMS AS KEYPARAMS, t1.LICENSECODE AS LICENSECODE, t1.LOGAUDITDETAIL AS LOGAUDITDETAIL, t1.MINORFIELDNAME AS MINORFIELDNAME, t1.MINORFIELDVALUE AS MINORFIELDVALUE, t1.MINORTABLENAME AS MINORTABLENAME, t1.MULTIMAJOR AS MULTIMAJOR, t1.NODATAINFO AS NODATAINFO, t1.PRINTFUNC AS PRINTFUNC, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.ROWAMOUNT AS ROWAMOUNT, 1 AS RTINFO, t1.SMALLICON AS SMALLICON, t1.STORAGETYPE AS STORAGETYPE, t1.TABLENAME AS TABLENAME, t1.TABLESPACE AS TABLESPACE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERACTION AS USERACTION, t1.VALIDFLAG AS VALIDFLAG, t1.VCFLAG AS VCFLAG, t1.VERCHECKTIMER AS VERCHECKTIMER, t1.VERFIELD AS VERFIELD, t1.VERHELPER AS VERHELPER, t1.VERSIONCHECK AS VERSIONCHECK, t1.VIEWNAME AS VIEWNAME FROM t_srfdataentity t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.ACQUERYMODELID = t11.QUERYMODELID  LEFT JOIN t_srfdataentity t21 ON t1.DER11DEID = t21.DEID ",querycodetemp="",declarecode="",dbtype="DB2",
    fieldexps={
        @DEDataQueryCodeExp(name="ACEXTINFO",expression="t1.ACEXTINFO")
        ,@DEDataQueryCodeExp(name="DEPARAM",expression="t1.DEPARAM")
        ,@DEDataQueryCodeExp(name="DEUSERPARAM",expression="t1.DEUSERPARAM")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="TIPSINFO",expression="t1.TIPSINFO")
        ,@DEDataQueryCodeExp(name="ACENABLEDP",expression="t1.ACENABLEDP")
        ,@DEDataQueryCodeExp(name="ACINFOFORMAT",expression="t1.ACINFOFORMAT")
        ,@DEDataQueryCodeExp(name="ACINFOPARAM",expression="t1.ACINFOPARAM")
        ,@DEDataQueryCodeExp(name="ACMAXCNT",expression="t1.ACMAXCNT")
        ,@DEDataQueryCodeExp(name="ACOBJECT",expression="t1.ACOBJECT")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELID",expression="t1.ACQUERYMODELID")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELNAME",expression="t11.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="ACSORTDIR",expression="t1.ACSORTDIR")
        ,@DEDataQueryCodeExp(name="ACSORTFIELD",expression="t1.ACSORTFIELD")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.BIGICON")
        ,@DEDataQueryCodeExp(name="CONFIGHELPER",expression="t1.CONFIGHELPER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAACCOBJECT",expression="t1.DATAACCOBJECT")
        ,@DEDataQueryCodeExp(name="DATACHGLOGMODE",expression="t1.DATACHGLOGMODE")
        ,@DEDataQueryCodeExp(name="DATACTRLINT",expression="t1.DATACTRLINT")
        ,@DEDataQueryCodeExp(name="DATACTRLOBJECT",expression="t1.DATACTRLOBJECT")
        ,@DEDataQueryCodeExp(name="DATANOTIFYHELPER",expression="t1.DATANOTIFYHELPER")
        ,@DEDataQueryCodeExp(name="DBSTORAGE",expression="t1.DBSTORAGE")
        ,@DEDataQueryCodeExp(name="DBVERSION",expression="t1.DBVERSION")
        ,@DEDataQueryCodeExp(name="DEGROUP",expression="t1.DEGROUP")
        ,@DEDataQueryCodeExp(name="DEHELPER",expression="t1.DEHELPER")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DELOGICNAME",expression="t1.DELOGICNAME")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="DEOBJECT",expression="t1.DEOBJECT")
        ,@DEDataQueryCodeExp(name="DEORDER",expression="t1.DEORDER")
        ,@DEDataQueryCodeExp(name="DER11DEID",expression="t1.DER11DEID")
        ,@DEDataQueryCodeExp(name="DER11DENAME",expression="t21.DENAME")
        ,@DEDataQueryCodeExp(name="DETYPE",expression="t1.DETYPE")
        ,@DEDataQueryCodeExp(name="DEVERSION",expression="t1.DEVERSION")
        ,@DEDataQueryCodeExp(name="DGROWCLASSHELPER",expression="t1.DGROWCLASSHELPER")
        ,@DEDataQueryCodeExp(name="DGSUMMARYHEIGHT",expression="t1.DGSUMMARYHEIGHT")
        ,@DEDataQueryCodeExp(name="DLKHELPER",expression="t1.DLKHELPER")
        ,@DEDataQueryCodeExp(name="DYNAMICINTERVAL",expression="t1.DYNAMICINTERVAL")
        ,@DEDataQueryCodeExp(name="ENABLECOLPRIV",expression="t1.ENABLECOLPRIV")
        ,@DEDataQueryCodeExp(name="ENABLEGLOBALMODEL",expression="t1.ENABLEGLOBALMODEL")
        ,@DEDataQueryCodeExp(name="EXITINGMODEL",expression="t1.EXITINGMODEL")
        ,@DEDataQueryCodeExp(name="EXPORTINCEMPTY",expression="t1.EXPORTINCEMPTY")
        ,@DEDataQueryCodeExp(name="EXTABLENAME",expression="t1.EXTABLENAME")
        ,@DEDataQueryCodeExp(name="GLOBALMODELOBJ",expression="t1.GLOBALMODELOBJ")
        ,@DEDataQueryCodeExp(name="INDEXMODE",expression="t1.INDEXMODE")
        ,@DEDataQueryCodeExp(name="INFOFIELD",expression="t1.INFOFIELD")
        ,@DEDataQueryCodeExp(name="INFOFORMAT",expression="t1.INFOFORMAT")
        ,@DEDataQueryCodeExp(name="INHERITMODE",expression="t1.INHERITMODE")
        ,@DEDataQueryCodeExp(name="ISDGROWEDIT",expression="t1.ISDGROWEDIT")
        ,@DEDataQueryCodeExp(name="ISENABLEAUDIT",expression="t1.ISENABLEAUDIT")
        ,@DEDataQueryCodeExp(name="ISENABLEDP",expression="t1.ISENABLEDP")
        ,@DEDataQueryCodeExp(name="ISINDEXDE",expression="t1.ISINDEXDE")
        ,@DEDataQueryCodeExp(name="ISLOGICVALID",expression="t1.ISLOGICVALID")
        ,@DEDataQueryCodeExp(name="ISMULTIPRINT",expression="t1.ISMULTIPRINT")
        ,@DEDataQueryCodeExp(name="ISSUPPORTFA",expression="t1.ISSUPPORTFA")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="KEYPARAMS",expression="t1.KEYPARAMS")
        ,@DEDataQueryCodeExp(name="LICENSECODE",expression="t1.LICENSECODE")
        ,@DEDataQueryCodeExp(name="LOGAUDITDETAIL",expression="t1.LOGAUDITDETAIL")
        ,@DEDataQueryCodeExp(name="MINORFIELDNAME",expression="t1.MINORFIELDNAME")
        ,@DEDataQueryCodeExp(name="MINORFIELDVALUE",expression="t1.MINORFIELDVALUE")
        ,@DEDataQueryCodeExp(name="MINORTABLENAME",expression="t1.MINORTABLENAME")
        ,@DEDataQueryCodeExp(name="MULTIMAJOR",expression="t1.MULTIMAJOR")
        ,@DEDataQueryCodeExp(name="NODATAINFO",expression="t1.NODATAINFO")
        ,@DEDataQueryCodeExp(name="PRINTFUNC",expression="t1.PRINTFUNC")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="ROWAMOUNT",expression="t1.ROWAMOUNT")
        ,@DEDataQueryCodeExp(name="RTINFO",expression="1")
        ,@DEDataQueryCodeExp(name="SMALLICON",expression="t1.SMALLICON")
        ,@DEDataQueryCodeExp(name="STORAGETYPE",expression="t1.STORAGETYPE")
        ,@DEDataQueryCodeExp(name="TABLENAME",expression="t1.TABLENAME")
        ,@DEDataQueryCodeExp(name="TABLESPACE",expression="t1.TABLESPACE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERACTION",expression="t1.USERACTION")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="VCFLAG",expression="t1.VCFLAG")
        ,@DEDataQueryCodeExp(name="VERCHECKTIMER",expression="t1.VERCHECKTIMER")
        ,@DEDataQueryCodeExp(name="VERFIELD",expression="t1.VERFIELD")
        ,@DEDataQueryCodeExp(name="VERHELPER",expression="t1.VERHELPER")
        ,@DEDataQueryCodeExp(name="VERSIONCHECK",expression="t1.VERSIONCHECK")
        ,@DEDataQueryCodeExp(name="VIEWNAME",expression="t1.VIEWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.ACENABLEDP AS ACENABLEDP, t1.ACINFOFORMAT AS ACINFOFORMAT, t1.ACINFOPARAM AS ACINFOPARAM, t1.ACMAXCNT AS ACMAXCNT, t1.ACOBJECT AS ACOBJECT, t1.ACQUERYMODELID AS ACQUERYMODELID, t11.QUERYMODELNAME AS ACQUERYMODELNAME, t1.ACSORTDIR AS ACSORTDIR, t1.ACSORTFIELD AS ACSORTFIELD, t1.BIGICON AS BIGICON, t1.CONFIGHELPER AS CONFIGHELPER, t1.CREATEDATE AS CREATEDATE, t1.CREATEMAN AS CREATEMAN, t1.DATAACCOBJECT AS DATAACCOBJECT, t1.DATACHGLOGMODE AS DATACHGLOGMODE, t1.DATACTRLINT AS DATACTRLINT, t1.DATACTRLOBJECT AS DATACTRLOBJECT, t1.DATANOTIFYHELPER AS DATANOTIFYHELPER, t1.DBSTORAGE AS DBSTORAGE, t1.DBVERSION AS DBVERSION, t1.DEGROUP AS DEGROUP, t1.DEHELPER AS DEHELPER, t1.DEID AS DEID, t1.DELOGICNAME AS DELOGICNAME, t1.DENAME AS DENAME, t1.DEOBJECT AS DEOBJECT, t1.DEORDER AS DEORDER, t1.DER11DEID AS DER11DEID, t21.DENAME AS DER11DENAME, t1.DETYPE AS DETYPE, t1.DEVERSION AS DEVERSION, t1.DGROWCLASSHELPER AS DGROWCLASSHELPER, t1.DGSUMMARYHEIGHT AS DGSUMMARYHEIGHT, t1.DLKHELPER AS DLKHELPER, t1.DYNAMICINTERVAL AS DYNAMICINTERVAL, t1.ENABLECOLPRIV AS ENABLECOLPRIV, t1.ENABLEGLOBALMODEL AS ENABLEGLOBALMODEL, t1.EXITINGMODEL AS EXITINGMODEL, t1.EXPORTINCEMPTY AS EXPORTINCEMPTY, t1.EXTABLENAME AS EXTABLENAME, t1.GLOBALMODELOBJ AS GLOBALMODELOBJ, t1.INDEXMODE AS INDEXMODE, t1.INFOFIELD AS INFOFIELD, t1.INFOFORMAT AS INFOFORMAT, t1.INHERITMODE AS INHERITMODE, t1.ISDGROWEDIT AS ISDGROWEDIT, t1.ISENABLEAUDIT AS ISENABLEAUDIT, t1.ISENABLEDP AS ISENABLEDP, t1.ISINDEXDE AS ISINDEXDE, t1.ISLOGICVALID AS ISLOGICVALID, t1.ISMULTIPRINT AS ISMULTIPRINT, t1.ISSUPPORTFA AS ISSUPPORTFA, t1.ISSYSTEM AS ISSYSTEM, t1.KEYPARAMS AS KEYPARAMS, t1.LICENSECODE AS LICENSECODE, t1.LOGAUDITDETAIL AS LOGAUDITDETAIL, t1.MINORFIELDNAME AS MINORFIELDNAME, t1.MINORFIELDVALUE AS MINORFIELDVALUE, t1.MINORTABLENAME AS MINORTABLENAME, t1.MULTIMAJOR AS MULTIMAJOR, t1.NODATAINFO AS NODATAINFO, t1.PRINTFUNC AS PRINTFUNC, t1.RESERVER AS RESERVER, t1.RESERVER2 AS RESERVER2, t1.ROWAMOUNT AS ROWAMOUNT, 1 AS RTINFO, t1.SMALLICON AS SMALLICON, t1.STORAGETYPE AS STORAGETYPE, t1.TABLENAME AS TABLENAME, t1.TABLESPACE AS TABLESPACE, t1.UPDATEDATE AS UPDATEDATE, t1.UPDATEMAN AS UPDATEMAN, t1.USERACTION AS USERACTION, t1.VALIDFLAG AS VALIDFLAG, t1.VCFLAG AS VCFLAG, t1.VERCHECKTIMER AS VERCHECKTIMER, t1.VERFIELD AS VERFIELD, t1.VERHELPER AS VERHELPER, t1.VERSIONCHECK AS VERSIONCHECK, t1.VIEWNAME AS VIEWNAME FROM t_srfdataentity t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.ACQUERYMODELID = t11.QUERYMODELID  LEFT JOIN t_srfdataentity t21 ON t1.DER11DEID = t21.DEID ",querycodetemp="",declarecode="",dbtype="ORACLE",
    fieldexps={
        @DEDataQueryCodeExp(name="ACEXTINFO",expression="t1.ACEXTINFO")
        ,@DEDataQueryCodeExp(name="DEPARAM",expression="t1.DEPARAM")
        ,@DEDataQueryCodeExp(name="DEUSERPARAM",expression="t1.DEUSERPARAM")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.MEMO")
        ,@DEDataQueryCodeExp(name="TIPSINFO",expression="t1.TIPSINFO")
        ,@DEDataQueryCodeExp(name="ACENABLEDP",expression="t1.ACENABLEDP")
        ,@DEDataQueryCodeExp(name="ACINFOFORMAT",expression="t1.ACINFOFORMAT")
        ,@DEDataQueryCodeExp(name="ACINFOPARAM",expression="t1.ACINFOPARAM")
        ,@DEDataQueryCodeExp(name="ACMAXCNT",expression="t1.ACMAXCNT")
        ,@DEDataQueryCodeExp(name="ACOBJECT",expression="t1.ACOBJECT")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELID",expression="t1.ACQUERYMODELID")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELNAME",expression="t11.QUERYMODELNAME")
        ,@DEDataQueryCodeExp(name="ACSORTDIR",expression="t1.ACSORTDIR")
        ,@DEDataQueryCodeExp(name="ACSORTFIELD",expression="t1.ACSORTFIELD")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.BIGICON")
        ,@DEDataQueryCodeExp(name="CONFIGHELPER",expression="t1.CONFIGHELPER")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.CREATEDATE")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.CREATEMAN")
        ,@DEDataQueryCodeExp(name="DATAACCOBJECT",expression="t1.DATAACCOBJECT")
        ,@DEDataQueryCodeExp(name="DATACHGLOGMODE",expression="t1.DATACHGLOGMODE")
        ,@DEDataQueryCodeExp(name="DATACTRLINT",expression="t1.DATACTRLINT")
        ,@DEDataQueryCodeExp(name="DATACTRLOBJECT",expression="t1.DATACTRLOBJECT")
        ,@DEDataQueryCodeExp(name="DATANOTIFYHELPER",expression="t1.DATANOTIFYHELPER")
        ,@DEDataQueryCodeExp(name="DBSTORAGE",expression="t1.DBSTORAGE")
        ,@DEDataQueryCodeExp(name="DBVERSION",expression="t1.DBVERSION")
        ,@DEDataQueryCodeExp(name="DEGROUP",expression="t1.DEGROUP")
        ,@DEDataQueryCodeExp(name="DEHELPER",expression="t1.DEHELPER")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.DEID")
        ,@DEDataQueryCodeExp(name="DELOGICNAME",expression="t1.DELOGICNAME")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.DENAME")
        ,@DEDataQueryCodeExp(name="DEOBJECT",expression="t1.DEOBJECT")
        ,@DEDataQueryCodeExp(name="DEORDER",expression="t1.DEORDER")
        ,@DEDataQueryCodeExp(name="DER11DEID",expression="t1.DER11DEID")
        ,@DEDataQueryCodeExp(name="DER11DENAME",expression="t21.DENAME")
        ,@DEDataQueryCodeExp(name="DETYPE",expression="t1.DETYPE")
        ,@DEDataQueryCodeExp(name="DEVERSION",expression="t1.DEVERSION")
        ,@DEDataQueryCodeExp(name="DGROWCLASSHELPER",expression="t1.DGROWCLASSHELPER")
        ,@DEDataQueryCodeExp(name="DGSUMMARYHEIGHT",expression="t1.DGSUMMARYHEIGHT")
        ,@DEDataQueryCodeExp(name="DLKHELPER",expression="t1.DLKHELPER")
        ,@DEDataQueryCodeExp(name="DYNAMICINTERVAL",expression="t1.DYNAMICINTERVAL")
        ,@DEDataQueryCodeExp(name="ENABLECOLPRIV",expression="t1.ENABLECOLPRIV")
        ,@DEDataQueryCodeExp(name="ENABLEGLOBALMODEL",expression="t1.ENABLEGLOBALMODEL")
        ,@DEDataQueryCodeExp(name="EXITINGMODEL",expression="t1.EXITINGMODEL")
        ,@DEDataQueryCodeExp(name="EXPORTINCEMPTY",expression="t1.EXPORTINCEMPTY")
        ,@DEDataQueryCodeExp(name="EXTABLENAME",expression="t1.EXTABLENAME")
        ,@DEDataQueryCodeExp(name="GLOBALMODELOBJ",expression="t1.GLOBALMODELOBJ")
        ,@DEDataQueryCodeExp(name="INDEXMODE",expression="t1.INDEXMODE")
        ,@DEDataQueryCodeExp(name="INFOFIELD",expression="t1.INFOFIELD")
        ,@DEDataQueryCodeExp(name="INFOFORMAT",expression="t1.INFOFORMAT")
        ,@DEDataQueryCodeExp(name="INHERITMODE",expression="t1.INHERITMODE")
        ,@DEDataQueryCodeExp(name="ISDGROWEDIT",expression="t1.ISDGROWEDIT")
        ,@DEDataQueryCodeExp(name="ISENABLEAUDIT",expression="t1.ISENABLEAUDIT")
        ,@DEDataQueryCodeExp(name="ISENABLEDP",expression="t1.ISENABLEDP")
        ,@DEDataQueryCodeExp(name="ISINDEXDE",expression="t1.ISINDEXDE")
        ,@DEDataQueryCodeExp(name="ISLOGICVALID",expression="t1.ISLOGICVALID")
        ,@DEDataQueryCodeExp(name="ISMULTIPRINT",expression="t1.ISMULTIPRINT")
        ,@DEDataQueryCodeExp(name="ISSUPPORTFA",expression="t1.ISSUPPORTFA")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.ISSYSTEM")
        ,@DEDataQueryCodeExp(name="KEYPARAMS",expression="t1.KEYPARAMS")
        ,@DEDataQueryCodeExp(name="LICENSECODE",expression="t1.LICENSECODE")
        ,@DEDataQueryCodeExp(name="LOGAUDITDETAIL",expression="t1.LOGAUDITDETAIL")
        ,@DEDataQueryCodeExp(name="MINORFIELDNAME",expression="t1.MINORFIELDNAME")
        ,@DEDataQueryCodeExp(name="MINORFIELDVALUE",expression="t1.MINORFIELDVALUE")
        ,@DEDataQueryCodeExp(name="MINORTABLENAME",expression="t1.MINORTABLENAME")
        ,@DEDataQueryCodeExp(name="MULTIMAJOR",expression="t1.MULTIMAJOR")
        ,@DEDataQueryCodeExp(name="NODATAINFO",expression="t1.NODATAINFO")
        ,@DEDataQueryCodeExp(name="PRINTFUNC",expression="t1.PRINTFUNC")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.RESERVER")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.RESERVER2")
        ,@DEDataQueryCodeExp(name="ROWAMOUNT",expression="t1.ROWAMOUNT")
        ,@DEDataQueryCodeExp(name="RTINFO",expression="1")
        ,@DEDataQueryCodeExp(name="SMALLICON",expression="t1.SMALLICON")
        ,@DEDataQueryCodeExp(name="STORAGETYPE",expression="t1.STORAGETYPE")
        ,@DEDataQueryCodeExp(name="TABLENAME",expression="t1.TABLENAME")
        ,@DEDataQueryCodeExp(name="TABLESPACE",expression="t1.TABLESPACE")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.UPDATEDATE")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.UPDATEMAN")
        ,@DEDataQueryCodeExp(name="USERACTION",expression="t1.USERACTION")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.VALIDFLAG")
        ,@DEDataQueryCodeExp(name="VCFLAG",expression="t1.VCFLAG")
        ,@DEDataQueryCodeExp(name="VERCHECKTIMER",expression="t1.VERCHECKTIMER")
        ,@DEDataQueryCodeExp(name="VERFIELD",expression="t1.VERFIELD")
        ,@DEDataQueryCodeExp(name="VERHELPER",expression="t1.VERHELPER")
        ,@DEDataQueryCodeExp(name="VERSIONCHECK",expression="t1.VERSIONCHECK")
        ,@DEDataQueryCodeExp(name="VIEWNAME",expression="t1.VIEWNAME")
    },
    conds={}),
    @DEDataQueryCode(querycode="SELECT t1.[ACENABLEDP] AS [ACENABLEDP], t1.[ACINFOFORMAT] AS [ACINFOFORMAT], t1.[ACINFOPARAM] AS [ACINFOPARAM], t1.[ACMAXCNT] AS [ACMAXCNT], t1.[ACOBJECT] AS [ACOBJECT], t1.[ACQUERYMODELID] AS [ACQUERYMODELID], t11.[QUERYMODELNAME] AS [ACQUERYMODELNAME], t1.[ACSORTDIR] AS [ACSORTDIR], t1.[ACSORTFIELD] AS [ACSORTFIELD], t1.[BIGICON] AS [BIGICON], t1.[CONFIGHELPER] AS [CONFIGHELPER], t1.[CREATEDATE] AS [CREATEDATE], t1.[CREATEMAN] AS [CREATEMAN], t1.[DATAACCOBJECT] AS [DATAACCOBJECT], t1.[DATACHGLOGMODE] AS [DATACHGLOGMODE], t1.[DATACTRLINT] AS [DATACTRLINT], t1.[DATACTRLOBJECT] AS [DATACTRLOBJECT], t1.[DATANOTIFYHELPER] AS [DATANOTIFYHELPER], t1.[DBSTORAGE] AS [DBSTORAGE], t1.[DBVERSION] AS [DBVERSION], t1.[DEGROUP] AS [DEGROUP], t1.[DEHELPER] AS [DEHELPER], t1.[DEID] AS [DEID], t1.[DELOGICNAME] AS [DELOGICNAME], t1.[DENAME] AS [DENAME], t1.[DEOBJECT] AS [DEOBJECT], t1.[DEORDER] AS [DEORDER], t1.[DER11DEID] AS [DER11DEID], t21.[DENAME] AS [DER11DENAME], t1.[DETYPE] AS [DETYPE], t1.[DEVERSION] AS [DEVERSION], t1.[DGROWCLASSHELPER] AS [DGROWCLASSHELPER], t1.[DGSUMMARYHEIGHT] AS [DGSUMMARYHEIGHT], t1.[DLKHELPER] AS [DLKHELPER], t1.[DYNAMICINTERVAL] AS [DYNAMICINTERVAL], t1.[ENABLECOLPRIV] AS [ENABLECOLPRIV], t1.[ENABLEGLOBALMODEL] AS [ENABLEGLOBALMODEL], t1.[EXITINGMODEL] AS [EXITINGMODEL], t1.[EXPORTINCEMPTY] AS [EXPORTINCEMPTY], t1.[EXTABLENAME] AS [EXTABLENAME], t1.[GLOBALMODELOBJ] AS [GLOBALMODELOBJ], t1.[INDEXMODE] AS [INDEXMODE], t1.[INFOFIELD] AS [INFOFIELD], t1.[INFOFORMAT] AS [INFOFORMAT], t1.[INHERITMODE] AS [INHERITMODE], t1.[ISDGROWEDIT] AS [ISDGROWEDIT], t1.[ISENABLEAUDIT] AS [ISENABLEAUDIT], t1.[ISENABLEDP] AS [ISENABLEDP], t1.[ISINDEXDE] AS [ISINDEXDE], t1.[ISLOGICVALID] AS [ISLOGICVALID], t1.[ISMULTIPRINT] AS [ISMULTIPRINT], t1.[ISSUPPORTFA] AS [ISSUPPORTFA], t1.[ISSYSTEM] AS [ISSYSTEM], t1.[KEYPARAMS] AS [KEYPARAMS], t1.[LICENSECODE] AS [LICENSECODE], t1.[LOGAUDITDETAIL] AS [LOGAUDITDETAIL], t1.[MINORFIELDNAME] AS [MINORFIELDNAME], t1.[MINORFIELDVALUE] AS [MINORFIELDVALUE], t1.[MINORTABLENAME] AS [MINORTABLENAME], t1.[MULTIMAJOR] AS [MULTIMAJOR], t1.[NODATAINFO] AS [NODATAINFO], t1.[PRINTFUNC] AS [PRINTFUNC], t1.[RESERVER] AS [RESERVER], t1.[RESERVER2] AS [RESERVER2], t1.[ROWAMOUNT] AS [ROWAMOUNT], 1 AS [RTINFO], t1.[SMALLICON] AS [SMALLICON], t1.[STORAGETYPE] AS [STORAGETYPE], t1.[TABLENAME] AS [TABLENAME], t1.[TABLESPACE] AS [TABLESPACE], t1.[UPDATEDATE] AS [UPDATEDATE], t1.[UPDATEMAN] AS [UPDATEMAN], t1.[USERACTION] AS [USERACTION], t1.[VALIDFLAG] AS [VALIDFLAG], t1.[VCFLAG] AS [VCFLAG], t1.[VERCHECKTIMER] AS [VERCHECKTIMER], t1.[VERFIELD] AS [VERFIELD], t1.[VERHELPER] AS [VERHELPER], t1.[VERSIONCHECK] AS [VERSIONCHECK], t1.[VIEWNAME] AS [VIEWNAME] FROM [t_srfdataentity] t1  LEFT JOIN T_SRFQUERYMODEL t11 ON t1.ACQUERYMODELID = t11.QUERYMODELID  LEFT JOIN t_srfdataentity t21 ON t1.DER11DEID = t21.DEID ",querycodetemp="",declarecode="",dbtype="SQLSERVER",
    fieldexps={
        @DEDataQueryCodeExp(name="ACEXTINFO",expression="t1.[ACEXTINFO]")
        ,@DEDataQueryCodeExp(name="DEPARAM",expression="t1.[DEPARAM]")
        ,@DEDataQueryCodeExp(name="DEUSERPARAM",expression="t1.[DEUSERPARAM]")
        ,@DEDataQueryCodeExp(name="MEMO",expression="t1.[MEMO]")
        ,@DEDataQueryCodeExp(name="TIPSINFO",expression="t1.[TIPSINFO]")
        ,@DEDataQueryCodeExp(name="ACENABLEDP",expression="t1.[ACENABLEDP]")
        ,@DEDataQueryCodeExp(name="ACINFOFORMAT",expression="t1.[ACINFOFORMAT]")
        ,@DEDataQueryCodeExp(name="ACINFOPARAM",expression="t1.[ACINFOPARAM]")
        ,@DEDataQueryCodeExp(name="ACMAXCNT",expression="t1.[ACMAXCNT]")
        ,@DEDataQueryCodeExp(name="ACOBJECT",expression="t1.[ACOBJECT]")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELID",expression="t1.[ACQUERYMODELID]")
        ,@DEDataQueryCodeExp(name="ACQUERYMODELNAME",expression="t11.[QUERYMODELNAME]")
        ,@DEDataQueryCodeExp(name="ACSORTDIR",expression="t1.[ACSORTDIR]")
        ,@DEDataQueryCodeExp(name="ACSORTFIELD",expression="t1.[ACSORTFIELD]")
        ,@DEDataQueryCodeExp(name="BIGICON",expression="t1.[BIGICON]")
        ,@DEDataQueryCodeExp(name="CONFIGHELPER",expression="t1.[CONFIGHELPER]")
        ,@DEDataQueryCodeExp(name="CREATEDATE",expression="t1.[CREATEDATE]")
        ,@DEDataQueryCodeExp(name="CREATEMAN",expression="t1.[CREATEMAN]")
        ,@DEDataQueryCodeExp(name="DATAACCOBJECT",expression="t1.[DATAACCOBJECT]")
        ,@DEDataQueryCodeExp(name="DATACHGLOGMODE",expression="t1.[DATACHGLOGMODE]")
        ,@DEDataQueryCodeExp(name="DATACTRLINT",expression="t1.[DATACTRLINT]")
        ,@DEDataQueryCodeExp(name="DATACTRLOBJECT",expression="t1.[DATACTRLOBJECT]")
        ,@DEDataQueryCodeExp(name="DATANOTIFYHELPER",expression="t1.[DATANOTIFYHELPER]")
        ,@DEDataQueryCodeExp(name="DBSTORAGE",expression="t1.[DBSTORAGE]")
        ,@DEDataQueryCodeExp(name="DBVERSION",expression="t1.[DBVERSION]")
        ,@DEDataQueryCodeExp(name="DEGROUP",expression="t1.[DEGROUP]")
        ,@DEDataQueryCodeExp(name="DEHELPER",expression="t1.[DEHELPER]")
        ,@DEDataQueryCodeExp(name="DEID",expression="t1.[DEID]")
        ,@DEDataQueryCodeExp(name="DELOGICNAME",expression="t1.[DELOGICNAME]")
        ,@DEDataQueryCodeExp(name="DENAME",expression="t1.[DENAME]")
        ,@DEDataQueryCodeExp(name="DEOBJECT",expression="t1.[DEOBJECT]")
        ,@DEDataQueryCodeExp(name="DEORDER",expression="t1.[DEORDER]")
        ,@DEDataQueryCodeExp(name="DER11DEID",expression="t1.[DER11DEID]")
        ,@DEDataQueryCodeExp(name="DER11DENAME",expression="t21.[DENAME]")
        ,@DEDataQueryCodeExp(name="DETYPE",expression="t1.[DETYPE]")
        ,@DEDataQueryCodeExp(name="DEVERSION",expression="t1.[DEVERSION]")
        ,@DEDataQueryCodeExp(name="DGROWCLASSHELPER",expression="t1.[DGROWCLASSHELPER]")
        ,@DEDataQueryCodeExp(name="DGSUMMARYHEIGHT",expression="t1.[DGSUMMARYHEIGHT]")
        ,@DEDataQueryCodeExp(name="DLKHELPER",expression="t1.[DLKHELPER]")
        ,@DEDataQueryCodeExp(name="DYNAMICINTERVAL",expression="t1.[DYNAMICINTERVAL]")
        ,@DEDataQueryCodeExp(name="ENABLECOLPRIV",expression="t1.[ENABLECOLPRIV]")
        ,@DEDataQueryCodeExp(name="ENABLEGLOBALMODEL",expression="t1.[ENABLEGLOBALMODEL]")
        ,@DEDataQueryCodeExp(name="EXITINGMODEL",expression="t1.[EXITINGMODEL]")
        ,@DEDataQueryCodeExp(name="EXPORTINCEMPTY",expression="t1.[EXPORTINCEMPTY]")
        ,@DEDataQueryCodeExp(name="EXTABLENAME",expression="t1.[EXTABLENAME]")
        ,@DEDataQueryCodeExp(name="GLOBALMODELOBJ",expression="t1.[GLOBALMODELOBJ]")
        ,@DEDataQueryCodeExp(name="INDEXMODE",expression="t1.[INDEXMODE]")
        ,@DEDataQueryCodeExp(name="INFOFIELD",expression="t1.[INFOFIELD]")
        ,@DEDataQueryCodeExp(name="INFOFORMAT",expression="t1.[INFOFORMAT]")
        ,@DEDataQueryCodeExp(name="INHERITMODE",expression="t1.[INHERITMODE]")
        ,@DEDataQueryCodeExp(name="ISDGROWEDIT",expression="t1.[ISDGROWEDIT]")
        ,@DEDataQueryCodeExp(name="ISENABLEAUDIT",expression="t1.[ISENABLEAUDIT]")
        ,@DEDataQueryCodeExp(name="ISENABLEDP",expression="t1.[ISENABLEDP]")
        ,@DEDataQueryCodeExp(name="ISINDEXDE",expression="t1.[ISINDEXDE]")
        ,@DEDataQueryCodeExp(name="ISLOGICVALID",expression="t1.[ISLOGICVALID]")
        ,@DEDataQueryCodeExp(name="ISMULTIPRINT",expression="t1.[ISMULTIPRINT]")
        ,@DEDataQueryCodeExp(name="ISSUPPORTFA",expression="t1.[ISSUPPORTFA]")
        ,@DEDataQueryCodeExp(name="ISSYSTEM",expression="t1.[ISSYSTEM]")
        ,@DEDataQueryCodeExp(name="KEYPARAMS",expression="t1.[KEYPARAMS]")
        ,@DEDataQueryCodeExp(name="LICENSECODE",expression="t1.[LICENSECODE]")
        ,@DEDataQueryCodeExp(name="LOGAUDITDETAIL",expression="t1.[LOGAUDITDETAIL]")
        ,@DEDataQueryCodeExp(name="MINORFIELDNAME",expression="t1.[MINORFIELDNAME]")
        ,@DEDataQueryCodeExp(name="MINORFIELDVALUE",expression="t1.[MINORFIELDVALUE]")
        ,@DEDataQueryCodeExp(name="MINORTABLENAME",expression="t1.[MINORTABLENAME]")
        ,@DEDataQueryCodeExp(name="MULTIMAJOR",expression="t1.[MULTIMAJOR]")
        ,@DEDataQueryCodeExp(name="NODATAINFO",expression="t1.[NODATAINFO]")
        ,@DEDataQueryCodeExp(name="PRINTFUNC",expression="t1.[PRINTFUNC]")
        ,@DEDataQueryCodeExp(name="RESERVER",expression="t1.[RESERVER]")
        ,@DEDataQueryCodeExp(name="RESERVER2",expression="t1.[RESERVER2]")
        ,@DEDataQueryCodeExp(name="ROWAMOUNT",expression="t1.[ROWAMOUNT]")
        ,@DEDataQueryCodeExp(name="RTINFO",expression="1")
        ,@DEDataQueryCodeExp(name="SMALLICON",expression="t1.[SMALLICON]")
        ,@DEDataQueryCodeExp(name="STORAGETYPE",expression="t1.[STORAGETYPE]")
        ,@DEDataQueryCodeExp(name="TABLENAME",expression="t1.[TABLENAME]")
        ,@DEDataQueryCodeExp(name="TABLESPACE",expression="t1.[TABLESPACE]")
        ,@DEDataQueryCodeExp(name="UPDATEDATE",expression="t1.[UPDATEDATE]")
        ,@DEDataQueryCodeExp(name="UPDATEMAN",expression="t1.[UPDATEMAN]")
        ,@DEDataQueryCodeExp(name="USERACTION",expression="t1.[USERACTION]")
        ,@DEDataQueryCodeExp(name="VALIDFLAG",expression="t1.[VALIDFLAG]")
        ,@DEDataQueryCodeExp(name="VCFLAG",expression="t1.[VCFLAG]")
        ,@DEDataQueryCodeExp(name="VERCHECKTIMER",expression="t1.[VERCHECKTIMER]")
        ,@DEDataQueryCodeExp(name="VERFIELD",expression="t1.[VERFIELD]")
        ,@DEDataQueryCodeExp(name="VERHELPER",expression="t1.[VERHELPER]")
        ,@DEDataQueryCodeExp(name="VERSIONCHECK",expression="t1.[VERSIONCHECK]")
        ,@DEDataQueryCodeExp(name="VIEWNAME",expression="t1.[VIEWNAME]")
    },
    conds={})
})
/**
 *  实体数据查询 [DEFAULT]模型基类
 */
public abstract class DataEntityDefaultDQModelBase extends net.ibizsys.paas.demodel.DEDataQueryModelBase {

    public DataEntityDefaultDQModelBase() {
        super();

        this.initAnnotation(DataEntityDefaultDQModelBase.class);
    }

}