package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Class;

public class BooleanUtil {
	
	/** Java version */
	public static java.lang.Boolean equals(java.lang.Boolean self, java.lang.Boolean param0) {
		return self.booleanValue() == param0.booleanValue();
	}
	
	/** Java version */
	public static java.lang.Boolean isNotEqual(java.lang.Boolean self, java.lang.Boolean param0) {
		return self.booleanValue() != param0.booleanValue();
	}
	
	/** Java version */
	public static java.lang.Boolean and(java.lang.Boolean self, java.lang.Boolean param0) {
	    return self.booleanValue() && param0.booleanValue();
	}
	
	/** Java version */
	public static java.lang.Boolean or(java.lang.Boolean self, java.lang.Boolean param0) {
		return self.booleanValue() || param0.booleanValue();
	}
	
	/** Java version */
	public static java.lang.Boolean not(java.lang.Boolean self) {
		return !self;
	}
	public static Boolean isVoid(Boolean result) {
		return result == null;
	}

	public static Class getMetaClass(Boolean self) {
		return org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("java.lang.Boolean");
	}
	
}
/* END OF FILE */
