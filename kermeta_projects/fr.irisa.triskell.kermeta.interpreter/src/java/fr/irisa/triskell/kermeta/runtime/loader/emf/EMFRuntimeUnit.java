/* $Id: EMFRuntimeUnit.java,v 1.11 2006-04-04 12:21:19 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * FIXME : Check that we work with all qualified names of Classes.
 */
public class EMFRuntimeUnit extends RuntimeUnit {
		    
	 /**
     * Set this to true if you want to have more diagnostic info from EMF
     * Comment for <code>ENABLE_EMF_DIAGNOSTIC</code>
     */
    public static boolean ENABLE_EMF_DIAGNOSTIC =true;
    
    /** temporary attribute for the */
    public String metamodel_uri;
    protected fr.irisa.triskell.kermeta.language.structure.Object kermeta_mm;
    /** { EObject : RuntimeObject } */
    private Hashtable runtime_objects_map;
    
    /** this hashtable is used to store the qualified name of the element with the given nsuri.
     * used only on the metamodel via getEQualifiedName()
     * a user may improve the performances if he directly set these values for his metamodel. 
     * This will allow to not load the metamodel in case of generated java class and bug#632
     */
    public Hashtable<String,String> nsUri_QualifiedName_map = new Hashtable<String,String>();
    

    /** used to store the metamodel
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
        String unit_uri = contentMap.getFactory().getMemory().getUnit().getUri();
        String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1); 
        // resolve uri
        internalLog.debug("URI : " + unit_uripath +  "; meta : " + p_metamodel_uri);
    	URI u = this.resolveURI(p_metamodel_uri, unit_uripath);
        // load resource
    	internalLog.debug("will register *.ecore to Factory.Registry, known extensions are :");
    	Iterator it = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().iterator();
    	while(it.hasNext()) {
    		internalLog.debug("  "+it.next().toString());
    	}
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
    
    /**
     * Load this RuntimeUnit
     * @see fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit#load()
     */
    public void load() 
    {	
    	EMFRuntimeUnit unit = this;
    	RuntimeMemory memory =unit.getContentMap().getFactory().getMemory();
    	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();
    	XMLResource resource=null;
	    KermetaUnit kunit =  unit.getContentMap().getFactory().getMemory().getUnit();
		try {
        	// Load resource
			
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
			ResourceSet resourceset = new ResourceSetImpl();
			
			// Get URI of the unit correpsonding to the model to be loaded
			String kunit_uri = kunit.getUri();
	        String kunit_uripath = kunit_uri.substring(0, kunit_uri.lastIndexOf("/")+1);
	        URI u = unit.resolveURI(unit.getUriAsString(), kunit_uripath);
	    	/*URIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/fr.irisa.triskell.kermeta/"),
	    			URI.createURI("file:/C:/eclipse3.0.2/eclipse/plugins/fr.irisa.triskell.kermeta_0.0.16/"));
	    	URIConverterImpl.URI_MAP.put(URI.createURI("truc/"),
	    			URI.createURI("machin/"));
	    	String s = URIConverterImpl.URI_MAP.toString();*/
	    	
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
	    			internalLog.error(errmsg );
	    			throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
		        			errmsg,	interpreter, memory, null);
	    		}
	    	}
	    	else {
	    		resource = (XMLResource)resourceset.getResource(u, true); // on demand load ...
	    	}
	    	
	    	// finding unresolved proxies also resolves all the content, so a getAllcontent on the resource set now work !
	    	Map unresolvedReferences = EcoreUtil.UnresolvedProxyCrossReferencer.find(resourceset);;
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
				KermetaUnit.internalLog.error(errmsg);
				throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
	        			errmsg,
						interpreter,
						memory,
						null);
			}
	    	EMF2Runtime emf2Runtime = new EMF2Runtime(resourceset, resource);
	    	emf2Runtime.loadunit(unit, resource);
		}
		catch (IOException e){
			KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUriAsString() + " : " + e.getMessage(), e);			
			throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
        			e.getMessage(),
					interpreter,
					memory,
					e); 
		}
		catch (WrappedException e){

			KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUriAsString() + " : " + e.exception().getMessage(), e);
			kunit.messages.addError("EMF persistence error : could not load the given model :\n"+ e.exception().getMessage(), (fr.irisa.triskell.kermeta.language.structure.Object)unit.getContentMap().getData().get("kcoreObject"));
			if(resource != null){ // do that even if there where an exception
				Iterator it = resource.getErrors().iterator();
				while(it.hasNext()) {
					Resource.Diagnostic errorDiag =  (Resource.Diagnostic) it.next();
					KermetaUnit.internalLog.error("EMF diagnostic: "+errorDiag.getMessage());
				}
			}
        	throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
        			e.exception().getMessage(),
					interpreter,
					memory,
					e);        	
		}
		finally
		{
			if(ENABLE_EMF_DIAGNOSTIC && resource != null){
	    		// print as much diagnostic as possible
				Iterator errorIt = resource.getErrors().iterator();
				resource.getWarnings();
				while(errorIt.hasNext()) {
					// print EMF diagnostic even if it loaded, there may be some warning ?
					Resource.Diagnostic errorDiag =  (Resource.Diagnostic) errorIt.next();
					internalLog.error("EMF error diagnostic: "+errorDiag.getMessage());
				}
				Iterator warningIt = resource.getWarnings().iterator();
				while(warningIt.hasNext()) {
					// print EMF diagnostic even if it loaded, there may be some warning ?
					Resource.Diagnostic errorDiag =  (Resource.Diagnostic) warningIt.next();
					internalLog.error("EMF warning diagnostic: "+errorDiag.getMessage());
				}
				Map extensionmap = resource.getEObjectToExtensionMap();
				Iterator mapIt = extensionmap.entrySet().iterator();
				while(mapIt.hasNext()) {
					// print EMF diagnostic even if it loaded, there may be some warning ?
					Object o = mapIt.next();					
					internalLog.error("EMF reports unknown feature: "+o + "; " + extensionmap.get(o));
				}
			}
		}
    }
    
	/**
	 * Save this RuntimeUnit as an XMIModel (EMFModel)
	 * TODO : rename this method in saveAsEMFModel to be consistent with KermetaUnit?
	 * Get the extension specified in file_path and decide to choose it as the extension of XMIResource.
	 * @param file_path the xmi file. the extension of the file should be .km
	 */
	public void save(String file_path) {
	    Runtime2EMF r2e = new Runtime2EMF(this);
		RuntimeMemory memory =this.getContentMap().getFactory().getMemory();
    	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();
        System.err.println(" metamodel uri : " + this.getMetaModelUri());
        // Get and load the resource of the ECore MetaModel wanted
        if (this.getMetaModelUri() != null && this.getMetaModelUri().length()>0)
        {	// resolve
        	try {
        		this.metaModelResource = this.loadMetaModelAsEcore(this.getMetaModelUri());
        	}
        	catch (WrappedException e){
        		KermetaUnit.internalLog.error("Error loading EMF model " + this.getUriAsString() + " : " + e.exception().getMessage(), e);
    			throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
	        			e.exception().getMessage(),
						interpreter,
						memory,
						e); 
			}
        }
        else // metaModelResource is null 
        {
            //throw new KermetaRaisedException(null, null);
        }
        // Initialize the resource of the EMF model to save
        String unit_uri = this.getContentMap().getFactory().getMemory().getUnit().getUri();
        String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1); 
    	URI u = this.resolveURI(file_path, unit_uripath);
    	KermetaUnit.internalLog.info("URI created for model to save : "+u);
        String ext = file_path.substring(file_path.lastIndexOf(".")+1);
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    r2e.resource = resource_set.createResource(u);
	    // Update all the instance of the EMF Model
	    r2e.updateEMFModel(r2e.resource);
	    
	    try {
	        /* For tests purpose : java.io.OutputStream out = new BufferedOutputStream(System.out);
	        resource.save(out, null); */
	        r2e.resource.save(null);
		} catch (IOException e) {
		    Throwable t = e.getCause();
		    KermetaUnit.internalLog.error("Error saving EMF model " + this.getUriAsString() + " : " + e.getMessage(), e);
        	if (t instanceof Resource.IOWrappedException)
		    {	
		        Resource.IOWrappedException we = (Resource.IOWrappedException)t;
		        //we.getMessage();
		        throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceSaveException",
				        we.getWrappedException().getMessage(),
						interpreter,
						memory,
						we);
		    }
        	else if (t instanceof DanglingHREFException)
		    {
		    	DanglingHREFException we = (DanglingHREFException)t;
		        we.getMessage();
		        throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceSaveException",
	        			we.getMessage(),
						interpreter,
						memory,
						we); 
		    }
		    e.printStackTrace();
		    throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceSaveException",
        			e.getMessage(),
					interpreter,
					memory,
					e); 
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
		String unit_uri = this.getContentMap().getFactory().getMemory().getUnit().getUri();
	    String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1); 
	    URI u = this.resolveURI(metamodel_uri, unit_uripath);
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
     * @param runtime_objects_map
     */
    public void setRuntimeObjectsMap(Hashtable p_runtime_objects_map) {
        runtime_objects_map = p_runtime_objects_map;
    }
    
    

    /**
     * @return Returns the runtime_objects_map.
     */
    public Hashtable getRuntimeObjectsMap() {
        return runtime_objects_map;
    }
    
	
	/**
	 * (Helper)
	 * Get the qualified name of the given ENamedElement in a Kermeta representation.
	 * This is a recursive method,
	 * that parses the successive containers of an element and return their qualified names.
	 * @param obj
	 * @return the qualified name of the given object
	 */
	public String getEQualifiedName(ENamedElement obj) {
	    String result = obj.getName();
	    EObject cont = obj.eContainer();
	    if (cont != null &&cont instanceof ENamedElement) {
	        result = getEQualifiedName((ENamedElement)cont) + "::" + result;
	    }
	    else if(!(obj.getClass().getName().compareTo("org.eclipse.emf.ecore.impl.EPackageImpl")==0)){
	    	//internalLog.debug("Root container is an EPackageImpl, verifying that it is really toplevel" + obj.getClass().getName() + " || "+ obj.toString() );
	    	// optimization : use of an hashtable
	    	String nsuri = ((EPackage)obj).getNsURI();
	    	String packageQualifiedName = this.nsUri_QualifiedName_map.get(nsuri);
	    	if( packageQualifiedName == null)
	    	{   // optimization failed, need to load the metamodel and retreive the qualified name
	    		internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that this package is really toplevel..." + obj.getClass().getName() + " || "+ obj.toString() );
		    	// lazy load of the metamodel 	
		    	loadMetaModelResource(metamodel_uri);
		    	// look into the mm if the given object can be retreived, then get its real qualified name
		    	EPackage mmPackage = getEPackageFromNsUri(nsuri);
		    	
		    	result = getEQualifiedName(mmPackage);
		    	this.nsUri_QualifiedName_map.put(nsuri,result);	// for optimization
	    	}
	    	else
	    		result = packageQualifiedName;
	    }
	    return result;
	}


    
	
	/**
	 * Get the contentMapEntry which key is the RuntimeObject representing the given string.
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
    
}

