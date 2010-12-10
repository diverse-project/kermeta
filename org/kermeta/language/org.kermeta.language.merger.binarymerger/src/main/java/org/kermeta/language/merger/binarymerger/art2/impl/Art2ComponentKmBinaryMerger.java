/*$Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 18 août 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.merger.binarymerger.art2.impl;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.merger.BinaryMerger;
import org.kermeta.language.merger.BinaryMergerAspect;
import org.kermeta.ecore.binarymerger.BinaryMergerException;
import org.kermeta.ecore.binarymerger.BinaryMergerExceptionAspect;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.traceability.ModelReference;
import org.kermeta.traceability.TraceabilityFactory;
import org.osgi.framework.Bundle;
import runner.MainRunner;

@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
})
@Requires({
    /**
     * Log port for sending technical messages
     */
    @RequiredPort(name = "log", type = PortType.MESSAGE)
})
@Provides({
    @ProvidedPort(name = "KmBinaryMerger", className = PortKmBinaryMerger.class)
})
/**
 * ART2 component of binary merger for Kermeta 2 models
 */
@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentKmBinaryMerger extends AbstractComponentType implements org.kermeta.language.api.port.PortKmBinaryMerger{

    protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
    protected String bundleSymbolicName = "";
    protected Bundle bundle;


    protected SimpleLogger logger;


    /**
     * method called when an instance of this component is instantiated and started
     */
    @Start
    public void start() {
        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        getLogger().debug("Succesfully started "+ bundleSymbolicName);
    }

    /**
     * method called when an instance of this component is stopped
     */
    @Stop
    public void stop() {
    }

    /**
     * BinaryMerger port that will merge two ModelingUnit into a single ModelingUnit
     * @param first_mu
     * @param second_mu
     * @return
     */
    @Port(name = "KmBinaryMerger", method = "merge")
    public ModelingUnitResult merge(ModelingUnit first_mu, ModelingUnit second_mu) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
    	
        MainRunner.init();

        BinaryMerger merger = org.kermeta.language.merger.RichFactory.createBinaryMerger();
        ModelingUnitResult result = new ModelingUnitResult();
		try {
			result.setModelingUnit((ModelingUnit) merger.merge(enforceAspect(first_mu), enforceAspect(second_mu)));
		
	        BinaryMergerAspect mergerAspect = (BinaryMergerAspect) merger;
	        for (Object o : mergerAspect.getErrors()) {
	        	if(o instanceof BinaryMergerExceptionAspect){
	        		BinaryMergerExceptionAspect e = (BinaryMergerExceptionAspect) o;
	        		ModelReference modelRef = TraceabilityFactory.eINSTANCE.createModelReference();
	        		modelRef.setRefObject(e.aspectElement());
	        		// TODO bug, the nested exception isn't the correct one, I don't know how to cast the BinaryMergerExceptionAspect into a classic java Exception
	        		//ProblemMessage pm = (ProblemMessage) UnifiedMessageFactory.getInstance().createErrorMessage(e.message(), "org.kemeta.language.merger.binarymerger", e, modelRef);
	        		
	        		ProblemMessage pm = (ProblemMessage) UnifiedMessageFactory.getInstance().createErrorMessage(e.message(), "org.kemeta.language.merger.binarymerger", null, modelRef);
	        		result.getProblems().add(pm);
	        		// TODO also send the problem to a log port ?
	        	}
			}
		} catch (IOException e1) {
			ProblemMessage pm = (ProblemMessage) UnifiedMessageFactory.getInstance().createErrorMessage(e1.getMessage(), "org.kemeta.language.merger.binarymerger", null, null);
    		result.getProblems().add(pm);
		}
        return result;
    }
    
    protected ModelingUnit enforceAspect(ModelingUnit mu) throws IOException{
    	if(! (mu instanceof ScalaAspect.org.kermeta.language.structure.ModelingUnitAspect)){
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
    
 // --- Port accessors ---

    public PortResourceLoader getKmtLoaderPort() {
		return getPortByName("kmtLoader", PortResourceLoader.class);
	}
    
    public PortKmMerger getKmMergerPort() {
		return getPortByName("kmMerger", PortKmMerger.class);
	}
    
    
    // --- GETTERS and SETTERS ---
    public SimpleLogger getLogger() {
		return logger;
	}

    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }

    public Bundle getBundle() {
        return bundle;
    }
}
