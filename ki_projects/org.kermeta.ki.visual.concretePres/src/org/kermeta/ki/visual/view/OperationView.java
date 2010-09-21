package org.kermeta.ki.visual.view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;


public class OperationView extends EntityElementView {
	protected boolean method;
	
	protected boolean isAbstract;
	
	protected List<ParameterView> parameters;
	
	
	
	public OperationView(String name, String typeName, boolean isAbstract, EntityView parent) {
		super(name, typeName, parent);
		
		parameters 		= new ArrayList<ParameterView>();
		this.isAbstract = isAbstract;
		
		update();
	}
	
	
	public ParameterView addAttribute(final String name, final String typeName) {
		final ParameterView attr = new ParameterView(name, typeName);
		
		parameters.add(attr);
		update();
		entity.update();
		
		return attr;
	}
	
	
	
	@Override
	protected String getFullText() {
		return name + "(" + (parameters.isEmpty() ? "" : "...") + ")" + (typeName.length()==0 ? "" : " : " + typeName);
	}



	@Override
	public Font getFont() {
		return new Font(EntityView.FONT_NAME, isAbstract ? Font.ITALIC : Font.PLAIN, (int)(entity.fontSize*0.9));
	}
}
