/* Implementation of Kermeta base type Real */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

public class Real {

	/** Implementation of method compareTo called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::compareTo(other)*/
	public static RuntimeObject compareTo(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, ((java.lang.Double)self.getJavaNativeObject()).compareTo((java.lang.Double)param0.getJavaNativeObject()));
		return result;
	}
	
	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Real::equals(element) */
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self)==getValue(param0)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
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
		Integer.setValue(result, (int)getValue(self));
		return result;
	}
	
	public static RuntimeObject toString(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		String.setValue(result, "" + getValue(self));
		return result;
	}
	
	public static void setValue(RuntimeObject real, double value) {
		real.setPrimitiveType(RuntimeObject.NUMERIC_VALUE);
		real.setJavaNativeObject( new Double(value));
	}
	
	public static double getValue(RuntimeObject real) {
		if (!RuntimeObject.NUMERIC_VALUE.equals(real.getPrimitiveType()) )
			setValue(real, 0);
		return ((Double)real.getJavaNativeObject()).doubleValue();
	}
	
	public static RuntimeObject create(double value, RuntimeObjectFactory factory)
	{
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Real");
	    setValue(result, value);
	    return result;
	}

}
/* END OF FILE */
