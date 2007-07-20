

/*$Id: StringHelper.java,v 1.2 2007-07-20 15:08:10 ftanguy Exp $
* Project : org.kermeta.io
* File : 	StringHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

public class StringHelper {

	static public String replaceExtension(String path, String newExtension) {
		int index = path.lastIndexOf(".");
		if ( index != -1 )
			path = path.substring(0, index);
		path += newExtension;
		return path;
	}
	
}


