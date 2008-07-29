/*$Id: ReferenceComparer.java,v 1.2 2008-07-29 12:58:04 dvojtise Exp $
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


/**
 * Comparer thats use object reference instead of the equals methods 
 *
 */
public class ReferenceComparer implements IComparer {

	public boolean equals(Object a, Object b) {
		
		return a == b;
	}

	public int hashCode(Object element) {
		return element.hashCode();
	}

}
