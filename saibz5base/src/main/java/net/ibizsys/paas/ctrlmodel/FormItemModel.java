package net.ibizsys.paas.ctrlmodel;

import java.util.ArrayList;
import java.util.Iterator;

import net.ibizsys.paas.codelist.ICodeItem;
import net.ibizsys.paas.codelist.ICodeList;
import net.ibizsys.paas.codelist.IDynamicCodeList;
import net.ibizsys.paas.control.form.IFIDEACMode;
import net.ibizsys.paas.control.form.IFIDEFValueRule;
import net.ibizsys.paas.control.form.IForm;
import net.ibizsys.paas.control.form.IFormItem;
import net.ibizsys.paas.core.IDEField;
import net.ibizsys.paas.core.IValueTranslator;
import net.ibizsys.paas.core.ModelBaseImpl;
import net.ibizsys.paas.data.IDataItem;
import net.ibizsys.paas.data.IDataObject;
import net.ibizsys.paas.sysmodel.CodeListGlobal;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.util.DefaultValueHelper;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.IWebContext;
import net.ibizsys.psrt.srv.common.service.UserDictCatService;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 表单项模型对象
 * @author lionlau
 *
 */
public class FormItemModel extends ModelBaseImpl implements  IFormItemModel
{
	private static final Log log = LogFactory.getLog(FormItemModel.class);
	
	protected IForm iForm = null;

	protected IDataItem iDataItem = null;

	private IFIDEACMode iFIDEACMode = null;

	private IDEField iDEField = null;

	private ArrayList<IFIDEFValueRule> fiDEFValueRuleList = null;

	
	private String strCodeListId = "";
	private String strUserDictCatId = "";
	private int nEnableCond = IFormItem.ENABLECOND_ALL;
	private String strCreateDVT = "";
	private String strCreateDV = "";
	private String strUpdateDVT = "";
	private String strUpdateDV = "";

	private String strCaption = "";
	private boolean bAllowEmpty = true;

	private String strCapLanId = "";
	
	private String strValueRuleId = null;
	
	private int nIgnoreInput = IFormItem.IGNOREINPUT_NONE;
	
	private boolean bOutputCodeListConfig = false;
	
	private String strValueItemName = "";
	
	
	/**
	 * 值处理器
	 */
	private String strValueTranslator = "";
	
	private IValueTranslator iValueTranslator = null;
	
	private String strDEFName;
	
	public FormItemModel(){
	}
	
	
	/**
	 * 初始化表单项
	 * @throws Exception
	 */
	public void init() throws Exception
	{
		if(!StringHelper.isNullOrEmpty(this.getValueTranslator()))
		{
			IFormModel iFormModel = (IFormModel)this.getForm();
			if(iFormModel.getViewController()!=null)
			{
				iValueTranslator = iFormModel.getViewController().getSystemModel().getValueTranslator(this.getValueTranslator());
			}
		}
	}

