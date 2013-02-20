package org.kermeta.kompren.diagram.view.interfaces;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public interface IAnchor {
	void paint(Graphics2D g);
	
	boolean isFree();
	
	void setFree(final boolean free);
	
	Point2D getPosition();
	
	void translate(final double tx, final double ty);

	void setPosition(final Point2D position);
}
