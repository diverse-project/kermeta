

/*$Id: FileHelper.java,v 1.3 2008-10-31 10:43:55 dvojtise Exp $
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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

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
		URIConverter converter = new ExtensibleURIConverterImpl();
		uri = converter.normalize(uri);
		File f = new File(uri.toString().replace("file:", ""));
		return f.exists();
	}
	
	
	/**
	 * the origin of the code comes from http://www.java-tips.org/java-se-tips/java.io/how-to-copy-a-directory-from-one-location-to-another-loc.html
	 * @param sourceLocation
	 * @param targetLocation
	 * @throws IOException
	 * Note: not tested, but, this operation is probably also able to copy simple files
	 */
	public static void copyDirectory(File sourceLocation , File targetLocation) throws IOException {        
        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }
            
            String[] children = sourceLocation.list();
            for (int i=0; i<children.length; i++) {
                copyDirectory(new File(sourceLocation, children[i]),
                        new File(targetLocation, children[i]));
            }
        } else {
            
            InputStream in = new FileInputStream(sourceLocation);
            OutputStream out = new FileOutputStream(targetLocation);
            
            // Copy the bits from instream to outstream
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        }
    }
}


