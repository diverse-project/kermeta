/* $Id: ButtonIcons.java,v 1.3 2007-06-27 13:01:13 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : ButtonIcons.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons;

import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author Franck Fleurey
 */
public class ButtonIcons {

    public static ImageDescriptor SORT = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/tree_sort.gif");
    public static ImageDescriptor PACKAGE_TREE = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/tree_package.gif");
    
    public static ImageDescriptor INHERITANCE_FLAT = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/inheritance_flat.gif");
    public static ImageDescriptor SHOW_IMPORTED = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_red.gif");

}