	/**
	 * 设置表单部件对象
	 * @param iForm
	 */
	public void setForm(IForm iForm)
	{
		this.iForm = iForm;
	}
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getForm()
	 */
	@Override
	public IForm getForm()
	{
		return iForm;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.IFormItemModel#getFormModel()
	 */
	@Override
	public IFormModel getFormModel() {
		return (IFormModel) getForm();
	}


	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getDataItem()
	 */
	@Override
	public IDataItem getDataItem()
	{
		return iDataItem;
	}

	
	/**
	 * 设置表单项数据对象
	 * @param iDataItem
	 */
	public void setDataItem(IDataItem iDataItem)
	{
		this.iDataItem = iDataItem;
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.IFormItemModel#getInputValue(net.ibizsys.paas.web.IWebContext)
	 */
	@Override
	public Object getInputValue(IWebContext iWebContext) throws Exception
	{
		String strValue = null;

		strValue = iWebContext.getPostValue(this.getName());
		if (strValue == null)
			return null;
		
		if(iValueTranslator!=null)
			return iValueTranslator.convert(strValue);
		
		return DataTypeHelper.parse(this.getDataItem().getDataType(), strValue);

	}
	
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.IFormItemModel#getInputValue(net.sf.json.JSONObject)
	 */
	@Override
	public Object getInputValue(JSONObject jsonObject) throws Exception
	{
		String strValue = null;
		strValue = jsonObject.optString(this.getName());
		if (strValue == null)
			return null;
		
		if(iValueTranslator!=null)
			return iValueTranslator.convert(strValue);
		
		return DataTypeHelper.parse(this.getDataItem().getDataType(), strValue);

	}
	

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getOutputValue(net.ibizsys.paas.web.IWebContext, net.ibizsys.paas.data.IDataObject, boolean)
	 */
	@Override
	public Object getOutputValue(IWebContext iWebContext, IDataObject iDataObject, boolean bString) throws Exception
	{
		if (getDataItem() != null)
		{
			return this.getDataItem().getValue(iWebContext, iDataObject);
		}
		return iDataObject.get(this.getName());
	}

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getPrivilegeId()
	 */
	@Override
	public String getPrivilegeId()
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.form.IFormItem#getValueItemName()
	 */
	@Override
	public String getValueItemName()
	{
		return this.strValueItemName;
	}

	
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.form.IFormItem#getFIDEACMode()
	 */
	@Override
	public IFIDEACMode getFIDEACMode()
	{
		return iFIDEACMode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.form.IFormItem#getFIDEFValueRules()
	 */
	@Override
	public Iterator<IFIDEFValueRule> getFIDEFValueRules()
	{
		if (fiDEFValueRuleList == null || fiDEFValueRuleList.size() == 0)
			return null;
		return fiDEFValueRuleList.iterator();

	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.form.IFormItem#getDEFName()
	 */
	@Override
	public String getDEFName()
	{
		return this.strDEFName;
	}


	/**
	 * 设置表单项相关自填模式
	 * @param iFIDEACMode
	 * 	  the iFIDEACMode to set
	 */
	protected void setFIDEACMode(IFIDEACMode iFIDEACMode)
	{
		this.iFIDEACMode = iFIDEACMode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.ibizsys.paas.control.form.IFormItem#getDEField()
	 */
	@Override
	public IDEField getDEField()
	{
		return iDEField;
	}

	
	/**
	 * 设置表单项相关属性对象
	 * @param iDEField
	 */
	protected void setDEField(IDEField iDEField)
	{
		this.iDEField = iDEField;
	}


	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getEnableCond()
	 */
	@Override
	public int getEnableCond()
	{
		return nEnableCond;
	}


	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getCreateDVT()
	 */
	@Override
	public String getCreateDVT()
	{
		return this.strCreateDVT;
	}
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getCreateDV()
	 */
	@Override
	public String getCreateDV()
	{
		return strCreateDV;
	}


	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getUpdateDVT()
	 */
	@Override
	public String getUpdateDVT()
	{
		return this.strUpdateDVT;
	}
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getUpdateDV()
	 */
	@Override
	public String getUpdateDV()
	{
		return this.strUpdateDV;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getCodeList()
	 */
	@Override
	public ICodeList getCodeList()throws Exception
	{
		if(StringHelper.isNullOrEmpty(this.getCodeListId()))
			return null;
		return  CodeListGlobal.getCodeList(this.getCodeListId());

	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getCaption()
	 */
	@Override
	public String getCaption()
	{
		//return this.formItem.caption();
		return this.strCaption;
	}
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#isAllowEmpty()
	 */
	@Override
	public boolean isAllowEmpty()
	{
		return bAllowEmpty;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getCapLanId()
	 */
	@Override
	public String getCapLanId()
	{
		return this.strCapLanId;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.IFormItemModel#getDefaultValue(net.ibizsys.paas.web.IWebContext, boolean)
	 */
	@Override
	public Object getDefaultValue(IWebContext iWebContext, boolean bUpdate) throws Exception
	{
		if(!bUpdate)
		{
			return DefaultValueHelper.getValue(iWebContext, this.getCreateDVT(), this.getCreateDV(),this.getDataItem().getDataType());
		}
		else
		{	
			return DefaultValueHelper.getValue(iWebContext, this.getUpdateDVT(), this.getUpdateDV(),this.getDataItem().getDataType());
		}
	}

	/**
	 * 设置表单项值项是否允许空输入
	 * @param bAllowEmpty the bAllowEmpty to set
	 */
	public void setAllowEmpty(boolean bAllowEmpty)
	{
		this.bAllowEmpty = bAllowEmpty;
	}

	/**
	 * 设置表单项值项名称
	 * @param strValueItemName the strValueItemName to set
	 */
	public void setValueItemName(String strValueItemName)
	{
		this.strValueItemName = strValueItemName;
	}

	/**
	 * 设置表单项相关属性名称
	 * @param strDEFName the strDEFName to set
	 */
	public void setDEFName(String strDEFName)
	{
		this.strDEFName = strDEFName;
	}

	/**
	 * 设置表单项启用条件
	 * @param nEnableCond the nEnableCond to set
	 */
	public void setEnableCond(int nEnableCond)
	{
		this.nEnableCond = nEnableCond;
	}

	/**
	 * 设置新建默认值类型
	 * @param strCreateDVT the strCreateDVT to set
	 */
	public void setCreateDVT(String strCreateDVT)
	{
		this.strCreateDVT = strCreateDVT;
	}

	/**
	 * 设置新建默认值
	 * @param strCreateDV the strCreateDV to set
	 */
	public void setCreateDV(String strCreateDV)
	{
		this.strCreateDV = strCreateDV;
	}

	/**
	 * 设置更新默认值类型
	 * @param strUpdateDVT the strUpdateDVT to set
	 */
	public void setUpdateDVT(String strUpdateDVT)
	{
		this.strUpdateDVT = strUpdateDVT;
	}

	/**
	 * 设置更新默认值
	 * @param strUpdateDV the strUpdateDV to set
	 */
	public void setUpdateDV(String strUpdateDV)
	{
		this.strUpdateDV = strUpdateDV;
	}

	/**
	 * 设置标题
	 * @param strCaption the strCaption to set
	 */
	public void setCaption(String strCaption)
	{
		this.strCaption = strCaption;
	}

	/**
	 * 设置标题语言资源标识
	 * @param strCapLanId the strCapLanId to set
	 */
	public void setCapLanId(String strCapLanId)
	{
		this.strCapLanId = strCapLanId;
	}

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getCodeListId()
	 */
	@Override
	public String getCodeListId()
	{
		return this.strCodeListId;
	}

	/**
	 * 设置代码表标识
	 * @param strCodeListId the strCodeListId to set
	 */
	public void setCodeListId(String strCodeListId)
	{
		this.strCodeListId = strCodeListId;
	}

	/**
	 * 设置表单项名称
	 * @param strName
	 */
	public void setName(String strName)
	{
		this.strName = strName;
	}
	
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getValueRuleId()
	 */
	@Override
	public String getValueRuleId()
	{
		return this.strValueRuleId;
	}


	/**
	 * 设置值规则标识
	 * @param strValueRuleId
	 */
	public void setValueRuleId(String strValueRuleId)
	{
		this.strValueRuleId = strValueRuleId;
	}
	

	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getIgnoreInput()
	 */
	@Override
	public int getIgnoreInput()
	{
		return this.nIgnoreInput;
	}
	
	
	/**
	 * 设置是否忽略输入值
	 * @param nIgnoreInput
	 */
	public void setIgnoreInput(int nIgnoreInput)
	{
		this.nIgnoreInput = nIgnoreInput;
	}




	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getConfig(net.ibizsys.paas.web.IWebContext, net.ibizsys.paas.data.IDataObject, boolean)
	 */
	@Override
	public JSONObject getConfig(IWebContext iWebContext, IDataObject iDataObject, boolean bUpdate) throws Exception
	{
		if(getCodeList()!=null)
		{
			if(isOutputCodeListConfig())
			{
				ICodeList iCodeList = getCodeList();
				if(iCodeList!=null)
				{
					JSONObject config = new JSONObject();
					fillCodeListConfig(config, iCodeList, iWebContext,  iDataObject,"items");
					return config;
				}
			}
			return null;
		}
		
		if(!StringHelper.isNullOrEmpty(this.getUserDictCatId()))
		{
			//获取用户输入词条的代码表标识
			String strUserDictCatCodeListId = UserDictCatService.calcUserDictCatCodeListId(getUserDictCatId());
			ICodeList iCodeList =  CodeListGlobal.getCodeList(strUserDictCatCodeListId);
			JSONObject config = new JSONObject();
			fillCodeListConfig(config, iCodeList, iWebContext,  iDataObject,"dictitems");
			return config;
		}
		return null;
	}

	/**
	 *  填充表单项代码表配置
	 * @param config 
	 * @param iCodeList
	 * @param iWebContext
	 * @param iDataObject
	 * @param strPropertyName
	 * @throws Exception
	 */
	protected void fillCodeListConfig(JSONObject config,ICodeList iCodeList,IWebContext iWebContext, IDataObject iDataObject,String strPropertyName)throws Exception
	{
		java.util.Iterator<ICodeItem> codeItems = null;
		if(iCodeList instanceof IDynamicCodeList)
		{
			IDynamicCodeList iDynamicCodeList = (IDynamicCodeList)iCodeList;
			codeItems = iDynamicCodeList.queryCodeItems(iWebContext, iDataObject); 
		}
		else
			codeItems  =iCodeList.getCodeItems();
		ArrayList<JSONObject> itemList = new ArrayList<JSONObject>();
		while(codeItems.hasNext())
		{
			ICodeItem iCodeItem = codeItems.next();
			JSONObject item= new JSONObject();
			item.put("text", iCodeItem.getText());
			item.put("value", iCodeItem.getValue());
			if(!StringHelper.isNullOrEmpty(iCodeItem.getParentValue())){
				item.put("pvalue", iCodeItem.getParentValue());
			}
			itemList.add(item);
		}
		
		config.put(strPropertyName, itemList.toArray());
	}


	/* (non-Javadoc)
	 * @see net.ibizsys.paas.ctrlmodel.IFormItemModel#isOutputCodeListConfig()
	 */
	@Override
	public boolean isOutputCodeListConfig()
	{
		return bOutputCodeListConfig;
	}
	
	/**
	 * 设置输出代码表配置
	 * @param bOutputCodeListConfig
	 */
	public void setOutputCodeListConfig(boolean bOutputCodeListConfig)
	{
		this.bOutputCodeListConfig = bOutputCodeListConfig;
	}




	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getValueTranslator()
	 */
	@Override
	public String getValueTranslator()
	{
		return this.strValueTranslator;
	}
	
	/**
	 * 设置值转换器对象
	 * @param strValueTranslator
	 */
	public void setValueTranslator(String strValueTranslator)
	{
		this.strValueTranslator = strValueTranslator;
	}
	
	/* (non-Javadoc)
	 * @see net.ibizsys.paas.control.form.IFormItem#getUserDictCatId()
	 */
	@Override
	public String getUserDictCatId()
	{
		return this.strUserDictCatId;
	}

	
	/**
	 * 设置用户词条标识
	 * @param strUserDictCatId
	 */
	public void setUserDictCatId(String strUserDictCatId)
	{
		this.strUserDictCatId = strUserDictCatId;
	}
	
}
