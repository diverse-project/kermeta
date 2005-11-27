/* $Id: ClassNode.java,v 1.1 2005-11-27 19:46:03 dvojtise Exp $
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
import java.awt.Graphics;

import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGPanel;

public class ClassNode extends Node {

	public static int BORDER_WIDTH       = 2;
	public static int ATTRIBUTECELL_HEIGHT      = 4;
	public static int OPERATIONCELL_HEIGHT       = 4;
	

    protected Color borderColor = new Color(100,100,100);
    
	public ClassNode(String id) {		
		super(id);
	}

	public ClassNode(String id, String label) {
		super(id,label);
	}

	/** Return the height of this Node. */
    public int getHeight() {
    	int margin = 4*BORDER_WIDTH + ATTRIBUTECELL_HEIGHT + OPERATIONCELL_HEIGHT;
        if ( fontMetrics != null ) {
        	return fontMetrics.getHeight() + margin;
        } else {
            return margin;
        }
    }
    
	/** Paints the background of the node, along with its label */
    public void paintNodeBody( Graphics g, TGPanel tgPanel) {
        g.setFont(font);
        fontMetrics = g.getFontMetrics();
        
        int ix = (int)drawx;
        int iy = (int)drawy;
        int h = getHeight();
        int w = getWidth();

        Color borderCol = getPaintBorderColor(tgPanel);
        g.setColor(borderCol);

        // TYPE_RECTANGLE
        g.fillRect(ix - w/2, iy - h / 2, w, h);

        Color backCol = getPaintBackColor(tgPanel);
        g.setColor(backCol);

        // TYPE_RECTANGLE
        //g.fillRect(ix - w/2+2, iy - h / 2+2, w-BORDER_WIDTH, h-BORDER_WIDTH);
        g.fillRect(ix - w/2+BORDER_WIDTH, iy - h / 2+BORDER_WIDTH,
        		w-2*BORDER_WIDTH, fontMetrics.getHeight());
        g.fillRect(ix - w/2+BORDER_WIDTH, iy - (h / 2 ) + 2*BORDER_WIDTH + fontMetrics.getHeight() , 
        		w-2*BORDER_WIDTH, ATTRIBUTECELL_HEIGHT);
        g.fillRect(ix - w/2+BORDER_WIDTH, iy - h / 2 + 3*BORDER_WIDTH + ATTRIBUTECELL_HEIGHT + fontMetrics.getHeight(), 
        		w-2*BORDER_WIDTH, OPERATIONCELL_HEIGHT);

        Color textCol = getPaintTextColor(tgPanel);
        g.setColor(textCol);
        g.drawString(lbl, ix - fontMetrics.stringWidth(lbl)/2, iy + fontMetrics.getDescent() +1 - 3*BORDER_WIDTH);
    }
}
