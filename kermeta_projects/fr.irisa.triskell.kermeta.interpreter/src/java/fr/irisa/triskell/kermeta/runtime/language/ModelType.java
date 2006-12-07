/* $Id: ModelType.java,v 1.2 2006-12-07 09:38:38 dvojtise Exp $
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

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/** Implementation in java of the extern methods of ModelType that can be called from Kermeta */
public class ModelType {
	// Implementation of method newObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ModelType.newObject()
	public static RuntimeObject newObject(RuntimeObject self) {
		return self.getFactory().createRuntimeObjectFromModelType(self);
	}
	
	// Implementation of method newObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::ModelType.isModelTypeOf()
	public static RuntimeObject isModelTypeOf(RuntimeObject modelType, RuntimeObject model) {
		fr.irisa.triskell.kermeta.language.structure.ModelType required =
			(fr.irisa.triskell.kermeta.language.structure.ModelType) modelType.getData().get("kcoreObject");
		fr.irisa.triskell.kermeta.language.structure.ModelType provided =
			(fr.irisa.triskell.kermeta.language.structure.ModelType) ((RuntimeObject) model.getData().get("modelType")).getData().get("kcoreObject");
		
		if (TypeEqualityChecker.equals(required, provided)) {
			return model.getFactory().getMemory().trueINSTANCE;
		} else {
			return model.getFactory().getMemory().falseINSTANCE;
		}
		
	}
	
}
