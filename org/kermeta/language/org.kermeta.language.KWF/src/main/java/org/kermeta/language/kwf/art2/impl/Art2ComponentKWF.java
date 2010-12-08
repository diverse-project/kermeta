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
    /**
     * Log port for sending technical messages
     */
    @RequiredPort(name = "log", type = PortType.MESSAGE),
    @RequiredPort(name = "kmtloader", type = PortType.SERVICE, className = PortResourceLoader.class)
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

    public SimpleLogger getLogger() {
		return logger;
	}

	protected PortResourceLoader kmtLoaderPort = null;
    public PortResourceLoader getKmtLoaderPort() {
    	if(kmtLoaderPort == null){
    		kmtLoaderPort = getPortByName("kmtloader", PortResourceLoader.class);
    	}
		return kmtLoaderPort;
	}

	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();


    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }

    public Bundle getBundle() {
        return bundle;
    }

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

        //CHECK event instance of KEVENT
        if (event instanceof KEvent) {
        	logger.info("KWF received new event : " + event);

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

    private void processKDocumentUpdate(KDocumentUpdate event) {

        ModelingUnit root = this.getPortByName("kmtloader", PortResourceLoader.class).load(event.getURI(), PortResourceLoader.URIType.INMEMORY, event.getDocument());

        if (root == null) {
        	logger.error("Parse error !", null);
        } else {
        	logger.info("Parse OK");
        }


    }

}
