/* $Id: Boolean.java,v 1.2 2005-05-20 12:54:41 ffleurey Exp $ 
 * Implementation of Kermeta base type Boolean 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;


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
	public static void createTrue(RuntimeObjectFactory factory, RuntimeObject result) {
	    
	    FClass bool_class = factory.getMemory().getUnit().struct_factory.createFClass();
	    bool_class.setFClassDefinition((FClassDefinition)factory.getMemory().getUnit().typeDefinitionLookup("kermeta::standard::Boolean"));
	    
	    result.setMetaclass(factory.createMetaClass(bool_class));
	    setValue(result, true);
	}
	
	public static void createFalse(RuntimeObjectFactory factory, RuntimeObject result) {
	    
	    FClass bool_class = factory.getMemory().getUnit().struct_factory.createFClass();
	    bool_class.setFClassDefinition((FClassDefinition)factory.getMemory().getUnit().typeDefinitionLookup("kermeta::standard::Boolean"));
	    
	    result.setMetaclass(factory.createMetaClass(bool_class));
	    setValue(result, false);
	}
	
	private static RuntimeObject create(boolean value, RuntimeObjectFactory factory) {
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Boolean");
	    setValue(result, value);
	    return result;
	}
}
/* END OF FILE */
