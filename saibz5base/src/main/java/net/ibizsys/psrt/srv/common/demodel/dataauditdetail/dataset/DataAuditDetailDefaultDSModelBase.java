/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.common.demodel.dataauditdetail.dataset;


import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.demodel.DEDataSetGroupParamModel;

@DEDataSet(id="7d9fefe4909e0cfffcb467129475b02d",name="DEFAULT",queries= {
    @DEDataSetQuery(queryid="A81A0345-DAFE-42E3-8215-326D98C4FE55",queryname="DEFAULT")
})

/**
 *  实体数据集合[DEFAULT]模型基类
 */
public abstract class DataAuditDetailDefaultDSModelBase extends net.ibizsys.paas.demodel.DEDataSetModelBase {
    public DataAuditDetailDefaultDSModelBase() {
        super();
        this.initAnnotation(DataAuditDetailDefaultDSModelBase.class);
    }




}