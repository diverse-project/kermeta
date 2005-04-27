/* $Id: Boolean.java,v 1.8 2005-04-27 08:38:12 jpthibau Exp $ 
 * Implementation of Kermeta base type Boolean 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;


public class Boolean {

	public static RuntimeObject TRUE=null;
	public static RuntimeObject FALSE=null;
	
	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::equals(element)
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) == getValue(param0)) return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	// Implementation of method isNotEqual called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::isNotEqual(element)
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self) == getValue(param0)) return Boolean.FALSE;
		else return Boolean.TRUE;
	}

	// Implementation of method and called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::and(other)
	public static RuntimeObject and(RuntimeObject self, RuntimeObject param0) {
	    
		if (getValue(self) && getValue(param0))
		    return TRUE;
		else return FALSE;
	}

	// Implementation of method or called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::or(other)
	public static RuntimeObject or(RuntimeObject self, RuntimeObject param0) {
	    
		if (getValue(self) || getValue(param0))
		    return TRUE;
		else return FALSE;
	}

	// Implementation of method not called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::not()
	public static RuntimeObject not(RuntimeObject self) {
		if (getValue(self)) return FALSE;
		else return TRUE;
	}

	public static boolean getValue(RuntimeObject bool) {
		return ((java.lang.Boolean)bool.getData().get("BooleanValue")).booleanValue();
	}
	
	public static void setValue(RuntimeObject bool, boolean value) {
	   bool.getData().put("BooleanValue", new java.lang.Boolean(value)); 
	}
	
	/* initialize TRUE and FALse singletons
	 * 
	 */
	public static void initInstances(RuntimeObjectFactory factory) {
		TRUE = factory.createObjectFromClassName("kermeta::standard::Boolean");
	    setValue(TRUE, true);
		FALSE = factory.createObjectFromClassName("kermeta::standard::Boolean");
	    setValue(FALSE, false);
	}
	
	public static RuntimeObject create(boolean value, RuntimeObjectFactory factory) {
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Boolean");
	    setValue(result, value);
	    return result;
	}
}
/* END OF FILE */
