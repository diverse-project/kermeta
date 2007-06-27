/* $Id: KermetaSpecialIcons.java,v 1.5 2007-06-27 13:01:13 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KermetaSpecialIcons.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;


/**
 * @author Franck Fleurey
 */
public class KermetaSpecialIcons {

    public static Image PACKAGE_GRAY = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_gray.gif").createImage();
  
    public static Image PACKAGE_BLUE_RED = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_red.gif").createImage();

    public static Image PACKAGE_BLUE_GREEN = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package_blue_green.gif").createImage();

    public static Image KERMETA_LOGO = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/kermeta_logo.gif").createImage();

    public static Image CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/constraint.png").createImage();
    
    public static Image INV_CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/inv.png").createImage();
    
    public static Image PRE_CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/pre.png").createImage();
    
    public static Image POST_CONSTRAINT = ImageDescriptor.createFromFile(KermetaSpecialIcons.class, "/fr/irisa/triskell/kermeta/texteditor/icons/post.png").createImage();

}
