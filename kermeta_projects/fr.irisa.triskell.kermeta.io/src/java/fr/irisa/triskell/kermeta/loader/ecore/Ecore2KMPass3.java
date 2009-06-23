/* $Id: Ecore2KMPass3.java,v 1.35 2008-04-28 11:50:12 ftanguy Exp $
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolOperation;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolParameter;
import fr.irisa.triskell.kermeta.loader.kmt.KMSymbolProperty;

/**
 * 
 *	Creating the body of operations, getters and setters.
 *
 */
public class Ecore2KMPass3 extends Ecore2KMPass {

	private LoadingContext context = new LoadingContext();
	
	/** 
	 * @param unit
	 * @param resource
	 * @param visitor
	 */
	public Ecore2KMPass3(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled, IProgressMonitor monitor) {
		super(kermetaUnit, datas, isQuickFixEnabled, monitor);
	}


	/* (non-Javadoc)
	 * @see fr.irisa.triskell.ecore.visitor.EcoreVisitor#visit(org.eclipse.emf.ecore.EClass)
	 */
	public Object visit(EClass node) {
		
		currentClassDefinition = (ClassDefinition) datas.getTypeDefinition(node);
		
		context.pushContext();
		
		for ( TypeVariable tv : currentClassDefinition.getTypeParameter() )
			context.addTypeVar(tv);
		
		for ( Property p : KermetaModelHelper.ClassDefinition.getAllProperties(currentClassDefinition) )
			context.addSymbol( new KMSymbolProperty(p) );
		
		for ( Operation op : KermetaModelHelper.ClassDefinition.getAllOperations(currentClassDefinition) )
			context.addSymbol( new KMSymbolOperation(op) );
		
		// Set the super types of the type parameters
		acceptList(((EClass)node).getETypeParameters());
		
		for(EStructuralFeature esf : ((EClass) node).getEStructuralFeatures()) {
			visitEStructuralFeature((EStructuralFeature) esf);
		}
		
		// Set the super types of the type parameters and visit all other annotations
		acceptList(((EClass)node).getEOperations());

		acceptList( node.getEAnnotations() );
		
		context.popContext();
		
		return currentClassDefinition;
	}

