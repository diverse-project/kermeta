/* Id: OutlineLabelProvider.java,v 2.0.1 Apr 17, 2012 12:46:06 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : OutlineLabelProvider.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 17, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.kermeta.language.texteditor.eclipse.internal.Activator;


public class OutlineLabelProvider implements ILabelProvider{

	@Override
	public void addListener(ILabelProviderListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage(Object o) {
		Image image = null;
		if (o instanceof OutlineItem) {
			//URL url = Activator.getDefault().getBundle().getEntry("icons/package_blue_red.gif");
			//if ( url != null )
			//	image = ImageDescriptor.createFromURL(url).createImage();
			return ((OutlineItem)o).getImage();
		}
		return image;
	}

	@Override
	public String getText(Object o) {
		if (o instanceof OutlineItem) {
			return ((OutlineItem)o).getLabel();
		}
		return null;
	}

}
