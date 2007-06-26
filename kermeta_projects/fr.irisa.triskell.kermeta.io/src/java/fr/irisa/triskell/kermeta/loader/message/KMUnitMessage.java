/* $Id: KMUnitMessage.java,v 1.3 2007-06-26 15:34:47 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.loader.message;


import com.ibm.eclipse.ldt.core.ast.ASTNode;

/**
 * Represents a message in a Kermeta Unit
 * The message can be related to a fr.irisa.triskell.kermeta.language.structure.Object node and/or to an AST node 
 */
public class KMUnitMessage {

	
	protected String message;
	protected fr.irisa.triskell.kermeta.language.structure.Object node;
	protected ASTNode astn;
	
	public KMUnitMessage(String message, fr.irisa.triskell.kermeta.language.structure.Object node, ASTNode astnode) {
		this.message = message;
		this.node = node;
		this.astn = astnode;
	}
	public KMUnitMessage(String message, fr.irisa.triskell.kermeta.language.structure.Object node) {
		this.message = message;
		this.node = node;
	}

	public KMUnitMessage(String message, ASTNode node) {
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
	public ASTNode getAstNode() {
		return astn;
	}
}
