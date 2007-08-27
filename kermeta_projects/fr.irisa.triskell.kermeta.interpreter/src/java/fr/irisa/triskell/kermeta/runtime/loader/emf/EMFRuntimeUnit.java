/* $Id: EMFRuntimeUnit.java,v 1.49 2007-08-27 09:37:50 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnit.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : 
 * 					zdrey
 * 					dvojtise
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.util2.ResourceSetManager;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectHelper;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitLoader;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
/**
 * FIXME : Check that we work with all qualified names of Classes.
 */
public class EMFRuntimeUnit extends RuntimeUnit {
		
	/**
	 * Used by getEQualifiedName method to map Ecore EDatatypes refering to base
	 * types to Kermeta base types { "javatype" : "kermetatype" }
	 * */
	protected static Hashtable<String, String> primitive_types_mapping;
	
	static {
		primitive_types_mapping = new Hashtable<String, String>();
		primitive_types_mapping.put("int", 					"kermeta::standard::Integer");
		primitive_types_mapping.put("java.lang.Integer", 	"kermeta::standard::Integer");
		primitive_types_mapping.put("boolean", 				"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.Boolean", 	"kermeta::standard::Boolean");
		primitive_types_mapping.put("java.lang.String", 	"kermeta::standard::String");
		primitive_types_mapping.put("Object", 				"kermeta::standard::Object");
		primitive_types_mapping.put("java.lang.Object", 	"kermeta::standard::Object");
	}
	
	 /**
     * Set this to true if you want to have more diagnostic info from EMF
     * Comment for <code>ENABLE_EMF_DIAGNOSTIC</code>
     */
    public static boolean ENABLE_EMF_DIAGNOSTIC =true;
    
    /** URI of the metamodel to which the model to save is conform. This attribute is
     * mandatory */
    public String metamodel_uri;
    protected fr.irisa.triskell.kermeta.language.structure.Object kermeta_mm;
    /** { EObject : RuntimeObject } */
    private Hashtable<EObject, RuntimeObject> runtime_objects_map;
    
    
    

    /** Mandatory attribute used to store the metamodel
     * in the case of the load , it is used when there is generated classes. This is because in this case, the container chain doesn't contains
     * the full package tree of the metamodel
     * we need to be able to recontitute it from the metamodel the user has given
     * Not used, if the model plugin is not deployed (fully reflective)
     */
    protected Resource metaModelResource;
    
    /**
     * instance of the patcher : do not reuse metaModelResource because in some situation
     * we cannot garantee that it use a real ecore file instead of a registered generated java
     */
    protected QualifiedNamePatcher qualifiedNamePatcher;

    /** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.EMFRuntime");
    
    /**
     * NOTE : this constructor should not been called directly by client.
     * Use EMFRuntimeUnitFactory instead.
     * @param uri the URI of the instance-model to load
     */
    public EMFRuntimeUnit(String pUri, RuntimeObject emptyInstances, EMFRuntimeUnitFactory pFactory)
    {
        this.uri = pUri;
        this.contentMap = emptyInstances;
        this.factory = pFactory;
        //this.load();
    }
    
    /**
     * NOTE : this constructor should not been called directly by client.
     * Use EMFRuntimeUnitFactory instead.
     * @param uri the URI of the instance-model to load
     * @param pMMUri the URI of the meta-model FIXME : we will get it from NSURI stored un instance-model
     * @param emptyInstances the RuntimeObject for the collection of instances of the instance-model
     * @param pFactory the factory to create this EMFRuntimeUnit
     */
    public EMFRuntimeUnit(String pUri, String pMMUri, RuntimeObject emptyInstances, EMFRuntimeUnitFactory pFactory)
    {
        this.metamodel_uri = pMMUri;
        this.uri = pUri;
        contentMap = emptyInstances;
        this.factory = pFactory;
    }
      
