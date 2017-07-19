package net.ibizsys.paas.ctrlhandler;

import java.util.ArrayList;

import net.ibizsys.paas.control.tree.ITreeNode;
import net.ibizsys.paas.control.tree.TreeNode;
import net.ibizsys.paas.controller.ViewController;
import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.core.Errors;
import net.ibizsys.paas.core.IDEField;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.ctrlmodel.ITreeDEDataSetNodeModel;
import net.ibizsys.paas.ctrlmodel.ITreeModel;
import net.ibizsys.paas.ctrlmodel.ITreeNodeModel;
import net.ibizsys.paas.ctrlmodel.ITreeNodeRSModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.entity.SimpleEntity;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.web.WebContext;

/**
 * 树视图处理对象基类
 * @author lionlau
 *
 */
public abstract class TreeHandlerBase extends MDCtrlHandlerBase implements ITreeHandler
{
	
	/**
	 * 获取当前的树表格模型
	 * @return
	 */
	protected  ITreeModel getTreeModel()
	{
		return null;
	}
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.ICtrlHandler#getCtrlModel()
	 */
	@Override
	public ICtrlModel getCtrlModel()
	{
		return getTreeModel();
	}
	
	
	/**
	 * @param iTreeNodeFetchContext
	 * @return
	 * @throws Exception
	 */
	public ArrayList<ITreeNode> getAllTreeNodes(ITreeNodeFetchContext iTreeNodeFetchContext)throws Exception
	{
		//ArrayList<ITreeNode> list = new ArrayList<ITreeNode>();
		ArrayList<ITreeNode> treeNodeList = new ArrayList<ITreeNode> ();
		//没有指定节点，判断是否输出根
		if(getTreeModel().isRootVisible())
		{
			//返回根节点
			this.getTreeModel().getRootTreeNodeModel().fillFetchResult(iTreeNodeFetchContext, treeNodeList);
			for(ITreeNode iTreeNode:treeNodeList)
			{
				if(this.isOutputTreeNode(iTreeNodeFetchContext, iTreeNode))
					fillChildTreeNodes( iTreeNodeFetchContext, iTreeNode,  this.getTreeModel().getRootTreeNodeModel());
			}
			//this.fillFetchResult(mdAjaxActionResult, treeNodeList);
			//return mdAjaxActionResult;
		}
		else
		{
			TreeNodeFetchContext treeNodeFetchContext = new TreeNodeFetchContext(iTreeNodeFetchContext);
			treeNodeFetchContext.setRealNodeId( ITreeModel.NODE_ROOTID);
			
			//根不可见
			boolean bRootSelect = false;
			java.util.Iterator<ITreeNodeRSModel> iTreeNodeRSModelModels = this.getTreeModel().getRootTreeNodeModel().getTreeNodeRSModels();
			while(iTreeNodeRSModelModels.hasNext())
			{
				ITreeNodeRSModel iTreeNodeRSModel = iTreeNodeRSModelModels.next();
				if(!isOutputTreeNodeRS(iTreeNodeFetchContext,iTreeNodeRSModel))
					continue;
				
				if (bRootSelect)
				{
//					if (StringHelper.isNullOrEmpty(strRootSelectNode) || StringHelper.compare(strRootSelectNode, iTreeNodeRSModel.getChildTreeNodeId(), true) == 0)
//					{
//						fillTreeNodeFetchResult(treeNodeFetchContext, iTreeNodeRSModel, mdAjaxActionResult);
//						return mdAjaxActionResult;
//					}
				}
				else 
				{
					ArrayList<ITreeNode> treeNodeList2 = new ArrayList<ITreeNode>();
					fillTreeNodeFetchResult(treeNodeFetchContext, iTreeNodeRSModel,treeNodeList2);
					treeNodeList.addAll(treeNodeList2);
				}
			}

		}
		return treeNodeList;

	}
	
