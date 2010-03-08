/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Parameter;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMSymbolParameter extends KMSymbol {

	protected Parameter parameter;
	
	/**
	 * @param id
	 */
	public KMSymbolParameter(Parameter param) {
		super(param.getName());
		parameter = param;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return parameter;
	}

	/**
	 * @return Returns the parameter.
	 */
	public Parameter getParameter() {
		return parameter;
	}
	/**
	 * @param parameter The parameter to set.
	 */
	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}
	
	public String getDesciption() {
		return "operation paprameter " + identifier;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol#generateCallExpression()
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallVariable call = BehaviorFactory.eINSTANCE.createCallVariable();
		call.setName(parameter.getName());
		return call;
	}
}
