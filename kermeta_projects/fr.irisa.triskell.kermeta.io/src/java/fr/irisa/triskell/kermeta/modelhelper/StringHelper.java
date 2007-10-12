

/*$Id: StringHelper.java,v 1.3 2007-10-12 09:15:36 ftanguy Exp $
* Project : org.kermeta.io
* File : 	StringHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

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
/*		int index = path.lastIndexOf(".");
		if ( index != -1 )
			path = path.substring(0, index);
		path += newExtension;
		return path;*/
	}
	
}


