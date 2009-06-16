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
import kermeta.standard.Set;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
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
	
	public static kermeta.language.structure.Object container(kermeta.language.structure.Object self) {
		return (kermeta.language.structure.Object) self.eContainer();
	}
	
	static public java.lang.Boolean isInstanceOf(kermeta.language.structure.Object o, String type) {
		
		//In Kermeta, void is instance of all the types
		if( o==null ) {	
			return true;
		}
		
		String str_type = o.getClass().getName().replace("impl.", "");
		if(str_type.endsWith("Impl")) {
			str_type = str_type.replace("Impl", "");
		}
		
		if ( type.equals(str_type) ) {
			return true;
		} else {
			for( Type superTypes : allSuperTypes((ClassDefinition) getMetaClass(o).getTypeDefinition()) ) {
				if (superTypes instanceof Class && qualifiedNameDot(((Class) superTypes).getTypeDefinition()).equals(type) ) {
					return true;
				}
			}
		}
		return false;
	}
	
	static public java.lang.Boolean isInstanceOf(java.lang.Object o, String type) {
		
		//In Kermeta, void is instance of all the types
		if( o==null ) {
			return true;
		}
		
		String str_type = o.getClass().getName().replace("impl.", "");
		if(str_type.endsWith("Impl")) {
			str_type = str_type.replace("Impl", "");
		}

		if ( type.equals(str_type) ) {
			return true;
		} else {
			for( Type superTypes : allSuperTypes((ClassDefinition) getMetaClass(o).getTypeDefinition()) ) {			
				if (superTypes instanceof Class && qualifiedNameDot(((Class) superTypes).getTypeDefinition()).equals(type) ) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static java.lang.Boolean isInstanceOfSwitcher(java.lang.Object self, String type) {
		//In Kermeta, void is instance of all the types
		if( self==null ) {
			return true;
		}
		return isInstanceOf(self, type);
	}
	
	public static java.lang.Boolean isInstanceOf(kermeta.language.structure.Object o, Class metaClass) {
		//In Kermeta, void is instance of all the types
		if( o==null ) {	
			return true;
		}
		
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
	
	public static java.lang.Boolean isInstanceOf(kermeta.language.structure.Object o, Type metaClass) {
		//In Kermeta, void is instance of all the types
		if( o==null ) {	
			return true;
		}
		
		if (metaClass instanceof ParameterizedType) {
			return isInstanceOf(o, qualifiedNameDot(((ParameterizedType) metaClass).getTypeDefinition()));
		}
		if (metaClass instanceof kermeta.language.structure.PrimitiveType) {
			return isInstanceOf(o, qualifiedNameDot(((Class)((kermeta.language.structure.PrimitiveType) metaClass).getInstanceType()).getTypeDefinition()));
		}
		return false;
	}
	
	public static java.lang.Boolean isInstanceOf(java.lang.Object o, Type metaClass) {
		//In Kermeta, void is instance of all the types
		if( o==null ) {	
			return true;
		}
		
		if (metaClass instanceof ParameterizedType) {
			return isInstanceOf(o, qualifiedNameDot(((ParameterizedType) metaClass).getTypeDefinition()));
		}
		return false;
	}
	
	private static boolean isTypeOfPropertyMany(Type metaClass) {
		if( metaClass.eContainer()!=null && metaClass.eContainer() instanceof Property ) {
			return ((Property) metaClass.eContainer()).getUpper()==-1;
		}
		return false;
	}
	
	public static java.lang.Boolean isInstanceOfSwitcher(java.lang.Object self, Type metaClass) {
		
		//In Kermeta, void is instance of all the types
		if( self==null) {
			return true;
		}
		
		if( self instanceof kermeta.language.structure.Object) {
			kermeta.language.structure.Object self_object = (kermeta.language.structure.Object) self;
			
			java.lang.Boolean result = isInstanceOf(self_object, metaClass);
			
			//FIXME TODO This piece of code should be called at the begin of each isInstanceOf method
			// in fact the isInstanceOfSwitcher is not called every time when we do an isInstanceOf
			if( !result && isTypeOfPropertyMany(metaClass) && self_object instanceof kermeta.standard.Collection ) {
				
				//TODO Filter on the type of Collection: set, oset, bag or seq
				kermeta.standard.Collection<java.lang.Object> col = (kermeta.standard.Collection<java.lang.Object>) self_object;
				if( col.size()==0 ) {
					result = true;
				} else {
					//Recursive call to handle the case where the Parameterized  is typed by another Parameterized: Type0<Type1<TypeN>>
					result = isInstanceOfSwitcher(col.getValues().get(0), metaClass);
				}
			}
			
			return result;
		} else {
			return isInstanceOf((java.lang.Object) self, metaClass);
		}
	}
	
	public static void setSwitcher(java.lang.Object self, Property property, Object element) {
		if( self instanceof kermeta.language.structure.Object ) {
			(( kermeta.language.structure.Object) self).set(property, element);
		} else {
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		}
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
	
	private static String getFinalName(Property prop) {
		
		List<String> java_keyword = ExecutionContext.getJavaKeywords();
		
		String str = prop.getName();
		if(java_keyword.contains(str)) {
			return "_" + str;
		}
		return str;
	}
	
	private static EStructuralFeature retrieveFeature(kermeta.language.structure.Object o, Property p) {
		EStructuralFeature feature = null;
		
		String property_name = getFinalName(p);
		
		feature = o.eClass().getEStructuralFeature(property_name);
		if(feature==null) {
			for(EStructuralFeature tmp_feature : o.eClass().getEAllStructuralFeatures()) {
				if( tmp_feature.getName().equals(property_name) ) {
					feature = tmp_feature;
				}
			}
		}
		return feature;
	}
	
	private static kermeta.language.structure.EnumerationLiteral getEnumerationLiteral(Enumerator theValue) {
			
		kermeta.language.structure.EnumerationLiteral anEnumerationLiteral = kermeta.language.structure.StructureFactory.eINSTANCE.createEnumerationLiteral();
		anEnumerationLiteral.setName((java.lang.String) ((Enumerator) theValue).getName());
			
		// TODO
		//anEnumerationLiteral.setEnumeration(value);
			
		return anEnumerationLiteral;
	}
	
	public static kermeta.language.structure.Object get(kermeta.language.structure.Object o, Property p) {
		
		EStructuralFeature feature = retrieveFeature(o, p);
		
		if ( feature.isMany() ) {
			EList<java.lang.Object> value = new BasicEList<java.lang.Object>();
			
			if( feature instanceof org.eclipse.emf.ecore.EAttribute
					&& ((org.eclipse.emf.ecore.EAttribute) feature).getEAttributeType() instanceof org.eclipse.emf.ecore.EEnum) {
				EList<java.lang.Object> value_ = (EList<java.lang.Object>) o.eGet(feature);
				if( value_.size()>0 && value_.get(0) instanceof Enumerator ) {
					
					int index=0;
					for(java.lang.Object obj_enum : value_) {
						value.add(index, getEnumerationLiteral((Enumerator) obj_enum));
						index++;
					}
				}
			} else {
				value = (EList<java.lang.Object>) o.eGet(feature);
			}
			
			if ( feature.isOrdered() ) {
				if ( feature.isUnique() ) {
					return CollectionUtil.convertAsOrderedSet(value);
				} else {
					return CollectionUtil.convertAsSequence(value);
				}
			} else {
				if ( feature.isUnique() ) {
					return CollectionUtil.convertAsSet(value);
				} else {
					return CollectionUtil.convertAsBag(value);
				}
			}

		}
		
		java.lang.Object theValue = o.eGet(feature);
		
		if(feature instanceof org.eclipse.emf.ecore.EAttribute) {
			if( ((org.eclipse.emf.ecore.EAttribute) feature).getEAttributeType() instanceof org.eclipse.emf.ecore.EEnum) {
				if( theValue instanceof Enumerator ) {
					return getEnumerationLiteral((Enumerator) theValue);
				}
			}
		}
		
		if( theValue instanceof kermeta.language.structure.Object ) {
			return (kermeta.language.structure.Object) o.eGet(feature);
		} else {
			
			//Management of the DataType
			
			kermeta.language.structure.Object value_type = null;
			
			if( theValue!=null ) {
			
				String instanceClassName = feature.getEType().getInstanceClassName();
				
				
				if( instanceClassName.equals("java.lang.String") || instanceClassName.equals("String") ) {
					kermeta.standard.String _String = StandardFactory.eINSTANCE.createString();
					_String.setValue((java.lang.String) theValue);
					value_type = (kermeta.language.structure.Object) _String;
				} else {
					if( instanceClassName.equals("java.lang.Integer") || instanceClassName.equals("int") ) {
						kermeta.standard.Integer _Integer = StandardFactory.eINSTANCE.createInteger();
						_Integer.setValue(((java.lang.Integer) theValue).toString());
						value_type = (kermeta.language.structure.Object) _Integer;
					}else {
						if( instanceClassName.equals("java.lang.Boolean") || instanceClassName.equals("boolean") ) {
							kermeta.standard.Boolean _Boolean = StandardFactory.eINSTANCE.createBoolean();
							_Boolean.setValue(((java.lang.Boolean) theValue).toString());
							value_type = (kermeta.language.structure.Object) _Boolean;
						} else {
							if( instanceClassName.equals("java.lang.Character") || instanceClassName.equals("char") ) {
								kermeta.standard.Character _Character = StandardFactory.eINSTANCE.createCharacter();
								_Character.setValue(((java.lang.Character) theValue).toString());
								value_type = (kermeta.language.structure.Object) _Character;
							} else {
								if( instanceClassName.equals("java.lang.Double") || instanceClassName.equals("double") ) {
									kermeta.standard.Real _Real = StandardFactory.eINSTANCE.createReal();
									_Real.setValue(((java.lang.Double) theValue).toString());
									value_type = (kermeta.language.structure.Object) _Real;
								}
							}
						}
					}
				}
			}
			
			// Yes that's very ugly ! but that's the best known way for getting a value having for type a EDataType out of the kermeta::language::structure::Object tree subClasses
			// So if the value exists, but not a Type or ValueType known by Kermeta, we return a String representing the value
			if(value_type==null && o.eGet(feature)!=null) {
				kermeta.standard.String _String = StandardFactory.eINSTANCE.createString();
				_String.setValue((java.lang.String) o.eGet(feature).toString());
				value_type = (kermeta.language.structure.Object) _String;	
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
	
	public static void set(kermeta.language.structure.Object o, Property p, kermeta.language.structure.Object element) {
		EStructuralFeature feature = retrieveFeature(o, p);
		
		if( feature!=null && !feature.isDerived() && feature.isChangeable()) {
			
			if(element==null) {
				o.eSet(feature, element);
			} else {
		
				if(element instanceof kermeta.standard.String) {
					o.eSet(feature, ((kermeta.standard.String) element).getValue());
				} else if(element instanceof kermeta.standard.Boolean) {
					o.eSet(feature, new java.lang.Boolean(((kermeta.standard.Boolean) element).getValue()));
				} else if(element instanceof kermeta.standard.Character) {
					o.eSet(feature, new java.lang.Character(((kermeta.standard.Character) element).getValue().charAt(0)));
				} else if(element instanceof kermeta.standard.Integer) {
					o.eSet(feature, new java.lang.Integer(((kermeta.standard.Integer) element).getValue()));
				} else if(element instanceof kermeta.standard.Real) {
					o.eSet(feature, new java.lang.Double(((kermeta.standard.Character) element).getValue()));
				} else {
					
					if ( feature.isMany() ) {
						o.eSet(feature, CollectionUtil.convertAsEList((kermeta.standard.Collection)element));
					} else {
						o.eSet(feature, element);
					}
					
				}
			}
		}
	}
	
	static public void set(java.lang.Object o, Property p, java.lang.Object element) {
		EStructuralFeature feature = retrieveFeature((kermeta.language.structure.Object) o, p);
		((kermeta.language.structure.Object) o).eSet(feature, element);
	}
	
	static public void set(kermeta.language.structure.Object o, Property p, java.lang.Object element) {
		EStructuralFeature feature = retrieveFeature(o, p);
		o.eSet(feature, element);
	}
	
	static public void set(java.lang.Object o, Property p, kermeta.language.structure.Object element) {
		EStructuralFeature feature = retrieveFeature((kermeta.language.structure.Object) o, p);
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
	
	// CONVERT VALUE TYPES IN OBJECT
	public static kermeta.language.structure.Object convertAsObject(java.lang.String self) {
		
		if(self==null) {
			return null;
		}
		
		kermeta.standard.String _obj = StandardFactory.eINSTANCE.createString();
		_obj.setValue(self);
		return _obj;
	}
	
	public static kermeta.language.structure.Object convertAsObject(java.lang.Integer self) {
		
		if(self==null) {
			return null;
		}
		
		kermeta.standard.Integer _obj = StandardFactory.eINSTANCE.createInteger();
		_obj.setValue(self.toString());
		return _obj;
	}
	
	public static kermeta.language.structure.Object convertAsObject(java.lang.Boolean self) {
		
		if(self==null) {
			return null;
		}
		
		kermeta.standard.Boolean _obj = StandardFactory.eINSTANCE.createBoolean();
		_obj.setValue(self.toString());
		return _obj;
	}
	
	public static kermeta.language.structure.Object convertAsObject(java.lang.Character self) {
		
		if(self==null) {
			return null;
		}
		
		kermeta.standard.Character _obj = StandardFactory.eINSTANCE.createCharacter();
		_obj.setValue(self.toString());
		return _obj;
	}
	
	public static kermeta.language.structure.Object convertAsObject(java.lang.Double self) {
		
		if(self==null) {
			return null;
		}
		
		kermeta.standard.Real _obj = StandardFactory.eINSTANCE.createReal();
		_obj.setValue(self.toString());
		return _obj;
	}
	//end of CONVERT VALUE TYPES IN OBJECT
	
	public static Boolean equalsSwitcher(java.lang.Object object, java.lang.Object element) {
		
		/*** Equals optimization ***/
		if( object==element ) {
			return true;
		}
		/******/
		
		if( object instanceof kermeta.language.structure.Object && element instanceof kermeta.language.structure.Object) {
			
			//Equals dedicated to the ValueTypes
			if( object instanceof kermeta.standard.String && element instanceof kermeta.standard.String ) {
				return ((kermeta.standard.String) object).getValue().equals(((kermeta.standard.String) element).getValue());
			} else if( object instanceof kermeta.standard.Boolean && element instanceof kermeta.standard.Boolean ) {
				return ((kermeta.standard.Boolean) object).getValue().equals(((kermeta.standard.Boolean) element).getValue());
			} else if( object instanceof kermeta.standard.Integer && element instanceof kermeta.standard.Integer ) {
				return ((kermeta.standard.Integer) object).getValue().equals(((kermeta.standard.Integer) element).getValue());
			} else if( object instanceof kermeta.standard.Real && element instanceof kermeta.standard.Real ) {
				return ((kermeta.standard.Real) object).getValue().equals(((kermeta.standard.Real) element).getValue());
			} else if( object instanceof kermeta.standard.Character && element instanceof kermeta.standard.Character ) {
				return ((kermeta.standard.Character) object).getValue().equals(((kermeta.standard.Character) element).getValue());
			}
			
			return ((kermeta.language.structure.Object) object).equals((kermeta.language.structure.Object) element);
		} else {
			return equals(object, element);
		}
	}
	
	public static Boolean equals(kermeta.language.structure.Object object, kermeta.language.structure.Object element) {
			return object==element;
	}
	
	public static Boolean equals(java.lang.Object object, java.lang.Object element) {
		if( object == null || element == null ) {
			return object==element;
		} else {
			
			/*** Equals optimization ***/
			if( object==element ) {
				return true;
			}
			/******/
			
			if( object instanceof java.lang.String || object instanceof java.lang.Integer || object instanceof java.lang.Boolean || object instanceof java.lang.Character || object instanceof java.lang.Double ) {
				return object.equals(element);
			} else {
				return object==element;
			}
		}
	}
	
	public static Boolean equals(kermeta.language.structure.Object object, java.lang.Object element) {
		return object==element;
	}
	
	public static Boolean equals(java.lang.Object object, kermeta.language.structure.Object element) {
		return object==element;
	}
	
	public static Boolean isFrozen(kermeta.language.structure.Object self) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static Boolean isFrozen(java.lang.Object self) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
		return null;
	}
	
	public static void freeze(kermeta.language.structure.Object self) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
	}
	
	public static void freeze(java.lang.Object self) {
		if (true)
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
					((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
							.newObject("kermeta.exceptions.NotImplementedException")));
	}
	
	public static kermeta.persistence.Resource getContainingResource(kermeta.language.structure.Object self) {
		kermeta.persistence.Resource res = self.getInternalContainingResource();
		
		if(res!=null) {
			return res;
		} else {
			if(self.eContainer() != null && self.eContainer() instanceof kermeta.language.structure.Object) {
				res = getContainingResource(((kermeta.language.structure.Object) self.eContainer()));
				if(res!=null) {
					self.setInternalContainingResource(res);
					return res;
				} else {
					return getContainingResource(((kermeta.language.structure.Object) self.eContainer()));
				}
			} else {
				return null;
			}
		}
	}
	
	public static kermeta.persistence.Resource getContainingResource(java.lang.Object self) {
		return null;
	}
	
	public static kermeta.persistence.Resource containingResourceSwitcher(java.lang.Object self) {
		if (self instanceof kermeta.language.structure.Object) {
			return ((kermeta.language.structure.Object) self).containingResource();
		}
		return null;
	}
	
	public static void unSetContainingResource(java.lang.Object self) {
		if (self instanceof kermeta.language.structure.Object) {
			setContainingResource((kermeta.language.structure.Object) self, null);
		}
	}
	
	public static void setContainingResource(java.lang.Object self,
			kermeta.persistence.EMFResource resource) {
		if (self instanceof kermeta.language.structure.Object) {
			((kermeta.language.structure.Object) self).setInternalContainingResource(resource);
		}
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
	
	public static java.lang.String toStringSwitcher(java.lang.Object self) {
		if(self==null) {
			return "<void>";
		}
		return self.toString();
	}
	
	public static java.lang.String toString(kermeta.language.structure.Object self) {
		if( self==null ) {
			return "<void>";
		}
		return self.toString();
	}
	
	public static java.lang.String toString(java.lang.Object self) {
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
				if(self==null) {
					System.out.println("NULL !!!");
				}
				java.lang.Boolean check_result = (java.lang.Boolean) method.invoke(current_class, new Object[] {self});
				
				if( !check_result ) {
					results.add("The invariant " + method.getName().replace("checkInvariant_", "") + " on " + ObjectUtil.toString(self));
				}
			}
			
		} catch (ClassNotFoundException e) {
			return results;
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return results;

	}
	
	/**
	 * 
	 * @param self
	 */
	public static void checkInvariants(java.lang.Object self) {
		if( self instanceof kermeta.language.structure.Object) {
			checkInvariants((kermeta.language.structure.Object) self);
		} else {
			// checkInvariants on a DataType is not a right usage
			throw new org.kermeta.compil.runtime.helper.error.KRuntimeError(
				((kermeta.exceptions.NotImplementedException) org.kermeta.compil.runtime.helper.language.ClassUtil
						.newObject("kermeta.exceptions.NotImplementedException")));
		}
	}
	
	public static void checkAllInvariantsSwitcher(java.lang.Object self) {
		if(self instanceof kermeta.language.structure.Object) {
			((kermeta.language.structure.Object) self).checkAllInvariants();
		}
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
	
	public static Set<kermeta.language.structure.Object> getAllContainedObjects(kermeta.language.structure.Object self) {
		Set<kermeta.language.structure.Object> set_obj = StandardFactory.eINSTANCE.createSet();
		
		for(EObject eobj : ((kermeta.language.structure.Object) self).eContents()) {
			kermeta.language.structure.Object obj = (kermeta.language.structure.Object) eobj;
			set_obj.add(obj);
		}

		return set_obj;
	}
	
	/**
	 * @generated
	 */
	public static java.lang.Object asTypeOrVoid(java.lang.Object self,
			java.lang.String metaClass) {

		boolean result = false;
		
		if (ExecutionContext.getInstance().hashtable_java_classes.containsKey(metaClass)) {
			if( ExecutionContext.getInstance().hashtable_java_classes.get(metaClass).isInstance(self) ) {
				return self;
			} else {
				return null;
			}
		}
		
		String type = metaClass;
		
		//Optimization split-contains
		if( type.contains("<") ) {
			String[] type_ = type.split("<");
			if ( type_.length > 1) {
				type = type_[0];
			}
		}
		
		//Case of a Generic Type: G
		if( type.contains(".") ) {
		
			try {

				java.lang.Class<?> clazz = ExecutionContext.getInstance().getClassLoader().loadClass(type);
				ExecutionContext.getInstance().hashtable_java_classes.put(metaClass, clazz);
				result = clazz.isInstance(self);
				
			} catch (ClassNotFoundException e) {
				return self;
				//e.printStackTrace();
			}
		
		} else {
			return self;
		}
		
		if( result ) {
			return self;
		} else {
			return null;
		}

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
