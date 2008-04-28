

/*$Id: EnumerationHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	EnumerationHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class EnumerationHelper {

	static public Enumeration create(String name) {
		assert( name != null );
		Enumeration enumeration = StructureFactory.eINSTANCE.createEnumeration();
		enumeration.setName(name);
		return enumeration;
	}
	
	static public EnumerationLiteral getLiteral(Enumeration enumeration, String name) {
		assert( name != null );
		for ( EnumerationLiteral literal : enumeration.getOwnedLiteral() )
			if ( literal.getName().equals(name) )
				return literal;
		return null;
	}

}


