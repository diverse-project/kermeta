/* $Id: GetImageVisitor.java,v 1.15 2008-11-15 09:20:31 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : GetImageVisitor.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 feb. 2005
* Authors : 
* 		Franck Fleurey (ffleurey@irisa.fr)
* 		Francois Tanguy
* 		Didier Vojtisek
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
import fr.irisa.triskell.kermeta.texteditor.icons.redblue.KermetaIconsRedBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.yellow.KermetaIconsYellow;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;




/**
 * this visitor is used to calculate the correct image for the outline of Kermeta text editor
 */
public class GetImageVisitor extends KermetaOptimizedVisitor {
    
    protected KermetaOutline outline;
    protected ModelElementOutlineItem item;
    
    
    public static Image getImage(ModelElementOutlineItem item, KermetaOutline outline) {
        GetImageVisitor visitor = new GetImageVisitor(outline, item);
        Image result = (Image)visitor.accept(item.modelElement);
        return result;
    }
    
    private GetImageVisitor(KermetaOutline outline, ModelElementOutlineItem item) {
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
	   
		if ( arg0.isIsAspect() ) {
			if (arg0.isIsAbstract()) return KermetaIconsRedBlue.CLASS_ABSTRACT;
			return KermetaIconsRedBlue.CLASS;
		} else if (item.isTypeDefinitionImported()) {
	        if (arg0.isIsAbstract()) return KermetaIconsBlue.CLASS_ABSTRACT;
			return KermetaIconsBlue.CLASS;
	    } else {
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
    	if ( item.parent instanceof ModelElementOutlineItem ) {
    		ModelElementOutlineItem parentItem = (ModelElementOutlineItem) item.parent;
    		if ( parentItem.isTypeDefinitionImported() )
    			return KermetaIconsBlue.ENUM_LIT;
	    }
    	return KermetaIconsRed.ENUM_LIT;
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation arg0) {
	    
		if(item.isOperationLocal()){
		    if (arg0.isIsAbstract()) return KermetaIconsRed.OPERATION_ABSTRACT;
			if (arg0.getSuperOperation() != null) return KermetaIconsRed.METHOD;
			return KermetaIconsRed.OPERATION;
		}
		else{
		    if (item.isOperationInherited()) {
	            if (arg0.isIsAbstract()) return KermetaIconsYellow.OPERATION_ABSTRACT;
	    		if (arg0.getSuperOperation() != null) return KermetaIconsYellow.METHOD;
	    		return KermetaIconsYellow.OPERATION;
		    }
		    else {
		    	// is imported from an aspect
			    if (arg0.isIsAbstract()) return KermetaIconsGreen.OPERATION_ABSTRACT;
				if (arg0.getSuperOperation() != null) return KermetaIconsBlue.METHOD;
				return KermetaIconsBlue.OPERATION;
		    }
		}
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visitPackage(Package arg0) {
	    // DVK: be careful this code is never used , the correct code is in the PackageItem, not ModelElementOutlineItem !!!
	    if (arg0.getOwnedTypeDefinition().size() == 0) {
	        return KermetaSpecialIcons.PACKAGE_GRAY;
	    }
	    
	    if (item.isPartiallyImported()) return KermetaSpecialIcons.PACKAGE_BLUE_RED;
	    else if (item.isPackageFullyLocal()) return KermetaIconsRed.PACKAGE;
	    else return KermetaIconsBlue.PACKAGE;
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

	    
	    if(item.isPropertyLocal()){
			if (node.isIsDerived()) return KermetaIconsRed.PROPERTY_DERIVED;
		    if (node.isIsComposite()) return KermetaIconsRed.PROPERTY_CONTAINED;
			return KermetaIconsRed.PROPERTY;
	    }
	    else{
	    	if (item.isPropertyInherited()) {
	    		if (node.isIsDerived()) return KermetaIconsYellow.PROPERTY_DERIVED;
		        if (node.isIsComposite()) return KermetaIconsYellow.PROPERTY_CONTAINED;
	    		return KermetaIconsYellow.PROPERTY;
	    	
		    }
	    	else {
		    	if (node.isIsDerived()) return KermetaIconsBlue.PROPERTY_DERIVED;
		    	if (node.isIsComposite()) return KermetaIconsBlue.PROPERTY_CONTAINED;
		    	return KermetaIconsBlue.PROPERTY;
	    	}
	    }
	}
	
  
}

