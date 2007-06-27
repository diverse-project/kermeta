/* $Id: KermetaIconsYellow.java,v 1.2 2007-06-27 13:04:45 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : KermetaIconsYellow.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2005
* Author : Franck Fleurey  (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons.yellow;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @author Franck Fleurey
 */
public class KermetaIconsYellow {

    // PACKAGES
    public static Image PACKAGE = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/package.png").createImage();
	
	
    // TYPES
    public static Image CLASS = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/class.png").createImage();
	public static Image CLASS_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/class_abstract.png").createImage();
	
	
	public static Image ENUM = ImageDescriptor.createFromFile(KermetaIconsYellow.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/enum.png").createImage();

	public static Image ENUM_LIT = ImageDescriptor.createFromFile(KermetaIconsYellow.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/enum_literal.png").createImage();
	
	public static Image DATATYPE = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/datatype.png").createImage();
	
	// PROPERTIES
	public static Image PROPERTY = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/property.png").createImage();
	public static Image PROPERTY_CONTAINED = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/property_contained.png").createImage();
	public static Image PROPERTY_DERIVED = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/property_derived.png").createImage();
	

	// OPERATIONS
	public static Image OPERATION = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/operation.png").createImage();
	public static Image OPERATION_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/operation_abstract.png").createImage();
	public static Image METHOD = ImageDescriptor.createFromFile(KermetaIconsYellow.class, "/fr/irisa/triskell/kermeta/texteditor/icons/yellow/method.png").createImage();
	

}
