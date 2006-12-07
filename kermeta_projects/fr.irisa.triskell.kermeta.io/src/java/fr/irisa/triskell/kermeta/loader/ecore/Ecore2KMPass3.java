/* $Id: Ecore2KMPass3.java,v 1.12 2006-12-07 08:08:24 dvojtise Exp $
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
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolProperty;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass3 extends EcoreVisitor {

	protected Ecore2KMPass1 visitorPass1;
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

	
	/** 
	 * @param unit
	 * @param resource
	 * @param visitor
	 */
	public Ecore2KMPass3(Ecore2KMPass1 visitor, Ecore2KM exporter) {
		this.visitorPass1 = visitor;
		this.unit = visitorPass1.unit;
		this.resource = exporter.resource;
		this.isTypeSettingMode = false;
		this.exporter = exporter;
		this.opTable = new Hashtable();
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
		acceptList(((EClass)node).getEAnnotations());
		acceptList(((EClass)node).getEStructuralFeatures());
		acceptList(((EClass)node).getEOperations());
		
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
			// Set the type of the operation
			if (node.getEType() != null) 
			{
				//Type t = createTypeForEClassifier(node.getEType(), node);
				Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
				exporter.current_op.setType(t);
			}

			// Set the parameters
			acceptList(node.getEParameters());
			
			// put the parameters and the parameters types in the current context so the operation body that is
			// hosted in the operation annotation can be parsed and type checked correctly.
			unit.pushContext();
			
			// add type variable
			for (Object next : exporter.current_op.getTypeParameter()) unit.addTypeVar((TypeVariable)next);
			
			// add parameters
			for (Object next : exporter.current_op.getOwnedParameter()) unit.addSymbol(new KMSymbolParameter((Parameter)next));
		
			// Is operation abstract? : we can know it already if the given operation contains no annotation
			exporter.current_op.setIsAbstract(node.getEAnnotation(KM2Ecore.ANNOTATION)==null);
			visitorPass1.isClassTypeOwner=false;
			
			// Visit the annotations
			acceptList(node.getEAnnotations());
			
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
		exporter.current_prop = (Property)visitorPass1.properties.get(Ecore2KM.getQualifiedName(node));
		// Set the type of this property
		//Type t = createTypeForEClassifier(node.getEType(), node);
		Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
		exporter.current_prop.setType(t);
		// Get the derived properties bodies and other stuffs
		acceptList(node.getEAnnotations());
		
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
		//Type t = createTypeForEClassifier(node.getEType(), node);
		Type t = visitorPass1.createTypeForEClassifier(node.getEType(), node);
		param.setType(t);
		exporter.current_op.getOwnedParameter().add(param);
		return param;
	}


	/**
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EAnnotation)
	 */
	public Object visit(EAnnotation node) {	
		String result = "";
		if(node.getEModelElement() instanceof EClass) {
			result = (String) visitClassAnnotation(node);
		}
		else if(node.getEModelElement() instanceof EOperation) {
			result = (String) visitOperationAnnotation(node);
		}
		else if(node.getEModelElement() instanceof EStructuralFeature) {
			result = (String) visitPropertyAnnotation(node);
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
	 * Visit the EClass EAnnotation 'node', which can be of the following types:
	 *  - kermeta
	 *  - http://www.eclipse.org/emf/2002/GenModel
	 *  - kermeta.inv
	 *  - kermeta.typeParameters
	 * @param node
	 * @return
	 */
	protected Object visitClassAnnotation(EAnnotation node) {
		// node.getSource() == "kermeta"
		if (node.getSource().equals(KM2Ecore.ANNOTATION)) {
			visitStandardAnnotation(node);
		}
		// node.getSource() == "http://www.eclipse.org/emf/2002/GenModel"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DOCUMENTATION)) {
			visitGenModelAnnotation(node);
		}
		// node.getSource() == "kermeta.inv"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_INV)) {
			// "node.getDetails()" should contain a single element
			for ( Object inv_name : node.getDetails().keySet() ) { 
				Constraint inv = unit.struct_factory.createConstraint();
				inv.setStereotype(ConstraintType.INV_LITERAL);
				inv.setName((String)inv_name);
				inv.setBody(ExpressionParser.parse(unit, (String)node.getDetails().get(inv_name)));
				inv.setInvOwner(exporter.current_classdef);
				
				exporter.current_classdef.getInv().add(inv);
				exporter.nestedAnnotMap.put(node, inv);
			}
		}
		// node.getSource() == "kermeta.typeParameters"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
			visitTypeParameterAnnotation(node);
		}
		return null;
	}

	
	/**
	 * Visit the EOperation EAnnotation 'node', which can be of the following types:
	 *  - kermeta
	 *  - http://www.eclipse.org/emf/2002/GenModel
	 *  - kermeta.pre
	 *  - kermeta.post
	 *  - kermeta.typeParameters
	 *  - kermeta.raisedExceptions
	 * @param node
	 * @return
	 */
	protected Object visitOperationAnnotation(EAnnotation node) {
		// node.getSource() == "kermeta"
		if (node.getSource().equals(KM2Ecore.ANNOTATION)) {
			visitStandardAnnotation(node);
		}
		// node.getSource() == "http://www.eclipse.org/emf/2002/GenModel"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DOCUMENTATION)) {
			visitGenModelAnnotation(node);
		}
		// node.getSource() == "kermeta.pre"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_PRE)) {
			// "node.getDetails()" should contain a single element
			for ( Object cond_name : node.getDetails().keySet() ) { 
				Constraint cond = unit.struct_factory.createConstraint();
				cond.setName((String)cond_name);
				cond.setBody(ExpressionParser.parse(unit, (String)node.getDetails().get(cond_name)));
				cond.setStereotype(ConstraintType.PRE_LITERAL);
				cond.setPreOwner(exporter.current_op);

				exporter.current_op.getPre().add(cond);
				exporter.nestedAnnotMap.put(node, cond);
			}
		}
		// node.getSource() == "kermeta.post"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_POST)) {
			// "node.getDetails()" should contain a single element
			for ( Object cond_name : node.getDetails().keySet() ) { 
				Constraint cond = unit.struct_factory.createConstraint();
				cond.setName((String)cond_name);
				cond.setBody(ExpressionParser.parse(unit, (String)node.getDetails().get(cond_name)));
				cond.setStereotype(ConstraintType.POST_LITERAL);
				cond.setPostOwner(exporter.current_op);

				exporter.current_op.getPost().add(cond);
				exporter.nestedAnnotMap.put(node, cond);
			}
		}
		// node.getSource() == "kermeta.typeParameters"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
			visitTypeParameterAnnotation(node);
		}
		// node.getSource() == "kermeta.raisedExceptions"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_RAISEDEXCEPTION)) {
			EClassifier exceptionEClassifier = (EClassifier) node.getReferences().get(0);
			fr.irisa.triskell.kermeta.language.structure.Class anException =
				//(fr.irisa.triskell.kermeta.language.structure.Class) createTypeForEClassifier(exceptionEClassifier, null);
				(fr.irisa.triskell.kermeta.language.structure.Class) visitorPass1.createTypeForEClassifier(exceptionEClassifier, null);
			exporter.current_op.getRaisedException().add(anException);
		}
		return null;
	}
	
	
	/**
	 * Visit the EStructuralFeature EAnnotation 'node', which can be of the following types:
	 *  - kermeta
	 *  - http://www.eclipse.org/emf/2002/GenModel
	 *  - kermeta.derivedProp.getter
	 *  - kermeta.derivedProp.setter
	 * @param node
	 * @return
	 */
	protected Object visitPropertyAnnotation(EAnnotation node) {
		// node.getSource() == "kermeta"
		if (node.getSource().equals(KM2Ecore.ANNOTATION)) {
			visitStandardAnnotation(node);
		}
		// node.getSource() == "http://www.eclipse.org/emf/2002/GenModel"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DOCUMENTATION)) {
			visitGenModelAnnotation(node);
		}
		// node.getSource() == "kermeta.derivedProp.getter"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY_GETTER)) {
			String getter = (String) node.getDetails().get(KM2Ecore.ANNOTATION_BODY_DETAILS);
			if (getter != null) {
				Expression exp = ExpressionParser.parse(unit, getter);
				exporter.current_prop.setGetterBody(exp);
			}
		}
		// node.getSource() == "kermeta.derivedProp.setter"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY_SETTER)) {
			String setter = (String) node.getDetails().get(KM2Ecore.ANNOTATION_BODY_DETAILS);
			if (setter != null) {
				Expression exp = ExpressionParser.parse(unit, setter);
				exporter.current_prop.setSetterBody(exp);
			}
		}
		return null;
	}
	
	
	/**
	 * Visit a TypeParameter ('kermeta.typeParameter') EAnnotation.
	 * Such EAnnotation is supposed to be attached to either an Eclass or an EOperation.
	 * @param node
	 * @return
	 */
	protected Object visitTypeParameterAnnotation(EAnnotation node) {
		List<TypeVariable> params = new ArrayList<TypeVariable>();
		for (Object next :  node.getDetails().keySet()) {
			String name = (String)next;
			TypeVariable tv = unit.struct_factory.createObjectTypeVariable(); 
			tv.setName(name);
			// detail can be " A : Anothertype" -> means that A must inherit Anothertype
			String detail = (String)node.getDetails().get(name); 
			if (detail.indexOf(":")>0) {
				detail = detail.replaceAll(" ", ""); // strip spaces
				String str_cdef = detail.substring(detail.indexOf(":")+1);
				ClassDefinition cdef = (ClassDefinition)unit.typeDefinitionLookup(str_cdef);
				fr.irisa.triskell.kermeta.language.structure.Class type = 
					StructureFactory.eINSTANCE.createClass();
		        type.setTypeDefinition((ClassDefinition)cdef);
				tv.setSupertype(type);
			}
			params.add(tv);
		} 
		// for current_class - add the parameter to the class
		if (visitorPass1.isClassTypeOwner) {
			exporter.current_classdef.getTypeParameter().addAll(params);
		}
		// for current_op
		else {
			exporter.current_op.getTypeParameter().addAll(params);
		}
		return null;
	}
	
	
	/**
	 * Visit a GenModel ('http://www.eclipse.org/emf/2002/GenModel') EAnnotation, whatever the
	 * EObject it is attached to.
	 * @param node
	 * @return
	 */
	protected Object visitGenModelAnnotation(EAnnotation node) {
		String result = "";
		if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_DOCUMENTATION_DETAILS)) {
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_DOCUMENTATION_DETAILS);
			Tag tag = unit.struct_factory.createTag();
			tag.setName(KM2Ecore.ANNOTATION_DOCUMENTATION_DETAILS);
			tag.setValue(result);
			fr.irisa.triskell.kermeta.language.structure.Object o = visitorPass1.getObjectForEModelElement(node.getEModelElement()); 
			if (o!=null) o.getTag().add(tag);
		}
		return result;
	}
	
	
	/**
	 * Visit a standard ('kermeta') EAnnotation, whatever the EObject it is attached to. 
	 * @param node
	 * @return
	 */
	protected Object visitStandardAnnotation(EAnnotation node) {
		String result = "";
		String readonly = "";
		
		// Visit all details EAnnotation entries
		for (Object next :  node.getDetails().keySet()) {
			String key = (String) next;
			
			// node.getDetails().get(key) == "body"
			// => EAnnotation for EOperation
			if (key.equals(KM2Ecore.ANNOTATION_BODY_DETAILS)) {	
				result = (String)node.getDetails().get(key);
				// Parse and inject 
				// FIXME parse method call is not sufficient at all -> type variable binding are omitted.
				exporter.current_op.setBody(ExpressionParser.parse(unit, result));
			}
			// node.getDetails().get(key) == "isAbstract"
			// => EAnnotation for EOperation
			else if (key.equals(KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS)) {
				result = (String)node.getDetails().get(key);
				exporter.current_op.setIsAbstract(result.equals("true")?true:false);
			}
			// node.getDetails().get(key) == "isReadOnly"
			// => EAnnotation for EStructuralFeature
			else if(key.equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY_ISREADONLY_DETAILS)) {
				readonly = (String) node.getDetails().get(key);
				exporter.current_prop.setIsReadOnly( Boolean.valueOf(readonly));
			}
			// Other entries correspond to the user-defined annotations (either standard 'documentation'
			// or specific ones)
			else {
				// Some annotations are processed elsewhere and must be ignored here:
				// - isComposite
				// - superOperation
				if(! (key.equals(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS) || key.equals(KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS))) {
					result = (String)node.getDetails().get(key);
					Tag tag = unit.struct_factory.createTag();
					tag.setName(key);
					tag.setValue(result);
					fr.irisa.triskell.kermeta.language.structure.Object o = visitorPass1.getObjectForEModelElement(node.getEModelElement()); 
					if (o!=null) o.getTag().add(tag);
				}
			}
		}
		return result;
	}
}
