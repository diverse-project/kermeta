

/*$Id: FileHelper.java,v 1.1 2008-03-05 08:28:44 ftanguy Exp $
* Project : org.kermeta.io
* File : 	StringHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 juin 07
* Authors : paco
*/

package org.kermeta.core.helper;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

public class FileHelper {

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
	
	/**
	 * 
	 * @param filePath a file path matching platform:/resource/* or platform:/plugin/* or an absolute path like file:/*
	 * @return True if the file exists, false otherwise.
	 */
	static public boolean exists(String filePath) {
		URI uri = URI.createURI(filePath);
		// Resolving the filePath
		URIConverter converter = new URIConverterImpl();
		uri = converter.normalize(uri);
		File f = new File(uri.toString().replace("file:", ""));
		return f.exists();
	}
	
}


