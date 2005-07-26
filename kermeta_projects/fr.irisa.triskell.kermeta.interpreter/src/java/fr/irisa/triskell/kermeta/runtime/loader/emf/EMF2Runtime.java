/* $Id: EMF2Runtime.java,v 1.9 2005-07-26 16:41:46 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMF2Runtime.java
 * License   : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 7, 2005
 * Authors       : zdrey
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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FPrimitiveType;
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
		try {
	//		 load ressource
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
	//		Resource resource = resource_set.getResource(URI.createURI(unit.getUri()), true);
			String unit_uri = unit.getInstances().getFactory().getMemory().getUnit().getUri();
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
			
			KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUri() + " : " + e, e);
			// TODO : kermeta persistence should also raise an exception when load unit failed!
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
				//internalLog.info("RO created : "+ (ro != null));
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
			Iterator rit = visitor.runtime_objects_map.values().iterator();
			RuntimeObject ro = null;
			while (rit.hasNext())
			{
			    ro = (RuntimeObject)rit.next();
			    visitor.populateRuntimeObject(ro, unit);
			    fr.irisa.triskell.kermeta.runtime.basetypes.Collection.add(unit.getInstances(), ro);
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
	public RuntimeObject setRuntimeObjectForEObject(EMFRuntimeUnit unit, EObject object)
	{
	    RuntimeObject result = null;
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    // Define the RO-metaclass of the given EObject
	    RuntimeObject ro_metaclass = this.getRuntimeObjectForMetaClass(object.eClass(), unit);
	    
	    // Define the RO-instance of the given EObject :
	    // - create a RO
	    // - fill its properties hashtable
	    result = new RuntimeObject(memory.getROFactory(), ro_metaclass);
        result.getData().put("emfObject", object);
        return result;
        
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
	    // FIXME : We should never enter here
	    if (etype_cdef == null)
	    {
	        // todo : we also have to test the type (can be FClass, or FPrimitiveType, and probably other kinds of types...)
	        // Get the FObject corresponding to this etype
	        //RuntimeObject roTypeParam = getRuntimeObjectForMetaClass(etype.getName(), unit);
	        etype_cdef = unit.getMetamodelUnit().getTypeDefinitionByName(name);
	        etype_fclass = unit.getMetamodelUnit().struct_factory.createFClass();
	        etype_fclass.setFClassDefinition((FClassDefinition)etype_cdef);
	        ftype = etype_fclass;
	    }
        // FIXME : it would be better not to create the FClass corresponding to the type every time we need one?
        return ftype; 
	}
	
	/**
	 * Add the properties to the object
	 * @param rObject
	 * @param unit
	 */
	protected void populateRuntimeObject(RuntimeObject rObject, EMFRuntimeUnit unit)
	{
	    EObject eObject = (EObject)rObject.getData().get("emfObject");
	    
	    EClass c = eObject.eClass();
	    
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
	        // Eget can return an elist of features
	        Object fvalue = eObject.eGet(feature);
	        RuntimeObject rovalue = null;
	        // A feature with multiplicity
	        if (fvalue instanceof EList)
	        {	
	            rovalue = createRuntimeObjectForCollection((EList)fvalue, ftype, unit);
	        }
	        // Get the RO-repr of this EObject
	        else if (fvalue instanceof EObject)
	        {   
	            rovalue = (RuntimeObject)this.runtime_objects_map.get(fvalue);
	        }
	        // equiv : fvalue instanceof EString, Eblabla
	        else if (EDataType.class.isInstance(etype))
	        {
			    String str = null;
			    //str = feature.getDefaultValueLiteral();
			    if (fvalue != null)
			    {   // EStrgin->java.lang.String EInt->java.lang.int
			        str = fvalue.toString();
			    }
			    if (str == null) str = "";
			    rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.String.create(str, rofactory);
	        }
	        else // EEnum!
	        {
	            System.err.println("NotImplemented custom Error : The type <"+etype+"> has not been handled yet.");
	            throw new KermetaRaisedException(rObject, rObject.getFactory().getMemory().getCurrentInterpreter());
	        }
	        // If we instanciated a RuntimeObject value, we can set the properties for the object 
	        if (rovalue != null)
	        {
	            rObject.getProperties().put(fname, rovalue);
	            // FIXME : property can be : EObject || EList || null
	            if (fvalue != null)
	                rovalue.getData().put("emfObject", fvalue);
	        }	
	        else
	            rObject.getProperties().put(fname, rObject.getFactory().getMemory().voidINSTANCE);
	    }
	    // Find the value of the structural features and populate the properties.
	}
	
	/**
	 * Create a RuntimeObject that represent a collection.
	 * We need to create in "purely" in java when we have an instance which one of its properties
	 * has an upperBound that is * or a number > 1
	 * Adds the list of objects given in arguments, and create a collection which type parameter is typeParam.
	 * 
	 * @param objects a list of EObjects
	 * @return a Set of objects (Set<typeParam>)
	 */
	public RuntimeObject createRuntimeObjectForCollection(EList objects, FType typeParam, EMFRuntimeUnit unit)
	{
	    //memory.getROFactory().createMetaClass(fclass)
	    RuntimeMemory memory = unit.getInstances().getFactory().getMemory();
	    // Get the runtimeobject that embeds the FClass "Set"
	    RuntimeObject result = Collection.create("kermeta::standard::Set", memory.getROFactory(), typeParam);
	    Iterator it = objects.iterator();
	    // Transform the EObjects into RuntimeObject and add them in our collection
	    while (it.hasNext())
	    {
	        EObject sfeature = (EObject)it.next();
	        RuntimeObject rovalue = (RuntimeObject)this.runtime_objects_map.get(sfeature);
	        Collection.add(result, rovalue);
	    }
	    // Add the "emfObject" property here or not? EList is not EObject, but we respect a kind of mapping...
	    result.getData().put("emfObject", objects);
	    return result;
	}

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
	    {
	        // Create the RuntimeObject encaspulating the FClass corresponding to the EClass given by its name :
	        // Reconstruct from FClass -> FClassDefinition (meta meta levels) -> Our EClass 
	        // Here, the type def should always be a FCLassDefinition
	        FType ftype = this.getMetaClassByName(metaclass_name, unit);
	        FClass fclass = (FClass)ftype;
	        result = memory.getROFactory().createMetaClass(fclass);
	        this.typedef_cache.put(metaclass_name, result);
	    }
	    return result;
	    
	}


}
