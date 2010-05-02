package org.kermeta.ki.visual.view;

import static java.lang.Math.PI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;



public abstract class LinkView extends ComponentView {
	public static final Color COLOR_GRAYED = new Color(210, 210, 210, 180);
	
	protected EntityView entitySrc;
	
	protected EntityView entityTar;
	
	protected Point2D.Double pointSrc;
	
	protected Point2D.Double pointTar;
	
	protected GeneralPath path;
	
	
	public LinkView(EntityView src, EntityView target) {
		super();
		
		entitySrc = src;
		entityTar = target;
		initialise();
		update();
	}
	
	
	@Override
	public boolean isVisible() {
		return super.isVisible() && pointSrc!=null && pointTar!=null && entitySrc.isVisible() && entityTar.isVisible();
	}
	
	
	
	protected void initialise() {
		path = new GeneralPath();
	}
	
	
	
	public EntityView getEntitySrc() {
		return entitySrc;
	}



	public EntityView getEntityTar() {
		return entityTar;
	}



	@Override
	public void paint(Graphics2D g) {
		if(isVisible()) {
			g.setColor(getLineColor());
			g.draw(path);
		}
	}
	
	
	
	public Color getLineColor() {
		return entitySrc.visibility==Visibility.GRAYED || entityTar.visibility==Visibility.GRAYED ? COLOR_GRAYED : Color.BLACK;
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
		if(isVerticalLine())
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
		if(entitySrc!=null && entityTar!=null) {
			if(entitySrc==entityTar) {
				Rectangle2D rec  = entitySrc.getBorders();
				final float gap = 60f;
				pointSrc = intersectionPoint(new Line2D.Double(new Point2D.Double(entitySrc.centre.x-300, entitySrc.centre.y-10), new Point2D.Double(entitySrc.centre.x, entitySrc.centre.y-10)), rec);
				pointTar = intersectionPoint(new Line2D.Double(new Point2D.Double(entitySrc.centre.x-300, entitySrc.centre.y+10), new Point2D.Double(entitySrc.centre.x, entitySrc.centre.y+10)), rec);
				
				path.reset();
				path.moveTo((float)pointSrc.x, (float)pointSrc.y);
				path.lineTo((float)pointSrc.x-gap, (float)pointSrc.y);
				path.lineTo((float)pointSrc.x-gap, (float)pointTar.y);
				path.lineTo((float)pointTar.x, (float)pointTar.y);
			}
			else {
				Line2D line = new Line2D.Double(entitySrc.centre, entityTar.centre);
				pointSrc    = intersectionPoint(line, entitySrc.getBorders());
				pointTar    = intersectionPoint(line, entityTar.getBorders());
				
				if(pointSrc==null || pointTar==null)
					visibility = Visibility.NONE;
				else {
					path.reset();
					path.moveTo((float)pointSrc.x, (float)pointSrc.y);
					path.lineTo((float)pointTar.x, (float)pointTar.y);
//					if(visibility==Visibility.STANDARD)
						visibility = entitySrc.visibility==Visibility.GRAYED || entityTar.visibility==Visibility.GRAYED ? Visibility.GRAYED : Visibility.STANDARD;
				}
			}
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
	
	
	
	public static boolean equals(double a, double b){
		return Math.abs(a - b) <= 0.00001;
	}
	
	
	public boolean isVerticalLine() {
		if(pointSrc==null || pointTar==null) {
			System.err.println("ERR>isVerticalLine>" + this + " " + entitySrc.name + " " + entityTar.name);
			return false;
		}
		return equals(pointSrc.getX(), pointTar.getX());
	}
	
	
	
	public boolean isHorizontalLine() {
		if(pointSrc==null || pointTar==null) {
			System.err.println("ERR>isHorizontalLine>" + this + " " + entitySrc.name + " " + entityTar.name);
			return false;
		}
		return equals(pointSrc.getY(), pointTar.getY());
	}
	
	
	
	
	
	public static Point2D.Double[] findPoints(final Line2D.Double line, final double x, final double y, final double distance) {
		if(line==null)
			return null;
		
		if(equals(distance, 0.)) {
			Point2D.Double[] sol = new Point2D.Double[1];
			sol[0] 		 		 = new Point2D.Double(x,y);
			
			return sol;
		}
		
		if(equals(line.getX1(), line.getX2())) {
			if(equals(line.getY1(), line.getY2()))// The line is a point. So no position can be computed. 
				return null;
			
			Point2D.Double sol[] = new Point2D.Double[2];
			sol[0] = new Point2D.Double(x, y-distance);
			sol[1] = new Point2D.Double(x, y+distance);
			
			return sol;
		}
		
		final double a = (line.y1 - line.y2)/(line.x1 - line.x2);
		final double b = line.y1 - a*line.x1;
		double A = a*a+1., B = -2.*(x+y*a-a*b);
		double C = b*b-(2.*y*b)+y*y+x*x-(distance*distance);
		double delta = B*B-4.*A*C;

		if(delta>0.) {
			double _x1, _x2, _y1, _y2;
			Point2D.Double sol[] = new Point2D.Double[2];
			
			_x1 = (-B+Math.sqrt(delta))/(2*A);
			_x2 = (-B-Math.sqrt(delta))/(2*A);
			_y1 = a*_x1+b;
			_y2 = a*_x2+b;
			sol[0] = new Point2D.Double(_x1, _y1);
			sol[1] = new Point2D.Double(_x2, _y2);
			
			return sol;
		}
		else
			if(equals(delta, 0.)) {
				double _x2, _y2;
				Point2D.Double sol[] = new Point2D.Double[1];
				
				_x2 = -B/2*A;
				_y2 = a*_x2+b;
				sol[0] = new Point2D.Double(_x2, _y2);
				
				return sol;
			}
			else 
				return null;
	}
	
	
	
	
	
	
	
	public Line2D.Double getPerpendicularLine(final Point2D.Double pt) {
		if(isVerticalLine())
			return equals(pt.getX(), pointSrc.getX()) ? new Line2D.Double(0., pt.getY(), pt.x, pt.y) : null;
			
		if(equals(pt.getX(), 0.)) {
			Point2D.Double pt3  = new Point2D.Double(pointTar.getX(), pointTar.getY());
			Point2D.Double pt2  = rotatePoint(pt3, pt, Math.PI/2.);
			
			return new Line2D.Double(pt2, pt);
		}
		
		double a = getA();
		
		if(equals(a, 0.))
			return new Line2D.Double(pt.getX(), pt.getY(), pt.getX(), pt.getY()-10.);
		
		double a2 = -1./a;
		
		return new Line2D.Double(0., pt.getY()-a2*pt.getX(), pt.x, pt.y);
	}

	
	
	
	
	public static Point2D.Double rotatePoint(final Point2D.Double srcPt, final Point2D.Double gravityC, final double theta) {
		Point2D.Double pt = new Point2D.Double();
		double cosTheta;
		double sinTheta;
		double angle 	= theta;
		double gx 		= gravityC.getX();
		double gy 		= gravityC.getY();

		if(angle<0.)
			angle = 2.*PI + angle;
		
		angle = angle%(2.*PI);
		
		if(equals(angle, 0.))
			return (Point2D.Double)srcPt.clone();
		
		if(equals(angle-PI/2., 0.)) {	
			cosTheta = 0.;
			sinTheta = 1.;
		}
		else if(equals(angle-PI, 0.)) {
				cosTheta = -1.;
				sinTheta = 0.;
			}
			else if(equals(angle-(3.*PI/2.), 0.)) {
					cosTheta = 0.;
					sinTheta = -1.;
				}
				else {
					cosTheta = Math.cos(angle);
					sinTheta = Math.sin(angle);
				}
		
		pt.x = cosTheta * (srcPt.x - gx) - sinTheta * (srcPt.y - gy) + gx;
		pt.y = sinTheta * (srcPt.x - gx) + cosTheta * (srcPt.y - gy) + gy;

		return pt;
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
