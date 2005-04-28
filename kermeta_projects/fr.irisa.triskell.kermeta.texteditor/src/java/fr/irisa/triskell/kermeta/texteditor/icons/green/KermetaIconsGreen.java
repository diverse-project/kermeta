/* $Id: KermetaIconsGreen.java,v 1.1 2005-04-28 16:33:14 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : KermetaIcons.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons.green;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaIconsGreen {

    // PACKAGES
    public static Image PACKAGE = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/package.png").createImage();
	
	
    // TYPES
    public static Image CLASS = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/class.png").createImage();
	public static Image CLASS_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/class_abstract.png").createImage();
	
	
	public static Image ENUM = ImageDescriptor.createFromFile(KermetaIconsGreen.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/green/enum.png").createImage();

	public static Image ENUM_LIT = ImageDescriptor.createFromFile(KermetaIconsGreen.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/green/enum_literal.png").createImage();
	
	public static Image DATATYPE = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/datatype.png").createImage();
	
	// PROPERTIES
	public static Image PROPERTY = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/property.png").createImage();
	public static Image PROPERTY_CONTAINED = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/property_contained.png").createImage();
	public static Image PROPERTY_DERIVED = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/property_derived.png").createImage();
	

	// OPERATIONS
	public static Image OPERATION = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/operation.png").createImage();
	public static Image OPERATION_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/operation_abstract.png").createImage();
	public static Image METHOD = ImageDescriptor.createFromFile(KermetaIconsGreen.class, "/fr/irisa/triskell/kermeta/texteditor/icons/green/method.png").createImage();
	

}
