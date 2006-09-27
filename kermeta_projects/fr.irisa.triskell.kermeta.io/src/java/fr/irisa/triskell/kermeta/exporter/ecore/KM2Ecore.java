/* $Id: KM2Ecore.java,v 1.26 2006-09-27 15:45:26 dtouzet Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KM2EcoreExporter.java
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

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessageManager;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.traceability.helper.Tracer;


/**
 * Exports KM or KMT to Ecore.
 * 
 * Notes about the Ecore representation of Kermeta programs.
 * Due to the lack of some features in Ecore, some data are stored in a special way inside Ecore models.
 * - superoperation are stored in Annotations named KerMeta.SuperOperations
 * 		both the reference and a detail map are generated. If you generate these manually be sure to have them consistent 
 * 		(ie. that points to the same operation)
 * - isAbstract boolean is stored in the annotation named "KerMeta" in a detail map with key="isAbstract"
 * - RaisedException: are store in an annotation named KerMeta.RaisedExceptions. we do not use the ecore EExcetions field because 
 * 		this causes the EMF model generator to fail
 * - TypeParameters: are stored in an annotation named KerMeta.TypeParameters
 * - Derived property
 */
public class KM2Ecore {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore");
	final static public String ECORE_NSURI = "http://www.eclipse.org/emf/2002/Ecore"; 
	
	protected String root_pname;
	
	// The kermeta unit corresponding to the <model> to convert in Ecore format.
	protected KermetaUnit kermetaUnit;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	public Resource traceResource = null;
	
	public Tracer tracer = null;
	
	// the depending resources informations
	/** The directory where to save the depending files */
	protected String ecoreGenDirectory = null;
	/** The list of available ecore resources provided by the user */
	protected List<String> ecoreFileList;
	
	/**
	 * The list of unit messages.
	 * This contains typically errors and warnings detected while building the model
	 */
	public KMUnitMessageManager messages;	

	/**
	 * <code>kmt2ecoremapping</code> is a trace mapping. 
	 * used to simplify the process in pass2
	 */
	public Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject> km2ecoremapping =  new Hashtable<fr.irisa.triskell.kermeta.language.structure.Object,EObject>();
	
	/** this map is used to determine the java object corresponding to a kermeta primitive type */ 
    public static Hashtable<String,String> primitive_types_mapping;
    static {
    	primitive_types_mapping = new Hashtable<String,String>();
    	primitive_types_mapping.put("kermeta::standard::Character", "char");
    	primitive_types_mapping.put("kermeta::standard::Character",	"java.lang.Character");
    	primitive_types_mapping.put("kermeta::standard::Integer",	"java.lang.Integer");
    	primitive_types_mapping.put("kermeta::standard::Boolean",	"boolean");
    	primitive_types_mapping.put("kermeta::standard::Boolean",	"java.lang.Boolean");
    	primitive_types_mapping.put("kermeta::standard::String",	"java.lang.String");
    	primitive_types_mapping.put("kermeta::standard::Object",	"java.lang.Object");
    	primitive_types_mapping.put("kermeta::standard::UnlimitedNatural",	"java.lang.Integer");
    	
    }
 
    // Supported EAnnotation names, along with the type of elements they can be associated with:
    //  => All annotated elements
    public final static String ANNOTATION = "kermeta";
    public final static String ANNOTATION_DOCUMENTATION = "http://www.eclipse.org/emf/2002/GenModel";
    //  => Packages
    public final static String ANNOTATION_REQUIRE = ANNOTATION + ".req";
    //  => ClassDefs 
    public final static String ANNOTATION_INV = ANNOTATION + ".inv";
    //  => Operations
    public final static String ANNOTATION_PRE = ANNOTATION + ".pre";
    public final static String ANNOTATION_POST = ANNOTATION + ".post";
    public final static String ANNOTATION_RAISEDEXCEPTION = ANNOTATION + ".raisedExceptions";
    //  => ClassDefs, Operations
    public final static String ANNOTATION_NESTED_DOC = ANNOTATION_INV + ".doc";
    public final static String ANNOTATION_TYPEPARAMETER = ANNOTATION + ".typeParameters";
    //  => Properties
    public final static String ANNOTATION_DERIVEDPROPERTY_GETTER = 	ANNOTATION + "derivedProp.getter";
    public final static String ANNOTATION_DERIVEDPROPERTY_SETTER = 	ANNOTATION + "derivedProp.setter";
    
