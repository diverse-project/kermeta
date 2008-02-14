

/*$Id: NotRegisteredURIException.java,v 1.2 2008-02-14 07:13:17 uid21732 Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	NotRegisteredURIException.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 16 janv. 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.exceptions;

@SuppressWarnings("serial")
public class NotRegisteredURIException extends KermetaIOException {
	
	public NotRegisteredURIException(String uri) {
		super( getMessage(uri) );
	}

	private static String getMessage(String uri) {
		return uri + " not registered in  the EMF registry.";
	}
}


