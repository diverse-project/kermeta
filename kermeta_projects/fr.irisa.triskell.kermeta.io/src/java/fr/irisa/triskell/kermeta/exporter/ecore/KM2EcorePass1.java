/* $Id: KM2EcorePass1.java,v 1.61 2008-05-28 13:37:12 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KM2EcorePass1.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 11 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Exports KM or KMT to Ecore. 
 */

package fr.irisa.triskell.kermeta.exporter.ecore;


import java.util.Hashtable;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.kermeta.ecore.model.helper.EcoreModelHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.model.internal.TagHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.parser.helper.KMTHelper;

import org.kermeta.log4j.util.LogConfigurationHelper;


/**
 * Exports KM or KMT to Ecore.
 * Pass one fills the km2ecoremapping hashtable.
 */
public class KM2EcorePass1 extends KM2Ecore {

	final static public Log internalLog = LogConfigurationHelper.getLogger("KMT2Ecore.pass1");
	
	/** The name of the currently visited element */
	protected String current_name;
	
	/** The path of the currently visited package. Used to set the nsUri of packages (ie "//foo/bar") */
	protected String current_ppath = "";
	
	/** The enumeration that is currently visited */
	protected EEnum current_eenum;
	
	protected KM2KMTPrettyPrinter prettyPrinter;


	/**
	 * @param resource : the resource to populate
	 * @param mapping : Hastable containing the newly created object mapping
	 */
	public KM2EcorePass1(Resource resource, Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> mapping, KermetaUnit kermetaUnit, EDataType kermetaTypesAlias, ExporterOptions exporterOptions) {
		super(resource, kermetaUnit, kermetaTypesAlias, exporterOptions);
		km2ecoremapping = mapping;
		// PrettyPrinter that will convert the operation body into a String that will be stored as an Ecore
		// annotation since ecore metamodel does not contains a behavior.
		prettyPrinter = new KM2KMTPrettyPrinter();
	}

	public Object visitModelingUnit(ModelingUnit node) {
				
		EAnnotation annotation = createAnnotationForModelingUnit(node);
		ecoreResource.getContents().add( annotation );
		
		for ( Tag tag : node.getOwnedTags() ) {
			annotation = (EAnnotation) accept(tag);
			ecoreResource.getContents().add( annotation );
		}
		
		Iterator<Package> iterator = node.getPackages().iterator();
		while ( iterator.hasNext() )
			accept( iterator.next() );	
	
		return null;
	}

	public EAnnotation createAnnotationForModelingUnit(ModelingUnit node) {

		/*
		 * 
		 * Creating the text of the annotation.
		 * 
		 */
		StringBuffer requiresSource = new StringBuffer();
		Iterator <Require> itOnRequires = node.getRequires().iterator();
		while ( itOnRequires.hasNext() )
			requiresSource.append(itOnRequires.next().getUri() + "|");

		String usingsSource = "";
		Iterator <Using> itOnUsings = node.getUsings().iterator();
		while ( itOnUsings.hasNext() )
			usingsSource += itOnUsings.next().getQualifiedName() + "|";
		
		/*
		 * 
		 * Creating the annotation for requires and usings.
		 * 
		 */
		EAnnotation annotation = EcoreModelHelper.EAnnotation.create( "ModelingUnit" );
		
		if ( ! requiresSource.equals("") )
			EcoreModelHelper.EAnnotation.addDetails(annotation, "require", requiresSource.toString());
		
		if ( ! usingsSource.equals("") )
			EcoreModelHelper.EAnnotation.addDetails(annotation, "using", usingsSource);
		
		return annotation;
	}	

