/* $Id : $
 * Implementation of Kermeta base type String 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

public class String {
    
	// Implementation of method compareTo called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::compareTo(other)
	public static RuntimeObject compareTo(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getValue(self).compareTo(getValue(param0)));
		return result;
	}

	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::equals(element)
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self).equals(getValue(param0))) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method isNotEqual called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::isNotEqual(element)
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		if(getValue(self).equals(getValue(param0))) return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().trueINSTANCE;
	}

	// Implementation of method plus called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::plus(other)
	public static RuntimeObject plus(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		setValue(result, getValue(self) + getValue(param0));
		return result;
	}

	// Implementation of method append called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::append(other)
	public static RuntimeObject append(RuntimeObject self, RuntimeObject param0) {
		setValue(self, getValue(self) + getValue(param0));
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method elementAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::elementAt(index)
	public static RuntimeObject elementAt(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Character");
		Character.setValue(result, getValue(self).charAt(Integer.getValue(param0)));
		return result;
	}

	// Implementation of method indexOf called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::indexOf(str)
	public static RuntimeObject indexOf(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getValue(self).indexOf(getValue(param0)));
		return result;
	}

	// Implementation of method subString called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::subString(index, length)
	public static RuntimeObject substring(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		setValue(result, getValue(self).substring(Integer.getValue(param0), Integer.getValue(param1)));
		return result;
	}

	// Implementation of method size called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::String::size()
	public static RuntimeObject size(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getValue(self).length());
		return result;
	}

	public static void setValue(RuntimeObject str, java.lang.String value) {
		str.getData().put("StringValue", value);
	}
	
	public static java.lang.String getValue(RuntimeObject str) {
		if (!str.getData().containsKey("StringValue")) setValue(str, "");
		return (java.lang.String)str.getData().get("StringValue");
	}
	
	
	public static int nb_str = 0;
	
	public static RuntimeObject create(java.lang.String value, RuntimeObjectFactory factory) {
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::String");
	    setValue(result, value);
	    return result;
	}
	
}
/* END OF FILE */
