package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Class;

public class IntegerUtil {
    
	/** Java version */
	public static java.lang.Integer compareTo(java.lang.Integer self, java.lang.Integer param0) {
		return self.compareTo(param0);
	}
	
	/** Java version */
	public static java.lang.Boolean equals(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() == param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Integer plus(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() + param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Integer minus(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() - param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Integer times(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() * param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Integer div(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() / param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Integer mod(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() % param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Boolean isGreater(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() > param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Boolean isLower(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() < param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Boolean isGreaterOrEqual(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() >= param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Boolean isLowerOrEqual(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() <= param0.intValue();
	}
	
	/** Java version */
	public static java.lang.Double toReal(java.lang.Integer self) {
		return self.doubleValue();
	}
	
	/** Java version */
	public static java.lang.String toString(java.lang.Integer self) {
		return self.toString();
	}
	
	/** Java version */
	public static java.lang.Boolean isNotEqual(java.lang.Integer self, java.lang.Integer param0) {
		return self.intValue() != param0.intValue();
	}
	
	public static Boolean isVoid(Integer self) {
		return self == null;
	}

	public static Class getMetaClass(Integer self) {
		return org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("java.lang.Integer");
	}

}
/* END OF FILE */
