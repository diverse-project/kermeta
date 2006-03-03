/* Implementation of Kermeta base type Class */

package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeEqualityChecker;

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
		fr.irisa.triskell.kermeta.language.structure.Class req = (fr.irisa.triskell.kermeta.language.structure.Class)self.getData().get("kcoreObject");
		fr.irisa.triskell.kermeta.language.structure.Class pro = (fr.irisa.triskell.kermeta.language.structure.Class)object.getMetaclass().getData().get("kcoreObject");
		
		SimpleType required = new SimpleType(req);
		SimpleType provided = new SimpleType(pro);
		
		if (provided.isSubTypeOf(required)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	public static RuntimeObject isSubType(RuntimeObject self, RuntimeObject object) {
		fr.irisa.triskell.kermeta.language.structure.Class req = (fr.irisa.triskell.kermeta.language.structure.Class)self.getData().get("kcoreObject");
		Type pro = (Type)object.getData().get("kcoreObject");
		
		SimpleType required = new SimpleType(req);
		SimpleType provided = new SimpleType(pro);
		
		if (provided.isSubTypeOf(required)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject other) {
		fr.irisa.triskell.kermeta.language.structure.Class req = (fr.irisa.triskell.kermeta.language.structure.Class)self.getData().get("kcoreObject");
		fr.irisa.triskell.kermeta.language.structure.Class pro = (fr.irisa.triskell.kermeta.language.structure.Class)other.getData().get("kcoreObject");
		
		if (pro == null) return self.getFactory().getMemory().falseINSTANCE;
		
		if (TypeEqualityChecker.equals(req, pro)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}


}
/* END OF FILE */
