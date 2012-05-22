package org.kermeta.kompren.gwelet.view;

import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.impl.PolylineDecorationView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

public class RelationDecorationView extends PolylineDecorationView {
	public static final int LENGTH_ARROW = 15;

	public static final int WIDTH_ARROW = 10;


	/**
	 * @see PolylineDecorationView
	 */
	public RelationDecorationView(final IRelationView relation, final ISegmentView segment, final boolean sourcePoint) {
		super(segment, sourcePoint, relation, new Point2D.Double(LENGTH_ARROW, -WIDTH_ARROW), new Point2D.Double(0., 0.), new Point2D.Double(LENGTH_ARROW, WIDTH_ARROW));
	}
}
