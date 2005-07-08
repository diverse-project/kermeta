/* $Id: EMFRuntimeUnit.java,v 1.1 2005-07-08 11:39:08 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnit.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.ecore.ECore2Kermeta;
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
        metamodel_uri = "file:///udd/zdrey/Workspaces/runtime-workbench-workspace/sanfami/src/cs.ecore";
        ecore_unit = (EcoreUnit)KermetaUnitFactory.getDefaultLoader().createKermetaUnit(metamodel_uri);
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
        return "file:///udd/zdrey/Workspaces/runtime-workbench-workspace/sanfami/src/MyFirstTest.cs";
        //return uri;
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
