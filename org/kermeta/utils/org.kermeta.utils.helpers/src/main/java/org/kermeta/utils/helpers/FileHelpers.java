/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 29 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/
package org.kermeta.utils.helpers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class FileHelpers {
	
	private static String cleanIfNecessaryPath(String resourcePath) {
		// deal with windows \\ delimiter
		String unifiedSepratorResourcePath = resourcePath.replaceAll("\\\\", "/");
				
		if ( !unifiedSepratorResourcePath.matches("file:/.*") ){
			unifiedSepratorResourcePath = "file:/" + unifiedSepratorResourcePath;
		}
		unifiedSepratorResourcePath = unifiedSepratorResourcePath.replaceAll(" ", "%20");
			
		return unifiedSepratorResourcePath;
	}
	
	public static URL StringToURL(String url) throws MalformedURLException {
		return new URL(cleanIfNecessaryPath(url));
	}
	
	public static URI StringToURI(String url) throws URISyntaxException {
		return new URI(cleanIfNecessaryPath(url));
	}
	
	public static URL FileToURL(File file) throws MalformedURLException {
		return file.toURI().toURL();
	}
	
	public static String URLToStringWithoutFile(URL url) throws URISyntaxException {
		return url.toString().replaceFirst("file:/", "");
	}
}
