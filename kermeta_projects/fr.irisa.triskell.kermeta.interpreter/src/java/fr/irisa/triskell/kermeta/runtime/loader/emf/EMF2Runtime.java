/* $Id: EMF2Runtime.java,v 1.29 2006-02-09 13:03:50 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMF2Runtime.java
 * License   : EPL
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Collection;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
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
 * ((EObject)resource.getContents().get(0)).eClass().getEPackage().getNsURI().
 * 
 */
public class EMF2Runtime {

    /** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.EMF2Runtime");

    /**
     * Hashtable that contains the RuntimeObjects for the class Definitions of the metamodel.
     * entry is { name_of_the_class : corresponding Runtime Object}
     */
    protected Hashtable typedef_cache;
    
    /**
     * The list of runtimeObjects that represent the EMF instances
     */
    protected Hashtable runtime_objects_map; // { eobject : robject }
    
    
    public ResourceSet resource_set=null;
    public Resource root_resource=null;
    
    /**
     * Set this to true if you want to have more diagnostic info from EMF
     * Comment for <code>ENABLE_EMF_DIAGNOSTIC</code>
     */
    public static boolean ENABLE_EMF_DIAGNOSTIC =true;
    
    /**
     * 
     */
    public EMF2Runtime(ResourceSet newresource_set, Resource newroot_resource) {
        super();
        typedef_cache = new Hashtable();
        runtime_objects_map = new Hashtable();
        resource_set = newresource_set;
        root_resource = newroot_resource;
    }
    

    
	public static void loadunit(EMFRuntimeUnit unit) {
		XMLResource resource=null;
	    KermetaUnit kunit =  unit.getContentMap().getFactory().getMemory().getUnit();
		try {
			RuntimeMemory memory =unit.getContentMap().getFactory().getMemory();
        	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();
	//		 load ressource
			//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
			ResourceSet resourceset = new ResourceSetImpl();
	//		Resource resource = resource_set.getResource(URI.createURI(unit.getUri()), true);
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
	    	
//	    	 refer http://www.w3.org/TR/2004/PER-xmlschema-0-20040318/#ipo.xml
	    	if(true)
	    	{
	    		resource = 	(XMLResource)resourceset.createResource(u);
	    		if(resource != null) {
	    			resource.load(options);
	    		}
	    		else
	    		{
	    			String errmsg ="Not able to create a resource for URI: "+u ;
	    			internalLog.error(errmsg );
	    			throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
		        			errmsg,
							interpreter,
							memory,
							null);
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
			
			
	    	//loadDependentResources(resource, resourceset);
	    	//Resource resource2 = resourceset.createResource(URI.createURI("file:/C:/eclipse3.0.2/eclipse/plugins/fr.irisa.triskell.kermeta_0.0.16/lib/framework.km"));
	    	//resource2.load(options);
	    	
	    	
	    	EMF2Runtime emf2Runtime = new EMF2Runtime(resourceset, resource);
	    	//emf2Runtime.loadunit(unit, resource2);
	    	emf2Runtime.loadunit(unit, resource);
	        	    	
	    	
		}
		catch (IOException e){
			KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUriAsString() + " : " + e.getMessage(), e);			
			RuntimeMemory memory =unit.getContentMap().getFactory().getMemory();
        	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();
			throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
        			e.getMessage(),
					interpreter,
					memory,
					e); 
		}
		catch (WrappedException e){

			KermetaUnit.internalLog.error("Error loading EMF model " + unit.getUriAsString() + " : " + e.exception().getMessage(), e);
			kunit.messages.addError("EMF persistence error : could not load the given model :\n"+ e.exception().getMessage(), (FObject)unit.getContentMap().getData().get("kcoreObject"));
			
			if(resource != null){ // do that even if there where an exception
				Iterator it = resource.getErrors().iterator();
				while(it.hasNext()) {
					Resource.Diagnostic errorDiag =  (Resource.Diagnostic) it.next();
					KermetaUnit.internalLog.error("EMF diagnostic: "+errorDiag.getMessage());
				}
			}
			RuntimeMemory memory =unit.getContentMap().getFactory().getMemory();
        	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();
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
	 * returns the list of resources that are linked to the elements of this resources
	 *  it doesn't returns the metamodel resources.
	 * (this is because the getAllContents() on a resource set alos return the metamodel ...)
	 * result includes the input resources
	 * @return EList of Resource
	 */
	public EList findDependentResources(Resource resource)
	{
		EList result = new BasicEList();
		result.add(resource);
		findDependentResources(result, resource);
		return result;
	}
	/**
	 * recursive part of the findDependentResources method
	 * @param list
	 * @param resource
	 */
	protected void findDependentResources(EList list, Resource resource)
	{
		TreeIterator treeIt;
		treeIt = resource.getAllContents();
		while(treeIt.hasNext())
		{
			Object obj = treeIt.next();
			if(obj instanceof EObject)
			{
				EObject eobj = (EObject)obj;
				EClass eClass = eobj.eClass();
			    
			    // Get the structural features
			    EList features = eClass.getEAllStructuralFeatures(); 
			    // For each feature, get the value and and check if its resource is in the list
			    Iterator it = features.iterator();
			    while (it.hasNext())
			    {
			        EStructuralFeature feature = (EStructuralFeature)it.next();
			        Object fvalue = eobj.eGet(feature);
			        if (fvalue instanceof EList)
			        {
			        	//rovalue = createRuntimeObjectForCollection((EList)fvalue, ftype, unit, rObject, roprop);
			        	Iterator it2 = ((EList)fvalue).iterator();
			    	    // Transform the EObjects into RuntimeObject and add them in our collection
			    	    while (it2.hasNext())
			    	    {
			    	        Object sfeature = it2.next();
			    	        if (sfeature instanceof EObject)
			    	        	addObjectResourceToList(list,(EObject)sfeature);
			    	        // ignore other cases (Datatypes)
			    	    }
			        }
			        // Get the RO-repr of this EObject
			        else if (fvalue instanceof EObject)
			        {   
			        	addObjectResourceToList(list,(EObject)fvalue);			        	
			        }
			        // ignore other cases (Datatypes)
			    }
			}
		}
	}
	protected void addObjectResourceToList(EList list, EObject obj)
	{
		if((obj.eResource() != null) && (!list.contains(obj.eResource())))
    	{
			list.add(obj.eResource());
			internalLog.debug("Resource added : "+ obj.eResource().getURI());
    		// recursively add the resources
			findDependentResources(list,obj.eResource());
			
    	}
	}
	
	protected void createRuntimeObjects(EMFRuntimeUnit unit, Resource resource)
	{		
		EList resList = findDependentResources(resource);
		Iterator resIt = resList.iterator();
		while(resIt.hasNext())
		{
			Resource res = (Resource)resIt.next();
			TreeIterator treeIt = res.getAllContents();
			while(treeIt.hasNext())
			{
				Object obj = treeIt.next();
				if(obj instanceof EObject)
				{
					EObject eobj = (EObject)obj;
					RuntimeObject ro = this.setRuntimeObjectForEObject(unit, eobj);
					this.runtime_objects_map.put(eobj, ro);
					internalLog.debug("RO created : "+ (ro != null) + "->" + ro+" obj="+eobj);
					/*java.util.Collection result = EcoreUtil.UsageCrossReferencer.find(eobj,resource.getResourceSet());
					for (Iterator i = result.iterator(); i.hasNext(); )
					{
						// Show the settings that reference the objectOfInterest.
						//
						EStructuralFeature.Setting setting = (EStructuralFeature.Setting)i.next();
						EObject eObject = setting.getEObject();
						EStructuralFeature eStructuralFeature = (EStructuralFeature)setting.getEStructuralFeature();
						internalLog.debug
						(">   " + eStructuralFeature.getEContainingClass().getName() + "." + eStructuralFeature.getName() +
								" <- " + EcoreUtil.getIdentification(eObject));
				   }*/
					
				}
				else
				{
					internalLog.warn("Ignore unknown object: "+ obj);
				}
			}
		}
	}
	public void loadunit(EMFRuntimeUnit unit, Resource resource)
	{
		try {
			// pre-create the runtime objects
			createRuntimeObjects(unit, resource);
			
			internalLog.debug("all RuntimeObjects have been created");
			
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
			unit.setRuntimeObjectsMap(this.runtime_objects_map);
			
			// Fill in the properties of the runtime objects that we created
			Iterator rit = this.runtime_objects_map.keySet().iterator();
			ArrayList new_runtime_objects = new ArrayList();
			EObject eObject = null;
			while (rit.hasNext())
			{	
			    eObject = (EObject)rit.next();
			    RuntimeObject rObject = (RuntimeObject)this.runtime_objects_map.get(eObject);
			    this.populateRuntimeObject(rObject, unit);
			    //visitor.runtime_objects_map.put(eObject, rObject);
			    new_runtime_objects.add(rObject);
			    
			}
			// Now that RO are populated, we can add the instances
			Iterator nit = this.runtime_objects_map.keySet().iterator();
			//Iterator nit = new_runtime_objects.iterator();
		    // only add the roots
			while (nit.hasNext())
			{ 	
			    eObject = (EObject)nit.next();

			    RuntimeObject rObject = (RuntimeObject)this.runtime_objects_map.get(eObject);
			    // Set the container if needed 
			    if (eObject.eContainer() != null)
			    {
			    	rObject.setContainer((RuntimeObject)this.runtime_objects_map.get(eObject.eContainer()));
			    	// Set Content map entry "contents"
			        if (eObject.eResource().getURI().toString().equals(unit.getResolvedUri().toString())) addContentMapEntry(unit, "contents", rObject);
			    }
			    else
			    {
			        rObject.setContainer(null);
			        // Set Content map entry "contents"
			        if (eObject.eResource().getURI().toString().equals(unit.getResolvedUri().toString())) 
			        	addContentMapEntry(unit, "rootContents", rObject);
			        // Fill in the contentMap that will be returned by the extern load method call
			        addContentMapEntry(unit, "allRootContents", rObject);
			    }
			    addContentMapEntry(unit, "allContents", rObject);
			}
		}
		catch (KermetaRaisedException ke)
		{
			throw ke;
		}
		catch (Throwable e) {
		    internalLog.error("Error loading EMF model " + unit.getUriAsString() + " : " + e, e);
		    
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
	    RuntimeMemory memory = unit.getContentMap().getFactory().getMemory();
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
        RuntimeObjectFactory rofactory = unit.getContentMap().getFactory();
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
    	else if (fvalue instanceof Character) 
    	{    
    		rovalue = fr.irisa.triskell.kermeta.runtime.basetypes.Character.create(((Character)fvalue).charValue(), rofactory);    		
    	}
    	else // should never happen
    	{
    		internalLog.warn("The type of <"+fvalue+"> has not been handled yet. Replaced by Void. "+fvalue.getClass());
    		rovalue = rofactory.getMemory().voidINSTANCE;
    	}
    	return rovalue;
    }
	
	/**
	 * Return the FClass corresponding to the given name. Looks inside the loaded
	 * ecore metamodel if it was not found in the main kermeta unit. 
	 * @param name
	 */
	protected FType getMetaClassByName(String name, EMFRuntimeUnit runit)
	{
	    FTypeDefinition etype_cdef;
	    FType ftype = null;
	    FClass etype_fclass = null;
	    etype_cdef = runit.getContentMap().getFactory().getMemory().getUnit().getTypeDefinitionByName(name);

        if (etype_cdef == null)
        {
        	// PATCH:; try in kermeta package
        	String unit_uri = runit.getUriAsString();
	        String unit_uriextension = unit_uri.substring(unit_uri.lastIndexOf(".")+1, unit_uri.length());
	        if (unit_uriextension.compareTo("km")==0)
	        {
	        	etype_cdef = runit.getContentMap().getFactory().getMemory().getUnit().getTypeDefinitionByName("kermeta::" +name);
	        }
        }
	    if (etype_cdef!= null)
	    {
	    	// pseudo object to get its type?
	    	if (FClassDefinition.class.isInstance(etype_cdef))
	    	{
		    	ftype = InheritanceSearch.getFClassForClassDefinition((FClassDefinition)etype_cdef);
	    	}
	    	// Is it a primitive type?
	    	else if (FPrimitiveType.class.isInstance(etype_cdef))
	    	{
	    	    ftype = ((FPrimitiveType)etype_cdef).getFInstanceType();
	    	}
	    }
        return ftype; 
	}
	
	/**
	 * Add the properties as RuntimeObjects to the object rObject
	 * All the required RuntimeObjects maus have been already created
	 * @param rObject
	 * @param unit
	 */
	protected void populateRuntimeObject(RuntimeObject rObject, EMFRuntimeUnit unit)
	{
	    EObject eObject = (EObject)rObject.getData().get("emfObject");
	    
	    // Get the FClass of the RuntimeObject to populate
	    EClass c = eObject.eClass();
	    FClass fc = (FClass)getMetaClassByName(unit.getEQualifiedName(c), unit);
	    

        RuntimeMemory memory =unit.getContentMap().getFactory().getMemory();
    	ExpressionInterpreter interpreter = memory.getCurrentInterpreter(); 
    	
	    // Get the structural features
	    EList features = c.getEAllStructuralFeatures(); 
	    // For each feature, get the value and add it to the properties hashtable
	    Iterator it = features.iterator();
	    while (it.hasNext())
	    {
	    	EStructuralFeature feature = (EStructuralFeature)it.next();
	    	RuntimeObjectFactory rofactory = unit.getContentMap().getFactory();
	    	String  fname  = feature.getName();
	    	EClassifier etype = feature.getEType();
	    	FType ftype = getMetaClassByName(unit.getEQualifiedName(etype), unit);
	    	FProperty fprop = rofactory.getMemory().getUnit().findPropertyByName(fc.getFClassDefinition(), fname);
	    	RuntimeObject roprop = rofactory.getMemory().getRuntimeObjectForFObject(fprop);
	    	
	    	// Eget can return an elist of features
	    	Object fvalue = eObject.eGet(feature);
	    	RuntimeObject rovalue = null;
	    	
	    	try {
	    		// A feature with multiplicity
	    		if (fvalue instanceof EList)
	    		{
	    			rovalue = createRuntimeObjectForCollection((EList)fvalue, ftype, unit, rObject, roprop);
	    		}
	    		// Get the RO-repr of this EObject
	    		else if (fvalue instanceof EObject)
	    		{   
	    			// EFactory is not saved in the model, neither does it refer to a saved element in the model (at the opposite
	    			// of all the other transient features), so it will not be loaded
	    			if (!(fvalue instanceof EFactory))
	    				rovalue = createRuntimeObjectForEObject(rObject, (EObject)fvalue, feature, interpreter, memory);
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
	    			String errmsg = "NotImplemented Error : The type <"+etype+"> has not been handled yet. Trying to set "+
	    			fvalue+" into "+rObject;
	    			internalLog.error(errmsg);       	
	    			throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
	    					errmsg,
	    					interpreter,
	    					memory,
	    					null);
	    		}
	    		// If we instanciated a RuntimeObject value, we can set the properties for the object
	    		// reminder : rovalue is null if fvalue was an instance of EFactory
	    		if (fvalue != null && rovalue != null)
	    			rovalue.getData().put("emfObject", fvalue);
	    	}
	    	catch (Throwable e){
	    		if(e instanceof  KermetaRaisedException)
	    		{
	    			throw (KermetaRaisedException)e;
	    		}
	    		else
	    		{
	    			String errmsg = "Exception received. Trying to set on " + 
	    			 	rObject  + " this property: " + fprop +" / " + fname + " with value: "+
	    				fvalue;
	    			internalLog.error(errmsg);
	    			e.printStackTrace();
	    			throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
	    					errmsg,
	    					interpreter,
	    					memory,
	    					e);
	    		}
	    	}
	    } // End of while
	    // Find the value of the structural features and populate the properties.
	}
	
