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
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.port.PortKmResolver;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;

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
    	ModelingUnitResult result = null;
  	
    	result = new ModelingUnitResult(mu);
    	logger.warning("Not implemented, returning input ModelingUnit" );
    	
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
    
}

