package org.kermeta.compil.runtime.helper.language;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import kermeta.language.structure.Object;

import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

public class ClassUtil {

	static public Object _new( String class_QN ) {
		
		String[] seq_class_QN = class_QN.replace(".", "%").split("%");
		
		String package_QN = "";
		String class_name = "";
		
		if( seq_class_QN.length==2 ) {
			package_QN = CodeGenUtil.capName(seq_class_QN[1]);
		} else {
			for( int i=0 ; i<(seq_class_QN.length-1) ; i++) {
				if(i>0) {
					package_QN += ".";
				}
				if( i==(seq_class_QN.length-2) ) {
					package_QN += CodeGenUtil.capName(seq_class_QN[i]);
				}
				else {
				package_QN += seq_class_QN[i];
				}
			}
		}
		
		String class_name_full = seq_class_QN[seq_class_QN.length-1];
		String[] seq_class_name_full = class_name_full.split("<");
		if( seq_class_name_full.length >1 ) {
			class_name = seq_class_name_full[0];
		} else {
			class_name = class_name_full;
		}
		
		EObject newObject = null;
		
		try {
			Class<?> factoryClass = ClassUtil.class.getClassLoader().loadClass(package_QN + "Factory");
		
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

}
