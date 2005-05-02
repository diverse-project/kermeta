/* $Id: ButtonIcons.java,v 1.2 2005-05-02 23:57:43 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : ButtonIcons.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons;

import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class ButtonIcons {

    public static ImageDescriptor SORT = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/tree_sort.gif");
    public static ImageDescriptor PACKAGE_TREE = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/tree_package.gif");
    
    public static ImageDescriptor INHERITANCE_FLAT = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/inheritance_flat.gif");
    public static ImageDescriptor SHOW_IMPORTED = ImageDescriptor.createFromFile(ButtonIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_red.gif");

}
