/* $Id: Boolean.java,v 1.1 2005-05-13 15:05:35 ffleurey Exp $ 
 * Implementation of Kermeta base type Boolean 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;


public class Boolean {

	
	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::equals(element)
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) == getValue(param0)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method isNotEqual called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::isNotEqual(element)
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) == getValue(param0)) return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().trueINSTANCE;
	}

	// Implementation of method and called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::and(other)
	public static RuntimeObject and(RuntimeObject self, RuntimeObject param0) {
	    
		if (getValue(self) && getValue(param0))
		    return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method or called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::or(other)
	public static RuntimeObject or(RuntimeObject self, RuntimeObject param0) {
	    
		if (getValue(self) || getValue(param0))
		    return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method not called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::not()
	public static RuntimeObject not(RuntimeObject self) {
		if (getValue(self)) return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().trueINSTANCE;
	}

	public static boolean getValue(RuntimeObject bool) {
		return ((java.lang.Boolean)bool.getData().get("BooleanValue")).booleanValue();
	}
	
	public static void setValue(RuntimeObject bool, boolean value) {
	   bool.getData().put("BooleanValue", new java.lang.Boolean(value)); 
	}
	
	public static boolean getValue(RuntimeObject bool, boolean value) {
	    return((java.lang.Boolean)bool.getData().get("BooleanValue")).booleanValue(); 
	}
	
	/* initialize TRUE and FALse singletons
	 * 
	 */
	public static RuntimeObject createTrue(RuntimeObjectFactory factory) {
	    return create(true, factory);
	}
	
	public static RuntimeObject createFalse(RuntimeObjectFactory factory) {
	    return create(false, factory);
	}
	
	private static RuntimeObject create(boolean value, RuntimeObjectFactory factory) {
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Boolean");
	    setValue(result, value);
	    return result;
	}
}
/* END OF FILE */