	protected void fillChildTreeNodes(ITreeNodeFetchContext iTreeNodeFetchContext,ITreeNode iTreeNode,ITreeNodeModel  iTreeNodeModel)throws Exception
	{
		TreeNodeFetchContext treeNodeFetchContext = new TreeNodeFetchContext(iTreeNodeFetchContext);
		String strTreeNodeId = iTreeNode.getId();
		int nPos = strTreeNodeId.indexOf(ITreeModel.NODE_SEPARATOR);
		if (nPos == -1)
		{
			throw new Exception(StringHelper.format("树节点[%1$s]标识无效", strTreeNodeId));
		}

		String strRealNodeId = strTreeNodeId.substring(nPos + 1);
		treeNodeFetchContext.setRealNodeId(strRealNodeId);
		
		ArrayList<ITreeNode> treeNodeList = new ArrayList<ITreeNode>();
		java.util.Iterator<ITreeNodeRSModel> iTreeNodeRSModelModels = iTreeNodeModel.getTreeNodeRSModels();
		while(iTreeNodeRSModelModels.hasNext())
		{
			ITreeNodeRSModel iTreeNodeRSModel = iTreeNodeRSModelModels.next();
			if(!isOutputTreeNodeRS(iTreeNodeFetchContext,iTreeNodeRSModel))
				continue;
			
			ArrayList<ITreeNode> treeNodeList2 = new ArrayList<ITreeNode>();
			fillTreeNodeFetchResult(treeNodeFetchContext, iTreeNodeRSModel,treeNodeList2);
			treeNodeList.addAll(treeNodeList2);
		}
		for(ITreeNode childTreeNode:treeNodeList)
		{
			if(this.isOutputTreeNode(iTreeNodeFetchContext, childTreeNode))
				iTreeNode.addChildNode(childTreeNode);
		}
		if(iTreeNode.getChildNodes()==null)
			iTreeNode.setLeaf(true);
	}
	
	

