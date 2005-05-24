/* $Id: KermetaLaunchShortcut.java,v 1.1 2005-05-24 17:07:37 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaLaunchShortcut.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 23, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner;

import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 * 
 */
public class KermetaLaunchShortcut implements ILaunchShortcut {

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.jface.viewers.ISelection, java.lang.String)
     */
    public void launch(ISelection selection, String mode) {
        System.out.println("This is the launch shortcut");
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchShortcut#launch(org.eclipse.ui.IEditorPart, java.lang.String)
     */
    public void launch(IEditorPart editor, String mode) {
        // TODO Auto-generated method stub

    }

}
