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
import fr.irisa.triskell.kermeta.language.structure.Property;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KMSymbolProperty extends KMSymbol {

	public Property property;
	
	/**
	 * @param id
	 */
	public KMSymbolProperty(Property prop) {
		super(prop.getName());
		property = prop;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#getFObject()
	 */
	public fr.irisa.triskell.kermeta.language.structure.Object getFObject() {
		return property;
	}
	/**
	 * @return Returns the property.
	 */
	public Property getProperty() {
		return property;
	}
	/**
	 * @param property The property to set.
	 */
	public void setProperty(Property property) {
		this.property = property;
	}
	
	public String getDesciption() {
		return "property " + identifier;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.loader.kmt.KMSymbol#generateCallExpression()
	 */
	public CallExpression generateCallExpression(KermetaUnit builder) {
		CallFeature call = BehaviorFactory.eINSTANCE.createCallFeature();
		call.setName(property.getName());
		return call;
	}
}
