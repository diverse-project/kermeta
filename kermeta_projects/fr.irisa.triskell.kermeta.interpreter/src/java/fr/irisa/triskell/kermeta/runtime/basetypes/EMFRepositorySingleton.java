/*$Id: EMFRepositorySingleton.java,v 1.6 2008-11-21 15:55:03 dvojtise Exp $
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

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecoretools.registration.EcoreRegistering;
import org.eclipse.emf.ecoretools.registration.exceptions.NotValidEPackageURIException;

import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
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
    	
    	java.lang.String normalizedUri = Repository.normalizeUri(file, uriRO.getFactory().getMemory().getUnit(), uriRO.getFactory().getMemory().getInterpreter());    	
    	
    	URI u = URI.createURI(normalizedUri);    	
    	
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
        	
        	// reset the uri to the original value (because it may have been normalized
        	// Set "uri" property of resource RO (from emf resource uri)
        	//resRO.getProperties().get("uri");
        	resRO.getProperties().put(
        		"uri",
        		fr.irisa.triskell.kermeta.runtime.basetypes.String.create(file, resRO.getFactory())
        	);
        	//resRO.getProperties().get("uri");
        	
        	// Insert created resource RO in the list of "resources" of the repository RO
        	RuntimeObject resListRO = selfRO.getProperties().get("resources"); 
        	ArrayList<RuntimeObject> l = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.getArrayList(resListRO);
        	l.add(resRO);
    	}
        
    	return resRO;
    }
    
    public RuntimeObject registerEcoreFile(RuntimeObject mmUriRO) {
    	
    	java.lang.String ecore_file = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(mmUriRO);
    	URI ecoreFileUri = URI.createURI(ecore_file);
    	try {
			EcoreRegistering.registerPackages(ecoreFileUri);
		} catch (NotValidEPackageURIException e) {
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::Exception",
	        		"Invalid EPackage URI: " + ecore_file + " cannot register it",
	        		mmUriRO.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	        		mmUriRO.getFactory().getMemory(),
	        		mmUriRO.getFactory().getMemory().getInterpreter().getBasicInterpreter().getParent(),
					e);
		} catch (Exception e) {
			throw KermetaRaisedException.createKermetaException( e.getMessage().contains("java.io.FileNotFoundException") ? "kermeta::exceptions::FileNotFoundException" :"kermeta::exceptions::Exception",
	        		e.getMessage(),
	        		mmUriRO.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
	        		mmUriRO.getFactory().getMemory(),
	        		mmUriRO.getFactory().getMemory().getInterpreter().getBasicInterpreter().getParent(),
					e);
		}
    	// Default value for the resource RO to be returned
    	RuntimeObject resRO = mmUriRO.getFactory().getMemory().voidINSTANCE;
    	
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
