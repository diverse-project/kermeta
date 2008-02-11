/*$Id: Repository.java,v 1.1 2008-02-11 15:04:08 dvojtise Exp $
* Project : org.kermeta.uml2.profiles.model
* File : 	Repository.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 févr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.uml2.profiles.kermeta.runtime.basetypes;


import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

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
    	
    	if ( u.fileExtension() != null ) {
    		
    		Object o = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(u.fileExtension());
    		if ( o == null )
    			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(u.fileExtension(), new XMIResourceFactoryImpl());
    		
    		/*if ( ! u.fileExtension().equals("ecore") && ! u.fileExtension().equals("km") )
    			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    					u.fileExtension(),
    					new XMIResourceFactoryImpl()
    			);*/
    	}
    	
    	ResourceSet rSet = (ResourceSet) selfRO.getR2eEmfResourceset();
    	Resource res = null;
    	if (rSet != null)
    		res = rSet.createResource(u);
    	
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

}
