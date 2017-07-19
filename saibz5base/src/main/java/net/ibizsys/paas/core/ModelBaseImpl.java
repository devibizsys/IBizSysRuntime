package net.ibizsys.paas.core;


/**
 * 模型基类
 * @author lionlau
 *
 */
public abstract class ModelBaseImpl implements IModelBase//,IModelXmlLoader
{
//	public final static  String PROPERTY_NAME = "NAME";
	
	protected String strId = null;
	protected String strName = null;
//	private int nPSObjVersion = 0;
//	private IGlobalContext iGlobalContext = null;
	
//	private XmlNode xmlConfig = null;
	
//	/* (non-Javadoc)
//	 * @see net.ibizsys.paas.core.IModelXmlLoader#init(net.ibizsys.paas.util.IGlobalContext, java.lang.Object, net.ibizsys.paas.xml.XmlNode)
//	 */
//	@Override
//	public void initFromXml(IGlobalContext iGlobalContext, Object objParent, XmlNode xmlConfig) throws Exception
//	{
//		this.setGlobalContext(iGlobalContext);
//		this.xmlConfig  = xmlConfig;
//		this.setId(xmlConfig.getId());
//		this.setName(xmlConfig.getProperty(PROPERTY_NAME,""));
//		
//		this.onInit();
//	}
//	
//
//	
//	protected XmlNode getXmlConfig()
//	{
//		return this.xmlConfig;
//	}
	
	protected void onInit()throws Exception
	{
		
	}
	
	@Override
	public String getId()
	{
		return this.strId;
	}

	@Override
	public String getName()
	{
		return this.strName;
	}
	
//	/**
//	 * 获取对象版本
//	 * @return
//	 */
//	@Override
//	public int getVersion()
//	{
//		return this.nPSObjVersion;
//	}
	
	
//	protected void setId(String strPSObjectId)
//	{
//		this.strPSObjectId = strPSObjectId;
//	}
//	
//	protected void setName(String strPSObjectName)
//	{
//		this.strPSObjectName = strPSObjectName;
//	}
	
//	protected void setVersion(int nPSObjVersion)
//	{
//		this.nPSObjVersion = nPSObjVersion;
//	}

//	/**
//	 * @return the iGlobalContext
//	 */
//	public IGlobalContext getGlobalContext()
//	{
//		return iGlobalContext;
//	}
//
//	protected void setGlobalContext(IGlobalContext iGlobalContext)
//	{
//		this.iGlobalContext = iGlobalContext;
//	}

	
	

}
