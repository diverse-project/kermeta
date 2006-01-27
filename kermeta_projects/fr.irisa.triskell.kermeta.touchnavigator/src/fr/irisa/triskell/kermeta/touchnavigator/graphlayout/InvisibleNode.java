/* $Id: InvisibleNode.java,v 1.2 2006-01-27 19:41:22 dvojtise Exp $
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

import java.awt.Graphics;

import com.touchgraph.graphlayout.Node;
import com.touchgraph.graphlayout.TGPanel;

public class InvisibleNode extends Node {

	public InvisibleNode(String id) {		
		super(id);
	}

	public InvisibleNode(String id, String label) {
		super(id,label);
	}

	/** Return the height of this Node. */
    public int getHeight() {
    	return 1;
    }
    
    /** Return the width of this Node. */
    public int getWidth() {
        return 1;
    }
    
	/** Paints the background of the node, along with its label */
    public void paintNodeBody( Graphics g, TGPanel tgPanel) {
        // nothing to do since it is invisible ;-)
    }
}
