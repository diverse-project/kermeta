package org.kermeta.compil.runtime.helper.basetypes;

import java.lang.reflect.Field;
import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Loader extends SaverOrLoader {
	
	static public EObject load(EObject o, String metamodelURI) {
		return new Loader().clone(o, metamodelURI);
	}
	
	public Loader() {
		super();
		initialize();
	}
	
	/**
	 * A table mapping factories coming from plugins and factories coming from code generated from Kermeta.
	 */
	protected Hashtable<String, String> _typeMapping = new Hashtable<String, String>();
	
	/**
	 * Static code initializing the mapping table.
	 * Because at runtime we are going to get the class implementation, the mapping is from the implementation to the interface.
	 */
	private void initialize() {
		_typeMapping.put("fr.irisa.triskell.kermeta.samples.fsm.impl.FsmFactoryImpl", "fsm.FsmFactory");
		_typeMapping.put("org.eclipse.emf.ecore.impl.EcoreFactoryImpl", "ecore.EcoreFactory");
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
			if ( value instanceof EObject ) {
				EObject sourceValue = (EObject) value;
				EObject targetValue = _instanceMapping.get(sourceValue);
				boolean clone = false;
				if ( targetValue == null ) {
					targetValue = createInstance(sourceValue, factory);
					clone = true;
				}
				targetObject.eSet(targetFeature, targetValue);
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
		// Getting the package with the given uri.
		EPackage p = EPackage.Registry.INSTANCE.getEPackage(metamodelURI);
		// Getting the factory for that package.
		EFactory oldFactory = p.getEFactoryInstance();
		// Get the qualified name in the java sense, must give the implementation class.
		String qualifiedName = oldFactory.getClass().getCanonicalName();
		// Look in the mapping table for the factory name to use.
		String interfaceName = _typeMapping.get(qualifiedName);
		try {
			// Load the interface and get the unique instance calling eINSTANCE attribute.
			// If any exception is raised returns null.
			Class<?> interfaz = Thread.currentThread().getContextClassLoader().loadClass(interfaceName);
			Field field = interfaz.getField("eINSTANCE");
			EFactory newFactory = (EFactory) field.get(interfaz);
			return newFactory;
		} catch (Exception e) {
			return null;
		}
	}

}
