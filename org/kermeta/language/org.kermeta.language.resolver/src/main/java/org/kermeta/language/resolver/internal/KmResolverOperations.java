/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 23 june 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/
package org.kermeta.language.resolver.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.resolver.FullStaticResolver;
import org.kermeta.language.resolver.ResolverException;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.reference.ModelReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage.Severity;

public class KmResolverOperations {

	FullStaticResolver resolver = null;
	
	public KmResolverOperations(FullStaticResolver resolver){   	
		this.resolver = resolver;
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

	public ErrorProneResult<ModelingUnit> doResolving(ModelingUnit mu) {	
		ModelingUnit muResolved = null;
		ErrorProneResult<ModelingUnit> result = new ErrorProneResult<ModelingUnit>();
    	try {
    		muResolved = resolver.doResolving(enforceAspect(mu));
		} catch (Exception e) {
			ResultProblemMessage pm = new ResultProblemMessage(Severity.FATAL, e.getMessage() != null ? e.getMessage() : e.toString() , e, null);
    		result.getProblems().add(pm);
		}

    	result.setResult(muResolved);
    	for (Object o : resolver.getErrors()) {
    		if (o instanceof ResolverException) {
    			ResolverException theError = (ResolverException) o;
    			ResultProblemMessage pm = new ResultProblemMessage(Severity.ERROR,theError.message()+"\nCaused by "+theError.getObjectCause(), null,  null) ;
    			result.getProblems().add(pm);
    		}
    	}
    	
    	return result;
	}

	public ErrorProneResult<ModelingUnit> doStaticSetting(ModelingUnit mu) {		
		ModelingUnit muResolved = null;
		ErrorProneResult<ModelingUnit> result = new ErrorProneResult<ModelingUnit>();
    	try {
    		muResolved = resolver.doStaticSetting(enforceAspect(mu));
		} catch (Exception e) {
			ResultProblemMessage pm = new ResultProblemMessage(Severity.FATAL, e.getMessage() != null ? e.getMessage() : e.toString(), e, null);
    		result.getProblems().add(pm);
		}

    	result.setResult(muResolved);
    	for (Object o : resolver.getErrors()) {
    		if (o instanceof ResolverException) {
    			ResolverException theError = (ResolverException) o;
    			ResultProblemMessage pm = new ResultProblemMessage(Severity.ERROR,theError.message()+"\nCaused by "+theError.getObjectCause(), null,  
    					theError.getObjectCause() != null ? new ModelReference((EObject)theError.getObjectCause()) : null) ;
    			result.getProblems().add(pm);
    		}
    	}
    	
    	return result;
	}

	public ErrorProneResult<ModelingUnit> resolve(ModelingUnit mu) {
		ModelingUnit muResolved = null;
		ErrorProneResult<ModelingUnit> result = new ErrorProneResult<ModelingUnit>();
    	try {
    		muResolved = resolver.resolve(enforceAspect(mu));
		} catch (Exception e) {
			ResultProblemMessage pm = new ResultProblemMessage(Severity.FATAL, e.getMessage() != null ? e.getMessage() : e.toString(), e, null);
    		result.getProblems().add(pm);
		}

    	result.setResult(muResolved);
    	for (Object o : resolver.getErrors()) {
    		if (o instanceof ResolverException) {
    			ResolverException theError = (ResolverException) o;
    			ResultProblemMessage pm = new ResultProblemMessage(Severity.ERROR,theError.message()+"\nCaused by "+theError.getObjectCause(), null,  
    					theError.getObjectCause() != null ? new ModelReference((EObject)theError.getObjectCause()) : null) ;
    			result.getProblems().add(pm);
    		}
    	}
    	
    	return result;
	}
}
