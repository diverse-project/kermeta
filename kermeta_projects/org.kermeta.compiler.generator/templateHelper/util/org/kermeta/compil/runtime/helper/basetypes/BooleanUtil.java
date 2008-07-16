package org.kermeta.compil.runtime.helper.basetypes;

public class BooleanUtil {
	
	/** Java version */
	public static java.lang.Boolean equals(java.lang.Boolean self, java.lang.Boolean param0) {
		return java.lang.Boolean(self == param0);
	}
	
	/** Java version */
	public static java.lang.Boolean isNotEqual(java.lang.Boolean self, java.lang.Boolean param0) {
		return java.lang.Boolean(self != param0);
	}
	
	/** Java version */
	public static java.lang.Boolean and(java.lang.Boolean self, java.lang.Boolean param0) {
	    return java.lang.Boolean(self && param0);
	}
	
	/** Java version */
	public static java.lang.Boolean or(java.lang.Boolean self, java.lang.Boolean param0) {
		return java.lang.Boolean(self || param0);
	}
	
	/** Java version */
	public static java.lang.Boolean not(java.lang.Boolean self) {
		return java.lang.Boolean(!self);
	}
	
}
/* END OF FILE */
