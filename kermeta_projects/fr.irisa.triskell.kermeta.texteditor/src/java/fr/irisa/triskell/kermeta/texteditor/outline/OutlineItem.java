
/*$Id: OutlineItem.java,v 1.10 2007-12-17 14:05:10 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta.texteditor
 * File : 	OutlineItem.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 29 nov. 07
 * Authors : paco
 */

package fr.irisa.triskell.kermeta.texteditor.outline;

import org.eclipse.swt.graphics.Image;

public class OutlineItem {

	protected String label;

	protected Image image;
	
	protected Object[] children;
	

	public OutlineItem() {
	}
	
	public OutlineItem(String text) {
		label = text;
	}

	public String getLabel() {
	    return label;
	}

	public Image getImage() {
	    return image;
	}

	public Object[] getChildren() {
		return children;
	}

}
