/* $Id: KM2Ecore.java,v 1.35 2007-07-13 16:26:25 cfaucher Exp $
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.message.KMUnitMessageManager;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
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
	
	protected EClass current_eclass;
	protected boolean isClassTypeOwner = true;
	
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

	/**
	 * This datatype is used as an extra datatype to represent (in the built Ecore file)
	 * the type of elements (properties/parameters/operations) that have a kermeta specific
	 * type (TypeVariable/FunctionType) as type.
	 * Such properties/parameters/operations will have this DataType as type, as well as an
	 * annotation that contains the name of this specific type. 
	 */
	protected EDataType kermetaTypesAlias = null;
	
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
    
    //
    public final static String KERMETA_TYPES = "_KermetaSpecialTypesAlias_";
 
    // Supported EAnnotation names, along with the type of elements they can be associated with:
    //  => All annotated elements
    public final static String ANNOTATION = "kermeta";
    public final static String ANNOTATION_DOCUMENTATION = "http://www.eclipse.org/emf/2002/GenModel";
    //  => Packages
    public final static String ANNOTATION_REQUIRE = ANNOTATION + ".req";
    //  => Operations
    public final static String ANNOTATION_PRE = ANNOTATION + ".pre";
    public final static String ANNOTATION_POST = ANNOTATION + ".post";
    public final static String ANNOTATION_RAISEDEXCEPTION = ANNOTATION + ".raisedExceptions";
    //  => Properties
    public final static String ANNOTATION_DERIVEDPROPERTY_GETTER = 	ANNOTATION + "derivedProp.getter";
    public final static String ANNOTATION_DERIVEDPROPERTY_SETTER = 	ANNOTATION + "derivedProp.setter";
    //  => Properties, Parameters, Operations
    public final static String ANNOTATION_TYPEVARIABLE = ANNOTATION + ".typeVariable";
    public final static String ANNOTATION_TYPEVARIABLE_BINDINGS = ANNOTATION + ".typeVariableBindings";
    public final static String ANNOTATION_FUNCTIONTYPE = ANNOTATION + ".functionType";
    //  => ClassDefs 
    public final static String ANNOTATION_INV = ANNOTATION + ".inv";
    //  => ClassDefs, Operations
    public final static String ANNOTATION_NESTED_DOC = ANNOTATION_INV + ".doc";
    public final static String ANNOTATION_TYPEPARAMETER = ANNOTATION + ".typeParameters";
    
    public final static String ANNOTATION_EXTENDEDMETADATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    public final static String ANNOTATION_EXTENDEDMETADATA_KIND = "kind";
    public final static String ANNOTATION_EXTENDEDMETADATA_GROUP = "group";
    public final static String ANNOTATION_EXTENDEDMETADATA_NAME = "name";
    
    
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
	
	public KM2Ecore(KermetaUnit unit) {
		this(null, unit);
	}
	
	/**
	 * Write ecore : launches the KM2Ecore exporter and save it in "file"
	 * TODO Since this method is called in JunitTestSuite, in Kermeta2EcoreWizard, and many other
	 * files, it should be shared elsewhere... 
	 * @param builder
	 * @param file
	 * @param overwrite overxrite file if already exists
	 * @return the resource that hosts the wanted ecore file
	 */
	static public Resource writeEcore(KermetaUnit unit, String file, boolean overwrite)
	{   
	    // Create Ecore structure
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
	    URI u = URI.createURI(file);
    	URIConverter c = new URIConverterImpl();
    	u = c.normalize(u);
	    ResourceSet resource_set = new ResourceSetImpl();
	    Resource resource = resource_set.createResource(  URI.createFileURI(file)  );
    	//    	Resource resource = ecoreResourceSet.createResource(u);
	    // KMT2ECORE
	    KM2Ecore exporter;
	    exporter = new KM2Ecore(resource, unit);
		exporter.exportPackage(unit.rootPackage);
	    // Save Ecore structure	
		try {
			// TODO : test if file exists!! -> u.toFileString() reutrns null :(
			if (overwrite==true)
				resource.save(null);
			//savedFiles.put(file, resource); // add the file so that we avoid re-save of resources
		} catch (IOException e) {
			KermetaUnit.internalLog.error("cannot save ecore ressource, due to Exception: "+ e.getMessage(), e);
			throw new Error("Cannot save ecore ressource (" + file + "), due to Exception: ", e);
		}

		return resource;
	}
	
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(Package root_package) {
		root_pname = NamedElementHelper.getMangledQualifiedName(root_package);
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
			type_def_name = NamedElementHelper.getMangledQualifiedName(fClass.getTypeDefinition());
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
	 * FIXME NOT USED
	 */
	public List<String> getEcoreFileList() {
		return ecoreFileList;
	}

	/**
	 * @return Returns the ecoreGenDirectory.
	 * FIXME NOT USED
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
