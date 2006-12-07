/* $Id: Model.java,v 1.2 2006-12-07 09:38:38 dvojtise Exp $
 * Project : Kermeta interpreter
 * File : ModelType.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 14, 2006
 * Authors : 
 * 		Jim Steel
 */
package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Model {
	/** Implementation of method add called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::Model.add(element)
	*/
	public static RuntimeObject add(RuntimeObject self, RuntimeObject element) {
		// There probably needs to be some sort of check here that the object being added
		// is an acceptable type for the model type.
		RuntimeObject contents_collection = self.getProperties().get("contents");
		ReflectiveCollection.add(contents_collection, element);
		return self.getFactory().getMemory().voidINSTANCE;
	}
}