	/**
	 * @param iTreeNodeFetchContext
	 * @param iTreeNodeRSModel
	 * @param treeNodeList
	 * @throws Exception
	 */
	protected void fillTreeNodeFetchResult(ITreeNodeFetchContext iTreeNodeFetchContext, ITreeNodeRSModel iTreeNodeRSModel, ArrayList<ITreeNode> treeNodeList) throws Exception
	{
		ITreeNodeModel iTreeNodeModel = this.getTreeModel().getTreeNodeModel(iTreeNodeRSModel.getChildTreeNodeId());
		if (iTreeNodeModel == null)
		{
			throw new Exception(StringHelper.format("无法获取树节点[%1$s]", iTreeNodeRSModel.getChildTreeNodeId()));
		}

		
		// 判断节点类型
		if ((StringHelper.compare(iTreeNodeModel.getTreeNodeType(), ITreeNodeModel.TREENODETYPE_STATIC, true) == 0)
				||(StringHelper.compare(iTreeNodeModel.getTreeNodeType(), ITreeNodeModel.TREENODETYPE_CODELIST, true) == 0))
		{
			ArrayList<ITreeNode> treeNodeList2 = new ArrayList<ITreeNode> ();
			iTreeNodeModel.fillFetchResult(iTreeNodeFetchContext,treeNodeList2);
			for(ITreeNode iTreeNode:treeNodeList2)
			{
				if(this.isOutputTreeNode(iTreeNodeFetchContext, iTreeNode))
				{
					treeNodeList.add(iTreeNode);
					fillChildTreeNodes( iTreeNodeFetchContext, iTreeNode,  iTreeNodeModel);
				}
			}
			return;
		}
		
		if (StringHelper.compare(iTreeNodeModel.getTreeNodeType(), ITreeNodeModel.TREENODETYPE_DE, true) == 0)
		{
			ITreeDEDataSetNodeModel iTreeDEDataSetNodeModel = (ITreeDEDataSetNodeModel)iTreeNodeModel;
			IDataEntityModel iDataEntityModel = DEModelGlobal.getDEModel(iTreeDEDataSetNodeModel.getDEName());
			IService iService  = iDataEntityModel.getService(ViewController.getCurrent().getSessionFactory());
			
			SimpleEntity srcDataEntity = new SimpleEntity();
			srcDataEntity.set("NODEFILTER", iTreeNodeFetchContext.getNodeFilter());

			String[] nodeid = iTreeNodeFetchContext.getRealNodeId().split(ITreeNodeModel.TREENODE_SEPARATOR);
			for (int i = 0; i < nodeid.length; i++)
			{
				if (i == 0)
				{
					srcDataEntity.set("NODEID", nodeid[i]);
				}
				else
				{
					srcDataEntity.set(StringHelper.format("NODEID%1$s", i + 1), nodeid[i]);
				}
			}

			String strSortParam = "";
			String strSortDir = "ASC";

			if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getSortField()))
			{
				IDEField  sortDEField =  iDataEntityModel.getDEField(iTreeDEDataSetNodeModel.getSortField(), false);
				if (sortDEField != null)
				{
				//	strSortParam = sortDEField.getName().GetColumnName();
					strSortParam = sortDEField.getName();
				}

				if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getSortDir()))
					strSortDir = iTreeDEDataSetNodeModel.getSortDir();
			}

			// 判断是否有查询模型
			String strQueryModelId = "";
			if (!StringHelper.isNullOrEmpty(iTreeNodeFetchContext.getNodeFilter()))
			{
				strQueryModelId = iTreeDEDataSetNodeModel.getFilterDEDataSetName();
			}

			if (StringHelper.isNullOrEmpty(strQueryModelId))
				strQueryModelId = iTreeDEDataSetNodeModel.getDEDataSetName();

			DEDataSetFetchContext deDataSetFetchContext = new DEDataSetFetchContext(null);
			deDataSetFetchContext.setActiveDataObject(processActiveDataObject(iTreeNodeFetchContext,iTreeNodeRSModel,srcDataEntity));
			deDataSetFetchContext.setSort(strSortParam);
			deDataSetFetchContext.setSortDir(strSortDir);
			deDataSetFetchContext.setStartRow(0);
			
			DBFetchResult dbFetchResult  =	iService.fetchDataSet(strQueryModelId, deDataSetFetchContext);
			ArrayList<ITreeNode> treeNodeList2 = new ArrayList<ITreeNode> ();
			iTreeDEDataSetNodeModel.fillFetchResult(iTreeNodeFetchContext, treeNodeList2, dbFetchResult.getDataSet().getDataTable(0));
			for(ITreeNode iTreeNode:treeNodeList2)
			{
				if(this.isOutputTreeNode(iTreeNodeFetchContext, iTreeNode))
				{
					treeNodeList.add(iTreeNode);
					fillChildTreeNodes( iTreeNodeFetchContext, iTreeNode,  iTreeNodeModel);
				}
			}
			dbFetchResult.getDataSet().close();
			return;
		}

	}
	
	
	
	@Override
	protected AjaxActionResult onFetch() throws Exception
	{
		MDAjaxActionResult mdAjaxActionResult = new MDAjaxActionResult();
		this.getWebContext().setCurAjaxActionResult(mdAjaxActionResult);
		
		
		TreeNodeFetchContext treeNodeFetchContext = new TreeNodeFetchContext(this.getWebContext());
		
		String strTreeNodeId = this.getCurNodeId(this.getWebContext());
				
		if(StringHelper.isNullOrEmpty(strTreeNodeId) || StringHelper.compare(strTreeNodeId, "#", true) == 0)
		{
			//没有指定节点，判断是否输出根
			if(getTreeModel().isRootVisible())
			{
				//返回根节点
				ArrayList<ITreeNode> treeNodeList = new ArrayList<ITreeNode> ();
				this.getTreeModel().getRootTreeNodeModel().fillFetchResult(treeNodeFetchContext, treeNodeList);
				this.fillFetchResult(mdAjaxActionResult, treeNodeList);
				return mdAjaxActionResult;
			}
			else
			{
				strTreeNodeId = ITreeModel.NODE_ROOTID;
			}
		}
		
		String strRealNodeId = "";
		ITreeNodeModel  treeNode = null;
		boolean bRootSelect = false;
		//String strRootSelectNode = this.getWebContext().getPostValue("srfnodeselect");
		String strRootSelectNode = "";//this.getWebContext().getPostValue("srfnodeselect");
		if (StringHelper.compare(ITreeModel.NODE_ROOTID, strTreeNodeId, true) == 0)
		{
			treeNode = this.getTreeModel().getRootTreeNodeModel();
			strRealNodeId = treeNodeFetchContext.getCatalog();
			bRootSelect = this.getTreeModel().isEnableRootSelect();
		}
		else
		{
			int nPos = strTreeNodeId.indexOf(ITreeModel.NODE_SEPARATOR);
			if (nPos == -1)
			{
				mdAjaxActionResult.setRetCode(Errors.INTERNALERROR);
				mdAjaxActionResult.setErrorInfo(StringHelper.format("树节点[%1$s]标识无效", strTreeNodeId));
				return mdAjaxActionResult;
			}

			String strNodeType = strTreeNodeId.substring(0, nPos);
			strRealNodeId = strTreeNodeId.substring(nPos + 1);
			treeNode = this.getTreeModel().getTreeNodeModel(strNodeType);
		}
//
		if (treeNode == null)
		{
			mdAjaxActionResult.setRetCode(Errors.INTERNALERROR);
			mdAjaxActionResult.setErrorInfo(StringHelper.format("无法获取树节点[%1$s]", strTreeNodeId));
			return mdAjaxActionResult;
		}
		
		treeNodeFetchContext.setRealNodeId(strRealNodeId);
		
		// 循环所有的子节点
		java.util.Iterator<ITreeNodeRSModel> iTreeNodeRSModelModels = treeNode.getTreeNodeRSModels();
		while(iTreeNodeRSModelModels.hasNext())
		{
			ITreeNodeRSModel iTreeNodeRSModel = iTreeNodeRSModelModels.next();
			if(!isOutputTreeNodeRS(treeNodeFetchContext,iTreeNodeRSModel))
				continue;
			
//			if(iTreeNodeRSModel.getTreeNodeRSSelector()!=null)
//			{
//				if(!iTreeNodeRSModel.getTreeNodeRSSelector().Test(this.getWebContext(), this.getTreeView()))
//					continue;
//			}
			
			if (bRootSelect)
			{
				if (StringHelper.isNullOrEmpty(strRootSelectNode) || StringHelper.compare(strRootSelectNode, iTreeNodeRSModel.getChildTreeNodeId(), true) == 0)
				{
					fillTreeNodeFetchResult(treeNodeFetchContext, iTreeNodeRSModel, mdAjaxActionResult);
					return mdAjaxActionResult;
				}
			}
			else 
			{
				fillTreeNodeFetchResult(treeNodeFetchContext, iTreeNodeRSModel, mdAjaxActionResult);
			}
		}
		return mdAjaxActionResult;
	}
	
	
	/**
	 * 判断是否输出指定树关系
	 * @param iTreeNodeRSModel
	 * @return
	 * @throws Exception
	 */
	protected boolean isOutputTreeNodeRS(ITreeNodeFetchContext iTreeNodeFetchContext,ITreeNodeRSModel iTreeNodeRSModel)throws Exception
	{
		return this.getTreeModel().isOutputTreeNodeRS(iTreeNodeFetchContext, iTreeNodeRSModel);
	}
	
	
	/**
	 * 判断是否输出指定树节点
	 * @param iTreeNodeRSModel
	 * @return
	 * @throws Exception
	 */
	protected boolean isOutputTreeNode(ITreeNodeFetchContext iTreeNodeFetchContext,ITreeNode iTreeNode)throws Exception
	{
		return this.getTreeModel().isOutputTreeNode(iTreeNodeFetchContext, iTreeNode);
	}
	
	
	/**
	 * @param iTreeNodeFetchContext
	 * @param iTreeNodeRSModel
	 * @param treeNodeLoadResult
	 * @throws Exception
	 */
	protected void fillTreeNodeFetchResult(ITreeNodeFetchContext iTreeNodeFetchContext, ITreeNodeRSModel iTreeNodeRSModel, MDAjaxActionResult treeNodeLoadResult) throws Exception
	{
		ITreeNodeModel iTreeNodeModel = this.getTreeModel().getTreeNodeModel(iTreeNodeRSModel.getChildTreeNodeId());
		if (iTreeNodeModel == null)
		{
			treeNodeLoadResult.setRetCode(Errors.INTERNALERROR);
			treeNodeLoadResult.setErrorInfo(StringHelper.format("无法获取树节点[%1$s]", iTreeNodeRSModel.getChildTreeNodeId()));
			return;
		}

		
		// 判断节点类型
		if ((StringHelper.compare(iTreeNodeModel.getTreeNodeType(), ITreeNodeModel.TREENODETYPE_STATIC, true) == 0)
				||(StringHelper.compare(iTreeNodeModel.getTreeNodeType(), ITreeNodeModel.TREENODETYPE_CODELIST, true) == 0))
		{
			ArrayList<ITreeNode> treeNodeList = new ArrayList<ITreeNode> ();
			iTreeNodeModel.fillFetchResult(iTreeNodeFetchContext,treeNodeList);
			ArrayList<ITreeNode> treeNodeList2 = new ArrayList<ITreeNode> ();
			for(ITreeNode iTreeNode:treeNodeList)
			{
				if(this.isOutputTreeNode(iTreeNodeFetchContext, iTreeNode))
					treeNodeList2.add(iTreeNode);
			}
			this.fillFetchResult(treeNodeLoadResult, treeNodeList2);
			return;
		}
		
		if (StringHelper.compare(iTreeNodeModel.getTreeNodeType(), ITreeNodeModel.TREENODETYPE_DE, true) == 0)
		{
			ITreeDEDataSetNodeModel iTreeDEDataSetNodeModel = (ITreeDEDataSetNodeModel)iTreeNodeModel;
			IDataEntityModel iDataEntityModel = DEModelGlobal.getDEModel(iTreeDEDataSetNodeModel.getDEName());
			IService iService  = iDataEntityModel.getService(ViewController.getCurrent().getSessionFactory());
			
			SimpleEntity srcDataEntity = new SimpleEntity();
			srcDataEntity.set("NODEFILTER", iTreeNodeFetchContext.getNodeFilter());

			String[] nodeid = iTreeNodeFetchContext.getRealNodeId().split(ITreeNodeModel.TREENODE_SEPARATOR);
			for (int i = 0; i < nodeid.length; i++)
			{
				if (i == 0)
				{
					srcDataEntity.set("NODEID", nodeid[i]);
				}
				else
				{
					srcDataEntity.set(StringHelper.format("NODEID%1$s", i + 1), nodeid[i]);
				}
			}
			
			String strSortParam = "";
			String strSortDir = "ASC";

			if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getSortField()))
			{
				IDEField  sortDEField =  iDataEntityModel.getDEField(iTreeDEDataSetNodeModel.getSortField(), false);
				if (sortDEField != null)
				{
					strSortParam = sortDEField.getName();
				}

				if (!StringHelper.isNullOrEmpty(iTreeDEDataSetNodeModel.getSortDir()))
					strSortDir = iTreeDEDataSetNodeModel.getSortDir();
			}

			// 判断是否有查询模型
			String strQueryModelId = "";
			if (!StringHelper.isNullOrEmpty(iTreeNodeFetchContext.getNodeFilter()))
			{
				strQueryModelId = iTreeDEDataSetNodeModel.getFilterDEDataSetName();
			}

			if (StringHelper.isNullOrEmpty(strQueryModelId))
				strQueryModelId = iTreeDEDataSetNodeModel.getDEDataSetName();

			DEDataSetFetchContext deDataSetFetchContext = new DEDataSetFetchContext(null);
			deDataSetFetchContext.setActiveDataObject(processActiveDataObject(iTreeNodeFetchContext,iTreeNodeRSModel,srcDataEntity));
			deDataSetFetchContext.setSort(strSortParam);
			deDataSetFetchContext.setSortDir(strSortDir);
			deDataSetFetchContext.setStartRow(0);
			deDataSetFetchContext.setPageSize(1000);
			
			DBFetchResult dbFetchResult  =	iService.fetchDataSet(strQueryModelId, deDataSetFetchContext);
			ArrayList<ITreeNode> treeNodeList = new ArrayList<ITreeNode> ();
			iTreeDEDataSetNodeModel.fillFetchResult(iTreeNodeFetchContext, treeNodeList, dbFetchResult.getDataSet().getDataTable(0));
			
			ArrayList<ITreeNode> treeNodeList2 = new ArrayList<ITreeNode> ();
			for(ITreeNode iTreeNode:treeNodeList)
			{
				if(this.isOutputTreeNode(iTreeNodeFetchContext, iTreeNode))
					treeNodeList2.add(iTreeNode);
			}
			this.fillFetchResult(treeNodeLoadResult, treeNodeList2);
			return;
		}

	}
	
	
	/**
	 * 填充数据获取结果
	 * @param fetchResult
	 * @param dt
	 * @throws Exception
	 */
	protected void fillFetchResult(MDAjaxActionResult fetchResult,ArrayList<ITreeNode> treeNodeList)throws Exception
	{
		ICtrlRender iCtrlRender = this.getCtrlRender();
		if(iCtrlRender!=null)
		{
			ITreeRender iTreeRender  = (ITreeRender)iCtrlRender;
			iTreeRender.fillFetchResult(this.getTreeModel(), fetchResult, treeNodeList);
		}
		else
		{
			for(ITreeNode iTreeNode :treeNodeList)
			{
				fetchResult.getRows().add(TreeNode.toJSONObject(iTreeNode,false));
			}
		}
	}
	
	/**
	 * 获取当前请求的树节点
	 * @return
	 * @throws Exception
	 */
	protected String getCurNodeId(IWebContext iWebContext)throws Exception{
		ICtrlRender iCtrlRender = this.getCtrlRender();
		if(iCtrlRender!=null)
		{
			ITreeRender iTreeRender  = (ITreeRender)iCtrlRender;
			return iTreeRender.getNodeId(iWebContext);
		}
		else{
			return WebContext.getNodeId(iWebContext);
		}
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#onProcessAction(java.lang.String)
	 */
	@Override
	protected AjaxActionResult onProcessAction(String strAction) throws Exception
	{
		if(StringHelper.compare(strAction, ACTION_FETCHCAT, true)==0)
		{
			return onFetchCat();
		}
		
		return super.onProcessAction(strAction);
	}
	
	

	/**
	 * 获取树分类数据
	 * @return
	 * @throws Exception
	 */
	protected AjaxActionResult onFetchCat() throws Exception
	{
		MDAjaxActionResult mdAjaxActionResult = new MDAjaxActionResult();
		this.getWebContext().setCurAjaxActionResult(mdAjaxActionResult);
		this.getTreeModel().fillCatFetchResult(mdAjaxActionResult);
		return mdAjaxActionResult;
	}
	
	
	/**
	 * 处理当前数据对象
	 * @param iTreeNodeFetchContext
	 * @param iTreeNodeRSModel
	 * @param iDataObject
	 * @return
	 * @throws Exception
	 */
	protected IEntity processActiveDataObject(ITreeNodeFetchContext iTreeNodeFetchContext, ITreeNodeRSModel iTreeNodeRSModel,IEntity iEntity)throws Exception
	{
		if(StringHelper.isNullOrEmpty(iTreeNodeRSModel.getDEActionName()))
		{
			return iEntity;
		}
		else
		{
			this.getService().executeAction(iTreeNodeRSModel.getDEActionName(), iEntity);
			return iEntity;
		}
			
	}
	
}