	/**
	 * Convert kermeta Package into ecore EPackage, and the nested packages of given
	 * package as well.
	 */
	public Object visitPackage(Package node) {
		
		String name = KMTHelper.getUnescapedIdentifier(node.getName());
		String nsPrefix = node.getName();
		String nsURI = null;
		
		internalLog.debug("Visiting Package: "+ name);
		
		// if the uri is given, also we use it to set the package's uri.
		// else a default uri is generated and set
		if(node.getUri() != null && !node.getUri().equals(""))
			nsURI = node.getUri();
		else
			nsURI = ecoreResource.getURI().toString() + (node==currentPackage?"":"#/") + current_ppath;	

		EPackage newEPackage = EcoreModelHelper.EPackage.create(name, nsURI, nsPrefix);
		
		// Reset the current_path when we deal a new root packages
		if ( node.eContainer() instanceof ModelingUnit ) {
			current_ppath = name;
		}
		
		// Add the created EPackage to km2ecoremapping
		km2ecoremapping.put(node,newEPackage);
		
		if ( node.eContainer() instanceof ModelingUnit )
			ecoreResource.getContents().add( newEPackage );
		
		if (tracer != null)
		    tracer.addMappingTrace(node,newEPackage,node.getName() + " is mapped to " + newEPackage.getName());

		// Visit the nested packages
		for (Object p : node.getNestedPackage()) {
			Package next = (Package)p;
			current_ppath += "/" + next.getName();
			newEPackage.getESubpackages().add((EPackage) accept(next));
			int cl = current_ppath.length();
			current_ppath = current_ppath.substring(0, cl - next.getName().length()-1);
		}
		
		// Visit the type definitions
		for (Object next : node.getOwnedTypeDefinition()) {
			Object o = accept((EObject)next);
			if (o != null) {
				if (o instanceof EClass) {
					newEPackage.getEClassifiers().add((EClass) o);
				} else if (o instanceof EDataType) {
					newEPackage.getEClassifiers().add((EClassifier) o);
				} else if (o instanceof EPackage) {
					newEPackage.getESubpackages().add((EPackage) o);
				}
			} else
				throw new KM2ECoreConversionException("A type definition in package '"+node.getName() + "' could not be resolved (" + ((TypeDefinition) next).getName() + ")");
		}
		// Visit the tags of package and convert them into EAnnotations
		setTagAnnotations(node, newEPackage);
		
		// Add the created EPackage to km2ecoremapping
		//km2ecoremapping.put(node,newEPackage);
		
		return newEPackage;
	}


	/**
	 * Convert model type definitions into EPackages
	 * @param node
	 * @return
	 * FIXME CF ModelType 07-06-06
	 */
	/*public Object visitModelType(ModelType node) {
		current_name = node.getName();
		internalLog.debug(loggerTabs + "Visiting Package: " + current_name);
		loggerTabs.increment();
		
		EPackage newEPackage = EcoreFactory.eINSTANCE.createEPackage();
		newEPackage.setNsPrefix(current_name);
		newEPackage.setNsURI(ecoreResource.getURI().toString() + "#/" + current_ppath);
		
		newEPackage.setName( KMTHelper.getUnescapedIdentifier(current_name) );
		
		if (ecoreExporter.tracer != null)
			ecoreExporter.tracer.addMappingTrace(node,newEPackage,node.getName() + " is mapped to " + newEPackage.getName());
		
		//Visit the type definitions
		for (Object next : node.getIncludedTypeDefinition()) {
			Object o = accept((EObject) next);
			if (o != null)
				newEPackage.getEClassifiers().add((EClassifier) o);
			else
				throw new KM2ECoreConversionException("A type definition in model type '" + node.getName() + "' could not be resolved (" + o + ")");
		}
		//Visit the tags of the modeltype and convert them into EAnnotations
		setTagAnnotations(node, newEPackage);
		
		//Add a tag indicating that the generated EPackage came from a modelType
		ecoreExporter.addAnnotation(
				newEPackage,
				KM2Ecore.ANNOTATION,
				"isModelType",
				"true",
				null);
		
		km2ecoremapping.put(node, newEPackage);
		loggerTabs.decrement();
		return newEPackage;
	}*/	

