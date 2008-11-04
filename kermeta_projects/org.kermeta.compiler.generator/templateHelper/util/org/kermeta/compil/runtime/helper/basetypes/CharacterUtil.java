package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Class;
import kermeta.standard.helper.CharacterWrapper;

import org.kermeta.compil.runtime.helper.language.ObjectUtil;

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
	
	public static Boolean isVoid(java.lang.Character self) {
		return self == null;
	}

	public static Class getMetaClass(Character self) {
		return org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("java.lang.Character");
	}

	
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
	public static java.lang.String toStringSwitcher(java.lang.Object self) {
		if (self == null) {
			return ObjectUtil.toString(self);
		} else {
			return CharacterWrapper.toString((java.lang.Character) self);
		}
	}
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
}
/* END OF FILE */
