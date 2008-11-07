package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.exceptions.CallOnVoidTarget;
import kermeta.exceptions.ExceptionsFactory;
import kermeta.language.structure.Class;
import kermeta.standard.StandardFactory;
import kermeta.standard.helper.StringWrapper;

import org.kermeta.compil.runtime.helper.error.KRuntimeError;
import org.kermeta.compil.runtime.helper.language.ObjectUtil;

public class StringUtil {
    
	/** Java version */
	public static java.lang.Integer compareTo(java.lang.String self, java.lang.String param0) {
		return self.compareTo(param0);
	}

	/** Java version */
	public static java.lang.Boolean equals(java.lang.String self, java.lang.String param0) {
		return self.equals(param0);
	}
	
	/** Java version */
	public static java.lang.Boolean isNotEqual(java.lang.String self, java.lang.String param0) {
		return !equals(self, param0);
	}
	
	/** Java version */
	public static java.lang.String plus(java.lang.String self, java.lang.String param0) {
		return self + param0;
	}

	/** Java version */
	public static void append(java.lang.String self, java.lang.String param0) {
		self += param0;
	}

	/** Java version */
	public static java.lang.Character elementAt(java.lang.String self, java.lang.Integer param0) {
		return self.charAt(param0);
	}

	/** Java version */
	public static java.lang.Integer indexOf(java.lang.String self, java.lang.String param0) {
		return self.indexOf(param0);
	}

	/** Java version */
	public static java.lang.String substring(java.lang.String self, java.lang.Integer param0, java.lang.Integer param1) {
		return self.substring(param0, param1);
	}

	/** Java version */
	public static java.lang.Integer size(java.lang.String self) {
		return self.length();
	}
	
	/** Java version */
	public static java.lang.String replace(java.lang.String self, java.lang.String param0, java.lang.String param1) {
		return self.replace(param0, param1);
	}
	
	/** Java version */
	public static java.lang.Boolean contains(java.lang.String self, java.lang.String param0) {
		return self.contains(param0);
	}
	
	/** Java version */
	public static java.lang.String toUpperCase(java.lang.String self) {
		return self.toUpperCase();
	}
	
	/** Java version */
	public static java.lang.String toLowerCase(java.lang.String self) {
		return self.toLowerCase();
	}
	
	/** Java version */
	public static kermeta.standard.OrderedSet<java.lang.String> split(java.lang.String self, java.lang.String param0) {
		kermeta.standard.OrderedSet<java.lang.String> result = StandardFactory.eINSTANCE.createOrderedSet();
		
		for(java.lang.String string_item : self.split(param0)) {
			result.add(string_item);
		}

		return result;
	}
	
	/** Java version */
	public static java.lang.Boolean toBoolean(java.lang.String self) {
		java.lang.String val = self.trim().toLowerCase();
		if (val.equals("true") || val.equals("t") || val.equals("yes") || val.equals("y") || val.equals("1")) 
			return java.lang.Boolean.TRUE;
		else if (val.equals("false") || val.equals("f") || val.equals("no") || val.equals("n") || val.equals("0")) 
			return java.lang.Boolean.FALSE;
		else return null;
	}
	
	/** Java version */
	public static java.lang.Integer toInteger(java.lang.String self) {
		java.lang.Integer result;
		try {
			result = java.lang.Integer.parseInt(self.trim());
		} catch (NumberFormatException e) {
			result = null;
		}
		return result;
	}
	
	/** Java version */
	public static java.lang.Double toReal(java.lang.String self) {
		java.lang.Double result;
		try {
			result = java.lang.Double.parseDouble(self.trim());			
		} catch (NumberFormatException e) {
			result = null;
		}
		return result;
	}
	
	public static Boolean isVoid(String self) {
		return self == null;
	}

	public static Class getMetaClass(String self) {
		return org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass("java.lang.String");
	}
	
	
	
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
	/*public static java.lang.String plusSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.plus((java.lang.String) self, (java.lang.String) other);
		}
	}
	
	public static java.lang.String toLowerCaseSwitcher(java.lang.Object self) {
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.toLowerCase((java.lang.String) self);
		}
	}
	
	public static java.lang.String toUpperCaseSwitcher(java.lang.Object self) {
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.toUpperCase((java.lang.String) self);
		}
	}
	
	public static java.lang.Boolean containsSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.contains((java.lang.String) self, (java.lang.String) other);
		}
	}
	
	public static java.lang.String replaceSwitcher(java.lang.Object self, java.lang.Object str1, java.lang.Object str2) {
		if (self == null || str1 == null || str2 == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.replace((java.lang.String) self, (java.lang.String) str1, (java.lang.String) str2);
		}
	}
	
	public static void appendSwitcher(java.lang.Object self, java.lang.Object other) {
		// Other can be null, a String like <void> will be appended
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			StringWrapper.append((java.lang.String) self, (java.lang.String) other);
		}
	}
	
	public static java.lang.String substringSwitcher(java.lang.Object self, java.lang.Object b1, java.lang.Object b2) {
		if (self == null || b1 == null || b2 == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.substring((java.lang.String) self, (java.lang.Integer) b1, (java.lang.Integer) b2);
		}
	}
	
	public static java.lang.String toStringSwitcher(java.lang.Object self) {
		if (self == null) {
			return ObjectUtil.toString(self);
		} else {
			return StringWrapper.toString((java.lang.String) self);
		}
	}
	
	public static java.lang.Character elementAtSwitcher(java.lang.Object self, java.lang.Integer index) {
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.elementAt((java.lang.String) self, (java.lang.Integer) index);
		}
	}
	
	public static java.lang.Integer sizeSwitcher(java.lang.Object self) {
		if (self == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.size((java.lang.String) self);
		}
	}
	
	public static java.lang.Integer indexOfSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || other == null) {
			CallOnVoidTarget exp = ExceptionsFactory.eINSTANCE.createCallOnVoidTarget();
			exp.setMessage("Initialize the String expression");
			throw new KRuntimeError(exp);
		} else {
			return StringWrapper.indexOf((java.lang.String) self, (java.lang.String) other);
		}
	}
	
	public static java.lang.Boolean equalsSwitcher(java.lang.Object self, java.lang.Object other) {
		if (self == null || self instanceof kermeta.language.structure.Object) {
			return ObjectUtil.equals(self, other);
		} else {
			return StringWrapper.equals((java.lang.String) self, (java.lang.String) other);
		}
	}*/
	/**************************************/
	/************** SWITCHER **************/
	/**************************************/
}
/* END OF FILE */