	/** 
	 * Converts a kermeta ClassDefinition into EClass
	 */
	public Object visitClassDefinition(ClassDefinition node) {
		EClass newEClass=null;
		current_name = node.getName();
		internalLog.debug("Visiting ClassDefinition: "+ current_name);
		try{
			newEClass = EcoreFactory.eINSTANCE.createEClass();
			
			// Patch that removes the escape characters ('~') used to avoid collisions with the KerMeta keywords. 
			newEClass.setName( KMTHelper.getUnescapedIdentifier(current_name) );
			
			newEClass.setAbstract(node.isIsAbstract());
			
			if (tracer != null) // null if user did not want a serializ. of trace
			    tracer.addMappingTrace(node,newEClass, node.getName() + " is mapped to " + newEClass.getName());
			
			// Create annotations for Comments
			setTagAnnotations((NamedElement)node, (EModelElement)newEClass);
			
			// Visit TypeParameters - One annotation per type parameter
			for(Object tv : node.getTypeParameter()) {
				newEClass.getETypeParameters().add((ETypeParameter) accept((ObjectTypeVariable) tv));
			}
			
			// Owned Attributes
			for (Object next : node.getOwnedAttribute()) {
				Object o = accept((EObject)next);
				if (o != null)
					newEClass.getEStructuralFeatures().add((EStructuralFeature) o);
				else
					throw new KM2ECoreConversionException("An attribute in class definition '"+node.getName() + "' could not be resolved");
			}
			
			// Owned operations
			if( !super.exporterOptions.isOnlyStructural ) {
				for (Object next : node.getOwnedOperation()) {
					Object o = accept((EObject)next);
					if (o != null)
						newEClass.getEOperations().add((EOperation) o);
					else
						throw new KM2ECoreConversionException("An operation in package '"+node.getName() + "' could not be resolved");				
				}
			}
			
			// Create an annotation to hold the class inv	
			for (Object next : node.getInv()) {
				Constraint inv = (Constraint) next;
				
				// Dealing with the current invariant (=> saved as an annotation)
				String invBody = (String) prettyPrinter.accept(inv.getBody());
				String invName = inv.getName();
				EAnnotation eAnnot = 
					addConstraintAnnotation( 
							newEClass,
							KM2Ecore.ANNOTATION_INV,
							invName,
							invBody,
							null);

				// Dealing with the annotations of the current invariant
				// (=> saved as annotations referring the invariant annotation)
				for (Object nextTag : inv.getTag()) {
					Tag t = (Tag) nextTag;
					String tagKey = t.getName();
					String tagValue = t.getValue();
					addConstraintAnnotation(
						newEClass,
						KM2Ecore.ANNOTATION_NESTED_DOC,
						tagKey,
						tagValue,
						eAnnot);
				}
				
			}
			if ( kermetaUnit.getTypeDefinitionByQualifiedName( NamedElementHelper.getQualifiedName(node) ) != null) {
				// Add the created EClass to km2ecoremapping
				km2ecoremapping.put(node,newEClass);
			}
		}
		catch(Exception e) {
			internalLog.error("Visiting ClassDefinition: "+ current_name + ", Exception: " + e.getMessage() ,e);
			e.printStackTrace();
		}
		return newEClass;
	}
	

