/* $Id: EMFRuntimeUnit.java,v 1.4 2005-07-20 16:42:19 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnit.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClassifier;

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
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FPackage;

/**
 * 
 */
public class EMFRuntimeUnit extends RuntimeUnit {
    
    /** temporary attribute for the */
    public String metamodel_uri;
    protected EcoreUnit ecore_unit;
    protected FObject kermeta_mm;
    /** { EObject : RuntimeObject } */
    private Hashtable runtime_objects_map;
    


    /**
     * NOTE : this constructor should not been called directly by client.
     * Use EMFRuntimeFactory instead.
     * @param uri the URI of the instance-model to load
     */
    public EMFRuntimeUnit(String pUri)
    {
        this.uri = pUri;
        //this.load();
    }
    
    /**
     * NOTE : this constructor should not been called directly by client.
     * Use EMFRuntimeFactory instead.
     * @param uri the URI of the instance-model to load
     * @param pMMUri the URI of the meta-model FIXME : we will get it from NSURI stored un instance-model
     * @param emptyInstances the RuntimeObject for the collection of instances of the instance-model
     * @param pFactory the factory to create this EMFRuntimeUnit
     */
    public EMFRuntimeUnit(String pUri, String pMMUri, RuntimeObject emptyInstances, EMFRuntimeUnitFactory pFactory)
    {
        this.metamodel_uri = pMMUri;
        this.uri = pUri;
        instances = emptyInstances;
        this.factory = pFactory;
        //this.load();
    }
    
    /**
     * Loads the meta model given as argument as a Kermeta metamodel.
     * The uri extension should be .ecore.
     *
     */
    public void loadMetaModelAsKermeta()
    {
        KermetaUnitFactory.getDefaultLoader().unloadAll();
        
        // Create the correct uri
    //    IFile kmtfile = ecorefile.getProject().getFile(ecorefile.getProjectRelativePath().removeFileExtension().addFileExtension("kmt"));
		// Create absolute path from relative 
        String unit_uri = instances.getFactory().getMemory().getUnit().getUri();
        String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1); 
        //      resolve uri
    	URI u = URI.createURI(metamodel_uri);
    	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(unit_uripath)));    			
    	}
    	//EMF2Runtime.internalLog.info("UNIT URI = "+ u.toString());
    	//System.err.println("UNIT URI = "+ u.toString() + "(path : "+ unit_uripath+")");
        ecore_unit = (EcoreUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(u.toString());
    }
    
    /**
     * Create and return the kermeta meta-class equivalent to the given object
     * @param pObject
     * @return
     */
    protected FObject getFTypeFromEType(EClassifier type)
    {
        return ((EcoreUnit)ecore_unit).getTypeDefinitionByName(type.getName());
    }
    
    /**
     * Load this RuntimeUnit
     * @see fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit#load()
     */
    public void load() 
    {
        this.loadMetaModelAsKermeta();
        // EMF2Runtime is the builder 
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
    
    public String getUri()
    {
        return uri;
    }
    
    public EcoreUnit getMetamodelUnit()
    {
        return ecore_unit;
    }
    
    public RuntimeObject getInstances()
    {
        return instances;
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
}
