/* $Id: Runtime2EMF.java,v 1.1 2005-07-20 16:42:19 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : Runtime2EMF.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 20, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
/**
 * 
 */
public class Runtime2EMF {

    /**
     * 
     */
    public Runtime2EMF() {
        super();
    }
    

    /**
     * @param unit
     * @param file_path
     */
    public static void saveunit(EMFRuntimeUnit unit, String file_path) {

        Runtime2EMF r2e = new Runtime2EMF();
        // Initialize the resource
	    String ext = file_path.substring(file_path.lastIndexOf(".")+1);
        System.err.println("Je rentre dans la sauvegarde :" + " : ext=" + ext);
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
	    ResourceSet resource_set = new ResourceSetImpl();
	    Resource resource = resource_set.createResource(URI.createFileURI(file_path));
	    System.err.println("URI ou sauver : " + URI.createFileURI(file_path).toString());
	    // Update all the instance of the EMF Model
	    r2e.updateEMFModelPass1(unit, resource);
	    
	    try {
			resource.save(null);
		} catch (IOException e) {
		    e.printStackTrace();
			throw new Error(e);
		}
        
    }
    
    public void updateEMFModelPass1(EMFRuntimeUnit unit, Resource resource)
    {
        //  Get the Java version of the instances RuntimeObject
        ArrayList instances = Collection.getArrayList(unit.getInstances());
        Iterator it = instances.iterator();
        // Get each instance and translate it in EMF (EObject)
        while(it.hasNext()) {
            RuntimeObject ro = (RuntimeObject)it.next();
            // Get the corresponding initial EObject in the RuntimeUnit
            //EObject eObject = 
            // Update the EMF Object attached to our
            EObject o = updateEObjectFromRuntimeObject(ro, unit);
            if (o.eResource() == null && o.eContainer() == null)
            {
                //fixTypeContainement(o);
                resource.getContents().add(o);
            }
        }
    }
    
    /**
     * Get the value stored in the properties of RO in order to update the EObject,
     * in the case the user modified them
     * @param ro
     */
    protected EObject updateEObjectFromRuntimeObject(RuntimeObject rObject, EMFRuntimeUnit unit)
    {
        EObject eObject = (EObject)rObject.getData().get("ecoreObject");
        // For each property of RO, convert it!
        Iterator it = rObject.getProperties().keySet().iterator();
        while (it.hasNext())
        {
            // Get the property to update
            String prop_name = (String)it.next(); 
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            EStructuralFeature feature = getEStructuralFeatureByName(eObject, prop_name);
            eObject.eUnset(feature); // is it necessary?
            eObject.eSet(feature, property.getData().get("ecoreObject"));
        }
        return eObject;
    }
    
    protected EStructuralFeature getEStructuralFeatureByName(EObject eObject, String p_name)
    {
        EClass c = eObject.eClass();
        // EObject feature_value = null;
        // Get the structural features
        EList features = c.getEAllStructuralFeatures();
        // For each feature, get the value and add it to the properties hashtable
        Iterator it = features.iterator();
        String feature_name = "";
        EStructuralFeature feature = null;
        while (it.hasNext() &&  !feature_name.equals(p_name))
        {
            feature = (EStructuralFeature)it.next();
	        feature_name  = feature.getName();
	        System.err.println("feature : " + feature_name);
        }
        if (feature_name.equals(p_name))
        {
            return feature; //feature_value = (EObject)eObject.eGet(feature);
        }
        return null;
    }
}



