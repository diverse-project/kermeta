/* Implementation of Kermeta base type Object */

package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public class Object {

	// Implementation of method getMetaClass called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.getMetaClass()
	public static KermetaObject getMetaClass(KermetaObject self) {
		return self.getMetaclass();
	}

	// Implementation of method container called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.container()
	public static KermetaObject container(KermetaObject self) {
		return self.getContainer();
	}

	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.equals(element)
	public static KermetaObject equals(KermetaObject self, KermetaObject param0) {
		if(self == param0) return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.get(~property)
	public static KermetaObject get(KermetaObject self, KermetaObject param0) {
		// TODO : implement that
		return null;
	}

	// Implementation of method set called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.~set(~property, element)
	public static KermetaObject set(KermetaObject self, KermetaObject param0, KermetaObject param1) {
		// TODO : implement that
		return null;
	}

	// Implementation of method isSet called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.isSet(~property)
	public static KermetaObject isSet(KermetaObject self, KermetaObject param0) {
		// TODO : implement that
		return null;
	}

	// Implementation of method unSet called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Object.unSet(~property)
	public static KermetaObject unSet(KermetaObject self, KermetaObject param0) {
		// TODO : implement that
		return null;
	}


}
/* END OF FILE */
