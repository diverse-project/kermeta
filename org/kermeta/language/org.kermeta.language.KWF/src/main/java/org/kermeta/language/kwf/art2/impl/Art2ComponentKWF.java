/* $Id: $
 * Project    : org.kermeta.language.KWF
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 sept. 2010
 * Authors : 
 *          Marie Gouyette <marie.gouyette@inria.fr> 
 */
package org.kermeta.language.kwf.art2.impl;

import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.ThirdParties;
import org.kermeta.art2.annotation.ThirdParty;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.kevent.KDocumentUpdate;
import org.kermeta.language.api.kevent.KEvent;
import org.kermeta.language.api.kevent.KExecutableKmUserRequestEvent;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKEvent;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.port.PortKmResolver;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.kwf.actions.GenerateExecutableKMAction;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;

/**
 * Implementation of a workflow component that manages KEvent sent to it doing the adequate action associated with these KEvent.
 * @author mgouyett
 *
 */
@Provides({
    @ProvidedPort(name = "kevent", type = PortType.MESSAGE)
})
@Requires({
    //@ProvidedPort(name = "asynclog", type=PortType.MESSAGE),
    /** Log port for sending technical messages */
    @RequiredPort(name = "log", type = PortType.MESSAGE),
    
    /** port that is able to load KMT files into ModelingUnits */
    @RequiredPort(name = "kmtLoader", type = PortType.SERVICE, className = PortResourceLoader.class),
    
    /** port that is able to merge a set of ModelingUnit into one ModelingUnit */
    @RequiredPort(name = "kmMerger", type = PortType.SERVICE, className = PortKmMerger.class),
    
    /** port that is able to resolve and set static information of a ModelingUnit  */
    @RequiredPort(name = "kmResolver", type = PortType.SERVICE, className = PortKmResolver.class)
})
@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.kp.model", url = "mvn:org.kermeta.kp/kp.model"),
    @ThirdParty(name = "org.kermeta.language.traceability.model", url = "mvn:org.kermeta.traceability/traceability.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api")
})
@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentKWF extends AbstractComponentType {

    protected String bundleSymbolicName = "";
    protected Bundle bundle;
    
    protected SimpleLogger logger;

	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();



    @Start
    public void start() {
        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Successfully started KWF");        
    }

    @Stop
    public void stop() {
    }

    @Port(name = "kevent")
    public void processKEvent(Object event) {
    	try{
	        //CHECK event instance of KEVENT
	        if (event instanceof KEvent) {
	        	logger.debug("KWF received new event : " + event);
	
	            if (event instanceof KDocumentUpdate) {
	                processKDocumentUpdate((KDocumentUpdate) event);
	            }
	            if (event instanceof KExecutableKmUserRequestEvent){
	            	GenerateExecutableKMAction action = new GenerateExecutableKMAction(this);
	            	action.process((KExecutableKmUserRequestEvent) event);
	            }
	
	        } else {
	        	logger.warning("Ignored message " + event.getClass());
	        }
    	}
        catch (Exception e){
        	logger.error("Failed to process event " + event + " due to " + e.getMessage(), e);
        }

    }

    private void processKDocumentUpdate(KDocumentUpdate event) {

        ModelingUnit root = this.getKmtLoaderPort().load(event.getURI(), PortResourceLoader.URIType.INMEMORY, event.getDocument());

        if (root == null) {
        	logger.error("Parse error !", null);
        } else {
        	logger.info("Parse OK");
        }


    }
    
    // --- Port accessors ---

    public PortResourceLoader getKmtLoaderPort() {
		return getPortByName("kmtLoader", PortResourceLoader.class);
	}
    
    public PortKmMerger getKmMergerPort() {
		return getPortByName("kmMerger", PortKmMerger.class);
	}
    
    public PortKmResolver getKmResolverPort() {
		return getPortByName("kmResolver", PortKmResolver.class);
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
