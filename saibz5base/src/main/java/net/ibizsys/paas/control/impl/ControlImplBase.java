package net.ibizsys.paas.control.impl;

import net.ibizsys.paas.control.IControl;
import net.ibizsys.paas.core.IDataEntity;
import net.ibizsys.paas.core.ModelBaseImpl;
import net.ibizsys.paas.view.IView;

/**
 * 部件对象基类
 * @author Administrator
 *
 */
public abstract class ControlImplBase extends ModelBaseImpl implements IControl
{
	private IView iView = null;
	private String strControlType  = "";
	
	
	@Override
	public String getControlType()
	{
		return strControlType;
	}

	@Override
	public IView getView()
	{
		return iView;
	}

	@Override
	public IDataEntity getDataEntity()
	{
		return getView().getDataEntity();
	}

	/**
	 * @param iView the iView to set
	 */
	protected void setView(IView iView)
	{
		this.iView = iView;
	}

	/**
	 * @param strControlType the strControlType to set
	 */
	protected void setControlType(String strControlType)
	{
		this.strControlType = strControlType;
	}
	
	
	

}
