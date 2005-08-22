/* $Id: EMF2Runtime.java,v 1.17 2005-08-22 08:28:03 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMF2Runtime.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 7, 2005
 * Authors       : zdrey
 * History : 
 * 		- 18/08/2005 - the instances attribute now only contains the root elements.
 * 		- 18/08/2005 - populating the runtimeobject is modified since containment handling
 * 					   seems not to be adapted to model instance load.
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveCollection;
import fr.irisa.triskell.kermeta.runtime.language.ReflectiveSequence;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * This class is used to transform an EMF model into a RuntimeObject representation,
 * so that we can manipulate this model in Kermeta.
 * For this purpose, we defined a new entry in the RuntimeObject <code>data</code> hashtable : 
 * 	{ emfObject : an EMF instance in the loaded EMF model }; This entry is useful
 * when we want to update an object.
 *     
 * 
 * ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI().
 * 
 */
public class EMF2Runtime {

    /** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");
    
    /**
     * 
     */
    public EMF2Runtime() {
        super();
        typedef_cache = new Hashtable();
        runtime_objects_map = new Hashtable();
        
    }
    
    /**
     * Hashtable that contains the RuntimeObjects for the class Definitions of the metamodel.
     * entry is { name_of_the_class : corresponding Runtime Object}
     */
    protected Hashtable typedef_cache;
    
    /**
     * The list of runtimeObjects that represent the EMF instances
     */
    protected Hashtable runtime_objects_map; // { eobject : robject }
    
