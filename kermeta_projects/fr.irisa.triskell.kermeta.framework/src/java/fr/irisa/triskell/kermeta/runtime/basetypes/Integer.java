/* Implementation of Kermeta base type Integer */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Integer {

	// Implementation of method plus called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::plus(other)
	public static KermetaObject plus(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) + getValue(param0));
		return result;
	}

	// Implementation of method minus called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::minus(other)
	public static KermetaObject minus(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) - getValue(param0));
		return result;
	}

	// Implementation of method times called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::times(other)
	public static KermetaObject times(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) * getValue(param0));
		return result;
	}

	// Implementation of method div called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::div(other)
	public static KermetaObject div(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) / getValue(param0));
		return result;
	}

	// Implementation of method mod called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::mod(other)
	public static KermetaObject mod(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) % getValue(param0));
		return result;
	}

	// Implementation of method toReal called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::toReal()
	public static KermetaObject toReal(KermetaObject self) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		Real.setValue(result, getValue(self));
		return result;
	}
	
	public static void setValue(KermetaObject integer, int value) {
		integer.getData().put("NumericValue", new java.lang.Integer(value));
	}
	
	public static int getValue(KermetaObject integer) {
		return Numeric.getNumericValue(integer).intValue();
	}


}
/* END OF FILE */
