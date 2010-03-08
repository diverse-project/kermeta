/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMSymbolVariable extends KMSymbol {

	protected VariableDecl variable;
	
	/**
	 * @param id
	 */
	public KMSymbolVariable(VariableDecl var) {
		super(var.getIdentifier());
		variable = var;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return variable;
	}

	/**
	 * @return Returns the variable.
	 */
	public VariableDecl getVariable() {
		return variable;
	}
	/**
	 * @param variable The variable to set.
	 */
	public void setVariable(VariableDecl variable) {
		this.variable = variable;
	}
	
	public String getDesciption() {
		return "local variable " + identifier;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol#generateCallExpression()
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallVariable call = BehaviorFactory.eINSTANCE.createCallVariable();
		call.setName(variable.getIdentifier());
		return call;
	}
	
}
