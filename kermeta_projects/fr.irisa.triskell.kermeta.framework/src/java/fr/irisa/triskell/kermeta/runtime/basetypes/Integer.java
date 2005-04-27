/* $Id: Integer.java,v 1.8 2005-04-27 13:35:33 jpthibau Exp $ 
 * Implementation of Kermeta base type Integer 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

/**
 * Implementation of Integer methods for kermeta 
 * @author Franck Fleurey
 * @author Zoé Drey
 */
public class Integer {
    
	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::equals(element)
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self)==getValue(param0)) return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	// Implementation of method isNotEqual called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::isNotEqual(element)
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) == getValue(param0)) return Boolean.FALSE;
		else return Boolean.TRUE;
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

	/** Implementation of method toReal called as :
	 * extern fr::irisa::triskell::kermeta::runtime::basetypes::Integer::toReal()
	 */
	public static RuntimeObject toReal(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Real");
		Real.setValue(result, getValue(self));
		return result;
	}
	
	public static void setValue(RuntimeObject integer, int value) {
		integer.getData().put("NumericValue", new java.lang.Integer(value));
	}
	
	public static int getValue(RuntimeObject integer) {
		return ((java.lang.Integer)integer.getData().get("NumericValue")).intValue();
	}

	public static RuntimeObject create(int value, RuntimeObjectFactory factory)
	{
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Integer");
	    setValue(result, value);
	    return result;
	}

}
/* END OF FILE */
