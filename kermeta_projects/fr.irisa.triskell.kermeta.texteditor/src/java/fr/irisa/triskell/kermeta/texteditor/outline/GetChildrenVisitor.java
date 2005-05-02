/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FEnumeration;
import fr.irisa.triskell.kermeta.structure.FEnumerationLiteral;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.texteditor.editors.Editor;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class GetChildrenVisitor extends KermetaVisitor {
	
    protected KermetaOutline outline;
    protected OutlineItem item;
    
	
    public static Object[] getChildren(OutlineItem item, KermetaOutline outline) {
        GetChildrenVisitor visitor = new GetChildrenVisitor(outline, item);
        Object[] result = (Object[])visitor.accept(item.modelElement);
        return result;
    }
    
	/**
	 * @param unit
	 */
	private GetChildrenVisitor(KermetaOutline outline, OutlineItem item) {
		super();
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
	public Object visit(FClassDefinition arg0) {
		ArrayList result = new ArrayList();
		
		if (outline.prefInheritanceFlattening()) {
		    Iterator it = InheritanceSearch.callableProperties(InheritanceSearch.getFClassForClassDefinition(arg0)).iterator();
		    while(it.hasNext()) {
		        CallableProperty cp = (CallableProperty)it.next();
		        if (cp.getFclass().getFClassDefinition() != arg0)
		            result.add(new OutlineItem(cp.getTypeBoundedProperty(), item, outline));
		    }
		    
		    it = InheritanceSearch.callableOperations(InheritanceSearch.getFClassForClassDefinition(arg0)).iterator();
		    while(it.hasNext()) {
		        CallableOperation cop = (CallableOperation)it.next();
		        if (cop.getFclass().getFClassDefinition() != arg0)
		            result.add(new OutlineItem(cop.getTypeBoundedOperation(), item, outline));
		    }
		
		}

	    Iterator it = arg0.getFOwnedAttributes().iterator();
	    while(it.hasNext()) {
	        FProperty p = (FProperty)it.next();
	        result.add(new OutlineItem(p, item, outline));
	    }
	    
	    it = arg0.getFOwnedOperation().iterator();
	    while(it.hasNext()) {
	        FOperation op = (FOperation)it.next();
	        result.add(new OutlineItem(op, item, outline));
	    }
		    
		    
		
		
		if (outline.prefSortedOutline())
		    Collections.sort(result);
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumeration)
	 */
	public Object visit(FEnumeration arg0) {
		ArrayList result = new ArrayList();
		
		Iterator it = arg0.getFOwnedLiteral().iterator();
	    while(it.hasNext()) {
	        FEnumerationLiteral lit = (FEnumerationLiteral)it.next();
	        result.add(new OutlineItem(lit, item, outline));
	    }
		
	    if (outline.prefSortedOutline())
		    Collections.sort(result);
	    
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FEnumerationLiteral)
	 */
	public Object visit(FEnumerationLiteral arg0) {
		return new Object[0];
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visit(FOperation arg0) {
		return new Object[0];
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPackage)
	 */
	public Object visit(FPackage arg0) {
		ArrayList result = new ArrayList();
		
		if (outline.prefPackageTree()) {
		    Iterator it = arg0.getFNestedPackage().iterator();
		    while(it.hasNext()) {
		        FPackage spack = (FPackage)it.next();
		        
		        OutlineItem spack_item = new OutlineItem(spack, item, outline);
		        
		        if (!outline.prefShowImported() && spack_item.isPackageFullyImported()) {
		            // do not show this package
		        }
		        else { 
		            result.add(spack_item); 
		        }   
		    }
		}
		
		Iterator it = arg0.getFOwnedTypeDefinition().iterator();
		while(it.hasNext()) {
			FTypeDefinition td = (FTypeDefinition)it.next();
			OutlineItem td_item = new OutlineItem(td, item, outline);
			if (outline.prefShowImported() || !td_item.isTypeDefinitionImported()) {
			    result.add(td_item);
			}
		}
		
		if (outline.prefSortedOutline())
		    Collections.sort(result);
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FPrimitiveType)
	 */
	public Object visit(FPrimitiveType arg0) {
		return new Object[0];
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FProperty)
	 */
	public Object visit(FProperty arg0) {
		return new Object[0];
	}
}
