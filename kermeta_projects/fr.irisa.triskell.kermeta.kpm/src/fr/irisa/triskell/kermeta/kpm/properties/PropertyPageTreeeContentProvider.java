/*$Id: PropertyPageTreeeContentProvider.java,v 1.1 2007-04-24 12:39:39 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.properties;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class PropertyPageTreeeContentProvider implements ITreeContentProvider {

	public Object[] getChildren(Object parentElement) {
		if ( parentElement instanceof IContainer )
			try {
				IResource[] resources = ((IContainer) parentElement).members();
				ArrayList<IResource> containers = new ArrayList<IResource> ();
				for (int i=0; i<resources.length; i++)
					containers.add( resources[i] );
				return containers.toArray();
			} catch (CoreException e) {
				return new Object[0];
			}
		return new Object[0];
	}

	public Object getParent(Object element) {
		return ((IResource) element).getParent();
	}

	public boolean hasChildren(Object element) {
		if ( element instanceof IContainer )
			try {
				return ((IContainer) element).members().length != 0;
			} catch (CoreException e) {
				return false;
			}
		return false;
	}

	public Object[] getElements(Object inputElement) {
		return (Object[]) inputElement;
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

}
