/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KMLoaderModuleMCT extends KermetaLoaderModule {



	public KermetaUnit createKermetaUnit(String uri, Hashtable packages) {
		return new KMTUnit(uri, packages);
	}
}
