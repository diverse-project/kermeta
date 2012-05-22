package org.kermeta.kompren.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.interfaces.IPolygonDecorationView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

public class PolylineDecorationView extends DecorationView implements IPolygonDecorationView  {
	/** The colour of the interiour of the polygon. */
	protected Color fillColor;
	
	/** Defines if the decoration is filled. */
	protected boolean isFilled;
	
	
	/**
	 * Initialises the decoration.
	 * @param relation The relation that will contain the decoration.
	 * @param pts The set of points that will compose the polygon decoration.
	 * @throws IllegalArgumentException If the given relation is null or if less than 3 points are given.
	 */
	public PolylineDecorationView(final ISegmentView segment, final boolean sourcePoint, final IRelationView relation, final Point2D ... pts) {
		super(relation, segment, sourcePoint);
		
		if(!setPath(pts))
			throw new IllegalArgumentException();
		
		isFilled  = false;
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
		
		return true;
	}


	
	@Override
	public Color getFillColor() {
		return fillColor;
	}
	
	
	@Override
	protected void paintDecoration(final Graphics2D g) {
		if(isFilled) {
			g.setColor(fillColor);
			g.fill(path);
		}
		
		g.setColor(relation.getLineColor());
		g.draw(path);
	}


	@Override
	public void setFillColor(final Color fillColor) {
		if(fillColor!=null)
			this.fillColor = fillColor;
	}


	@Override
	public void setFilled(final boolean filled) {
		isFilled = filled;
	}


	@Override
	public boolean isFilled() {
		return isFilled;
	}
}
