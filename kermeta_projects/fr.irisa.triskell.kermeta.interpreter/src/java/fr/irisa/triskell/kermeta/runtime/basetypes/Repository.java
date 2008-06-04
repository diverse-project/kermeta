/* $Id: Repository.java,v 1.11 2008-06-04 14:00:49 ftanguy Exp $
 * Project   : Kermeta (First iteration)
 * File      : Repository.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : June 15, 2007
 * Authors       : dtouzet
 */
package fr.irisa.triskell.kermeta.runtime.basetypes;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;


/**
 * This class is intended to "wrap" the repository management from kermeta.
 */
public class Repository {
    
    /**
     * @param selfRO  - RO for repository
     * @param uriRO   - RO for the uri of the resource to be created
     * @param mmUriRO - RO for the uri of the metamodel of the resource to be created
     * @return        - RO for the created resource, or void RO if creation failed
     */
    public static RuntimeObject createResource(RuntimeObject selfRO, RuntimeObject uriRO, RuntimeObject mmUriRO) {
    	
    	// default implemetation use EMF and the default singleton        
    	return EMFRepositorySingleton.getSingleton().createResource(selfRO, uriRO, mmUriRO);
    }


    /**
     * @param selfRO - RO for respository
     * @return       - RO for the created resource
     */
    public static RuntimeObject initRepository(RuntimeObject selfRO) {
    	// Build the EMF ResourceSet associated with the repository RO 
    	ResourceSet rSet = (ResourceSet) selfRO.getR2eEmfResourceset();
    	if(rSet == null) {
    		// EMF ResourceSet does not exist, so we build it
    		rSet = new ResourceSetImpl();
    		selfRO.setR2eEmfResourceset(rSet);
    	}
    	
    	// Build RO for the "resource" property of the repository object
    	RuntimeObject resListRO = selfRO.getProperties().get("resources"); 
    	if(resListRO == null) {
    		// RO for the "resource" property does not exist - we have to build it
    		GenericTypeDefinition setClassDef  = (GenericTypeDefinition)selfRO.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Set");
    		GenericTypeDefinition resClassDef  = (GenericTypeDefinition)selfRO.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::persistence::EMFResource");

    		fr.irisa.triskell.kermeta.language.structure.Class resClass = StructureFactory.eINSTANCE.createClass();
    		resClass.setTypeDefinition(resClassDef);
    		
    		fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding tvBinding = StructureFactory.eINSTANCE.createTypeVariableBinding();
    		tvBinding.setType(resClass);
    		tvBinding.setVariable( (TypeVariable) setClassDef.getTypeParameter().get(0) );
    		
    	    fr.irisa.triskell.kermeta.language.structure.Class setClass = StructureFactory.eINSTANCE.createClass();
    	    setClass.setTypeDefinition(setClassDef);
    	    setClass.getTypeParamBinding().add(tvBinding);
    	    
    	    RuntimeObject metaclassRO = selfRO.getFactory().getMemory().getRuntimeObjectForFObject(setClass);
    		resListRO = new RuntimeObjectImpl(selfRO.getFactory(), metaclassRO);

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
    	GenericTypeDefinition strClassDef  = (GenericTypeDefinition)uriRO.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::String");
		fr.irisa.triskell.kermeta.language.structure.Class strClass = StructureFactory.eINSTANCE.createClass();
		strClass.setTypeDefinition(strClassDef);
	    RuntimeObject metaclassRO = uriRO.getFactory().getMemory().getRuntimeObjectForFObject(strClass);
    	RuntimeObject nuriRO = new RuntimeObjectImpl(uriRO.getFactory(), metaclassRO);
    	
    	// Normalize uri
    	java.lang.String file = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(uriRO);
    	java.lang.String unit_uri = uriRO.getFactory().getMemory().getUnit().getUri();
    	java.lang.String unit_uripath = unit_uri.substring(0, unit_uri.lastIndexOf("/")+1);
    	URI u = URI.createURI(file);
    	if (u.isRelative()) {
    		java.lang.String defaultPath = uriRO.getFactory().getMemory().getInterpreter().getDefaultPath();
    		if ( defaultPath == null ) {
    			defaultPath = unit_uripath;
        		URIConverter c = new URIConverterImpl();
        		u = u.resolve(c.normalize(URI.createURI(defaultPath)));    			
    		} else if ( ! defaultPath.startsWith("platform:/") ) {
    			defaultPath = "platform:/resource" + defaultPath;
    			u = URI.createURI( defaultPath + "/" + file);
    		} else {
    			u = URI.createURI( defaultPath + "/" + file);	
    		}
    	}
    	
    	// Assign normalized uri to nuri RO
    	nuriRO.setPrimitiveType(RuntimeObject.STRING_VALUE);
    	nuriRO.setJavaNativeObject( u.toString());
    	
    	return nuriRO;
    }
}
