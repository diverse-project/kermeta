/* $Id: Ecore2KMPass6.java,v 1.13 2008-04-28 11:50:12 ftanguy Exp $
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
package fr.irisa.triskell.kermeta.loader.ecore.ecore2km;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
//import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;



/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass6 extends Ecore2KMPass {
	
	private Hashtable<Operation, ArrayList<Operation>> opTable;
	
	/**
	 * @param visitor
	 * @param t
	 * @param exporter
	 */
	public Ecore2KMPass6(KermetaUnit kermetaUnit, 
			             Ecore2KMDatas datas, 
						 boolean isQuickFixEnabled, 
						 Hashtable<Operation, ArrayList<Operation>> opTable, IProgressMonitor monitor) {
		super(kermetaUnit, datas, isQuickFixEnabled, monitor);
		this.opTable = opTable;
	}
	
	private static String methodRenamePrefix = "op_";

	public static boolean isMethodPropertyNameOverlapSafe = true;
	public static boolean isMethodNameOverlapSafe = true;
	
	/**
	 * 
	 */
	public void fixUnit() {
		for (EObject node : datas.getTypesDefinition() ) {
			if (node instanceof EClass) accept(node); 
		}
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node) {
		currentClassDefinition = (ClassDefinition) datas.getTypeDefinition(node);
		isClassTypeOwner = true;
		
		acceptList(((EClass)node).getEOperations());
		acceptList(((EClass)node).getEAnnotations());
		
		return currentClassDefinition;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EAnnotation)
	 */
	public Object visit(EAnnotation node) {
		// Visit annotation details that contain user-defined annotations on some KM elements:
		//  - class invariants
		//  - operation pre and post conditions
		if (node.getSource().equals(KM2Ecore.ANNOTATION_NESTED_DOC)) {
			EList<EObject> refs = node.getReferences();
			
			if(! refs.isEmpty()) {
				EAnnotation tgtAnnot = (EAnnotation) refs.get(0);
				fr.irisa.triskell.kermeta.language.structure.Object tgtElt = nestedAnnotMap.get(tgtAnnot);

				if ( tgtElt != null ) {
					for ( Object annot_name : node.getDetails().keySet() ) {
						Tag tag = StructureFactory.eINSTANCE.createTag();
						tag.setName((String) annot_name);
						tag.setValue((String) node.getDetails().get(annot_name));
						tgtElt.getOwnedTags().add(tag); // owned by this element
						tgtElt.getTag().add(tag); // this element is tagged
					}
				}
			}
		}
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EOperation)
	 */
	public Object visit(EOperation node) {
		currentOperation = datas.getOperation(node);
		// Visit operation annotations
		acceptList(((EOperation)node).getEAnnotations());
		
		if ( isQuickFixEnabled ) {
			
			// Quickfix to handle operation named like properties
			if ( isMethodPropertyNameOverlapSafe ) {
				Property prop = KermetaModelHelper.ClassDefinition.getPropertyByName(currentClassDefinition, currentOperation.getName());
				if (prop != null) {
					String newName = methodRenamePrefix + currentOperation.getName();
					kermetaUnit.warning("Quickfix used to rename duplicate operation due to a the property with the same name: " + currentOperation.getName() + " renamed into " + newName, null);		        	
				
					currentOperation.setName(newName);
					
					propagateRenaming(currentOperation);
				}
			}
			

			if ( isMethodNameOverlapSafe ) {
				
				// Quickfix to avoid two operations with the same name in the same class (even with different parameters)
				Operation op = KermetaModelHelper.ClassDefinition.getOperationByName(currentClassDefinition, currentOperation.getName());

				int i = 2;
				String newName;
				while ((op != null) && (op != currentOperation)) {
					newName = currentOperation.getName() + i;
					kermetaUnit.warning("Quickfix used to rename duplicate operation: " + currentOperation.getName() + " renamed into " + newName, null);		        	
					currentOperation.setName(newName);
					
					op = KermetaModelHelper.ClassDefinition.getOperationByName(currentClassDefinition, currentOperation.getName());
					
					propagateRenaming(currentOperation);
				}
				
				
				// Quickfix to avoid 2 operations with the same name but different parameters in a single inheritance tree
				EList<Parameter> refParams = currentOperation.getOwnedParameter();

				List<Operation> opList = KermetaModelHelper.ClassDefinition.getAllOperations(currentClassDefinition);
				Iterator<Operation> it = opList.iterator();
				
				boolean match = true;
				while(it.hasNext() && match) {
					Operation crtOp = it.next();
					
					if((crtOp.getName().equals(currentOperation.getName())) && (crtOp != currentOperation)) {
						EList<Parameter> crtParams = crtOp.getOwnedParameter();
						
						// Check the nb of parameters of the respective methods 
						if(refParams.size() != crtParams.size()) {
							match = false;
						}
						else {
							// Same number of parameters:
							// Check whether parameters of both methods have the same type
							Iterator<Parameter> refIt = refParams.iterator();
							Iterator<Parameter> crtIt = crtParams.iterator();
							while(crtIt.hasNext() && match) {
								Parameter p1 = crtIt.next();
								Parameter p2 = refIt.next();
								match = (p1.getType() == p2.getType());
							}
						}
					}
				}

				if(! match) {
					newName = methodRenamePrefix + currentOperation.getName();
					kermetaUnit.warning("Quickfix used to rename duplicate operation due to a the property with the same name: " + currentOperation.getName() + " renamed into " + newName, null);		        	

					currentOperation.setName(newName);
					// Propagate renaming only to submethods (link to the supermethod is deleted)
					currentOperation.setSuperOperation(null);
					topDownPropagation(currentOperation.getName(), currentOperation);
				}
			}
		}
		
		return currentOperation;
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
			ArrayList<Operation> ar = opTable.get(op);
			Iterator<Operation> it = ar.iterator();
			while(it.hasNext()) {
				Operation subOp = it.next();
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
			ClassDefinition cdef = (ClassDefinition) kermetaUnit.getTypeDefinitionByName(str_result, monitor);
			// We never know...
			if (cdef == null)
			{
				throw new KM2ECoreConversionException(
						"ECore2KM : ClassDefinition '" + str_result + "' not found during parsing of " + 
						KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS + " EAnnotation of '" +
						currentOperation.getName() + "' operation");	
			}
			else
			{
				superop = KermetaModelHelper.ClassDefinition.getOperationByName(cdef, currentOperation.getName()); 
				currentOperation.setSuperOperation(superop);
			}
		}
		if (superop == null)
		{
			// If not provided, then find a default one in the inherited classes
			EClass owningclass = node.getEContainingClass();
			eoperation = findOperationInSuperTypes(owningclass.getESuperTypes(), node);
			if (eoperation != null)
				superop = datas.getOperation(eoperation);
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
	protected EOperation findOperationInSuperTypes(List<EClass> supertypes, EOperation node)
	{
		EOperation result = null;
		Iterator<EClass> it = supertypes.iterator();
		while (it.hasNext() && result == null)
		{
			EClass next = it.next();
			// Get all the operations, find the one that has the same signature as the given operation
			EList<EOperation> eoperations = next.getEOperations();
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
				List<EClass> next = ((EClass)type).getESuperTypes();
				result =  findOperationInSuperTypes(next, node);
			}
		}
		return result;
	}

}