	/**
	 * Create a runtime object corresponding to the given fvalue. This <code>fvalue</code> corresponds to a structural feature "extracted" from
	 * the eObject to which the given Runtime object <code>rObject</code> correspond.
	 * @param rObject the RuntimeObject that we want to "populate" with the given feature represented by the EObject <code>fvalue</code>
	 * @param fvalue the [structural] feature that we want to convert in its RuntimeObject representation
	 * @param fname the name of the fvalue feature (used to store it in the "properties" hashtable of rObject).
	 * @param etype the type of the feature (only used here to feed a potential KermetaException)
	 * @param interpreter the ExpressionInterpreter (only used here to report a potential KermetaException)
	 * @param memory the RuntimeMemory (only used here to feed a potential KermetaException)
	 * @return the runtime object representation of <code>fvalue</code>
	 */
	protected RuntimeObject createRuntimeObjectForEObject(RuntimeObject rObject, EObject fvalue, EStructuralFeature feature, ExpressionInterpreter interpreter, RuntimeMemory memory)
	{
		RuntimeObject rovalue = null;
        rovalue = (RuntimeObject)this.runtime_objects_map.get(fvalue);
        if(rovalue==null)
        {
        	// troubles in the auto resolve 
        	EObject obj = EcoreUtil.resolve(fvalue, this.resource_set);
        	if(fvalue.eIsProxy() && obj.eIsProxy())
			{   	// ie. was a proxy and the proxy was not resolved
					String objectURI = fvalue.eResource().getURIFragment(fvalue);			            	
					String errmsg = "Not able to resolve proxy for value: " + fvalue 
						+ " for object: "+rObject +" of type: "+feature.getEType()+
						"\nTry to load the file containing this URI: "+objectURI;
					internalLog.error(errmsg);
					throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
		        		errmsg,
						interpreter,
						memory,
						null);
			}
			else
			{
				// the feature destination was not in the main resource
            	// force emf to load it and retreive it, create a Runtime object for it
        		// this is in fact too late to create the runtime object for an EObject, !!! 
        		// concurrent exception !
				Resource eresource = fvalue.eResource();
				String errmsg = "Not able to find RuntimeObject in runtime_objects_map for value on type "+feature.getEType()
					+"Trying to set "+ fvalue+" into "+rObject; 
				if (eresource!=null) errmsg += "\nBe sure to load the file containing this URI: "+eresource.getURIFragment(fvalue);
            	internalLog.error(errmsg);
            	throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
		        		errmsg,
						interpreter,
						memory,
						null);
    			// RuntimeObject ro = this.setRuntimeObjectForEObject(unit, obj);
    			// this.runtime_objects_map.put(obj, ro);	
        	}
        }
        rObject.getProperties().put(feature.getName(), rovalue);
        // FIXME the set method needs to be reviewed (for model instances?)
        //fr.irisa.triskell.kermeta.runtime.language.Object.set(rObject, roprop, rovalue);
        return rovalue;
	}
	
	/**
	 * Create a RuntimeObject that represent a collection.
	 * We need to create in "purely" in java when we have an instance of which one of its properties
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
        RuntimeMemory memory = unit.getContentMap().getFactory().getMemory();
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
	    RuntimeMemory memory = unit.getContentMap().getFactory().getMemory();
	    String metaclass_name = unit.getEQualifiedName(metaclass);
	    if (this.typedef_cache.containsKey(metaclass_name)) 
	    {
	        result = (RuntimeObject)this.typedef_cache.get(metaclass_name);
	        //internalLog.debug("Found a RO for FClass <"+ metaclass_name +"> in cache : "+result);
	    }
	    else
	    {   // Create the RuntimeObject encaspulating the FClass corresponding to the EClass given by its name :
	        // Reconstruct from FClass -> FClassDefinition (meta meta levels) -> Our EClass
	        FType ftype = this.getMetaClassByName(metaclass_name, unit);
	        if (ftype == null)
	        {
	        	KermetaUnit kunit = memory.getUnit();
		    	String errmsg = "EMF Loading error : could not find a class (" + metaclass_name + ") " +
		    			"in loaded libraries. Please check your require statements";
		    	internalLog.error(errmsg);
		    	kunit.messages.addError(errmsg, null );
		        ftype = null;
		        // stop after the first error: throw a Kermeta Exception ...
	        	ExpressionInterpreter interpreter = memory.getCurrentInterpreter();        	
		        throw KermetaRaisedException.createKermetaException("kermeta::persistence::ResourceLoadException",
		        		errmsg,
						interpreter,
						memory,
						null);
	        }
	        else {
	        	FClass fclass = (FClass)ftype;
	        	result = memory.getROFactory().createMetaClass(fclass);
	        	this.typedef_cache.put(metaclass_name, result);
	        }
	    }
	    return result;
	}
	
	/**
	 * Fill in the content map entry which key is <code>key</code> : the value of this entry is the RO
	 * representation of a Collection, so the given <code>rObject</code> will be added to this
	 * collection 
	 * @param key Key in contentMap a value among "contents", "rootContents", "allRootContents", "allContents"
	 * @param coll the value corresponding to key. It is a collection 
	 * @param rObject the object to add the collection <code>coll</code>
	 */
	protected void addContentMapEntry(EMFRuntimeUnit unit, String key, RuntimeObject rObject)
	{
		// Set the entry to put { RuntimeObjectString , (RuntimeObject)content_table} in contentMap
		RuntimeObject collection_entry = unit.getContentMapEntryFromString(key); 
		// Fill in the contentMap that will host the loaded elements
		fr.irisa.triskell.kermeta.runtime.basetypes.Collection.add(collection_entry, rObject);
	}


}
