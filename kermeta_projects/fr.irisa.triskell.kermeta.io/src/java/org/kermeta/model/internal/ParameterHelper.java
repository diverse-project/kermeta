

/*$Id: ParameterHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	EnumerationHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class ParameterHelper {

	static public Parameter create(String name) {
		assert( name != null );
		Parameter parameter = StructureFactory.eINSTANCE.createParameter();
		parameter.setName(name);
		return parameter;
	}

}


