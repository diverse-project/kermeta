
/*$Id: SaverOrLoader.java,v 1.4 2008-10-08 14:38:05 cfaucher Exp $
* Project : org.kermeta.framework.compiled.runtime.helper
* File : 	SaverOrLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : paco
*/
package org.kermeta.compil.runtime.helper.persistence;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EDataType;
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
	
	/**		*/
	private String _metamodelURI;
	
	/**		*/
	private List<EFactory> _factories;
	
	/**
	 * 
	 */
	private void initialize() {
		_factories = getFactories( getFactory(_metamodelURI).getEPackage() );
	}
	
	/**
	 * 
	 * @param metamodelURI
	 */
	protected SaverOrLoader(String metamodelURI) {
		_metamodelURI = metamodelURI;
		initialize();
	}
	
	/**
	 * Create an instance which metaclass comes from the target metamodel. The metaclass is retrieved with the source metaclass and the 
	 * instantiation is done by the factory.
	 * @param sourceObject
	 * @param factory
	 * @return
	 */
	protected EObject createInstance(EObject sourceObject) {
		// Getting the name of the method to call.
		// In factory classes, it is always something like create* where * corresponds to the class name to be created.
		String creationMethodName = "create" + sourceObject.eClass().getName();
		for ( EFactory factory : _factories ) {
			// courtcircuit if possible.
			if ( sourceObject.eClass().getEPackage().getEFactoryInstance() == factory )
				return sourceObject;
			try {
				Method method = factory.getClass().getMethod(creationMethodName, new Class[] {});
				EObject targetObject = (EObject) method.invoke(factory, new Object[] {});
				// Make the mapping between the source object and the target one.
				_instanceMapping.put(sourceObject, targetObject);
				return targetObject;
			} catch (Exception e) {
			}
		}
		return null;
	}
	
	/**
	 * Get all factories used by the given package and its subpackages.
	 * @param p
	 * @return
	 */
	private List<EFactory> getFactories(EPackage p) {
		List<EPackage> l = new ArrayList<EPackage>();
		getEPackages(l, p);
		List<EFactory> factories = new ArrayList<EFactory>();
		for ( EPackage current : l )
			factories.add(current.getEFactoryInstance());
		return factories;
	}
	
	/**
	 * Getting the list of all packages contained by the given package.
	 * @param l
	 * @param p
	 */
	private void getEPackages(List<EPackage> l, EPackage p) {
		l.add(p);
		for ( EPackage current : p.getESubpackages() )
			getEPackages(l, current);
	}
	
	/**
	 * Create an enumerator from the factory given a source enumerator.
	 * @param sourceObject
	 * @param factory
	 * @return
	 */
	protected Enumerator createInstance(Enumerator sourceObject) {
		for ( EFactory factory : _factories ) {
			String creationMethodName = "create" + sourceObject.getClass().getSimpleName() + "FromString";
			try {
				Method method = factory.getClass().getMethod(creationMethodName, new Class[] {EDataType.class, String.class});
				Enumerator targetObject = (Enumerator) method.invoke(factory, new Object[] {null, sourceObject.getLiteral()});
				return targetObject;
			} catch (Exception e) {
			}
		}
		return null;
	}

}