

/*$Id: StringHelper.java,v 1.2 2008-02-14 07:13:49 uid21732 Exp $
* Project : org.kermeta.io
* File : 	StringHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 juin 07
* Authors : paco
*/

package org.kermeta.core.helper;

import org.eclipse.emf.common.util.URI;

public class StringHelper {

	/**
	 * 
	 * Given a uri, this method replaces the extension file with the new one.
	 * 
	 * @param path
	 * @param newExtension a String without a point.
	 * @return The new path with the given extension if the given path has an extension.
	 */
	static public String replaceExtension(String path, String newExtension) {
		URI uri = URI.createURI(path);
		if (  uri.fileExtension() != null ) {
			uri = uri.trimFileExtension().appendFileExtension(newExtension);
			return uri.toString();
		}		
		return path;
	}
	
}


