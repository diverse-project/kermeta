/* $Id: $
 * Project    : org.kermeta.language.merger.binarymerger
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 june 2011
 * Authors : 
 *            Cédric Bouhours
 */

package org.kermeta.language.merger.binarymerger.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.merger.BinaryMerger;
import org.kermeta.language.merger.BinaryMergerAspect;
import org.kermeta.ecore.binarymerger.BinaryMergerExceptionAspect;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.reference.ModelReference;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage.Severity;

public class KmBinaryMergerOperations {
	
	private BinaryMerger merger = null;
	
	public KmBinaryMergerOperations(BinaryMerger merger) {
		this.merger = merger;
	}
	
	public ErrorProneResult<ModelingUnit> merge(ModelingUnit first_mu, ModelingUnit second_mu) {
		
        ErrorProneResult<ModelingUnit> result = new ErrorProneResult<ModelingUnit>();
		try {
			result.setResult((ModelingUnit) merger.merge(enforceAspect(first_mu), enforceAspect(second_mu)));
		
	        BinaryMergerAspect mergerAspect = (BinaryMergerAspect) merger;
	        for (Object o : mergerAspect.getErrors()) {
	        	if(o instanceof BinaryMergerExceptionAspect){
	        		BinaryMergerExceptionAspect e = (BinaryMergerExceptionAspect) o;
	        		ModelReference modelRef = new ModelReference(e.aspectElement());
	        		// TODO bug, the nested exception isn't the correct one, I don't know how to cast the BinaryMergerExceptionAspect into a classic java Exception
	        		//ProblemMessage pm = (ProblemMessage) UnifiedMessageFactory.getInstance().createErrorMessage(e.message(), "org.kemeta.language.merger.binarymerger", e, modelRef);
	        		
	        		ResultProblemMessage pm = new ResultProblemMessage(Severity.ERROR,e.message(), null,  modelRef) ;
	        		result.getProblems().add(pm);
	        		// TODO also send the problem to a log port ?
	        	}
			}
		} catch (IOException e1) {
			ResultProblemMessage pm = new ResultProblemMessage(Severity.FATAL, e1.getMessage(), e1, null);
    		result.getProblems().add(pm);
		}
        return result;
	}
   
    protected ModelingUnit enforceAspect(ModelingUnit mu) throws IOException{
    	if(! (mu instanceof org.kermeta.language.language.merger.binarymerger.org.kermeta.language.structure.ModelingUnitAspect)){
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