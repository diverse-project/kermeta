/* $Id: OutlineItem.java,v 1.5 2006-03-03 15:23:52 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : OutlineItem.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.texteditor.outline;


import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
//import fr.irisa.triskell.kermeta.language.structure.FObject;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class OutlineItem implements Comparable {

    protected fr.irisa.triskell.kermeta.language.structure.Object modelElement;
    protected OutlineItem parent;
    
    protected KermetaOutline outline;
    
    
    private Object[] children;
    private Image image;
    private String label;
    
    /**
     * Constructor
     */
    public OutlineItem(fr.irisa.triskell.kermeta.language.structure.Object modelElement, OutlineItem parent, KermetaOutline outline) {
        super();
        if (modelElement == null) throw new Error("Assertion failed : instanciate OutlineItem with null model element");
        this.modelElement = modelElement;
        this.parent = parent;
        this.outline = outline;
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
    
    public int compareTo(Object other) {
        if (other instanceof OutlineItem) {
            return getLabel().compareTo(((OutlineItem)other).getLabel());
        }
        else return 0; 
    }
    
    public boolean equals(Object other) {
        if (modelElement instanceof NamedElement && 
                other instanceof OutlineItem && 
                ((OutlineItem)other).modelElement instanceof NamedElement) {
            NamedElement e1 = (NamedElement)modelElement;
            NamedElement e2 = (NamedElement)((OutlineItem)other).modelElement;
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
        KermetaUnit unit = outline.editor.getMcunit();
        if (unit == null) return false;
        if (modelElement instanceof TypeDefinition) {
            return !unit.typeDefs.containsKey(unit.getQualifiedName((TypeDefinition)modelElement));
        }
        else return false;
    }
    
    public boolean isPropertyInherited() {
        if (modelElement instanceof Property && parent != null && parent.modelElement instanceof ClassDefinition) {
            return !((ClassDefinition)parent.modelElement).getOwnedAttribute().contains(modelElement);
        }
        else return false;
    }
    
    public boolean isOperationInherited() {
        if (modelElement instanceof Operation && parent != null && parent.modelElement instanceof ClassDefinition) {
            return !((ClassDefinition)parent.modelElement).getOwnedOperation().contains(modelElement);
        }
        else return false;
    }
    
    public boolean isPackageEmpty() {
        if (modelElement instanceof Package) { 
            return getChildren().length == 0;
        }
        else return false;
    }
    
    public boolean isPackageFullyImported() {
        KermetaUnit unit = outline.editor.getMcunit();
        if (unit == null) return false;
        if (modelElement instanceof Package) { 
            boolean result = true;
            for (int i=0; i<getChildren().length;i++) {
                OutlineItem child = (OutlineItem) getChildren()[i];
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
        KermetaUnit unit = outline.editor.getMcunit();
        if (unit == null) return false;
        if (modelElement instanceof Package) { 
            boolean result = true;
            for (int i=0; i<getChildren().length;i++) {
                OutlineItem child = (OutlineItem) getChildren()[i];
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

}
