package org.kermeta.ki.visual.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;

public class AttributeView extends NamedView {

	protected String typeName;
	
	protected EntityView entity;
	
	protected Font font;
	
	private String textCache;
	
	private Dimension textBounds;
	
	
	
	public AttributeView(String name, String typeName, EntityView parent) {
		super(name);
		
		this.typeName 	= typeName;
		this.entity		= parent;
		
		update();
	}

	
	
	@Override
	public void paint(Graphics2D g) {
		if(visibility==Visibility.STANDARD && entity.visibility==Visibility.STANDARD) {
			g.setColor(entity.lineColor);
			g.setFont(font);
			g.drawString(textCache, (float)position.x, (float)position.y);
		}
	}

	
	
	@Override
	public void update() {
		textCache  			= name + ": " + typeName;
		font	   			= new Font(entity.font.getName(), Font.PLAIN, (int)(entity.fontSize*0.9));
		final TextLayout tl = new TextLayout(textCache, font, EntityView.FONT_RENDER_CONT);
		textBounds 			= new Dimension((int) tl.getBounds().getWidth(), (int) tl.getBounds().getHeight());
	}



	@Override
	public double getHeight() {
		return textBounds.getHeight();
	}



	@Override
	public double getWidth() {
		return textBounds.getWidth();
	}
}