    // Available static keys for the "kermeta" EAnnotation, along with the type of elements
    // these entries relate to:
    //   => All annotated elements
    public final static String ANNOTATION_DOCUMENTATION_DETAILS = "documentation";
    //   => Operations, invraiants, pre/post conditions
    public final static String ANNOTATION_BODY_DETAILS = "body";
    //   => Properties
    public final static String ANNOTATION_ISCOMPOSITE_DETAILS = "isComposite";
    public final static String ANNOTATION_DERIVEDPROPERTY_ISREADONLY_DETAILS = "isReadOnly";
    //   => ClassDefs
    public final static String ANNOTATION_ISABSTRACT_DETAILS = "isAbstract";
    //   => Operations
    public final static String ANNOTATION_SUPEROPERATION_DETAILS = "superOperation";
    //   => PrimitiveTypes
    public final static String ANNOTATION_ALIAS_DETAILS = "alias";

    
	/**
	 * @param resource : the resource to populate
	 */
	public KM2Ecore(Resource resource, KermetaUnit kunit) {
		ecoreResource = resource;
		kermetaUnit   = kunit;
		messages = new KMUnitMessageManager(kermetaUnit);
		ecoreGenDirectory = kunit.getUri().substring(0, kunit.getUri().lastIndexOf("/")+1);
		ecoreFileList = new ArrayList<String>();
		internalLog.info("Directory for ecore generation : " + ecoreGenDirectory);
	}
	
	public KM2Ecore(Resource resource, Resource traceresource, KermetaUnit kunit) {
		this(resource, kunit);
		traceResource = traceresource;
		tracer = new Tracer(traceResource);
	}
	
	/**
	 * @param ecoregendir The directory where to generate ecore dependencies
	 */
	public KM2Ecore(Resource resource, Resource traceresource, KermetaUnit kunit, String edir, List<String> elist) {
		this(resource, kunit, edir, elist);
		traceResource = traceresource;
		tracer = new Tracer(traceResource);
	}
	
