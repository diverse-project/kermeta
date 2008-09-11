
/*$Id: Loader.java,v 1.2 2008-09-11 12:34:56 cfaucher Exp $
* Project : org.kermeta.framework.compiled.runtime.helper
* File : 	Loader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : paco
*/
package org.kermeta.compil.runtime.helper.persistence;

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
	static public void load(List contents, String modelURI, String metamodelURI) {
		Loader l = new Loader(metamodelURI);
		List<EObject> instances = new ArrayList<EObject>();
		ResourceSet rs = new ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = rs.getResource( URI.createURI(modelURI), true );
		for ( EObject o : resource.getContents() )
			instances.add( l.clone(o) );
		contents.addAll(instances);	
	}
	
	/**
	 * 
	 * @param metamodelURI
	 */
	public Loader(String metamodelURI) {
		super(metamodelURI);
	}
	
	/**
	 * 
	 * @param o
	 * @param metamodelURI
	 * @return
	 */
	private EObject clone(EObject o) {
		EObject targetObject = createInstance(o);
		if ( o == targetObject )
			return o;
		cloneEObject(o, targetObject);
		return targetObject;
	}

	/**
	 * 
	 * @param sourceObject
	 * @param targetObject
	 */
	private void cloneEObject(EObject sourceObject, EObject targetObject) {
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
					targetValue = createInstance(sourceValue);
					clone = true;
				}
				// Setting the value.
				targetObject.eSet(targetFeature, targetValue);
				if ( clone )
					// Cloning if necessary.
					cloneEObject( (EObject) value, targetValue );
				
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
							targetListObject = createInstance(sourceListObject);
							cloneEObject(sourceListObject, targetListObject);
						}
						targetList.add(targetListObject);
					} else if ( o instanceof Enumerator ) {
						Object realValue = createInstance( (Enumerator) o);
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
					realValue = createInstance( (Enumerator) value);
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
