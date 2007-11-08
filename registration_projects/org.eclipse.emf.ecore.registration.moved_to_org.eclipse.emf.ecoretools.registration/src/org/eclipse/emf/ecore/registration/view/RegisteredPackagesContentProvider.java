

/*$Id: RegisteredPackagesContentProvider.java,v 1.1 2007-11-08 15:18:01 cfaucher Exp $
* Project : org.eclipse.emf.ecore.registration
* File : 	RegisteredPackagesContentProvider.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 nov. 07
* Authors : paco
*/

package org.eclipse.emf.ecore.registration.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.registration.EMFRegistryHelper;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class RegisteredPackagesContentProvider implements ITreeContentProvider {

	public void inputChanged( Viewer v, Object oldInput, Object newInput) {
		
	}

	public void dispose() {
	}

	/**
	 * returns the list of children of this element
	 */
	public Object[] getChildren(Object arg0) {
		EPackage p = (EPackage) arg0;
		Set<String> uris = EMFRegistryHelper.getRegisteredChildren( p.getNsURI() );			
		List<EPackage> children = new ArrayList<EPackage>();
		for ( String s : uris ) {
			Object o = Registry.INSTANCE.get( s );
			if ( o instanceof EPackage )
				children.add( (EPackage) o );
		}
		return children.toArray();
	}
	
	
	/**
	 * tells if the given element has children 
	 */
	public boolean hasChildren(Object arg0) {
		EPackage p = (EPackage) arg0;
		// a good guess about if we have children or not is if we have subpackages
		// a better evaluation should get only valid children , ie. registered children as in getChildren method
		return ! p.getESubpackages().isEmpty();
	}
	public Object getParent(Object arg0) {
		EPackage result = null;
		EPackage p = (EPackage) arg0;
		if ( p.eContainer() != null ) {
			String nsURI = ((EPackage)p.eContainer()).getNsURI();
			if(EMFRegistryHelper.isRegistered(nsURI)){
				result = (EPackage) p.eContainer();
			}
		}
		return result;
	}
	/**
	 * element for the Table from the registered instances
	 */
	public Object[] getElements(Object parent) {			
		ArrayList<EPackage> table = new ArrayList<EPackage>(); 
		for ( String uri : Registry.INSTANCE.keySet() ) {
			Object obj = Registry.INSTANCE.get( uri );
			if(obj instanceof EPackage) {
				//EPackage p = (EPackage) obj;	
				// add only root packages
				if( getParent( obj )== null )
					table.add( (EPackage) obj );
			}
		}
		return table.toArray();
	}

}


