package org.kermeta.ki.diagram.view.interfaces;

import java.awt.geom.Point2D;

/**
 * The interface for a relation established between two entities.
 * @author Arnaud Blouin
 */
public interface IRelationView extends IComponentView {
	/** The position of the first point of the relation. */
	Point2D getPointSource();
	
	/** The position of the last point of the relation. */
	Point2D getPointTarget();

	/**
	 * @return The source entity.
	 */
	IEntityView getEntitySrc();

	/**
	 * @return The target entity.
	 */
	IEntityView getEntityTar();

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

	/**
	 * @return True if the line is vertical.
	 */
	boolean isVerticalLine();

	/**
	 * @return True if the line is horizontal.
	 */
	boolean isHorizontalLine();

	
	/**
	 * @return The decoration located at the source position of the relation.
	 */
	IDecorationView getSourceDecoration();

	/**
	 * Sets the decoration located at the source position of the relation.
	 * @param sourceDecoration The decoration located at the source position of the relation. Can be null.
	 */
	void setSourceDecoration(final IDecorationView sourceDecoration);

	/**
	 * @return The decoration located at the target position of the relation.
	 */
	IDecorationView getTargetDecoration();

	/**
	 * Sets the decoration located at the target position of the relation.
	 * @param targetDecoration The decoration located at the target position of the relation. Can be null.
	 */
	void setTargetDecoration(final IDecorationView targetDecoration);
}