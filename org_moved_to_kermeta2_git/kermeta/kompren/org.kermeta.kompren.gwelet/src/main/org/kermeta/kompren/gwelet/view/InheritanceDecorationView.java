package org.kermeta.kompren.gwelet.view;

import java.awt.Color;
import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.impl.PolygonDecorationView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

/**
 * Defines a decoration for inheritance.
 * @author Arnaud Blouin
 */
public class InheritanceDecorationView extends PolygonDecorationView {
	/** The length of the inheritance triangle. */
	public static final double LENGTH_ARROW = 15.;

	/** The width of the inheritance triangle. */
	public static final double WIDTH_ARROW = 10.;


	/**
	 * @see PolygonDecorationView
	 */
	public InheritanceDecorationView(final IRelationView relation, final ISegmentView segment, final boolean sourcePoint) {
		super(segment, sourcePoint, relation, new Point2D.Double(0., 0.), new Point2D.Double(LENGTH_ARROW, -LENGTH_ARROW/2.),
				new Point2D.Double(LENGTH_ARROW, LENGTH_ARROW/2.));

		setFillColor(Color.WHITE);
	}
}
