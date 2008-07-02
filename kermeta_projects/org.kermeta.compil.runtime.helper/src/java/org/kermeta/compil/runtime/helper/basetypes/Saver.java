package org.kermeta.compil.runtime.helper.basetypes;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Saver extends SaverOrLoader {
	
	static public EObject save(EObject o, String metamodelURI) {
		return new Saver().clone(o, metamodelURI);
	}
		
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

	
	private void cloneEObject(EObject sourceObject, EObject targetObject, EFactory factory) {
		for ( EStructuralFeature sourceFeature : sourceObject.eClass().getEAllStructuralFeatures() ) {
			Object value = sourceObject.eGet(sourceFeature);
			EStructuralFeature targetFeature = getEStructuralFeature(targetObject.eClass(), sourceFeature.getName());
			// The source feature can have been added by aspect in Kermeta.
			// So for a source feature, it may not have a target feature.
			if ( targetFeature != null ) {
				if ( value instanceof EObject ) {
					EObject sourceValue = (EObject) value;
					EObject targetValue = _instanceMapping.get(sourceValue);
					boolean clone = false;
					if ( targetValue == null ) {
						targetValue = createInstance(sourceValue, factory);
						clone = true;
					}
					try {
						targetObject.eSet(targetFeature, targetValue);
					} catch (ClassCastException e) {
						System.out.println();
						targetObject.eSet(targetFeature, targetValue);
					}
					if ( clone )
						cloneEObject( (EObject) value, targetValue, factory );
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
						}
					}
					//targetObject.eSet(targetFeature, value);
				} else if ( value != null ) {
					targetObject.eSet(targetFeature, value);
				}
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
			if ( feature.getName().equals(featureName) || feature.getName().replaceFirst("_", "").equals(featureName) )
				return feature;
		return null;
	}
	
	@Override
	protected EFactory getFactory(String metamodelURI) {
		// Getting the package with the given uri.
		EPackage p = EPackage.Registry.INSTANCE.getEPackage(metamodelURI);
		return p.getEFactoryInstance();
	}

}
