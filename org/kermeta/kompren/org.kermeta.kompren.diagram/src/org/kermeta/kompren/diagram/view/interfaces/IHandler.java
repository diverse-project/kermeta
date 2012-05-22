package org.kermeta.kompren.diagram.view.interfaces;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public interface IHandler {
	Point2D getPoint();
	
	void setPoint(final Point2D point);
	
	void paint(final Graphics2D g);
	
	boolean contains(final double x, final double y);
	
	void translate(final double tx, final double ty);
	
	IHandlable getHandlable();
	
	void setHandlable(final IHandlable handlable);
}
