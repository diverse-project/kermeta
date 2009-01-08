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

	static public Object newObject( String class_QN ) {
		
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
	
	public static Object cloneObject(kermeta.language.structure.Class class_, Object objectToClone) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object deepCloneObject(kermeta.language.structure.Class class_, Object objectToClone) {
		// TODO Auto-generated method stub
		return null;
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
