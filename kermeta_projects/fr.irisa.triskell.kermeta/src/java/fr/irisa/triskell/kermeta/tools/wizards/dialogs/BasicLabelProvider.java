/* $Id: BasicLabelProvider.java,v 1.2 2006-03-07 22:06:29 barais Exp $
 * Project   : fr.irisa.triskell.kermeta (First iteration)
 * File      : EcoreFileLabelProvider.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 13, 2006
 * Authors       : zdrey
 */
/* $Id: BasicLabelProvider.java,v 1.2 2006-03-07 22:06:29 barais Exp $
 * Project   : Kermeta (First iteration)
 * File      : EcoreFileLabelProvider.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 13, 2006
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.tools.wizards.dialogs;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.KermetaConstants;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;

/**
 * @author zdrey
 *
 */
public class BasicLabelProvider implements ILabelProvider {
			
	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	public Image getImage(Object element) {
		Image result = null;
		if (element instanceof IFolder)
			result = KermetaPlugin.getKermetaIcons().get(KermetaConstants.FOLDER);
		else if (element instanceof IFile)
			result = KermetaPlugin.getKermetaIcons().get(KermetaConstants.FILE);
		else if (element instanceof IProject)
			result = KermetaPlugin.getKermetaIcons().get(KermetaConstants.PROJECT);
		return result;
	}

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		if (element instanceof IResource)
			return ((IResource)element).getName();
		return element.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

}
