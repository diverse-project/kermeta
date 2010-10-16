package org.kermeta.ki.diagram.view.interfaces;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * The interface for a relation established between two entities.
 * @author Arnaud Blouin
 */
public interface IRelationView extends IComponentView {
	int getNbSegment();
	
	ISegmentView getLastSegment();
	
	ISegmentView getFirstSegment();
	
	ISegmentView getSegment(final int pos);
	
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

	
	void addPoint(final Point2D pt);

	
	void translate(final double tx, final double ty);

	Rectangle2D getBorders();
}