/* Implementation of Kermeta base type Boolean */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Boolean {
	
	public static KermetaObject TRUE;
	public static KermetaObject FALSE;

	// Implementation of method and called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::and(other)
	public static KermetaObject and(KermetaObject self, KermetaObject param0) {
		if (getValue(self) && getValue(param0)) return TRUE;
		else return FALSE;
	}

	// Implementation of method not called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::not()
	public static KermetaObject not(KermetaObject self) {
		if (getValue(self)) return FALSE;
		else return TRUE;
	}

	protected static boolean getValue(KermetaObject bool) {
		return ((java.lang.Boolean)bool.getData().get("BooleanValue")).booleanValue();
	}

}
/* END OF FILE */
