/* $Id: KMUnitMessage.java,v 1.5 2006-03-03 15:22:19 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : KMUnitMessage.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Created on 2 f�vr. 2005
 * Authors :
 * 		Franck FLEUREY <ffleurey@irisa.fr>
 * 		Didier Vojtisek <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.loader;


import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * Represents a message in a Kermeta Unit
 * The message can be related to a fr.irisa.triskell.kermeta.language.structure.Object node and/or to an AST node 
 */
public class KMUnitMessage {

	
	protected String message;
	protected fr.irisa.triskell.kermeta.language.structure.Object node;
	protected KermetaASTNode astn;
	
	public KMUnitMessage(String message, fr.irisa.triskell.kermeta.language.structure.Object node, KermetaASTNode astnode) {
		this.message = message;
		this.node = node;
		this.astn = astnode;
	}
	public KMUnitMessage(String message, fr.irisa.triskell.kermeta.language.structure.Object node) {
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
	public fr.irisa.triskell.kermeta.language.structure.Object getNode() {
		return node;
	}
	
	/**
	 * @return Returns the Astnode.
	 */
	public KermetaASTNode getAstNode() {
		return astn;
	}
}
