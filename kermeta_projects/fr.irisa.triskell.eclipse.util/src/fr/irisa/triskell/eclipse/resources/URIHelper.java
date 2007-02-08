

/*$Id: URIHelper.java,v 1.1 2007-02-08 15:30:03 ftanguy Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	URIHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 7, 2007
* Authors : ftanguy
*/

/**
 * 
 */
package fr.irisa.triskell.eclipse.resources;

import java.util.List;

import org.eclipse.emf.common.util.URI;

/**
 * @author ftanguy
 *
 */
public class URIHelper {
	
	/**
	 * This method safely removes the platform:/resource scheme of the string uri given as a parameter.
	 * The uri parameter must be of the form platform:/resource/myDir/myFile
	 * @param uri
	 * @return The clean uri as a String
	 */
	static public String getPathFromPlatformURI(String uri) {
		URI u = URI.createURI(uri);
		String path = "";
		boolean mustAdd = false;
		for (String segment : ((List<String>) u.segmentsList()) ) {
			// Avoiding the add of "resource" segment
			if ( ! mustAdd )
				mustAdd = true;
			else
				path += "/" + segment;
		}
		return path;
	}	
		
}


