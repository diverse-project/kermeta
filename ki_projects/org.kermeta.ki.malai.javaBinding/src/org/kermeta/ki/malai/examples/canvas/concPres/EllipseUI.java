package org.kermeta.ki.malai.examples.canvas.concPres;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class EllipseUI extends ShapeUI {

	public EllipseUI() {
		super();
	}

	
	
	@Override
	public boolean isIn(double x, double y) {
		if(points.size()==0) return false;
		
		Ellipse2D.Double ell = new Ellipse2D.Double(getMinX(), getMinY(), getWidth(), getHeight());
		
		return ell.contains(x, y);
	}
	
	
	@Override
	public void paint(Graphics2D g) {
		Ellipse2D.Double ell = new Ellipse2D.Double(getMinX(), getMinY(), getWidth(), getHeight());
		g.setColor(colourFill);
		g.fill(ell);
		g.setColor(colourBord);
		g.setStroke(new BasicStroke((float) thickness));
		g.draw(ell);
	}
	
	
	@Override
	public boolean intersects(RectangleUI rect) {
		if(rect==null || points.size()==0) return false;
		
		Ellipse2D.Double ell = new Ellipse2D.Double(getMinX(), getMinY(), getWidth(), getHeight());
		
		return ell.intersects(rect.getMinX(), rect.getMaxY(), rect.getWidth(), rect.getHeight());
	}
}
