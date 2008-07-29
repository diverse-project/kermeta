/*$Id: ReferenceComparer.java,v 1.1 2008-07-29 12:01:53 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	ReferenceComparer.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 29 juil. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.customidentity;

import org.eclipse.jface.viewers.IElementComparer;

/**
 * Comparer thats use object reference instead of the equals methods 
 *
 */
public class ReferenceComparer implements IElementComparer {

	public boolean equals(Object a, Object b) {
		
		return a == b;
	}

	public int hashCode(Object element) {
		return element.hashCode();
	}

}
