

/*$Id: PackageNameColumnSelectionListener.java,v 1.1 2007-11-21 13:17:59 cfaucher Exp $
* Project : org.eclipse.emf.ecoretools.registration
* File : 	PackageNameColumnSelectionListener.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 nov. 07
* Authors : paco
*/

package org.eclipse.emf.ecoretools.registration.view;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class PackageNameColumnSelectionListener implements SelectionListener {

	private TreeViewer viewer = null;
	
	public PackageNameColumnSelectionListener(TreeViewer viewer) {
		this.viewer = viewer;
	}
	
	public void widgetSelected(SelectionEvent e) {
		ViewerComparator newComparator = null;
		ViewerComparator comparator = viewer.getComparator();
		
		if ( comparator instanceof PackageNameComparator ) {
			if ( ((PackageNameComparator) comparator).getOrder() == RegisteredPackageComparator.ASCENDING_ORDER )
				newComparator = new PackageNameComparator( RegisteredPackageComparator.DESCENDING_ORDER );
			else if ( ((PackageNameComparator) comparator).getOrder() == RegisteredPackageComparator.DESCENDING_ORDER )
				newComparator = new PackageNameComparator( RegisteredPackageComparator.ASCENDING_ORDER );
		} else
			newComparator = new PackageNameComparator( RegisteredPackageComparator.ASCENDING_ORDER );
		
		if ( newComparator != null )
			viewer.setComparator( newComparator );
	}

	public void widgetDefaultSelected(SelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

}


