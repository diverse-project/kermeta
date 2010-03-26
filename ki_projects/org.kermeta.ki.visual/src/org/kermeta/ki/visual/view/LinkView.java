package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;



public abstract class LinkView extends ComponentView {
	public static final int STRAIGHTNESS = 5; 
	public static final int LENGTH_INIT  = 100;
	
	protected EntityView entitySrc;
	
	protected EntityView entityTar;
	
	protected Point2D.Double pointSrc;
	
	protected Point2D.Double pointTar;
	
	protected Line2D line;
	
	
	public LinkView(EntityView src, EntityView target) {
		super();
		
		entitySrc = src;
		entityTar = target;
		initialise();
		update();
	}
	
	
	
	protected void initialise() {
		line = new Line2D.Double();
	}
	
	
	
	public EntityView getEntitySrc() {
		return entitySrc;
	}



	public EntityView getEntityTar() {
		return entityTar;
	}



	@Override
	public void paint(Graphics2D g) {
		if(visible && entitySrc.visible && entityTar.visible) {
			g.setColor(getLineColor());
			g.draw(line);
		}
	}
	
	
	
	public Color getLineColor() {
		return Color.BLACK;
	}
	
	
	
	public boolean isWestDirection() {
		return pointSrc.x>pointTar.x;
	}
	

	
	public boolean isNorthDirection() {
		return pointSrc.y<pointTar.y;
	}
	
	
	public double getLineAngle() {
		if(pointSrc.y==pointTar.y)
			return isWestDirection() ? Math.PI : 0.;
		
		if(pointSrc.x==pointTar.x)
			return isNorthDirection() ? Math.PI/2. : -Math.PI/2.;

		return isWestDirection() ? Math.atan(getA())+Math.PI : Math.atan(getA());
	}
	
	
	public double getA() {
		if(pointSrc.x==pointTar.x)
			return Double.NaN;

		return (pointSrc.y - pointTar.y)/(pointSrc.x - pointTar.x);
	}

	
	
	public double getB() {
		return pointSrc.y - getA() * pointSrc.x;
	}
	
	
	
	protected Point2D.Double beginRotation(Point2D.Double position, Graphics2D g) {
		final double lineAngle = getLineAngle();
		
		if(lineAngle!=0 && !Double.isInfinite(lineAngle) && !Double.isNaN(lineAngle)) {
			final double yRot;
			final double c2x, c2y;
			final double c3x, c3y;
			final double b = getB();
			
			if(Math.abs(lineAngle)==(Math.PI/2.)) {
				yRot = position.y;
				final double cx = position.x;
				final double cy = yRot;
				c2x = Math.cos(lineAngle)*cx - Math.sin(lineAngle)*cy;
				c2y = Math.sin(lineAngle)*cx + Math.cos(lineAngle)*cy;
				c3x = Math.cos(-lineAngle)*(cx-c2x) - Math.sin(-lineAngle)*(cy-c2y);
				c3y = Math.sin(-lineAngle)*(cx-c2x) + Math.cos(-lineAngle)*(cy-c2y);
			}
			else {
				yRot = Math.sin(-lineAngle)*position.x+Math.cos(-lineAngle)*(position.y-b)+b;
				c2x = - Math.sin(lineAngle)*b;
				c2y = Math.cos(lineAngle)*b;
				c3x = Math.cos(-lineAngle)*(-c2x) - Math.sin(-lineAngle)*(b-c2y);
				c3y = Math.sin(-lineAngle)*(-c2x) + Math.cos(-lineAngle)*(b-c2y);
			}
			
			if(lineAngle%(Math.PI*2)!=0) {		
				g.rotate(lineAngle);
				g.translate(c3x, c3y);
				
				return new Point2D.Double(c3x, c3y);
			}
		}
		return null;
	}
	
	
	
	
	protected void endRotation(Point2D.Double translation, Graphics2D g) {
		final double lineAngle = getLineAngle();
		
		if(lineAngle!=0 && !Double.isInfinite(lineAngle) && !Double.isNaN(lineAngle)) {
			g.translate(-translation.getX(), -translation.getY());
			g.rotate(-lineAngle);
		}
	}
	
	
	
	
	@Override
	public void update() {
		Line2D line = new Line2D.Double(entitySrc.centre, entityTar.centre);
		pointSrc    = intersectionPoint(line, entitySrc.getBorders());
		pointTar    = intersectionPoint(line, entityTar.getBorders());
		
		if(pointSrc==null || pointTar==null)
			visible = false;
		else {
			this.line.setLine(pointSrc.x, pointSrc.y, pointTar.x, pointTar.y);
			visible = true;
		}
	}

	
	
