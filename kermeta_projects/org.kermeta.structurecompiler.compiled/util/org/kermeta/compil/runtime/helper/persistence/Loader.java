
/*$Id: Loader.java,v 1.15 2009-02-11 16:51:00 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	Loader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : 
* 			Francois TANGUY	<ftanguy@irisa.fr>
* 			Cyril FAUCHER	<cfaucher@irisa.fr>
*/
package org.kermeta.compil.runtime.helper.persistence;

import java.util.List;

import kermeta.persistence.EMFResource;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @generated
 */
public class Loader extends SaverOrLoader {
	
	/**
	 * Load a model, clone it with the factory corresponding to the metamodel uri and return the list of cloned objects.
	 * @param modelURI The uri of the model to clone.
	 * @param metamodelURI The uri of the metamodel to use when cloning.
	 * @return The list of objects cloned.
	 * @generated
	 */
	static public void load(kermeta.persistence.Resource kermetaResource, String modelURI, String metamodelURI) {
		
		List contents = kermetaResource.getValues();
		
		Loader l = new Loader(metamodelURI);
		l.normalizeRegistry(modelURI, metamodelURI);
		//List<EObject> instances = new ArrayList<EObject>();
		
		ResourceSet rs = new ResourceSetImpl();
		
		org.eclipse.emf.ecore.resource.Resource resource = rs.getResource( URI.createURI(modelURI), true );
		
		/*** Maybe this source code could be used to improve performance
		 * the first tries on the compiler itself are not concluant,
		 * but maybe for other usages the gain will be better
		 * please see at: http://www.eclipse.org/modeling/emf/docs/performance/EMFPerformanceTips.html
		org.eclipse.emf.ecore.resource.Resource resource = rs.createResource( URI.createURI(modelURI));
		java.util.Map<java.lang.String, java.lang.String> map_options = new java.util.HashMap<java.lang.String, java.lang.String>();
		
		map_options.put("OPTION_USE_PARSER_POOL", "org.eclipse.emf.ecore.xmi.XMLParserPool");
		map_options.put("OPTION_USE_XML_NAME_TO_FEATURE_MAP", "java.util.Map");
		
		try {
			resource.load(map_options);
		} catch (IOException e) {
			e.printStackTrace();
		}******/
		
		if( metamodelURI.equals("") ) {
			metamodelURI = resource.getContents().get(0).eClass().getEPackage().getNsURI();
			l = new Loader(metamodelURI);
			l.normalizeRegistry(modelURI, metamodelURI);
		}
		
		for ( EObject o : resource.getContents() ) {
			contents.add( l.clone(o) );
		}
		//contents.addAll(instances);
		
		//Set the containing resource info, for the root elements
		for(java.lang.Object a_root_object : contents) {
			if(a_root_object instanceof kermeta.language.structure.Object) {
				org.kermeta.compil.runtime.helper.language.ObjectUtil.setContainingResource((kermeta.language.structure.Object) a_root_object, (EMFResource) kermetaResource);
			}
		}
	}
	
	/**
	 * @generated
	 * @param metamodelURI
	 */
	public Loader(String metamodelURI) {
		super(metamodelURI);
	}
	
	/**
	 * @generated
	 * @param o
	 * @param metamodelURI
	 * @return
	 */
	private EObject clone(EObject o) {
		EObject targetObject = createInstance(o, this.getMetamodelURISpecialCompiler());
		if ( o == targetObject ) {
			return o;
		}
		
		cloneEObject(o, targetObject);
		return targetObject;
	}

