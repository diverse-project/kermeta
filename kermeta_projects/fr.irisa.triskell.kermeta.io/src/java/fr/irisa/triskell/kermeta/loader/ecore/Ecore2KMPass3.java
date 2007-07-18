/* $Id: Ecore2KMPass3.java,v 1.24 2007-07-18 15:06:37 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : Ecore2KMPass3.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Jun 19, 2006
 * Authors : 
 *    David Touzet
 * Contributors :
 */
package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.ast.KermetaASTHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolProperty;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.TagHelper;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass3 extends EcoreVisitor {

	protected Ecore2KMPass1 visitorPass1;
	protected Ecore2KMPass2 visitorPass2;
	protected Ecore2KM exporter;
	protected EcoreUnit unit;
	protected Resource resource;
	
	/** true if the visit concerns type setting, otherwise false.
	 * mainly used since operation visit needs 2 passes : 
	 * first, setting the type of operation, second, setting the super operations
	 * of operation. */
	protected boolean isTypeSettingMode;

	
	/**
	 * Hashtable that is dedicated to encode links between a method and the set of
	 * methods that overload it (in subclasses) when the QuickFix option is activated.
	 */
	protected Hashtable opTable;
	
	/** Dictionary of object type variables : { ETypeParameter : ObjectTypeVariable } */
	protected Hashtable<ETypeParameter, ObjectTypeVariable> object_type_variables;
	
	/** 
	 * @param unit
	 * @param resource
	 * @param visitor
	 */
	public Ecore2KMPass3(Ecore2KMPass1 visitor1, Ecore2KM exporter) {
		this.visitorPass1 = visitor1;
		this.unit = visitorPass1.unit;
		this.resource = exporter.resource;
		this.isTypeSettingMode = false;
		this.exporter = exporter;
		this.opTable = new Hashtable();
		this.object_type_variables = new Hashtable<ETypeParameter, ObjectTypeVariable>();
	}

	
	/**
	 * @return
	 */
	public Hashtable convertUnit() {
		// Visit all the EClasses (their substructure, i.e operations and properties)
		isTypeSettingMode = true;
		for (EObject node : visitorPass1.eclassifier_typedefinition_map.keySet()) { // do not visit again datatypes?
			if (node instanceof EClass) accept((EClass) node); 
		}
		// Visit again all the EOperations in order to set their super operations
		isTypeSettingMode = false;
		for (EOperation node : visitorPass1.operations.keySet()) {
			accept(node);
		}
		
		// Return the Hashtable (filled by the "visit(EOperation)" method) that contains 
		// links between each method and the "submethods" that overload it (empty if
		// QuickFix is disabled). 
		return opTable;
	}

	
	/**
	 * Construct the Class corresponding to given EClass:
	 *  - the structural features types
	 *  - the operations types
	 *  - the annotations
	 *  
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node)
	{
		exporter.current_classdef = (ClassDefinition)visitorPass1.eclassifier_typedefinition_map.get(node);
		visitorPass1.isClassTypeOwner = true;
		
		// Patch that allows to refer to current class attributes/operations in the operation body
		// without requiring them to be prefixed by "self."
		unit.pushContext();
		addSymbolContext( exporter.current_classdef );
		
		// Order important here! annotation above all.
		// 1- Visit all non already visited annotations
		for (EAnnotation annot : node.getEAnnotations()) {
			// KM2Ecore.ANNOTATION_TYPEPARAMETER annotation already visited in Pass_2
			if(! annot.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
				accept(annot);
			}
		}
		// 2- Visit ETypeParameters, StructuralFeatures, Operations
		// move to the PASS 4 
		acceptList(node.getEStructuralFeatures());
		acceptList(node.getEOperations());
		acceptList(node.getETypeParameters());
		
		// Pop previously pushed context
		unit.popContext();
		
		return exporter.current_classdef;
	}
	
	
	/**
	 * Method that adds in the symbols table all the symbols that should be visible from the
	 * current class:
	 *  - attributes/operations defined in the current class
	 *  - attributes/operations defined in superclasses
	 * @param cDef
	 */
	protected void addSymbolContext(ClassDefinition cDef) {
		// Adding the attribute names to the symbols table
		EList l = cDef.getOwnedAttribute();
		Iterator it = l.iterator();
		while(it.hasNext()) {
			Property p = (Property) it.next();
			unit.addSymbol( new KMSymbolProperty(p) );
		}
		// Adding the operation names to the symbols table
		l = cDef.getOwnedOperation();
		it = l.iterator();
		while(it.hasNext()) {
			Operation p = (Operation) it.next();
			unit.addSymbol( new KMSymbolOperation(p) );
		}

		// Adding the type variable names to the symbol table
		l = cDef.getTypeParameter();
		it = l.iterator();
		while(it.hasNext()) {
			TypeVariable tv = (TypeVariable) it.next();
			unit.addTypeVar(tv);
		}
		
		// Adding context inherited from superclasses
		l = cDef.getSuperType();
		it = l.iterator();
		while(it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class) it.next();
			addSymbolContext( (ClassDefinition) c.getTypeDefinition() );
		}
	}
	
	
	/** Visit the operations and set :
	 * If isTypeSettingMode attribute is true:
	 *  - super type
	 *  - parameters types
	 * If false:
	 *  - its super operation
	 */
	public Object visit(EOperation node)
	{	// Important note : the EType of an operation is not required to be defined.
		// User indeed naturally doesn't set it if he doesn't need a return type
		// FIXME : WE HAVE TO FIX A STRICT PHILOSOPHY ABOUT EXPLICIT OR IMPLICIT RETURN TYPE!!!
		exporter.current_op = visitorPass1.operations.get(node);
		
		if (isTypeSettingMode == true)
		{
			// Deprecated since EMF2.3
			// First visit the TypeParameter annotation in order to get type context for body parsing
			/*EAnnotation tParam_Annot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEPARAMETER);
			if(tParam_Annot != null) {
				visitorPass1.visitTypeParameterAnnotation(tParam_Annot);
			}*/
			// Set the type parameters
			acceptList(node.getETypeParameters());

			// Set the type of the operation
			if (node.getEType() != null) {
				Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
				exporter.current_op.setType(t);
				
				EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS);
				if(eAnnot != null) {
					buildTypeVariableBindings((fr.irisa.triskell.kermeta.language.structure.Class) t, eAnnot.getDetails(), visitorPass1.getVisibleTypeVariables(node));
				}
			}

			// Set the parameters
			acceptList(node.getEParameters());
			
			// put the parameters and the parameters types in the current context so the operation body that is
			// hosted in the operation annotation can be parsed and type checked correctly.
			unit.pushContext();
			
			// add type variable
			for (TypeVariable next : exporter.current_op.getTypeParameter()) unit.addTypeVar(next);

			// add parameters
			for (Parameter next : exporter.current_op.getOwnedParameter()) unit.addSymbol(new KMSymbolParameter(next));
			
			// If the given operation contain no abstract or body annotation or overloadable tag then we must create a body with a raise of NotImplemented Exception
			// and add the overloadable tag to the operation
			if(!isBodySpecified(node)){
				exporter.current_op.setBody(ExpressionParser.parse(unit, "   raise kermeta::exceptions::NotImplementedException.new"));
				TagHelper.createNonExistingTagFromNameAndValue(exporter.current_op, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
			}
			
			visitorPass1.isClassTypeOwner=false;
			
			unit.popContext();
		}
		else
		{	// Super operation can only be defined once the super types of all the ClassDefinitions
			// have been defined, since findSuperOperation algorithm needs to find "implicit" supertypes
			// through the super types of the owning class.
			// it could have been resolved from the EAnnotation visit
			Operation superop = findSuperOperation(node);
			if (superop != null) exporter.current_op.setSuperOperation(superop);
			
			if (Ecore2KM.isQuickFixEnabled) {

				// If QuickFix enabled:
				// Build a hashtable providing the list of "submethods" of each
				// method that is overloaded
				if(superop != null) {
					if( opTable.containsKey(superop) ) {
						ArrayList ar = (ArrayList) opTable.get(superop);
						ar.add(exporter.current_op);
						opTable.put(superop, ar);
					}
					else {
						ArrayList ar = new ArrayList();
						ar.add(exporter.current_op);
						opTable.put(superop, ar);
					}
				}
			}
		}
		return exporter.current_op;
	}

	/**
	 * tells if a body is defined or if the abstract modifier is set
	 * @param node
	 * @return
	 */
	private boolean isBodySpecified(EOperation node){
		for (EAnnotation annot : node.getEAnnotations()) {
			if(annot.getSource().equals(KM2Ecore.ANNOTATION)) {
				// Visit all details EAnnotation entries
				for (String key :  annot.getDetails().keySet()) {					
					if (key.equals(KM2Ecore.ANNOTATION_BODY_DETAILS)) {	
						return true;
					}
					else if (key.equals(KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS)) {	
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EAttribute)
	 */
	public Object visit(EAttribute node) { return visitEStructuralFeature(node); }

	
	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EReference)
	 */
	public Object visit(EReference node) { return visitEStructuralFeature(node); }

	

	/**
	 * @param node
	 * @return
	 */
	public Property visitEStructuralFeature(EStructuralFeature node) {
		exporter.current_prop = (Property)visitorPass1.properties.get(EcoreHelper.getQualifiedName(node));
		if(exporter.current_prop ==  null){
			throw new KM2ECoreConversionException(
					"ECore2KM : EStructuralFeature '" + EcoreHelper.getQualifiedName(node) + "' not found in visitorPass1.properties");
		}
		// Set the type of this property
		Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
		exporter.current_prop.setType(t);
		
		EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS);
		if(eAnnot != null) {
			buildTypeVariableBindings((fr.irisa.triskell.kermeta.language.structure.Class) t, eAnnot.getDetails(), visitorPass1.getVisibleTypeVariables(node));
		}
		
		

		return exporter.current_prop;
	}

	
	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EParameter)
	 */
	public Object visit(EParameter node) {
		// Create a Parameter
		Parameter param = unit.struct_factory.createParameter();
		
		// Patch that escapes (with '~') Ecore names that corrresponds to KerMeta keywords.
		param.setName( KMTHelper.getMangledIdentifier(node.getName()) );
		
		param.setIsOrdered(node.isOrdered());
		param.setIsUnique(node.isUnique());
		param.setUpper(node.getUpperBound());
		param.setLower(node.getLowerBound());
		param.setOperation(exporter.current_op);

		// Set its type
		Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
		param.setType(t);
		
		EAnnotation eAnnot = node.getEAnnotation(KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS);
		if(eAnnot != null) {
			buildTypeVariableBindings((fr.irisa.triskell.kermeta.language.structure.Class) t, eAnnot.getDetails(), visitorPass1.getVisibleTypeVariables(node));
		}
		
		exporter.current_op.getOwnedParameter().add(param);
		return param;
	}

	
	/**
	 * Helper for super operations
	 */
	
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
				superop = (Operation)ClassDefinitionHelper.getOperationByName(cdef, exporter.current_op.getName()); 
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

	
	/**
	 * @param node
	 * @return
	 */
	public Object visit(ETypeParameter node) {
		// Create the object type variable
		ObjectTypeVariable otv = createObjectTypeVariableFromETypeParameter(node);
		
		return otv;
	}

	
//	/**
//	 * Visit a TypeParameter ('kermeta.typeParameter') EAnnotation.
//	 * Such EAnnotation is supposed to be attached to either an EClass or an EOperation.
//	 * @param node
//	 * @return
//	 */
//	protected Object visitTypeParameterAnnotation(EAnnotation node) {
//		List<TypeVariable> params = new ArrayList<TypeVariable>();
//		for (Object next :  node.getDetails().keySet()) {
//			String name = (String)next;
//			TypeVariable tv = unit.struct_factory.createObjectTypeVariable(); 
//			tv.setName(name);
//			// detail can be " A : Anothertype" -> means that A must inherit Anothertype
//			String detail = (String)node.getDetails().get(name); 
//			if (detail.indexOf(":")>0) {
//				detail = detail.replaceAll(" ", ""); // strip spaces
//				String str_cdef = detail.substring(detail.indexOf(":")+1);
//				ClassDefinition cdef = (ClassDefinition)unit.typeDefinitionLookup(str_cdef);
//				fr.irisa.triskell.kermeta.language.structure.Class type = 
//					StructureFactory.eINSTANCE.createClass();
//		        type.setTypeDefinition((ClassDefinition)cdef);
//				tv.setSupertype(type);
//			}
//			params.add(tv);
//		} 
//		// for current_class - add the parameter to the class
//		if (visitorPass1.isClassTypeOwner) {
//			exporter.current_classdef.getTypeParameter().addAll(params);
//		}
//		// for current_op
//		else {
//			exporter.current_op.getTypeParameter().addAll(params);
//		}
//		return null;
//	}

	
	///////////////////////////////////////////////////////////////////////////////////////////
	// TYPE VARIABLE BINDINGS specific methods:
	//   - buildTypeVariableBindings
	//   - buildSuperTypeBindings
	///////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * This method builds the type variable bindings structure of the provided class from
	 * the map of the class type variable bindings and the list of visible type variables. 
	 * @param cl    - targeted class
	 * @param map   - map containing the list of type variable bindings of the class
	 * @param tVars - list of visible type variables
	 */
	protected void buildTypeVariableBindings(
			fr.irisa.triskell.kermeta.language.structure.Class cl,
			EMap map,
			ArrayList tVars) {

		TypeVariableBinding tvBinding = null;
		int i = 0;
		for(Object next : map) {
			EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) next;
			String qName = entry.getTypedValue();
			
			tvBinding = unit.struct_factory.createTypeVariableBinding();
			
			// Set binding variable
			TypeVariable tVar = (TypeVariable) cl.getTypeDefinition().getTypeParameter().get(i);
			tvBinding.setVariable(tVar);
			
			// Set binding type
			tvBinding.setType( visitorPass1.getTypeHierarchyFromQualifiedName(qName, tVars) );
			
			// Add binding to bindings list
			cl.getTypeParamBinding().add(tvBinding);
			i++;
		}
	}

	
	/**
	 * 
	 * @param node
	 * @return
	 */
	protected ObjectTypeVariable createObjectTypeVariableFromETypeParameter(ETypeParameter node)
	{
		ObjectTypeVariable otv = null;
		
		// FIXME CF Maybe a problem here
		otv = (ObjectTypeVariable) object_type_variables.get(node);
		if (otv == null) {
			otv = unit.struct_factory.createObjectTypeVariable();
			object_type_variables.put(node, otv);
		}
		//exporter.current_prop = prop;
		
		otv.setName(node.getName());
		if(visitorPass1.isClassTypeOwner) {
			exporter.current_classdef.getTypeParameter().add(otv);
		} else {
			exporter.current_op.getTypeParameter().add(otv);
		}
		
		return otv;
	}
}
