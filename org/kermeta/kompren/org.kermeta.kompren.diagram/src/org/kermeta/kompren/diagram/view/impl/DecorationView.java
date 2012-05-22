package org.kermeta.kompren.diagram.view.impl;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.interfaces.IDecorationView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

public class DecorationView extends View implements IDecorationView {
	/** Defines if the decoration is at the source position of the relation. */
	protected boolean isSource;

	/** The relation that contains the decoration. */
	protected IRelationView relation;

	/** The segment that defines the position. */
	protected ISegmentView segment;

	/** Defines if the source or the target point of the segment is the position. */
	protected boolean sourcePoint;


	/**
	 * Initialises the decoration.
	 * @param relation The relation that contains the decoration.
	 * @param segment The segment that defines the position.
	 * @param sourcePoint Defines if the source or the target point of the segment is the position.
	 * @throws IllegalArgumentException If the given relation is null.
	 */
	public DecorationView(final IRelationView relation, final ISegmentView segment, final boolean sourcePoint) {
		super();

		if(relation==null || segment==null)
			throw new IllegalArgumentException();

		this.segment	= segment;
		this.sourcePoint= sourcePoint;
		this.relation 	= relation;
		isSource		= true;
	}


	@Override
	public boolean isSource() {
		return isSource;
	}

	@Override
	public void setSource(final boolean isSource) {
		this.isSource = isSource;
	}

	@Override
	public IRelationView getRelation() {
		return relation;
	}

	@Override
	public void setRelation(final IRelationView relation) {
		this.relation = relation;
	}


	protected static Point2D beginRotation(final Point2D position, final Graphics2D g, final double angle) {
		Point2D p = null;

		if(!Number.NUMBER.equals(angle, 0.) && !Double.isInfinite(angle) && !Double.isNaN(angle)) {
			final double cx = position.getX(), cy = position.getY();
			final double c2x = Math.cos(angle) * cx - Math.sin(angle)* cy;
			final double c2y = Math.sin(angle) * cx + Math.cos(angle)* cy;
			final double c3x = Math.cos(-angle) * (cx - c2x)- Math.sin(-angle) * (cy - c2y);
			final double c3y = Math.sin(-angle) * (cx - c2x)+ Math.cos(-angle) * (cy - c2y);

			g.rotate(angle);
			p = new Point2D.Double(c3x, c3y);
		}

		return p;
	}



	protected static void endRotation(final Graphics2D g, final double angle) {
		if(!Number.NUMBER.equals(angle, 0.) && !Double.isInfinite(angle) && !Double.isNaN(angle))
			g.rotate(-angle);
	}


	public Point2D getPosition() {
		return sourcePoint ? segment.getPointSource() : segment.getPointTarget();
	}


	public double getAngle() {
		double lineAngle;

		if(relation.getFirstSegment().getPointSource()==getPosition())
			lineAngle = relation.getFirstSegment().getLineAngle();
		else
			lineAngle = relation.getLastSegment().getLineAngle()+Math.PI;

		return lineAngle;
	}


	@Override
	public void paint(final Graphics2D g) {
		double lineAngle = getAngle();
		Point2D position = getPosition();

		g.translate(position.getX(), position.getY());
		boolean okRotation = beginRotation(position, g, lineAngle)!=null;

		paintDecoration(g);

		if(okRotation)
			endRotation(g, lineAngle);

		g.translate(-position.getX(), -position.getY());
	}


	protected void paintDecoration(final Graphics2D g) {
		g.setColor(relation.getLineColor());
		g.fill(path);
		g.draw(path);
	}


	@Override
	public boolean contains(final double x, final double y) {
		Point2D position = getPosition();
		Point2D point 	 = Number.NUMBER.rotatePoint(new Point2D.Double(x, y), position, -getAngle());
		point.setLocation(point.getX()-position.getX(), point.getY()-position.getY());

		return path.contains(point);
	}


	@Override
	public ISegmentView getSegment() {
		return segment;
	}


	@Override
	public void setSegment(final ISegmentView segment) {
		if(segment!=null)
			this.segment = segment;
	}
}
