package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Class;

public class CharacterUtil {

	/** Java version */
	public static java.lang.Integer compareTo(java.lang.Character self, java.lang.Character param0) {
		return self.compareTo(param0);
	}
	
	/** Java version */
	public static java.lang.String toString(java.lang.Character self) {
		return self.toString();
	}
	
	/** Java version */
	public static java.lang.Boolean equals(java.lang.Character self, java.lang.Character param0) {
		return self.equals(param0);
	}

	/** Java version */
	public static java.lang.Boolean isNotEqual(java.lang.Character self, java.lang.Character param0) {
		return !equals(self, param0);
	}

	public static Class getMetaClass(Character self) {
		return org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("java.lang.Character");
	}

}
/* END OF FILE */
