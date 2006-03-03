/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
//import fr.irisa.triskell.kermeta.language.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolInterpreterVariable extends KMSymbol {

	protected String identifier;
	
	/**
	 * @param id
	 */
	public KMSymbolInterpreterVariable(String identifier) {
		super(identifier);
		this.identifier = identifier;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return null;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallVariable call = builder.behav_factory.createCallVariable();
		call.setName(identifier);
		return call;
	}
	
	public String getDesciption() {
		return "interpreter variable " + identifier;
	}
	
}
