/* $Id: KermetaIconsRed.java,v 1.1 2005-04-28 16:32:36 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : KermetaIcons.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.icons.red;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KermetaIconsRed {

    // PACKAGES
    public static Image PACKAGE = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/package.png").createImage();
	
	
    // TYPES
    public static Image CLASS = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/class.png").createImage();
	public static Image CLASS_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/class_abstract.png").createImage();
	
	
	public static Image ENUM = ImageDescriptor.createFromFile(KermetaIconsRed.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/red/enum.png").createImage();

	public static Image ENUM_LIT = ImageDescriptor.createFromFile(KermetaIconsRed.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/red/enum_literal.png").createImage();
	
	public static Image DATATYPE = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/datatype.png").createImage();
	
	// PROPERTIES
	public static Image PROPERTY = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/property.png").createImage();
	public static Image PROPERTY_CONTAINED = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/property_contained.png").createImage();
	public static Image PROPERTY_DERIVED = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/property_derived.png").createImage();
	

	// OPERATIONS
	public static Image OPERATION = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/operation.png").createImage();
	public static Image OPERATION_ABSTRACT = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/operation_abstract.png").createImage();
	public static Image METHOD = ImageDescriptor.createFromFile(KermetaIconsRed.class, "/fr/irisa/triskell/kermeta/texteditor/icons/red/method.png").createImage();
	

}
