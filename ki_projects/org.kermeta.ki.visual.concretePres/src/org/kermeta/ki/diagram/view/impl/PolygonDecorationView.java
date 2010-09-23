package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import org.kermeta.ki.diagram.view.interfaces.IPolygonDecorationView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

/**
 * Implementation of a decoration with the shape of a polygon.
 * @author Arnaud Blouin
 */
public class PolygonDecorationView extends DecorationView implements IPolygonDecorationView {

	/** The colour of the interiour of the polygon. */
	protected Color fillColor;
	
	
	/**
	 * Initialises the decoration.
	 * @param relation The relation that will contain the decoration.
	 * @param pts The set of points that will compose the polygon decoration.
	 * @throws IllegalArgumentException If the given relation is null or if less than 3 points are given.
	 */
	public PolygonDecorationView(final IRelationView relation, final Point2D ... pts) {
		super(relation);
		
		if(!setPath(pts))
			throw new IllegalArgumentException();
		
		fillColor = relation.getLineColor();
	}
	
	
	@Override
	public boolean setPath(final Point2D ... pts) {
		if(pts==null || pts.length<3)
			return false;
		
		path.reset();
		
		path.moveTo(pts[0].getX(), pts[0].getY());
		
		for(int i=1; i<pts.length; i++)
			path.lineTo(pts[i].getX(), pts[i].getY());
		
		path.closePath();
		
		return true;
	}


	
	@Override
	public Color getFillColor() {
		return fillColor;
	}
	
	
	@Override
	public void paint(final Graphics2D g) {
		g.setColor(fillColor);
		g.fill(path);
		g.setColor(relation.getLineColor());
		g.draw(path);
	}


	@Override
	public void setFillColor(final Color fillColor) {
		if(fillColor!=null)
			this.fillColor = fillColor;
	}
}