	/**
	 * Convert Enumeration into EEnumeration.
	 * 
	 * Note : in kermeta metamodel, Enumeration inherits DataType which inherits
	 * TypeDefinition.
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumeration(fr.irisa.triskell.kermeta.language.structure.Enumeration)
	 */
	public Object visitEnumeration(Enumeration node) {
		// Patch that removes the escape characters ('~') used to avoid collisions with the KerMeta keywords. 		
		String name = KMTHelper.getUnescapedIdentifier(node.getName());
		EEnum newEEnum = EcoreModelHelper.EEnum.create(name, true);
		// set the current_eenum for the visit of the related EnumLiterals
		current_eenum = newEEnum;
		// Awful cast : we KNOW that type of object is EnumerationLiteral
		for (Object o : node.getOwnedLiteral()) { this.accept((EnumerationLiteral)o); }
		setTagAnnotations(node, newEEnum);
		km2ecoremapping.put(node, newEEnum);
		return newEEnum;
	}
	

	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitEnumerationLiteral(fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral)
	 */
	public Object visitEnumerationLiteral(EnumerationLiteral node) {
		EEnumLiteral literal = EcoreModelHelper.EEnumLiteral.create(node.getName(), node.getName());
		current_eenum.getELiterals().add(literal);
		literal.setValue(current_eenum.getELiterals().size()-1);
		return literal;
	}
	
	
	/** Define the annotation for the Tags associated to the given node 
	 * @param node the kermeta node that contains the tags to convert into ecore annotations 
	 * @param newEModelElement the ecore element that corresponds to the given kermeta node 
	 */
	protected void setTagAnnotations(NamedElement node, EModelElement newEModelElement) {
		/*for (Object next : node.getTag()) {
			Tag t = (Tag) next;
			addAnnotation( 
				newEModelElement,
				KM2Ecore.ANNOTATION,
				t.getName(),
				t.getValue(),
				null);
		}*/
		
		for (Tag t : node.getTag()) {
			addAnnotation( 
				newEModelElement,
				KM2Ecore.ANNOTATION,
				t.getName(),
				t.getValue(),
				null);
		}
	}

	
	/**
	 * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitTypeVariable(fr.irisa.triskell.kermeta.language.structure.TypeVariable)
	 */
	public Object visitObjectTypeVariable(ObjectTypeVariable node) {
		ETypeParameter newETypeParameter = (ETypeParameter) km2ecoremapping.get(node);
		if(newETypeParameter == null) {
			newETypeParameter = EcoreFactory.eINSTANCE.createETypeParameter();
			newETypeParameter.setName(node.getName());
			km2ecoremapping.put(node, newETypeParameter);
		}		
		return newETypeParameter;
	}
	
	
	/**
	 * Convert an kermeta Operation into EOperation
	 */
	public Object visitOperation(Operation node) {
		current_name = node.getName();
		internalLog.debug("Visiting Operation: "+ current_name);
		
		EOperation newEOperation = EcoreFactory.eINSTANCE.createEOperation();
		
		// Patch that removes the escape characters ('~') used to avoid collisions with the KerMeta keywords. 
		newEOperation.setName( KMTHelper.getUnescapedIdentifier(current_name) );
		
		// Create an annotation to hold the isAbstract boolean
		if (node.isIsAbstract()) { 
			Boolean b = new Boolean(node.isIsAbstract());
			addAnnotation( 
					newEOperation,
					KM2Ecore.ANNOTATION,
					KM2Ecore.ANNOTATION_ISABSTRACT_DETAILS,
					b.toString(),
					null);
		}
		
		// Create an annotation to hold the operation body
		if (node.getBody() != null) {
			// (if "typedef" is false, then it means that prettyPrinter is not in typdef
			// context, so it will prettyPrint visited node accordingly)
			prettyPrinter.setTypedef(false);
			String bodyString = (String)prettyPrinter.accept(node.getBody());
			addAnnotation( 
					newEOperation,
					KM2Ecore.ANNOTATION,
					KM2Ecore.ANNOTATION_BODY_DETAILS,
					bodyString,
					null);	
		}
		
		// Create an annotation to hold the pre operations	
		for (Object next : node.getPre()){
			Constraint preCond = (Constraint) next;
			String preBody = (String) prettyPrinter.accept(preCond.getBody());
			String preName = preCond.getName();
			EAnnotation eAnnot =
				addConstraintAnnotation( 
					newEOperation,
					KM2Ecore.ANNOTATION_PRE,
					preName,
					preBody,
					null);
			
			// Dealing with the annotations of the current precond
			// (=> saved as annotations referring the precond annotation)
			for (Object nextTag : preCond.getTag()) {
				Tag t = (Tag) nextTag;
				String tagKey = t.getName();
				String tagValue = t.getValue();
				addConstraintAnnotation(
					newEOperation,
					KM2Ecore.ANNOTATION_NESTED_DOC,
					tagKey,
					tagValue,
					eAnnot);
			}
		}
			
		// Create an annotation to hold the post operations
		for (Object next : node.getPost()){
			Constraint postCond = (Constraint) next;
			String postBody = (String) prettyPrinter.accept(postCond.getBody());
			String postName = postCond.getName();
			EAnnotation eAnnot =
				addConstraintAnnotation( 
					newEOperation,
					KM2Ecore.ANNOTATION_POST,
					postName,
					postBody,
					null);

			// Dealing with the annotations of the current postcond
			// (=> saved as annotations referring the postcond annotation)
			for (Object nextTag : postCond.getTag()) {
				Tag t = (Tag) nextTag;
				String tagKey = t.getName();
				String tagValue = t.getValue();
				addConstraintAnnotation(
					newEOperation,
					KM2Ecore.ANNOTATION_NESTED_DOC,
					tagKey,
					tagValue,
					eAnnot);
			}
		}
		
		newEOperation.setOrdered(node.isIsOrdered());
		newEOperation.setUnique(node.isIsUnique());
		newEOperation.setLowerBound(node.getLower());
		newEOperation.setUpperBound(node.getUpper());
		// upper = O for operation is meaningless 
		if (node.getUpper() == 0) newEOperation.setUpperBound(1);
		
		// Parameters
		for (Object next : node.getOwnedParameter())
		{
			Object o = accept((EObject)next);
			if (o != null)
				newEOperation.getEParameters().add((EParameter) o);
			else
				throw new KM2ECoreConversionException("A tag in '"+node.getName() + "' could not be resolved");				
		}

		// In case type of the operation has a kermeta special type, create the KermetaSpecialTypes
		// alias to handle the operation type in the Ecore file
		/*if(/*node.getType() instanceof TypeVariable ||/ node.getType() instanceof FunctionType) {
			// KermetaSpecialTypes alias is created only once for all properties/parameters/operations
			// that have a kermeta special type as type
			if(kermetaTypesAlias == null) {
				initKermetaTypesAlias((Package) node.eContainer().eContainer());
			}
		}*/

		setTagAnnotations(node, newEOperation);

		// TypeParameters : create one annotation per type parameter 
		for ( Object next : node.getTypeParameter() ) {
			newEOperation.getETypeParameters().add((ETypeParameter) accept((ObjectTypeVariable) next));
		}
		
		// The if condition is a special issue for the compiler
		if( km2ecoremapping.get(node) == null ) {
			km2ecoremapping.put(node,newEOperation);
		}
		return newEOperation;
	}

	
	/**
	 * Convert Parameter into EParameter
	 */
	public Object visitParameter(Parameter node) {
		internalLog.debug("Visiting Parameter: "+ node.getName());
		
		EParameter newEParameter = EcoreFactory.eINSTANCE.createEParameter();
		
		// Patch that removes the escape characters ('~') used to avoid collisions with the KerMeta keywords. 
		newEParameter.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		newEParameter.setLowerBound(node.getLower());
		newEParameter.setUpperBound(node.getUpper());
		newEParameter.setOrdered(node.isIsOrdered());
		newEParameter.setUnique(node.isIsUnique());

		// In case type of the parameter has a kermeta special type, create the KermetaSpecialTypes
		// alias to handle the parameter type in the Ecore file
		/*if(/*node.getType() instanceof TypeVariable  ||/ node.getType() instanceof FunctionType) {
			// KermetaSpecialTypes alias is created only once for all properties/parameters/operations
			// that have a kermeta special type as type
			if(kermetaTypesAlias == null) {
				initKermetaTypesAlias((Package) node.eContainer().eContainer().eContainer());
			}
		}*/
		
		km2ecoremapping.put(node,newEParameter);
		return newEParameter;
	}
	

