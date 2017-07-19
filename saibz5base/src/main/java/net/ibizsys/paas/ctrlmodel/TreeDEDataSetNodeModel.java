package net.ibizsys.paas.ctrlmodel;

import java.util.ArrayList;

import net.ibizsys.paas.control.tree.ITreeNode;
import net.ibizsys.paas.control.tree.TreeNode;
import net.ibizsys.paas.ctrlhandler.ITreeNodeFetchContext;
import net.ibizsys.paas.data.DataObject;
import net.ibizsys.paas.db.IDataRow;
import net.ibizsys.paas.db.IDataTable;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.SimpleEntity;
import net.ibizsys.paas.util.StringHelper;

/**
 * 实体数据集合树节点模型
 * 
 * @author Administrator
 * 
 */
public class TreeDEDataSetNodeModel extends TreeNodeModelBase implements ITreeDEDataSetNodeModel
{
	private String strDEName = "";

	private String strDEDataSetName = "";

	private String strFilterDEDataSetName = "";

	private String strIdField = "";

	private String strTextField = "";

	private String strIconField = "";

	private String strSortField = "";

	private String strSortDir = "";

	private boolean bDistinctMode = false;
	
	private String strChildCntField = "";

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ITreeNodeModel#getTreeNodeType()
	 */
	@Override
	public String getTreeNodeType()
	{
		return ITreeNodeModel.TREENODETYPE_DE;
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getDEName()
	 */
	@Override
	public String getDEName()
	{
		return this.strDEName;
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getDEDataSetName()
	 */
	@Override
	public String getDEDataSetName()
	{
		return this.strDEDataSetName;
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getFilterDEDataSetName()
	 */
	@Override
	public String getFilterDEDataSetName()
	{
		return this.strFilterDEDataSetName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getIdField()
	 */
	@Override
	public String getIdField()
	{
		return this.strIdField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getTextField()
	 */
	@Override
	public String getTextField()
	{
		return this.strTextField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getIconField()
	 */
	@Override
	public String getIconField()
	{
		return strIconField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getSortField()
	 */
	@Override
	public String getSortField()
	{
		return strSortField;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getSortDir()
	 */
	@Override
	public String getSortDir()
	{
		return this.strSortDir;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#isDistinctMode()
	 */
	@Override
	public boolean isDistinctMode()
	{
		return this.bDistinctMode;
	}

	/**
	 * 设置实体对象名称
	 * @param strDEName
	 *            the strDEName to set
	 */
	public void setDEName(String strDEName)
	{
		this.strDEName = strDEName;
	}

	/**
	 * 设置实体结果集合名称
	 * @param strDEDataSetName
	 *            the strDEDataSetName to set
	 */
	public void setDEDataSetName(String strDEDataSetName)
	{
		this.strDEDataSetName = strDEDataSetName;
	}

	/**
	 * 设置实体过滤结果集合名称
	 * @param strFilterDEDataSetName
	 *            the strFilterDEDataSetName to set
	 */
	public void setFilterDEDataSetName(String strFilterDEDataSetName)
	{
		this.strFilterDEDataSetName = strFilterDEDataSetName;
	}

	/**
	 * 设置树节点标识值属性
	 * @param strIdField
	 *            the strIdField to set
	 */
	public void setIdField(String strIdField)
	{
		this.strIdField = strIdField;
	}

	/**
	 * 设置树节点文本值属性
	 * @param strTextField
	 *            the strTextField to set
	 */
	public void setTextField(String strTextField)
	{
		this.strTextField = strTextField;
	}

	/**
	 * 设置树节点图标属性
	 * @param strIconField
	 *            the strIconField to set
	 */
	public void setIconField(String strIconField)
	{
		this.strIconField = strIconField;
	}

	/**
	 * 设置默认排序方向
	 * @param strSortDir
	 *            the strSortDir to set
	 */
	public void setSortDir(String strSortDir)
	{
		this.strSortDir = strSortDir;
	}

	/**
	 * 设置默认排序属性
	 * @param strSortField
	 *            the strSortField to set
	 */
	public void setSortField(String strSortField)
	{
		this.strSortField = strSortField;
	}

	/**
	 * 设置唯一化数据
	 * @param bDistinctMode
	 *            the bDistinctMode to set
	 */
	public void setDistinctMode(boolean bDistinctMode)
	{
		this.bDistinctMode = bDistinctMode;
	}
	
	
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.TreeNodeModelBase#fillFetchResult(net.ibizsys.paas.ctrlhandler.ITreeNodeFetchContext, java.util.ArrayList, net.ibizsys.paas.db.IDataTable)
	 */
	@Override
	public void fillFetchResult(ITreeNodeFetchContext iTreeNodeFetchContext,  ArrayList<ITreeNode> treeNodeList, IDataTable dt) throws Exception
	{
		fillFetchResult(this, iTreeNodeFetchContext, treeNodeList, dt);
	}

	/**
	 * 填充结果返回对象
	 * @param iTreeDEDataSetNodeModel
	 * @param iTreeNodeFetchContext
	 * @param treeNodeList
	 * @param dt
	 * @throws Exception
	 */
	public static void fillFetchResult(ITreeDEDataSetNodeModel iTreeDEDataSetNodeModel, ITreeNodeFetchContext iTreeNodeFetchContext,  ArrayList<ITreeNode> treeNodeList, IDataTable dt) throws Exception
	{
		IDataEntityModel iDataEntityModel = DEModelGlobal.getDEModel(iTreeDEDataSetNodeModel.getDEName());
		String strIdField = iDataEntityModel.getKeyDEField().getName();
		if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getIdField()))
		{
			strIdField = iDataEntityModel.getDEField(iTreeDEDataSetNodeModel.getIdField(), false).getName();
		}
		String strTextField = iDataEntityModel.getMajorDEField().getName();
		if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getTextField()))
		{
			strTextField = iDataEntityModel.getDEField(iTreeDEDataSetNodeModel.getTextField(), false).getName();
		}
		String strIconField = "";
		if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getIconField()))
		{
			strIconField = iDataEntityModel.getDEField(iTreeDEDataSetNodeModel.getIconField(), false).getName();
		}
		
		String strChildCntField = "";
		if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getChildCntField()))
		{
			strChildCntField = iDataEntityModel.getDEField(iTreeDEDataSetNodeModel.getChildCntField(), false).getName();
		}
		

		if (dt.getCachedRowCount() == -1)
		{
			while (true)
			{
				IDataRow iDataRow = dt.next();
				if (iDataRow == null)
					break;

				TreeNode treeNode = new TreeNode();
				fillTreeNode(treeNode, iTreeDEDataSetNodeModel, iTreeNodeFetchContext, iDataRow, strIdField, strTextField, strIconField,strChildCntField);
				treeNodeList.add(treeNode);
			}
		}
		else
		{
			int nRows = dt.getCachedRowCount();
			for (int i = 0; i < nRows; i++)
			{
				IDataRow iDataRow = dt.getCachedRow(i);
				TreeNode treeNode = new TreeNode();
				fillTreeNode(treeNode, iTreeDEDataSetNodeModel, iTreeNodeFetchContext, iDataRow, strIdField, strTextField, strIconField,strChildCntField);
				treeNodeList.add(treeNode);
			}
		}

	}

	/**
	 * 填充树节点对象
	 * @param treeNode
	 * @param iTreeDEDataSetNodeModel
	 * @param iTreeNodeFetchContext
	 * @param iDataRow
	 * @param strIdField
	 * @param strTextField
	 * @param strIconField
	 * @param strChildCntField
	 * @throws Exception
	 */
	public static void fillTreeNode(TreeNode treeNode, ITreeDEDataSetNodeModel iTreeDEDataSetNodeModel, ITreeNodeFetchContext iTreeNodeFetchContext, IDataRow iDataRow, String strIdField,
			String strTextField, String strIconField,String strChildCntField) throws Exception
	{
		String strNodeId = iTreeDEDataSetNodeModel.getId();
		strNodeId += ITreeNodeModel.TREENODE_SEPARATOR;
		strNodeId += iDataRow.get(strIdField);
		if (!StringHelper.isNullOrEmpty(iTreeNodeFetchContext.getRealNodeId()))
		{
			if (iTreeDEDataSetNodeModel.isAppendPNodeId())
			{
				strNodeId += ITreeNodeModel.TREENODE_SEPARATOR;
				strNodeId += iTreeNodeFetchContext.getRealNodeId();
			}
		}

		treeNode.setId(strNodeId);

		treeNode.setText((String) iDataRow.get(strTextField));
		if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getIconCls()))
		{
			treeNode.setIconCssClass(iTreeDEDataSetNodeModel.getIconCls());
		}
		else
		{
			String strIconPath = "";
			if (!StringHelper.isNullOrEmpty(strIconField))
			{
				strIconPath = (String) iDataRow.get(strIconField);
			}

			// if (StringHelper.isNullOrEmpty(strIconPath))
			// {
			// strIconPath =
			// iDataCtrl.GetDEHelper().getDataEntity().getSMALLICON();
			// }

			treeNode.setIcon(strIconPath);
		}

