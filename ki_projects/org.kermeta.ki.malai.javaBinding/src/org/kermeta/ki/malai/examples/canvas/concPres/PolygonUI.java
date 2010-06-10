package org.kermeta.ki.malai.examples.canvas.concPres;

import java.awt.geom.Point2D;

public class PolygonUI extends ShapeUI {

//	protected Vector<HandlerPoint> hPoints;
	
	public PolygonUI() {
		super();
		
//		hPoints = new Vector<HandlerPoint>();
	}
	
	
	@Override
	public void addPoint(Point2D.Double pt) {
		super.addPoint(pt);
		
//		if(pt==null) return ;
//		
//		HandlerPoint hp = new HandlerPoint();
//		hp.setCentre(pt.getX(), pt.getY());
//		hPoints.add(hp);
	}
}
