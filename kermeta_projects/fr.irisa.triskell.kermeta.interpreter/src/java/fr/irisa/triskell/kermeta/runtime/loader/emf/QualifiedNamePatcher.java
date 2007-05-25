/*$Id: QualifiedNamePatcher.java,v 1.7 2007-05-25 15:10:45 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.interpreter
* File : 	QualifiedNamePatcher.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 9 mars 07
* Authors : 
*     dvojtise <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.kermeta.runtime.loader.emf;

import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * This class is used to help to pacth the EMF problem about empty packages 
 * that are not generated
 * It doesn't reuse the Metamodel provided in EMFRuntimeUnit because in some situation
 * we cannot garantee that it use a real ecore file instead of a registered generated java 
 *
 */
public class QualifiedNamePatcher {

	/** this hashtable is used to store the qualified name of the element with the given nsuri.
     * used only on the metamodel via getEQualifiedName()
     * a user may improve the performances if he directly set these values for his metamodel. 
     * This will allow to not load the metamodel in case of generated java class and bug#632
     */
    private Hashtable<String,String> nsUri_QualifiedName_map = new Hashtable<String,String>();
    
    /**
     * resource containing the MM
     * This one ensures that it comes from a file and cannot comes from generated java
     */
    protected Resource metaModelResource= null;
    

    /** avoid to have the error several times
     * 
     */
    protected boolean canLoadMetaModelResource=true;
    
    private EMFRuntimeUnit emfRuntimeUnit;
    
    public QualifiedNamePatcher(EMFRuntimeUnit ru){
    	emfRuntimeUnit = ru;
    }
    
