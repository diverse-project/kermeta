/*$Id: PropertyPageLabelProvider.java,v 1.1 2007-04-24 12:39:39 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.properties;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class PropertyPageLabelProvider implements ILabelProvider {

	public Image getImage(Object element) {
		return null;
	}

	public String getText(Object element) {
		return ((IResource) element).getName();
	}

	public void addListener(ILabelProviderListener listener) {}

	public void dispose() {}

	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	public void removeListener(ILabelProviderListener listener) {}

}
