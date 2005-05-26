/*
 * Created on 10 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader.ecore;


import java.util.Hashtable;

import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KMLoaderModuleECore extends KermetaLoaderModule {

    /**
     * 
     */
    public KMLoaderModuleECore() {
        super();
    }

   

	public KermetaUnit createKermetaUnit(String uri, Hashtable packages) {
	    KermetaUnit.internalLog.debug("KMLoaderModuleECore.createKermetaUnit " + uri);
		return new EcoreUnit(uri, packages);
	}
}