	public static void loadunit(EMFRuntimeUnit unit) {
	    KermetaUnit kunit =  unit.getInstances().getFactory().getMemory().getUnit();
		try {
	//		 load ressource
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
	//		Resource resource = resource_set.getResource(URI.createURI(unit.getUri()), true);
			String unit_uri = kunit.getUri();
	        String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1); 
	    	URI u = URI.createURI(unit.getUri());
	    	internalLog.info("URI created for model to load : "+u);
	    	if (u.isRelative()) {
	    		URIConverter c = new URIConverterImpl();
	    		u = u.resolve(c.normalize(URI.createURI(unit_uripath)));    			
	    	}
			Resource resource = resource_set.getResource(u, true);
	        loadunit(unit, resource);
		} catch (Throwable e) {
			
		    // Create a resourceLoadException
		    KermetaRaisedException ex = new KermetaRaisedException(unit.getInstances(), unit.getInstances().getFactory().getMemory().getCurrentInterpreter());
		    KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUri() + " : " + e, e);
		    kunit.error.add(new KMUnitError("EMF persistence error : could not load the given model :\n"+ e, (FObject)unit.getInstances().getData().get("kcoreObject")));
		    throw ex;
		}
	}
	
	public static void loadunit(EMFRuntimeUnit unit, Resource resource)
	{
		try {
		    EMF2Runtime visitor = new EMF2Runtime();
			// pre-create the runtime objects
			TreeIterator it = resource.getAllContents();
			while(it.hasNext())
			{
				EObject obj = (EObject)it.next();
				RuntimeObject ro = visitor.setRuntimeObjectForEObject(unit, obj);
				visitor.runtime_objects_map.put(obj, ro);
				//internalLog.info("RO created : "+ (ro != null) + "->" + ro);
			}
			// If the meta-model uri was not provided in the constructor of EMFRuntimeUnit, we try
			// to find one
			if (unit.getMetaModelUri()==null || unit.getMetaModelUri().length()==0)
			{
			    // This case must not occur : it is not valid for the "save()" method call in Runtime2EMF
			    String mmUri = ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI();
			    unit.setMetaModelUri(mmUri);
			    unit.loadMetaModelAsKermeta(mmUri);
			}
			
			// Use the runtime objects hashtable for EMFRuntimeUnit
			// FIXME : this attribute would be more relevant in EMFRuntimeUnit
			unit.setRuntimeObjectsMap(visitor.runtime_objects_map);
			
			// Fill in the properties of the runtime objects that we created
			Iterator rit = visitor.runtime_objects_map.keySet().iterator();
			ArrayList new_runtime_objects = new ArrayList();
			EObject eObject = null;
			while (rit.hasNext())
			{	
			    eObject = (EObject)rit.next();
			    RuntimeObject rObject = (RuntimeObject)visitor.runtime_objects_map.get(eObject);
			    visitor.populateRuntimeObject(rObject, unit);
			    //visitor.runtime_objects_map.put(eObject, rObject);
			    new_runtime_objects.add(rObject);
			    
			}
			// Now that RO are populated, we can add the instances
			Iterator nit = visitor.runtime_objects_map.keySet().iterator();
			//Iterator nit = new_runtime_objects.iterator();
		    // only add the roots
			while (nit.hasNext())
			{ 	
			    eObject = (EObject)nit.next();
			    RuntimeObject rObject = (RuntimeObject)visitor.runtime_objects_map.get(eObject);
//				set the container if needed 
			    if (eObject.eContainer() != null)
			    {
			    	rObject.setContainer((RuntimeObject)visitor.runtime_objects_map.get(eObject.eContainer()));
			    }
			    else
			    {
			        rObject.setContainer(null);
			        fr.irisa.triskell.kermeta.runtime.basetypes.Collection.add(unit.getInstances(), rObject);
			    }
			}
		} catch (Throwable e) {
		    KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUri() + " : " + e, e);
		}
		
	}
	
	/**
	 * Define the runtimeObject corresponding to this object
	 * - get the runtimeobject of the meta class it refers to 
	 * -
	 */
	public RuntimeObject setRuntimeObjectForEObject(EMFRuntimeUnit unit, EObject eObject)
	{
	    RuntimeObject result = null;
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    // Define the RO-metaclass of the given EObject
	    RuntimeObject ro_metaclass = this.getRuntimeObjectForMetaClass(eObject.eClass(), unit);
	    
	    // Define the RO-instance of the given EObject :
	    // - create a RO
	    // - fill its properties hashtable
	    result = new RuntimeObject(memory.getROFactory(), ro_metaclass);
        result.getData().put("emfObject", eObject);
        return result;
        
	}
	
    public RuntimeObject setRuntimeObjectForPrimitiveTypeValue(EMFRuntimeUnit unit, Object fvalue)
    {
        RuntimeObjectFactory rofactory = unit.getInstances().getFactory();
        RuntimeObject rovalue = rofactory.getMemory().voidINSTANCE;
//      Boolean
    	if (fvalue instanceof Boolean) {
    		if (((Boolean)fvalue).booleanValue()) {
    			rovalue = rofactory.getMemory().trueINSTANCE;
    		}
    		else 
    		{
    			rovalue = rofactory.getMemory().falseINSTANCE;
    		}
    	}
    	// Integer
    	else if (fvalue instanceof Integer) {
    	    rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(((Integer)fvalue).intValue(), rofactory);
    	}
    	// String
    	else if (fvalue instanceof String) {
    	    rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.String.create((String)fvalue, rofactory);
    	}
    	else if (fvalue == null) 
    	{
    	    rovalue = rofactory.getMemory().voidINSTANCE;
    	}
    	else // should never happen
    	{
    		System.err.println("NotImplemented custom Error : The type of <"+fvalue+"> has not been handled yet."+fvalue);	
    		throw new KermetaRaisedException(rovalue, rofactory.getMemory().getCurrentInterpreter());
    	}
    	return rovalue;
    }
	
	/**
	 * Return the FClass corresponding to the given name. Looks inside the loaded
	 * ecore metamodel if it was not found in the main kermeta unit. 
	 * @param name
	 */
	protected FType getMetaClassByName(String name, EMFRuntimeUnit unit)
	{
	    FTypeDefinition etype_cdef;
	    FType ftype = null;
	    FClass etype_fclass = null;
	    etype_cdef = unit.getInstances().getFactory().getMemory().getUnit().getTypeDefinitionByName(name);
	    if (etype_cdef!= null)
	    {
	    	// pseudo object to get its type?
	    	if (FClassDefinition.class.isInstance(etype_cdef))
	    	{	//etype_fclass = kunit.struct_factory.createFClass();
		        //etype_fclass.setFClassDefinition((FClassDefinition)etype_cdef);
		    	ftype = InheritanceSearch.getFClassForClassDefinition((FClassDefinition)etype_cdef);
	    	}
	    	// Is it a primitive type?
	    	else if (FPrimitiveType.class.isInstance(etype_cdef))
	    	{
	    	    ftype = ((FPrimitiveType)etype_cdef).getFInstanceType();
	    	}
	    }
	    else
	    // We should never enter here
	    {
	    	KermetaUnit.internalLog.error("Error finding a class :" + name + " in loaded libraries.");
	    	unit.getInstances().getFactory().getMemory().getUnit().error.add("EMF Loading error : " +
	    	        "could not find a class ("+name+") for EMF model" );
	        ftype = null;
	    }
        // FIXME : it would be better not to create the FClass corresponding to the type every time we need one?
        return ftype; 
	}
	
	protected FProperty getPropertyByName(String name, FClass fclass, EMFRuntimeUnit unit)
	{
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    FProperty p = null;
	    FClassDefinition c = fclass.getFClassDefinition();
	    ArrayList props = memory.getUnit().getAllProperties(c);
		for (int i=0; i<props.size(); i++) {
			FProperty prop = (FProperty)props.get(i);
			if (prop.getFName().equals(name)) p = prop;
		}
	/*    p = unit.getInstances().getFactory().getMemory().
	    			  getUnit().getPropertyByName(fclass.getFClassDefinition(), name);*/
	    return p;
	}
	
	/**
	 * Add the properties as RuntimeObjects to the object rObject
	 * @param rObject
	 * @param unit
	 */
	protected void populateRuntimeObject(RuntimeObject rObject, EMFRuntimeUnit unit)
	{
	    EObject eObject = (EObject)rObject.getData().get("emfObject");
	    
	    // Get the FClass of the RuntimeObject to populate
	    EClass c = eObject.eClass();
	    FClass fc = (FClass)getMetaClassByName(unit.getEQualifiedName(c), unit);
	    
	    // Get the structural features
	    EList features = c.getEAllStructuralFeatures(); 
	    // For each feature, get the value and add it to the properties hashtable
	    Iterator it = features.iterator();
	    while (it.hasNext())
	    {
	        EStructuralFeature feature = (EStructuralFeature)it.next();
	        RuntimeObjectFactory rofactory = unit.getInstances().getFactory();
	        String  fname  = feature.getName();
	        EClassifier etype = feature.getEType();
	        FType ftype = getMetaClassByName(unit.getEQualifiedName(etype), unit);
	        FProperty fprop = getPropertyByName(fname, fc, unit);
	        RuntimeObject roprop = rofactory.getMemory().getRuntimeObjectForFObject(fprop);
	        
	        // Eget can return an elist of features
	        Object fvalue = eObject.eGet(feature);
	        RuntimeObject rovalue = null;
	        // A feature with multiplicity
	        if (fvalue instanceof EList)
	        {
	        	rovalue = createRuntimeObjectForCollection((EList)fvalue, ftype, unit, rObject, roprop);
	        	
	        }
	        // Get the RO-repr of this EObject
	        else if (fvalue instanceof EObject)
	        {   
	            rovalue = (RuntimeObject)this.runtime_objects_map.get(fvalue);
	            rObject.getProperties().put(fname, rovalue);
	            // FIXME the set method needs to be reviewed (for model instances?)
	            //fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, rovalue);
	        }
	        // equiv : fvalue instanceof EString, Eblabla
	        else if (EDataType.class.isInstance(etype))
	        {
	        	rovalue = setRuntimeObjectForPrimitiveTypeValue(unit, fvalue);
	        	fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, rovalue);
	        	
	        }
	        else if (fvalue == null)
	        {    
	            fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop,rObject.getFactory().getMemory().voidINSTANCE);
	        }
	        else // Enum?
	        {
	            System.err.println("NotImplemented custom Error : The type <"+etype+"> has not been handled yet."+fvalue);
	            // TODO : print this stuff in the console!!
	            throw new KermetaRaisedException(rObject, rObject.getFactory().getMemory().getCurrentInterpreter());
	        }
	        // If we instanciated a RuntimeObject value, we can set the properties for the object 
	        if (fvalue != null)
	            rovalue.getData().put("emfObject", fvalue);
	    } // End of while
	    // Find the value of the structural features and populate the properties.
	}
	
	/**
	 * Create a RuntimeObject that represent a collection.
	 * We need to create in "purely" in java when we have an instance which one of its properties
	 * has an upperBound that is * or a number > 1
	 * Adds the list of objects given in arguments, and create a collection which type parameter is typeParam.
	 * 
	 * @param objects a list of EObjects that represent a property[0..*] of elements of type typeParam
	 * @param object
	 * @return a Set of objects (Set<typeParam>)
	 */
	public RuntimeObject createRuntimeObjectForCollection(EList objects, FType typeParam, EMFRuntimeUnit unit, RuntimeObject rObject, RuntimeObject roprop)
	{
	    RuntimeObject result = fr.irisa.triskell.kermeta.runtime.language.Object.get(rObject, roprop);
	    // We create one by default 
	    if (Collection.getArrayList(result) == null)
	    {	        result.getData().put("CollectionArrayList", new ArrayList());	    
	    }
        RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    Iterator it = objects.iterator();
	    int i = 0;
	    // Transform the EObjects into RuntimeObject and add them in our collection
	    while (it.hasNext())
	    {
	        Object sfeature = it.next();
	        RuntimeObject rovalue;
	        if (sfeature instanceof EObject)
	            rovalue = (RuntimeObject)this.runtime_objects_map.get(sfeature);
	        else // it is a Datatype
	            rovalue = setRuntimeObjectForPrimitiveTypeValue(unit, sfeature);
	            
	        // RuntimeObject ri = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(i, memory.getROFactory());
	        // ReflectiveSequence.addAt(result, ri, rovalue); i+=1;
	        // FIXME : ReflectiveSequence addAt and ReflectiveCollection add 
	        // handle differently the containment of the added element.
	        // ReflectiveCollection.add(result, rovalue);
	        rovalue.getData().put("emfObject", sfeature);
	        Collection.add(result, rovalue); i+=1;
	    }
	    rObject.getProperties().put(((RuntimeObject)roprop.getProperties().get("name")).getData().get("StringValue"), result);
	    // FIXME : the set method handles the containment, but it seems to be not appropriated for 
	    // model instances. Containment is observed even if we simply use Collection.add to add instances
	    // since result is still a reflective collection.
	    //fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, result);
	    return result;
	}

	/**
	 * Get or create (if it does not exist) the RuntimeObject for the given EClass, and put it 
	 * in the runtime unit. The class is found in the unit typedef_cache or put in it if it was not
	 * found in it. We use it to define instances of metaclass type.
	 * @param metaclass The EClass to "convert" in a RuntimeObject
	 * @param unit The runtime unit we are working with
	 * @return the RuntimeObject embedding the Kermeta FClass equivalent to the given EClass
	 */
	public RuntimeObject getRuntimeObjectForMetaClass(EClass metaclass, EMFRuntimeUnit unit)
	{
	    RuntimeObject result = null;
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    String metaclass_name = unit.getEQualifiedName(metaclass);
	    if (this.typedef_cache.containsKey(metaclass_name)) 
	    {
	        result = (RuntimeObject)this.typedef_cache.get(metaclass_name);
	        internalLog.info("Found a RO for FClass <"+ metaclass_name +"> in cache : "+result);
	    }
	    else
	    {   // Create the RuntimeObject encaspulating the FClass corresponding to the EClass given by its name :
	        // Reconstruct from FClass -> FClassDefinition (meta meta levels) -> Our EClass
	        FType ftype = this.getMetaClassByName(metaclass_name, unit);
	        FClass fclass = (FClass)ftype;
	        result = memory.getROFactory().createMetaClass(fclass);
	        this.typedef_cache.put(metaclass_name, result);
	    }
	    return result;
	}


}
