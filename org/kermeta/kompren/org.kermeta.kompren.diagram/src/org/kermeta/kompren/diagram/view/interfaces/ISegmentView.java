package org.kermeta.kompren.diagram.view.interfaces;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public interface ISegmentView {
	void paint(final Graphics2D g);
	
	/** The position of the first point of the segment. */
	Point2D getPointSource();
	
	/** The position of the last point of the segment. */
	Point2D getPointTarget();
	
	/**
	 * @return True: the relation goes to the west.
	 */
	boolean isWestDirection();

	/**
	 * @return True: the relation goes to the north.
	 */
	boolean isNorthDirection();

	/**
	 * @return The angle of the line compared to an horizontal line. In radian.
	 */
	double getLineAngle();

	/**
	 * @return The a parameter of the line. y = ax + b. Or NaN if the line is vertical.
	 */
	double getA();

	/**
	 * @return The b parameter of the line. y = ax + b
	 */
	double getB();
	
	boolean contains(final double x, final double y);
	
	void replacePointSource(Point2D newPt);
	
	void replacePointTarget(Point2D newPt);
}
