/* $Id: Ecore2KMPass3.java,v 1.22 2007-07-12 17:58:27 cfaucher Exp $
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
import org.eclipse.emf.ecore.EGenericType;
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
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
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
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
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
		// 1- Visit all non already visited annotations
		for (EAnnotation annot : node.getEAnnotations()) {
			// KM2Ecore.ANNOTATION_TYPEPARAMETER annotation already visited in Pass_2
			if(! annot.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
				accept(annot);
			}
		}
		// 2- Visit ETypeParameters, StructuralFeatures, Operations
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
			
			// Visit all other annotations
			for (EAnnotation annot : node.getEAnnotations()) {
				if(! annot.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
					visitOperationAnnotation(annot);
				}
			}
			
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
		
		// Get the derived properties bodies and other stuffs
		acceptList(node.getEAnnotations());
		
		//TODO, add the getter and setter 
		if (node.isDerived() && exporter.current_prop.getSetterBody() == null){
			
				exporter.current_prop.setSetterBody(ExpressionParser.parse(unit, "   raise kermeta::exceptions::NotImplementedException.new"));
				TagHelper.createNonExistingTagFromNameAndValue(exporter.current_prop, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
			}
		if (node.isDerived() && exporter.current_prop.getGetterBody() == null){
			
			exporter.current_prop.setGetterBody(ExpressionParser.parse(unit, "   raise kermeta::exceptions::NotImplementedException.new"));
			TagHelper.createNonExistingTagFromNameAndValue(exporter.current_prop, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
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
		if(node.getSource().equals(KM2Ecore.ANNOTATION)) {
			visitStandardAnnotation(node);
		}
		// node.getSource() == "http://www.eclipse.org/emf/2002/GenModel"
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_DOCUMENTATION)) {
			visitGenModelAnnotation(node);
		}
		// node.getSource() == "kermeta.inv"
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_INV)) {
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
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
			visitorPass1.visitTypeParameterAnnotation(node);
		}
		// node.getSource() == "kermeta.typeVariableBindings"
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS)) {
			visitSuperClassesTypeVariableBindings(node);
		}
		return null;
	}
	
	/**
	 * @param node
	 * @return
	 */
	public Object visit(ETypeParameter node) {
		// Create the object type variable
		ObjectTypeVariable otv = createObjectTypeVariableFromETypeParameter(node);

		acceptList(node.getEBounds());
		
		return otv;
	}
	
	/**
	 * @param node
	 * @return
	 */
	public Object visit(EGenericType node) {
		// Create the object type variable
		//ObjectTypeVariable otv = createObjectTypeVariableFromETypeParameter(node);

		node.getEClassifier();
		// Créer une classe qui pointe vers le classifier
		
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
			visitorPass1.visitTypeParameterAnnotation(node);
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
		// node.getSource() == "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"
		// used in ecore files generated from xsd
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_EXTENDEDMETADATA)) {
			String element = (String) node.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_KIND);
			EStructuralFeature prop = (EStructuralFeature)node.getEModelElement();
			if (element != null && element.equals("element") && prop.isDerived()) {
				// this is a generated getter for special featuremap
					//DVK this implementation is probably too simple regarding to EMF use of these annotation 
					// but I have very few data about how it actually works ...
					// typically put into the mixed concrete attribute ..
				
				String typeName = EcoreHelper.getQualifiedName(prop.getEType());
				String collection = prop.isUnique() ? "kermeta::standard::OrderedSet" : "kermeta::standard::Sequence";
				String group = "mixed";	// by default the group is the mixed
				String groupId = (String) node.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_GROUP);
				if(groupId != null){
					// this property belong to a specific group
					// retreive it and use it for this feature
					EClass containerClass =(EClass)prop.eContainer();
					Iterator attIt = containerClass.getEAttributes().iterator();
					while(attIt.hasNext()){
						EAttribute att = (EAttribute)attIt.next();
						Iterator annIt = att.getEAnnotations().iterator();						
						while(annIt.hasNext()){
							EAnnotation currAnn = (EAnnotation)annIt.next();
							if(currAnn.getSource().equals(KM2Ecore.ANNOTATION_EXTENDEDMETADATA)){
								String attIsGroup = (String)currAnn.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_KIND);
								if(attIsGroup != null && attIsGroup.equals("group")) {
									// we have found a group
									String possiblegroup = (String)currAnn.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_NAME);
									if(groupId.equals(possiblegroup)){
										// this is the good group, use the attribute name
										group = att.getName();
									}
								}								
							}
						}
					}
				}
				
				// let's writte the getter body using all those data
				String body = //"kermeta::standard::OrderedSet<Docbook::BookType>.new"
					"do result := " +collection+ "<" +typeName+ ">.new" +
