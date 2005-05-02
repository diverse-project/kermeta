/* $Id: KermetaSpecialIcons.java,v 1.2 2005-05-02 23:57:40 ffleurey Exp $
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
import org.eclipse.swt.graphics.Image;


/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaSpecialIcons {

    public static Image PACKAGE_GRAY = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_gray.gif").createImage();
  
    public static Image PACKAGE_BLUE_RED = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_red.gif").createImage();

    public static Image PACKAGE_BLUE_GREEN = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_green.gif").createImage();

    public static Image KERMETA_LOGO = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/kermeta_logo.gif").createImage();

}
