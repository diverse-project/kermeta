/* $Id: Ecore2KMPass2.java,v 1.1 2006-06-19 13:41:05 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : Ecore2KMPass2.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Jun 19, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;

public class Ecore2KMPass2 extends EcoreVisitor {

	protected ECore2KMPass1 visitorPass1;
	protected EcoreUnit unit;
	
	/** true if the visit concerns type setting, otherwise false.
	 * mainly used since operation visit needs 2 passes : 
	 * first, setting the type of operation, second, setting the super operations
	 * of operation. */
	protected boolean isTypeSettingMode;
		
	/** 
	 * 
	 * @param unit
	 * @param resource
	 * @param visitor
	 */
	public Ecore2KMPass2(EcoreUnit unit, Resource resource, ECore2KMPass1 visitor)
	{
		this.visitorPass1 = visitor;
		this.unit = unit;
		this.isTypeSettingMode = false;
	}
		
	public void convertUnit()
	{
		// Visit all the EDatatypes: the instanceType property of a datatype/primitivetype
		// refer to a typedefinition that, so, must have been previously listed.
		for (EDataType node : visitorPass1.datatypes.keySet()) { accept(node); }
		// Visit all the EClasses (their substructure, i.e operations and properties)
		isTypeSettingMode = true;
		for (EObject node : visitorPass1.types.keySet()) { // do not visit again datatypes?
			if (node instanceof EClass) accept(node); 
		}
		// Visit again all the EOperations in order to set their super operations
		isTypeSettingMode = false;
		for (EOperation node : visitorPass1.operations.keySet()) {
			accept(node);
		}
	}
	
	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EDataType)
	 */
	public Object visit(EDataType node) {
		
		PrimitiveType result = (PrimitiveType)visitorPass1.datatypes.get(node); 
		// Get the instance class name of node
		String type_name = ((EDataType)node).getInstanceClassName();
		// primitive_types_mapping : { javatype : kermetatype }
		if (visitorPass1.primitive_types_mapping.containsKey(type_name)) {
			type_name = (String)visitorPass1.primitive_types_mapping.get(type_name);
		} // Find in alias
		else if (node.getEAnnotation(KM2Ecore.ANNOTATION)!=null) {// IMPORTANT!
			type_name = (String)accept(node.getEAnnotation(KM2Ecore.ANNOTATION));
		}
		// Try to find in the current unit if the given type_name can be found
		TypeDefinition type = unit.typeDefinitionLookup(type_name);
		// FIXME : standard library is not browsable anymore?
		if (type == null) type = KermetaUnit.getStdLib().typeDefinitionLookup(type_name);
		// FIXME : If type is still null, replacing by the basic Object type of Kermeta. 
		// Not the best way to process. Idea: annotate Kermeta alias with an extern "instanceClassName"?
		if (type == null) {
			unit.messages.addWarning("cannot find instance class " + type_name + " for primitive type " + 
					visitorPass1.getQualifiedName((EDataType)node) + " (replaced by Object)", null);
			type = KermetaUnit.getStdLib().typeDefinitionLookup("kermeta::language::structure::Object");
		}
		result.setInstanceType(
			visitorPass1.createInstanceTypeForTypeDefinition(type));
		return result;
	}
	
	/**
	 * Construct the Class corresponding to given EClass:
	 *  - its super types
	 *  - the structural features types
	 *  - the operations types
	 *  - the annotations
	 *  
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node)
	{
		visitorPass1.current_classdef = (ClassDefinition)visitorPass1.types.get(node);
		// First of all, set the super types
		Iterator sit = ((EClass)node).getESuperTypes().iterator();
		while (sit.hasNext()) {
			EClassifier st = (EClassifier)sit.next();
			Type t = visitorPass1.createTypeForEClassifier(st, node);
			if (t == null || !(t instanceof fr.irisa.triskell.kermeta.language.structure.Class)) {
				throw new KM2ECoreConversionException(
						"Internal error of ecore2kermeta :" +
						" supertypes of class " + visitorPass1.getQualifiedName((EClass)node) + " : "+ visitorPass1.getQualifiedName(st) +" not found");
			}
			visitorPass1.current_classdef.getSuperType().add(t);
		}
		// Then, visit the features
		acceptList(((EClass)node).getEStructuralFeatures());
		acceptList(((EClass)node).getEOperations());
		acceptList(((EClass)node).getEAnnotations());
		return visitorPass1.current_classdef;
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
		visitorPass1.current_op = visitorPass1.operations.get(node);
		
		if (isTypeSettingMode == true)
		{
			// Set the type of the operation
			if (node.getEType() != null) 
			{
				Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
				visitorPass1.current_op.setType(t);
			}

			// Set the parameters
			acceptList(node.getEParameters());
			
			// put the parameters and the parameters types in the current context so the operation body that is
			// hosted in the operation annotation can be parsed and type checked correctly.
			unit.pushContext();
			// add type variable
			Iterator tvs = visitorPass1.current_op.getTypeParameter().iterator();
			while(tvs.hasNext()) unit.addTypeVar((TypeVariable)tvs.next());
			// add parameters
			Iterator params = visitorPass1.current_op.getOwnedParameter().iterator();
			while(params.hasNext()) unit.addSymbol(new KMSymbolParameter((Parameter)params.next()));
		
			// Is operation abstract? : we can know it already if the given operation contains no annotation
			visitorPass1.current_op.setIsAbstract(node.getEAnnotation(KM2Ecore.ANNOTATION)==null);
			// Visit the annotations, except for ecore metamodel elements
			if (!((ENamedElement)node.eContainer().eContainer()).getName().equals("ecore"))
				acceptList(node.getEAnnotations());
			
			unit.popContext();

		}
		else
		{	// Super operation can only be defined once the super types of all the ClassDefinitions
			// have been defined, since findSuperOperation algorithm needs to find "implicit" supertypes
			// through the super types of the owning class.
			// it could have been resolved from the EAnnotation visit
			if (node.getEAnnotation(KM2Ecore.ANNOTATION_SUPEROPERATION)!=null)
				accept(node.getEAnnotation(KM2Ecore.ANNOTATION_SUPEROPERATION));
			// TODO Has the operation an "implicit" super operation? if yes, we have to set it
			// (not defined in the KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS...)?
			if (visitorPass1.current_op.getSuperOperation()==null)
			{
				EOperation superop = findSuperOperation(node);
				if (superop != null) visitorPass1.current_op.setSuperOperation(visitorPass1.operations.get(superop));
			}
		}

		return visitorPass1.current_op;
	}


	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EAttribute)
	 */
	
	public Object visit(EAttribute node) {
		Property prop = visitorPass1.current_prop = (Property)visitorPass1.properties.get(visitorPass1.getQualifiedName(node));
		// Set the type of this property
		Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
		prop.setType(t);
		// Get the derived properties bodies, 
		// removed test : node.isDerived() == true && 
		if (!(((ENamedElement)node.eContainer().eContainer()).getName().equals("ecore"))) {
			acceptList(node.getEAnnotations());
		}
		return prop;
	}

	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EReference)
	 */
	public Object visit(EReference node) {
		Property prop = visitorPass1.current_prop = (Property)visitorPass1.properties.get(visitorPass1.getQualifiedName(node));
		// Set the type of this property
		Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
		prop.setType(t);
		// Get the derived properties bodies, 
		// removed test : node.isDerived() == true && 
		if (!(((ENamedElement)node.eContainer().eContainer()).getName().equals("ecore"))) {
			acceptList(node.getEAnnotations());
		}
		return prop;
	}

	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EParameter)
	 */
	public Object visit(EParameter node) {
		// Create a Parameter
		Parameter param = unit.struct_factory.createParameter();
		param.setName(node.getName());
		param.setIsOrdered(node.isOrdered());
		param.setIsUnique(node.isUnique());
		param.setUpper(node.getUpperBound());
		param.setLower(node.getLowerBound());
		param.setOperation(visitorPass1.current_op);
		// Set its type
		Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
		param.setType(t);
		visitorPass1.current_op.getOwnedParameter().add(param);
		return param;
	}

	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EAnnotation)
	 *
	 
	 **
	 * annotation.getSource() => "kermeta" if the ann. is intended to be owned by kermeta code
	 * annotation.getDetails() => hashtable, with { "body" : <body_content> } for body operations
	 */
	public Object visit(EAnnotation node)
	{	
		String result = "";
		// EOperation or EClass visit
		if (node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER))
		{	
			EMap map = node.getDetails();
			List<TypeVariable> params = new ArrayList<TypeVariable>();
			Iterator<String> it = map.keySet().iterator();
			while (it.hasNext())
			{
				String name = it.next();
				TypeVariable tv = unit.struct_factory.createTypeVariable();
				tv.setName(name);
				params.add(tv);
			} 
			// for current_class - add the parameter to the class
			if (visitorPass1.isClassTypeOwner==true) visitorPass1.current_classdef.getTypeParameter().addAll(params);
			// for current_op
			else visitorPass1.current_op.getTypeParameter().addAll(params);
		}
		// EOperation visit
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_SUPEROPERATION))
		{
			// Is there an annotation for SuperOperation? "SuperOperation -> apackage::AClass"
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS);
			// Find the class definition owning this operation
			ClassDefinition cdef = (ClassDefinition)unit.typeDefinitionLookup(result);
			// We never know...
			if (cdef == null)
			{
				throw new KM2ECoreConversionException(
						"ECore2KM : ClassDefinition '" + result + "' not found during parsing of " + 
						KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS + " EAnnotation of '" +
						visitorPass1.current_op.getName() + "' operation");	
			}
			else
			{
				Operation superop    = (Operation)unit.getOperationByName(cdef, visitorPass1.current_op.getName());
				visitorPass1.current_op.setSuperOperation(superop);
			}
		}
		// EStructuralFeature visit : handle body of derived properties getter/setters
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY))
		{	
			String getter = (String)node.getDetails().get(
					KM2Ecore.ANNOTATION_DERIVEDPROPERTY_GETTERBODY);
			String setter = (String)node.getDetails().get(
					KM2Ecore.ANNOTATION_DERIVEDPROPERTY_SETTERBODY);
			String readonly = (String)node.getDetails().get(
					KM2Ecore.ANNOTATION_DERIVEDPROPERTY_ISREADONLY);
			if (getter!=null)
				visitorPass1.current_prop.setGetterBody(ExpressionParser.parse(unit, getter));
			if (readonly.equals("false")) {
				visitorPass1.current_prop.setSetterBody(ExpressionParser.parse(unit, setter));
				visitorPass1.current_prop.setIsReadOnly(false);
			}
			// Boolean.getBoolean(readonly) -> foireux
			else {
				visitorPass1.current_prop.setIsReadOnly(true);
			}
		}
		// EOperation visit
		else if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_BODY_DETAILS))
		{	
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_BODY_DETAILS);
			// Parse and inject
			visitorPass1.current_op.setBody(ExpressionParser.parse(unit, result));
		} 
		// EDataType visit : handle alias
		else if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_ALIAS_DETAILS))
		{
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_ALIAS_DETAILS);
		}
		// EOperation visit
		else if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS))
		{	// only current_op is concerned by 
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS);
			visitorPass1.current_op.setIsAbstract(result.equals("true")?true:false);
		}
		// Create a Tag for given EAnnotation if its type is kdoc
		else if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_KDOC_DETAILS))
		{
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_KDOC_DETAILS);
			Tag tag = unit.struct_factory.createTag();
			tag.setName(KM2Ecore.ANNOTATION_KDOC_DETAILS);
			tag.setValue(result);
			fr.irisa.triskell.kermeta.language.structure.Object o = visitorPass1.getObjectForEModelElement(node.getEModelElement()); 
			if (o!=null) o.getTag().add(tag);
		}
		return result;
	}	
	
	/*
	 *
	 * Helper for super operations
	 *
	 */
	
	/**
	 * Search if a super operation of the given operation exists in the super classes of the operation owning  class
	 * @param node
	 * @return false if a super operation was not found, true otherwise 
	 */
	protected EOperation findSuperOperation(EOperation node)
	{
		EOperation result = null; 
		// If not provided, then find a default one in the inherited classes
		EClass owningclass = node.getEContainingClass();
		result = findOperationInSuperTypes(owningclass.getESuperTypes(), node);
		return result;
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
			it = supertypes.iterator();
			while (it.hasNext())
			{
				List next = ((EClass)it.next()).getESuperTypes();
				result =  findOperationInSuperTypes(next, node);
			}
		}
		return result;
	}
	
}
