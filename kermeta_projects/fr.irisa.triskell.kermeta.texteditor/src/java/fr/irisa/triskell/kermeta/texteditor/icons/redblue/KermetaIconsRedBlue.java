/* $Id: KermetaIconsRedBlue.java,v 1.1 2008-01-04 09:41:46 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KermetaIconsRedBlue.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 03 Jan. 2008
* Author : 
* 		Franck Fleurey (ffleurey@irisa.fr)
* 		Didier Vojtisek (dvojtise@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons.redblue;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;


public class KermetaIconsRedBlue {

    // PACKAGES
    public static Image PACKAGE = ImageDescriptor.createFromFile(KermetaIconsRedBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/redblue/package.png").createImage();
	
	
    // TYPES
    public static Image CLASS = ImageDescriptor.createFromFile(KermetaIconsRedBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/redblue/class.png").createImage();
	public static Image CLASS_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsRedBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/redblue/class_abstract.png").createImage();
	
	
	
	public static Image DATATYPE = ImageDescriptor.createFromFile(KermetaIconsRedBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/redblue/datatype.png").createImage();
		
}
