/* $Id: Ecore2KMPass4.java,v 1.8 2007-07-18 15:06:37 cfaucher Exp $
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
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.ecore.visitor.EcoreVisitor;
import fr.irisa.triskell.kermeta.ast.KermetaASTHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.modelhelper.TagHelper;


/**
 * @author dtouzet
 *
 */
public class Ecore2KMPass4 extends EcoreVisitor {
	
	protected Ecore2KMPass1 visitorPass1;
	protected Ecore2KMPass3 visitorPass3;
	protected Ecore2KM exporter;
	protected EcoreUnit unit;
	protected Resource resource;
	

	/**
	 * 
	 * @param visitor1
	 * @param visitor3
	 * @param exporter
	 */
	public Ecore2KMPass4(Ecore2KMPass1 visitor1, Ecore2KMPass3 visitor3, Ecore2KM exporter) {
		this.visitorPass1 = visitor1;
		this.visitorPass3 = visitor3;
		this.unit = visitorPass1.unit;
		this.exporter = exporter;
	}
	
	
	public void convertUnit()
	{
		// Visit all the EClasses (their substructure, i.e operations and properties) in order to fix the type parameter super types
		for (EObject node : visitorPass1.eclassifier_typedefinition_map.keySet()) { // do not visit again datatypes?
			if (node instanceof EClass) accept(node); 
		}
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node) {
		exporter.current_classdef = (ClassDefinition)visitorPass1.eclassifier_typedefinition_map.get(node);
		visitorPass1.isClassTypeOwner = true;
		
		// Set the super types of the type parameters
		acceptList(((EClass)node).getETypeParameters());
		
		for(EStructuralFeature esf : ((EClass) node).getEStructuralFeatures()) {
			visitEStructuralFeature((EStructuralFeature) esf);
		}
		
		// Set the super types of the type parameters and visit all other annotations
		acceptList(((EClass)node).getEOperations());

		return exporter.current_classdef;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EOperation)
	 */
	public Object visit(EOperation node) {
		exporter.current_op = visitorPass1.operations.get(node);
		
		// Set the super types of the type parameters
		acceptList(node.getETypeParameters());
		
		// Visit all other annotations
		for (EAnnotation annot : node.getEAnnotations()) {
			if(! annot.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
				visitOperationAnnotation(annot);
			}
		}
		
		return exporter.current_op;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EOperation)
	 */
	public Object visitEStructuralFeature(EStructuralFeature node) {
		exporter.current_prop = visitorPass1.properties.get(EcoreHelper.getQualifiedName(node));
		
		// Visit all the annotations on Property
		if(exporter.current_prop != null && exporter.current_prop instanceof Property) {
			acceptList(node.getEAnnotations());
		}
		
		//TODO, add the getter and setter
		if (node.isDerived() && exporter.current_prop.getSetterBody() == null){
			
				exporter.current_prop.setSetterBody(ExpressionParser.parse(unit, "   raise kermeta::exceptions::NotImplementedException.new"));
				TagHelper.createNonExistingTagFromNameAndValue(exporter.current_prop, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
			}
		if (node.isDerived() && exporter.current_prop.getGetterBody() == null){
			
			exporter.current_prop.setGetterBody(ExpressionParser.parse(unit, "   raise kermeta::exceptions::NotImplementedException.new"));
			TagHelper.createNonExistingTagFromNameAndValue(exporter.current_prop, KermetaASTHelper.TAGNAME_OVERLOADABLE, "true");
		}
		
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EGenericType)
	 */
	public Object visit(EGenericType node) {
		Type res=null;
		
		if(node.getEClassifier()!= null) {
			Class newClass = unit.struct_factory.createClass();
			GenericTypeDefinition gtd = (GenericTypeDefinition) visitorPass1.eclassifier_typedefinition_map.get(node.getEClassifier());
			if(gtd != null) {
				newClass.setTypeDefinition(gtd);
				res = newClass;
			}
		}
		
		if(node.getETypeParameter()!= null) {
			ObjectTypeVariable otv = (ObjectTypeVariable) visitorPass3.object_type_variables.get(node.getETypeParameter());
			if(otv != null) {
				res = otv;
			}
		}
		
		return res;
	}
	
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.ETypeParameter)
	 */
	public Object visit(ETypeParameter node) {
		ObjectTypeVariable anObjectTypeVariable = visitorPass3.object_type_variables.get(node);
		
		if(anObjectTypeVariable.getSupertype() == null) {
			Type type = null;
			for(EGenericType eGT : node.getEBounds()) {
				type = (Type) accept((EGenericType) eGT);
			}
			if(type != null) {
				anObjectTypeVariable.setSupertype(type);
				type = null;
			}
		}
		return null;
	}
	
	
	/* (non-Javadoc)
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
		// Deprecated since EMF2.3
		// node.getSource() == "kermeta.typeParameters"
		/*else if (node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
			visitorPass1.visitTypeParameterAnnotation(node);
		}*/
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
		// Deprecated since EMF2.3
		// node.getSource() == "kermeta.typeParameters"
		/*else if(node.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
			visitorPass1.visitTypeParameterAnnotation(node);
		}*/
		// node.getSource() == "kermeta.typeVariableBindings"
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_TYPEVARIABLE_BINDINGS)) {
			visitSuperClassesTypeVariableBindings(node);
		}
		return null;
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
}
