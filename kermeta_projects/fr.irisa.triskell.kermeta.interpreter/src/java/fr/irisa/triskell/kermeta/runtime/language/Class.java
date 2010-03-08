/* $Id: Class.java,v 1.13 2007-11-13 14:28:11 dvojtise Exp $
* Project : Kermeta interpreter
* File : Class.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 11 nov. 2007
* Authors : Franck Fleurey, Didier Vojtisek 
*/


package fr.irisa.triskell.kermeta.runtime.language;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

/**
 * Implementation of the extern of the class Class in Kermeta framework
 * it does the mapping with fr.irisa.triskell.kermeta.language.structure.Class and its kermeta version
 */
public class Class {

	// Implementation of method newObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Class.newObject()
	public static RuntimeObject newObject(RuntimeObject self) {
		return self.getFactory().createRuntimeObjectFromClass(self);
	}
	
	// Implementation of method cloneObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Class.cloneObject()
	public static RuntimeObject cloneObject(RuntimeObject self, RuntimeObject objectToClone){
		return self.getFactory().cloneRuntimeObjectFromObject(self, objectToClone);
	}
	
	//	 Implementation of method cloneObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Class.cloneObject()
	public static RuntimeObject deepCloneObject(RuntimeObject self, RuntimeObject objectToClone){
		self.getFactory().cloneObjectTable.clear();
		return self.getFactory().deepCloneRuntimeObjectFromObject(self, objectToClone);
	}
	
	public static RuntimeObject isInstance(RuntimeObject self, RuntimeObject object) {
		fr.irisa.triskell.kermeta.language.structure.Class req = (fr.irisa.triskell.kermeta.language.structure.Class)self.getKCoreObject();
		fr.irisa.triskell.kermeta.language.structure.Class pro = (fr.irisa.triskell.kermeta.language.structure.Class)object.getMetaclass().getKCoreObject();
		
		SimpleType required = new SimpleType(req, self.getFactory().getMemory().getTypeCheckerContext());
		SimpleType provided = new SimpleType(pro, self.getFactory().getMemory().getTypeCheckerContext());
		
		if (provided.isSubTypeOf(required)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject other) {
		
		// If the objects are equals in java memory, then we don't need to make complex equality tests.
		// Especially, if the runtime object tested is an instance of the metaclass Class, as an instance, 
		// TypeEqualityChecker is not able to test it, since it is based on the underlying model representation
		// (RuntimeObject.getData().get("kcoreObject"), which refers to a model element).
		// Though, an instance (M1 level :)) has no model element associatied to it.

		if (self == other) return self.getFactory().getMemory().trueINSTANCE;
		
		fr.irisa.triskell.kermeta.language.structure.Class req = (fr.irisa.triskell.kermeta.language.structure.Class)self.getKCoreObject();
		
		fr.irisa.triskell.kermeta.language.structure.Object obj = (fr.irisa.triskell.kermeta.language.structure.Object)other.getKCoreObject();
		fr.irisa.triskell.kermeta.language.structure.Class pro = null;
		if(obj instanceof fr.irisa.triskell.kermeta.language.structure.Class)
			pro = (fr.irisa.triskell.kermeta.language.structure.Class) obj;
		else
			return self.getFactory().getMemory().falseINSTANCE;
		
		
		if (pro == null || req == null) return self.getFactory().getMemory().falseINSTANCE;
		
		if (TypeEqualityChecker.equals(req, pro)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}


}
/* END OF FILE */
