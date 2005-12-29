/* $Id: KM2Ecore.java,v 1.5 2005-12-29 15:51:12 dvojtise Exp $
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

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FDataType;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FType;
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
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	public Resource traceResource = null;
	
	public Tracer tracer = null;
	

	/**
	 * <code>kmt2ecoremapping</code> is a trace mapping. 
	 * used to simplify the process in pass2
	 */
	public Hashtable<FObject,EObject> km2ecoremapping =  new Hashtable<FObject,EObject>();
	
	/** this map is used to determine the java object corresponding to a kermeta primitive type */ 
    public static Hashtable<String,String> primitive_types_mapping;
    static {
    	primitive_types_mapping = new Hashtable<String,String>();
    	primitive_types_mapping.put("kermeta::standard::Character", "char");
    	primitive_types_mapping.put("kermeta::standard::Character",	"java.lang.Character");
    	primitive_types_mapping.put("kermeta::standard::Integer", 	"int");
    	primitive_types_mapping.put("kermeta::standard::Integer",	"java.lang.Integer");
    	primitive_types_mapping.put("kermeta::standard::Boolean",	"boolean");
    	primitive_types_mapping.put("kermeta::standard::Boolean",	"java.lang.Boolean");
    	primitive_types_mapping.put("kermeta::standard::String",	"java.lang.String");
    	primitive_types_mapping.put("kermeta::standard::Object",	"java.lang.Object");
    	
    }
	
    public final static String KMT2ECORE_ANNOTATION = "kermeta";
    public final static String KMT2ECORE_ANNOTATION_SUPEROPERATION = "KermetaSuperOperations";
    public final static String KMT2ECORE_ANNOTATION_SUPEROPERATION_DETAILS = "SuperOperation";
    public final static String KMT2ECORE_ANNOTATION_RAISEDEXCEPTION = "KermetaRaisedExceptions";
    public final static String KMT2ECORE_ANNOTATION_RAISEDEXCEPTION_DETAILS = "RaisedException";
    public final static String KMT2ECORE_ANNOTATION_ISABSTRACT_DETAILS = "isAbstract";
    public final static String KMT2ECORE_ANNOTATION_BODY_DETAILS = "body";
    public final static String KMT2ECORE_ANNOTATION_TYPEPARAMETER = "KermetaTypeParameters";
    public final static String KMT2ECORE_ANNOTATION_DERIVEDPROPERTY = "KermetaDerivedProperty";
    public final static String KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_ISDERIVED = "isDerived";
    public final static String KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_ISREADONLY = "isReadOnly";
    public final static String KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_GETTERBODY = "getter.body";
    public final static String KMT2ECORE_ANNOTATION_DERIVEDPROPERTY_SETTERBODY = "setter.body";
    public final static String KMT2ECORE_ANNOTATION_PRIMITIVETYPEALIAS = "alias";
    
	/**
	 * @param resource : the resource to populate
	 */
	public KM2Ecore(Resource resource) {
		ecoreResource = resource;	
	}
	
	public KM2Ecore(Resource resource, Resource traceresource) {
		ecoreResource = resource;	
		traceResource = traceresource;
		tracer = new Tracer(traceResource);
	}
	
	
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(FPackage root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		KM2EcorePass1 pass1 =  new KM2EcorePass1(ecoreResource, km2ecoremapping, this);
		KM2EcorePass2 pass2 =  new KM2EcorePass2(ecoreResource, km2ecoremapping, this);
		Object result =  pass1.exportPackage(root_package);
		pass2.exportPackage(root_package);
		// set the nsURI of the root package
		if(result instanceof EPackage){
			EPackage rP = (EPackage)result;
			String uri = "./"+ecoreResource.getURI().lastSegment();
			//String uri = ecoreResource.getURI().toString();
			rP.setNsURI(uri);
			rP.setNsPrefix(rP.getName());
			internalLog.debug("Package "+ root_pname +" nsURI set to: "+ uri );
			
		}
		else
		{
			internalLog.debug("Not a EPackage ! "+ result + ", Cannot put nsURI" );
			
		}
		return result;
	}
	
	//public EClassifier getETypeForFType(FType ftype) {
		//if(ftype.)
    	/*
    	FTypeDefinition def = null;
    	
    	if (etype == null) {
    	    def = unit.typeDefinitionLookup("kermeta::standard::Void");
    	}
    	
    	if (def == null) {
    	
	    	if (etype.eResource() != resource) {
	    		def = unit.typeDefinitionLookup(getQualifiedName(etype));
	    		if (def == null) {
	    			// import the unit
	    			unit.importedUnits.add(new EcoreUnit(etype.eResource(), unit.packages));
	    		}
	    		def = unit.typeDefinitionLookup(getQualifiedName(etype));
	    	}
	    	else {
	    		def = (FTypeDefinition)types.get(etype);
	    	}
	    	
    	}
    	
    	if (def == null) return null;
    	if (def instanceof FType) return (FType)def;
    	
    	FClassDefinition cd = (FClassDefinition)def;
    	
    	FClass fc = (FClass)classes.get(cd);
    	if (fc == null) {
    		fc = unit.struct_factory.createFClass();
    		fc.setFClassDefinition(cd);
    		classes.put(cd, fc);
    	}
    	return fc;
    	*/
	//	return null;
    //}
	/**
	 * add the given info in the annotation, eventually create it
	 * @param annotedModelElement
	 * @param annotationName
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

	/** tells wether this FType can be used in an ecore Attribute */
	public boolean isTypeValidForAttibute(FType type){
		String type_def_name="";
		// the type maybe either a class or a datatype
		if(type instanceof FClass){
			// retreive the qualified name of the definition of this class
			FClass fClass = (FClass)type;
			type_def_name = KMTHelper.getQualifiedName(fClass.getFClassDefinition());
			if (KM2Ecore.primitive_types_mapping.containsKey(type_def_name)) {
				return true;
			}
		}
		else if (type instanceof FPrimitiveType){
			// primitivetype are aliases, and will be translated into EDataType and then are valid Attibute
			return true;
		}
		return false;
	}
	
	
}
