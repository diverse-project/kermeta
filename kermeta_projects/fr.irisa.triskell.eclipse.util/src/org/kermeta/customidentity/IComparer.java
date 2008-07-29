/*$Id: IComparer.java,v 1.1 2008-07-29 12:01:53 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	IComparer.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 29 juil. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.customidentity;


/**
 * This interface is used to compare elements in a CustomHashtable for equality,
 * and to provide the hash code for an element.
 * This allows the client of the CustomHashtable to specify different equality criteria
 * and a different hash code implementation than the 
 * <code>equals</code> and <code>hashCode</code> implementations of the
 * elements themselves. 
 * 
 */
public interface IComparer {
	/**
     * Compares two elements for equality
     * 
     * @param a the first element
     * @param b the second element
     * @return whether a is equal to b
     */
    boolean equals(Object a, Object b);

    /**
     * Returns the hash code for the given element.
     * @param element the element the hash code is calculated for
     * 
     * @return the hash code for the given element
     */
    int hashCode(Object element);
}
