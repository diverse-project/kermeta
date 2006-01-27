/* $Id: InheritanceEdge.java,v 1.2 2006-01-27 19:41:22 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : InheritanceEdge.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

//import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGPanel;

public class InheritanceEdge extends Edge {

	public InheritanceEdge(Node f, Node t) {
		super(f, t);
	}
	
	public InheritanceEdge(Node f, Node t, int tension) {
		super(f, t, tension);
	}

	/*public void drawArrow(Graphics g, int x1, int y1, int x2, int y2, Color c) {
		g.setColor(c);

        int x3=x1;
        int y3=y1;

        double dist=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        if (dist>10) {
            double adjustDistRatio = (dist-10)/dist;
            x3=(int) (x1+(x2-x1)*adjustDistRatio);
            y3=(int) (y1+(y2-y1)*adjustDistRatio);
        }

        x3=(int) ((x3*4+x1)/5.0);
        y3=(int) ((y3*4+y1)/5.0);

        Point intersection= geom.getIntersectionPoint(new Point(getTo().getLocation()
        g.drawLine(x3,   y3,   x2, y2);
        //g.drawLine(x1,   y1,   x3, y3);
        
        
        
        
        Point p = Arrow.drawArrow(g,x1,y1,x3,y3, Arrow.TYPE_TRIANGLE_ARROW);
        if(p != null)
        	g.drawLine(x1,   y1,   p.x, p.y);
	}*/
	
	public void paint(Graphics g, TGPanel tgPanel) {
        //Color c = (tgPanel.getMouseOverE()==this) ? MOUSE_OVER_COLOR : col;

        int x1=(int) from.drawx;
        int y1=(int) from.drawy;
        int x2=(int) to.drawx;
        int y2=(int) to.drawy;
        if (intersects(tgPanel.getSize())) {
        	Point intersection= Geom.getIntersectionPoint(new Point(x1,y1),
        			new Rectangle(x2-getTo().getWidth()/2, y2-getTo().getHeight()/2, getTo().getWidth(), getTo().getHeight()));
        	Arrow.init(18,0.5);
        	Point p = Arrow.drawArrow(g, x1, y1, intersection.x, intersection.y, Arrow.TYPE_TRIANGLE_ARROW);
        	if(p != null)
            	g.drawLine(x1, y1, p.x, p.y);
        }
    }
	
	
	
}
