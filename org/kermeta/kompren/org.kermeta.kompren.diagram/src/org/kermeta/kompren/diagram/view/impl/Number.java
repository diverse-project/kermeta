package org.kermeta.kompren.diagram.view.impl;

import static java.lang.Math.PI;

import java.awt.geom.Point2D;

public class Number {
	public static final Number NUMBER = new Number();

	private Number() {
		super();
	}



	public boolean equals(final double a, final double b){
		return equals(a, b, 0.00001);
	}


	public boolean equals(final double a, final double b, final double threshold){
		return Math.abs(a - b) <= threshold;
	}


	public Point2D rotatePoint(final Point2D srcPt, final Point2D gravityC, final double theta) {
		Point2D pt = new Point2D.Double();
		double cosTheta;
		double sinTheta;
		double angle 	= theta;
		double gx 		= gravityC.getX();
		double gy 		= gravityC.getY();

		if(angle<0.)
			angle = 2.*PI + angle;

		angle = angle%(2.*PI);

		if(equals(angle, 0.))
			return new Point2D.Double(srcPt.getX(), srcPt.getY());

		if(equals(angle-PI/2., 0.)) {
			cosTheta = 0.;
			sinTheta = 1.;
		}
		else if(equals(angle-PI, 0.)) {
				cosTheta = -1.;
				sinTheta = 0.;
			}
			else if(equals(angle-3.*PI/2., 0.)) {
					cosTheta = 0.;
					sinTheta = -1.;
				}
				else {
					cosTheta = Math.cos(angle);
					sinTheta = Math.sin(angle);
				}

		pt.setLocation(cosTheta * (srcPt.getX() - gx) - sinTheta * (srcPt.getY() - gy) + gx,
					   sinTheta * (srcPt.getX() - gx) + cosTheta * (srcPt.getY() - gy) + gy);

		return pt;
	}

}
