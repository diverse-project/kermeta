/* Implementation of Kermeta base type Character */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Character {

	// Implementation of method compareTo called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Character::compareTo(other)
	public static KermetaObject compareTo(KermetaObject self, KermetaObject param0) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getCharacterValue(self).compareTo(getCharacterValue(param0)));
		return result;
	}
	
	
	protected static void setValue(KermetaObject ch, char value) {
		ch.getData().put("CharacterValue", new java.lang.Character(value));
	}
	
	protected static char getValue(KermetaObject ch) {
		return getCharacterValue(ch).charValue();
	}
	
	protected static java.lang.Character getCharacterValue(KermetaObject ch) {
		if (!ch.getData().containsKey("CharacterValue")) setValue(ch, ' ');
		return ((java.lang.Character)ch.getData().get("CharacterValue"));
	}

}
/* END OF FILE */
