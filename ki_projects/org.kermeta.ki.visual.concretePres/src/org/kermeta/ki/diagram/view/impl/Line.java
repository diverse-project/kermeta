package org.kermeta.ki.diagram.view.impl;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Line extends Line2D.Double {
	private static final long serialVersionUID = 1L;

	/** The director coefficient of the line (y=ax+b). */
	protected double a;

	/** y=ax+b. */
	protected double b;


	/**
	 * Constructs a line with coordinates (0, 0) -> (0, 0).
	 */
	public Line() {
		this(new Point2D.Double(), new Point2D.Double());
	}



	/**
	 * Constructs a line from the specified coordinates.
	 * @param x1 the X coordinate of the start point.
	 * @param y1 the Y coordinate of the start point.
	 * @param x2 the X coordinate of the end point.
	 * @param y2 the Y coordinate of the end point.
	 * @throws IllegalArgumentException If one of the given coordinate is not valid.
	 */
	public Line(final double x1, final double y1, final double x2, final double y2) {
		this(new Point2D.Double(x1, y1), new Point2D.Double(x2, y2));
	}



	/**
	 * Constructs a line from the specified <code>Point2D</code> objects.
	 * @param p1 the start <code>Point2D</code> of this line segment.
	 * @param p2 the end <code>Point2D</code> of this line segment.
	 * @throws IllegalArgumentException If one of the given points is not valid.
	 */
	public Line(final Point2D p1, final Point2D p2) {
		super();

		if(p1==null || p2==null)
			throw new IllegalArgumentException();
		
		setP1(p1.getX(), p1.getY());
		setP2(p2.getX(), p2.getY());
		updateAandB();
	}



	public void updateAandB() {
		if(isVerticalLine()) {
			a = java.lang.Double.NaN;
			b = java.lang.Double.NaN;
		} else {
			a = (y1 -y2)/(x1 - x2);
			b = y1 - a * x1;
		}
	}



	public Point2D[] findPoints(final double x, final double y, final double distance) {
		if(Number.NUMBER.equals(distance, 0.)) {
			Point2D.Double[] sol = new Point2D.Double[1];
			sol[0] = new Point2D.Double(x,y);

			return sol;
		}

		if(isVerticalLine()) {
			if(isHorizontalLine())// The line is a point. So no position can be computed.
				return null;

			Point2D.Double sol[] = new Point2D.Double[2];
			sol[0] = new Point2D.Double(x, y-distance);
			sol[1] = new Point2D.Double(x, y+distance);

			return sol;
		}

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
			if(Number.NUMBER.equals(delta, 0.)) {
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

	
	
	public boolean isParallel(final Line line) {
		boolean isParallel;
		
		if(line==null)
			isParallel = false;
		else
			if(isVerticalLine())
				isParallel  = line.isVerticalLine();
			else
				isParallel = isHorizontalLine() ? line.isHorizontalLine() : Number.NUMBER.equals(a, line.a);
		
		return isParallel;
	}
	


	public Line getPerpendicularLine(final double x, final double y) {
		if(isVerticalLine())
			return new Line(new Point2D.Double(-10000, y), new Point2D.Double(10000, y));

		if(isHorizontalLine())
			return new Line(new Point2D.Double(x, -10000), new Point2D.Double(x, 10000));
		
		final double a2 = -1./getA();
		final double b2 = y-a2*x;
		
		return new Line(new Point2D.Double(x, y), new Point2D.Double(-b2/a2, 0.));
	}



	public boolean isVerticalLine() {
		return Number.NUMBER.equals(x1, x2);
	}


	public boolean isHorizontalLine() {
		return Number.NUMBER.equals(y1, y2);
	}



	public Point2D.Double getIntersection(final Line l) {
		if(l==null) return null;
		if(Number.NUMBER.equals(a, l.getA())) return null;

		boolean verticalLine1 = isVerticalLine();
		boolean verticalLine2 = l.isVerticalLine();
		double x;
		double y;

		if(verticalLine2) {
			if(verticalLine1)// The two lines a parallels
				return null;

			if(l.isHorizontalLine())// Points of the line l are equal.
				return null;

			if(isHorizontalLine()) {
				x = l.getX1();
				y = getY1();
			}else {
				y = a*l.getX1()+b;
				x = (y-b)/a;
			}
		}else {
			double la = l.getA();
			double lb = l.getB();

			if(verticalLine1) {
				if(l.isHorizontalLine()) {
					x = getX1();
					y = l.getY1();
				} else {
					y = la*getX1()+lb;
					x = (y-lb)/la;
				}
			}else {
				x = (b-lb)/(la-a);
				y = a*x+b;
			}
		}

		return new Point2D.Double(x, y);
	}


	
	public Line getParallel(final double x, final double y) {
		Line line;
		
		if(isVerticalLine())
			line = new Line(new Point2D.Double(x, -10000), new Point2D.Double(x, 10000));
		else if(isHorizontalLine())
			line = new Line(new Point2D.Double(-10000, y), new Point2D.Double(10000, y));
		else {
			final double myB = y-getA()*x;
			final double myX = x+10000;
			
			line = new Line(new Point2D.Double(x, y), new Point2D.Double(myX, getA()*myX+myB));
		}
		
		return line;
	}
	
	
	public double getDistance(final Line line) {
		double distance;
		
		if(isParallel(line))
			if(isVerticalLine())
				distance = Math.abs(getX1()-line.getX1()); 
			else 
				distance = Math.abs(getB()-line.getB())/Math.sqrt(a*a+1);
		else
			distance = java.lang.Double.NaN;
		
		return distance;
	}
	


	public Point2D getMiddlePt() {
		return new Point2D.Double((getX1()+getX2())/2., (getY1()+getY2())/2.);
	}



	public Point2D getIntersectionSegment(final Line l) {
		Point2D p = getIntersection(l);

		if(p==null)
			return null;

		double px  = p.getX();
		double py  = p.getY();
		Point2D tl  = getTopLeftPoint();
		Point2D br  = getBottomRightPoint();
		Point2D tl2 = l.getTopLeftPoint();
		Point2D br2 = l.getBottomRightPoint();

		if((px>=tl.getX() && px<=br.getX() && py>=tl.getY() && py<=br.getY()) &&
		   (px>=tl2.getX() && px<=br2.getX() && py>=tl2.getY() && py<=br2.getY()))
			return p;

		return null;
	}
	
	
	
	public Point2D getTopLeftPoint() {
		Point2D pt1 = getP1();
		Point2D pt2 = getP2();

		return new Point2D.Double(pt1.getX()<pt2.getX() ? pt1.getX() : pt2.getX(), pt1.getY()<pt2.getY() ? pt1.getY() : pt2.getY());
	}



	public Point2D getBottomRightPoint() {
		Point2D pt1 = getP1();
		Point2D pt2 = getP2();

		return new Point2D.Double(pt1.getX()<pt2.getX() ? pt2.getX() : pt1.getX(), pt1.getY()<pt2.getY() ? pt2.getY() : pt1.getY());
	}


	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}


	public void setP1(final double x, final double y) {
		this.x1 = x;
		this.y1 = y;
	}


	public void setP2(final double x, final double y) {
		this.x2 = x;
		this.y2 = y;
	}
}
