package org.kermeta.ki.kompren.view;

import java.awt.Color;
import java.awt.geom.Point2D;

import org.kermeta.ki.diagram.view.impl.PolygonDecorationView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

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
	public InheritanceDecorationView(final IRelationView relation) {
		super(relation, new Point2D.Double(0., 0.), new Point2D.Double(LENGTH_ARROW, -LENGTH_ARROW/2.), 
				new Point2D.Double(LENGTH_ARROW, LENGTH_ARROW/2.));
		
		setFillColor(Color.WHITE);
	}
}
