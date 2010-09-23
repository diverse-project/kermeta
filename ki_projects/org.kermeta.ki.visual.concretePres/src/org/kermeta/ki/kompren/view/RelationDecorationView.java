package org.kermeta.ki.kompren.view;

import java.awt.geom.Point2D;

import org.kermeta.ki.diagram.view.impl.PolylineDecorationView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public class RelationDecorationView extends PolylineDecorationView {
	public static final int LENGTH_ARROW = 15;
	
	public static final int WIDTH_ARROW = 10;
	
	
	/**
	 * @see PolylineDecorationView
	 */
	public RelationDecorationView(final IRelationView relation) {
		super(relation, new Point2D.Double(LENGTH_ARROW, -WIDTH_ARROW), new Point2D.Double(0., 0.), new Point2D.Double(LENGTH_ARROW, WIDTH_ARROW));
	}
}
