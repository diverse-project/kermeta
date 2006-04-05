/* $Id: FeatureNode.java,v 1.2 2006-04-05 21:36:35 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : ClassNode.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 26 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.graphlayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGPanel;

public class FeatureNode extends Node {

	
	
	

    protected Color textColor = new Color(20, 20, 20);
    
	public FeatureNode(String id) {		
		super(id);
	}

	public FeatureNode(String id, String label) {
		super(id,label);
	}

	/** Return the height of this Node. */
    public int getHeight() {
        if ( fontMetrics != null ) {
        	return fontMetrics.getHeight() ;
        } else {
            return 1;
        }
    }
    
	/** Paints the background of the node, along with its label */
    public void paintNodeBody( Graphics g, TGPanel tgPanel) {
//    	 update fontMetric depending on distance to selection
    	font = new Font("Courier",Font.PLAIN,12-distToSelection);
        g.setFont(font);
        fontMetrics = g.getFontMetrics();
        
        int ix = (int)drawx;
        int iy = (int)drawy;
        
        g.setColor(textColor);
        g.drawString(lbl, ix - fontMetrics.stringWidth(lbl)/2, iy + fontMetrics.getDescent() +1 );
    }
}
