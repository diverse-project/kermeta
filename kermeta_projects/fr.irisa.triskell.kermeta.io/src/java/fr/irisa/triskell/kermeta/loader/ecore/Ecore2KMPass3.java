/* $Id: Ecore2KMPass3.java,v 1.7 2006-09-18 15:20:12 dtouzet Exp $
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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolProperty;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;
import fr.irisa.triskell.kermeta.utils.KMTHelper;

/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass3 extends EcoreVisitor {

	protected ECore2KMPass1 visitorPass1;
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
	public Ecore2KMPass3(ECore2KMPass1 visitor, Ecore2KM exporter)
	{
		this.visitorPass1 = visitor;
		this.unit = visitorPass1.unit;
		this.resource = exporter.resource;
		this.isTypeSettingMode = false;
		this.exporter = exporter;
		
		this.opTable = new Hashtable();
	}
		
	public Hashtable convertUnit()
	{
		// Visit all the EClasses (their substructure, i.e operations and properties)
		isTypeSettingMode = true;
		for (EObject node : visitorPass1.eclassifier_typedefinition_map.keySet()) { // do not visit again datatypes?
			if (node instanceof EClass) accept(node); 
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
				Type t = createTypeForEClassifier(node.getEType(), node);
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
			// Visit the annotations, except for ecore metamodel elements
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
	
	/** */
	public Property visitEStructuralFeature(EStructuralFeature node)
	{
		exporter.current_prop = (Property)visitorPass1.properties.get(Ecore2KM.getQualifiedName(node));
		// Set the type of this property
		Type t = createTypeForEClassifier(node.getEType(), node);
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
		Type t = createTypeForEClassifier(node.getEType(), node);
		param.setType(t);
		exporter.current_op.getOwnedParameter().add(param);
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
		// EStructuralFeature visit : handle body of derived properties getter/setters
		if (node.getSource().equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY))
		{	
			visitDerivedPropertySpecificEAnnotation(node);
		}
		if (node.getSource().equals(KM2Ecore.ANNOTATION))
		{
			// Visit annotation details that are dedicated to operation
			visitOperationSpecificEAnnotation(node);
			// Visit common annotation - create a Tag for given EAnnotation if its type is kdoc
			if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_KDOC_DETAILS))
			{
				result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_KDOC_DETAILS);
				Tag tag = unit.struct_factory.createTag();
				tag.setName(KM2Ecore.ANNOTATION_KDOC_DETAILS);
				tag.setValue(result);
				fr.irisa.triskell.kermeta.language.structure.Object o = visitorPass1.getObjectForEModelElement(node.getEModelElement()); 
				if (o!=null) o.getTag().add(tag);
			}
		}
		if (node.getSource().equals(KM2Ecore.ANNOTATION_DOCUMENTATION)){
			if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_DOCUMENTATION_DETAILS))
			{
				result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_DOCUMENTATION_DETAILS);
				Tag tag = unit.struct_factory.createTag();
				tag.setName(KM2Ecore.ANNOTATION_KDOC_DETAILS);
				tag.setValue(result);
				fr.irisa.triskell.kermeta.language.structure.Object o = visitorPass1.getObjectForEModelElement(node.getEModelElement()); 
				if (o!=null) o.getTag().add(tag);
			}
		}
		// Visit the Invariants. Dedicated to EClass/ClassDefinition
		if (node.getSource().equals(KM2Ecore.ANNOTATION_INV))
		{
			// Visit annotation details that are dedicated to class definition
			visitClassDefinitionSpecificEAnnotation(node);
		}
		// Visit the Pre/Post conditions. Dedicated to EOperation/Operation
		if (node.getSource().equals(KM2Ecore.ANNOTATION_PRE) || node.getSource().equals(KM2Ecore.ANNOTATION_POST))
		{
			// Visit annotation details that are dedicated to operation
			visitOperationConstraintAnnotation(node);
		}
		
		// Visit annotation specific to EOperation or EClass
		if (node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER))
		{	
			List<TypeVariable> params = new ArrayList<TypeVariable>();
			for (Object next :  node.getDetails().keySet())
			{
				String name = (String)next;
				TypeVariable tv = unit.struct_factory.createTypeVariable(); 
				tv.setName(name);
				// detail can be " A : Anothertype" -> means that A must inherit Anothertype
				String detail = (String)node.getDetails().get(name); 
				if (detail.indexOf(":")>0)
				{
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
			if (visitorPass1.isClassTypeOwner==true) {
				exporter.current_classdef.getTypeParameter().addAll(params);
			}
			// for current_op
			else
				exporter.current_op.getTypeParameter().addAll(params);
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
				superop = (Operation)unit.getOperationByName(cdef, exporter.current_op.getName()); 
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
	
	/** Visit the special "KM2Ecore.ANNOTATION"*/
	protected void visitOperationSpecificEAnnotation(EAnnotation node)
	{
		String result = "";
		// EOperation visit
		if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_BODY_DETAILS))
		{	
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_BODY_DETAILS);
			// Parse and inject 
			// FIXME parse method call is not sufficient at all -> type variable binding are omitted.
			exporter.current_op.setBody(ExpressionParser.parse(unit, result));
		}
		// EOperation visit
		if (node.getDetails().containsKey(KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS))
		{	// only current_op is concerned by 
			result = (String)node.getDetails().get(KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS);
			exporter.current_op.setIsAbstract(result.equals("true")?true:false);
		}
	}
	
	
	/**
	 * Visit the pre and post annotations of the operation
	 * @param node
	 */
	protected void visitOperationConstraintAnnotation(EAnnotation node) {
		
		for ( Object cond_name : node.getDetails().keySet() ) { 
			Constraint cond = unit.struct_factory.createConstraint();
			cond.setName((String)cond_name);
			cond.setBody(ExpressionParser.parse(unit, (String)node.getDetails().get(cond_name)));

			if(node.getSource().equals(KM2Ecore.ANNOTATION_PRE)) {
				cond.setStereotype(ConstraintType.PRE_LITERAL);
				cond.setPreOwner(exporter.current_op);
				exporter.current_op.getPre().add(cond);
			}
			if(node.getSource().equals(KM2Ecore.ANNOTATION_POST)) {
				cond.setStereotype(ConstraintType.POST_LITERAL);
				cond.setPostOwner(exporter.current_op);
				exporter.current_op.getPost().add(cond);
			}

			exporter.constraints_mapping.put(node, cond);
		}
	}
	
	
	/** Visit the following annotations, dedicated to ClassDefinition : 
	 *  - annotation.getSource() == "kermeta.inv"
	 *  That's it for the moment
	 */
	protected void visitClassDefinitionSpecificEAnnotation(EAnnotation node)
	{
		for ( Object inv_name : node.getDetails().keySet() )
		{ 
			Constraint inv = unit.struct_factory.createConstraint();
			inv.setStereotype(ConstraintType.INV_LITERAL);
			inv.setName((String)inv_name);
			inv.setBody(ExpressionParser.parse(unit, (String)node.getDetails().get(inv_name)));
			inv.setInvOwner(exporter.current_classdef);
			
			exporter.current_classdef.getInv().add(inv);
			
			exporter.constraints_mapping.put(node, inv);
		}
	}
	
	protected void visitDerivedPropertySpecificEAnnotation(EAnnotation node)
	{
		String getter = (String)node.getDetails().get(
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY_GETTERBODY);
		String setter = (String)node.getDetails().get(
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY_SETTERBODY);
		String readonly = (String)node.getDetails().get(
				KM2Ecore.ANNOTATION_DERIVEDPROPERTY_ISREADONLY);
		if (getter!=null)
			exporter.current_prop.setGetterBody(ExpressionParser.parse(unit, getter));
		if (readonly.equals("false")) {
			exporter.current_prop.setSetterBody(ExpressionParser.parse(unit, setter));
			exporter.current_prop.setIsReadOnly(false);
		}
		// Boolean.getBoolean(readonly) -> foireux
		else {
			exporter.current_prop.setIsReadOnly(true);
		}
	}
	

	/**
	 * Get the kermeta type corresponding to this EType
	 * @param node is only used to get the node for which this class were called 
	 * */
	protected Type createTypeForEClassifier(EClassifier etype, ENamedElement node) {
		Type result = null;
		TypeDefinition def = null;
		if (etype == null)
		{ 
			def = KermetaUnit.getStdLib().typeDefinitionLookup("kermeta::standard::Void");
		}
		else def = unit.typeDefinitionLookup(Ecore2KM.getQualifiedName(etype));
		if (def == null) {
			// Ignore ecore types : we cannot create a kermeta unit since the URI of the ecore metamodel
			// does not reflect a real path in the user file system. We will handle it separately
			// Try to find the given element in the loaded kermeta units
			// If not found, load a kermeta unit for the resource of the given element
			if (etype.eResource() != resource)
			{
				String etype_qname = Ecore2KM.getQualifiedName(etype);
				String dep_uri = etype.eResource().getURI().toString();
				// We create EcoreUnit this way (not using the KermetaUnitFactory) because
				// this unit is not related to a real file in the user file system
				// note: unit.packages argument: the list of found packages is added to this [main unit] hashtable.
				EcoreUnit dep_unit = new EcoreUnit(etype.eResource(), unit.packages);
				dep_unit.load();
				unit.importedUnits.add(dep_unit);
				def = dep_unit.typeDefs.get(etype_qname);
			}
			else
				def = (TypeDefinition)visitorPass1.eclassifier_typedefinition_map.get(etype)!=null?
						visitorPass1.eclassifier_typedefinition_map.get(etype):visitorPass1.datatypes.get(etype); // this does the same as unit.typeDefinitionLookUp
		}
		
		if (def == null) throw new KM2ECoreConversionException("Internal error of Ecore2KM conversion : type '" + Ecore2KM.getQualifiedName(etype) + "' not found." );
		// It can be a Type if the element is a EEnum (inherits datatype) or a EDatatype (inherits Type and TypeDefinition)
		if (def instanceof Type)
			result = (Type)def;
		else
		{
			// Otherwise it is always a ClassDefinition
			ClassDefinition cd = (ClassDefinition)def;
			fr.irisa.triskell.kermeta.language.structure.Class fc = visitorPass1.classes.get(cd);
			if (fc == null) {
				fc = unit.struct_factory.createClass();
				fc.setTypeDefinition(cd);
				visitorPass1.classes.put(cd, fc);
			}
			result = fc;
		}
		// Type should never be null
		if (result == null) {
			throw new Error("Internal error of ecore2kermeta transfo : type " +
					"of '" + node.getName() + node.eClass().getName() + ":" + etype.getName() + "' not found " +
							"in Kermeta side");
		}
		return result;
	}
}
