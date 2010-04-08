package org.kermeta.ki.visual.view;

import java.awt.geom.Point2D;


public abstract class NamedView extends ComponentView {

	protected String name;
	
	protected Point2D.Double position;
	
	
	
	public NamedView(String name) {
		super();
		
		this.name = name;
		position  = new Point2D.Double();
	}
	
	
	

	public abstract double getHeight();
	
	
	public abstract double getWidth();
	
	
	
	public void setPosition(double x, double y) {
		position.setLocation(x, y);
	}
	
	
	
	public Point2D.Double getPosition() {
		return position;
	}
}
