package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Class;

public class RealUtil {

	/** Java version */
	public static java.lang.Integer compareTo(java.lang.Double self, java.lang.Double param0) {
		return self.compareTo(param0);
	}
	
	/** Java version */
	public static java.lang.Boolean equals(java.lang.Double self, java.lang.Double param0) {
		return self.doubleValue() == param0.doubleValue();
	}
	
	/** Java version */
	public static java.lang.Double plus(java.lang.Double self, java.lang.Double param0) {
		return self.doubleValue() + param0.doubleValue();
	}

	/** Java version */
	public static java.lang.Double minus(java.lang.Double self, java.lang.Double param0) {
		return self.doubleValue() - param0.doubleValue();
	}

	/** Java version */
	public static java.lang.Double times(java.lang.Double self, java.lang.Double param0) {
		return self.doubleValue() * param0.doubleValue();
	}

	/** Java version */
	public static java.lang.Double div(java.lang.Double self, java.lang.Double param0) {
		return self.doubleValue() / param0.doubleValue();
	}

	/** Java version */
	public static java.lang.Integer toInteger(java.lang.Double self) {
		return java.lang.Integer.parseInt(java.lang.Long.toString(Math.round(self)));
	}
	
	/** Java version */
	public static java.lang.String toString(java.lang.Double self) {
		return self.toString();
	}
	
	/** Java version */
	public static java.lang.Boolean isNotEqual(java.lang.Double self, java.lang.Double param0) {
		return self.doubleValue() != param0.doubleValue();
	}
	
	public static Boolean isVoid(Double self) {
		return self == null;
	}
	
	public static Integer hashcode(Double self) {
		return self.hashCode();
	}

	public static Class getMetaClass(Double self) {
		return org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("java.lang.Double");
	}

	public static Boolean equals(Double self, Integer other) {
		return toInteger(self) == other;
	}

	public static Integer compareTo(Double self, Integer other) {
		return toInteger(self).compareTo(other);
	}

	public static Boolean isLower(Double self, Integer other) {
		return toInteger(self) < other;
	}

	public static Boolean isGreater(Double self, Integer other) {
		return toInteger(self) > other;
	}

	public static Boolean isGreaterOrEqual(Double self, Integer other) {
		return toInteger(self) >= other;
	}

	public static Boolean isLowerOrEqual(Double self, Integer other) {
		return toInteger(self) <= other;
	}
	

}
/* END OF FILE */