		treeNode.setAsyncMode(true);
		if(StringHelper.isNullOrEmpty(strChildCntField)){
			treeNode.setLeaf(!iTreeDEDataSetNodeModel.hasTreeNodeRSModel());
		}
		else
		{
			int nChildCount = DataObject.getIntegerValue(iDataRow.get(strChildCntField), 0);
			treeNode.setLeaf(nChildCount==0);
		}
		
		treeNode.setExpanded(iTreeDEDataSetNodeModel.isExpanded() || iTreeNodeFetchContext.isAutoExpand());
		treeNode.setEnableCheck(iTreeDEDataSetNodeModel.isEnableCheck());
		if (iTreeDEDataSetNodeModel.isEnableCheck())
			treeNode.setChecked(iTreeDEDataSetNodeModel.isChecked());

		if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getNodeType()))
		{
			treeNode.setTagValue("srfnodetype", iTreeDEDataSetNodeModel.getNodeType());
			treeNode.setTreeNodeType(iTreeDEDataSetNodeModel.getNodeType());
		}

		treeNode.setTagValue("srfkey", iDataRow.get(strIdField));
		treeNode.setTagValue("srfmajortext", iDataRow.get(strTextField));
		SimpleEntity simpleEntity = new SimpleEntity();
		DataObject.fromDataRow(simpleEntity, iDataRow);
		treeNode.setDataSource(simpleEntity);
	}


	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel#getChildCntField()
	 */
	@Override
	public String getChildCntField() {
		return this.strChildCntField;
	}
	
	
	/**
	 * 设置子节点数量字段
	 * @param strChildCntField
	 */
	public void setChildCntField(String strChildCntField){
		this.strChildCntField = strChildCntField;
	}
	
	
	
}
