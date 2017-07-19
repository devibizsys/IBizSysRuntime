package net.ibizsys.paas.ctrlmodel;

import net.ibizsys.paas.core.ModelBaseImpl;

/**
 * 树节点关系模型基类
 * @author Administrator
 *
 */
public abstract  class TreeNodeRSModelBase extends ModelBaseImpl implements ITreeNodeRSModel
{
	private String strParentTreeNodeId = "";
	private ITreeModel iTreeModel = null;
	private String strChildTreeNodeId = "";
	private String strDEActionName = null;
	
	/**
	 * 初始化
	 * @param iTreeModel
	 * @throws Exception
	 */
	public void init(ITreeModel iTreeModel)throws Exception
	{
		this.iTreeModel = iTreeModel;
		this.onInit();
	}
	
	/**
	 * 获取树模型对象
	 * @return
	 */
	public ITreeModel getTreeModel()
	{
		return this.iTreeModel;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.ITreeNodeRSModel#getParentTreeNodeId()
	 */
	@Override
	public String getParentTreeNodeId()
	{
		return this.strParentTreeNodeId;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.ITreeNodeRSModel#getChildTreeNodeId()
	 */
	@Override
	public String getChildTreeNodeId()
	{
		return strChildTreeNodeId;
	}

	/**
	 * 设置父节点标识
	 * @param strParentTreeNodeId the strParentTreeNodeId to set
	 */
	public void setParentTreeNodeId(String strParentTreeNodeId)
	{
		this.strParentTreeNodeId = strParentTreeNodeId;
	}

	/**
	 * 设置子节点标识
	 * @param strChildTreeNodeId the strChildTreeNodeId to set
	 */
	public void setChildTreeNodeId(String strChildTreeNodeId)
	{
		this.strChildTreeNodeId = strChildTreeNodeId;
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.ITreeNodeRSModel#getDEActionName()
	 */
	@Override
	public String getDEActionName()
	{
		return this.strDEActionName;
	}
	
	/**
	 * 设置处理的行为名称
	 * @param strDEActionName
	 */
	public void setDEActionName(String strDEActionName)
	{
		this.strDEActionName = strDEActionName;
	}
}
