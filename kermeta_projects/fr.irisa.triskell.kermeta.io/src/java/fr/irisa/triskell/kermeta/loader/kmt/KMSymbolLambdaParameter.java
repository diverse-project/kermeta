/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FLambdaParameter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolLambdaParameter extends KMSymbol {

	protected FLambdaParameter parameter;
	
	/**
	 * @param id
	 */
	public KMSymbolLambdaParameter(FLambdaParameter p) {
		super(p.getFName());
		parameter = p;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public FObject getFObject() {
		return parameter;
	}

	/**
	 * @return Returns the parameter.
	 */
	public FLambdaParameter getParameter() {
		return parameter;
	}
	/**
	 * @param parameter The parameter to set.
	 */
	public void setParameter(FLambdaParameter parameter) {
		this.parameter = parameter;
	}
	
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public FCallExpression generateCallExpression(KermetaUnit builder) {
		FCallVariable call = builder.behav_factory.createFCallVariable();
		call.setFName(parameter.getFName());
		return call;
	}
}
