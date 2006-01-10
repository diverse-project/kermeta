/* $Id: ClassNode.java,v 1.3 2006-01-10 22:50:42 dvojtise Exp $
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

	private static final int shortLabelLevel = 1;
	public static int BORDER_WIDTH       = 2;
	public static int ATTRIBUTECELL_HEIGHT      = 4;
	public static int OPERATIONCELL_HEIGHT       = 4;
	
	protected String shortLabel = null; 
	

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
        g.drawString(getDisplayLabel(), ix - fontMetrics.stringWidth(getDisplayLabel())/2, iy + fontMetrics.getDescent() +1 - 3*BORDER_WIDTH);
    }

	

	/**
	 * @return Returns the shortLabel.
	 */
	public String getShortLabel() {
		return shortLabel;
	}

	/**
	 * @param shortLabel The shortLabel to set.
	 */
	public void setShortLabel(String shortLabel) {
		this.shortLabel = shortLabel;
	}
	
	
	public String getDisplayLabel(){
		if(shortLabel != null && distToSelection >= shortLabelLevel)
			return shortLabel;
		else
			return super.getLabel();
		
	}

	/* (non-Javadoc)
	 * @see com.touchgraph.graphlayout.Node#getWidth()
	 */
	@Override
	public int getWidth() {
		if ( fontMetrics != null && getDisplayLabel() != null ) {
            return fontMetrics.stringWidth(getDisplayLabel()) + 12;            
        } else {
            return 10;
        }
	}
        
}