"			self." +group+ ".each{fme |"+ 
"				if fme.eStructuralFeatureName == \"" +element+ "\" then"+ 
"					var val : "+typeName+""+
"					val ?= fme.~value"+
"					result.add(val) "+
"				end"+
"			} end";
				//body = "raise kermeta::exceptions::NotImplementedException.new ";
				Expression exp = ExpressionParser.parse(unit, body);
				exporter.current_prop.setGetterBody(exp);
					// it seem that in this case the setter is a nonsense
				exporter.current_prop.setIsReadOnly( Boolean.valueOf(true));
			}
		}
		return null;
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


	/**
	 * This method visits an EClass TypeVariableAnnotation annotation and completes the
	 * existing inheritance type structure with type variable binding information.
	 * @param node - TypeVariableBinding annotation of an EClass element
	 */
	protected void visitSuperClassesTypeVariableBindings(EAnnotation node) {
		// Iterate over all supertypes of the currently visited class
		for (Object next : exporter.current_classdef.getSuperType()) {
			Type t = (Type) next;
			buildSuperTypeBindings(
					t,
					node.getDetails(),
					visitorPass1.getVisibleTypeVariables((EClass) node.getEModelElement()));
		}
	}


	
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
	 * This method completes the description of a supertype of currently visited class by
	 * adding type variable bindings structure if the supertype is parameterized.  
	 * @param supertype  - a supertype of the class
	 * @param map        - map containing all parameterized supertypes of the class
	 * @param tVars      - list of visible type variables
	 */
	protected void buildSuperTypeBindings(Type supertype, EMap map, ArrayList<TypeVariable> tVars) {
		// Iterate over all annotation entries - each entry corresponds to a parameterized
		// supertype of currently visited class
		for(Object nextEntry : map) {
			// 1- Get qualified name of current parameterized supertype
			EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) nextEntry;
			String qName = entry.getTypedValue();
			
			// 2- Get Type from qName (a class cannot inheritate from a TypeVariable)
			ArrayList<String> params = new ArrayList<String>();
			Type t = visitorPass1.analyseQualifiedName(qName, tVars, params);
			
			// 3- Compare with supertype in parameter in case it is a ParameterizedType
			// (otherwise, it can't have any TypeVariableBinding)
			if(t instanceof ParameterizedType) {
				ParameterizedType pType = (ParameterizedType) supertype;
				if(pType.getTypeDefinition() == ((ParameterizedType) t).getTypeDefinition()) {
					TypeVariableBinding tvBinding = null;
					int i = 0;
					for(Object next : params) {
						String tVarName = (String) next;
						tvBinding = unit.struct_factory.createTypeVariableBinding();
					
						// Set binding variable
						tvBinding.setVariable( (TypeVariable) pType.getTypeDefinition().getTypeParameter().get(i) );
					
						// Set binding type
						tvBinding.setType(visitorPass1.getTypeHierarchyFromQualifiedName(tVarName, tVars));
					
						// Add binding to bindings list
						pType.getTypeParamBinding().add(tvBinding);
						i++;
					}
				}
			}
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
		/*otv = (ObjectTypeVariable)object_type_variables.get(node);
		if (otv == null) {*/
			otv = unit.struct_factory.createObjectTypeVariable();
//			object_type_variables.put(node, otv);
		//}
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
