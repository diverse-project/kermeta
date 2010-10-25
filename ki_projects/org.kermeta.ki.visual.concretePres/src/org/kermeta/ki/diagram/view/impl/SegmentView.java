package org.kermeta.ki.diagram.view.impl;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import org.kermeta.ki.diagram.view.interfaces.ISegmentView;

public class SegmentView implements ISegmentView {
	protected Point2D pointSrc;
	
	protected Point2D pointTar;

	
	public SegmentView(final Point2D srcPt, final Point2D tarPt) {
		super();
		
		if(srcPt==null || tarPt==null)
			throw new IllegalArgumentException();
		
		pointSrc = srcPt;
		pointTar = tarPt;
	}
	
	
	
	@Override
	public void paint(final Graphics2D g) {
		g.draw(new Line2D.Double(pointSrc, pointTar));
	}
	
	
	@Override
	public Point2D getPointSource() {
		return pointSrc;
	}


	@Override
	public Point2D getPointTarget() {
		return pointTar;
	}

	@Override
	public boolean isWestDirection() {
		return pointSrc.getX()>pointTar.getX();
	}
	

	@Override
	public boolean isNorthDirection() {
		return pointSrc.getY()<pointTar.getY();
	}
	
	
	@Override
	public double getLineAngle() {
		if(pointSrc.getY()==pointTar.getY())
			return isWestDirection() ? Math.PI : 0.;
		
		if(pointSrc.getX()==pointTar.getX())
			return isNorthDirection() ? Math.PI/2. : -Math.PI/2.;

		return isWestDirection() ? Math.atan(getA())+Math.PI : Math.atan(getA());
	}
	
	
	@Override
	public double getA() {
		if(isVerticalLine())
			return Double.NaN;

		return (pointSrc.getY() - pointTar.getY())/(pointSrc.getX() - pointTar.getX());
	}

	
	
	@Override
	public double getB() {
		return pointSrc.getY() - getA() * pointSrc.getX();
	}
	
	
	
	@Override
	public boolean isVerticalLine() {
		if(pointSrc==null || pointTar==null)
			return false;
		
		return Number.NUMBER.equals(pointSrc.getX(), pointTar.getX());
	}
	
	
	
	@Override
	public boolean isHorizontalLine() {
		if(pointSrc==null || pointTar==null)
			return false;
		
		return Number.NUMBER.equals(pointSrc.getY(), pointTar.getY());
	}
	
	
	
	@Override
	public Line2D getPerpendicularLine(final Point2D pt) {//TODO to remove
		if(isVerticalLine())
			return Number.NUMBER.equals(pt.getX(), pointSrc.getX()) ? new Line2D.Double(0., pt.getY(), pt.getX(), pt.getY()) : null;
			
		if(Number.NUMBER.equals(pt.getX(), 0.)) {
			Point2D pt3  = new Point2D.Double(pointTar.getX(), pointTar.getY());
			Point2D pt2  = Number.NUMBER.rotatePoint(pt3, pt, Math.PI/2.);
			
			return new Line2D.Double(pt2, pt);
		}
		
		final double a = getA();
		
		if(Number.NUMBER.equals(a, 0.))
			return new Line2D.Double(pt.getX(), pt.getY(), pt.getX(), pt.getY()-10.);
		
		double a2 = -1./a;
		
		return new Line2D.Double(0., pt.getY()-a2*pt.getX(), pt.getX(), pt.getY());
	}



	@Override
	public boolean contains(final double x, final double y) {
		final double dec = 5.;
		boolean in;
		
		if(pointSrc.getY()<=pointTar.getY())
			in = y>=pointSrc.getY()-dec && y<=pointTar.getY()+dec;
		else
			in = y<=pointSrc.getY()+dec && y>=pointTar.getY()-dec;
		
		if(in)
			if(pointSrc.getX()<=pointTar.getX())
				in = x>=pointSrc.getX()-dec && x<=pointTar.getX()+dec;
			else
				in = x<=pointSrc.getX()+dec && x>=pointTar.getX()-dec;

		if(in && (isVerticalLine() && Number.NUMBER.equals(x, pointSrc.getX(), dec) ||
				isHorizontalLine() && Number.NUMBER.equals(y, pointSrc.getY(), dec)))
			return true;
		
		if(in) {
			// Compute the equation of the line (y = ax + b)
			final double axb = getA()*x+getB();
			in = y>=axb-dec && y<=axb+dec;
		}
		
		return in;
	}



	@Override
	public void replacePointSource(final Point2D newPt) {
		if(newPt!=null)
			pointSrc = newPt;
	}



	@Override
	public void replacePointTarget(final Point2D newPt) {
		if(newPt!=null)
			pointTar = newPt;		
	}
}
