/* $Id: EMFRuntimeUnit.java,v 1.9 2006-03-03 15:21:47 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnit.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * FIXME : Check that we work with all qualified names of Classes.
 */
public class EMFRuntimeUnit extends RuntimeUnit {
    
    /** temporary attribute for the */
    public String metamodel_uri;
    /** almost deprecated */
    protected EcoreUnit ecore_unit;
    protected fr.irisa.triskell.kermeta.language.structure.Object kermeta_mm;
    /** { EObject : RuntimeObject } */
    private Hashtable runtime_objects_map;
    
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
    
    /**
     * Loads the meta model given as argument as a Kermeta metamodel.
     * The uri extension should be .ecore.
     * Note : as the user *must* add a "require" the metamodel in his
     * kermeta code, this method may be useless.
     */
    public void loadMetaModelAsKermeta(String p_metamodel_uri)
    {
        KermetaUnitFactory.getDefaultLoader().unloadAll();
        // Create the correct uri
    //    IFile kmtfile = ecorefile.getProject().getFile(ecorefile.getProjectRelativePath().removeFileExtension().addFileExtension("kmt"));
		// Create absolute path from relative 
        String unit_uri = contentMap.getFactory().getMemory().getUnit().getUri();
        String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1); 
        //      resolve uri
        URI u = this.resolveURI(p_metamodel_uri, unit_uripath);
    	//EMF2Runtime.internalLog.info("UNIT URI = "+ u.toString());
    	//System.err.println("UNIT URI = "+ u.toString() + "(path : "+ unit_uripath+")");
        ecore_unit = (EcoreUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(u.toString());
        
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
        System.err.println("URI : " + unit_uripath +  "; meta : " + p_metamodel_uri);
    	URI u = this.resolveURI(p_metamodel_uri, unit_uripath);
        // load resource
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
    
    /* protected FObject getFTypeFromEType(EClassifier type)
    {
        return ((EcoreUnit)ecore_unit).getTypeDefinitionByName(type.getName());
    } */
    /**
     * Load this RuntimeUnit
     * @see fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit#load()
     */
    public void load() 
    {
        if (this.metamodel_uri !=null && this.metamodel_uri.length()>0)
            this.loadMetaModelAsKermeta(metamodel_uri);
        // EMF2Runtime is the builder 
        // If metamodel_uri is null/empty, then loadunit will set it.
        EMF2Runtime.loadunit(this);
    }
    
	/**
	 * Save this RuntimeUnit as an XMIModel (EMFModel)
	 * TODO : rename this method in saveAsEMFModel to be consistent with KermetaUnit?
	 * Get the extension specified in file_path and decide to choose it as the extension of XMIResource.
	 * @param file_path the xmi file. the extension of the file should be .km
	 */
	public void save(String file_path) {
	    Runtime2EMF.saveunit(this, file_path);
	}
    
    
   /*
    * ACCESSORS
    *
    */
	public String getMetaModelUri()
	{
	    return metamodel_uri;
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
    
    public EcoreUnit getMetamodelUnit()    {  return ecore_unit; }
    public void setMetamodelUnit(EcoreUnit mmUnit)    {  this.ecore_unit = mmUnit; }
    
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
	    return result;
	}

    /**
     * @param mmUri
     */
    public void setMetaModelUri(String mmUri) {
        this.metamodel_uri = mmUri;
        
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
    
}

