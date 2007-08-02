

/*$Id: KermetaIOFileNotFoundException.java,v 1.3 2007-08-02 15:56:04 dvojtise Exp $
* Project : org.kermeta.io
* File : 	KermetaIOFileNotFound.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 29 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.exceptions;

@SuppressWarnings("serial")
public class KermetaIOFileNotFoundException extends KermetaIOLoadingException {
	
	public KermetaIOFileNotFoundException(String uri) {
		super( getMessage(uri) );
	}

	static private String getMessage(String uri) {
		return "File " + uri + " not found.";
	}
	
}