	public static Point2D.Double intersectionPoint(Line2D line, Rectangle2D rec) {
		Point2D.Double pt = getIntersectionSegment(line, 
				new Line2D.Double(rec.getX(), rec.getY(), rec.getX()+rec.getWidth(), rec.getY()));

		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, 
				new Line2D.Double(rec.getX()+rec.getWidth(), rec.getY(), rec.getX()+rec.getWidth(), rec.getY()+rec.getHeight()));
		
		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, 
				new Line2D.Double(rec.getX()+rec.getWidth(), rec.getY()+rec.getHeight(), rec.getX(), rec.getY()+rec.getHeight()));
		
		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(line, 
				new Line2D.Double(rec.getX(), rec.getY()+rec.getHeight(), rec.getX(), rec.getY()));
		
		if(pt!=null)
			return pt;
		
		return pt;
	}
	
	
	public static Point2D.Double getIntersection(Line2D l1, Line2D l2) {
		double a1 = (l1.getY1() -l1.getY2())/(l1.getX1() - l1.getX2());
		double a2 = (l2.getY1() -l2.getY2())/(l2.getX1() - l2.getX2());
		double b1 = (l1.getY1() - a1 * l1.getX1());
		double b2 = (l2.getY1() - a2 * l2.getX1());
		boolean verticalLine1 = l1.getX1()==l1.getX2();
		boolean verticalLine2 = l2.getX1()==l2.getX2();
		boolean horizLine1 = l1.getY1()==l1.getY2();
		boolean horizLine2 = l2.getY1()==l2.getY2();
		double x;
		double y;
		
		if(verticalLine2) {
			if(verticalLine1)// The two lines a parallels
				return null;
			
			if(horizLine2)// Points of the line l are equal.
				return null;
			
			if(horizLine1) {
				x = l2.getX1();
				y = l1.getY1();
			}else {
				y = a1*l2.getX1()+b1;
				x = (y-b1)/a1;
			}
		}else {
			double la = a2;
			double lb = a2;
			
			if(verticalLine1) {
				if(horizLine2) {
					x = l1.getX1();
					y = l2.getY1();
				} else {
					y = la*l1.getX1()+lb;
					x = (y-lb)/la;
				}
			}else {//TODO backport to the latexdraw trunk + add test
				if(horizLine1) {
					if(horizLine2)
						return null;
					
					x = (b1-b2)/a2;
					y = l1.getY1();
				} else
					if(horizLine2) {
						x = (b2-b1)/a1;
						y = l2.getY1();
					}else {
						x = (b1-lb)/(la-a1);
						y = a1*x+b1;
					}
			}
		}
		
		return new Point2D.Double(x, y);
	}
	
	
	public static Point2D.Double getIntersectionSegment(Line2D l1, Line2D l2) {
		Point2D.Double p = getIntersection(l1, l2);

		if(p==null) 
			return null;

		final double th = 0.00001;
		double px   = p.getX();
		double py   = p.getY();
		double tlx1 = l1.getX1()<l1.getX2() ? l1.getX1() : l1.getX2();
		double brx1 = l1.getX1()>l1.getX2() ? l1.getX1() : l1.getX2();
		double tlx2 = l2.getX1()<l2.getX2() ? l2.getX1() : l2.getX2();
		double brx2 = l2.getX1()>l2.getX2() ? l2.getX1() : l2.getX2();
		double tly1 = l1.getY1()<l1.getY2() ? l1.getY1() : l1.getY2();
		double bry1 = l1.getY1()>l1.getY2() ? l1.getY1() : l1.getY2();
		double tly2 = l2.getY1()<l2.getY2() ? l2.getY1() : l2.getY2();
		double bry2 = l2.getY1()>l2.getY2() ? l2.getY1() : l2.getY2();
		
		if(((px>tlx1 || equals(px, tlx1, th)) && (px<brx1 || equals(px, brx1, th)) && 
			(py>tly1 || equals(py, tly1, th)) && (py<bry1 || equals(py, bry1, th))) &&
		   ((px>tlx2 || equals(px, tlx2, th)) && (px<brx2 || equals(px, brx2, th)) && 
			(py>tly2 || equals(py, tly2, th)) && (py<bry2 || equals(py, bry2, th))))
			return p;
		
		return null;
	}
	
	
	
	public double getLength() { 	
		double x = entitySrc.getX() - entityTar.getX();
		double y = entitySrc.getY() - entityTar.getY();
		double res = Math.sqrt(x*x + y*y);
		return Double.isNaN(res) || Double.isInfinite(res) || res<=0 ? 1. : res;
	}
	
	
	
	public static boolean equals(double a, double b, double threshold){
		return Math.abs(a - b) <= threshold;
	}
}
