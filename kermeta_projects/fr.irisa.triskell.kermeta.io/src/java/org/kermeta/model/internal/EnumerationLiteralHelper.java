

/*$Id: EnumerationLiteralHelper.java,v 1.2 2008-02-14 07:13:17 uid21732 Exp $
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


