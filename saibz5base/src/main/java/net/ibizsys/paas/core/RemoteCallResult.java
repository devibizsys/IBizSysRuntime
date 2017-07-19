package net.ibizsys.paas.core;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 远程调用结果对象
 * @author lionlau
 *
 */
public class RemoteCallResult extends CallResult
{
	private Object content = null;
	private JSONArray jaContent = null;
	private JSONObject joContent = null;
	
	public void from(JSONObject joRet )
	{
		this.setRetCode(joRet.optInt("ret", Errors.OK));
		this.setErrorInfo(joRet.optString("info"));
		
		this.content = joRet.opt("content");
		if(this.content!=null)
		{
			if(this.content instanceof JSONArray)
			{
				jaContent = (JSONArray)this.content;
			}
			
			if(this.content instanceof JSONObject)
			{
				joContent = (JSONObject)this.content;
			}
		}
		
		
//		this.set(joRet.optString("url"));
//		objJSON.put("ret", this.nRetCode);
//		objJSON.put("info", this.strErrorInfo);
//		objJSON.put("url", this.strGotoPath);
//		objJSON.put("code", this.strJSCode);
//		objJSON.put("bcode", this.strJSBeforeCode);
//		
//		if(this.getRetCode()!=Errors.OK)
//		{
//			objJSON.put("success",false);
//			objJSON.put("errorMessage",this.getErrorInfo());
//		}
//		else
//		{
//			objJSON.put("success",true);
//		}
		
		
	}
	
	
	/**
	 * 获取返回内容对象
	 * @return
	 */
	public Object getContent()
	{
		return content;
	}
	
	/**
	 * 获取返回内容对象（JSONArray）
	 * @return
	 */
	public JSONArray getJAContent()
	{
		return this.jaContent;
	}
	
	/**
	 * 获取返回内容对象（JSONObject）
	 * @return
	 */
	public JSONObject getJOContent()
	{
		return this.joContent;
	}
}
