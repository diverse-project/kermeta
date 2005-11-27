/* $Id: Geom.java,v 1.1 2005-11-27 19:46:03 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : Geom.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;

/**
 * geometric useful functions
 *
 */
public class Geom {
	/**
	 * 
	 * @param p1
	 * @param r
	 * @return return the intersection point of the line going from the center of a retangle and the point
	 */
	public static Point getIntersectionPoint(Point p1, Rectangle r){
        double cx1 = r.getCenterX();
        double cy1 = r.getCenterY();
        // find angle of line from label1 to label2
        double dy = p1.y - cy1;
        double dx = p1.x - cx1;
        double theta = Math.atan2(dy, dx);
        //System.out.println("theta = " + Math.toDegrees(theta));
        // find intersection point of line with label1
        return getIntersectingPoint(theta, r);
	}
	public static Point getIntersectingPoint(double theta, Rectangle r)
    {
        double cx = r.getCenterX();
        double cy = r.getCenterY();
        double W = r.getWidth()/2;
        double H = r.getHeight()/2;
        double R = Point2D.distance(cx, cy, cx+W, cy+H);
        double x = cx + R * Math.cos(theta);
        double y = cy + R * Math.sin(theta);
        Point2D.Double p = new Point2D.Double();
        int outcode = r.outcode(x, y);
        switch(outcode)
        {
            case Rectangle.OUT_TOP:
                p.x = cx - H * ((x - cx)/(y - cy));
                p.y = cy - H;
                break;
            case Rectangle.OUT_LEFT:
                p.x = cx - W;
                p.y = cy - W * ((y - cy)/(x - cx));
                break;
            case Rectangle.OUT_BOTTOM:
                p.x = cx + H * ((x - cx)/(y - cy));
                p.y = cy + H;
                break;
            case Rectangle.OUT_RIGHT:
                p.x = cx + W;
                p.y = cy + W * ((y - cy)/(x - cx));
                break;
            default: System.out.println("non-cardinal outcode: " + outcode);
        }
        return new Point((int)p.x, (int)p.y);
    }

}
