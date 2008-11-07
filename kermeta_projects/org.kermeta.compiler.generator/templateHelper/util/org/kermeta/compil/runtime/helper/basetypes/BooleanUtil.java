package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Class;
import kermeta.language.structure.Property;

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
	
	
	/********************************/
	/********* GET METHODS **********/
	/********************************/
	public static java.lang.Boolean get(kermeta.language.structure.Object o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static java.lang.Boolean get(java.lang.Object o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static java.lang.Boolean get(java.lang.Boolean o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static java.lang.Boolean get(java.lang.String o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static java.lang.Boolean get(java.lang.Integer o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static java.lang.Boolean get(java.lang.Character o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static java.lang.Boolean get(java.lang.Double o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
}
/* END OF FILE */
