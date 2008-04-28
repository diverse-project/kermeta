

/*$Id: URIMalformedException.java,v 1.4 2008-04-28 11:50:19 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	URIMalformedException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 4 juil. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.exceptions;

@SuppressWarnings("serial")
public class URIMalformedException extends KermetaIOException {

	public URIMalformedException(String uri) {
		super( getMessage(uri) );
	}

	private static String getMessage(String uri) {
		return uri + " is malformed : expecting uri formed like platform:/plugin/* or platform:/resource/*";
	}
	
}


