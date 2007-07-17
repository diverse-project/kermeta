/* $Id: Ecore2KMPass5.java,v 1.2 2007-07-17 15:56:36 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : Ecore2KMPass3.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 Aug. 2006
 * Authors : 
 *        dtouzet <dtouzet@irisa.fr>
 * Description : 
 *   This pass apply the quick fixes that are necessary to obtain correct kermeta models from many ecore models  
 */
/**
 * 
 */
package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;

import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;


/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass5 extends EcoreVisitor {
	
	protected Ecore2KMPass1 visitorPass1;
	protected Ecore2KM exporter;
	protected EcoreUnit unit;
	protected Resource resource;
	protected Hashtable opTable;
	

	/**
	 * @param visitor
	 * @param t
	 * @param exporter
	 */
	public Ecore2KMPass5(Ecore2KMPass1 visitor1, Hashtable t, Ecore2KM exporter) {
		this.visitorPass1 = visitor1;
		this.unit = visitorPass1.unit;
		this.exporter = exporter;
		this.opTable = t;
	}
	

	/**
	 * 
	 */
	public void fixUnit() {
		for (EObject node : visitorPass1.eclassifier_typedefinition_map.keySet()) {
			if (node instanceof EClass) accept(node);
		}
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node) {
		exporter.current_classdef = (ClassDefinition)visitorPass1.eclassifier_typedefinition_map.get(node);
		visitorPass1.isClassTypeOwner = true;
		
		acceptList(((EClass)node).getEOperations());
		acceptList(((EClass)node).getEAnnotations());

		return exporter.current_classdef;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EAnnotation)
	 */
	public Object visit(EAnnotation node) {
		// Visit annotation details that contain user-defined annotations on some KM elements:
		//  - class invariants
		//  - operation pre and post conditions
		if (node.getSource().equals(KM2Ecore.ANNOTATION_NESTED_DOC)) {
			EList refs = node.getReferences();
			
			if(! refs.isEmpty()) {
				EAnnotation tgtAnnot = (EAnnotation) refs.get(0);
				fr.irisa.triskell.kermeta.language.structure.Object tgtElt = exporter.nestedAnnotMap.get(tgtAnnot);

				for ( Object annot_name : node.getDetails().keySet() ) {
					Tag tag = unit.struct_factory.createTag();
					tag.setName((String) annot_name);
					tag.setValue((String) node.getDetails().get(annot_name));
					tgtElt.getTag().add(tag);
				}
			}
		}
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EOperation)
	 */
	public Object visit(EOperation node) {

		exporter.current_op = visitorPass1.operations.get(node);
		
		// Visit operation annotations
		acceptList(((EOperation)node).getEAnnotations());
		
		if (Ecore2KM.isQuickFixEnabled) {
			
			// Quickfix to handle operation named like properties
			if (Ecore2KM.isMethodPropertyNameOverlapSafe) {
				Property prop = ClassDefinitionHelper.findPropertyByName(exporter.current_classdef, exporter.current_op.getName());
				if (prop != null) {
					String newName = Ecore2KM.methodRenamePrefix + exporter.current_op.getName() +Ecore2KM.methodRenamePostfix;
					unit.messages.addWarning("Quickfix used to rename duplicate operation due to a the property with the same name: " + exporter.current_op.getName() + " renamed into " + newName, null);		        	
				
					exporter.current_op.setName(newName);
					
					propagateRenaming(exporter.current_op);
				}
			}
			

			if (Ecore2KM.isMethodNameOverlapSafe) {
				
				// Quickfix to avoid two operations with the same name in the same class (even with different parameters)
				Operation op = ClassDefinitionHelper.getOperationByName(exporter.current_classdef, exporter.current_op.getName());

				int i = 2;
				String newName;
				while ((op != null) && (op != exporter.current_op)) {
					newName = exporter.current_op.getName() + i;
					unit.messages.addWarning("Quickfix used to rename duplicate operation: " + exporter.current_op.getName() + " renamed into " + newName, null);		        	
					exporter.current_op.setName(newName);
					
					op = ClassDefinitionHelper.getOperationByName(exporter.current_classdef, exporter.current_op.getName());
					
					propagateRenaming(exporter.current_op);
				}
				
				
				// Quickfix to avoid 2 operations with the same name but different parameters in a single inheritance tree
				EList refParams = exporter.current_op.getOwnedParameter();

				ArrayList opList = ClassDefinitionHelper.getAllOperations(exporter.current_classdef);
				Iterator it = opList.iterator();
				
				boolean match = true;
				while(it.hasNext() && match) {
					Operation crtOp = (Operation) it.next();
					
					if((crtOp.getName().equals(exporter.current_op.getName())) && (crtOp != exporter.current_op)) {
						EList crtParams = crtOp.getOwnedParameter();
						
						// Check the nb of parameters of the respective methods 
						if(refParams.size() != crtParams.size()) {
							match = false;
						}
						else {
							// Same number of parameters:
							// Check whether parameters of both methods have the same type
							Iterator refIt = refParams.iterator();
							Iterator crtIt = crtParams.iterator();
							while(crtIt.hasNext() && match) {
								Parameter p1 = (Parameter) crtIt.next();
								Parameter p2 = (Parameter) refIt.next();
								match = (p1.getType().equals(p2.getType()));
							}
						}
					}
				}

				if(! match) {
					newName = Ecore2KM.methodRenamePrefix + exporter.current_op.getName() +Ecore2KM.methodRenamePostfix;
					unit.messages.addWarning("Quickfix used to rename duplicate operation due to a the property with the same name: " + exporter.current_op.getName() + " renamed into " + newName, null);		        	

					exporter.current_op.setName(newName);
					// Propagate renaming only to submethods (link to the supermethod is deleted)
					exporter.current_op.setSuperOperation(null);
					topDownPropagation(exporter.current_op.getName(), exporter.current_op);
				}
			}
		}
		
		return exporter.current_op;
	}
	
	
	/**
	 * Progagate method renaming to supermethods (from superclasses) and submethods
	 * (from subclasses) of the mmethod "op".
	 * @param op
	 */
	protected void propagateRenaming(Operation op) {
		topDownPropagation(op.getName(), op);
		downTopPropagation(op.getName(), op);
	}


	/**
	 * Recursively progagate method renaming (new name is "opName") to submethods
	 * (from subclasses) of method "op".
	 * @param opName
	 * @param op
	 */
	protected void topDownPropagation(String opName, Operation op) {
		if( opTable.containsKey(op) ) {
			ArrayList ar = (ArrayList) opTable.get(op);
			Iterator it = ar.iterator();
			while(it.hasNext()) {
				Operation subOp = (Operation) it.next();
				subOp.setName(opName);
				topDownPropagation(opName, subOp);
			}
		}
	}
	
	
	/**
	 * Recursively progagate method renaming (new name is "opName") to supermethods
	 * (from superclasses) of method "op".
	 * @param opName
	 * @param op
	 */
	protected void downTopPropagation(String opName, Operation op) {
		Operation sOp = op.getSuperOperation();
		if(sOp != null) {
			sOp.setName(opName);
			downTopPropagation(opName, sOp);
		}
	}
	
	
	/**
	 * Search if a super operation of the given operation exists in the super classes of the operation owning  class
	 * @param node
	 * @return false if a super operation was not found, true otherwise 
	 */
	protected Operation findSuperOperation(EOperation node)
	{
		
		Operation superop = null; EOperation eoperation = null;
		EAnnotation ann = node.getEAnnotation(KM2Ecore.ANNOTATION);
		if (ann != null && ann.getDetails().containsKey(KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS))
		{ 
			// Is there an annotation for SuperOperation? "superOperation -> apackage::AClass"
			String str_result = (String)ann.getDetails().get(KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS);
			// Find the class definition owning this operation
			ClassDefinition cdef = (ClassDefinition)unit.typeDefinitionLookup(str_result);
			// We never know...
			if (cdef == null)
			{
				throw new KM2ECoreConversionException(
						"ECore2KM : ClassDefinition '" + str_result + "' not found during parsing of " + 
						KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS + " EAnnotation of '" +
						exporter.current_op.getName() + "' operation");	
			}
			else
			{
				superop = ClassDefinitionHelper.getOperationByName(cdef, exporter.current_op.getName()); 
				exporter.current_op.setSuperOperation(superop);
			}
		}
		if (superop == null)
		{
			

				
			// If not provided, then find a default one in the inherited classes
			EClass owningclass = node.getEContainingClass();
			eoperation = findOperationInSuperTypes(owningclass.getESuperTypes(), node);
			if (eoperation != null)
				superop = visitorPass1.operations.get(eoperation);
		}
		return superop;
	}
	
	/**
	 * Recursive method that searches the most appropriated super operation, by parsing the super
	 * types "increasingly" (if inherited operation is not found in the super types, search in the super
	 * types of the super types :p)
	 * @param supertypes
	 * @param node
	 * @return
	 */
	protected EOperation findOperationInSuperTypes(List supertypes, EOperation node)
	{
		EOperation result = null;
		Iterator it = supertypes.iterator();
		while (it.hasNext() && result == null)
		{
			EClass next = (EClass)it.next();
			// Get all the operations, find the one that has the same signature as the given operation
			EList eoperations = next.getEOperations();
			Iterator<EOperation> itop = eoperations.iterator(); 
			while (itop.hasNext() && result == null)
			{
				EOperation op = itop.next();
				if (op.getName().equals(node.getName()) && op != node && node.getEContainingClass()!=op.getEContainingClass())
					result = op;
			}
		}
		if (result == null)
		{
			for (Object type : supertypes) {
				List next = ((EClass)type).getESuperTypes();
				result =  findOperationInSuperTypes(next, node);
			}
		}
		return result;
	}

}
