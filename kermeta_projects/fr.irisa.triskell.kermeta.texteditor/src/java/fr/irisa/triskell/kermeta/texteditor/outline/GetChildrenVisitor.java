/*
 * Created on 13 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class GetChildrenVisitor extends KermetaOptimizedVisitor {
	
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
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitClassDefinition(ClassDefinition arg0) {
		ArrayList result = new ArrayList();
		if (outline.prefInheritanceFlattening()) {
		    for (Object next : InheritanceSearch.callableProperties(InheritanceSearch.getFClassForClassDefinition(arg0)))
		    {
		        CallableProperty cp = (CallableProperty)next;
		        if (cp.getFclass().getTypeDefinition() != arg0)
		            result.add(new OutlineItem(cp.getTypeBoundedProperty(), item, outline));
		    }
		    
		    for (Object next : InheritanceSearch.callableOperations(InheritanceSearch.getFClassForClassDefinition(arg0)))
		    {
		        CallableOperation cop = (CallableOperation)next;
		        if (cop.getFclass().getTypeDefinition() != arg0)
		            result.add(new OutlineItem(cop.getTypeBoundedOperation(), item, outline));
		    }
		    
		    for (Object next : arg0.getSuperType()) {
		    	 fr.irisa.triskell.kermeta.language.structure.Class metaClass = (fr.irisa.triskell.kermeta.language.structure.Class)next;
			     ClassDefinition parent = (ClassDefinition)metaClass.getTypeDefinition();
			     for (Object inv : parent.getInv()) {
			        result.add(new OutlineItem((Constraint)inv, item, outline));
		    	 }
		    }
		
		}

		for (Object ci : arg0.getInv())
	    	result.add(new OutlineItem((Constraint)ci, item, outline));
	    
	    for (Object p : arg0.getOwnedAttribute())
	        result.add(new OutlineItem((Property)p, item, outline));
	    
	    for (Object op : arg0.getOwnedOperation())
	        result.add(new OutlineItem((Operation)op, item, outline));
	    
		if (outline.prefSortedOutline())
		    Collections.sort(result);
		return result.toArray();
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.ClassDefinition)
	 */
	public Object visitConstraint(Constraint arg0) {
		return new Object[0];
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration arg0) {
		ArrayList result = new ArrayList();
		
		for (Object lit : arg0.getOwnedLiteral())
	        result.add(new OutlineItem((EnumerationLiteral)lit, item, outline));
		
	    if (outline.prefSortedOutline())
		    Collections.sort(result);
	    
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral arg0) {
		return new Object[0];
	}
	
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitOperation(Operation arg0) {
		ArrayList result = new ArrayList();

		if (outline.prefInheritanceFlattening() && arg0.getSuperOperation() != null) {
			for (Object ci : arg0.getSuperOperation().getPre())
		        result.add(new OutlineItem((Constraint)ci, item, outline));
		}
		
		for (Object ci : arg0.getPre())
	        result.add(new OutlineItem((Constraint)ci, item, outline));
	    
	    for (Object ci : arg0.getPost())
	        result.add(new OutlineItem((Constraint)ci, item, outline));
	    
	    if (outline.prefInheritanceFlattening() && arg0.getSuperOperation() != null) {
	    	for (Object ci : arg0.getSuperOperation().getPost())
		        result.add(new OutlineItem((Constraint)ci, item, outline));
	    }
	    
		if (outline.prefSortedOutline())
		    Collections.sort(result);
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visitPackage(Package arg0) {
		ArrayList result = new ArrayList();
		
		if (outline.prefPackageTree()) {
			for (Object next : arg0.getNestedPackage())
			{
		        Package spack = (Package)next;
		        
		        OutlineItem spack_item = new OutlineItem(spack, item, outline);
		        
		        if (!outline.prefShowImported() && spack_item.isPackageFullyImported()) {
		            // do not show this package
		        }
		        else { 
		            result.add(spack_item); 
		        }   
		    }
		}
		
		for (Object next : arg0.getOwnedTypeDefinition()) {
			TypeDefinition td = (TypeDefinition)next;
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
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType arg0) {
		return new Object[0];
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Property)
	 */
	public Object visitProperty(Property arg0) {
		return new Object[0];
	}
}
