package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.ki.diagram.view.interfaces.IHandlable;
import org.kermeta.ki.diagram.view.interfaces.IHandler;

public class Handler implements IHandler {
	protected static final double WIDTH = 10.;
	
	protected static final Color COLOR = new Color(20, 20, 20, 160);

	protected Point2D point;
	
	protected IHandlable handlable;
	
	
	
	public Handler(final Point2D point, final IHandlable handlable) {
		super();
		
		if(point==null || handlable==null)
			throw new IllegalArgumentException();
		
		setHandlable(handlable);
		setPoint(point);
	}
	
	@Override
	public Point2D getPoint() {
		return point;
	}

	
	@Override
	public void setPoint(final Point2D point) {
		if(point!=null)
			this.point = point;
	}
	
	
	
	public Rectangle2D getBorders() {
		return new Rectangle2D.Double(point.getX()-WIDTH/2., point.getY()-WIDTH/2., WIDTH, WIDTH);
	}
	

	@Override
	public void paint(final Graphics2D g) {
		Rectangle2D rec = getBorders();
		
		g.setColor(COLOR);
		g.draw(rec);
		g.fill(rec);
	}

	
	@Override
	public boolean contains(final double x, final double y) {
		return getBorders().contains(x, y);
	}

	
	@Override
	public void translate(final double tx, final double ty) {
		point.setLocation(point.getX()+tx, point.getY()+ty);
	}

	@Override
	public IHandlable getHandlable() {
		return handlable;
	}
	

	@Override
	public void setHandlable(final IHandlable handlable) {
		if(handlable!=null)
			this.handlable = handlable;
	}
}
