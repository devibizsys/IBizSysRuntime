package net.ibizsys.paas.control.form;

/**
 * 表单处理异常对象
 * @author lionlau
 *
 */
public class FormException extends Exception
{
	private FormError formError = null;
	
	
	public FormException(FormError formError)
	{
		super();
		this.formError = formError;
		
	}
	
	
	/**
	 * 获取表单错误对象
	 * @return
	 */
	public FormError getFormError()
	{
		return this.formError;
	}
}
