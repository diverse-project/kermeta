package org.kermeta.ki.diagram.view.impl;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

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

	
	
	public Point2D intersectionPoint(final Rectangle2D rec) {
		final double width 	= rec.getWidth();
		final double height = rec.getHeight();
		final double x 		= rec.getX();
		final double y 		= rec.getY();
		
		Point2D pt = getIntersectionSegment(new Line(x, y, x+width, y));
	
		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(new Line(x+width, y, x+width, y+height));
		
		if(pt!=null)
			return pt;
		
		pt = getIntersectionSegment(new Line(x, y+height, x+width, y+height));
		
		if(pt!=null)
			return pt;
		
		return getIntersectionSegment(new Line(x, y, x, y+height));
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
		if(l==null || Number.NUMBER.equals(a, l.getA())) 
			return null;

		boolean verticalLine1 = isVerticalLine();
		boolean verticalLine2 = l.isVerticalLine();
		boolean horiz1		  = isHorizontalLine();
		boolean horiz2		  = l.isHorizontalLine();
		
		if((verticalLine1 && (verticalLine2 || horiz1)) || (verticalLine2 && horiz2) || (horiz1 && horiz2))
			return null;
		
		double x;
		double y;

		if(verticalLine2)
			if(horiz1) {
				x = l.getX1();
				y = getY1();
			}else {
				y = a*l.getX1()+b;
				x = (y-b)/a;
			}
		else {
			double la = l.getA();
			double lb = l.getB();

			if(verticalLine1) {
				if(horiz2) {
					x = getX1();
					y = l.getY1();
				} else {
					y = la*getX1()+lb;
					x = (y-lb)/la;
				}
			}else {
				if(horiz1) { //TODO backport to the latexdraw trunk + add test: does not manage horiz liens
					x = (b-lb)/la;
					y = getY1();
				}else
				if(horiz2) {
					x = (lb-b)/a;
					y = l.getY1();
				}else {
					x = (b-lb)/(la-a);
					y = a*x+b;
				}
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
