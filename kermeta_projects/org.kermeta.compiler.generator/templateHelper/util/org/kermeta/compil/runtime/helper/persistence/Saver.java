
/*$Id: Saver.java,v 1.7 2008-10-17 14:40:18 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	Saver.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : 
* 			Francois TANGUY	<ftanguy@irisa.fr>
* 			Cyril FAUCHER	<cfaucher@irisa.fr>
*/
package org.kermeta.compil.runtime.helper.persistence;


import java.io.IOException;
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
 * @generated
 *
 */
public class Saver extends SaverOrLoader {
	
	/**
	 * @generated
	 * This static method is the api offered to clients that may want to use saving functionality.
	 * @param contents The list of objects to clone.
	 * @param modelURI The uri of the model to save.
	 * @param metamodelURI The uri of the metamodel to use when cloning objects.
	 * @throws IOException
	 */
	static public void save(List contents, String modelURI, String metamodelURI) {
		
		try {
			Saver s = new Saver(metamodelURI);
			s.normalizeRegistry(modelURI, metamodelURI);
			List<EObject> instancesToSave = new ArrayList<EObject>();
			for ( Object o : contents ) {
				if ( o instanceof EObject ) {
					instancesToSave.add(s.clone((EObject) o));
				}
			}
			
			ResourceSet resourceSet = new ResourceSetImpl();
			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource( URI.createURI(modelURI) );
			resource.getContents().addAll(instancesToSave);
			resource.save(null);
		} catch (IOException e) {		
		}
	}
		
	/**
	 * @generated
	 * @param metamodelURI
	 */
	public Saver(String metamodelURI) {
		super(metamodelURI);
	}
	
	/**
	 * @generated
	 * @param o The object to clone.
	 * @return The cloned object or null if no factory found.
	 */
	private EObject clone(EObject o) {
		EObject targetObject = createInstance(o, this.getMetamodelURI());
		if ( o == targetObject )
			return o;
		cloneEObject(o, targetObject);
		return targetObject;
	}

	/**
	 * @generated
	 * @param sourceObject
	 * @param factory
	 */
	private void cloneEObject(EObject sourceObject, EObject targetObject) {
		for ( EStructuralFeature sourceFeature : sourceObject.eClass().getEAllStructuralFeatures() ) {
			
				Object value = sourceObject.eGet(sourceFeature);
				EStructuralFeature targetFeature = getEStructuralFeature(targetObject.eClass(), sourceFeature.getName());
				// The source feature can have been added by aspect in Kermeta.
				// So a source feature may not have a target feature.
				if ( targetFeature != null ) {
					
					/*
					 * 
					 * Simple EObject handling.
					 * 
					 */
					if ( !sourceFeature.isDerived() && targetFeature.isChangeable() /*&& !sourceFeature.isUnsettable()*/ && value instanceof EObject ) {
						EObject sourceValue = (EObject) value;
						EObject targetValue = _instanceMapping.get(sourceValue);
						// Better set the feature before cloning the value to avoid possible recursive calls.
						
						boolean clone = false;
						if ( targetValue == null ) {
							targetValue = createInstance(sourceValue, this.getMetamodelURI());
							clone = true;
						}
						
						// Setting the value.
						targetObject.eSet(targetFeature, targetValue);
						
						if ( clone )
							// Cloning if necessary.
							cloneEObject( (EObject) value, targetValue);
						
					/*
					 * 
					 * EList handling.
					 * 	
					 */
					} else if ( value instanceof EList) {
						EList sourceList = (EList) sourceObject.eGet(sourceFeature);
						EList targetList = (EList) targetObject.eGet(targetFeature);
						for ( Object o : sourceList ) {
							// List can contain EObject or Datatypes.
							if ( o instanceof EObject ) {
								EObject sourceListObject = (EObject) o;
								EObject targetListObject = _instanceMapping.get(sourceListObject);
								if ( targetListObject == null ) {
									targetListObject = createInstance(sourceListObject, this.getMetamodelURI());
									cloneEObject(sourceListObject, targetListObject);
								}
								targetList.add(targetListObject);
							// Special case for enumerator.
							} else if ( o instanceof Enumerator ) {
								Object realValue = createInstance( (Enumerator) o, this.getMetamodelURI());
								targetList.add(realValue);	
							// Default case for String, Integer...
							} else {
								targetList.add(o);
							}
						}
						
					/*
					 * 
					 * Simple objects handling (integer, string, enumliteral... Datatypes in fact).
					 * 	
					 */
					} else if ( value != null ) {
						Object realValue = value;
						// Special case for enumerator. Need to create an instance from the good factory.
						if ( value instanceof Enumerator )
							realValue = createInstance( (Enumerator) value, this.getMetamodelURI());
						// Setting the value.
						if( !sourceFeature.isDerived() && targetFeature.isChangeable() /*&& !targetFeature.isUnsettable()*/ ) {
							targetObject.eSet(targetFeature, realValue);
						}
					}
				}
		}
	}
	
	/**
	 * @generated
	 * @param clazz The class to be search one of its structural feature.
	 * @param featureName The name of the structural feature to look for.
	 * @return The structural feature which name matches the feature name argument or null if any.
	 */
	private EStructuralFeature getEStructuralFeature(EClass clazz, String featureName) {
		for ( EStructuralFeature feature : clazz.getEAllStructuralFeatures() )
			// Pay attention to special keywords that have been prefixed with the '_' character.
			if ( feature.getName().equals(featureName) || feature.getName().replaceFirst("_", "").equals(featureName) )
				return feature;
		return null;
	}
	
	/**
	 * @generated
	 * @param metamodelURI
	 * @return
	 */
	@Override
	protected EFactory getFactory(String metamodelURI) {
		//return PersistenceMapping.getEPackageForSaving(metamodelURI).getEFactoryInstance();
		return null;
	}

}
