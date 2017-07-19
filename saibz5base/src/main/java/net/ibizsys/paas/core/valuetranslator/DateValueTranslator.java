package net.ibizsys.paas.core.valuetranslator;

import net.ibizsys.paas.core.DataTypes;
import net.ibizsys.paas.util.DataTypeHelper;
import net.ibizsys.paas.util.StringHelper;

/**
 * 时间日期处理器
 * @author Administrator
 *
 */
public class DateValueTranslator extends ValueTranslatorBase
{
	public final static String  DATETIME =  "DATE|YYYY-MM-DD HH:mm:ss";
	public final static String  DATE =  "DATE|YYYY-MM-DD";
	public final static String  TIME =  "DATE|HH:mm:ss";
	public final static String  DATETIME_NOMINUTE =  "DATE|YYYY-MM-DD HH";
	public final static String  DATETIME_NOSECOND =  "DATE|YYYY-MM-DD HH:mm";
	public final static String  TIME_NOSECOND =  "DATE|HH:mm";

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.core.IValueTranslator#convert(java.lang.String)
	 */
	@Override
	public Object convert(String strValue) throws Exception
	{
		if(StringHelper.isNullOrEmpty(strValue))
			return null;
		
		String strDataTimeString = strValue;
		if(StringHelper.compare(DATE, this.getParam(), true)==0)
		{
			strDataTimeString = StringHelper.format("%1$s 00:00:00", strValue);
		}
		else
			if(StringHelper.compare(TIME, this.getParam(), true)==0)
			{
				strDataTimeString = StringHelper.format("1970-01-01 %1$s", strValue);
			}
			else
				if(StringHelper.compare(DATETIME_NOMINUTE, this.getParam(), true)==0)
				{
					strDataTimeString = StringHelper.format("%1$s:00:00", strValue);
				}
				else
					if(StringHelper.compare(DATETIME_NOSECOND, this.getParam(), true)==0)
					{
						strDataTimeString = StringHelper.format("%1$s:00", strValue);
					}
					else
						if(StringHelper.compare(TIME_NOSECOND, this.getParam(), true)==0)
						{
							strDataTimeString = StringHelper.format("1970-01-01 %1$s:00", strValue);
						}
		
		return DataTypeHelper.parse(DataTypes.DATETIME, strDataTimeString);
	}

}
