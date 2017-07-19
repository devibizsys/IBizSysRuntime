package net.ibizsys.paas.demodel;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;

import net.ibizsys.paas.core.DEDataSet;
import net.ibizsys.paas.core.DEDataSetQuery;
import net.ibizsys.paas.core.IDEDataQuery;
import net.ibizsys.paas.core.IDEDataSetFetchContext;
import net.ibizsys.paas.core.IDEDataSetGroupParam;
import net.ibizsys.paas.core.IDEDataSetQuery;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.db.DBFetchResult;

/**
 * 实体数据集合模型
 * @author lionlau
 *
 */
public abstract class DEDataSetModelBase implements IDEDataSetModel
{
	private IDataEntity iDataEntity = null;
	private DEDataSet deDataSetAnno = null;
	private boolean bEnableGroup = false;
	private int nGroupTopCount = -1;
	protected ArrayList<IDEDataSetGroupParam> deDataSetGroupParamList = new ArrayList<IDEDataSetGroupParam>();
			
	
	private ArrayList<IDEDataSetQuery> deDataSetQueryList = new ArrayList<IDEDataSetQuery>();
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IDEDataSet#init(net.ibizsys.paas.core.IDataEntity)
	 */
	public void init(IDataEntity iDataEntity)throws Exception{
		this.setDataEntity(iDataEntity);
		this.prepareDEDataSetGroupParams();
		this.onInit();
	}
	
	/**
	 * 初始化触发
	 * @throws Exception
	 */
	protected void onInit()throws Exception{
		
		if(deDataSetAnno!=null)
		{
			for(DEDataSetQuery deDataSetQuery:deDataSetAnno.queries())
			{
				deDataSetQueryList.add(new DEDataSetQueryModel(deDataSetQuery));
			}
		}	
	}
	
	
	/**
	 * 准备分组参数
	 * @throws Exception
	 */
	protected void prepareDEDataSetGroupParams() throws Exception
	{
		
	}
	
	
	/**
	 * 初始化注解
	 * @param c
	 * @throws Exception
	 */
	protected void initAnnotation(Class c){
		Annotation[] annotations = c.getAnnotations();
		if (annotations != null){
			for (Annotation annotation : annotations){
				if (annotation instanceof DEDataSet){
					setDEDataSetAnno( (DEDataSet)annotation);
					continue;
				}
			}
		} 
	}

	/**
	 * 获取实体模型对象
	 * @return the iDataEntity
	 */
	public IDataEntity getDataEntity()
	{
		return iDataEntity;
	}

	/**
	 * 设置实体模型对象
	 * @param iDataEntity the iDataEntity to set
	 */
	protected void setDataEntity(IDataEntity iDataEntity)
	{
		this.iDataEntity = iDataEntity;
	}

	/**
	 * 获取结果集对象注解
	 * @return the deDataSet
	 */
	public DEDataSet getDEDataSetAnno()
	{
		return deDataSetAnno;
	}

	/**
	 * 设置结果集对象注解
	 * @param deDataSet the deDataSet to set
	 */
	protected void setDEDataSetAnno(DEDataSet deDataSetAnno)
	{
		this.deDataSetAnno = deDataSetAnno;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.demodel.IModelBase#getId()
	 */
	@Override
	public String getId()
	{
		return getDEDataSetAnno().id();
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.demodel.IModelBase#getName()
	 */
	@Override
	public String getName()
	{
		return getDEDataSetAnno().name();
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.demodel.IDEDataSetModel#getDEDataSetQuerys()
	 */
	@Override
	public Iterator<IDEDataSetQuery> getDEDataSetQueries()
	{
		return this.deDataSetQueryList.iterator();
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IDEDataSet#getDEDataQueries()
	 */
	@Override
	public Iterator<IDEDataQuery> getDEDataQueries() throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.demodel.IDEDataSetModel#isCustomDS()
	 */
	@Override
	public boolean isCustomDS()
	{
		return false;
	}
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.demodel.IDEDataSetModel#fetchDEDataSet(net.ibizsys.paas.core.IDEDataSetFetchContext)
	 */
	@Override
	public DBFetchResult fetchDEDataSet(IDEDataSetFetchContext iDEDataSetFetchContext) throws Exception
	{
		throw new Exception("没有实现");
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IDEDataSet#isEnableGroup()
	 */
	@Override
	public boolean isEnableGroup()
	{
		return this.bEnableGroup;
	}
	
	/**
	 * 设置是否启用分组
	 * @param bEnableGroup
	 */
	protected void setEnableGroup(boolean bEnableGroup)
	{
		this.bEnableGroup = bEnableGroup;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IDEDataSet#getDEDataSetGroupParams()
	 */
	@Override
	public Iterator<IDEDataSetGroupParam> getDEDataSetGroupParams()
	{
		return this.deDataSetGroupParamList.iterator();
	}
	
	/**
	 * 注册分组参数
	 * @param iDEDataSetGroupParam
	 */
	protected void registerDEDataSetGroupParam(IDEDataSetGroupParam iDEDataSetGroupParam)
	{
		this.deDataSetGroupParamList.add(iDEDataSetGroupParam);
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IDEDataSet#getGroupTopCount()
	 */
	@Override
	public int getGroupTopCount()
	{
		return this.nGroupTopCount;
	}
	
	/**
	 * 设置分组Top记录数
	 * @param nGroupTopCount
	 */
	protected void setGroupTopCount(int nGroupTopCount)
	{
		this.nGroupTopCount = nGroupTopCount;
	}
	
	
}