	/**
	 * @param ecoregendir The directory where to generate ecore dependencies
	 */
	public KM2Ecore(Resource resource, KermetaUnit kunit, String edir, List<String> elist) {
		this(resource, kunit);
		ecoreGenDirectory = (edir==null)?null:edir+"/";
		ecoreFileList = (elist==null)?new ArrayList<String>():elist;
		if (ecoreFileList.size() == 0 && edir == null)
			ecoreGenDirectory = kunit.getUri().substring(0, kunit.getUri().lastIndexOf("/"));
		internalLog.info("Directory for ecore generation : " + ecoreGenDirectory);
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(Package root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		KM2EcorePass1 pass1 =  new KM2EcorePass1(ecoreResource, km2ecoremapping, this);
		KM2EcorePass2 pass2 =  new KM2EcorePass2(ecoreResource, km2ecoremapping, this);
		Object result =  pass1.exportPackage(root_package);
		pass2.exportPackage(root_package);
		return result;
	}
	
	/**
	 * add the given info in the annotation, eventually create it
	 * @param annotedModelElement
	 * @param annotationName the name of the annotation "source"
	 * @param annotationDetailKey (optional)
	 * @param annotationDetailValue
	 * @param referedFObject the object that may be refered. can be null
	 */
	public void addAnnotation( 
			EModelElement annotedModelElement,
			String annotationName,
			String annotationDetailKey,
			String annotationDetailValue,
			EObject referedEObject
			) {
		// find the Annotation or create a new one
		EAnnotation newEAnnotation = annotedModelElement.getEAnnotation(annotationName);
		if (newEAnnotation == null){
			newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			newEAnnotation.setSource(annotationName);
			ecoreResource.getContents().add(newEAnnotation);
			annotedModelElement.getEAnnotations().add(newEAnnotation);
		}
		// add the info in the Details map
		if (annotationDetailKey != null)
			newEAnnotation.getDetails().put(annotationDetailKey, 
					annotationDetailValue);
		// try a direct link additionnaly to the detail map. 
		if (referedEObject != null) 
		{
			internalLog.debug(" adding annotation reference for " +annotationDetailKey + " = " + annotationDetailValue);
			newEAnnotation.getReferences().add(referedEObject);
		}
	}
	

	/**
	 * Create an annotation with the given detailled info.
	 * Compared to the 'addAnnotation' method, this one does not test whether a corresponding
	 * annotation already exists, but systematically create a new one.
	 * Used for managing the constraints annotations.
	 * @param annotedModelElement
	 * @param annotationName
	 * @param annotationDetailKey
	 * @param annotationDetailValue
	 * @param referedEObject
	 * @return the generated EAnnotation element
	 */
	public EAnnotation addConstraintAnnotation(
			EModelElement annotedModelElement,
			String annotationName,
			String annotationDetailKey,
			String annotationDetailValue,
			EObject referedEObject
			) {
		// find the Annotation or create a new one
		EAnnotation	newEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		newEAnnotation.setSource(annotationName);
		ecoreResource.getContents().add(newEAnnotation);
		annotedModelElement.getEAnnotations().add(newEAnnotation);
		// add the info in the Details map
		if (annotationDetailKey != null)
			newEAnnotation.getDetails().put(annotationDetailKey, annotationDetailValue);
		// try a direct link additionnaly to the detail map. 
		if (referedEObject != null) 
		{
			internalLog.debug(" adding annotation reference for " +annotationDetailKey + " = " + annotationDetailValue);
			newEAnnotation.getReferences().add(referedEObject);
		}
		return newEAnnotation;
	}

	
	/** tells wether the type of this property can be used in an ecore Attribute */
	public boolean isPropertyValidForEAttribute(Property property){
		Type type = property.getType();
		return (isPrimitiveEcoreType(type)||Enumeration.class.isInstance(type)||PrimitiveType.class.isInstance(type));
	}
	
	/**
	 * Indicates wether this type correspond to an Ecore primitive type
	 * @param type
	 * @return
	 */
	public boolean isPrimitiveEcoreType(Type type){
		String type_def_name="";
		if(type instanceof fr.irisa.triskell.kermeta.language.structure.Class){
			// retreive the qualified name of the definition of this class
			fr.irisa.triskell.kermeta.language.structure.Class fClass = (fr.irisa.triskell.kermeta.language.structure.Class)type;
			type_def_name = KMTHelper.getQualifiedName(fClass.getTypeDefinition());
			if (KM2Ecore.primitive_types_mapping.containsKey(type_def_name)) {
				return true;
			}
		}
		return false;
	}
	
	/** Accessor for kermetaUnit attribute */
	public KermetaUnit getKermetaUnit() {
		return kermetaUnit;
	}

	/**
	 * @return Returns the ecoreFileList.
	 */
	public List<String> getEcoreFileList() {
		return ecoreFileList;
	}

	/**
	 * @return Returns the ecoreGenDirectory.
	 */
	public String getEcoreGenDirectory() {
		return ecoreGenDirectory;
	}

	/**
	 * @param ecoreGenDirectory The ecoreGenDirectory to set.
	 */
	public void setEcoreGenDirectory(String ecoreGenDirectory) {
		this.ecoreGenDirectory = ecoreGenDirectory;
	}
}
