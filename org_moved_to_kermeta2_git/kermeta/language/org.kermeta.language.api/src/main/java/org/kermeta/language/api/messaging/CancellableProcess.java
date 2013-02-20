/*$Id: $
* Project : org.kermeta.language.api
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 août 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.api.messaging;

/**
 * Object responsible for monitoring the cancellation of a given process via a ProgressMessage system 
 * must implement this interface.
 */
public interface CancellableProcess {
	
	/**
	 * Cancel the given process via a ProgressMessage system
	 */
	public void cancel();

}
