package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Class;

public class RealUtil {

	/** Java version */
	public static java.lang.Integer compareTo(java.lang.Double self, java.lang.Double param0) {
		return self.compareTo(param0);
	}
	
	/** Java version */
	public static java.lang.Boolean equals(java.lang.Double self, java.lang.Double param0) {
		return self.equals(param0);
	}
	
	/** Java version */
	public static java.lang.Double plus(java.lang.Double self, java.lang.Double param0) {
		return self + param0;
	}

	/** Java version */
	public static java.lang.Double minus(java.lang.Double self, java.lang.Double param0) {
		return self - param0;
	}

	/** Java version */
	public static java.lang.Double times(java.lang.Double self, java.lang.Double param0) {
		return self * param0;
	}

	/** Java version */
	public static java.lang.Double div(java.lang.Double self, java.lang.Double param0) {
		return self / param0;
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
		return !self.equals(param0);
	}
	
	public static Boolean isVoid(Double other) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Integer hashcode(Double self) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Class getMetaClass(Double self) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
/* END OF FILE */
