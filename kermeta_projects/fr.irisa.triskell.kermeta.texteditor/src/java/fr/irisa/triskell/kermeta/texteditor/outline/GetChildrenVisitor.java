/* $Id: GetChildrenVisitor.java,v 1.9 2007-07-20 15:09:22 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : GetChildrenVisitor.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 feb. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/ 

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * @author Franck Fleurey
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

		Set <TypeDefinition> baseClasses = ClassDefinitionHelper.getAllBaseClasses( arg0 );
		
		Set <String> propertiesName = new HashSet <String> ();
		Set <String> operationsName = new HashSet <String> ();
				
		/*
		 * 
		 * Invariants
		 * 
		 */
		for (Object ci : arg0.getInv())
	    	result.add(new OutlineItem((Constraint)ci, item, outline));

	    for ( TypeDefinition typeDefinition : baseClasses ) {
	    	
	    	if ( typeDefinition instanceof ClassDefinition ) {
	    		ClassDefinition cl = (ClassDefinition) typeDefinition;
	    		for ( Constraint c : (List<Constraint>) cl.getInv() ) {
	    			result.add( new OutlineItem( c, item, outline ) );
	    		}
	    	}
	    	
	    }
		
		/*
		 * 
		 * Attributes
		 * 
		 */
	    for (Property p : (List<Property>) arg0.getOwnedAttribute()) {
	        result.add(new OutlineItem((Property)p, item, outline));
	        propertiesName.add( p.getName() );
	    }
	        
	    for ( TypeDefinition typeDefinition : baseClasses ) {
	    	
	    	if ( typeDefinition instanceof ClassDefinition ) {
	    		ClassDefinition cl = (ClassDefinition) typeDefinition;
	    		for ( Property p : (List<Property>) cl.getOwnedAttribute() ) {
	    			if ( ! propertiesName.contains(p.getName()) ) {
	    				result.add( new OutlineItem( p, item, outline ) );
	    				propertiesName.add( p.getName() );
	    			}
	    		}
	    	}
	    	
	    }
	    
	    /*
	     * 
	     * Operations
	     * 
	     */
	    for (Operation op : (List<Operation>) arg0.getOwnedOperation()) {
	        result.add(new OutlineItem((Operation)op, item, outline));
	        operationsName.add( op.getName() );
	    }
	    
	    for ( TypeDefinition typeDefinition : baseClasses ) {
	    	
	    	if ( typeDefinition instanceof ClassDefinition ) {
	    		ClassDefinition cl = (ClassDefinition) typeDefinition;
	    		for ( Operation o : (List<Operation>) cl.getOwnedOperation() )
	    			if ( ! operationsName.contains(o.getName()) ) {
	    				result.add( new OutlineItem( o, item, outline ) );
	    				operationsName.add( o.getName() );
	    			}
	    	}
	    	
	    }
	    
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
