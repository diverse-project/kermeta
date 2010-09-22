package org.kermeta.ki.diagram.view.interfaces;

/**
 * The interface for a relation established between two entities.
 * @author Arnaud Blouin
 */
public interface IRelationView extends IComponentView {

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

}