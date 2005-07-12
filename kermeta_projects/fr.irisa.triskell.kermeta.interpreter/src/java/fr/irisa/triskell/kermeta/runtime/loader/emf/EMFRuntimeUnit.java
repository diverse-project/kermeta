/* $Id: EMFRuntimeUnit.java,v 1.2 2005-07-12 16:36:03 zdrey Exp $
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

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.resource.URIConverter;

import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;


import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * 
 */
public class EMFRuntimeUnit extends RuntimeUnit {
    
    /** temporary attribute for the */
    public String metamodel_uri;
    protected EcoreUnit ecore_unit;
    protected FObject kermeta_mm;
    


    /**
     * 
     * @param uri the URI of the instance-model to load
     */
    public EMFRuntimeUnit(String pUri)
    {
        this.uri = pUri;
        // set "instances"
        this.load();
    }
    
    public EMFRuntimeUnit(String pUri, String pMMUri, RuntimeObject emptyInstances, EMFRuntimeUnitFactory pFactory)
    {
        this.metamodel_uri = pMMUri;
        this.uri = pUri;
        
        instances = emptyInstances;
        this.factory = pFactory;
        this.load();
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
        File f = new File(metamodel_uri);
    //    IFile kmtfile = ecorefile.getProject().getFile(ecorefile.getProjectRelativePath().removeFileExtension().addFileExtension("kmt"));
		// Create absolute path from relative 
        String unit_uri = instances.getFactory().getMemory().getUnit().getUri();
        String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/"));
        System.err.println("UNIT URI = "+ unit_uripath);
        
        String mm_uri = unit_uripath+"/"+metamodel_uri; 
//      resolve uri
    	URI u = URI.createURI(metamodel_uri);
   /* 	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(".")));    			
    	}*/
    	System.err.println("URI eclipse : "+ u.toString());
        
        ecore_unit = (EcoreUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(mm_uri);
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
     * 
     * @see fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit#load()
     */
    public void load() 
    {
        this.loadMetaModelAsKermeta();
        // EMF2Runtime is the builder 
        EMF2Runtime.loadunit(this);
        // TODO Auto-generated method stub
        
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

}