	/**
	 * Convert Property into an EStructuralFeature. More specifically, 
	 * if the Propety type is a primitive type, the ecore converted element will
	 * be an EAttribute, otherwise it will be an EReference.
	 */
	public Object visitProperty(Property node) {
		internalLog.debug("Visiting Property: "+ node.getName());
		
		EStructuralFeature newEStructuralFeature = null;
		EReference newEReference = null;
		EAttribute newEAttribute = null;
		
		// If this is composite we have to check the type
		// same for derived properties, it may have to be an attribute
		if(isPropertyValidForEAttribute(node))
		{
			newEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
			newEStructuralFeature = newEAttribute;
			newEAttribute.setID(node.isIsID());				
		}
		else 
		{ 	// not an attribute => reference 
			newEReference =EcoreFactory.eINSTANCE.createEReference();
			newEStructuralFeature = newEReference;
		}
		
		// If the EStructuralFeature that is created is an EReference
		if (newEReference!= null)
		{
			if (node.isIsDerived()) 
				newEReference.setContainment(false);
			newEReference.setContainment(node.isIsComposite());
		}
		else
		{
			if (isPropertyValidForEAttribute(node) && !node.isIsComposite()){
				//	attribute
				/*ecoreExporter.messages.addWarning(
						"The reference to type '"+ TypeHelper.getMangledQualifiedName(node.getType()) + 
						"' needs to be translated into an Ecore data type and then must be put into an EAttribute.\n"
						,node);*/
			}
			// Add an Annotation so that it will be correctly back translated to km.
			addAnnotation( 
					newEAttribute,
					KM2Ecore.ANNOTATION,
					KM2Ecore.ANNOTATION_ISCOMPOSITE_DETAILS,
					node.isIsComposite()?"true":"false",
					null);
		}
		
		// Set the new StructuralFeature values

		// Patch that removes the escape characters ('~') used to avoid collisions with the KerMeta keywords. 
		newEStructuralFeature.setName( KMTHelper.getUnescapedIdentifier(node.getName()) );
		
		newEStructuralFeature.setDerived(node.isIsDerived());
		if (node.isIsDerived()){
			newEStructuralFeature.setTransient(true);
			newEStructuralFeature.setVolatile(true);
		}
		newEStructuralFeature.setChangeable(!node.isIsReadOnly());				
		newEStructuralFeature.setOrdered(node.isIsOrdered());
		newEStructuralFeature.setUnique(node.isIsUnique());
		newEStructuralFeature.setLowerBound(node.getLower());
		newEStructuralFeature.setUpperBound(node.getUpper());
		newEStructuralFeature.setDefaultValueLiteral(node.getDefault());
		// newEStructuralFeature.setDefaultValue() -> no default value
		setTagAnnotations(node, newEStructuralFeature);
		
		// In case type of the property has a kermeta special type, create the KermetaSpecialTypes
		// alias to handle the property type in the Ecore file
		/*if(/*node.getType() instanceof TypeVariable  ||* node.getType() instanceof FunctionType) {
			// KermetaSpecialTypes alias is created only once for all properties/parameters/operations
			// that have a kermeta special type as type
			if(kermetaTypesAlias == null) {
				initKermetaTypesAlias((Package) node.eContainer().eContainer());
			}
		}*/
		
		km2ecoremapping.put(node,newEStructuralFeature);
		return newEStructuralFeature;
	}


