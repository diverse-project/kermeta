/* $Id: EMFRuntimeUnit.java,v 1.19 2006-07-05 13:05:20 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnit.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : 
 * 					zdrey
 * 					dvojtise
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.DanglingHREFException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitError;
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
    
    /** this hashtable is used to store the qualified name of the element with the given nsuri.
     * used only on the metamodel via getEQualifiedName()
     * a user may improve the performances if he directly set these values for his metamodel. 
     * This will allow to not load the metamodel in case of generated java class and bug#632
     */
    public Hashtable<String,String> nsUri_QualifiedName_map = new Hashtable<String,String>();
    

    /** Mandatory attribute used to store the metamodel
     * in the case of the load , it is used when there is generated classes. This is because in this case, the container chain doesn't contains
     * the full package tree of the metamodel
     * we need to be able to recontitute it from the metamodel the user has given
     * Not used, if the model plugin is not deployed (fully reflective)
     */
    protected Resource metaModelResource;

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
        //this.load();
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
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
    	ResourceSet resource_set = new ResourceSetImpl();
    	Resource resource = resource_set.getResource(u, true);
    	try {
            // visit the metamodel
            resource.load(null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	
		return resource;
    }

    /** print the content of the EMF Registry */
	public void logEMFRegistryContent() {
		String msg = "";
    	Iterator it = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().iterator();
    	while(it.hasNext()) {
    		msg += " | "+it.next().toString();
    	}
    	internalLog.debug("Factory.Registry known extensions are :" + msg);
	}
    
    /**
     * Load this RuntimeUnit
     * @see fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit#load()
     */
    public void load() 
    {	
    	String emf_msg = "";
    	EMFRuntimeUnit unit = this;
    	XMLResource resource=null;
	    KermetaUnit kunit =  unit.getContentMap().getFactory().getMemory().getUnit();
		try {
			
			// Get URI of the unit correpsonding to the model to be loaded
			URI u = createURI(unit.getUriAsString());
			
			// register the extension of this uri into EMF
			registerEMFextensionToFactoryMap(kunit.getUri());
			
			//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
			ResourceSet resourceset = new ResourceSetImpl();
	        
	    	if(ENABLE_EMF_DIAGNOSTIC) {
		    	Map map = URIConverterImpl.URI_MAP;
		    	Iterator mapIt = map.entrySet().iterator();
		    	KermetaUnit.internalLog.debug("EMF current URI_MAP:");
				while(mapIt.hasNext()) {
					// print EMF diagnostic even if it loaded, there may be some warning ?
					Object o = mapIt.next();					
					KermetaUnit.internalLog.debug("___URI_MAP entry: "+o + "; " + map.get(o));
				}
	    	}
	    	HashMap options = new HashMap();
	    	//options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
	    	if(ENABLE_EMF_DIAGNOSTIC)
	    	{	// allow to record unknwon feature
	    		options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
	    	}
	    	else
	    		options.put(XMLResource.NIL, Boolean.TRUE);
	    	
	    	// Refer to http://www.w3.org/TR/2004/PER-xmlschema-0-20040318/#ipo.xml
	    	if(true)
	    	{
	    		// -> does not work // loadMetamodel(resourceset, options);
	    		resource = 	(XMLResource)resourceset.createResource(u);
	    		if(resource != null) {
	    			resource.load(options);
	    		}
	    		else
	    		{
	    			String errmsg ="Not able to create a resource for URI: "+u ;
	    	    	logEMFRegistryContent();
	    			throwKermetaRaisedExceptionOnLoad(errmsg, null);
	    		}
	    	}
	    	else {
	    		resource = (XMLResource)resourceset.getResource(u, true); // on demand load ...
	    	}
	    	
	    	// Finding unresolved proxies also resolves all the content, so a getAllcontent on the resource set now work !
	    	// Commented because this part of code generates a ClassCastException (inside EMF code..)
	    /*	Map unresolvedReferences = EcoreUtil.UnresolvedProxyCrossReferencer.find(resourceset);
			Iterator unresolvedMapIt = unresolvedReferences.entrySet().iterator();
			while(unresolvedMapIt.hasNext()) {
				// print EMF diagnostic even if it loaded, there may be some warning ?
				Object o = unresolvedMapIt.next();					
				internalLog.error("EMF reports unresolved reference: "+o + "; " + unresolvedReferences.get(o));
			}
			if(!unresolvedReferences.isEmpty())
			{
				unresolvedMapIt = unresolvedReferences.entrySet().iterator();
				String errmsg = "EMF reports unresolved reference(s): You must load the corresponding files before trying to load this model."+
					"\n  First unresolved proxy is: "+unresolvedMapIt.next()+
					"\n  a new URI_MAP entry may solve your problem";
				throwKermetaRaisedExceptionOnLoad(errmsg, null);
			}*/
			
			// Now, process the conversion of EMF model into Runtime representation so that kermeta can interprete it.
	    	EMF2Runtime emf2Runtime = new EMF2Runtime(unit, resource);
	    	emf2Runtime.loadunit();
		}
		catch (IOException e){
			emf_msg = "I/O error loading EMF model " + unit.getUriAsString() + ";" + (e.getMessage()!=null?(" :\n " + e.getMessage()):"");
			if (resource!=null && resource.getErrors().size()>0)
			{
				emf_msg += "\nEMF reported errors: ";
				for (Object errorDiag : resource.getErrors()) 
 					emf_msg += "\n    - " + ((Resource.Diagnostic)errorDiag).getMessage();
			}
			throwKermetaRaisedExceptionOnLoad(emf_msg, e);
		}
		catch (WrappedException e){
			emf_msg += "EMF persistence error: could not load the given model "+ (e.exception().getMessage()!=null?(": " + e.exception().getMessage()):"");
			if(resource != null && resource.getErrors().size()>0)
			{
				emf_msg += "\nEMF reported errors: ";
				for (Object errorDiag : resource.getErrors())
					emf_msg += "\n    - " + ((Resource.Diagnostic)errorDiag).getMessage();
			}
			throwKermetaRaisedExceptionOnLoad(emf_msg, e);    	
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

	private void registerEMFextensionToFactoryMap(String kunit_uri) {
		String ext = kunit_uri.substring(kunit_uri.lastIndexOf(".")+1);
		internalLog.debug("registering extension:" + ext);
		logEMFRegistryContent();
		
		//
		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains(ext)){
			internalLog.debug("registering extension: " + ext);		
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
		}
		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains("ecore")){
			internalLog.debug("registering extension: ecore");
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		}
	}
    
	/**
	 * Save this RuntimeUnit as an XMIModel (EMFModel)
	 * TODO : rename this method in saveAsEMFModel to be consistent with KermetaUnit?
	 * Get the extension specified in file_path and decide to choose it as the extension of XMIResource.
	 * @param file_path the xmi file. the extension of the file should be .km
	 */
	public void save(String file_path) {
		
		// Get the runtime memory and the interpreter -- mainly used to print 
		// exception in the user console when save process fails
	    RuntimeMemory memory =this.getContentMap().getFactory().getMemory();
    	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();
    	// KermetaUnit is used just to detect the directory of which the given file_path is relative
    	// (it corresponds to the unit of the kermeta program from where user asked for a resource save.
    	KermetaUnit kunit =  this.getContentMap().getFactory().getMemory().getUnit();
        
        // Get and load the resource of the ECore MetaModel of which the model that we want to save is an instance
        if (this.getMetaModelUri() != null && this.getMetaModelUri().length()>0)
        {
        	try {
        		this.metaModelResource = this.loadMetaModelAsEcore(this.getMetaModelUri());
        	}
        	catch (WrappedException e){
        		KermetaUnit.internalLog.error("Error loading EMF model " + this.getUriAsString() + " : " + e.exception().getMessage(), e);
        		throwKermetaRaisedExceptionOnLoad(e.exception().getMessage(), e);
			}
        }
        else // if metaModelResource is null 
        {
            throwKermetaRaisedExceptionOnSave("Metamodel for the instance to save was not found or provided.", null);
        }
        
        // Create an URI for the resource that is going to be saved
        URI u = createURI(file_path); 
        KermetaUnit.internalLog.info("URI created for model to save : "+u);
        
        // Add the extension of the file to save into the resource registry, so that EMF won't complain
        registerEMFextensionToFactoryMap(kunit.getUri());
        
        // Create the resource, and fill it (done in updateEMFModel)
        ResourceSet resource_set = new ResourceSetImpl();
        Runtime2EMF r2e = new Runtime2EMF(this, resource_set.createResource(u));
        r2e.updateEMFModel();
        
        // And save the created resource!
        try {	
        	
        	r2e.getResource().save(null);
        	
		} catch (IOException e) {
		    Throwable t = e.getCause();
		    KermetaUnit.internalLog.error("Error saving EMF model " + this.getUriAsString() + " : " + e.getMessage(), e);
        	if (t instanceof Resource.IOWrappedException)
		    {	
		        Resource.IOWrappedException we = (Resource.IOWrappedException)t;
		        throwKermetaRaisedExceptionOnSave(we.getWrappedException().getMessage(), we);
		    }
        	else if (t instanceof DanglingHREFException)
		    {
		    	DanglingHREFException we = (DanglingHREFException)t;
		        throwKermetaRaisedExceptionOnSave(we.getMessage(), we);
		    }
		    e.printStackTrace();
		    throwKermetaRaisedExceptionOnSave(e.getMessage(), e); 
		}
    }
	
    /**
     * Try to load the metamodel given by the metamodel_uri attribute
     * Not used yet
     * @param options options to be put to the instance/model resource.load method
     * */
	public void loadMetamodel(ResourceSet resourceset, Map options)
	{
		Registry registry = resourceset.getPackageRegistry();
     	// metamodel_uri!
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
	    URI u = createURI(metamodel_uri);
		Resource resource = resourceset.createResource(u);
		try 
		{
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			resource.load(null);
			TreeIterator it = resource.getAllContents();
			while (it.hasNext()) 
			{
				EObject n = (EObject)it.next();
				if (n instanceof EPackage)
				{
					xmlMap.setNoNamespacePackage((EPackage)n);
					registry.put("//"+((EPackage)n).getName(),(EPackage)n);
				}
			}
			// There is probably something to do with this option
			options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
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
	 * This method is uncomplete! : TODO :
	 *    - handle EEnum type
	 *    - handle EDataTypes that contains links to java type that have no equivalence in Kermeta
	 *    (ex: EBigDecimal, EJavaClass, etc.)
	 * @param obj
	 * @return the qualified name of the given object
	 */
	public String getEQualifiedName(ENamedElement obj) {
	    String result = obj.getName();
	    EObject cont = obj.eContainer();
	    // Special case: if obj is a EDataType, refering to a java type (like String), 
	    // search the equivalent type in kermeta.
	    if (obj instanceof EDataType)
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
	    	// optimization : use of an hashtable
	    	String nsuri = ((EPackage)obj).getNsURI();
	    	String packageQualifiedName = this.nsUri_QualifiedName_map.get(nsuri);
	    	if( packageQualifiedName == null)
	    	{   // optimization failed, need to load the metamodel and retreive the qualified name
	    		// internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that this package is really toplevel..." + obj.getClass().getName() + " || "+ obj.toString() );
		    	// lazy load of the metamodel 	
		    	loadMetaModelResource(metamodel_uri);
		    	// look into the mm if the given object can be retreived, then get its real qualified name
		    	EPackage mmPackage = getEPackageFromNsUri(nsuri);
		    	if (mmPackage != null)
		    	{
		    		result = getEQualifiedName(mmPackage);
		    		this.nsUri_QualifiedName_map.put(nsuri,result);	// for optimization
		    	}
	    	}
	    	else
	    		result = packageQualifiedName;
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

	public void loadMetaModelResource(String mm_uri){
		if(metaModelResource == null)
			metaModelResource = this.loadMetaModelAsEcore(this.metamodel_uri);
	}
	public Resource getMetaModelResource() {
		return metaModelResource;
	}

	public void setMetaModelResource(Resource metaModelResource) {
		this.metaModelResource = metaModelResource;
	}
	
	/**
     * Get the EPackge corresponding to the given nsuri 
     * @param nsuri the nsuri of which we look for the corresponding in Ecore meta-model
     * @return the EPackage in the ecore meta-model given by the user for serialization of its model
     */
    protected EPackage getEPackageFromNsUri(String nsuri)
    {
    	EPackage result = null;
        TreeIterator it = null; 
       
        it = metaModelResource.getAllContents();            
        while (it.hasNext() && result == null)
        {
            EObject obj = (EObject)it.next();
			if (obj instanceof EPackage)
			{
				if (((EPackage)obj).getNsURI().equals(nsuri))
				    result = (EPackage)obj;
			}
        }
        return result;
    }
    
    /** Helper method to make the code more readable :
     * @return a KermetaRaisedException telling that save process failed */
    protected void throwKermetaRaisedExceptionOnSave(String message, Throwable javacause)
    {
    	throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceSaveException",
    			message,
    			getRuntimeMemory().getCurrentInterpreter(),
    			getRuntimeMemory(),
    			javacause);
    }
    
    /** Helper method to make the code more readable :
     * @return a KermetaRaisedException telling that load process failed */
    protected void throwKermetaRaisedExceptionOnLoad(String message, Throwable javacause)
    {
    	throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
    			message,
    			getRuntimeMemory().getCurrentInterpreter(),
    			getRuntimeMemory(),
    			javacause);
    }
    
    
}

