/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.completion;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.green.KermetaIconsGreen;
import fr.irisa.triskell.kermeta.texteditor.icons.red.KermetaIconsRed;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;




/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class GetImageVisitor extends KermetaOptimizedVisitor {
    
	/**
	 * @see metacore.visitor.MetacoreVisitor#genericVisitChildren(org.eclipse.emf.ecore.EObject)
	 */
	public Object genericVisitChildren(EObject arg0) {
		
		return null;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visitFClassDefinition(FClassDefinition arg0) {
		return KermetaIconsRed.CLASS;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visitFEnumeration(FEnumeration arg0) {
	    return KermetaIconsRed.ENUM;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visitFEnumerationLiteral(FEnumerationLiteral arg0) {
	        return KermetaIconsRed.ENUM_LIT;
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitFOperation(FOperation arg0) {
	    
	    if (arg0.isFIsAbstract()) return KermetaIconsBlue.OPERATION_ABSTRACT;
		if (arg0.getFSuperOperation() != null) return KermetaIconsBlue.METHOD;
		return KermetaIconsBlue.OPERATION;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visitFPackage(FPackage arg0) {
	    return KermetaIconsRed.PACKAGE;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visitFPrimitiveType(FPrimitiveType arg0) {
	    return KermetaIconsRed.DATATYPE;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visitFProperty(FProperty node) {
	    if (node.isFIsComposite()) return KermetaIconsGreen.PROPERTY_CONTAINED;
		if (node.isFIsDerived()) return KermetaIconsGreen.PROPERTY_DERIVED;
		return KermetaIconsGreen.PROPERTY;
	}
	
  
}

