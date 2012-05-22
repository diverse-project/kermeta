package org.kermeta.kompren.gwelet.view;

import java.awt.Font;


public class AttributeView extends ClassElementView {

//	protected Aspect aspect;
	
	
	public AttributeView(final String name, final String typeName, final ClassView parent) {
		super(name, typeName, parent);
	
//		aspect = null;
		update();
	}

	
	
	@Override
	public Font getFont() {
		return new Font(entity.getFontName(), Font.PLAIN, (int)(entity.getFontSize()*0.9));
	}
	
	
	@Override
	protected String getFullText() {
		return name + ": " + typeName;
	}
}
