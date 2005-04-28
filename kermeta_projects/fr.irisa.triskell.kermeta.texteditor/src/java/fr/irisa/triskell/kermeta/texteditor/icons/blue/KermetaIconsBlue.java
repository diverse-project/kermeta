/* $Id: KermetaIconsBlue.java,v 1.1 2005-04-28 16:32:40 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : KermetaIcons.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons.blue;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaIconsBlue {

    // PACKAGES
    public static Image PACKAGE = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/package.png").createImage();
	
	
    // TYPES
    public static Image CLASS = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/class.png").createImage();
	public static Image CLASS_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/class_abstract.png").createImage();
	
	
	public static Image ENUM = ImageDescriptor.createFromFile(KermetaIconsBlue.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/blue/enum.png").createImage();

	public static Image ENUM_LIT = ImageDescriptor.createFromFile(KermetaIconsBlue.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/blue/enum_literal.png").createImage();
	
	public static Image DATATYPE = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/datatype.png").createImage();
	
	// PROPERTIES
	public static Image PROPERTY = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/property.png").createImage();
	public static Image PROPERTY_CONTAINED = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/property_contained.png").createImage();
	public static Image PROPERTY_DERIVED = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/property_derived.png").createImage();
	

	// OPERATIONS
	public static Image OPERATION = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/operation.png").createImage();
	public static Image OPERATION_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/operation_abstract.png").createImage();
	public static Image METHOD = ImageDescriptor.createFromFile(KermetaIconsBlue.class, "/fr/irisa/triskell/kermeta/texteditor/icons/blue/method.png").createImage();
	

}
