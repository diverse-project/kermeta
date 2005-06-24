/* $Id: KermetaLabelProvider.java,v 1.1 2005-06-24 17:17:51 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : KermetaLabelProvider.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.internal.ui.DebugPluginImages;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * A specific label provider for Kermeta.
 */
public class KermetaLabelProvider extends LabelProvider {
    
    // TODO : store the images somewhere (like a class embedding an ImageRegistry)
    public static Image PROJECT = ImageDescriptor.createFromFile(KermetaLabelProvider.class, "/fr/irisa/triskell/kermeta/runner/icons/green/tree_package.gif").createImage();

    /**
     * 
     */
    public KermetaLabelProvider() {
        super();
    }
    
    

    /**
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    public Image getImage(Object element) {
        // TODO Should be chosen according to the kind of element
        return PROJECT;
    }
}





