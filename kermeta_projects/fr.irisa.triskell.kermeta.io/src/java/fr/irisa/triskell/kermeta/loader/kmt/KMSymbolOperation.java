/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMSymbolOperation extends KMSymbol {

	public Operation operation;
	
	/**
	 * @param id
	 */
	public KMSymbolOperation(Operation op) {
		super(op.getName());
		operation = op;
	}

	/* (non-Javadoc)
	 * @see metacore.builder.MCSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return operation;
	}

	/**
	 * @return Returns the operation.
	 */
	public Operation getOperation() {
		return operation;
	}
	/**
	 * @param operation The operation to set.
	 */
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public String getDesciption() {
		return "operation " + identifier;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
		call.setName(operation.getName());
		return call;
	}
	
}
