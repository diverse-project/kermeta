package org.kermeta.ki.visual.view;

import java.awt.Font;


public class AttributeView extends EntityElementView {

	public AttributeView(String name, String typeName, EntityView parent) {
		super(name, typeName, parent);
		
		update();
	}

	
	
	@Override
	public Font getFont() {
		return new Font(entity.font.getName(), Font.PLAIN, (int)(entity.fontSize*0.9));
	}
	
	
	@Override
	protected String getFullText() {
		return name + ": " + typeName;
	}
}
