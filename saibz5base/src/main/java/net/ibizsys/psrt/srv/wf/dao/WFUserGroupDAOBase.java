/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package net.ibizsys.psrt.srv.wf.dao;

import net.ibizsys.paas.db.IDBDialect;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.core.IDEDBCallContext;
import net.ibizsys.paas.db.DBCallResult;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.dao.DAOGlobal;
import net.ibizsys.paas.dao.IDAO;
import net.ibizsys.paas.entity.IEntity;
import javax.annotation.PostConstruct;

import net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel;
import net.ibizsys.psrt.srv.wf.entity.WFUserGroup;
/**
 * 实体[WFUserGroup] DAO对象基类
 */
public abstract class WFUserGroupDAOBase extends net.ibizsys.psrt.srv.PSRuntimeSysDAOBase<WFUserGroup> {

    private static final long serialVersionUID = -1L;

    public WFUserGroupDAOBase() {
        super();

    }

    @PostConstruct
    public void postConstruct() throws Exception {
        DAOGlobal.registerDAO(getDAOId(), this);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDAOId()
     */
    @Override
    protected String getDAOId() {
        return "net.ibizsys.psrt.srv.wf.dao.WFUserGroupDAO";
    }

    private WFUserGroupDEModel wFUserGroupDEModel;

    /**
    * 获取实体[WFUserGroup]模型对象
    * @return
    */
    public  WFUserGroupDEModel getWFUserGroupDEModel() {
        if(this.wFUserGroupDEModel==null) {
            try {
                this.wFUserGroupDEModel = (WFUserGroupDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFUserGroupDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFUserGroupDEModel;
    }

    /*
     * (non-Javadoc)
     * @see net.ibizsys.paas.dao.DAOBase#getDEModel()
     */
    @Override
    public  IDataEntityModel getDEModel() {
        return this.getWFUserGroupDEModel();
    }



}