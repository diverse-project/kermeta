/* $Id: ModelElementOutlineItem.java,v 1.2 2008-01-04 14:34:26 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : OutlineItem.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.outline;

import org.eclipse.swt.graphics.Image;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * @author Franck Fleurey
 */
public class ModelElementOutlineItem extends OutlineItem implements Comparable<ModelElementOutlineItem> {

    protected fr.irisa.triskell.kermeta.language.structure.Object modelElement;
    protected Object parent;
        
    protected KermetaOutline outline;

    
    /**
     * Constructor
     */
    public ModelElementOutlineItem(fr.irisa.triskell.kermeta.language.structure.Object modelElement, Object parent, KermetaOutline outline) {
        super();
        if (modelElement == null) 
        	throw new Error("Assertion failed : instanciate OutlineItem with null model element");
        this.modelElement = modelElement;
        this.parent = parent;
        this.outline = outline;
    }
    
    public int compareTo(ModelElementOutlineItem other) {
        if (other instanceof ModelElementOutlineItem) {
            return getLabel().compareTo(((ModelElementOutlineItem)other).getLabel());
        }
        else return 0; 
    }
    
    public boolean equals(Object other) {
        if (modelElement instanceof NamedElement && 
                other instanceof ModelElementOutlineItem && 
                ((ModelElementOutlineItem)other).modelElement instanceof NamedElement) {
            NamedElement e1 = (NamedElement)modelElement;
            NamedElement e2 = (NamedElement)((ModelElementOutlineItem)other).modelElement;
            return getQualifiedName(e1).equals(getQualifiedName(e2));
        }
        else return super.equals(other);
    }
    
    public int hashCode() {
        if (modelElement instanceof NamedElement) 
            return getQualifiedName((NamedElement)modelElement).hashCode();
        else return super.hashCode();
    }
    
    public String getQualifiedName(NamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof NamedElement)
			return getQualifiedName( (NamedElement)element.eContainer() ) + "::" + element.getName();
		else return element.getName();
	}
    
    public boolean isTypeDefinitionImported() {
        KermetaUnit unit = getKermetaUnit();
        if (unit == null) return false;
        if (modelElement instanceof TypeDefinition) {
            return ! (unit.getInternalTypeDefinitionByName(NamedElementHelper.getQualifiedName((TypeDefinition)modelElement)) != null);
        }
        else return false;
    }
    
    public boolean isPropertyInherited() {
    	
    	if ( parent instanceof ModelElementOutlineItem ) {
    		ModelElementOutlineItem parentItem = (ModelElementOutlineItem) parent;
    	
    		if (modelElement instanceof Property && parent != null && parentItem.modelElement instanceof ClassDefinition)
    			return !((ClassDefinition)parentItem.modelElement).getOwnedAttribute().contains(modelElement);
    	}
    	return false;
    }
    
    public boolean isOperationInherited() {
    	if ( parent instanceof ModelElementOutlineItem ) {
    		ModelElementOutlineItem parentItem = (ModelElementOutlineItem) parent;
    		if (modelElement instanceof Operation && parentItem != null && parentItem.modelElement instanceof ClassDefinition)
    			return !((ClassDefinition)parentItem.modelElement).getOwnedOperation().contains(modelElement);
        }
    	return false;
    }
    
    public boolean isPackageEmpty() {
        if (modelElement instanceof Package) { 
            return getChildren().length == 0;
        }
        else return false;
    }
    
    public boolean isPackageFullyImported() {
        KermetaUnit unit = getKermetaUnit();
       
        if (unit == null) 
        	return false;
        
        if (modelElement instanceof Package) { 
            boolean result = true;
            for (int i=0; i<getChildren().length;i++) {
                ModelElementOutlineItem child = (ModelElementOutlineItem) getChildren()[i];
                if (child.modelElement instanceof Package) {
                    result = child.isPackageFullyImported();
                }
                else if (child.modelElement instanceof TypeDefinition) {
                    result = child.isTypeDefinitionImported();
                }
                if (!result) break;
            }
            return result;
        }
        else return false;
    }
    
    public boolean isPackageFullyLocal() {
        KermetaUnit unit = getKermetaUnit();
        if (unit == null) return false;
        if (modelElement instanceof Package) { 
            boolean result = true;
            for (int i=0; i<getChildren().length;i++) {
                ModelElementOutlineItem child = (ModelElementOutlineItem) getChildren()[i];
                if (child.modelElement instanceof Package) {
                    result = child.isPackageFullyLocal();
                }
                else if (child.modelElement instanceof TypeDefinition) {
                    result = !child.isTypeDefinitionImported();
                }
                if (!result) break;
            }
            return result;
        }
        else return false;
    }

    private KermetaUnit getKermetaUnit() {
    	return outline.getKermetaUnit();
    }
    
	public String getLabel() {
	    if (label == null) {
	        try {
	            GetTextVisitor v = new GetTextVisitor();
	            label = (String)v.accept(modelElement);
	        }
	        catch(Throwable t) {
	            return "* error *";
	        }
	    }
	    return label;
	}

	public Image getImage() {
	    if (image == null) {
	        image = GetImageVisitor.getImage(this, outline);
	    }
	    return image;
	}

	public Object[] getChildren() {
	    if (children == null) {
	        children = GetChildrenVisitor.getChildren(this, outline);
	    }
	    return children;
	}
}
