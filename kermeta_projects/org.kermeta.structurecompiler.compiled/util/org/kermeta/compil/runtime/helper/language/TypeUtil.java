
package org.kermeta.compil.runtime.helper.language;

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.ParameterizedType;
import kermeta.language.structure.PrimitiveType;
import kermeta.language.structure.Type;


public class TypeUtil {

	public static java.lang.Boolean hasSubTypeSwitcher(kermeta.language.structure.Type self, kermeta.language.structure.Object object) {
		if(self instanceof kermeta.language.structure.Type && object instanceof kermeta.language.structure.Object ) {
			return hasSubType((kermeta.language.structure.Type) self, (kermeta.language.structure.Object) object);
		} else {
			return hasSubType(self, object);
		}
	}
	
	public static java.lang.Boolean hasSubType(kermeta.language.structure.Type self, kermeta.language.structure.Object object) {
		
		if(object instanceof ParameterizedType) {
			String expected_qn = ObjectUtil.qualifiedNameDot((ClassDefinition) ((ParameterizedType) self).getTypeDefinition());
			for( Type cd_type : ObjectUtil.allSuperTypes((ClassDefinition) ((ParameterizedType) object).getTypeDefinition()) ) {
				
				if(cd_type instanceof  ParameterizedType) {
					String qn = ObjectUtil.qualifiedNameDot(((ParameterizedType) cd_type).getTypeDefinition());
					if( expected_qn.equals(qn) ) {
						return true;
					}
				}
				
				
				//return ObjectUtil.allSuperTypes((ClassDefinition) ((ParameterizedType) object).getTypeDefinition()).contains(self);
			}
			return false;
		}
		if(object instanceof PrimitiveType) {
			return hasSubType(self, ((PrimitiveType)object).getInstanceType());
		}
		return null;
	}
	
	public static java.lang.Boolean hasSubType(kermeta.language.structure.Type self, java.lang.Object object) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}

	public static Boolean isInstance(kermeta.language.structure.Class metaClass, java.lang.String o_string) {
		return ObjectUtil.isInstanceOf(o_string, metaClass);
	}
	
	public static java.lang.Boolean isInstanceSwitcher(kermeta.language.structure.Class metaClass, java.lang.Object o) {
		if( o instanceof kermeta.language.structure.Object) {
			return metaClass.isInstance((kermeta.language.structure.Object) o);
		} else {
			return isInstance(metaClass, o);
		}
	}
	
	public static Boolean isInstance(kermeta.language.structure.Class metaClass, kermeta.language.structure.Object o) {
		return ObjectUtil.isInstanceOf(o, metaClass);
	}

	public static Boolean isInstance(kermeta.language.structure.Class metaClass, java.lang.Object o) {
		return ObjectUtil.isInstanceOf(o, metaClass);
	}
	
	public static java.lang.Boolean isInstanceSwitcher(kermeta.language.structure.Type type, java.lang.Object o) {
		if( o instanceof kermeta.language.structure.Object) {
			return type.isInstance((kermeta.language.structure.Object) o);
		} else {
			return isInstance(type, o);
		}
	}
	
	public static Boolean isInstance(kermeta.language.structure.Type type, kermeta.language.structure.Object o) {
		return ObjectUtil.isInstanceOf(o, type.getClass().getName());
	}
	
	public static Boolean isInstance(kermeta.language.structure.Type type, java.lang.Object o) {
		return ObjectUtil.isInstanceOf(o, type.getClass().getName());
	}

	public static java.lang.Boolean isSuperTypeOfSwitcher(java.lang.Object type, java.lang.Object metaClass) {
		if(type instanceof kermeta.language.structure.Type && metaClass instanceof kermeta.language.structure.Type ) {
			return ((kermeta.language.structure.Type) type).isSuperTypeOf((kermeta.language.structure.Type) metaClass);
		} else {
			return isSuperTypeOf(type, metaClass);
		}
	}
	
	public static java.lang.Boolean isSuperTypeOf(kermeta.language.structure.Type type, kermeta.language.structure.Type metaClass) {
		
		if(metaClass instanceof ParameterizedType) {
			return ObjectUtil.allSuperTypes((ClassDefinition) ((ParameterizedType) metaClass).getTypeDefinition()).contains(type);
		}
		//if metaClass is instance of PrimitiveType then the method is recalled on the getInstanceType
		if(metaClass instanceof PrimitiveType) {
			return isSuperTypeOf( ((PrimitiveType) type).getInstanceType() , metaClass);
		}
		
		return false;
	}
	
	public static java.lang.Boolean isSuperTypeOf(java.lang.Object type, java.lang.Object metaClass) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
}
