

/*$Id: RegisteredPackageComparator.java,v 1.1 2007-11-08 15:18:01 cfaucher Exp $
* Project : org.eclipse.emf.ecore.registration
* File : 	RegisteredPackageComparator.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 nov. 07
* Authors : paco
*/

package org.eclipse.emf.ecore.registration.view;

import org.eclipse.jface.viewers.ViewerComparator;

public class RegisteredPackageComparator extends ViewerComparator {


	static public final int ASCENDING_ORDER = 0;
	
	static public final int DESCENDING_ORDER = 1;
	
	
	
	private int order;
	
	
	
	public RegisteredPackageComparator(int order) {
		this.order = order;
	}
	
	public int getOrder() {
		return order;
	}
	
}


