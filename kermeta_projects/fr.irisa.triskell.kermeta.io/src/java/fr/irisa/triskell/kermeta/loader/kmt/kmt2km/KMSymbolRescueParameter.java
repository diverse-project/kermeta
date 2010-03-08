/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.language.behavior.Rescue;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
//import fr.irisa.triskell.kermeta.language.structure.FParameter;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMSymbolRescueParameter extends KMSymbol {

	protected Rescue rescue;
	
	/**
	 * @param id
	 */
	public KMSymbolRescueParameter(Rescue rescue) {
		super(rescue.getExceptionName());
		this.rescue = rescue;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return rescue;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol#generateCallExpression()
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallVariable call = BehaviorFactory.eINSTANCE.createCallVariable();
		call.setName(rescue.getExceptionName());
		return call;
	}
	public Rescue getRescue() {
		return rescue;
	}
	public void setRescue(Rescue rescue) {
		this.rescue = rescue;
	}
	
	public String getDesciption() {
		return "rescue block parameter " + identifier;
	}
}