	public String getGeneratedPackageQualifiedName(ENamedElement obj){
		String result=obj.getName();
//		 optimization : use of an hashtable
    	String nsuri = ((EPackage)obj).getNsURI();
    	if(nsuri ==  null){
    		EMFRuntimeUnit.internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that this package is really toplevel..." + obj.getClass().getName() +
					" || "+ obj.toString() );
    		EMFRuntimeUnit.internalLog.warn("The package "+ obj.getName()+" has no nsuri");
    	}
    	if(nsuri.equals("")){
    		EMFRuntimeUnit.internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that this package is really toplevel..." + obj.getClass().getName() +
					" || "+ obj.toString() );
    		EMFRuntimeUnit.internalLog.warn("The package "+ obj.getName()+" has no nsuri");    		
    	}
    	String packageQualifiedName = this.nsUri_QualifiedName_map.get(nsuri);
    	if( packageQualifiedName == null)
    	{   // optimization failed, need to load the metamodel and retreive the qualified name
    		if(!emfRuntimeUnit.metamodel_uri.equals("")){	    			
    			// internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that this package is really toplevel..." + obj.getClass().getName() + " || "+ obj.toString() );	    			
    			loadMetaModelResource(emfRuntimeUnit.metamodel_uri);
    			// lazy load of the metamodel 	
		    	// look into the mm if the given object can be retreived, then get its real qualified name
		    	EPackage mmPackage = getEPackageFromNsUri(nsuri);
		    	if (mmPackage != null)
		    	{
		    		result = EcoreHelper.getQualifiedName(mmPackage);
		    		//result = emfRuntimeUnit.getEQualifiedName(mmPackage);
		    		this.nsUri_QualifiedName_map.put(nsuri,result);	// for optimization
		    	}
		    	else{
		    		EMFRuntimeUnit.internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that this package is really toplevel..." + obj.getClass().getName() +
	    					" || "+ obj.toString() );
		    		this.nsUri_QualifiedName_map.put(nsuri,result);	
		    	}
    		}
    		else{
    			// metamodel uri is not set cannot patch, let's hope there is no package hierachy
    			EMFRuntimeUnit.internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that this package is really toplevel..." + obj.getClass().getName() +
    					" || "+ obj.toString() );
    			EMFRuntimeUnit.internalLog.warn("Cannot retreive the metamodel. If you have trouble loading your model, maybe you should use repository.createResource(\"yourmodel.xmi\", \"yourmetamodel.ecore\") instead of repository.getResource(\"yourmodel.xmi\")");
    			result = obj.getName();
    			this.nsUri_QualifiedName_map.put(nsuri,result);
    		}
    	}
    	else
    		result = packageQualifiedName; 
    	return result;
	}
	
	
	/**
     * Get the EPackge corresponding to the given nsuri 
     * @param nsuri the nsuri of which we look for the corresponding in Ecore meta-model
     * @return the EPackage in the ecore meta-model given by the user for serialization of its model
     */
    private EPackage getEPackageFromNsUri(String nsuri)
    {
    	EPackage result = null;
        TreeIterator it = null; 
        if(metaModelResource ==  null) return result;
        it = metaModelResource.getAllContents();            
        while (it.hasNext() && result == null)
        {
            EObject obj = (EObject)it.next();
			if (obj instanceof EPackage)
			{
				if (((EPackage)obj).getNsURI().equals(nsuri))
				    result = (EPackage)obj;
			}
        }
        return result;
    }
    

	public void loadMetaModelResource(String mm_uri){
		if(metaModelResource == null && canLoadMetaModelResource){
			try {
				// create an uri, enventually relative to the user model
				URI platformURI = emfRuntimeUnit.createURI(mm_uri);				
				// convert the uri into a file:/ protocol
				URL fileURL;
				//if OSGI is started then let's try a toFileURL
				if(Platform.isRunning()){
				//if(org.eclipse.core.internal.runtime.Activator.getDefault() != null){ // alternative method to check if osgi is running ?
					// OSGI is started, use the filelocator
					URL oldURL = new URL(platformURI.toString());
					fileURL = FileLocator.toFileURL(oldURL);
					if(oldURL == fileURL){
						canLoadMetaModelResource = false;
			            EMFRuntimeUnit.internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that some packages are really toplevel..." );
			            EMFRuntimeUnit.internalLog.warn("Cannot retreive the metamodel. "+ mm_uri + " If you have trouble loading your model, maybe you should use repository.createResource(\"yourmodel.xmi\", \"yourmetamodel.ecore\") instead of repository.getResource(\"yourmodel.xmi\")");
			            return;
					}
				}
				else {
					if(platformURI.scheme().equals("file")){
						fileURL = new URL(platformURI.toString());
					}
					else {
						//	maybe this is done by a map entry
						if(EMFRuntimeUnit.ENABLE_EMF_DIAGNOSTIC)
				    	{
					    	String msg = "EMF current URI_MAP entries :\n";
					    	for (Object o : URIConverterImpl.URI_MAP.entrySet())
					    		msg += "    "+o + "; " + URIConverterImpl.URI_MAP.get(o) + "\n";
					    	EMFRuntimeUnit.internalLog.debug(msg);
				    	}
						URIConverter c = new URIConverterImpl();
						platformURI = c.normalize(URI.createURI(mm_uri));
						if(platformURI.scheme().equals("file")){
							fileURL = new URL(platformURI.toString());
						}
						else {
							// still not a file url ... 
							EMFRuntimeUnit.internalLog.warn("patching EMF problem about generated java EPackage. cannot resolve " +platformURI.toString() +" into a physical file:/ scheme" );
							fileURL = new URL(platformURI.toString());
						}
						
					}
		            
				}
				URI fileURI = URI.createURI(fileURL.toString());
				EMFRuntimeUnit.internalLog.debug("loading Metamodel from physical location : " + fileURI.toString());
				
		        // Load resource
		    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		    	ResourceSet resource_set = new ResourceSetImpl();
		    	Resource resource = resource_set.getResource(fileURI, true);
		    	
	            // visit the metamodel
	            resource.load(null);

		        metaModelResource = resource;
		        
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            canLoadMetaModelResource = false;
	            EMFRuntimeUnit.internalLog.warn("patching EMF problem about generated java EPackage. We are not sure that some packages are really toplevel..." );
	            EMFRuntimeUnit.internalLog.warn("Cannot retreive the metamodel. "+ mm_uri + " If you have trouble loading your model, maybe you should use repository.createResource(\"yourmodel.xmi\", \"yourmetamodel.ecore\") instead of repository.getResource(\"yourmodel.xmi\")");
    			
	        }
	    	
		}
	}
}



