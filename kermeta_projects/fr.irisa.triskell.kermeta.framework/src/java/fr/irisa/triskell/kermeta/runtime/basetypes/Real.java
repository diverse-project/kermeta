/* Implementation of Kermeta base type Real */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Real {

	// Implementation of method plus called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::plus(other)
	public static RuntimeObject plus(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) + getValue(param0));
		return result;
	}

	// Implementation of method minus called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::minus(other)
	public static RuntimeObject minus(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) - getValue(param0));
		return result;
	}

	// Implementation of method times called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::times(other)
	public static RuntimeObject times(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) * getValue(param0));
		return result;
	}

	// Implementation of method div called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::div(other)
	public static RuntimeObject div(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		setValue(result, getValue(self) / getValue(param0));
		return result;
	}

	// Implementation of method toInteger called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::toInteger()
	public static RuntimeObject toInteger(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, (int)getValue(self));
		return result;
	}
	
	public static void setValue(RuntimeObject real, double value) {
		real.getData().put("Value", new Double(value));
	}
	
	public static double getValue(RuntimeObject real) {
		return ((Double)real.getData().get("Value")).doubleValue();
	}
	
	

}
/* END OF FILE */
