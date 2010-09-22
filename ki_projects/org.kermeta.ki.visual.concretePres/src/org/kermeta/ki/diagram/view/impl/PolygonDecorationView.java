package org.kermeta.ki.diagram.view.impl;

import java.awt.geom.Point2D;

import org.kermeta.ki.diagram.view.interfaces.IRelationView;

public class PolygonDecorationView extends DecorationView {

	public PolygonDecorationView(final IRelationView relation, final Point2D ... pts) {
		super(relation);
		
		if(!setPath(pts))
			throw new IllegalArgumentException();
	}
	
	
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
}
