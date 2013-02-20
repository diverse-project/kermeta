package org.kermeta.kompren.gwelet.view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;


public class OperationView extends ClassElementView {
	protected boolean method;
	
	protected boolean isAbstract;
	
	protected List<ParameterView> parameters;
	
	
	
	public OperationView(String name, String typeName, boolean isAbstract, ClassView parent) {
		super(name, typeName, parent);
		
		parameters 		= new ArrayList<ParameterView>();
		this.isAbstract = isAbstract;
		
		update();
	}
	
	
	public ParameterView addAttribute(final String attrName, final String attrTypeName) {
		final ParameterView attr = new ParameterView(attrName, attrTypeName);
		
		parameters.add(attr);
		update();
		entity.update();
		
		return attr;
	}
	
	
	
	@Override
	protected String getFullText() {
		return name + '(' + (parameters.isEmpty() ? "" : "...") + ')' + (typeName.length()==0 ? "" : " : " + typeName);
	}



	@Override
	public Font getFont() {
		return new Font(entity.getFontName(), isAbstract ? Font.ITALIC : Font.PLAIN, (int)(entity.getFontSize()*0.9));
	}
}
