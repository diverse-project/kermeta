/* $Id: EMFRegistryHelper.java,v 1.10 2008-04-28 11:51:03 ftanguy Exp $
 * Project   : Kermeta 
 * File      : EMFRegistryHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 28 f�vr. 07
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.eclipse.emf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

/**
 * Helper that provides operations dealing with EMF Registry
 *
 */
public class EMFRegistryHelper {

	/**
	 * checks if this URI is in the registry
	 * @param uri
	 * @return
	 */
	public static boolean isRegistered(URI uri){
		return isRegistered(uri.toString());
	}
	
	/**
	 * checks if this URI is in the registry
	 * @param uri
	 * @return
	 */
	public static boolean isRegistered(String uri){
		Iterator<String> it = Registry.INSTANCE.keySet().iterator();
		while(it.hasNext()){
			String regentry = it.next();
			if(regentry.equals(uri.toString()) )
					return true;
		}
		return false;
	}
	
	/**
	 * checks if this URI is in the registry due to a Register action on an Ecore file
	 * ignores EPackage from generated java 
	 * @param uri
	 * @return
	 */
	public static boolean isDynamicallyRegistered(String uri){
		EPackage pack = Registry.INSTANCE.getEPackage(uri);
		if(pack == null) return false;
		if(pack.getClass() == EPackageImpl.class){ // if this is exactly an EPackage then this comes from a files, otherwise it comes from generated java
			return true;
		}
		else return false;
	}
	/**
	 * the list of registered children packages
	 * @param uri
	 * @return list of URI string of the valid children 
	 */
	public static Set<String> getRegisteredChildren(String uri) {
		HashSet<String> result = new HashSet<String>();
		
		EPackage p = Registry.INSTANCE.getEPackage( uri );
		Iterator<EPackage> subPackageIt = p.getESubpackages().iterator();
		while(subPackageIt.hasNext()){
			EPackage subPackage = subPackageIt.next();
			if(EMFRegistryHelper.isRegistered(subPackage.getNsURI())){
				result.add(subPackage.getNsURI());
			}
		}
		return result;
	}
	
	/**
	 * the list of all registered children packages,including granchildren
	 * @param uri
	 * @return list of URI string of the valid children 
	 */
	public static Set<String> getAllRegisteredChildren(String uri) {
		HashSet<String> result = new HashSet<String>();
		
		EPackage p = Registry.INSTANCE.getEPackage( uri );
		Iterator<EPackage> subPackageIt = p.getESubpackages().iterator();
		while(subPackageIt.hasNext()){
			EPackage subPackage = subPackageIt.next();
			if(EMFRegistryHelper.isRegistered(subPackage.getNsURI())){
				result.add(subPackage.getNsURI());
				// also add the granchildreen ...
				result.addAll(getAllRegisteredChildren(subPackage.getNsURI()));
			}
		}
		return result;
	}
	
	/**
	 * add in the registry only if it isn't already in the main registry
	 * @param registry : envetually used to add in a local ResourceSet registry or in the main registry via Registry.INSTANCE
	 * @param pack
	 */
	public static void safeRegisterPackages(Registry registry, EPackage pack) {
		if(pack.getNsURI() != null && !pack.getNsURI().equals("") && !Registry.INSTANCE.containsKey(pack.getNsURI()) && !registry.containsKey(pack.getNsURI())){
			// only if not already registered in main Registry
			registry.put(pack.getNsURI(), pack);
			
			EList<EPackage> l = pack.getESubpackages();
			
			if(l != null) {
				Iterator<EPackage> it = l.iterator();
				while(it.hasNext()) {
					safeRegisterPackages(registry, it.next());
				}
			}
		}
	}
	
	/**
	 * Load the file with the given uri, and register packages in the given registry.
	 * @param registry
	 * @param uri
	 */
	public static void safeRegister(Registry registry, URI uri) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(uri, true);
		for ( EObject o : resource.getContents() ) {
			if ( o instanceof EPackage )
				safeRegisterPackages(registry, (EPackage) o);
		}
	}
	
    /** print the content of the EMF Registry */
	public static String logEMFRegistryContent() {
		String msg = "";
		try {
				
			Boolean isFirst = true;
	    	Iterator<String> it = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().iterator();
	    	while(it.hasNext()) {
	    		if(!isFirst) msg += " | ";
	    		else isFirst = false;
	    		// weird sometime it crashes here with a null pointer !
	    		msg += it.next().toString();
	    	}
		}
	    catch(Exception e){
	    	
	    	e.printStackTrace();
	    }
    	return msg;
	}
	
	static public Resource getResource(URI uri) {
		EPackage p = EPackage.Registry.INSTANCE.getEPackage( uri.toString() );
		if ( p != null )
			return p.eResource();
		return null;
	}
}
