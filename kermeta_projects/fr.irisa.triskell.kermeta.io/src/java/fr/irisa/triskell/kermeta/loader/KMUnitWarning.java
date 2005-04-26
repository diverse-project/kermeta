/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader;

import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMUnitWarning extends KMUnitMessage {

	/**
	 * @param message
	 * @param node
	 */
	public KMUnitWarning(String message, FObject node) {
		super("WARNING - " + message, node);
	}
}