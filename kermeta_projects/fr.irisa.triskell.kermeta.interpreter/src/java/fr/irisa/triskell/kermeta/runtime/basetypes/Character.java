/* Implementation of Kermeta base type Character */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Character {

	// Implementation of method compareTo called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::compareTo(other)
	public static RuntimeObject compareTo(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getCharacterValue(self).compareTo(getCharacterValue(param0)));
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
		if(getCharacterValue(self).equals(getCharacterValue(param0))) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method isNotEqual called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::isNotEqual(element)
	public static RuntimeObject isNotEqual(RuntimeObject self, RuntimeObject param0) {
		if(getCharacterValue(self).equals(getCharacterValue(param0))) return self.getFactory().getMemory().falseINSTANCE;
		else return self.getFactory().getMemory().trueINSTANCE;
	}

	protected static void setValue(RuntimeObject ch, char value) {
		ch.getData().put("CharacterValue", new java.lang.Character(value));
	}
	
	protected static char getValue(RuntimeObject ch) {
		return getCharacterValue(ch).charValue();
	}
	
	protected static java.lang.Character getCharacterValue(RuntimeObject ch) {
		if (!ch.getData().containsKey("CharacterValue")) setValue(ch, ' ');
		return ((java.lang.Character)ch.getData().get("CharacterValue"));
	}

}
/* END OF FILE */
