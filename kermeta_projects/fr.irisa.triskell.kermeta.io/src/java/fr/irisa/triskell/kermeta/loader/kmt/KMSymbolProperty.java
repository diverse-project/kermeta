/*
 * Created on 2 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import fr.irisa.triskell.kermeta.behavior.FCallExpression;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FProperty;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMSymbolProperty extends KMSymbol {

	public FProperty property;
	
	/**
	 * @param id
	 */
	public KMSymbolProperty(FProperty prop) {
		super(prop.getFName());
		property = prop;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public FObject getFObject() {
		return property;
	}
	/**
	 * @return Returns the property.
	 */
	public FProperty getProperty() {
		return property;
	}
	/**
	 * @param property The property to set.
	 */
	public void setProperty(FProperty property) {
		this.property = property;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public FCallExpression generateCallExpression(KermetaUnit builder) {
		FCallFeature call = builder.behav_factory.createFCallFeature();
		call.setFName(property.getFName());
		return call;
	}
}
