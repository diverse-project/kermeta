

/*$Id: KermetaIOFileNotFoundException.java,v 1.2 2007-07-20 15:08:19 ftanguy Exp $
* Project : org.kermeta.io
* File : 	KermetaIOFileNotFound.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 29 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.exceptions;

public class KermetaIOFileNotFoundException extends KermetaIOLoadingException {
	
	public KermetaIOFileNotFoundException(String uri) {
		super( getMessage(uri) );
	}

	static private String getMessage(String uri) {
		return "File " + uri + " not found.";
	}
	
}


