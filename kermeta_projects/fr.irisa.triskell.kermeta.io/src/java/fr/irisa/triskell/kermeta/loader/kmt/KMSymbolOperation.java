/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolOperation extends KMSymbol {

	public FOperation operation;
	
	/**
	 * @param id
	 */
	public KMSymbolOperation(FOperation op) {
		super(op.getFName());
		operation = op;
	}

	/* (non-Javadoc)
	 * @see metacore.builder.MCSymbol#getFObject()
	 */
	public FObject getFObject() {
		return operation;
	}

	/**
	 * @return Returns the operation.
	 */
	public FOperation getOperation() {
		return operation;
	}
	/**
	 * @param operation The operation to set.
	 */
	public void setOperation(FOperation operation) {
		this.operation = operation;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public FCallExpression generateCallExpression(KermetaUnit builder) {
		FCallFeature call = builder.behav_factory.createFCallFeature();
		call.setFName(operation.getFName());
		return call;
	}
	
}
