/* $Id: OutlineItem.java,v 1.9 2007-08-31 13:22:55 dvojtise Exp $
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
public class OutlineItem implements Comparable<OutlineItem> {

    protected fr.irisa.triskell.kermeta.language.structure.Object modelElement;
    protected Object parent;
    
    protected KermetaOutline outline;
    
    
    private Object[] children;
    private Image image;
    private String label;
    
    /**
     * Constructor
     */
    public OutlineItem(fr.irisa.triskell.kermeta.language.structure.Object modelElement, Object parent, KermetaOutline outline) {
        super();
        if (modelElement == null) 
        	throw new Error("Assertion failed : instanciate OutlineItem with null model element");
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
    
    public int compareTo(OutlineItem other) {
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
            return ! (unit.getTypeDefinitionByName(NamedElementHelper.getQualifiedName((TypeDefinition)modelElement)) != null);
        }
        else return false;
    }
    
    public boolean isPropertyInherited() {
    	
    	if ( parent instanceof OutlineItem ) {
    		OutlineItem parentItem = (OutlineItem) parent;
    	
    		if (modelElement instanceof Property && parent != null && parentItem.modelElement instanceof ClassDefinition)
    			return !((ClassDefinition)parentItem.modelElement).getOwnedAttribute().contains(modelElement);
    	}
    	return false;
    }
    
    public boolean isOperationInherited() {
    	if ( parent instanceof OutlineItem ) {
    		OutlineItem parentItem = (OutlineItem) parent;
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
        KermetaUnit unit = outline.editor.getMcunit();
       
        if (unit == null) 
        	return false;
        
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
