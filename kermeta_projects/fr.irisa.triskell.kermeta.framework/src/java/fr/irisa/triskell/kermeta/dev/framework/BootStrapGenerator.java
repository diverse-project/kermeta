/*
 * Created on 14 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.dev.framework;

import fr.irisa.triskell.kermeta.loader.KermetaLoader;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class BootStrapGenerator {
	
	KermetaUnit abstract_unit;
	KermetaUnit concrete_unit;
	
	
	
	/**
	 * 
	 */
	public BootStrapGenerator() {
		super();
	}

	public void loadModels() {
		
	// KermetaLoader.getDefaultLoader().load("../models/build/kermeta.emf");
		
	}
}
