/* $Id: Art2ComponentEclipseLogger.java 12309 2010-09-01 07:26:27Z cbouhour $
 * Project    : org.kermeta.utils.logger.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 15 dec. 2010
 * Authors : 
 *           cbouhour <cedric.bouhours@inria.fr>
 *           cguy <clement.guy@inria.fr> 
 */
package org.kermeta.language.resolver.art2.impl;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortKmResolver;
import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.resolver.FullStaticResolver;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;

import org.kermeta.language.language.resolverrunner.MainRunner;

@Provides({
    @ProvidedPort(name = "KmResolver", className = PortKmResolver.class)
})
@Requires({
	@RequiredPort(name = "log", type = PortType.MESSAGE)
})

@Library(name = "org.kermeta.language")

@ComponentType
public class Art2ComponentKmResolver extends AbstractComponentType implements PortKmResolver {
	
	private String bundleSymbolicName = "";
	protected Bundle bundle;
    protected SimpleLogger logger;
    protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	
	@Start
	public void start(){
		bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Successfully started Resolver");
	}
	
	@Stop
	public void stop(){

	}
	
    @Port(name = "KmResolver", method = "resolve")
	public ModelingUnitResult resolve(ModelingUnit mu) {
    	logger.debug("Resolving ModelingUnit..." );
   	
    	MainRunner.init();
    	FullStaticResolver resolver = org.kermeta.language.resolver.RichFactory.createFullStaticResolver();
    	ModelingUnit muResolved = null;
    	try {
    		muResolved = resolver.resolve(enforceAspect(mu));
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
		}
    	
    	logger.debug("ModelingUnit resolved..." );
    	ModelingUnitResult result;
    	result = new ModelingUnitResult(muResolved);
    	logger.warning("Resolver not completely implemented" );
    	
    	return result;
	}
    
    // --- Port accessors --- (helpers to access the port in a safe way)
    public MessagePort getLogPort() {    	
		return logger.getLogPort();
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
    
    /**
     * This opertion should pass everything that ART2 initialize before calling the usual start method
     * This is used for test purpose
     * @param bundleSymbolicName
     */
    public void simulatedStart(String bundleSymbolicName) {
        this.bundleSymbolicName = bundleSymbolicName;
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Successfully started " + bundleSymbolicName);
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