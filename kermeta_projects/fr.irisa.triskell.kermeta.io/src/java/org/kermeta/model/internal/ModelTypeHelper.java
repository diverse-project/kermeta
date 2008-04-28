

/*$Id: ModelTypeHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	PackageHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 nov. 07
* Authors : paco
*/

package org.kermeta.model.internal;


import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;

public class ModelTypeHelper extends NamedElementHelper {

	static public ModelType create(String name) {
		ModelType modelType = StructureFactory.eINSTANCE.createModelType();
		modelType.setName( name );
		return modelType;
	}
	
}


