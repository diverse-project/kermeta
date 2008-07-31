package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;

import kermeta.language.structure.Object;
import kermeta.language.structure.Property;
import kermeta.standard.Collection;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ObjectUtil {

	static public kermeta.language.structure.Object container(kermeta.language.structure.Object o) {
		return o.getContainer();
	}
	
	static public java.lang.Boolean isInstanceOf(kermeta.language.structure.Object o, String type) {
		return type.contains(o.getClass().getName());
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
	
	static public void set(kermeta.language.structure.Object o, Property p, kermeta.language.structure.Object element) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		o.eSet(feature, element);
	}
	
	static public java.lang.Boolean isSet(kermeta.language.structure.Object o, Property p) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		return o.eIsSet(feature);
	}
	
	static public void unset(kermeta.language.structure.Object o, Property p) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		o.eUnset(feature);
	}
	
	static public java.lang.Integer getOID(kermeta.language.structure.Object o) {
		return o.oid();
	}
	
	static public java.lang.Integer hashcode(kermeta.language.structure.Object o) {
		// return the java one.
		return o.hashCode();
	}
	
	static public kermeta.language.structure.Object convertFromJavaString(java.lang.String o) {
		return null;
	}
	
	static public kermeta.language.structure.Object convertFromJavaInteger(java.lang.Integer o) {
		return null;
	}
	
	static public kermeta.language.structure.Object convertFromJavaBoolean(java.lang.Boolean o) {
		return null;
	}
}
