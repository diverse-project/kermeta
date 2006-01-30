/* $Id: DiamondEdge.java,v 1.3 2006-01-30 12:44:37 dvojtise Exp $
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
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGPanel;

public class DiamondEdge extends Edge {

	public DiamondEdge(Node f, Node t) {
		super(f, t);
	}
	
	public DiamondEdge(Node f, Node t, int tension) {
		super(f, t, tension);
	}
	
	public void paint(Graphics g, TGPanel tgPanel) {
        Color c = (tgPanel.getMouseOverE()==this) ? MOUSE_OVER_COLOR : col;
        g.setColor(c);
        
        int x1=(int) from.drawx;
        int y1=(int) from.drawy;
        int x2=(int) to.drawx;
        int y2=(int) to.drawy;
        if (intersects(tgPanel.getSize())) {
        	Point intersection= Geom.getIntersectionPoint(new Point(x1,y1),
        			new Rectangle(x2-getTo().getWidth()/2, y2-getTo().getHeight()/2, getTo().getWidth(), getTo().getHeight()));
        	Arrow.init(12,0.7);
        	Point p = Arrow.drawArrow(g, x1, y1, intersection.x, intersection.y, Arrow.TYPE_FILLED_DIAMOND_ARROW);
        	if(p != null)
            	g.drawLine(x1, y1, p.x, p.y);
        }
    }
	
	
	
}
