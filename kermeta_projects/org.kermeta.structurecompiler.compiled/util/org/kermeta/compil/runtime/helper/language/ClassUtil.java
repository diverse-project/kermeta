package org.kermeta.compil.runtime.helper.language;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import kermeta.language.structure.Object;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ClassUtil {

	public static Object newObject( org.eclipse.emf.ecore.EClass eClass ) {
		return (kermeta.language.structure.Object) EcoreUtil.create(eClass);
	}
	
	public static Object newObject( String class_QN ) {
		
		class_QN = class_QN.replace("impl.", "");
		
		if(class_QN.endsWith("Impl")) {
			class_QN = class_QN.replace("Impl", "");
		}
		
		String type = class_QN;
		String[] type_ = class_QN.split("<");
		if ( type_.length > 1) {
			type = type_[0];
		}
		
		String[] seq_class_QN = type.split("\\.");
		
		String package_QN = "";
		String class_name = "";
		String last_package_name = null;
		
		if( seq_class_QN.length==2 ) {
			package_QN = seq_class_QN[0] + ".";
			last_package_name = CodeGenUtil.capName(seq_class_QN[0]);
		} else {
			for( int i=0 ; i<(seq_class_QN.length-1) ; i++) {
				if( i==(seq_class_QN.length-2) ) {
					last_package_name = CodeGenUtil.capName(seq_class_QN[i]);
				}
				package_QN += seq_class_QN[i] + ".";
			}
		}
		
		String class_name_full = seq_class_QN[seq_class_QN.length-1];
		class_name = class_name_full;
		
		EObject newObject = null;
		
		try {
			Class<?> factoryClass = ClassUtil.class.getClassLoader().loadClass(package_QN + last_package_name + "Factory");
		
			Field field_eINSTANCE = factoryClass.getField("eINSTANCE");
			
			EFactory factory_eINSTANCE = (EFactory) field_eINSTANCE.get(null);
			
			Method method = factory_eINSTANCE.getClass().getMethod("create" + class_name, new Class[] {});
			
	        newObject = (EObject) method.invoke(factory_eINSTANCE, new Object[] {});
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return (kermeta.language.structure.Object) newObject;
	}
	
	public static Object cloneSwitcher(kermeta.language.structure.Class class_, java.lang.Object objectToClone) {
		if( objectToClone instanceof kermeta.language.structure.Object ) {
			return class_.clone((kermeta.language.structure.Object) objectToClone);
		} else {
			return cloneObject(class_, (java.lang.Object) objectToClone);
		}

	}
	
	public static Object cloneObject(kermeta.language.structure.Class class_, kermeta.language.structure.Object objectToClone) {
		// We cannot use the EcoreUtil.copy from EMF for "clone", because the behavior of this one is a deepClone
		//return (kermeta.language.structure.Object) EcoreUtil.copy((kermeta.language.structure.Object) objectToClone);
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static Object cloneObject(kermeta.language.structure.Class class_, java.lang.Object objectToClone) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static Object deepCloneSwitcher(kermeta.language.structure.Class class_, java.lang.Object objectToClone) {
		if( objectToClone instanceof kermeta.language.structure.Object ) {
			return class_.deepClone((kermeta.language.structure.Object) objectToClone);
		} else {
			return deepCloneObject(class_, (java.lang.Object) objectToClone);
		}
	}

	public static Object deepCloneObject(kermeta.language.structure.Class class_, Object objectToClone) {
		return (kermeta.language.structure.Object) EcoreUtil.copy((kermeta.language.structure.Object) objectToClone);
	}
	
	public static Object deepCloneObject(kermeta.language.structure.Class class_, java.lang.Object objectToClone) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static Boolean equalsSwitcher(kermeta.language.structure.Class self, java.lang.Object other) {
		if( other instanceof kermeta.language.structure.Object ) {
			return self.equals((kermeta.language.structure.Object) other);
		} else {
			// This case should not occurred, other must be instance of kermeta.language.structure.Object
			if (self == other ) {
				return true;
			} else {
				return self.equals(other);
			}
		}
	}
	
	public static Boolean equals(kermeta.language.structure.Class class_, Object other) {
		if(class_ == null || other == null) {
			return class_ == other;
		}
	
		if(other instanceof kermeta.language.structure.Class) {
			return ObjectUtil.qualifiedNameDot(class_.getTypeDefinition()).equals(ObjectUtil.qualifiedNameDot(((kermeta.language.structure.Class) other).getTypeDefinition()));
		} else {
			return false;
		}
	}
}