	/**
	 * @generated
	 * @param sourceObject
	 * @param targetObject
	 */
	private void cloneEObject(EObject sourceObject, EObject targetObject) {
		for ( EStructuralFeature sourceFeature : sourceObject.eClass().getEAllStructuralFeatures() ) {
			Object value = sourceObject.eGet(sourceFeature);
			
			EStructuralFeature targetFeature = getEStructuralFeature(targetObject.eClass(), sourceFeature.getName());
			
			/*
			 * Simple EObject handling.
			 */
			if ( value instanceof EObject ) {
				if( value instanceof EEnumLiteral ) {
					
					EEnumLiteral sourceValue = (EEnumLiteral) value;
					
					java.lang.Object targetValue = null;
					if( _instanceMapping.get(sourceValue) instanceof EEnumLiteral ) {
						targetValue = (EEnumLiteral) _instanceMapping.get(sourceValue);
					}
					if( _instanceMapping.get(sourceValue) instanceof Enumerator ) {
						targetValue = (Enumerator) _instanceMapping.get(sourceValue);
					}
					
					// Better set the feature before cloning the value to avoid possible recursive calls.

					if ( targetValue == null ) {
						targetValue = createInstance(sourceValue, this.getMetamodelURISpecialCompiler());
					}
					
					// Setting the value.
					//The values of derived property are not cloned
					if( !sourceFeature.isDerived() && sourceFeature.isChangeable() ) {
						targetObject.eSet(targetFeature, targetValue);
					}
				} else {
					EObject sourceValue = (EObject) value;
					EObject targetValue = _instanceMapping.get(sourceValue);
					// Better set the feature before cloning the value to avoid possible recursive calls.
					boolean clone = false;
					if ( targetValue == null ) {
						targetValue = createInstance(sourceValue, this.getMetamodelURISpecialCompiler());
						clone = true;
					}
					
					// Setting the value.
					//The values of derived property are not cloned
					if( !sourceFeature.isDerived() && sourceFeature.isChangeable() ) {
						targetObject.eSet(targetFeature, targetValue);
					}
					if ( clone ) {
						// Cloning if necessary.
						cloneEObject( (EObject) value, targetValue);
					}
				}
				
			/*
			 * EList handling.
			 */
			} else if ( value instanceof EList) {
					
				if( !sourceFeature.isDerived() && sourceFeature.isChangeable() ) {
					EList sourceList = (EList) sourceObject.eGet(sourceFeature);
					EList targetList = (EList) targetObject.eGet(targetFeature);
					for ( Object o : sourceList ) {
						if ( o instanceof EObject ) {
							EObject sourceListObject = (EObject) o;
							EObject targetListObject = _instanceMapping.get(sourceListObject);
							if ( targetListObject == null ) {
								targetListObject = createInstance(sourceListObject, this.getMetamodelURISpecialCompiler());
								cloneEObject(sourceListObject, targetListObject);
							}
							
							if( targetList!=null ) {
								if( !targetFeature.isUnique() && targetList instanceof BasicEList ) {
									((BasicEList) targetList).addUnique(targetListObject);
								} else {
									targetList.add(targetListObject);
								}
							}
							
						} else if ( o instanceof Enumerator ) {
							Object realValue = createInstance( (Enumerator) o, this.getMetamodelURISpecialCompiler());
							
							if( !targetFeature.isUnique() && targetList instanceof BasicEList ) {
								((BasicEList) targetList).addUnique(realValue);
							} else {
								targetList.add(realValue);
							}
							
						} else {
							
							if( !targetFeature.isUnique() && targetList instanceof BasicEList ) {
								((BasicEList) targetList).addUnique(o);
							} else {
								targetList.add(o);
							}
							
						}
					}
				}
					
			/*
			 * Datatypes handling.
			 */
			} else if ( value != null ) {
				Object realValue = value;
				// Special case for Enumerator. Need to create an instance from the good factory.
				if ( value instanceof Enumerator ) {
					realValue = createInstance( (Enumerator) value, this.getMetamodelURISpecialCompiler());
				} else if ( sourceObject instanceof EEnumLiteral ) {
					if(value instanceof EEnumLiteral) {
						realValue = createInstance( (EEnumLiteral) value, this.getMetamodelURISpecialCompiler());
					} else {
						realValue = value;
					}
				}
					
				if( !sourceFeature.isDerived() && sourceFeature.isChangeable() ) {
					targetObject.eSet(targetFeature, realValue);
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
			// FIXME TODO We need use the dictionnary of Java Keywords CF: Holala Paco, this patch should be handled in another way...
			if ( feature.getName().equals(featureName) || feature.getName().equals("_" + featureName) )
				return feature;
		return null;
	}
	
	/**
	 * @generated
	 */
	@Override
	protected EFactory getFactory(String metamodelURI) {
		//return PersistenceMapping.getEPackageForLoading(metamodelURI).getEFactoryInstance();
		return null;
	}

}
