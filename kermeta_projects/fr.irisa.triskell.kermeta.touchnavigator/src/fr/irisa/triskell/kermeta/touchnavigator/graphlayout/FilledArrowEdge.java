/* $Id: FilledArrowEdge.java,v 1.1 2005-11-27 19:46:03 dvojtise Exp $
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

import java.awt.Color;
import java.awt.Graphics;

import com.touchgraph.graphlayout.Edge;
import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGPanel;

public class FilledArrowEdge extends Edge {

	public FilledArrowEdge(Node f, Node t) {
		super(f, t);
	}
	
	public FilledArrowEdge(Node f, Node t, int tension) {
		super(f, t, tension);
	}

	public static void paintArrow(Graphics g, int x1, int y1, int x2, int y2, Color c) {
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

        g.drawLine(x3,   y3,   x2, y2);
        g.drawLine(x1,   y1,   x3, y3);
        
        
        Arrow.drawArrow(g,x1,y1,x3,y3, Arrow.TYPE_FILLED_TRIANGLE_ARROW);
	}
	
	public void paint(Graphics g, TGPanel tgPanel) {
        Color c = (tgPanel.getMouseOverE()==this) ? MOUSE_OVER_COLOR : col;

        int x1=(int) from.drawx;
        int y1=(int) from.drawy;
        int x2=(int) to.drawx;
        int y2=(int) to.drawy;
        if (intersects(tgPanel.getSize())) paintArrow(g, x1, y1, x2, y2, c);
    }

}
