
/*$Id: Loader.java,v 1.3 2008-07-08 07:25:32 ftanguy Exp $
* Project : org.kermeta.framework.compiled.runtime.helper
* File : 	Loader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : paco
*/
package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * 
 * @author paco
 *
 */
public class Loader extends SaverOrLoader {
	
	/**
	 * Load a model, clone it with the factory corresponding to the metamodel uri and return the list of cloned objects.
	 * @param modelURI The uri of the model to clone.
	 * @param metamodelURI The uri of the metamodel to use when cloning.
	 * @return The list of objects cloned.
	 */
	static public List<EObject> load(String modelURI, String metamodelURI) {
		Loader l = new Loader();
		List<EObject> instances = new ArrayList<EObject>();
		ResourceSet rs = new ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = rs.getResource( URI.createURI(modelURI), true );
		for ( EObject o : resource.getContents() )
			instances.add( l.clone(o, metamodelURI) );
		return instances;			
	}
	
	/**
	 * 
	 * @param o
	 * @param metamodelURI
	 * @return
	 */
	private EObject clone(EObject o, String metamodelURI) {
		EFactory factory = getFactory(metamodelURI);
		if ( factory != null ) {
			EObject sourceObject = (EObject) o;
			EObject targetObject = createInstance(sourceObject, factory);
			cloneEObject(sourceObject, targetObject, factory);
			return targetObject;
		}
		return null;
	}

	/**
	 * 
	 * @param sourceObject
	 * @param targetObject
	 * @param factory
	 */
	private void cloneEObject(EObject sourceObject, EObject targetObject, EFactory factory) {
		for ( EStructuralFeature sourceFeature : sourceObject.eClass().getEAllStructuralFeatures() ) {
			Object value = sourceObject.eGet(sourceFeature);
			EStructuralFeature targetFeature = getEStructuralFeature(targetObject.eClass(), sourceFeature.getName());
			
			/*
			 * 
			 * Simple EObject handling.
			 * 
			 */
			if ( value instanceof EObject ) {
				EObject sourceValue = (EObject) value;
				EObject targetValue = _instanceMapping.get(sourceValue);
				// Better set the feature before cloning the value to avoid possible recursive calls.
				boolean clone = false;
				if ( targetValue == null ) {
					targetValue = createInstance(sourceValue, factory);
					clone = true;
				}
				// Setting the value.
				targetObject.eSet(targetFeature, targetValue);
				if ( clone )
					// Cloning if necessary.
					cloneEObject( (EObject) value, targetValue, factory );
				
			/*
			 * 
			 * EList handling.
			 * 
			 */
			} else if ( value instanceof EList) {
				EList sourceList = (EList) sourceObject.eGet(sourceFeature);
				EList targetList = (EList) targetObject.eGet(targetFeature);
				for ( Object o : sourceList ) {
					if ( o instanceof EObject ) {
						EObject sourceListObject = (EObject) o;
						EObject targetListObject = _instanceMapping.get(sourceListObject);
						if ( targetListObject == null ) {
							targetListObject = createInstance(sourceListObject, factory);
							cloneEObject(sourceListObject, targetListObject, factory);
						}
						targetList.add(targetListObject);
					} else if ( o instanceof Enumerator ) {
						Object realValue = createInstance( (Enumerator) o, factory);
						targetList.add(realValue);
					} else {
						targetList.add(o);
					}
				}
				
			/*
			 * 
			 * Datatypes handling.
			 * 
			 */
			} else if ( value != null ) {
				Object realValue = value;
				// Special case for Enumerator. Need to create an instance from the good factory.
				if ( value instanceof Enumerator )
					realValue = createInstance( (Enumerator) value, factory);
				targetObject.eSet(targetFeature, realValue);
			}
		}
	}

	/**
	 * 
	 * @param clazz The class to be search one of its structural feature.
	 * @param featureName The name of the structural feature to look for.
	 * @return The structural feature which name matches the feature name argument or null if any.
	 */
	private EStructuralFeature getEStructuralFeature(EClass clazz, String featureName) {
		for ( EStructuralFeature feature : clazz.getEAllStructuralFeatures() )
			// Pay attention to special keywords that have been prefixed with the '_' character.
			if ( feature.getName().equals(featureName) || feature.getName().equals("_" + featureName) )
				return feature;
		return null;
	}
	
	@Override
	protected EFactory getFactory(String metamodelURI) {
		return PersistenceMapping.getEPackageForLoading(metamodelURI).getEFactoryInstance();
	}

}
