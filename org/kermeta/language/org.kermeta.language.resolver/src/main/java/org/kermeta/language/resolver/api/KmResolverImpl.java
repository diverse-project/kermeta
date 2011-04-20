/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 19 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.resolver.api;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.resolver.FullStaticResolver;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.language.language.resolverrunner.MainRunner;

public class KmResolverImpl implements org.kermeta.language.resolver.api.KmResolver {
	public ErrorProneResult<ModelingUnit> resolve(ModelingUnit mu){
		//logger.debug("Resolving ModelingUnit..." );
	   	
    	MainRunner.init();
    	FullStaticResolver resolver = org.kermeta.language.resolver.KerRichFactory.createFullStaticResolver();
    	ModelingUnit muResolved = null;
    	try {
    		muResolved = (ModelingUnit) resolver.resolve(enforceAspect(mu));
		} catch (IOException e) {
			//logger.error(e.getMessage(),e);
		}
    	
    	//logger.debug("ModelingUnit resolved..." );
		ErrorProneResult<ModelingUnit> result;
    	result = new ErrorProneResult<ModelingUnit>(muResolved);
    	//logger.warning("Resolver not completely implemented" );
    	
    	return result;
	}
	
	protected ModelingUnit enforceAspect(ModelingUnit mu) throws IOException{
    	if(! (mu instanceof org.kermeta.language.language.resolver.org.kermeta.language.structure.ModelingUnitAspect)){
	    	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    	URI uri = URI.createURI(mu.getNamespacePrefix()+"."+mu.getName() + ".km_in_memory");
	    	Map<String, String> options = null;
	    	if(mu.eResource() != null){
		    	uri = mu.eResource().getURI();
	    	}
	    	else{
	    		// let's suppose that the ModelingUnit contains everything (otherwise we would have to look for references and save them too ...)
	    		ResourceSet resourceSet = new ResourceSetImpl();
	    		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
	    		Map<String,Object> m = f.getExtensionToFactoryMap();
	    		m.put("km_in_memory",new XMIResourceFactoryImpl());
				Resource resource = resourceSet.createResource(uri);
				resource.getContents().add(mu);
	    	}
			mu.eResource().save(outputStream, options);

	    	ResourceSet resourceSet = new ResourceSetImpl();
    		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
    		Map<String,Object> m = f.getExtensionToFactoryMap();
    		m.put("*",new XMIResourceFactoryImpl());
			Resource resource = resourceSet.createResource(uri);
			resource.load(new ByteArrayInputStream(outputStream.toByteArray()), options);
			// let's suppose the ModelingUnit is the first element in the root
			return (ModelingUnit)resource.getContents().get(0);
    	}
    	else{
    		return mu;
    	}
    }
}
