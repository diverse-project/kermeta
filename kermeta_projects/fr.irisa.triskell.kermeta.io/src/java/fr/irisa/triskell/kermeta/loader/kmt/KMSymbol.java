/*
 * Created on 2 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public abstract class KMSymbol {

	protected String identifier;
	
	public KMSymbol(String id) {
		identifier = id;
	}

	/**
	 * @return Returns the identifier.
	 */
	public String getIdentifier() {
		return identifier;
	}
	
	public abstract fr.irisa.triskell.kermeta.language.structure.Object getFObject();
	
	public abstract CallExpression generateCallExpression(KermetaUnit builder);
	
	public abstract String getDesciption();
}
