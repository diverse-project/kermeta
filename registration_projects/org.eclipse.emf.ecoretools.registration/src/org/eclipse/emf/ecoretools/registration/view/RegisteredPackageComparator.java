/*$Id: RegisteredPackageComparator.java,v 1.2 2007-12-13 15:23:10 dvojtise Exp $
* Project : org.eclipse.emf.ecoretools.registration
* File : 	RegisteredPackageComparator.java
* License : EPL
* Copyright : INRIA
* ----------------------------------------------------------------------------
* Creation date : 8 nov. 07
* Authors : 
* 			Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.eclipse.emf.ecoretools.registration.view;

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