    public URI resolveURI(String uri, String rel_path)
    {
    	URI u = URI.createURI(uri);
    	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(rel_path)));    			
    	}
    	return u;
    }
    /**
     * To be able to transform a RuntimeObject into an EObject, we need
     * to be able to access the corresponding meta-model. Whereas we didn't
     * need to store the meta model for the EMF2Runtime transformation, for
     * Runtime2EMF we need to know the "E-elements" (EClass, EPackage ;)) of the
     * meta model in order to create E-instances of those E-elements.
     * @param robject
     * @return the EList of elements of the meta model given by p_metamodel_uri
     */
    public Resource loadMetaModelAsEcore(String p_metamodel_uri)
    {        
        internalLog.debug("URI : " + contentMap.getFactory().getMemory().getUnit().getUri() +  "; meta : " + p_metamodel_uri);
    	URI u = createURI(p_metamodel_uri);
        // Load resource
    	logEMFRegistryContent();
    	ResourceSet resource_set = new ResourceSetImpl();
    	Resource resource = resource_set.getResource(u, true);
    	try {
            // visit the metamodel
            resource.load(null);
            EcoreUtil.UnresolvedProxyCrossReferencer.find(resource); // ?? force to resolve every proxies, so the getAllContent will be more reliable
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	
		return resource;
    }

    /** print the content of the EMF Registry */
	public String logEMFRegistryContent() {
		String msg = "";
		try {
				
			Boolean isFirst = true;
	    	Iterator it = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().iterator();
	    	while(it.hasNext()) {
	    		if(!isFirst) msg += " | ";
	    		else isFirst = false;
	    		// weird sometime it crashes here with a null pointer !
	    		msg += it.next().toString();
	    	}
	    	internalLog.debug("Factory.Registry known extensions are : " + msg);
		}
	    catch(Exception e){
	    	
	    	e.printStackTrace();
	    }
    	return msg;
	}
    
    /**
     * Load this RuntimeUnit
     * @see fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit#load()
     */
    //public void load()
    public void load(RuntimeObject resRO)
    {	
    	String emf_msg = "";
    	EMFRuntimeUnit unit = this;
    	XMLResource resource=null;
	    KermetaUnit kunit =  unit.getContentMap().getFactory().getMemory().getUnit();
		try {
			
			// Get URI of the unit correpsonding to the model to be loaded
			URI u = createURI(unit.getUriAsString());
			
			// register the extension of this uri into EMF
			registerEMFextensionToFactoryMap(unit.getUriAsString());
			// Special options for uri.map -> mapping platform:/... uris to os-dependent urls.
			HashMap options = new HashMap();
			ResourceSet resourceset = new ResourceSetImpl();
			
			if(!metamodel_uri.equals("")){
				// add the metamodel in the resourcesetregistry in order to make it load correctly
				Registry reg = resourceset.getPackageRegistry();
				
				Resource res = getMetaModelResource();
				internalLog.debug("nb res for MM = "+findDependentResources(res).size());
				Iterator resListIt = findDependentResources(res).listIterator();
				while(resListIt.hasNext()){
					Resource mmRes = (Resource) resListIt.next(); 
					EPackage ePack = (EPackage) mmRes.getContents().get(0);// get first package (usual ecore file have only one package ...)
							// improved version should check to get all of them from the root
					EMFRegistryHelper.safeRegisterPackages(reg,ePack);
				}
			}
			// If EMF Diagnostic is enabled
	    	if(ENABLE_EMF_DIAGNOSTIC)
	    	{
		    	String msg = "EMF current URI_MAP entries :\n";
		    	for (Object o : URIConverterImpl.URI_MAP.entrySet())
		    		msg += "    "+o + "; \n";
		    	KermetaInterpreter.internalLog.debug(msg);
		    	//options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
	    		// allow to record unknwon feature
	    		options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
	    	}
	    	else
	    		options.put(XMLResource.NIL, Boolean.TRUE);
	    	
	    	
	    	// Try to get emf resource from resource RO
	    	resource = (XMLResource) resRO.getData().get("r2e.emfResource");
	    	
	    	// Try to create the resource specified by "u"
	    	if(resource == null)
	    		resource = 	(XMLResource)resourceset.createResource(u);
    		
	    	if(resource != null){
    			resource.load(options);
    			if(metamodel_uri.equals("")){
    				// the model was correctly loaded even if the uri was not provided
    				// this mean that the metamodel is a registered package
    				// if we want to save this loaded resource (or save another resource relative to this one) 
    				// then we need to infer the metamodel nsuri
    				metamodel_uri = EcoreHelper.getMetaModelUriFromResource(resource);
    				// mmUri was not set, the load was able to infer it, update the RuntimeObject
    		        resRO.getProperties().put("metaModelURI",
    		        		fr.irisa.triskell.kermeta.runtime.basetypes.String.create(metamodel_uri, resRO.getFactory()));
    		        
    			}
    			
    		}
    		else
    			throwKermetaRaisedExceptionOnLoad(
    			"Not able to create a resource for URI: "+ u + "\n  failing on resource = 	(XMLResource)resourceset.createResource(u);  \n" + logEMFRegistryContent(), null);

			// Now, process the conversion of EMF model into Runtime representation so that kermeta can interprete it.
	    	EMF2Runtime emf2Runtime = new EMF2Runtime(unit, resource);
	    	//emf2Runtime.loadunit();
	    	emf2Runtime.loadunit(resRO);
		}
		catch (IOException e){
			emf_msg = "I/O error loading EMF model " + unit.getUriAsString() + ";" + (e.getMessage()!=null?(" :\n " + e.getMessage()):"");
			throwKermetaRaisedExceptionOnLoad(emf_msg + getResourceErrors(resource), e);
		}
		catch (WrappedException e){
			emf_msg += "EMF persistence error: could not load the given model "+ (e.exception().getMessage()!=null?(": " + e.exception().getMessage()):"");
			throwKermetaRaisedExceptionOnLoad(emf_msg + getResourceErrors(resource), e);
		}
		finally
		{
			if(ENABLE_EMF_DIAGNOSTIC && resource != null){
				for (Object errorDiag : resource.getErrors()) 
					internalLog.error("EMF error diagnostic: "+((Resource.Diagnostic)errorDiag).getMessage());
				for (Object errorDiag : resource.getWarnings())
					internalLog.error("EMF warning diagnostic: "+((Resource.Diagnostic)errorDiag).getMessage());
				Map extensionmap = resource.getEObjectToExtensionMap();
				for (Object o : extensionmap.entrySet())			
					internalLog.error("EMF reports unknown feature: "+o + "; " + extensionmap.get(o));
			}
		}
    }
    
    /** Return the errors registered in the given resource. If resource is null, return empty string */
    protected String getResourceErrors(Resource resource)
    {
    	String emf_msg = "";
    	if (resource!=null && resource.getErrors().size()>0)
		{
			emf_msg += "\nEMF reported errors: ";
			for (Object errorDiag : resource.getErrors()) 
					emf_msg += "\n    - " + ((Resource.Diagnostic)errorDiag).getMessage();
		}
    	return emf_msg;
    }

    /**
     * Register a Factory for a file extension. This is necessary especially when running outside of eclipse 
     * @param kunit_uri : name of the file for which we want to register the extension
     */
	private void registerEMFextensionToFactoryMap(String kunit_uri) {
		String ext = kunit_uri.substring(kunit_uri.lastIndexOf(".")+1);
		
		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains(ext)){
			if(ext != null){
				internalLog.debug("registering extension: " + ext);					
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
			}
		}
		else internalLog.debug(" extension " + ext + " is already registered ");
		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains("ecore")){
			internalLog.debug("registering extension: ecore");
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		}
		logEMFRegistryContent();
	}
    
	/**
	 * Save this RuntimeUnit as an XMIModel (EMFModel)
	 * TODO : rename this method in saveAsEMFModel to be consistent with KermetaUnit?
	 * Get the extension specified in file_path and decide to choose it as the extension of XMIResource.
	 * @param file_path the xmi file. the extension of the file should be .km
	 */
	public void save(String file_path) {
		// Get and load the resource of the ECore MetaModel of which the model that we want to save is an instance
        if (this.getMetaModelUri() != null && this.getMetaModelUri().length()>0)
        {
        	try {
        		this.metaModelResource = this.loadMetaModelAsEcore(this.getMetaModelUri());
        	}
        	catch (WrappedException e){
        		throwKermetaRaisedExceptionOnLoad(
        		"Error loading EMF model '" + this.getUriAsString() + "' : " + e.exception().getMessage(), e);
			}
        }
        else // if metaModelResource is null 
        {
            throwKermetaRaisedExceptionOnSave("Metamodel for the instance to save was not found or provided.", null);
        }
        
        // Create an URI for the resource that is going to be saved
        URI u = createURI(file_path); 
        KermetaInterpreter.internalLog.info("URI created for model to save : "+u);
        
        // Add the extension of the file to save into the resource registry, so that EMF won't complain
        registerEMFextensionToFactoryMap(getKermetaUnit().getUri());
        
        Resource res;
        boolean useInterpreterInternalResources = false;	// by default do not include				
        if(associatedResource == null){
        	// No RuntimeObject Resource associated need to fall back to previous way to save it 
	        // Create the resource, and fill it (done in updateEMFModel)
        	// DVK: does this case occurs ???
	        ResourceSet resource_set = new ResourceSetImpl();
	        Runtime2EMF r2e = new Runtime2EMF(this, resource_set.createResource(u));
	        r2e.updateEMFModel();
	        res = r2e.getResource();
        }
        else {
        	// ok, let's try to find in memory what are the other resources in the same repository that may need to be updated now
        	// getOrCreate the resource for this runtimeobject resource, deal with an eventual change in the uri
        		// current resource
        	res = updateEMFResource(associatedResource,u);
        	RuntimeObject roRepository = (RuntimeObject) associatedResource.getProperties().get("repository");
			RuntimeObject roResources = (RuntimeObject) roRepository.getProperties().get("resources");
			RuntimeObject rouseInterpreterInternalResources = (RuntimeObject) roRepository.getProperties().get("useInterpreterInternalResources");
			useInterpreterInternalResources = rouseInterpreterInternalResources != null ? fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(rouseInterpreterInternalResources) : false;		
			//	for each of the resources in the repository (other than the current one)
        	for (Object next : ((ArrayList) roResources.getData().get("CollectionArrayList"))) 
			{
				RuntimeObject roResource = (RuntimeObject) next;
				if (roResource != associatedResource){
					// get orcreate an emf resource for this Resource
					String res_uri = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) roResource.getProperties().get("uri"));						
					Resource res2 = updateEMFResource(roResource, createURI(res_uri));
					
					String mm_uri = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) roResource.getProperties().get("metaModelURI"));
					RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
	        			getConcreteFactory("EMF").createRuntimeUnit("", mm_uri, roResource) ;
					runtime_unit.associatedResource = roResource;
					Runtime2EMF r2emf = new Runtime2EMF((EMFRuntimeUnit)runtime_unit, res2);
					r2emf.updateEMFModel();					
				}
			}

    		Runtime2EMF r2e = new Runtime2EMF(this, res);
	        r2e.updateEMFModel();
	        res = r2e.getResource();
    		
        	// for each of the resources in the repository (other than the current one)    		
			// update the models
			for (Object next : ((ArrayList) roResources.getData().get("CollectionArrayList"))) 
			{
				RuntimeObject roResource = (RuntimeObject) next;
				if (roResource != associatedResource){
					// get orcreate an emf resource for this Resource
					String res_uri = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) roResource.getProperties().get("uri"));						
					Resource res2 = updateEMFResource(roResource, createURI(res_uri));
					
					String mm_uri = (String) RuntimeObjectHelper.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) roResource.getProperties().get("metaModelURI"));
					RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
	        			getConcreteFactory("EMF").createRuntimeUnit("", mm_uri, roResource) ;
					runtime_unit.associatedResource = roResource;
					Runtime2EMF r2emf = new Runtime2EMF((EMFRuntimeUnit)runtime_unit, res2);
					r2emf.updateEMFModel();					
				}
			}
	        
        }
        ResourceSetManager rsManager = new ResourceSetManager(res.getResourceSet());
        // if the resource must know about the resources from the interpreter
        if(useInterpreterInternalResources) rsManager.addStdLibResource();
        // And save the created resource!
        try { 
        	if(res.getContents().size() == 0){
        		throwKermetaRaisedExceptionOnSave("Error saving EMF model '" + this.getUriAsString() + "': There is nothing to save in the resource", null);
        	}
        	res.save(null);
            if(mustValidate) validateWithEMF(res);
        }
        catch (IOException e) {
        	// "t" can be of type Resource.IOWrappedException or DanglingHREFException
		    Throwable t = e.getCause();
		    String msg = "Error saving EMF model '" + this.getUriAsString() + "'" +
		    " :\n Error : \n    " + e.getMessage() + ((t!=null)?"\n Cause : \n    "+ t.getMessage():"");
		    e.printStackTrace();
		    throwKermetaRaisedExceptionOnSave(msg, e); 
		}
        finally{
        	// if the resource must know about the resources from the interpreter
        	// set them back to their original ResourceSet
        	if(useInterpreterInternalResources) rsManager.restoreInterpreterInternalResources();
        }
    }
	
	
	
	/** deal with an eventual change in the uri
	 * 
	 * @param roResource
	 * @param uri
	 * @return
	 */
   private Resource updateEMFResource(RuntimeObject roResource, URI uri) {
	   Resource res = (Resource) roResource.getData().get("r2e.emfResource");
		// if create getOrCreate the resource set associated to the container repository
	   if(res == null){
			res = createEMFResource(roResource, uri);
		}
		else if(!res.getURI().equals(uri)){
			// resource uri has changed, resource need to be be updated
			// remove existing emfResource from the runtime object
			roResource.getData().remove("r2e.emfResource");
			// remove the resource from the resource set
			res.getResourceSet().getResources().remove(res);
			// create a new one
			res = createEMFResource(roResource, uri);
		}
	   return res;
   }
   
   /** create an emf resource and associate it to the RuntimeObject resource
	 * 
	 * @param roResource
	 * @param uri
	 * @return
	 */
   //private Resource createEMFResource(RuntimeObject roResource, URI uri) {
   public Resource createEMFResource(RuntimeObject roResource, URI uri) {
	   ResourceSet resource_set = getOrCreateRepositoryResourceSetForResource(roResource);
		
		Resource res = resource_set.createResource(uri); 
		if(res == null){
			// the extension wasn't registered; register it by default as a xmi
			// this typically occurs when running kermeta as a standalone application outside of Eclipse
			if(uri.fileExtension() != null)
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(uri.fileExtension(),new XMIResourceFactoryImpl());
			res = resource_set.createResource(uri); 
			if(res == null){
				// DVK: still doesn't work, need more investigation ...
				String msg = "Error saving EMF model '" + this.getUriAsString() + "'" +  
					" :\n Error : \n    did not succeded to create EMF resource for URI : "+ uri.toFileString() + ";\n    maybe there is no factory registered for this extension";
				throwKermetaRaisedExceptionOnSave(msg, null);
			}
		}
		// associate this resource to kermesta ressource runtime object
		roResource.getData().put("r2e.emfResource", res);
		return res;
	}

   public ResourceSet getOrCreateRepositoryResourceSetForResource(RuntimeObject roResource){
	   ResourceSet resource_set;
		RuntimeObject roRepository = (RuntimeObject) roResource.getProperties().get("repository");
		resource_set = (ResourceSet)roRepository.getData().get("r2e.emfResourceset");
		if(resource_set == null){
			// need to create the resourceset too
			resource_set = new ResourceSetImpl();
			roRepository.getData().put("r2e.emfResourceset", resource_set);
		}
		return resource_set;
   }
