

/*$Id: URIMalformedException.java,v 1.2 2007-07-20 15:08:19 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	URIMalformedException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 4 juil. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.exceptions;

public class URIMalformedException extends KermetaIOException {

	public URIMalformedException(String uri) {
		super( getMessage(uri) );
	}

	private static String getMessage(String uri) {
		return uri + " is malformed : expecting uri formed like platform:/plugin/* or platform:/resource/*";
	}
	
}


