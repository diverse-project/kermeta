package org.kermeta.compil.runtime.helper.language;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import kermeta.exceptions.ExceptionsFactory;
import kermeta.exceptions.TypeCastError;
import kermeta.language.structure.Class;
import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Object;
import kermeta.language.structure.ParameterizedType;
import kermeta.language.structure.Property;
import kermeta.language.structure.Type;
import kermeta.standard.Collection;
import kermeta.standard.Set;
import kermeta.standard.StandardFactory;
import kermeta.standard.StandardPackage;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.kermeta.compil.runtime.ExecutionContext;
import org.kermeta.compil.runtime.helper.basetypes.BooleanUtil;
import org.kermeta.compil.runtime.helper.basetypes.CharacterUtil;
import org.kermeta.compil.runtime.helper.basetypes.CollectionUtil;
import org.kermeta.compil.runtime.helper.basetypes.IntegerUtil;
import org.kermeta.compil.runtime.helper.basetypes.RealUtil;
import org.kermeta.compil.runtime.helper.basetypes.StringUtil;
import org.kermeta.compil.runtime.helper.error.KRuntimeError;

public class ObjectUtil {

	public static kermeta.language.structure.Object container(java.lang.Object self) {
		return null;
	}
	
	public static kermeta.language.structure.Object containerSwitcher(java.lang.Object self) {
		if(self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).container();
		}
		return container(self);
	}
	
	public static kermeta.language.structure.Object container(kermeta.language.structure.Object o) {
		//FIXME return o.getContainer();
		return (kermeta.language.structure.Object) o.eContainer();
	}
	
	static public java.lang.Boolean isInstanceOf(kermeta.language.structure.Object o, String type) {
		
		if ( type.equals(o.getClass().getName().replace("impl.", "").replace("Impl", "")) ) {
			return true;
		} else {
			for( Class clazz : getMetaClass(o).getterSuperClass() ) {
				if (qualifiedNameDot(clazz.getTypeDefinition()).equals(type) ) {
					return true;
				}
			}
		}
		return false;
	}
	
	static public java.lang.Boolean isInstanceOf(java.lang.Object o, String type) {

		if ( type.equals(o.getClass().getName().replace("impl.", "").replace("Impl", "")) ) {
			return true;
		} else {
			for( Class clazz : getMetaClass(o).getterSuperClass() ) {
				if (qualifiedNameDot(clazz.getTypeDefinition()).equals(type) ) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static java.lang.Boolean isInstanceOfSwitcher(java.lang.Object self, String type) {
		return isInstanceOf(self, type);
	}
	
	public static java.lang.Boolean isInstanceOf(kermeta.language.structure.Object o, Class metaClass) {
		
		String metaClass_qName = qualifiedNameDot(metaClass.getTypeDefinition());
		
		if ( metaClass_qName.equals(qualifiedNameDot(getMetaClass(o).getTypeDefinition())) ) {
			return true;
		} else {
			for( kermeta.language.structure.Type type : allSuperTypes((ClassDefinition) getMetaClass(o).getTypeDefinition()) ) {
				if (qualifiedNameDot(((Class) type).getTypeDefinition()).equals(metaClass_qName) ) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static java.lang.Boolean isInstanceOf(java.lang.Object o, Type metaClass) {
		if (metaClass instanceof ParameterizedType) {
			return qualifiedNameDot(((ParameterizedType) metaClass).getTypeDefinition()).equals(
					o.getClass().getName().replace("impl.", "").replace("Impl", ""));
		}
		return false;
	}
	
	public static java.lang.Boolean isInstanceOfSwitcher(java.lang.Object self, Type metaClass) {
		/*if( self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).isInstanceOf(metaClass);
		}*/
		return isInstanceOf(self, metaClass);
	}
	
	public static kermeta.language.structure.Object getSwitcher(java.lang.Object self, Property p) {
		if( self instanceof kermeta.language.structure.Object ) {
			return (( kermeta.language.structure.Object) self).get(p);
		} else {
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		}
	}
	
	public static kermeta.language.structure.Object get(kermeta.language.structure.Object o, Property p) {
		
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		
		if ( feature.isMany() ) {
			EList value = (EList) o.eGet(feature);
			Collection c = null;
			if ( feature.isOrdered() ) {
				if ( feature.isUnique() )
					c = StandardFactory.eINSTANCE.createOrderedSet();
				else
					c = StandardFactory.eINSTANCE.createSequence();
			} else {
				if ( feature.isUnique() )
					c = StandardFactory.eINSTANCE.createSet();
				else
					c = StandardFactory.eINSTANCE.createBag();
			}
			EList l = new BasicEList();
			l.addAll( value );
			c.setValues( l );
			return c;

		}
		
		//if( allSuperTypes((kermeta.language.structure.ClassDefinition) ObjectUtil.getMetaClass(feature).getTypeDefinition()).contains(arg0) )
		java.lang.Object theValue = o.eGet(feature);
		if( theValue instanceof kermeta.language.structure.Object ) {
			return (kermeta.language.structure.Object) o.eGet(feature);
		} else {
			kermeta.language.structure.Object value_type = null;
			if( theValue instanceof java.lang.String ) {
				kermeta.standard.String _String = StandardFactory.eINSTANCE.createString();
				_String.setValue((java.lang.String) theValue);
				value_type = (kermeta.language.structure.Object) _String;
			} else {
				if( theValue instanceof java.lang.Integer ) {
					kermeta.standard.Integer _Integer = StandardFactory.eINSTANCE.createInteger();
					_Integer.setValue(((java.lang.Integer) theValue).toString());
					value_type = (kermeta.language.structure.Object) _Integer;
				}else {
					if( theValue instanceof java.lang.Boolean ) {
						kermeta.standard.Boolean _Boolean = StandardFactory.eINSTANCE.createBoolean();
						_Boolean.setValue(((java.lang.Boolean) theValue).toString());
						value_type = (kermeta.language.structure.Object) _Boolean;
					} else {
						if( theValue instanceof java.lang.Character ) {
							kermeta.standard.Character _Character = StandardFactory.eINSTANCE.createCharacter();
							_Character.setValue(((java.lang.Character) theValue).toString());
							value_type = (kermeta.language.structure.Object) _Character;
						} else {
							if( theValue instanceof java.lang.Double ) {
								kermeta.standard.Real _Real = StandardFactory.eINSTANCE.createReal();
								_Real.setValue(((java.lang.Double) theValue).toString());
								value_type = (kermeta.language.structure.Object) _Real;
							}
						}
					}
				}
			}
			return value_type;
		}
		
	}
	
	static public kermeta.language.structure.Object get(java.lang.Boolean o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.String o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.Integer o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.Character o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.Double o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public java.lang.Object get(java.lang.Object o, Property p) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public void set(kermeta.language.structure.Object o, Property p, kermeta.language.structure.Object element) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		o.eSet(feature, element);
	}
	
	static public void set(java.lang.Object o, Property p, java.lang.Object element) {
		EStructuralFeature feature = ((kermeta.language.structure.Object) o).eClass().getEStructuralFeature( p.getName() );
		((kermeta.language.structure.Object) o).eSet(feature, element);
	}
	
	static public void set(kermeta.language.structure.Object o, Property p, java.lang.Object element) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		o.eSet(feature, element);
	}
	
	static public void set(java.lang.Object o, Property p, kermeta.language.structure.Object element) {
		EStructuralFeature feature = ((kermeta.language.structure.Object) o).eClass().getEStructuralFeature( p.getName() );
		((kermeta.language.structure.Object) o).eSet(feature, element);
	}
	
	static public java.lang.Boolean isSet(kermeta.language.structure.Object o, Property p) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		return o.eIsSet(feature);
	}
	
	public static java.lang.Boolean isSet(java.lang.Object self, Property property) {
		// TODO Auto-generated method stub
		return null;
	}
	
	static public void unset(kermeta.language.structure.Object o, Property p) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		o.eUnset(feature);
	}
	
	static public void unset(java.lang.Object o, Property p) {
		EStructuralFeature feature = ((kermeta.language.structure.Object) o).eClass().getEStructuralFeature( p.getName() );
		((kermeta.language.structure.Object) o).eUnset(feature);
	}
	
	static public java.lang.Integer getOID(kermeta.language.structure.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer getOID(java.lang.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer getHashcode(kermeta.language.structure.Object self, kermeta.language.structure.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer getHashcode(java.lang.Object self, java.lang.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer getHashcode(java.lang.Object self, kermeta.language.structure.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer getHashcode(kermeta.language.structure.Object self, java.lang.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer hashcode(kermeta.language.structure.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer hashcode(java.lang.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	public static kermeta.language.structure.Class getMetaClass(java.lang.Object self) {
		
		if( self instanceof kermeta.language.structure.Object ) {
			return org.kermeta.compil.runtime.ExecutionContext.getInstance().getMetaClass(self.getClass().getName());
		} else if (self instanceof String) {
			return StringUtil.getMetaClass((String) self);
		} else if (self instanceof Boolean) {
			return BooleanUtil.getMetaClass((Boolean) self);
		} else if (self instanceof Integer) {
			return IntegerUtil.getMetaClass((Integer) self);
		} else if (self instanceof Double) {
			return RealUtil.getMetaClass((Double) self);
		} else if (self instanceof Character) {
			return CharacterUtil.getMetaClass((Character) self);
		}
		
		return null;
	}
	
	public static kermeta.language.structure.Class getMetaClassSwitcher(java.lang.Object self) {
		if(self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).getMetaClass();
		}
		return getMetaClass(self);
	}
	
	///////////Unused for the moment
	static public kermeta.language.structure.Object convertFromJavaString(java.lang.String o) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public kermeta.language.structure.Object convertFromJavaInteger(java.lang.Integer o) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	static public kermeta.language.structure.Object convertFromJavaBoolean(java.lang.Boolean o) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	///////////end of Unused for the moment
	
	
	
	public static Boolean equalsSwitcher(java.lang.Object object, java.lang.Object element) {
		if( object instanceof kermeta.language.structure.Object && element instanceof kermeta.language.structure.Object) {
			return object.equals(element);
		} else {
			return equals(object, element);
		}
	}
	
	public static Boolean equals(kermeta.language.structure.Object object, kermeta.language.structure.Object element) {
		//if( object == null || element == null ) {
			return object==element;
		/*} else {
			return object.equals(element);
		}*/
	}
	
	public static Boolean equals(java.lang.Object object, java.lang.Object element) {
		if( object == null || element == null ) {
			return object==element;
		} else {
			if( object instanceof java.lang.String || object instanceof java.lang.Integer || object instanceof java.lang.Boolean || object instanceof java.lang.Character || object instanceof java.lang.Double ) {
				return object.equals(element);
			} else {
				return object==element;
			}
		}
	}
	
	public static Boolean equals(kermeta.language.structure.Object object, java.lang.Object element) {
		//if( object == null || element == null ) {
			return object==element;
		/*} else {
			return object.equals(element);
		}*/
	}
	
	public static Boolean equals(java.lang.Object object, kermeta.language.structure.Object element) {
		//if( object == null || element == null ) {
			return object==element;
		/*} else {
			return object.equals(element);
		}*/
	}
	
	public static Boolean isFrozen(kermeta.language.structure.Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean isFrozen(java.lang.Object objectImpl) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void freeze(kermeta.language.structure.Object objectImpl) {
		// TODO Auto-generated method stub
		
	}
	
	public static void freeze(java.lang.Object objectImpl) {
		// TODO Auto-generated method stub
		
	}
	
	public static kermeta.persistence.Resource getContainingResource(kermeta.language.structure.Object objectImpl) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static kermeta.persistence.Resource getContainingResource(java.lang.Object objectImpl) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void unSetContainingResource(kermeta.language.structure.Object instance) {
		// TODO Auto-generated method stub
		
	}
	
	public static void unSetContainingResource(java.lang.Object instance) {
		// TODO Auto-generated method stub
		
	}
	
	public static void setContainingResource(kermeta.language.structure.Object instance,
			kermeta.persistence.EMFResource resourceImpl) {
		// TODO Auto-generated method stub
		
	}
	
	public static void setContainingResource(java.lang.Object instance,
			kermeta.persistence.EMFResource resourceImpl) {
		// TODO Auto-generated method stub
		
	}
	
	public static java.lang.Boolean isNotEqualSwitcher(java.lang.Object self, java.lang.Object o) {
		if( self instanceof kermeta.language.structure.Object && o instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).isNotEqual((kermeta.language.structure.Object)o);
		} else {
			return isNotEqual(self, o);
		}
	}
	
	public static java.lang.Boolean isNotEqual(kermeta.language.structure.Object self, java.lang.Object o) {
		if(self==null || o==null) {
			return self != o;
		} else if( (self instanceof kermeta.language.structure.Class) && o instanceof kermeta.language.structure.Class ) {
			return !qualifiedNameDot(((kermeta.language.structure.Class) self).getTypeDefinition()).equals(
						qualifiedNameDot(((kermeta.language.structure.Class) o).getTypeDefinition()));
		} else {
			return !self.equals(o);
		}
	}
	
	public static java.lang.Boolean isNotEqual(java.lang.Object self, java.lang.Object o) {
		if(self==null || o==null) {
			return self != o;
		} else if( (self instanceof kermeta.language.structure.Class) && o instanceof kermeta.language.structure.Class ) {
			return !qualifiedNameDot(((kermeta.language.structure.Class) self).getTypeDefinition()).equals(
						qualifiedNameDot(((kermeta.language.structure.Class) o).getTypeDefinition()));
		} else {
			return !self.equals(o);
		}
	}
	
	public static java.lang.Boolean isVoid(kermeta.language.structure.Object self) {
		return self==null;
	}
	
	public static java.lang.Boolean isVoid(java.lang.Object self) {
		return self==null;
	}
	
	public static java.lang.Boolean isVoidSwitcher(java.lang.Object self) {
		if(self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).isVoid();
		} else {
			return isVoid(self);
		}
	}
	
	public static java.lang.String toString(kermeta.language.structure.Object self) {
		if( self==null ) {
			return "null";
		}
		return self.toString();
	}
	
	public static java.lang.String toString(java.lang.Object self) {
		return self.toString();
	}
	
	public static java.lang.String toStringSwitcher(java.lang.Object self) {
		return self.toString();
	}
	
	public static java.lang.Object asTypeSwitcher(java.lang.Object self, kermeta.language.structure.Class class_) {
		if( self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).asType(class_);
		} else {
			return asType(self, class_);
		}
	}
	
	public static java.lang.Object asType(java.lang.Object self, kermeta.language.structure.Class class_) {
		if( isInstanceOf(self, class_) ) {
			return self;
		} else {
			ExceptionsFactory.eINSTANCE.createTypeCastError();
			return null;
		}
	}
	
	public static java.lang.Object asType(kermeta.language.structure.Object self, kermeta.language.structure.Class class_) {
		if( isInstanceOf(self, class_) ) {
			return self;
		} else {
			TypeCastError exp = ExceptionsFactory.eINSTANCE.createTypeCastError();
			exp.setMessage("TypeCastError on " + self.toString() + " " + class_.toString());
			throw new KRuntimeError(exp);
		}
	}

	public static Integer oid(kermeta.language.structure.Object self) {
		return self.hashCode();
	}
	
	public static Integer oid(java.lang.Object self) {
		return self.hashCode();
	}
	
	public static Integer oidSwitcher(java.lang.Object self) {
		if(self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).oid();
		}
		return oid(self);
	}
	
	public static void checkInvariantsSwitcher(java.lang.Object self) {
		if(self instanceof kermeta.language.structure.Object) {
			((kermeta.language.structure.Object) self).checkInvariants();
		}
	}
	
	public static void checkAllInvariantsSwitcher(java.lang.Object self) {
		if(self instanceof kermeta.language.structure.Object) {
			((kermeta.language.structure.Object) self).checkAllInvariants();
		}
	}
	
	public static void checkInvariants(kermeta.language.structure.Object self) {
		List<String> results = new ArrayList<String>();
		
		ClassDefinition self_cd = (kermeta.language.structure.ClassDefinition) ObjectUtil.getMetaClass(self).getTypeDefinition();
		// Check invariants from the real type of self
		results = checkInvariant(self, self_cd, results);
		
		// Check invariants from the inherited classes
		for( Type current_type : allSuperTypes(self_cd) ) {
			kermeta.language.structure.ClassDefinition current_cd = null;
			if( current_type instanceof ParameterizedType ) {
				current_cd = (kermeta.language.structure.ClassDefinition) ((ParameterizedType) current_type).getTypeDefinition();
			}
			results = checkInvariant(self, current_cd, results);
		}
		
		if(results.size()>0) {
			String message = "\n";
			for(java.lang.String str_result : results) {
				message += str_result + "\n";
			}
			kermeta.exceptions.ConstraintViolatedInv exp = kermeta.exceptions.ExceptionsFactory.eINSTANCE.createConstraintViolatedInv();
			exp.setMessage(message);
			throw new KRuntimeError(exp);
		}
		
	}
	
	private static List<String> checkInvariant(kermeta.language.structure.Object self, kermeta.language.structure.ClassDefinition current_cd, List<String> results) {
		
		String  class_name = ((kermeta.language.structure.Package) current_cd.eContainer()).qualifiedName().replace("::", ".")
		+ ".helper."
		+ current_cd.getName()
		+ "Invariant";
	
		try {
			java.lang.Class<?> current_class = ObjectUtil.class.getClassLoader().loadClass(class_name);
			
			for(Method method : current_class.getDeclaredMethods()) {
				java.lang.Boolean check_result = (java.lang.Boolean) method.invoke(current_class, new Object[] {self});
				
				if( !check_result ) {
					results.add("The invariant " + method.getName().replace("checkInvariant_", "") + " on " + ObjectUtil.toString(self));
				}
			}
			
		} catch (ClassNotFoundException e) {
			return results;
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return results;

	}
	
	public static void checkInvariants(java.lang.Object objectImpl) {
		throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
				((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.exceptions.NotImplementedException")));
	}

	public static void checkAllInvariants(kermeta.language.structure.Object object) {
		throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
				((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.exceptions.NotImplementedException")));
	}
	
	public static void checkAllInvariants(java.lang.Object object) {
		throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
				((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.exceptions.NotImplementedException")));
	}
	
	public static java.lang.Boolean isKindOf(kermeta.language.structure.Object self, kermeta.language.structure.Class metaClass) {
		throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
				((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.exceptions.NotImplementedException")));
	}
	
	public static java.lang.Boolean isKindOf(java.lang.Object self, kermeta.language.structure.Class metaClass) {
		throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
				((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.exceptions.NotImplementedException")));
	}
	
	public static java.lang.Boolean isKindOfSwitcher(java.lang.Object self, kermeta.language.structure.Class metaClass) {
		if(self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).isKindOf(metaClass);
		} else {
			return isKindOf(self, metaClass);
		}
	}
	
	public static java.lang.Object containingResource(Object element) {
		if(element instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) element).eResource();
		}
		return null;
	}
	
	public static Set<Object> getAllContainedObjects(Object self) {
		Set<Object> set_obj = StandardFactory.eINSTANCE.createSet();
		//FIXME TO DO THE IMPL
		return set_obj;
	}
	
	
	/**********************************************************/
	/**********************************************************/
	/**********************************************************/
	
	/**
	 * DO NOT REMOVE PLEASE CF, these methods are used to bypass an infinite loop
	 * @param elem
	 * @return
	 */
	public static String qualifiedNameDot(kermeta.language.structure.NamedElement elem) {

		if( qualifiedName_hashtable.containsKey(elem) ) {
			return qualifiedName_hashtable.get(elem);
		}
		
		kermeta.language.structure.NamedElement elem_copy = elem;
		
		java.lang.String result = elem.getName();

		if ( elem.eContainer() instanceof kermeta.language.structure.NamedElement ) {
			elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
					.container(elem);
			while ( elem != null ) {
				result = elem.getName() + "." + result;
				if ( elem.eContainer() instanceof kermeta.language.structure.NamedElement ) {
						elem = (kermeta.language.structure.NamedElement) org.kermeta.compil.runtime.helper.language.ObjectUtil
								.container(elem);
					} else {
						elem = null;
					}
			}
		}
		
		qualifiedName_hashtable.put(elem_copy, result);
		
		return result;
	}
	
	private static Hashtable<kermeta.language.structure.NamedElement, String> qualifiedName_hashtable = new Hashtable<kermeta.language.structure.NamedElement, String>();
	
	private static Hashtable<String, List<kermeta.language.structure.Type>> allSuperTypes_hashtable = new Hashtable<String, List<kermeta.language.structure.Type>>();
	
	public static List<Type> allSuperTypes(ClassDefinition self) {
		
		String self_qName = qualifiedNameDot(self);
		
		if ( allSuperTypes_hashtable.containsKey(self_qName) ) {
			return allSuperTypes_hashtable.get(self_qName);
		}
		
		kermeta.standard.Set<kermeta.language.structure.Type> allSuperClasses = StandardFactory.eINSTANCE.createSet();

		kermeta.standard.Set<kermeta.language.structure.Type> superClasses = StandardFactory.eINSTANCE.createSet();

		superClasses
				.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
						.<kermeta.language.structure.Type> convertAsSet(self
								.getSuperType()));

		while ( !superClasses.isEmpty() ) {
			

				allSuperClasses.addAll(superClasses);

				kermeta.standard.Bag<kermeta.language.structure.Type> temp = StandardFactory.eINSTANCE.createBag();

				//BIft:each

				{

					kermeta.standard.Iterator<kermeta.language.structure.Type> it_ft38 = superClasses
							.iterator();
					java.lang.Boolean idLoopCond_139 = false;
					while (!idLoopCond_139) {
						idLoopCond_139 = it_ft38.isOff();
						if (idLoopCond_139) {
						} else {

							//BIle:func
							kermeta.language.structure.Type s_lbdExp38 = it_ft38
									.next();

							if (s_lbdExp38 instanceof kermeta.language.structure.ParameterizedType && ((kermeta.language.structure.ParameterizedType) s_lbdExp38).getTypeDefinition() instanceof kermeta.language.structure.ClassDefinition) {

								temp
										.addAll(org.kermeta.compil.runtime.helper.basetypes.CollectionUtil
												.<kermeta.language.structure.Type> convertAsBag(((kermeta.language.structure.ClassDefinition) ((kermeta.language.structure.ParameterizedType) s_lbdExp38).getTypeDefinition()).getSuperType()));
							}

							//EIle:func

						}
					}
				}

				//EIft:each
				superClasses.clear();
				superClasses.addAll(temp);
		}
		
		allSuperTypes_hashtable.put(self_qName, CollectionUtil.convertAsEList(allSuperClasses));

		return CollectionUtil.convertAsEList(allSuperClasses);

	}
	/**********************************************************/
	/**********************************************************/
	/**********************************************************/

}
