/*$Id: JarHelper.java,v 1.1 2008-07-23 12:31:32 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	JarHelper.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 23 juil. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.core.helper;

import java.net.URL;
import java.security.CodeSource;

/**
 * A helper class that deal with jar file
 *
 */
public class JarHelper {
	
	/**
	 * retrieve the location of the jar contains the given class, this is useful in standalone mode in order to get default URI for various files in the jar
	 * @return
	 */
	public static URL locateContainerJar(Class<?> classInTheJar){
		CodeSource source = classInTheJar.getProtectionDomain().getCodeSource();
	    if ( source != null ){
	       URL location = source.getLocation();
	       return location;
	    }
	    else {
	       return null;
	    }	
    }
	
	/**
	 * retrieve the location of the jar that contains the given class, this is useful in standalone mode in order to get default URI for various files in the jar
	 * @return
	 */
	public static URL locateContainerJar(String qualifiedClassName){
		try {
			
			Class<?> qc = Class.forName( qualifiedClassName );
		
			return locateContainerJar(qc);
			
	    } catch (ClassNotFoundException e) {
			return null;
		}	
    }
	
}
