/* Implementation of Kermeta base type Boolean */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Boolean {
	
	// Implementation of method and called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::and(other)
	public static RuntimeObject and(RuntimeObject self, RuntimeObject param0) {
		if (getValue(self) && getValue(param0)) return TRUE.INSTANCE;
		else return FALSE.INSTANCE;
	}

	// Implementation of method not called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::not()
	public static RuntimeObject not(RuntimeObject self) {
		if (getValue(self)) return FALSE.INSTANCE;
		else return TRUE.INSTANCE;
	}

	protected static boolean getValue(RuntimeObject bool) {
		return ((java.lang.Boolean)bool.getData().get("BooleanValue")).booleanValue();
	}

}
/* END OF FILE */
