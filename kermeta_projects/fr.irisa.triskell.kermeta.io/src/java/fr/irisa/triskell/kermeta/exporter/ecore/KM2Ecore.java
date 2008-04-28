/* $Id: KM2Ecore.java,v 1.50 2008-04-28 11:50:22 ftanguy Exp $
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


import java.util.Hashtable;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.kermeta.ecore.model.helper.EcoreModelHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.internal.TagHelper;

import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;
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
abstract public class KM2Ecore extends KermetaOptimizedVisitor {

	//final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore");
	final static public String ECORE_NSURI = "http://www.eclipse.org/emf/2002/Ecore"; 
	
	protected String root_pname;
	
	// The kermeta unit corresponding to the <model> to convert in Ecore format.
	protected KermetaUnit kermetaUnit;
	
	public	Package currentPackage;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	
	public Resource getResource() {
		return ecoreResource;
	}
	
	public Resource traceResource = null;
	
	public Tracer tracer = null;
	
	// the depending resources informations
	/** The directory where to save the depending files */
	protected String ecoreGenDirectory = null;
	
	protected ExporterOptions exporterOptions = null;

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
    	//primitive_types_mapping.put("kermeta::standard::Character",	"java.lang.Character");
    	primitive_types_mapping.put("kermeta::language::structure::Integer",	"java.lang.Integer");
    	primitive_types_mapping.put("kermeta::language::structure::Boolean",	"boolean");
    	primitive_types_mapping.put("kermeta::standard::Boolean",	"java.lang.Boolean");
    	primitive_types_mapping.put("kermeta::language::structure::String",	"java.lang.String");
    	primitive_types_mapping.put("kermeta::standard::Object",	"java.lang.Object");
    	primitive_types_mapping.put("kermeta::language::structure::UnlimitedNatural",	"java.lang.Integer");
    	primitive_types_mapping.put("kermeta::standard::Real",	"java.lang.Double");
    }
    
    public static Hashtable<String,String> types_mapping;
    static {
    	types_mapping = new Hashtable<String,String>();
    	types_mapping.put("kermeta::standard::String", "kermeta::language::structure::String");
    }
    
    //
    public final static String KERMETA_TYPES = "_KermetaSpecialTypesAlias_";
 
    // Supported EAnnotation names, along with the type of elements they can be associated with:
    //  => All annotated elements
    public final static String ANNOTATION = "kermeta";
    public final static String ANNOTATION_GENMODEL = "http://www.eclipse.org/emf/2002/GenModel";
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

    protected EDataType kermetaTypesAlias;
    
	/**
	 * @param resource : the resource to populate
	 */
	public KM2Ecore(Resource resource, KermetaUnit kunit, EDataType kermetaTypesAlias, ExporterOptions exporterOptions) {
		this.kermetaTypesAlias = kermetaTypesAlias;
		ecoreResource = resource;
		kermetaUnit   = kunit;
		ecoreGenDirectory = kunit.getUri().substring(0, kunit.getUri().lastIndexOf("/")+1);
		this.exporterOptions = exporterOptions;
		//ecoreFileList = new ArrayList<String>();
		internalLog.info("Directory for ecore generation : " + ecoreGenDirectory);
	}

	/**
	 * add the given info in the annotation, eventually create it
	 * @param modelElement
	 * @param annotationSource the name of the annotation "source"
	 * @param annotationDetailKey (optional)
	 * @param annotationDetailValue
	 * @param referedFObject the object that may be refered. can be null
	 */
	public void addAnnotation(EModelElement modelElement, String annotationSource,
			String key, String value,
			EObject referedEObject
			) {
		
		EAnnotation annotation = EcoreModelHelper.EModelElement.getEAnnotation(modelElement, annotationSource, true);
		if ( key != null )
			EcoreModelHelper.EAnnotation.addDetails(annotation, key, value);
		else
			EcoreModelHelper.EAnnotation.addDetails(annotation, TagHelper.KERMETA_DOCUMENTATION, value);

		// try a direct link additionnaly to the detail map. 
		if (referedEObject != null) 
		{
			internalLog.debug(" adding annotation reference for " +key + " = " + value);
			annotation.getReferences().add(referedEObject);
		}
	}
	

	/**
	 * Create an annotation with the given detailled info.
	 * Compared to the 'addAnnotation' method, this one does not test whether a corresponding
	 * annotation already exists, but systematically create a new one.
	 * Used for managing the constraints annotations.
	 * @param annotedModelElement
	 * @param annotationSource
	 * @param key
	 * @param value
	 * @param referedEObject
	 * @return the generated EAnnotation element
	 */
	public EAnnotation addConstraintAnnotation(
			EModelElement annotedModelElement,
			String annotationSource,
			String key,
			String value,
			EObject referedEObject
			) {
		// find the Annotation or create a new one
		EAnnotation newEAnnotation = EcoreModelHelper.EAnnotation.create( annotationSource );
		ecoreResource.getContents().add(newEAnnotation);
		annotedModelElement.getEAnnotations().add(newEAnnotation);
		// add the info in the Details map
		if (key != null)
			EcoreModelHelper.EAnnotation.addDetails(newEAnnotation, key, value);
		
		// try a direct link additionnaly to the detail map. 
		if (referedEObject != null) 
		{
			internalLog.debug(" adding annotation reference for " +key + " = " + value);
			newEAnnotation.getReferences().add(referedEObject);
		}
		return newEAnnotation;
	}

	
	/** tells wether the type of this property can be used in an ecore Attribute */
	public boolean isPropertyValidForEAttribute(Property property){
		Type type = property.getType();
		// translate rightly a Property to an EAttribute. Thus, the old line has been restored.
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
			} else {
				type_def_name = KM2Ecore.types_mapping.get(type_def_name);
				if ( (type_def_name != null) && KM2Ecore.primitive_types_mapping.containsKey(type_def_name) )
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
