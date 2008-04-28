/*$Id: EMFRepositorySingleton.java,v 1.2 2008-04-28 11:50:56 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	RepositorySingleton.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 13 f�vr. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

/**
 * Singleton that contains the actual code for Repository
 * (necessary in order to provide dynamic binding and inheritance)
 *
 */
public class EMFRepositorySingleton {

	/* singleton implementation */
	protected static EMFRepositorySingleton EMFRepositorySingletonInstance = new EMFRepositorySingleton();	
	protected EMFRepositorySingleton(){		
	}
	public static EMFRepositorySingleton getSingleton(){
		return EMFRepositorySingletonInstance;
	}
	
	/**
     * @param selfRO  - RO for repository
     * @param uriRO   - RO for the uri of the resource to be created
     * @param mmUriRO - RO for the uri of the metamodel of the resource to be created
     * @return        - RO for the created resource, or void RO if creation failed
     */
    public RuntimeObject createResource(RuntimeObject selfRO, RuntimeObject uriRO, RuntimeObject mmUriRO) {
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
    		java.lang.String defaultPath = uriRO.getFactory().getMemory().getInterpreter().getDefaultPath();
    		if ( defaultPath == null ) {
    			defaultPath = unit_uripath;
        		URIConverter c = new URIConverterImpl();
        		u = u.resolve(c.normalize(URI.createURI(defaultPath)));    			
    		} else {
    			defaultPath = "platform:/resource" + defaultPath;
    			u = URI.createURI( defaultPath + "/" + file);
    		}   			
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
        	resRO = createRuntimeObjectFromResource(res, selfRO, mmUriRO);
        	
        	// Insert created resource RO in the list of "resources" of the repository RO
        	RuntimeObject resListRO = selfRO.getProperties().get("resources"); 
        	ArrayList<RuntimeObject> l = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(resListRO);
        	l.add(resRO);
    	}
        
    	return resRO;
    }
    
    /**
     * method used to factorize some code between this class and classes that refines it
     * this method creates the concrete RuntimeObject for the resource (by default an EMFResource)
     * @param emfRes
     * @param repRO
     * @param mmUriRO
     * @return
     */
    protected RuntimeObject createRuntimeObjectFromResource(Resource emfRes, RuntimeObject repRO, RuntimeObject mmUriRO)
    {
    	return repRO.getFactory().createRuntimeObjectFromResource(emfRes, repRO, mmUriRO, RuntimeObjectFactory.EMFRESOURCE_QUALIFIED_NAME);
    	
    }
}
