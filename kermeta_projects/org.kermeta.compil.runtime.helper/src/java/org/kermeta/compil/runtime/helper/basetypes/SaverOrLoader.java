package org.kermeta.compil.runtime.helper.basetypes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

abstract public class SaverOrLoader {

	/**
	 * A table to map each source object to their corresponding target object.
	 * Note that the mapping is one to one.
	 */
	protected Hashtable<EObject, EObject> _instanceMapping = new Hashtable<EObject, EObject>();

	/**
	 * Get the factory to use to create target objects conforming to the generated metamodel.
	 * To do that, the factory used to create instances coming from the package with the given uri is retrieved.
	 * With that Factory, look for a mapping and get the corresponding factory.
	 * @param metamodelURI The uri of the package
	 * @return The factory if the there is a mapping or null if any.
	 */
	abstract protected EFactory getFactory(String metamodelURI);
	
	/**
	 * 
	 * @param sourceObject
	 * @param factory
	 * @return
	 */
	protected EObject createInstance(EObject sourceObject, EFactory factory) {
		// Getting the name of the method to call.
		// In factory classes, it is always something like create* where * corresponds to the class name to be created.
		String creationMethodName = "create" + sourceObject.eClass().getName();
		try {
			Method method = factory.getClass().getMethod(creationMethodName, new Class[] {});
			EObject targetObject = (EObject) method.invoke(factory, new Object[] {});
			// Make the mapping between the source object and the target one.
			_instanceMapping.put(sourceObject, targetObject);
			return targetObject;
		} catch (Exception e) {
			return null;
		}
	}

}