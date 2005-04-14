/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolResult extends KMSymbol {

	FOperation operation;
	
	/**
	 * @param id
	 */
	public KMSymbolResult(FOperation op) {
		super("result");
		operation = op;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public FObject getFObject() {
		return operation;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression(metacore.loader.MetaCoreUnit)
	 */
	public FCallExpression generateCallExpression(KermetaUnit builder) {
		FCallVariable call = builder.behav_factory.createFCallVariable();
		call.setFName("result");
		return call;
	}
	
	public String getDesciption() {
		return "operation result";
	}

}
