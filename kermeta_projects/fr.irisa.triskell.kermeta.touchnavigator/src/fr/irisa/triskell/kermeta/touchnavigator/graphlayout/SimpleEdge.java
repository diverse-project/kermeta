/* $Id: SimpleEdge.java,v 1.2 2005-12-05 19:14:30 dvojtise Exp $
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

public class SimpleEdge extends Edge {

	public SimpleEdge(Node f, Node t) {
		super(f, t);
	}
	
	public SimpleEdge(Node f, Node t, int tension) {
		super(f, t, tension);
	}

	public static void paintArrow(Graphics g, int x1, int y1, int x2, int y2, Color c) {
		g.setColor(c);
        g.drawLine(x1,   y1,   x2, y2);
	}
	
	public void paint(Graphics g, TGPanel tgPanel) {
        Color c = (tgPanel.getMouseOverE()==this) ? MOUSE_OVER_COLOR : col;

        int x1=(int) from.drawx;
        int y1=(int) from.drawy;
        int x2=(int) to.drawx;
        int y2=(int) to.drawy;
        if (intersects(tgPanel.getSize())) paintArrow(g, x1, y1, x2, y2, c);
        //paintSpline(g,tgPanel);
    }

}
