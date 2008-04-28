

/*$Id: EnumerationLiteralHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	EnumerationHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class EnumerationLiteralHelper {

	static public EnumerationLiteral create(String name) {
		assert( name != null );
		EnumerationLiteral enumerationLiteral = StructureFactory.eINSTANCE.createEnumerationLiteral();
		enumerationLiteral.setName(name);
		return enumerationLiteral;
	}

}


