/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallVariable;
import fr.irisa.triskell.kermeta.behavior.FRescue;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FParameter;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolRescueParameter extends KMSymbol {

	protected FRescue rescue;
	
	/**
	 * @param id
	 */
	public KMSymbolRescueParameter(FRescue rescue) {
		super(rescue.getFExceptionName());
		this.rescue = rescue;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public FObject getFObject() {
		return rescue;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public FCallExpression generateCallExpression(KermetaUnit builder) {
		FCallVariable call = builder.behav_factory.createFCallVariable();
		call.setFName(rescue.getFExceptionName());
		return call;
	}
	public FRescue getRescue() {
		return rescue;
	}
	public void setRescue(FRescue rescue) {
		this.rescue = rescue;
	}
	
	public String getDesciption() {
		return "rescue block parameter " + identifier;
	}
}
