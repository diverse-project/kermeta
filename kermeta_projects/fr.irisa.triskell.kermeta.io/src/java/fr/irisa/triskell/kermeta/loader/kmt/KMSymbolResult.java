/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolResult extends KMSymbol {

	Operation operation;
	
	/**
	 * @param id
	 */
	public KMSymbolResult(Operation op) {
		super("result");
		operation = op;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return operation;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression(metacore.loader.MetaCoreUnit)
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallVariable call = builder.behav_factory.createCallVariable();
		call.setName("result");
		return call;
	}
	
	public String getDesciption() {
		return "operation result";
	}

}
