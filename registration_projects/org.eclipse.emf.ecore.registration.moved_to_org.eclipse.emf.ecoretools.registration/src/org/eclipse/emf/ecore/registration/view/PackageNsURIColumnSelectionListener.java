

/*$Id: PackageNsURIColumnSelectionListener.java,v 1.1 2007-11-08 15:18:01 cfaucher Exp $
* Project : org.eclipse.emf.ecore.registration
* File : 	PackageNameColumnSelectionListener.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 nov. 07
* Authors : paco
*/

package org.eclipse.emf.ecore.registration.view;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class PackageNsURIColumnSelectionListener implements SelectionListener {

	private TreeViewer viewer = null;
	
	public PackageNsURIColumnSelectionListener(TreeViewer viewer) {
		this.viewer = viewer;
	}
	
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	public void widgetSelected(SelectionEvent e) {
		ViewerComparator newComparator = null;
		ViewerComparator comparator = viewer.getComparator();
		
		if ( comparator instanceof NsURIComparator ) {
			if ( ((NsURIComparator) comparator).getOrder() == RegisteredPackageComparator.ASCENDING_ORDER )
				newComparator = new NsURIComparator( RegisteredPackageComparator.DESCENDING_ORDER );
			else if ( ((NsURIComparator) comparator).getOrder() == RegisteredPackageComparator.DESCENDING_ORDER )
				newComparator = new NsURIComparator( RegisteredPackageComparator.ASCENDING_ORDER );
		} else
			newComparator = new NsURIComparator( RegisteredPackageComparator.ASCENDING_ORDER );
		
		if ( newComparator != null )
			viewer.setComparator( newComparator );
	}

}


