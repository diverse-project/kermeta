/* $Id: Repository.java,v 1.2 2007-07-06 15:45:23 dtouzet Exp $
 * Project   : Kermeta (First iteration)
 * File      : Repository.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : June 15, 2007
 * Authors       : dtouzet
 */
package fr.irisa.triskell.kermeta.runtime.basetypes;


import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;


/**
 * This class is intended to "wrap" the repository management from kermeta.
 */
public class Repository {
    
    /**
     * @param selfRO  - RO for respository
     * @param uriRO   - RO for the uri of the resource to be created
     * @param mmUriRO - RO for the uri of the metamodel of the resource to be created
     * @return        - RO for the created resource, or void RO if creation failed
     */
    public static RuntimeObject createResource(RuntimeObject selfRO, RuntimeObject uriRO, RuntimeObject mmUriRO) {
    	// Default value for the resource RO to be returned
    	RuntimeObject resRO = selfRO.getFactory().getMemory().voidINSTANCE;
    	
    	// Init repository RO
    	Repository.initRepository(selfRO);
    	
    	// Creating EMF resource for the resource to be created
    	java.lang.String file = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(uriRO);
    	
    	java.lang.String unit_uri = selfRO.getFactory().getMemory().getUnit().getUri();
    	java.lang.String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1);
    	URI u = URI.createURI(file);
    	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(unit_uripath)));    			
    	}
    	
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				u.fileExtension(),
				new XMIResourceFactoryImpl()
		);
    	ResourceSet rSet = (ResourceSet) selfRO.getData().get("r2e.emfResourceset");
    	Resource res = rSet.createResource(u);
    	
    	if(res != null) {
        	// Create the resource RO
        	resRO = selfRO.getFactory().createRuntimeObjectFromResource(res, selfRO, mmUriRO);
        	
        	// Insert created resource RO in the list of "resources" of the repository RO
        	RuntimeObject resListRO = selfRO.getProperties().get("resources"); 
        	ArrayList<RuntimeObject> l = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(resListRO);
        	l.add(resRO);
    	}
        
    	return resRO;
    }


    /**
     * @param selfRO - RO for respository
     * @return       - RO for the created resource
     */
    public static RuntimeObject initRepository(RuntimeObject selfRO) {
    	// Build the EMF ResourceSet associated with the repository RO 
    	ResourceSet rSet = (ResourceSet) selfRO.getData().get("r2e.emfResourceset");
    	if(rSet == null) {
    		// EMF ResourceSet does not exist, so we build it
    		rSet = new ResourceSetImpl();
    		selfRO.getData().put("r2e.emfResourceset", rSet);
    	}
    	
    	// Build RO for the "resource" property of the repository object
    	RuntimeObject resListRO = selfRO.getProperties().get("resources"); 
    	if(resListRO == null) {
    		// RO for the "resource" property does not exist - we have to build it
    		GenericTypeDefinition setClassDef  = (GenericTypeDefinition)selfRO.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::standard::Set");
    		GenericTypeDefinition resClassDef  = (GenericTypeDefinition)selfRO.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::persistence::EMFResource");

    		fr.irisa.triskell.kermeta.language.structure.Class resClass = selfRO.getFactory().getMemory().getUnit().struct_factory.createClass();
    		resClass.setTypeDefinition(resClassDef);
    		
    		fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding = selfRO.getFactory().getMemory().getUnit().struct_factory.createTypeVariableBinding();
    		tvBinding.setType(resClass);
    		tvBinding.setVariable( (TypeVariable) setClassDef.getTypeParameter().get(0) );
    		
    	    fr.irisa.triskell.kermeta.language.structure.Class setClass = selfRO.getFactory().getMemory().getUnit().struct_factory.createClass();
    	    setClass.setTypeDefinition(setClassDef);
    	    setClass.getTypeParamBinding().add(tvBinding);
    	    
    	    RuntimeObject metaclassRO = selfRO.getFactory().getMemory().getRuntimeObjectForFObject(setClass);
    		resListRO = new RuntimeObject(selfRO.getFactory(), metaclassRO);

    		// Associating built property RO with the repository RO 
    		selfRO.getProperties().put("resources", resListRO);
    	}
    	
    	return selfRO;
    }

    
    /**
     * @param uriRO
     * @return
     */
    public static RuntimeObject normalizeUri(RuntimeObject uriRO) {
    	// Default value for the resource RO to be returned
    	GenericTypeDefinition strClassDef  = (GenericTypeDefinition)uriRO.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::standard::String");
		fr.irisa.triskell.kermeta.language.structure.Class strClass = uriRO.getFactory().getMemory().getUnit().struct_factory.createClass();
		strClass.setTypeDefinition(strClassDef);
	    RuntimeObject metaclassRO = uriRO.getFactory().getMemory().getRuntimeObjectForFObject(strClass);
    	RuntimeObject nuriRO = new RuntimeObject(uriRO.getFactory(), metaclassRO);
    	
    	// Normalize uri
    	java.lang.String file = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(uriRO);
    	java.lang.String unit_uri = uriRO.getFactory().getMemory().getUnit().getUri();
    	java.lang.String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1);
    	URI u = URI.createURI(file);
    	if (u.isRelative()) {
    		URIConverter c = new URIConverterImpl();
    		u = u.resolve(c.normalize(URI.createURI(unit_uripath)));    			
    	}
    	
    	// Assign normalized uri to nuri RO
    	nuriRO.getData().put("StringValue", u.toString());
    	
    	return nuriRO;
    }
}
