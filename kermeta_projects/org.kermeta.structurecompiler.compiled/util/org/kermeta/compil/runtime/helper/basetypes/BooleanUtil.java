package org.kermeta.compil.runtime.helper.basetypes;

import org.kermeta.compil.runtime.helper.error.KRuntimeError;
import org.kermeta.compil.runtime.helper.language.ObjectUtil;

import kermeta.exceptions.CallOnVoidTarget;
import kermeta.exceptions.ExceptionsFactory;
import kermeta.exceptions.ExceptionsPackage;
import kermeta.language.structure.Class;
import kermeta.language.structure.Property;
import kermeta.standard.helper.BooleanWrapper;
import kermeta.util.KermetaAdapterFactory;

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
	
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
	/*public static java.lang.Boolean notSwitcher(java.lang.Object self) {
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Boolean expression");
			throw new KRuntimeError(exp);
		} else if (self instanceof kermeta.standard.Boolean) {
			java.lang.String value = ((kermeta.standard.Boolean) self).getValue();
			return !value.equals("true");
		} else {
			return BooleanWrapper.not((java.lang.Boolean) self);
		}
	}
	
	public static java.lang.Boolean andSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Boolean expression");
			throw new KRuntimeError(exp);
		} else {
			return BooleanWrapper.and((java.lang.Boolean) self, (java.lang.Boolean) other);
		}
	}
	
	public static java.lang.Boolean orSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the boolean expression");
			throw new KRuntimeError(exp);
		} else {
			return BooleanWrapper.or((java.lang.Boolean) self, (java.lang.Boolean) other);
		}
	}
	
	public static java.lang.String toStringSwitcher(java.lang.Object self) {
		if (self == null) {
			return ObjectUtil.toString(self);
		} else {
			return BooleanWrapper.toString((java.lang.Boolean) self);
		}
	}
	
	public static java.lang.Boolean equalsSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || self instanceof kermeta.language.structure.Object) {
			return ObjectUtil.equals(self, other);
		} else {
			return BooleanWrapper.equals((java.lang.Boolean) self, (java.lang.Boolean) other);
		}
	}*/
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
	
}
/* END OF FILE */
