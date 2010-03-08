/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ContextNotInitializedOnAFrameworkException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 févr. 2010
* Authors : Didier Vojtisek
*/

package fr.irisa.triskell.kermeta.typechecker;

/**
 * Exceptioon raised when trying to Initialize a typechecker context on a KermetaUnit that is not a framwork
 * @author dvojtise
 *
 */
@SuppressWarnings("serial")
public class ContextNotInitializedOnAFrameworkError extends Error {

	public ContextNotInitializedOnAFrameworkError(String uri) {
		super(uri);
	}

}
