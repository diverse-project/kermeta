/*
 * Created on 13 f�vr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.editors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;




/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class GetImageVisitor extends KermetaVisitor {
	
	
	public static Image CLASS_IMG = ImageDescriptor.createFromFile(GetImageVisitor.class, "/fr/irisa/triskell/kermeta/texteditor/icons/class.gif").createImage();
	public static Image ENUM_IMG = ImageDescriptor.createFromFile(GetImageVisitor.class,  "/fr/irisa/triskell/kermeta/texteditor/icons/enumeration.gif").createImage();
	public static Image DATATYPE_IMG = ImageDescriptor.createFromFile(GetImageVisitor.class, "/fr/irisa/triskell/kermeta/texteditor/icons/enumeration.gif").createImage();
	public static Image PROPERTY_IMG = ImageDescriptor.createFromFile(GetImageVisitor.class, "/fr/irisa/triskell/kermeta/texteditor/icons/property.gif").createImage();
	public static Image OPERATION_IMG = ImageDescriptor.createFromFile(GetImageVisitor.class, "/fr/irisa/triskell/kermeta/texteditor/icons/operation.gif").createImage();
	public static Image PACKAGE_IMG = ImageDescriptor.createFromFile(GetImageVisitor.class, "/fr/irisa/triskell/kermeta/texteditor/icons/package.gif").createImage();
	
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#genericVisitChildren(org.eclipse.emf.ecore.EObject)
	 */
	public Object genericVisitChildren(EObject arg0) {
		
		return null;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visit(FClassDefinition arg0) {
		return CLASS_IMG;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visit(FEnumeration arg0) {
		return ENUM_IMG;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral arg0) {
		return PROPERTY_IMG;
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation arg0) {
		return OPERATION_IMG;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage arg0) {
		return PACKAGE_IMG;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visit(FPrimitiveType arg0) {
		return DATATYPE_IMG;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty arg0) {
		return PROPERTY_IMG;
	}
}

