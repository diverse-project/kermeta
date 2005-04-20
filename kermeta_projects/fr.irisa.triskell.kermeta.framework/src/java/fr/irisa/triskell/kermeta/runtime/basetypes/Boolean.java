/* $Id: Boolean.java,v 1.7 2005-04-20 14:36:18 zdrey Exp $ 
 * Implementation of Kermeta base type Boolean 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;


public class Boolean {

	public static RuntimeObject TRUE=new RuntimeObject("TRUE INSTANCE");
	public static RuntimeObject FALSE=new RuntimeObject("FALSE INSTANCE");
	
	// Implementation of method and called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::and(other)
	public static RuntimeObject and(RuntimeObject self, RuntimeObject param0) {
	    
		if (getValue(self) && getValue(param0))
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
	    if (bool.equals(TRUE))
	        return true;
	    else return false;
//		return ((java.lang.Boolean)bool.getData().get("BooleanValue")).booleanValue();
	}
	
	public static void setValue(RuntimeObject bool, boolean value) {
	   bool.getData().put("BooleanValue", new java.lang.Boolean(value)); 
	}
	
	public static RuntimeObject create(boolean value) {
	    //RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Boolean");
	    if (value==true)
	        return TRUE;
	    else return FALSE;
	}
}
/* END OF FILE */
