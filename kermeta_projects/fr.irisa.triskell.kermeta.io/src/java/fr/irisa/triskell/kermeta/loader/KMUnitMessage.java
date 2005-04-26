/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMUnitMessage {

	protected String message;
	protected FObject node;
	
	public KMUnitMessage(String message, FObject node) {
		this.message = message;
		this.node = node;
	}

	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @return Returns the node.
	 */
	public FObject getNode() {
		return node;
	}
}
