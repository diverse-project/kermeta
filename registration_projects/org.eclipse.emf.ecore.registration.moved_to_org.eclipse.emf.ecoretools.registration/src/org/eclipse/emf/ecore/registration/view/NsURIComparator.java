

/*$Id: NsURIComparator.java,v 1.1 2007-11-08 15:18:01 cfaucher Exp $
* Project : org.eclipse.emf.ecore.registration
* File : 	RegisteredPackagesComparator.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 nov. 07
* Authors : paco
*/

package org.eclipse.emf.ecore.registration.view;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.Viewer;

public class NsURIComparator extends RegisteredPackageComparator {
	
	
	public NsURIComparator(int order) {
		super(order);
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		EPackage p1 = (EPackage) e1;
		EPackage p2 = (EPackage) e2;
		
		switch ( getOrder() ) {
		case ASCENDING_ORDER :
			return super.compare(viewer, p1.getNsURI(), p2.getNsURI());
		case DESCENDING_ORDER :
			return super.compare(viewer, p2.getNsURI(), p1.getNsURI());
		default:
			return 0;
		}
	}
	
}


