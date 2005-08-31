/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.texteditor.editors.Editor;
import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.green.KermetaIconsGreen;
import fr.irisa.triskell.kermeta.texteditor.icons.red.KermetaIconsRed;
import fr.irisa.triskell.kermeta.texteditor.icons.yellow.KermetaIconsYellow;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;




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
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FClassDefinition)
	 */
	public Object visitFClassDefinition(FClassDefinition arg0) {
	   
	    if (item.isTypeDefinitionImported()) {
	        if (arg0.isFIsAbstract()) return KermetaIconsBlue.CLASS_ABSTRACT;
			return KermetaIconsBlue.CLASS;
	    }
	    else {
	        if (arg0.isFIsAbstract()) return KermetaIconsRed.CLASS_ABSTRACT;
			return KermetaIconsRed.CLASS;
	    }
	    
		
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visitFEnumeration(FEnumeration arg0) {
	    if (item.isTypeDefinitionImported()) {
	        return KermetaIconsBlue.ENUM;
	    }
	    else {
	        return KermetaIconsRed.ENUM;
	    }
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visitFEnumerationLiteral(FEnumerationLiteral arg0) {
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
	public Object visitFOperation(FOperation arg0) {
	    
	    if (item.isOperationInherited()) {
            if (arg0.isFIsAbstract()) return KermetaIconsYellow.OPERATION_ABSTRACT;
    		if (arg0.getFSuperOperation() != null) return KermetaIconsYellow.METHOD;
    		return KermetaIconsYellow.OPERATION;
	    }
	    /*
	    if (item.parent.isTypeDefinitionImported()) {
            if (arg0.isFIsAbstract()) return KermetaIconsBlue.OPERATION_ABSTRACT;
    		if (arg0.getFSuperOperation() != null) return KermetaIconsBlue.METHOD;
    		return KermetaIconsBlue.OPERATION;
	    }
	    */
	    if (arg0.isFIsAbstract()) return KermetaIconsGreen.OPERATION_ABSTRACT;
		if (arg0.getFSuperOperation() != null) return KermetaIconsGreen.METHOD;
		return KermetaIconsGreen.OPERATION;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visitFPackage(FPackage arg0) {
	    boolean one = false;
	    boolean all = true;
	    
	    if (arg0.getFOwnedTypeDefinition().size() == 0) {
	        return KermetaSpecialIcons.PACKAGE_GRAY;
	    }
	    
	    if (item.isPackageFullyImported()) return KermetaIconsBlue.PACKAGE;
	    else if (item.isPackageFullyLocal()) return KermetaIconsRed.PACKAGE;
	    else return KermetaSpecialIcons.PACKAGE_BLUE_RED;
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visitFPrimitiveType(FPrimitiveType arg0) {
	    if (item.isTypeDefinitionImported()) {
	        return KermetaIconsBlue.DATATYPE;
	    }
	    else {
	        return KermetaIconsRed.DATATYPE;
	    }
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visitFProperty(FProperty node) {

	    if (item.isPropertyInherited()) {
	        if (node.isFIsComposite()) return KermetaIconsYellow.PROPERTY_CONTAINED;
    		if (node.isFIsDerived()) return KermetaIconsYellow.PROPERTY_DERIVED;
    		return KermetaIconsYellow.PROPERTY;
    	
	    }
	    
	    if (node.isFIsComposite()) return KermetaIconsGreen.PROPERTY_CONTAINED;
		if (node.isFIsDerived()) return KermetaIconsGreen.PROPERTY_DERIVED;
		return KermetaIconsGreen.PROPERTY;
	}
	
  
}

