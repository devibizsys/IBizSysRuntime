package net.ibizsys.paas.exception;

import net.ibizsys.paas.core.Errors;

/**
 * 错误代码异常
 * @author lionlau
 *
 */
public class ErrorException extends Exception
{
	private int nErrorCode = Errors.OK;

	public ErrorException(int nErrorCode)
	{
		super();
		this.nErrorCode = nErrorCode;
	}
	
	public ErrorException(int nErrorCode,String strMessage)
	{
		super(strMessage);
		this.nErrorCode = nErrorCode;
	}

	/**
	 * 获取错误代码
	 * @return the nErrorCode
	 */
	public int getErrorCode()
	{
		return nErrorCode;
	}
	
	
	
}
