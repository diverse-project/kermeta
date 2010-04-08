package org.kermeta.ki.visual.view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;
import java.awt.geom.Point2D;


public abstract class EntityElementView extends ComponentView {

	protected String name;
	
	protected String typeName;
	
	protected Point2D.Double position;
	
	protected EntityView entity;
	
	protected Font font;
	
	private String textCache;
	
	private Dimension textBounds;
	
	
	
	public EntityElementView(String name, String typeName, EntityView parent) {
		super();
		
		this.name 		= name;
		this.typeName 	= typeName;
		position  		= new Point2D.Double();
		this.entity		= parent;
	}
	
	
	
	@Override
	public void paint(Graphics2D g) {
		if(visibility==Visibility.STANDARD && entity.visibility==Visibility.STANDARD) {
			g.setColor(entity.lineColor);
			g.setFont(font);
			g.drawString(textCache, (float)position.x, (float)position.y);
		}
	}
	
	

	public double getHeight() {
		return textBounds.getHeight();
	}

	
	
	protected abstract String getFullText();
	
	
	
	public abstract Font getFont();
	
	
	
	@Override
	public void update() {
		textCache			= getFullText();
		font				= getFont();
		final TextLayout tl = new TextLayout(textCache, font, EntityView.FONT_RENDER_CONT);
		textBounds 			= new Dimension((int) tl.getBounds().getWidth(), (int) tl.getBounds().getHeight());
	}
	


	public double getWidth() {
		return textBounds.getWidth();
	}
	
	
	
	public void setPosition(double x, double y) {
		position.setLocation(x, y);
	}
	
	
	
	public Point2D.Double getPosition() {
		return position;
	}
}
