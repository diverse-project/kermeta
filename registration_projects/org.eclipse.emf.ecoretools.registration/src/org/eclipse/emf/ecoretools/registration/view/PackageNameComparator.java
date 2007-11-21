

/*$Id: PackageNameComparator.java,v 1.1 2007-11-21 13:17:59 cfaucher Exp $
* Project : org.eclipse.emf.ecoretools.registration
* File : 	PackageNameComparator.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 nov. 07
* Authors : paco
*/

package org.eclipse.emf.ecoretools.registration.view;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.Viewer;

public class PackageNameComparator extends RegisteredPackageComparator {
	
	public PackageNameComparator(int order) {
		super(order);
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		EPackage p1 = (EPackage) e1;
		EPackage p2 = (EPackage) e2;
		
		switch ( getOrder() ) {
		case ASCENDING_ORDER :
			return super.compare(viewer, p1.getName(), p2.getName());
		case DESCENDING_ORDER :
			return super.compare(viewer, p2.getName(), p1.getName());
		default:
			return 0;
		}
	}
	
}


