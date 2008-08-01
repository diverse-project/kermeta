package org.kermeta.compil.runtime.helper.language;

import java.util.ArrayList;

import kermeta.language.structure.Class;
import kermeta.language.structure.Object;
import kermeta.language.structure.Property;
import kermeta.standard.Collection;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.kermeta.compil.runtime.helper.basetypes.BooleanUtil;
import org.kermeta.compil.runtime.helper.basetypes.CharacterUtil;
import org.kermeta.compil.runtime.helper.basetypes.IntegerUtil;
import org.kermeta.compil.runtime.helper.basetypes.RealUtil;
import org.kermeta.compil.runtime.helper.basetypes.StringUtil;

public class ObjectUtil {

	static public kermeta.language.structure.Object container(java.lang.Object o) {
		return ((kermeta.language.structure.Object)o ).getContainer();
	}
	
	static public kermeta.language.structure.Object container(kermeta.language.structure.Object o) {
		return o.getContainer();
	}
	
	static public java.lang.Boolean isInstanceOf(kermeta.language.structure.Object o, String type) {
		return type.contains(o.getClass().getName());
	}
	
	static public java.lang.Boolean isInstanceOf(java.lang.Object o, String type) {
		return type.contains(o.getClass().getName());
	}
	
	public static java.lang.Boolean isInstanceOf(kermeta.language.structure.Object element, Class metaClass) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static java.lang.Boolean isInstanceOf(java.lang.Object element, Class metaClass) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	static public kermeta.language.structure.Object get(kermeta.language.structure.Object o, Property p) {
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
			ArrayList l = new ArrayList();
			l.addAll( value );
			c.setValues( l );
			return c;

		}
		return (kermeta.language.structure.Object) o.eGet(feature);
	}
	
	/*static public kermeta.language.structure.Object get(java.lang.Object o, Property p) {
		return null;
	}*/
	
	static public kermeta.language.structure.Object get(java.lang.Boolean o, Property p) {
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.String o, Property p) {
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.Integer o, Property p) {
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.Character o, Property p) {
		return null;
	}
	
	static public kermeta.language.structure.Object get(java.lang.Double o, Property p) {
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
		return o.oid();
	}
	
	static public java.lang.Integer getOID(java.lang.Object o) {
		return ((kermeta.language.structure.Object) o).oid();
	}
	
	static public java.lang.Integer getHashcode(kermeta.language.structure.Object self, kermeta.language.structure.Object o) {
		return null;
	}
	
	static public java.lang.Integer getHashcode(java.lang.Object self, java.lang.Object o) {
		return null;
	}
	
	static public java.lang.Integer getHashcode(java.lang.Object self, kermeta.language.structure.Object o) {
		return null;
	}
	
	static public java.lang.Integer getHashcode(kermeta.language.structure.Object self, java.lang.Object o) {
		return null;
	}
	
	static public java.lang.Integer hashcode(kermeta.language.structure.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public java.lang.Integer hashcode(java.lang.Object o) {
		// return the java one.
		return ((kermeta.language.structure.Object) o).hashCode();
	}
	
	static public kermeta.language.structure.Class getMetaClass(java.lang.Object self) {
		
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
	
	
	
	///////////Unused for the moment
	static public kermeta.language.structure.Object convertFromJavaString(java.lang.String o) {
		return null;
	}
	
	static public kermeta.language.structure.Object convertFromJavaInteger(java.lang.Integer o) {
		return null;
	}
	
	static public kermeta.language.structure.Object convertFromJavaBoolean(java.lang.Boolean o) {
		return null;
	}
	///////////Unused for the moment
	
	public static Boolean equals(kermeta.language.structure.Object object, kermeta.language.structure.Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean equals(java.lang.Object object, java.lang.Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean equals(kermeta.language.structure.Object object, java.lang.Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean equals(java.lang.Object object, kermeta.language.structure.Object element) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean isFrozen(kermeta.language.structure.Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Boolean isFrozen(java.lang.Object objectImpl) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void checkInvariants(kermeta.language.structure.Object objectImpl) {
		// TODO Auto-generated method stub
		
	}
	
	public static void checkInvariants(java.lang.Object objectImpl) {
		// TODO Auto-generated method stub
		
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
	
	public static java.lang.Boolean isNotEqual(kermeta.language.structure.Object self, java.lang.Object o) {
		// TODO
		return null;
	}
	
	public static java.lang.Boolean isNotEqual(java.lang.Object self, java.lang.Object o) {
		// TODO
		return null;
	}
	
	public static java.lang.Boolean isVoid(kermeta.language.structure.Object self) {
		// TODO
		return null;
	}
	
	public static java.lang.Boolean isVoid(java.lang.Object self) {
		// TODO
		return null;
	}
	
	public static java.lang.String toString(kermeta.language.structure.Object self) {
		// TODO
		return null;
	}
	
	public static java.lang.String toString(java.lang.Object self) {
		// TODO
		return null;
	}
	
	public static java.lang.Object asType(java.lang.Object self, kermeta.language.structure.Class class_) {
		// TODO
		return null;
	}
	
	public static java.lang.Object asType(kermeta.language.structure.Object self, kermeta.language.structure.Class class_) {
		// TODO
		return null;
	}

	public static Integer oid(kermeta.language.structure.Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Integer oid(java.lang.Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void checkAllInvariants(kermeta.language.structure.Object object) {
		// TODO Auto-generated method stub
		
	}
	
	public static void checkAllInvariants(java.lang.Object object) {
		// TODO Auto-generated method stub
		
	}
	
	public static Boolean isKindOf(Class metaClass, Class metaClass2) {
		// TODO Auto-generated method stub
		return null;
	}

}
