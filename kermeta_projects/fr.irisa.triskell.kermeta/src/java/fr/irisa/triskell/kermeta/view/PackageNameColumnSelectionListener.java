

/*$Id: PackageNameColumnSelectionListener.java,v 1.1 2007-11-08 13:16:17 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta
* File : 	PackageNameColumnSelectionListener.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 nov. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.view;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class PackageNameColumnSelectionListener implements SelectionListener {

	private TreeViewer viewer = null;
	
	public PackageNameColumnSelectionListener(TreeViewer viewer) {
		this.viewer = viewer;
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
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

}


