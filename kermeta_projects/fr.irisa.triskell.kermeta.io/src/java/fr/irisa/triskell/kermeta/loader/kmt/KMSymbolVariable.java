/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolVariable extends KMSymbol {

	protected FVariableDecl variable;
	
	/**
	 * @param id
	 */
	public KMSymbolVariable(FVariableDecl var) {
		super(var.getFIdentifier());
		variable = var;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public FObject getFObject() {
		return variable;
	}

	/**
	 * @return Returns the variable.
	 */
	public FVariableDecl getVariable() {
		return variable;
	}
	/**
	 * @param variable The variable to set.
	 */
	public void setVariable(FVariableDecl variable) {
		this.variable = variable;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public FCallExpression generateCallExpression(KermetaUnit builder) {
		FCallVariable call = builder.behav_factory.createFCallVariable();
		call.setFName(variable.getFIdentifier());
		return call;
	}
	
}
