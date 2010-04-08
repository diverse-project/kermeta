/* $Id: ModelElementOutlineItem.java,v 1.9 2008-10-28 12:31:47 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : OutlineItem.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 28 avr. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;

/**
 * Item that represent a ModelElement in Kermeta Outline
 * note : it doesn't represent Package that use their own PackageItem representation
 */
public class ModelElementOutlineItem extends OutlineItem implements Comparable<ModelElementOutlineItem> {

    protected NamedElement modelElement;
    protected Object parent;
        
    protected KermetaOutline outline;

    
    /**
     * Constructor
     */
    public ModelElementOutlineItem(NamedElement modelElement, Object parent, KermetaOutline outline) {
        super();
        if (modelElement == null) 
        	throw new Error("Assertion failed : instanciate OutlineItem with null model element");
        this.modelElement = modelElement;
        this.parent = parent;
        this.outline = outline;        
    }
    
    public int compareTo(ModelElementOutlineItem other) {
    	if(getLabel() == null) {
    		if(other.getLabel() != null) return -other.getLabel().length();
    		else return 0;
    	}
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
        	String qn = NamedElementHelper.getQualifiedName((TypeDefinition)modelElement);
        	TypeDefinition td = null;
        	try{
            	td = unit.getInternalTypeDefinitionByName(qn); 
            }
            catch(Throwable t){
            	TexteditorPlugin.internalLog.warn("Problem retreiving data for the outline", t);
            	return false;
            }
        	return  (td == null);
        }
        else return false;
    }
    
    public boolean isPropertyInherited() {   	
    	if ( parent instanceof ModelElementOutlineItem ) {
    		ModelElementOutlineItem parentItem = (ModelElementOutlineItem) parent;
    	
    		if (modelElement instanceof Property && parent != null && parentItem.modelElement instanceof ClassDefinition) {
    			boolean isDefinedOnClass = false;
    			isDefinedOnClass = ((ClassDefinition)parentItem.modelElement).getOwnedAttribute().contains(modelElement);
    			if(!isDefinedOnClass){
    				// let's try on aspects
    				List<TypeDefinition> l = TypeDefinitionHelper.getBaseAspects(outline.getKermetaUnit().getModelingUnit(), ((ClassDefinition)parentItem.modelElement));
    				if ( l != null ) {
    					for(TypeDefinition td  : l) {
	    					if(td instanceof ClassDefinition){
	    						ClassDefinition cd = (ClassDefinition)td;
	    						if(cd.getOwnedAttribute().contains(modelElement)) {
	    							isDefinedOnClass = true;
	    							break;
	    						}
	    					}
    					}
    				}
    			}
    			return !isDefinedOnClass; 
    		}
    	}
    	return false;
    }

    /**
     * is this property local to this modeling unit ?
     * @return
     */
    public boolean isPropertyLocal() {
    	
    	if ( parent instanceof ModelElementOutlineItem ) {
    		ModelElementOutlineItem parentItem = (ModelElementOutlineItem) parent;
    	
    		if (modelElement instanceof Property && parent != null && parentItem.modelElement instanceof ClassDefinition){
    			if(parentItem.isTypeDefinitionImported()){
    				return false;
    			}
    			else
    				return ((ClassDefinition)parentItem.modelElement).getOwnedAttribute().contains(modelElement);
    		}
    	}
    	return false;
    }
    
    public boolean isOperationInherited() {
    	if ( parent instanceof ModelElementOutlineItem ) {
    		ModelElementOutlineItem parentItem = (ModelElementOutlineItem) parent;
    		if (modelElement instanceof Operation && parentItem != null && parentItem.modelElement instanceof ClassDefinition) {
    			boolean isDefinedOnClass = false;
    			isDefinedOnClass = ((ClassDefinition)parentItem.modelElement).getOwnedAttribute().contains(modelElement);
    			if(!isDefinedOnClass){
    				// let's try on aspects
    				List<TypeDefinition> l = TypeDefinitionHelper.getBaseAspects(outline.getKermetaUnit().getModelingUnit(), ((ClassDefinition)parentItem.modelElement));
    				if ( l != null ) {
    					for(TypeDefinition td  : l) {
    						if(td instanceof ClassDefinition){
    							ClassDefinition cd = (ClassDefinition)td;
    							if(cd.getOwnedOperation().contains(modelElement)) {
    								isDefinedOnClass = true;
    								break;
    							}
    						}
    					}
    				}
    			}
    			return !isDefinedOnClass; 
    		}
        }
    	return false;
    }
    
    /**
     * is this operation local to this modeling unit ?
     * @return
     */
    public boolean isOperationLocal() {
    	if ( parent instanceof ModelElementOutlineItem ) {
    		ModelElementOutlineItem parentItem = (ModelElementOutlineItem) parent;
    		if (modelElement instanceof Operation && parentItem != null && parentItem.modelElement instanceof ClassDefinition){
    			if(parentItem.isTypeDefinitionImported()){
    				return false;
    			}
    			else
    				return ((ClassDefinition)parentItem.modelElement).getOwnedOperation().contains(modelElement); 
    		}
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
    
    /**
     * returns true if it contains at least one imported typedefinition and one local typeDefintion 
     * @return
     */
    public boolean isPartiallyImported(){
    	KermetaUnit unit = getKermetaUnit();
    	boolean hasLocal = false;
    	boolean hasImported = false;
        
        if (unit == null) 
        	return false;
        
        if (modelElement instanceof Package) { 
            for (int i=0; i<getChildren().length;i++) {
                ModelElementOutlineItem child = (ModelElementOutlineItem) getChildren()[i];
                if (child.modelElement instanceof TypeDefinition) {
                    boolean isTDImported = child.isTypeDefinitionImported();
                    if (isTDImported) hasImported = true;
                    else hasLocal = true;                    	
                }
                if (hasLocal && hasImported) break;
            }
            return hasLocal && hasImported;
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
	
	public boolean isErroneous() {
		return outline.isErroneous( modelElement );
	}
	
	public boolean isWarned() {
		return outline.isWarned( modelElement );
	}
}
