

/*$Id: NonModelElementItem.java,v 1.1 2007-12-17 14:05:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	NonModelElementItem.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 29 nov. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

public class NonModelElementItem extends OutlineItem {

	public NonModelElementItem(String text) {
		super(text);
	}
	
	@Override
	public Object[] getChildren() {
		return new Object[] {};
	}
	
}