	/**
     * Tag is a special model element that we should have
     * @see fr.irisa.triskell.kermeta.visitor.KermetaVisitor#visit(fr.irisa.triskell.kermeta.language.structure.Tag)
     */
    public Object visitTag(Tag node) {
    	EAnnotation annotation=null;
		current_name = node.getName();
				
		if( TagHelper.KERMETA_DOCUMENTATION.equals(current_name) ) {
			//	deal with special case of documentation
			annotation = EcoreModelHelper.EAnnotation.create(KM2Ecore.ANNOTATION_GENMODEL);
			EcoreModelHelper.EAnnotation.addDetails(annotation, KM2Ecore.ANNOTATION_DOCUMENTATION_DETAILS, KMTHelper.formatTagValue(node.getValue()));
		} else {
			// normal annotations
			annotation = EcoreModelHelper.EAnnotation.create(KM2Ecore.ANNOTATION);
			EcoreModelHelper.EAnnotation.addDetails(annotation, current_name, KMTHelper.formatTagValue(node.getValue()));
		}

		km2ecoremapping.put(node,annotation);
		return annotation;
    }
    
    
	/**
	 * @see kermeta.visitor.MetacoreVisitor#visit(PrimitiveType)
	 */
	public Object visitPrimitiveType(PrimitiveType node) {
		String qualifiedName = TypeHelper.getMangledQualifiedName(node);
		
		if ( qualifiedName == null ) 
			throw new KM2ECoreConversionException(
				"KM2Ecore error : could not find InstanceType for '" + node.getName() +"' PrimitiveType; ( getInstanceType: " +
				node.getInstanceType().toString() + ")");		
		
		/*
		 * 
		 * Getting the instance class name if it is a known one.
		 * 
		 */
		String instanceClassName = KM2Ecore.primitive_types_mapping.get(qualifiedName);
		
		/*
		 * 
		 * Creating the datatype. If instance class name is null, the java.lang.Object is used by default.
		 * 
		 */
		EDataType datatype = EcoreModelHelper.EDataType.create(node.getName(), instanceClassName);

		/*
		 * 
		 * If instance class name is null, let's create a tag to keep track of a special process.
		 * 
		 */
		if ( instanceClassName == null ) {
			datatype.setInstanceClassName("java.lang.Object");
			addAnnotation( 
					datatype,
					KM2Ecore.ANNOTATION,
					KM2Ecore.ANNOTATION_ALIAS_DETAILS,
					TypeHelper.getMangledQualifiedName(node.getInstanceType()),
					null);
		}
		
		setTagAnnotations(node, datatype);
		km2ecoremapping.put(node, datatype);
		return datatype;
	}
	
	
	/**
	 * @param newEPackage
	 */
	/*protected void setUnitDependencies(EPackage newEPackage) {
		for(Object next : ecoreExporter.kermetaUnit.importedUnits) {
			KermetaUnit ku = (KermetaUnit) next;
			ecoreExporter.addAnnotation( 
					newEPackage,
					KM2Ecore.ANNOTATION_REQUIRE,
					ku.getUri(),
					ku.getUri(),
					null);
			
		}
	}
*/

	/**
	 * This method allocates and initializes the KermetaSpecialTypesAlias datatype in order
	 * to represent the type of properties/parameters/operations that have a kermeta special
	 * type (TypeVariable/FunctionType) as type.
	 * @param pack the package that will contain the newly allocated DataType 
	 */
	/*protected void initKermetaTypesAlias(Package pack) {
		kermetaTypesAlias = EDataTypeHelper.create( KM2Ecore.KERMETA_TYPES );
		EPackage crtEPack = (EPackage) km2ecoremapping.get(pack);
		crtEPack.getEClassifiers().add(kermetaTypesAlias);
	}*/
}
