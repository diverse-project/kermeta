/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader;

import fr.irisa.triskell.kermeta.ast.KermetaASTNode;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

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
	public KMUnitWarning(String message, fr.irisa.triskell.kermeta.language.structure.Object node) {
		super(message, node);
	}
	/**
	 * @param message
	 * @param astnode
	 */
	public KMUnitWarning(String message, KermetaASTNode node) {
		super(message, node);
	}
	/**
	 * @param message
	 * @param node
	 * @param astnode
	 */
	public KMUnitWarning(String message, fr.irisa.triskell.kermeta.language.structure.Object node, KermetaASTNode astnode) {
		super(message, node, astnode);
	}
}