package org.kermeta.ki.kompren.view;

import java.awt.geom.Point2D;

import org.kermeta.ki.diagram.view.impl.PolygonDecorationView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public class CompositionDecorationView extends PolygonDecorationView {
	/** The length of the diamond that represents the composition. */
	public static final Double DIAMOND_LGHT = 15.;
	
	
	/**
	 * @see PolygonDecorationView
	 */
	public CompositionDecorationView(final IRelationView relation) {
		super(relation, new Point2D.Double(0., 0.), new Point2D.Double(DIAMOND_LGHT, DIAMOND_LGHT/2.), 
				new Point2D.Double(DIAMOND_LGHT*2., 0.), new Point2D.Double(DIAMOND_LGHT, -DIAMOND_LGHT/2.));
	}
}
