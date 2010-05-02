package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class FloatingText {
	protected String text;
	
	protected boolean autoPosition;
	
	protected Point position;
	
	protected RoleView role;
	
	
	public FloatingText(final String text, final RoleView role) {
		super();
		
		this.role		= role;
		this.text 		= text;
		autoPosition 	= true;
		position		= new Point();
	}

	
	
	public void paint(Graphics2D g) {
		g.drawString(text, position.x, position.y);
	}
	
	

	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public boolean isAutoPosition() {
		return autoPosition;
	}


	public void setAutoPosition() {
		autoPosition = true;
	}
	
	
	public void setManualPosition(double x, double y) {
		autoPosition = false;
		setPosition(x, y);
	}


	public Point getPosition() {
		return position;
	}


	public void setPosition(final double x, final double y) {
		position.setLocation(x, y);
	}


	
	public boolean contains(double x, double y) {
		if(text==null || text.length()==0)
			return false;
		
		Rectangle2D rec = new TextLayout(text, role.view.entitySrc.font, EntityView.FONT_RENDER_CONT).getBounds();
		rec.setFrame(position.x, position.y-rec.getHeight(), rec.getWidth(), rec.getHeight());
		return rec.contains(x, y);
	}
}
