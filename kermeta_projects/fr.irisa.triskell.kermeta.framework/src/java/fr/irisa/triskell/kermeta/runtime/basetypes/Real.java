/* Implementation of Kermeta base type Real */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Real {

	// Implementation of method plus called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::plus(other)
	public static KermetaObject plus(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) + getValue(param0));
		return result;
	}

	// Implementation of method minus called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::minus(other)
	public static KermetaObject minus(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) - getValue(param0));
		return result;
	}

	// Implementation of method times called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::times(other)
	public static KermetaObject times(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) * getValue(param0));
		return result;
	}

	// Implementation of method div called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::div(other)
	public static KermetaObject div(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) / getValue(param0));
		return result;
	}

	// Implementation of method toInteger called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::toInteger()
	public static KermetaObject toInteger(KermetaObject self) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, (int)getValue(self));
		return result;
	}
	
	public static void setValue(KermetaObject real, double value) {
		real.getData().put("NumericValue", new Double(value));
	}
	
	public static double getValue(KermetaObject real) {
		return Numeric.getNumericValue(real).doubleValue();
	}
	
	

}
/* END OF FILE */
