/* Implementation of Kermeta base type Boolean */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Boolean {
	
	// Implementation of method and called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::and(other)
	public static KermetaObject and(KermetaObject self, KermetaObject param0) {
		if (getValue(self) && getValue(param0)) return TRUE.INSTANCE;
		else return FALSE.INSTANCE;
	}

	// Implementation of method not called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::not()
	public static KermetaObject not(KermetaObject self) {
		if (getValue(self)) return FALSE.INSTANCE;
		else return TRUE.INSTANCE;
	}

	protected static boolean getValue(KermetaObject bool) {
		return ((java.lang.Boolean)bool.getData().get("BooleanValue")).booleanValue();
	}

}
/* END OF FILE */
