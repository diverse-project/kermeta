/* $Id: KMUnitMessage.java,v 1.4 2005-11-28 12:32:50 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : KMUnitMessage.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Created on 2 févr. 2005
 * Authors :
 * 		Franck FLEUREY <ffleurey@irisa.fr>
 * 		Didier Vojtisek <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.loader;


import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * Represents a message in a Kermeta Unit
 * The message can be related to a FObject node and/or to an AST node 
 */
public class KMUnitMessage {

	
	protected String message;
	protected FObject node;
	protected KermetaASTNode astn;
	
	public KMUnitMessage(String message, FObject node, KermetaASTNode astnode) {
		this.message = message;
		this.node = node;
		this.astn = astnode;
	}
	public KMUnitMessage(String message, FObject node) {
		this.message = message;
		this.node = node;
	}

	public KMUnitMessage(String message, KermetaASTNode node) {
		this.message = message;
		this.astn = node;
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
	
	/**
	 * @return Returns the Astnode.
	 */
	public KermetaASTNode getAstNode() {
		return astn;
	}
}
