package org.kermeta.kompren.diagram.view.impl;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

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
		if(Number.NUMBER.equals(pointSrc.getX(), pointTar.getX()))
			return Double.NaN;

		return (pointSrc.getY() - pointTar.getY())/(pointSrc.getX() - pointTar.getX());
	}



	@Override
	public double getB() {
		return pointSrc.getY() - getA() * pointSrc.getX();
	}


	@Override
	public boolean contains(final double x, final double y) {
		final double dec = 5.;
		boolean in;
		final double y1 = pointSrc.getY();
		final double y2 = pointTar.getY();
		final double x1 = pointSrc.getX();
		final double x2 = pointTar.getX();

		if(y1<=y2)
			in = y>=y1-dec && y<=y2+dec;
		else
			in = y<=y1+dec && y>=y2-dec;

		if(in)
			if(pointSrc.getX()<=pointTar.getX())
				in = x>=x1-dec && x<=x2+dec;
			else
				in = x<=x1+dec && x>=x2-dec;

		if(in && Math.abs(x1-x2)>=dec && Math.abs(y1-y2)>=dec) {// TODO check in latexdraw if correct.
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
