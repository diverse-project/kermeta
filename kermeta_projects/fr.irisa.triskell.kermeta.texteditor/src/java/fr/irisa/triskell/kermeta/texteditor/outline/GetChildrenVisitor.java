/* $Id: GetChildrenVisitor.java,v 1.14 2008-04-30 13:05:08 dvojtise Exp $
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
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
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
    
	
    public static Object[] getChildren(ModelElementOutlineItem item, KermetaOutline outline) {
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
		ArrayList<ModelElementOutlineItem> result = new ArrayList<ModelElementOutlineItem>();
		
		// groups used to have a nice sort
		ArrayList<ModelElementOutlineItem> invariantsMEOIs = new ArrayList<ModelElementOutlineItem>();
		ArrayList<ModelElementOutlineItem> propertiesMEOIs = new ArrayList<ModelElementOutlineItem>();
		ArrayList<ModelElementOutlineItem> operationsMEOIs = new ArrayList<ModelElementOutlineItem>();
		
		Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getContext( arg0 );
		
		Set <String> propertiesName = new HashSet <String> ();
		Set <String> operationsName = new HashSet <String> ();
				
		String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(arg0);
		
		for (TypeDefinition t : context ) {
			
			if ( t instanceof ClassDefinition ) {
				
				ClassDefinition currentClassDefinition = (ClassDefinition) t;
				if ( outline.prefInheritanceFlattening() || KermetaModelHelper.NamedElement.qualifiedName(currentClassDefinition).equals(qualifiedName)) {
					// Invariants
					for ( Constraint c : currentClassDefinition.getInv() )
		    			invariantsMEOIs.add( new ModelElementOutlineItem( c, item, outline ) );

					// Properties
					for ( Property p : (List<Property>) currentClassDefinition.getOwnedAttribute() ) {
		    			if ( ! propertiesName.contains(p.getName()) ) {
		    				propertiesMEOIs.add( new ModelElementOutlineItem( p, item, outline ) );
		    				propertiesName.add( p.getName() );
		    			}
		    		}
					
					// Operations
					for ( Operation o : (List<Operation>) currentClassDefinition.getOwnedOperation() ) {
		    			if ( ! operationsName.contains(o.getName()) ) {
		    				operationsMEOIs.add( new ModelElementOutlineItem( o, item, outline ) );
		    				operationsName.add( o.getName() );
		    			}
		    		}
				}
				
			}
			
		}

		// sort result if necessary
		if (outline.prefSortedOutline()){
		    Collections.sort(invariantsMEOIs);
		    Collections.sort(propertiesMEOIs);
		    Collections.sort(operationsMEOIs);
		}
		result.addAll(invariantsMEOIs);
		result.addAll(propertiesMEOIs);
		result.addAll(operationsMEOIs);
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
		ArrayList<ModelElementOutlineItem> result = new ArrayList<ModelElementOutlineItem>();
		
		for (Object lit : arg0.getOwnedLiteral())
	        result.add(new ModelElementOutlineItem((EnumerationLiteral)lit, item, outline));
		
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
		ArrayList<ModelElementOutlineItem> result = new ArrayList<ModelElementOutlineItem>();

		if (outline.prefInheritanceFlattening() && arg0.getSuperOperation() != null) {
			for (Object ci : arg0.getSuperOperation().getPre())
		        result.add(new ModelElementOutlineItem((Constraint)ci, item, outline));
		}
		
		for (Object ci : arg0.getPre())
	        result.add(new ModelElementOutlineItem((Constraint)ci, item, outline));
	    
	    for (Object ci : arg0.getPost())
	        result.add(new ModelElementOutlineItem((Constraint)ci, item, outline));
	    
	    if (outline.prefInheritanceFlattening() && arg0.getSuperOperation() != null) {
	    	for (Object ci : arg0.getSuperOperation().getPost())
		        result.add(new ModelElementOutlineItem((Constraint)ci, item, outline));
	    }
	    
		if (outline.prefSortedOutline())
		    Collections.sort(result);
		return result.toArray();
	}
	/**
	 * @see metacore.visitor.MetacoreVisitor#visit(metacore.structure.Package)
	 */
	public Object visitPackage(Package arg0) {
		ArrayList<ModelElementOutlineItem> result = new ArrayList<ModelElementOutlineItem>();
		
		if (outline.prefPackageTree()) {
			for (Object next : arg0.getNestedPackage())
			{
		        Package spack = (Package)next;
		        
		        ModelElementOutlineItem spack_item = new ModelElementOutlineItem(spack, item, outline);
		        
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
			ModelElementOutlineItem td_item = new ModelElementOutlineItem(td, item, outline);
			if (outline.prefShowImported() || !td_item.isTypeDefinitionImported()) {
			    result.add(td_item);
			}
		}
		
		if (outline.prefSortedOutline())
		    Collections.sort(result);
		return result.toArray();
	}
	
	@Override
	public Object visitModelType(ModelType node) {		
		return new Object[0];
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
