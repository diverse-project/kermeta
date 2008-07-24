/* $Id: Integer.java,v 1.14 2008-07-24 14:19:19 cfaucher Exp $ 
 * Implementation of Kermeta base type Integer 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;


import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

/**
 * Implementation of Integer methods for kermeta 
 * @author Franck Fleurey
 */
public class Integer {
    
	/** Implementation of method compareTo called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::compareTo(other)*/
	public static RuntimeObject compareTo(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, ((java.lang.Integer)self.getJavaNativeObject()).compareTo((java.lang.Integer)param0.getJavaNativeObject()));
		return result;
	}

	/** Implementation of method equals called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::equals(element) */
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self)==getValue(param0)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	/** Implementation of method plus called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::plus(other)
	 */
	public static RuntimeObject plus(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) + getValue(param0));
		return result;
	}

	/** Implementation of method minus called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::minus(other)
	 */
	public static RuntimeObject minus(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) - getValue(param0));
		return result;
	}

	/** Implementation of method times called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::times(other)
	 */
	public static RuntimeObject times(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) * getValue(param0));
		return result;
	}

	/** Implementation of method div called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::div(other)
	 */
	public static RuntimeObject div(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) / getValue(param0));
		return result;
	}

	/** Implementation of method mod called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::mod(other)
	 */
	public static RuntimeObject mod(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		setValue(result, getValue(self) % getValue(param0));
		return result;
	}
	
	/** Implementation of method mod called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::mod(other)
	 */
	public static RuntimeObject isGreater(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) > getValue(param0)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	/** Implementation of method mod called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::mod(other)
	 */
	public static RuntimeObject isLower(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) < getValue(param0)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	/** Implementation of method mod called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::mod(other)
	 */
	public static RuntimeObject isGreaterOrEqual(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) >= getValue(param0)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
	
	/** Implementation of method mod called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::mod(other)
	 */
	public static RuntimeObject isLowerOrEqual(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) <= getValue(param0)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	/** Implementation of method toReal called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::toReal()
	 */
	public static RuntimeObject toReal(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		Real.setValue(result, getValue(self));
		return result;
	}
	
	public static RuntimeObject toString(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		String.setValue(result, "" + getValue(self));
		return result;
	}
	
	public static void setValue(RuntimeObject integer, int value) {
		integer.setPrimitiveType(RuntimeObject.NUMERIC_VALUE);
		integer.setJavaNativeObject( new java.lang.Integer(value));
	}
	
	public static int getValue(RuntimeObject integer) {
		if (!RuntimeObject.NUMERIC_VALUE.equals(integer.getPrimitiveType()))
			setValue(integer, 0);
	    return ((java.lang.Integer)integer.getJavaNativeObject()).intValue();
	}
	

	public static RuntimeObject create(int value, RuntimeObjectFactory factory)
	{
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Integer");
	    setValue(result, value);
	    return result;
	}

}
/* END OF FILE */
