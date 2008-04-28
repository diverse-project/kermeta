

/*$Id: ObjectTypeVariableHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	ConstraintHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class ObjectTypeVariableHelper {

	static public ObjectTypeVariable create(String name) {
		assert( name != null );
		ObjectTypeVariable variable = StructureFactory.eINSTANCE.createObjectTypeVariable();
		variable.setName(name);
		return variable;
	}
		
}


