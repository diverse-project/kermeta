/*$Id: TreeContentProvider.java,v 1.2 2007-04-13 14:47:56 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.ui.provider;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.irisa.triskell.kermeta.ui.TreeItem;

public class TreeContentProvider implements ITreeContentProvider {

	public Object[] getChildren(Object parentElement) {
		return ((TreeItem) parentElement).getChildren().toArray();
	}

	public Object getParent(Object element) {
		return ((TreeItem) element).getParent();
	}

	public boolean hasChildren(Object element) {
		return ! ((TreeItem) element).getChildren().isEmpty();
	}

	public Object[] getElements(Object inputElement) {
		return (Object[]) inputElement;
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
