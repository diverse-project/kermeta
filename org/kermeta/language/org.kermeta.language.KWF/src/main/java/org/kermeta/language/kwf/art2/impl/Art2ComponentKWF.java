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
import org.kermeta.language.api.kevent.KDocumentUpdate;
import org.kermeta.language.api.kevent.KEvent;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKEvent;
import org.kermeta.language.api.port.PortResourceLoader;
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
    protected MessagePort logPort = null;
    protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
    /**
     * As it uses UI declaration via plugin.xml, this component is a singleton in Eclipse
     */
    protected static Art2ComponentKWF instance;

    public static Art2ComponentKWF getDefault() {
        return instance;
    }

    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }

    public Bundle getBundle() {
        return bundle;
    }

    @Start
    public void start() {
        instance = this;
        logPort = getPortByName("log", MessagePort.class);
        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
        System.out.println("Successfully started KWF");
        logPort.process(mFactory.createDebugMessage("Successfully started KWF", bundleSymbolicName));
    }

    @Stop
    public void stop() {
    }

    @Port(name = "kevent")
    public void processKEvent(Object event) {

        //CHECK event istance of KEVENT
        if (event instanceof KEvent) {
            logPort.process(mFactory.createInfoMessage("KWF received new event : " + event, bundleSymbolicName));

            if (event instanceof KDocumentUpdate) {
                processKDocumentUpdate((KDocumentUpdate) event);
            }


        } else {
            logPort.process(mFactory.createErrorMessage("Uncatch Message " + event.getClass(), bundleSymbolicName));
        }

    }

    private void processKDocumentUpdate(KDocumentUpdate event) {

        ModelingUnit root = this.getPortByName("kmtloader", PortResourceLoader.class).load(event.getURI(), PortResourceLoader.URIType.INMEMORY, event.getDocument());

        if (root == null) {
            logPort.process(mFactory.createErrorMessage("Parse error !", bundleSymbolicName));
        } else {
            logPort.process(mFactory.createInfoMessage("Parse OK", bundleSymbolicName));
        }


    }
}
