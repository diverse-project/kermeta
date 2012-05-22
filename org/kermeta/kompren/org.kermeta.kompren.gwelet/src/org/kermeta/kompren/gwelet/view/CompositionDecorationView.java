package org.kermeta.kompren.gwelet.view;

import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.impl.PolygonDecorationView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

public class CompositionDecorationView extends PolygonDecorationView {
	/** The length of the diamond that represents the composition. */
	public static final Double DIAMOND_LGHT = 15.;


	public CompositionDecorationView(final IRelationView relation, final ISegmentView segment, final boolean sourcePoint) {
		super(segment, sourcePoint, relation, new Point2D.Double(0., 0.), new Point2D.Double(DIAMOND_LGHT, DIAMOND_LGHT/2.),
				new Point2D.Double(DIAMOND_LGHT*2., 0.), new Point2D.Double(DIAMOND_LGHT, -DIAMOND_LGHT/2.));
	}
}
