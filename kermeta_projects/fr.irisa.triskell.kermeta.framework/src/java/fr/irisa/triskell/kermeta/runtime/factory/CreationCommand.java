/*
 * Created on 17 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.runtime.factory;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public abstract class CreationCommand {

	/**
	 * Post creation command to execute
	 * @param object
	 */
	public abstract void execute(KermetaObject object);
	
}
