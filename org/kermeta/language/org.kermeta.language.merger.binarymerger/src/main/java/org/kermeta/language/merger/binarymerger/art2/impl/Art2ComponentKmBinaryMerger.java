/*$Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 18 août 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.merger.binarymerger.art2.impl;


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
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.merger.BinaryMerger;
import org.kermeta.language.structure.ModelingUnit;
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
public class Art2ComponentKmBinaryMerger extends AbstractComponentType {

    protected MessagePort logPort = null;
    protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
    protected String bundleSymbolicName = "";
    protected Bundle bundle;

    public MessagePort getLogPort() {
        return logPort;
    }

    public String getBundleSymbolicName() {
        return bundleSymbolicName;
    }

    /**
     * method called when an instance of this component is instantiated and started
     */
    @Start
    public void start() {
        System.out.println("Art2ComponentTexteditorEclipse.start ...");

        // store some useful data
        logPort = getPortByName("log", MessagePort.class);

        bundle = (Bundle) this.getDictionary().get("osgi.bundle");
        bundleSymbolicName = bundle.getHeaders().get("Bundle-SymbolicName").toString();
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
    public ModelingUnit merge(ModelingUnit first_mu, ModelingUnit second_mu) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
        MainRunner.init();

        BinaryMerger merger = org.kermeta.language.merger.RichFactory.createBinaryMerger();
        return merger.merge(first_mu, second_mu);

    }
}
