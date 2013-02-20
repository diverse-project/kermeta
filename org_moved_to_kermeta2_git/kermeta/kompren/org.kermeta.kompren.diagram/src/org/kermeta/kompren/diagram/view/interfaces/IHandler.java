package org.kermeta.kompren.diagram.view.interfaces;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import org.malai.picking.Pickable;

public interface IHandler extends Moveable, Pickable {
	Point2D getPoint();

	void setPoint(final Point2D point);

	void paint(final Graphics2D g);

	@Override
	boolean contains(final double x, final double y);
}
