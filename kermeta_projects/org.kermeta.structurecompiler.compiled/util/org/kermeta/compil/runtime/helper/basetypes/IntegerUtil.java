package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.exceptions.CallOnVoidTarget;
import kermeta.exceptions.ExceptionsFactory;
import kermeta.language.structure.Class;
import kermeta.standard.helper.IntegerWrapper;

import org.kermeta.compil.runtime.helper.error.KRuntimeError;
import org.kermeta.compil.runtime.helper.language.ObjectUtil;

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

	
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
	/*public static java.lang.Boolean isGreaterSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.isGreater((java.lang.Integer) self, (java.lang.Integer) other);
		}
	}
	
	public static java.lang.Boolean isGreaterOrEqualSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.isGreaterOrEqual((java.lang.Integer) self, (java.lang.Integer) other);
		}
	}
	
	public static java.lang.Boolean isLowerSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.isLower((java.lang.Integer) self, (java.lang.Integer) other);
		}
	}
	
	public static java.lang.Boolean isLowerOrEqualSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.isLowerOrEqual((java.lang.Integer) self, (java.lang.Integer) other);
		}
	}
	
	public static java.lang.Integer plusSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.plus((java.lang.Integer) self, (java.lang.Integer) other);
		}
	}
	
	public static java.lang.Integer minusSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.minus((java.lang.Integer) self, (java.lang.Integer) other);
		}
	}
	
	public static java.lang.Integer uminusSwitcher(java.lang.Object self) {
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.uminus((java.lang.Integer) self);
		}
	}
	
	public static java.lang.Double toRealSwitcher(java.lang.Object self) {
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the Integer expression");
			throw new KRuntimeError(exp);
		} else {
			return IntegerWrapper.toReal((java.lang.Integer) self);
		}
	}
	
	public static java.lang.String toStringSwitcher(java.lang.Object self) {
		if (self == null) {
			return ObjectUtil.toString(self);
		} else {
			return IntegerWrapper.toString((java.lang.Integer) self);
		}
	}
	
	public static java.lang.Boolean equalsSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || self instanceof kermeta.language.structure.Object) {
			return ObjectUtil.equals(self, other);
		} else {
			return IntegerWrapper.equals((java.lang.Integer) self, (java.lang.Integer) other);
		}
	}*/
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
}
/* END OF FILE */