	public Object visit(EOperation node) {
		currentOperation = datas.getOperation(node);
		
		// put the parameters and the parameters types in the current context so the operation body that is
		// hosted in the operation annotation can be parsed and type checked correctly.
		context.pushContext();
		
		// add type variable
		for (Object next : currentOperation.getTypeParameter()) 
			context.addTypeVar((TypeVariable)next);

		// add parameters
		for (Object next : currentOperation.getOwnedParameter()) 
			context.addSymbol(new KMSymbolParameter((Parameter)next));
		
		
		// Set the super types of the type parameters
		acceptList(node.getETypeParameters());
		
		// Visit all other annotations
		for (EAnnotation annot : node.getEAnnotations()) {
			if(! annot.getSource().equals(KM2Ecore.ANNOTATION_TYPEPARAMETER)) {
				visitOperationAnnotation(annot);
			}
		}
		
		context.popContext();
		
		return currentOperation;
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
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_GENMODEL)) {
			visitGenModelAnnotation(node);
		}
		// node.getSource() == "kermeta.pre"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_PRE)) {
			// "node.getDetails()" should contain a single element
			for ( Object cond_name : node.getDetails().keySet() ) { 
				Constraint cond = StructureFactory.eINSTANCE.createConstraint();
				cond.setName((String)cond_name);
				cond.setBody(ExpressionParser.parse(context, kermetaUnit, (String)node.getDetails().get(cond_name), monitor));
				cond.setStereotype(ConstraintType.PRE_LITERAL);
				cond.setPreOwner(currentOperation);

				currentOperation.getPre().add(cond);
				nestedAnnotMap.put(node, cond);
			}
		}
		// node.getSource() == "kermeta.post"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_POST)) {
			// "node.getDetails()" should contain a single element
			for ( Object cond_name : node.getDetails().keySet() ) { 
				Constraint cond = StructureFactory.eINSTANCE.createConstraint();
				cond.setName((String)cond_name);
				cond.setBody(ExpressionParser.parse(context, kermetaUnit, (String)node.getDetails().get(cond_name), monitor));
				cond.setStereotype(ConstraintType.POST_LITERAL);
				cond.setPostOwner(currentOperation);

				currentOperation.getPost().add(cond);
				nestedAnnotMap.put(node, cond);
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
				(fr.irisa.triskell.kermeta.language.structure.Class) createTypeForEClassifier(exceptionEClassifier, null);
			currentOperation.getRaisedException().add(anException);
		}
		return null;
	}
	
	
	public Object visitEStructuralFeature(EStructuralFeature node) {
		currentProperty = datas.getProperty(EcoreHelper.getQualifiedName(node));
			
		// Visit all the annotations on Property
		if( currentProperty != null && currentProperty instanceof Property) {
			acceptList(node.getEAnnotations());
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
				currentOperation.setBody(ExpressionParser.parse(context, kermetaUnit, result, monitor));
				currentOperation.setIsAbstract(false);
			}
			// node.getDetails().get(key) == "isAbstract"
			// => EAnnotation for EOperation
			else if (key.equals(KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS)) {
				result = (String)node.getDetails().get(key);
				currentOperation.setIsAbstract(result.equals("true")?true:false);
			}
			// node.getDetails().get(key) == "isReadOnly"
			// => EAnnotation for EStructuralFeature
			else if(key.equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY_ISREADONLY_DETAILS)) {
				readonly = (String) node.getDetails().get(key);
				currentProperty.setIsReadOnly( Boolean.valueOf(readonly));
			}
			// Other entries correspond to the user-defined annotations (either standard 'documentation'
			// or specific ones)
			else {
				// Some annotations are processed elsewhere and must be ignored here:
				// - isComposite
				// - superOperation
				if(! (key.equals(KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS) || key.equals(KM2Ecore.ANNOTATION_SUPEROPERATION_DETAILS))) {
					result = (String)node.getDetails().get(key);
					Tag tag = StructureFactory.eINSTANCE.createTag();
					tag.setName(key);
					tag.setValue(result);
					fr.irisa.triskell.kermeta.language.structure.Object o = getObjectForEModelElement(node.getEModelElement()); 
					if (o!=null) {
						o.getOwnedTags().add(tag); // owned by this object
						o.getTag().add(tag); // this object is tagged
					}
				}
			}
		}
		return result;
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
			Tag tag = StructureFactory.eINSTANCE.createTag();
			tag.setName(KM2Ecore.ANNOTATION_DOCUMENTATION_DETAILS);
			tag.setValue(result);
			fr.irisa.triskell.kermeta.language.structure.Object o = getObjectForEModelElement(node.getEModelElement()); 
			if ( o != null ) {
				o.getOwnedTags().add( tag );
				o.getTag().add(tag);
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
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_GENMODEL)) {
			visitGenModelAnnotation(node);
		}
		// node.getSource() == "kermeta.inv"
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_INV)) {
			// "node.getDetails()" should contain a single element
			for ( Object inv_name : node.getDetails().keySet() ) { 
				Constraint inv = StructureFactory.eINSTANCE.createConstraint();
				inv.setStereotype(ConstraintType.INV_LITERAL);
				inv.setName((String)inv_name);
				inv.setBody(ExpressionParser.parse(context, kermetaUnit, (String)node.getDetails().get(inv_name), monitor));
				inv.setInvOwner(currentClassDefinition);
				
				currentClassDefinition.getInv().add(inv);
				nestedAnnotMap.put(node, inv);
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
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_GENMODEL)) {
			visitGenModelAnnotation(node);
		}
		// node.getSource() == "kermeta.derivedProp.getter"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY_GETTER)) {
			String getter = (String) node.getDetails().get(KM2Ecore.ANNOTATION_BODY_DETAILS);
			if (getter != null) {
				Expression exp = ExpressionParser.parse(context, kermetaUnit, getter, monitor);
				currentProperty.setGetterBody(exp);
				currentProperty.setIsGetterAbstract(false);
			}
		}
		// node.getSource() == "kermeta.derivedProp.setter"
		else if (node.getSource().equals(KM2Ecore.ANNOTATION_DERIVEDPROPERTY_SETTER)) {
			String setter = (String) node.getDetails().get(KM2Ecore.ANNOTATION_BODY_DETAILS);
			if (setter != null) {
				Expression exp = ExpressionParser.parse(context, kermetaUnit, setter, monitor);
				currentProperty.setSetterBody(exp);
				currentProperty.setIsSetterAbstract(false);
			}
		}
		// node.getSource() == "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"
		// used in ecore files generated from xsd
		else if(node.getSource().equals(KM2Ecore.ANNOTATION_EXTENDEDMETADATA)) {
			String elementkind = (String) node.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_KIND);
			String elementname = (String) node.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_NAME);
			EStructuralFeature prop = (EStructuralFeature)node.getEModelElement();
			if (elementkind != null && elementkind.equals("element") && prop.isDerived()) {
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
					// retrieve it and use it for this feature
					// DVK: clean implementation would rather parse the groupId in order to guide the search
					//		right now, it simply look in the current class for a possible match
					EClass containerClass =(EClass)prop.eContainer();
					Iterator<EAttribute> attIt = containerClass.getEAttributes().iterator();
					while(attIt.hasNext()){
						EAttribute att = attIt.next();
						Iterator<EAnnotation> annIt = att.getEAnnotations().iterator();						
						while(annIt.hasNext()){
							EAnnotation currAnn = annIt.next();
							if(currAnn.getSource().equals(KM2Ecore.ANNOTATION_EXTENDEDMETADATA)){
								String attIsGroup = (String)currAnn.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_KIND);
								if(attIsGroup != null && attIsGroup.equals("group")) {
									// we have found a group
									String possiblegroup = (String)currAnn.getDetails().get(KM2Ecore.ANNOTATION_EXTENDEDMETADATA_NAME);									
									if(groupId.equals(possiblegroup) || groupId.equals("#"+possiblegroup)){
										// this is the good group, use the attribute name
										group = att.getName();
									}
								}								
							}
						}
					}
				}
				
				// normal case : if has a multiplicity > 1
				if(prop.getUpperBound() != 1 ){
					// let's writte the getter body using all those data
					String body = //"kermeta::standard::OrderedSet<Docbook::BookType>.new"
						"do result := " +collection+ "<" +typeName+ ">.new" +
	"			self." +group+ ".each{fme |"+ 
	"				if fme.eStructuralFeatureName == \"" +elementname+ "\" then"+ 
	"					var val : "+typeName+""+
	"					val ?= fme.~value"+
	"					result.add(val) "+
	"				end"+
	"			} end";
					//body = "raise kermeta::exceptions::NotImplementedException.new ";
					Expression exp = ExpressionParser.parse(context, kermetaUnit, body, monitor);
					currentProperty.setGetterBody(exp);
						// it seem that in this case the setter is a nonsense
					currentProperty.setIsReadOnly( Boolean.valueOf(true));
				}
				else{
					// special case where the property has a multiplicity = 1
					// DVK: note: maybe we should deal with cases where 
					// the FeatureMap has a multiplicity > 1 and the derived prop a multiplicity = 1 ?
					String getterbody =
						"do "+
	"			if " + group + ".eStructuralFeatureName == \"" +elementname+ "\" then"+
	"				result ?= "+group+".~value"+
	"			end"+
	"	end";
					Expression exp = ExpressionParser.parse(context, kermetaUnit, getterbody, monitor);
					currentProperty.setGetterBody(exp);
					
					if(!currentProperty.isIsReadOnly()){
						String setterbody =
							"do "+
		"			"+group+" := ecore::EFeatureMapEntry.new"+
		"			"+group+".eStructuralFeatureName := \"" +elementname+"\""+
		"			"+group+".~value := value"+
		"	end";
						Expression expsetter = ExpressionParser.parse(context, kermetaUnit, setterbody, monitor);
						currentProperty.setSetterBody(expsetter);
					}
				}				
			}
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
		for (Object next : currentClassDefinition.getSuperType()) {
			Type t = (Type) next;
			buildSuperTypeBindings(
					t,
					node.getDetails(),
					getVisibleTypeVariables((EClass) node.getEModelElement()));
		}
	}
	
	/**
	 * This method completes the description of a supertype of currently visited class by
	 * adding type variable bindings structure if the supertype is parameterized.  
	 * @param supertype  - a supertype of the class
	 * @param map        - map containing all parameterized supertypes of the class
	 * @param tVars      - list of visible type variables
	 */
	protected void buildSuperTypeBindings(Type supertype, EMap<String, String> map, ArrayList<TypeVariable> tVars) {
		// Iterate over all annotation entries - each entry corresponds to a parameterized
		// supertype of currently visited class
		for(Object nextEntry : map) {
			// 1- Get qualified name of current parameterized supertype
			EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) nextEntry;
			String qName = entry.getTypedValue();
			
			// 2- Get Type from qName (a class cannot inheritate from a TypeVariable)
			ArrayList<String> params = new ArrayList<String>();
			Type t = analyseQualifiedName(qName, tVars, params);
			
			// 3- Compare with supertype in parameter in case it is a ParameterizedType
			// (otherwise, it can't have any TypeVariableBinding)
			if(t instanceof ParameterizedType) {
				ParameterizedType pType = (ParameterizedType) supertype;
				if(pType.getTypeDefinition() == ((ParameterizedType) t).getTypeDefinition()) {
					TypeVariableBinding tvBinding = null;
					int i = 0;
					for(Object next : params) {
						String tVarName = (String) next;
						tvBinding = StructureFactory.eINSTANCE.createTypeVariableBinding();
					
						// Set binding variable
						tvBinding.setVariable( (TypeVariable) pType.getTypeDefinition().getTypeParameter().get(i) );
					
						// Set binding type
						tvBinding.setType(getTypeHierarchyFromQualifiedName(tVarName, tVars));
					
						// Add binding to bindings list
						pType.getTypeParamBinding().add(tvBinding);
						i++;
					}
				}
			}
		}
	}
	
}
