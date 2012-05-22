package org.kermeta.kompren.diagram.view.impl;

import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

/**
 * Implementation of a decoration with the shape of a polygon.
 * @author Arnaud Blouin
 */
public class PolygonDecorationView extends PolylineDecorationView {
	/**
	 * Initialises the decoration.
	 * @param relation The relation that will contain the decoration.
	 * @param pts The set of points that will compose the polygon decoration.
	 * @throws IllegalArgumentException If the given relation is null or if less than 3 points are given.
	 */
	public PolygonDecorationView(final ISegmentView segment, final boolean sourcePoint, final IRelationView relation, final Point2D ... pts) {
		super(segment, sourcePoint, relation, pts);
		
		isFilled = true;
	}
	

	@Override
	public boolean setPath(final Point2D ... pts) {
		final boolean ok = super.setPath(pts);
		
		if(ok)
			path.closePath();
		
		return ok;
	}
}
