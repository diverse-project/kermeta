/*
 * Created on 10 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader.emfatic;

import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;



/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KMLoaderModuleEmfatic extends KermetaLoaderModule {

	public KermetaUnit createKermetaUnit(String uri) {
		return new EmfaticUnit(uri);
	}
}
