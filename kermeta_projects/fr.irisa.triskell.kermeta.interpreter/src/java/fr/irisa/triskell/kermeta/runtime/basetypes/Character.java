/* Implementation of Kermeta base type Character */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

public class Character {

	// Implementation of method compareTo called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::compareTo(other)
	public static RuntimeObject compareTo(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		// if param0 is effectively a Character, then makes the test
		if(RuntimeObject.CHARACTER_VALUE.equals(param0.getPrimitiveType())) {
			Integer.setValue(result, getCharacterValue(self).compareTo(getCharacterValue(param0)));
		}
		// if not, set the result to 0
		else {
			Integer.setValue(result, 0);
		}
		return result;
	}
	
	public static RuntimeObject toString(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::String");
		String.setValue(result, getCharacterValue(self).toString());
		return result;
	}
	
	
	// Implementation of method equals called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::equals(element)
	public static RuntimeObject equals(RuntimeObject self, RuntimeObject param0) {
		boolean result;
		// if param0 is effectively a Character, then makes the test
		if(RuntimeObject.CHARACTER_VALUE.equals(param0.getPrimitiveType())) {
			result = getCharacterValue(self).equals(getCharacterValue(param0));
		}
		// if not, set the result to false
		else {
			result = false;
		}
		return self.getFactory().getMemory().getRuntimeObjectForBoolean(result);
	}

	// Implementation of method isNotEqual called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::isNotEqual(element)
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		boolean result;
		// if param0 is effectively a Character, then makes the test
		if(RuntimeObject.CHARACTER_VALUE.equals(param0.getPrimitiveType())) {
			result = !getCharacterValue(self).equals(getCharacterValue(param0));
		}
		// if not, set the result to true
		else {
			result = true;
		}
		return self.getFactory().getMemory().getRuntimeObjectForBoolean(result);
	}

	public static void setValue(RuntimeObject ch, char value) {
		ch.setPrimitiveType(RuntimeObject.CHARACTER_VALUE);
		ch.setJavaNativeObject(new java.lang.Character(value));
	}
	
	public static char getValue(RuntimeObject ch) {
		return getCharacterValue(ch).charValue();
	}
	
	public static java.lang.Character getCharacterValue(RuntimeObject ch) {
		if (!RuntimeObject.CHARACTER_VALUE.equals(ch.getPrimitiveType())) 
			setValue(ch, ' ');
		return ((java.lang.Character)ch.getJavaNativeObject());
	}

	public static RuntimeObject create(char value, RuntimeObjectFactory factory)
	{
	    RuntimeObject result = factory.createObjectFromClassName("kermeta::standard::Character");
	    setValue(result, value);
	    return result;
	}
}
/* END OF FILE */
