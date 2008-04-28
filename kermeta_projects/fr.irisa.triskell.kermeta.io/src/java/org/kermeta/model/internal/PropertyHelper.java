

/*$Id: PropertyHelper.java,v 1.4 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	PropertyHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class PropertyHelper {
	
	static public Property create(String name) {
		Property p = StructureFactory.eINSTANCE.createProperty();
		p.setName( name );
		return p;
	}
	
	static public Property createDerived(String name, boolean isReadOnly, boolean isGetterAbstract, boolean isSetterAbstract) {
		Property p = create(name);
		p.setIsGetterAbstract(isGetterAbstract);
		p.setIsSetterAbstract(isSetterAbstract);
		p.setIsDerived(true);
		p.setIsReadOnly(isReadOnly);
		return p;
	}
	
}


