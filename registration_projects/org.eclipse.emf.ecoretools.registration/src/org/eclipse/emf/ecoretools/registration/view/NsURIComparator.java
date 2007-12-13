

/*$Id: NsURIComparator.java,v 1.2 2007-12-13 15:23:10 dvojtise Exp $
* Project : org.eclipse.emf.ecoretools.registration
* File : 	NsURIComparator.java
* License : EPL
* Copyright : INRIA
* ----------------------------------------------------------------------------
* Creation date : 7 nov. 07
* Authors : Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.eclipse.emf.ecoretools.registration.view;

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


