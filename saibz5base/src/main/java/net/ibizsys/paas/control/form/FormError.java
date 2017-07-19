package net.ibizsys.paas.control.form;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.text.StyledEditorKit.BoldAction;

import net.ibizsys.paas.data.IDataObject;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 表单错误对象
 * @author lionlau
 *
 */
public class FormError
{
	private ArrayList<FormItemError> formItemErrorList = new ArrayList<FormItemError>();
	private String strErrorInfo = "";
	
	/**
	 * 注册错误信息
	 * @param strFormItemId 表单项标识
	 * @param strCaption 标题
	 * @param nErrorType 错误类型
	 * @param strErrorInfo 错误信息
	 */
	public void register(String strFormItemId,String strCaption,String strCapLanId, int nErrorType,String strErrorInfo)
	{
		FormItemError formItemError = new FormItemError();
		formItemError.setFormItemId(strFormItemId);
		formItemError.setErrorType(nErrorType);
		formItemError.setErrorInfo(strErrorInfo);
		formItemErrorList.add(formItemError);
	}
	
	
	/**
	 * 获取表单项错误清单
	 * @return
	 */
	public ArrayList<FormItemError> getFormItemErrorList()
	{
		return this.formItemErrorList;
	}
	
	
	/**
	 * 表单是否有错误
	 * @return
	 */
	public boolean hasError()
	{
		return this.formItemErrorList.size()>0;
	}
	
	
	/**
	 * 导出到JSON对象
	 * @param jsonObject 
	 * @return
	 * @throws Exception
	 */
	public JSONObject toJSONObject(JSONObject jsonObject) throws Exception
	{
		if(jsonObject == null)
			jsonObject = new JSONObject();
		Vector<JSONObject> arr = new Vector<JSONObject>();
		for(FormItemError formItemError:formItemErrorList )
		{
			arr.add(formItemError.toJSONObject());
		}
		
		jsonObject.put("items", JSONArray.fromArray(arr.toArray()));
		return jsonObject;
	}


	/**
	 * 获取错误信息
	 * @return the strErrorInfo
	 */
	public String getErrorInfo()
	{
		return strErrorInfo;
	}


	/**
	 * 设置错误信息
	 * @param strErrorInfo the strErrorInfo to set
	 */
	public void setErrorInfo(String strErrorInfo)
	{
		this.strErrorInfo = strErrorInfo;
	}
	
}