/*
    * ACCESSORS
    *
    */
	public String getMetaModelUri()
	{
	    return metamodel_uri;
	}
	
    /**
     * @param mmUri
     */
    public void setMetaModelUri(String mmUri) {
        this.metamodel_uri = mmUri;
        
    }
    
	/** @return the string uri as user gave it in its Kermeta source code */
    public String getUriAsString()
    {   return uri; }
    
    /** @return the resolved representation (as a "platform:/[...]") of string uri given
     *  by the user*/
    public URI getResolvedUri()
    {
    	String unit_uri = contentMap.getFactory().getMemory().getUnit().getUri();
    	String unit_uri_path = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1);
        return this.resolveURI(this.getUriAsString(), unit_uri_path);
    }
	
	/**
	 * (Helper)
	 * Get the qualified name of the given ENamedElement in a Kermeta representation.
	 * This is a recursive method,
	 * that parses the successive containers of an element and return their qualified names.
	 * This method is uncomplete! :
	 *    TODO handle EDataTypes that contains links to java type that have no equivalence in Kermeta
	 *    (ex: EBigDecimal, EJavaClass, etc.)
	 * @param obj
	 * @return the qualified name of the given object
	 */
	public String getEQualifiedName(ENamedElement obj) {
	    String result = obj.getName();
	    // if the metamodel is not registered the obtained name for the package is null ... we can fix that using the provided metamodel
	    if(result == null && obj instanceof EPackage){
	    	// use the ns uri to retreive the package name
	    	if(this.qualifiedNamePatcher == null) qualifiedNamePatcher = new QualifiedNamePatcher(this);
	    	result = qualifiedNamePatcher.getPackageQualifiedNameFromMetamodel(obj);
	    	
	    }
	    EObject cont = obj.eContainer();
	    // Special case: if obj is a EDataType, refering to a java type (like String), 
	    // search the equivalent type in kermeta.
	    if((obj instanceof EEnum)){
	    	result = getEQualifiedName((ENamedElement)cont) + "::" + result;
	    }
	    else if (obj instanceof EDataType)
	    {
	    	String icn = ((EDataType)obj).getInstanceClassName();
	    	if (icn != null && primitive_types_mapping.containsKey(icn)) 
	    		result = primitive_types_mapping.get(icn);
	    	else // Throw an error? --> For Ecore metamodel, we need to accept types...
	    	{
	    		String msg = "Sorry, your model probably won't be saved properly : it contains types that have no equivalence in kermeta : '" + obj.getName() + "';";
	    		//msg += "\n - Please mail kermeta-users list with your metamodel and instance :) )";
	    		result = primitive_types_mapping.get("java.lang.Object");
	        	// throwKermetaRaisedExceptionOnSave(msg, null);
	    	}
	    }
	    else if (cont != null &&cont instanceof ENamedElement) {
	        result = getEQualifiedName((ENamedElement)cont) + "::" + result;
	    }
	    else if(!(obj.getClass().getName().compareTo("org.eclipse.emf.ecore.impl.EPackageImpl")==0)){
	    	if(this.qualifiedNamePatcher == null) qualifiedNamePatcher = new QualifiedNamePatcher(this);
	    	result = qualifiedNamePatcher.getPackageQualifiedNameFromMetamodel(obj);
	    }
	    return result;
	}


    
	
	/**
	 * Get the contentMapEntry which key is the RuntimeObject representing the given string.
	 * contentMap is the RuntimeObject that is passed to Kermeta side, and that contains a hashtable
	 * which contains the RuntimeObjects resulting from the EMFRuntime loading
	 * @param str a key in contentMap
	 * @return the runtimeObject representation of the collection associated to given key
	 */
	public RuntimeObject getContentMapEntryFromString(String str)
	{
		Hashtable content_table = (Hashtable)this.getContentMap().getData().get("Hashtable");
		RuntimeObject entry = null;
		Iterator it = content_table.keySet().iterator();
		while (it.hasNext() && entry == null)
		{
			RuntimeObject next = (RuntimeObject)it.next();
			if (fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(next).equals(str))
			{	entry = (RuntimeObject)content_table.get(next); }
		}
		return entry;
	}
	
	/**
	 * Create an URI for the given file_path
	 * @param file_path
	 * @return
	 */
	public URI createURI(String file_path)
	{
		String unit_uri = this.getContentMap().getFactory().getMemory().getUnit().getUri();
    	String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1);
    	URI u = this.resolveURI(file_path, unit_uripath);
    	return u;
	}

	public Resource getMetaModelResource() {
		if(metaModelResource!= null) return metaModelResource;
		if (this.getMetaModelUri() != null && this.getMetaModelUri().length()>0)
        {
        	try {
        		this.metaModelResource = this.loadMetaModelAsEcore(this.getMetaModelUri());
        	}
        	catch (WrappedException e){
        		throwKermetaRaisedExceptionOnLoad(
        		"Error loading EMF model '" + this.getUriAsString() + "' : " + e.exception().getMessage(), e);
			}
        }
        else // if metaModelResource is null 
        {
            throwKermetaRaisedExceptionOnSave("Metamodel for the instance to save was not found or provided.", null);
        }
		return metaModelResource;
	}

	public void setMetaModelResource(Resource metaModelResource) {
		this.metaModelResource = metaModelResource;
	}
    
	/**
	 * returns the list of resources that are linked to the elements of this resources
	 *  it doesn't returns the metamodel resources.
	 * (this is because the getAllContents() on a resource set alos return the metamodel ...)
	 * result includes the input resources
	 * @return EList of Resource
	 */
	public EList<Resource> findDependentResources(Resource resource)
	{
		EList<Resource> result = new BasicEList<Resource>();
		result.add(resource);
		findDependentResources(result, resource);
		return result;
	}
	/**
	 * Adds the resource of the given EObject (using obj.eResource() call) to the
	 * list <code>list</code>
	 * @param list The list&lt;Resource&gt;
	 * @param obj The object for which we are looking the hosting Resource
	 */
	protected void addObjectResourceToList(EList<Resource> list, EObject obj)
	{
		if((obj.eResource() != null) && (!list.contains(obj.eResource())))
    	{
			list.add(obj.eResource());
			internalLog.debug("Resource added : "+ obj.eResource().getURI());
    		// recursively add the resources
			findDependentResources(list,obj.eResource());
    	}
	}
	/**
	 * Looks in the given resource the list of hosted objects, and
	 * Recursive part of the findDependentResources method
	 * @param list A list&lt;Resource&gt; that contains the resources of which 
	 * the given <code>resource</code> depends.
	 * @param resource The emf resource that EMF2Runtime has to load. 
	 */
	protected void findDependentResources(EList<Resource> list, Resource resource)
	{
		TreeIterator<EObject> treeIt = resource.getAllContents();
		while(treeIt.hasNext())
		{
			
			EObject eobj = treeIt.next();
			EClass eClass = eobj.eClass();
		    // Get the structural features
		    EList<EStructuralFeature> features = eClass.getEAllStructuralFeatures(); 
		    // For each feature, get the value and and check if its resource is in the list
		    for (EStructuralFeature feature : features)
		    {
		        // Workaround for an EMF bug
		        // -------------------------------------------------------------------------
		        // Handle the particular case of an EObject which type is EClassifier : 
		        // If an EClass has (accidentally) an instanceClassName value, set it to null
		        // Indeed, such a case (which leads to a malformed model) can appear when user 
		        // loads an ecore model created with EMF reflexive editor, which sometimes 
		        // creates EClass elements with an instanceClassName that equals "". 
		        // An instanceClassName=="" leads to a ClassNotFoundException since EMF underlying code looks
		        // for a java class which name is thus "" -> unconsistent!
		        if (eobj instanceof EClassifier)
		        {
		        	 String instance_class_name = ((EClassifier)eobj).getInstanceClassName();
		        	 if (instance_class_name != null && instance_class_name.length() == 0)
		        		 ((EClassifier)eobj).setInstanceClassName(null);
		        }
		        Object fvalue = eobj.eGet(feature);
		        // If this feature is an EList,
		        if (fvalue instanceof EList)
		        {   // Then, for each object of this EList-feature, add its hosting resource 
		        	// into the list of dependent resources
		    	    for (Object sfeature : ((EList)fvalue)) 
		    	    {
		    	    	// Ignore values which type is a base type (String,...) : we don't need to 
		    	    	// precreate a runtime object for them. (will be created "on the fly")
		    	    	if (sfeature instanceof EObject)
		    	    		addObjectResourceToList(list,(EObject)sfeature); 
		    	    }
		        }
		        //If this feature is an EObject, add its hosting resource into the list of dependent resources.
		        else if (fvalue instanceof EObject)   
		        	addObjectResourceToList(list,(EObject)fvalue);
			    
			}
		}
	}
    
    /** Helper method to make the code more readable :
     * @return a KermetaRaisedException telling that save process failed */
    protected void throwKermetaRaisedExceptionOnSave(String message, Throwable javacause)
    {
    	throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ResourceSaveException",
    			message,
    			getRuntimeMemory().getCurrentInterpreter(),
    			getRuntimeMemory(),
    			javacause);
    }
    
    /** Helper method to make the code more readable :
     * @return a KermetaRaisedException telling that load process failed */
    protected void throwKermetaRaisedExceptionOnLoad(String message, Throwable javacause)
    {
    	throw KermetaRaisedException.createKermetaException("kermeta::exceptions::ResourceLoadException",
    			message,
    			getRuntimeMemory().getCurrentInterpreter(),
    			getRuntimeMemory(),
    			javacause);
    }
    
	/**
	 * Test if the metamodel given by the user on load is ecore metamodel or not.
	 * @return true if user metamodel is the Ecore one or not
	 * Developer note: testing only through the uri of the metamodel resource is not reliable
	 */
	public boolean isFromEcoreMetaModel()
	{
		boolean result = false;
		Iterator mmroots_iterator = this.getMetaModelResource().getContents().iterator();
		while (mmroots_iterator.hasNext() && result == false)
		{
			Object mmroot = mmroots_iterator.next();
			result = ((mmroot instanceof EPackage) && ((EPackage)mmroot).getName().equals("ecore"));
		}
		return result;
	}

	/**
	 * use EMF validation framework, 
	 */
	public void validateWithEMF(Resource res) {
		try{
			OptionalEMFValidator validator = new OptionalEMFValidator(internalLog, getRuntimeMemory());
			validator.validateWithEMF(res);
		}
		catch(NoClassDefFoundError e){
			// didn't succeed to validate maybe we are running outside of eclipse and the service is not correctly activated
			internalLog.warn("Didn't succeed to validate EObject with EMF validator, maybe you are running outside of eclipse ...",e);
		}
	}
	   
}

