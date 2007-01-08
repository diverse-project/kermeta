/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.completion;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.icons.green.KermetaIconsGreen;
import fr.irisa.triskell.kermeta.texteditor.icons.red.KermetaIconsRed;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;




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
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition arg0) {
		return KermetaIconsRed.CLASS;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Constraint)
	 */
	public Object visitConstraint(Constraint arg0) {
		return KermetaSpecialIcons.CONSTRAINT;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration arg0) {
	    return KermetaIconsRed.ENUM;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral arg0) {
	        return KermetaIconsRed.ENUM_LIT;
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation arg0) {
	    
	    if (arg0.isIsAbstract()) return KermetaIconsBlue.OPERATION_ABSTRACT;
		if (arg0.getSuperOperation() != null) return KermetaIconsBlue.METHOD;
		return KermetaIconsBlue.OPERATION;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visitPackage(Package arg0) {
	    return KermetaIconsRed.PACKAGE;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType arg0) {
	    return KermetaIconsRed.DATATYPE;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property node) {
	    if (node.isIsComposite()) return KermetaIconsGreen.PROPERTY_CONTAINED;
		if (node.isIsDerived()) return KermetaIconsGreen.PROPERTY_DERIVED;
		return KermetaIconsGreen.PROPERTY;
	}
	
  
}

