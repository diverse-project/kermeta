

/*$Id: NotRegisteredURIException.java,v 1.3 2008-04-28 11:50:19 ftanguy Exp $
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


