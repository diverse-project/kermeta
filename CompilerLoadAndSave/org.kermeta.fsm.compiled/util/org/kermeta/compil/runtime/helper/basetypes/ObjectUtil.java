package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.language.structure.Object;
import kermeta.language.structure.Property;
import kermeta.standard.Collection;
import kermeta.standard.StandardFactory;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ObjectUtil {

	static public Object container(Object o) {
		return o.getContainer();
	}
	
	static public Object get(Object o, Property p) {
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
			c.setValues( value );
			return c;

		}
		return (Object) o.eGet(feature);
	}
	
	static public void set(Object o, Property p, Object element) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		o.eSet(feature, element);
	}
	
	static public boolean isSet(Object o, Property p) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		return o.eIsSet(feature);
	}
	
	static public void unset(Object o, Property p) {
		EStructuralFeature feature = o.eClass().getEStructuralFeature( p.getName() );
		o.eUnset(feature);
	}
	
	static public int getOID(Object o) {
		return o.getOid();
	}
	
	static public int hashcode(Object o) {
		// return the java one.
		return o.hashCode();
	}
}
