/* $Id: OutlineItem.java,v 1.3 2005-05-10 09:08:37 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : OutlineItem.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;

import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class OutlineItem implements Comparable {

    protected FObject modelElement;
    protected OutlineItem parent;
    
    protected KermetaOutline outline;
    
    
    private Object[] children;
    private Image image;
    private String label;
    
    /**
     * Constructor
     */
    public OutlineItem(FObject modelElement, OutlineItem parent, KermetaOutline outline) {
        super();
        if (modelElement == null) throw new Error("Assertion failed : instanciate OutlineItem with null model element");
        this.modelElement = modelElement;
        this.parent = parent;
        this.outline = outline;
    }
    
    public String getLabel() {
        if (label == null) {
            try {
                GetTextVisitor v = new GetTextVisitor(outline);
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
    
    public int compareTo(Object other) {
        if (other instanceof OutlineItem) {
            return getLabel().compareTo(((OutlineItem)other).getLabel());
        }
        else return 0; 
    }
    
    public boolean equals(Object other) {
        if (modelElement instanceof FNamedElement && 
                other instanceof OutlineItem && 
                ((OutlineItem)other).modelElement instanceof FNamedElement) {
            FNamedElement e1 = (FNamedElement)modelElement;
            FNamedElement e2 = (FNamedElement)((OutlineItem)other).modelElement;
            return getQualifiedName(e1).equals(getQualifiedName(e2));
        }
        else return super.equals(other);
    }
    
    public int hashCode() {
        if (modelElement instanceof FNamedElement) 
            return getQualifiedName((FNamedElement)modelElement).hashCode();
        else return super.hashCode();
    }
    
    public String getQualifiedName(FNamedElement element) {
		if (element.eContainer() != null && element.eContainer() instanceof FNamedElement)
			return getQualifiedName( (FNamedElement)element.eContainer() ) + "::" + element.getFName();
		else return element.getFName();
	}
    
    public boolean isTypeDefinitionImported() {
        KermetaUnit unit = outline.editor.getMcunit();
        if (unit == null) return false;
        if (modelElement instanceof FTypeDefinition) {
            return !unit.typeDefs.containsKey(unit.getQualifiedName((FTypeDefinition)modelElement));
        }
        else return false;
    }
    
    public boolean isPropertyInherited() {
        if (modelElement instanceof FProperty && parent != null && parent.modelElement instanceof FClassDefinition) {
            return !((FClassDefinition)parent.modelElement).getFOwnedAttributes().contains(modelElement);
        }
        else return false;
    }
    
    public boolean isOperationInherited() {
        if (modelElement instanceof FOperation && parent != null && parent.modelElement instanceof FClassDefinition) {
            return !((FClassDefinition)parent.modelElement).getFOwnedOperation().contains(modelElement);
        }
        else return false;
    }
    
    public boolean isPackageEmpty() {
        if (modelElement instanceof FPackage) { 
            return getChildren().length == 0;
        }
        else return false;
    }
    
    public boolean isPackageFullyImported() {
        KermetaUnit unit = outline.editor.getMcunit();
        if (unit == null) return false;
        if (modelElement instanceof FPackage) { 
            boolean result = true;
            for (int i=0; i<getChildren().length;i++) {
                OutlineItem child = (OutlineItem) getChildren()[i];
                if (child.modelElement instanceof FPackage) {
                    result = child.isPackageFullyImported();
                }
                else if (child.modelElement instanceof FTypeDefinition) {
                    result = child.isTypeDefinitionImported();
                }
                if (!result) break;
            }
            return result;
        }
        else return false;
    }
    
    public boolean isPackageFullyLocal() {
        KermetaUnit unit = outline.editor.getMcunit();
        if (unit == null) return false;
        if (modelElement instanceof FPackage) { 
            boolean result = true;
            for (int i=0; i<getChildren().length;i++) {
                OutlineItem child = (OutlineItem) getChildren()[i];
                if (child.modelElement instanceof FPackage) {
                    result = child.isPackageFullyLocal();
                }
                else if (child.modelElement instanceof FTypeDefinition) {
                    result = !child.isTypeDefinitionImported();
                }
                if (!result) break;
            }
            return result;
        }
        else return false;
    }

}
