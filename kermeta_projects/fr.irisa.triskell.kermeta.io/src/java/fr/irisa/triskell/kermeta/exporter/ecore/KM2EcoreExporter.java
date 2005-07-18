/* $Id: KM2EcoreExporter.java,v 1.5 2005-07-18 15:47:10 dvojtise Exp $
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
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.kermeta.loader.ecore.EcoreUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.KMTHelper;
import fr.irisa.triskell.kermeta.utils.TextTabs;
import fr.irisa.triskell.kermeta.visitor.KermetaVisitor;

/**
 * Exports KM or KMT to Ecore.
 * 
 * Notes about the Ecore representation of Kermeta programs.
 * Due to the lack of some features in Ecore, some data are stored in a special way inside Ecore models.
 * - superoperation are stored in Annotations named KerMeta.SuperOperation
 * 		both the reference and a detail map are generated. If you generate these manually be sure to have them consistent 
 * 		(ie. that points to the same operation)
 * - isAbstract boolean is stored in the annotation named "KerMeta" in a detail map with key="isAbstract"
 */
public class KM2EcoreExporter {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT2Ecore");
	protected ArrayList usings = new ArrayList();
	protected ArrayList imports = new ArrayList();
	protected String root_pname;
	
	// the resource to populate
	protected Resource ecoreResource = null;
	

	/**
	 * <code>kmt2ecoremapping</code> is a trace mapping. 
	 * used to simplify the process in pass2
	 */
	public Hashtable kmt2ecoremapping =  new Hashtable();
	
	
    public static Hashtable primitive_types_mapping;
    static {
    	primitive_types_mapping = new Hashtable();
    	primitive_types_mapping.put("kermeta::standard::Integer", 	"int");
    	primitive_types_mapping.put("kermeta::standard::Integer",	"java.lang.Integer");
    	primitive_types_mapping.put("kermeta::standard::Boolean",	"boolean");
    	primitive_types_mapping.put("kermeta::standard::Boolean",	"java.lang.Boolean");
    	primitive_types_mapping.put("kermeta::standard::String",	"java.lang.String");
    	primitive_types_mapping.put("kermeta::standard::Object",	"Object");
    }
	
    public final static String KMT2ECORE_ANNOTATION = "KerMeta";
    public final static String KMT2ECORE_ANNOTATION_SUPEROPERATION = "KerMeta.SuperOperation";
    public final static String KMT2ECORE_ANNOTATION_SUPEROPERATION_DETAILS = "SuperOperation";
    public final static String KMT2ECORE_ANNOTATION_RAISEDEXCEPTION = "KerMeta.RaisedException";
    public final static String KMT2ECORE_ANNOTATION_RAISEDEXCEPTION_DETAILS = "RaisedException";
    public final static String KMT2ECORE_ANNOTATION_ISABSTRACT_DETAILS = "isAbstract";
    public final static String KMT2ECORE_ANNOTATION_BODY_DETAILS = "Body";
    
	/**
	 * @param resource : the resource to populate
	 */
	public KM2EcoreExporter(Resource resource) {
		ecoreResource = resource;	
	}
	
	/**
	 * Exports the given package into an ecore ressource
	 * @param root_package
	 * @return the equivalent root_package in the Ecore ressource
	 */
	public Object exportPackage(FPackage root_package) {
		root_pname = KMTHelper.getQualifiedName(root_package);
		KM2EcoreExporter_pass1 pass1 =  new KM2EcoreExporter_pass1(ecoreResource, kmt2ecoremapping);
		KM2EcoreExporter_pass2 pass2 =  new KM2EcoreExporter_pass2(ecoreResource, kmt2ecoremapping);
		Object result =  pass1.exportPackage(root_package);
		pass2.exportPackage(root_package);		
		return result;
	}
	
	public EClassifier getETypeForFType(FType ftype) {
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
		return null;
    }
	
}
