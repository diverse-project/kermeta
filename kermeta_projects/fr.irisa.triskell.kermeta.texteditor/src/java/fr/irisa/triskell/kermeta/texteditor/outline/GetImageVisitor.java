/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.green.KermetaIconsGreen;
import fr.irisa.triskell.kermeta.texteditor.icons.red.KermetaIconsRed;
import fr.irisa.triskell.kermeta.texteditor.icons.yellow.KermetaIconsYellow;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;




/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class GetImageVisitor extends KermetaOptimizedVisitor {
    
    protected KermetaOutline outline;
    protected OutlineItem item;
    
    
    public static Image getImage(OutlineItem item, KermetaOutline outline) {
        GetImageVisitor visitor = new GetImageVisitor(outline, item);
        Image result = (Image)visitor.accept(item.modelElement);
        return result;
    }
    
    private GetImageVisitor(KermetaOutline outline, OutlineItem item) {
        this.outline = outline;
        this.item = item;
    }
	
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
	   
	    if (item.isTypeDefinitionImported()) {
	        if (arg0.isIsAbstract()) return KermetaIconsBlue.CLASS_ABSTRACT;
			return KermetaIconsBlue.CLASS;
	    }
	    else {
	        if (arg0.isIsAbstract()) return KermetaIconsRed.CLASS_ABSTRACT;
			return KermetaIconsRed.CLASS;
	    }
	    
		
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Constraint)
	 */
	public Object visitConstraint(Constraint arg0) {
		switch (arg0.getStereotype().getValue()) {
        case ConstraintType.INV:  return KermetaSpecialIcons.INV_CONSTRAINT;
        case ConstraintType.PRE:  return KermetaSpecialIcons.PRE_CONSTRAINT;
        case ConstraintType.POST:  return KermetaSpecialIcons.POST_CONSTRAINT;
        default: return KermetaSpecialIcons.CONSTRAINT;
		}
		
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration arg0) {
	    if (item.isTypeDefinitionImported()) {
	        return KermetaIconsBlue.ENUM;
	    }
	    else {
	        return KermetaIconsRed.ENUM;
	    }
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral arg0) {
	    if (item.parent.isTypeDefinitionImported()) {
	        return KermetaIconsBlue.ENUM_LIT;
	    }
	    else {
	        return KermetaIconsRed.ENUM_LIT;
	    }
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation arg0) {
	    
	    if (item.isOperationInherited()) {
            if (arg0.isIsAbstract()) return KermetaIconsYellow.OPERATION_ABSTRACT;
    		if (arg0.getSuperOperation() != null) return KermetaIconsYellow.METHOD;
    		return KermetaIconsYellow.OPERATION;
	    }
	    /*
	    if (item.parent.isTypeDefinitionImported()) {
            if (arg0.isFIsAbstract()) return KermetaIconsBlue.OPERATION_ABSTRACT;
    		if (arg0.getFSuperOperation() != null) return KermetaIconsBlue.METHOD;
    		return KermetaIconsBlue.OPERATION;
	    }
	    */
	    if (arg0.isIsAbstract()) return KermetaIconsGreen.OPERATION_ABSTRACT;
		if (arg0.getSuperOperation() != null) return KermetaIconsGreen.METHOD;
		return KermetaIconsGreen.OPERATION;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visitPackage(Package arg0) {
	    boolean one = false;
	    boolean all = true;
	    
	    if (arg0.getOwnedTypeDefinition().size() == 0) {
	        return KermetaSpecialIcons.PACKAGE_GRAY;
	    }
	    
	    if (item.isPackageFullyImported()) return KermetaIconsBlue.PACKAGE;
	    else if (item.isPackageFullyLocal()) return KermetaIconsRed.PACKAGE;
	    else return KermetaSpecialIcons.PACKAGE_BLUE_RED;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType arg0) {
	    if (item.isTypeDefinitionImported()) {
	        return KermetaIconsBlue.DATATYPE;
	    }
	    else {
	        return KermetaIconsRed.DATATYPE;
	    }
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property node) {

	    if (item.isPropertyInherited()) {
	        if (node.isIsComposite()) return KermetaIconsYellow.PROPERTY_CONTAINED;
    		if (node.isIsDerived()) return KermetaIconsYellow.PROPERTY_DERIVED;
    		return KermetaIconsYellow.PROPERTY;
    	
	    }
	    
	    if (node.isIsComposite()) return KermetaIconsGreen.PROPERTY_CONTAINED;
		if (node.isIsDerived()) return KermetaIconsGreen.PROPERTY_DERIVED;
		return KermetaIconsGreen.PROPERTY;
	}
	
  
}

