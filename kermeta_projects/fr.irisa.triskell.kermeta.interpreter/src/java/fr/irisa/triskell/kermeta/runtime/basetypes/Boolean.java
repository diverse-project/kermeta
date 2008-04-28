/* $Id: Boolean.java,v 1.11 2008-04-28 11:50:56 ftanguy Exp $ 
 * Implementation of Kermeta base type Boolean 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;


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
	    if ( param0 == self.getFactory().getMemory().voidINSTANCE )
	    	return self.getFactory().getMemory().voidINSTANCE;
		if (getValue(self) && getValue(param0))
		    return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method or called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Boolean::or(other)
	public static RuntimeObject or(RuntimeObject self, RuntimeObject param0) {
	    if ( param0 == self.getFactory().getMemory().voidINSTANCE )
	    	return self.getFactory().getMemory().voidINSTANCE;
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
	    return ((java.lang.Boolean)bool.getJavaNativeObject()).booleanValue();
	}
	
	public static void setValue(RuntimeObject bool, boolean value) {
		bool.setPrimitiveType(RuntimeObject.BOOLEAN_VALUE);
		
		bool.setJavaNativeObject( new java.lang.Boolean(value)); 
	}

	/* initialize TRUE and FALse singletons
	 * 
	 */
	public static void createTrue(RuntimeObjectFactory factory, RuntimeObject result) {
	    
		fr.irisa.triskell.kermeta.language.structure.Class bool_class = StructureFactory.eINSTANCE.createClass();
	    bool_class.setTypeDefinition((ClassDefinition)factory.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Boolean"));
	    
	    result.setMetaclass(factory.createMetaClass(bool_class));
	    setValue(result, true);
	}
	
	public static void createFalse(RuntimeObjectFactory factory, RuntimeObject result) {
	    
		fr.irisa.triskell.kermeta.language.structure.Class bool_class = StructureFactory.eINSTANCE.createClass();
	    bool_class.setTypeDefinition((ClassDefinition)factory.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Boolean"));
	    
	    result.setMetaclass(factory.createMetaClass(bool_class));
	    setValue(result, false);
	}
	
	/*
	private static RuntimeObject create(boolean value, RuntimeObjectFactory factory) {
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Boolean");
	    setValue(result, value);
	    return result;
	}
	*/
}
/* END OF FILE */
