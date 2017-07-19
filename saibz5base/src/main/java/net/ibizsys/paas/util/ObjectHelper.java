package net.ibizsys.paas.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 对象辅助对象
 * @author Administrator
 *
 */
public class ObjectHelper
{
	private static final Log log = LogFactory.getLog(ObjectHelper.class);
   
	/**
	 * 建立对象
	 * @param strType
	 * @return
	 * @throws Exception
	 */
	public static Object create(String strType) throws Exception
    {
		return Class.forName(strType).newInstance();
    }
	
	/**
	 * 建立对象
	 * @param classType (对象类别）
	 * @return
	 */
	public static Object create(Class classType)throws Exception
    {
		return classType.newInstance();
    }
}
