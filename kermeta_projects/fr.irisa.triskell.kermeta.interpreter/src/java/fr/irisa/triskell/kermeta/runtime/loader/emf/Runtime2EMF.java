/* $Id: Runtime2EMF.java,v 1.2 2005-07-21 18:26:14 zdrey Exp $
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
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeContainer;
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
        ArrayList root_containers = new ArrayList();
        //  Get the instances RuntimeObject
        ArrayList instances = Collection.getArrayList(unit.getInstances());
        ArrayList eobjects = new ArrayList(); 
        Iterator it = instances.iterator();
        // Get each instance and translate it in EMF (EObject)
        int instance_number = 1;
        while(it.hasNext()) {
            RuntimeObject ro = (RuntimeObject)it.next();
            // Get the corresponding initial EObject in the RuntimeUnit
            //EObject eObject = 
            // Update the EMF Object attached to our
            EObject o = updateEObjectFromRuntimeObject(ro, unit, resource);
            eobjects.add(o);
            
            //if (o.eResource() == null && o.eContainer() == null)
            // TODO test if user gave a new URI
            // If object has no container, so it is a root element : 
            // Is it a root?
            if (o.eContainer() == null)
            {
                root_containers.add(o);
            }

            // We look for its children, add them, and then, add it in the resource
            System.err.println("----------------------------------");
            System.err.println("Objet n°" + instance_number + " : ("+ o.hashCode() +")" );
            System.err.println("   sa resource : "+ o);
            System.err.println("   sa resource : "+ o.eResource());
            System.err.println("   son conteneur : "+ o.eContainer());
            if (o.eContainer()!=null && o.eContainer() instanceof EPackage)
                System.err.println("        ( : "+ ((EPackage)o.eContainer()).getName());
            System.err.println("   sa classe : "+ o.eClass().getName());
            System.err.println("----------------------------------");
            instance_number+=1;
            
        }
        
        
        it = root_containers.iterator();
        while (it.hasNext())
        {
            EObject o = (EObject)it.next();
            // If resource is null
            // o.eResource() == null &&
            // resource must not be null!!!!
            System.err.println("UNCONTAINER : "+ o.eClass().getName());
            System.err.println("----------->"+ o);
            resource.getContents().add(o);
            fixTypeContainement(o, resource);
        }
        

        // Update resource!!! (as we updated features!)
        it = eobjects.iterator();
        while (it.hasNext())
        {
            EObject o = (EObject)it.next();
            
            resource.getContents().add(o);
        }
    }
    
    /**
     * Add the contents of the object to the resource
     * @param o
     */
    private void fixTypeContainement(EObject eObject, Resource resource)
    {

        TreeIterator it = eObject.eAllContents();
		while(it.hasNext()) {
			EObject o = (EObject)it.next();
			if (o instanceof EObject && o.eResource()==null && o!=null)
			{
			    System.out.println("\n*********************************\nEOBJECT : " + o);
			    resource.getContents().add(o);
			    
			    fixTypeContainement(o, resource);
			}
		}
		if (eObject.eResource() == null)
		resource.getContents().add(eObject);
        
    }


    /**
     * Get the value stored in the properties of RO in order to update the EObject,
     * in the case the user modified them
     * TODO : We have to create a new feature?
     * @param ro
     */
    protected EObject updateEObjectFromRuntimeObject(RuntimeObject rObject, EMFRuntimeUnit unit, Resource resource)
    {
        EObject eObject = (EObject)rObject.getData().get("ecoreObject");
        // For each property of RO, convert it!
        Iterator it = rObject.getProperties().keySet().iterator();
        System.out.println("Feature Owner : "+ eObject.eClass());
        while (it.hasNext())
        {   
            String prop_name = (String)it.next(); 
            RuntimeObject property = (RuntimeObject)rObject.getProperties().get(prop_name);
            EStructuralFeature feature = getEStructuralFeatureByName(eObject, prop_name);
            // Get the etype of our feature
            EClassifier etype = feature.getEType();
	        //FType ftype = getMetaClassByName(getEQualifiedName(etype), unit);
            
            //eObject.eUnset(feature); // is it necessary? (when object modified by the user?)
            Object property_eObject = property.getData().get("ecoreObject");
            // Add property eObject in a resource if not yet
            if ( property_eObject instanceof EObject)
            {
                
                eObject.eSet(feature, property_eObject);
                //fixTypeContainement((EObject)property_eObject, resource);
                	
                
            }
            else if (property_eObject instanceof EList)
            {
                System.out.println("Je suis une liste de "+((EList)property_eObject).size()+" elements.");
                
                Iterator p_it = ((ArrayList)property.getData().get("CollectionArrayList")).iterator();
                // Je comprends pas pourquoi property_eObject ne contient rien roooo
                while (p_it.hasNext())
                {
                    Object p_o = ((RuntimeObject)p_it.next()).getData().get("ecoreObject");
                    // We could have an EList I suppose?
                    
                    ((EList)property_eObject).add(p_o);
                    System.out.println("    "+feature.getName() + " -> "+ p_o);
                    
                }
                eObject.eSet(feature, (EList)property_eObject);
                //while (p_it.hasNext())  fixTypeContainement((EObject)p_it.next(), resource);
            }
            else if (etype instanceof EDataType)
            {
                property_eObject = getPrimitiveTypeValueFromRuntimeObject(property);
                eObject.eSet(feature, property_eObject);
            }
            else
            {
                System.err.println("Je suis une propriete dont le type n'est pas bien reconnu!!!" + etype);
            }
            System.out.println("AVANT : " + property_eObject);
            
            System.out.println("    (apres)"+feature.getName() + " -> "+ eObject.eGet(feature, true).getClass());
            
            
     /*       if (EList.class.isInstance(property_eObject))
            {
                Iterator p_it = ((EList)property_eObject).iterator();
                while (p_it.hasNext())
                    eObject.eContents().add((EObject)p_it.next());
            }
            else   
                eObject.eContents().add(property_eObject);*/
        }
        return eObject;
    }
    
    /**
     * Map the modified objects :
     * An object that was modified in Kermeta do not update automatically the ecore corresponding object :
     * (The architecture is not a proxy yet) We have to lazily update the mapped EObject.
     * This method handle the case of features that are data types (EDataType) :
     * 
     * ----------------------> We have to update the default literal value
     * 
     * FIXME : a dirty patchy method : We have to do a proper mapping between FTypes and ETypes
     * @param ro The runtime object corresponding to the given feature
     * @param
     * 
     */
    public Object getPrimitiveTypeValueFromRuntimeObject(RuntimeObject robject)
    {
        // Helper hashtable
        Hashtable primitive_types_mapping = new Hashtable();
    	primitive_types_mapping.put("StringValue", 	"EString");
    	primitive_types_mapping.put("BooleanValue",	"EBoolean");
    	primitive_types_mapping.put("NumericValue",	"EInt");
    	String[] s_primitive_types = new String[] {"StringValue", "BooleanValue", "NumericValue" };
    	
    	for (int i=0; i<s_primitive_types.length; i++)
    	    if (robject.getData().containsKey(s_primitive_types[i]))
    	    {
    	        return robject.getData().get(s_primitive_types[i]);
    	    }
    	return null;

    }
    
    /**
     * Map the modified objects :
     * An object that was modified in Kermeta do not update automatically the ecore corresponding object :
     * (The architecture is not a proxy yet) We have to lazily update the mapped object from Ecore.
     * This method handle the case of features that are EObject
     */
    public void mapRuntimeObjectToEObject()
    {
        
    }
    
    /**
     * 
     * @param eObject
     * @param p_name
     * @return
     */
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
        }
        if (feature_name.equals(p_name))
        {
            return feature; //feature_value = (EObject)eObject.eGet(feature);
        }
        return null;
    }
}



