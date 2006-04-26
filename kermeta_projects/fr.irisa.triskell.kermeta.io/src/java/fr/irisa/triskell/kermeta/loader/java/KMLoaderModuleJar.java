/* $Id: KMLoaderModuleJar.java,v 1.1 2006-04-26 16:48:32 dvojtise Exp $
* Project : Kermeta.io
* File : KMLoaderModuleJar.java
* License : EPL
* Copyright : INRIA / IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 / 04 / 2006
* Authors : 	
* 	Didier Vojtisek <dvojtise@irisa.fr>
*/ 
package fr.irisa.triskell.kermeta.loader.java;


import java.util.Hashtable;

import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * LoaderModule dedicated to load a Jar file as a KermetaUnit
 * 
 */
public class KMLoaderModuleJar extends KermetaLoaderModule {

    /**
     * 
     */
    public KMLoaderModuleJar() {
        super();
    }

   

	public KermetaUnit createKermetaUnit(String uri, Hashtable packages) {
		KermetaUnit.internalLog.debug("KMLoaderModuleJar.createKermetaUnit " + uri);
		return new JarUnit(uri, packages);
	}
}
