/*$Id: Interest.java,v 1.3 2007-05-25 15:04:39 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.extension;

/**
 * 
 * This interface represents an object that is interested in another
 * object. Tipically, the object will claim its interest to a host and whenever
 * the target object changes, the host will call the updateValue method on object interested.
 * 
 * @author paco
 *
 */
public interface Interest {

	public void updateValue(Object newValue);
	
}
