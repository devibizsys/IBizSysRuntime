package net.ibizsys.paas.db;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 数据查询操作上下文对象
 * @author Administrator
 *
 */
public class SelectContext extends SelectCond implements ISelectContext {
	
	private ArrayList<ISelectField>  selectFieldList = null;
	
	

	/* (non-Javadoc)
	 * @see net.ibizsys.paas.db.ISelectContext#getSelectFields()
	 */
	@Override
	public Iterator<ISelectField> getSelectFields() {
		if(selectFieldList == null)
			return null;
		return selectFieldList.iterator();
	}
	
	
	/**
	 * 增加查询字段
	 * @param iSelectField
	 */
	public void addSelectField(ISelectField iSelectField){
		if(selectFieldList == null){
			selectFieldList = new ArrayList<ISelectField>();
		}
		selectFieldList.add(iSelectField);
	}
	
	
	
}
