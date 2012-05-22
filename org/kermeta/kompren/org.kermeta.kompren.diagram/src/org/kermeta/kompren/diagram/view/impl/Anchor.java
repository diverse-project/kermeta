package org.kermeta.kompren.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.interfaces.IAnchor;

public class Anchor implements IAnchor {

	protected Point2D position;
	
	protected boolean free;
	
	
	
	public Anchor(final double x, final double y) {
		super();
		
		position = new Point2D.Double(x, y);
		free	 = true;
	}
	
	
	
	@Override
	public void paint(final Graphics2D g) {
		g.setColor(Color.GREEN);
		final double width = 6.;
		g.drawOval((int)(position.getX()-width/2.), (int)(position.getY()-width/2.), (int)width, (int)width);
		g.fillOval((int)(position.getX()-width/2.), (int)(position.getY()-width/2.), (int)width, (int)width);
	}
	
	
	@Override
	public boolean isFree() {
		return free;
	}

	
	@Override
	public void setFree(final boolean free) {
		this.free = free;
		
		// The anchor position must not be linked to a segment anymore.
		if(free)
			this.position = new Point2D.Double(position.getX(), position.getY());
	}

	
	@Override
	public Point2D getPosition() {
		return position;
	}

	
	@Override
	public void translate(final double tx, final double ty) {
		position.setLocation(position.getX()+tx, position.getY()+ty);
	}



	@Override
	public void setPosition(final Point2D position) {
		if(position!=null)
			this.position = position;
	}
	
	
	@Override
	public String toString() {
		return getClass().getCanonicalName() + '[' + position + ",free=" + isFree() + ']';
	}
}
