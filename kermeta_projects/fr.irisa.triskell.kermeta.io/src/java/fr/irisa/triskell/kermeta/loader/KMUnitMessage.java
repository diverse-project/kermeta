/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMUnitMessage {

	protected String message;
	protected KermetaASTNode node;
	
	public KMUnitMessage(String message, KermetaASTNode node) {
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
	public KermetaASTNode getNode() {
		return node;
	}
}
