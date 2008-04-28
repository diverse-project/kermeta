/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.LambdaParameter;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMSymbolLambdaParameter extends KMSymbol {

	protected LambdaParameter parameter;
	
	/**
	 * @param id
	 */
	public KMSymbolLambdaParameter(LambdaParameter p) {
		super(p.getName());
		parameter = p;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return parameter;
	}

	/**
	 * @return Returns the parameter.
	 */
	public LambdaParameter getParameter() {
		return parameter;
	}
	/**
	 * @param parameter The parameter to set.
	 */
	public void setParameter(LambdaParameter parameter) {
		this.parameter = parameter;
	}
	
	public String getDesciption() {
		return "lambda parameter " + identifier;
	}
	
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallVariable call = BehaviorFactory.eINSTANCE.createCallVariable();
		call.setName(parameter.getName());
		return call;
	}
}
