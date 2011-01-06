/* $Id: $
 * Project    : org.kermeta.language.ecore2km
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 25 nov. 2010
 * Authors : 
 *            Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 *            Arnaud Blouin
 */
package org.kermeta.language.ecore2km.art2.impl;

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
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortEcore2Km;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;
import runner.MainRunner;
import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.ecore2km.Ecore2km;

@ThirdParties({
    @ThirdParty(name = "org.kermeta.language.model", url = "mvn:org.kermeta.language/language.model"),
    @ThirdParty(name = "org.kermeta.language.api", url = "mvn:org.kermeta.language/language.api"),
    @ThirdParty(name = "org.kermeta.emf", url = "mvn:org.kermeta.emf/emf.lib")
})
@Requires({
    @RequiredPort(name = "log", type = PortType.MESSAGE)
})
@Provides({
    @ProvidedPort(name = "Ecore2km", type = PortType.SERVICE, className = PortEcore2Km.class)
})


@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentEcore2Km extends AbstractComponentType implements PortEcore2Km {

    protected UnifiedMessageFactory mFactory 	= UnifiedMessageFactory.getInstance();
    protected String bundleSymbolicName 		= "";
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
        logger.debug("Succesfully started " + bundleSymbolicName);
    }

    /**
     * method called when an instance of this component is stopped
     */
    @Stop
    public void stop() {
    }

    
    @Port(name = "Ecore2km", method = "convertPackage")
    public ModelingUnit convertPackage(final EPackage rootPackage, final String namespacePrefix) {
        // call the init in order to make sure that the registry is correctly set
        // TODO look how to not put duplicates in the eclipse registry when run in eclipse work
        //((org.eclipse.emf.ecore.EcoreFactoryWrapper)(org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)).setWrap((org.eclipse.emf.ecore.EcoreFactory)ScalaAspect.org.eclipse.emf.ecore.RichFactory.createEFactory());
        MainRunner.init();

        Ecore2km converter = org.kermeta.language.ecore2km.RichFactory.createEcore2km();
        return converter.convert(rootPackage, namespacePrefix);
    }
    
    
    
    /**
     * This operation should pass everything that ART2 initialize before calling the usual start method
     * This is used for test purpose
     * @param bundleSymbName
     */
    public void simulatedStart(String bundleSymbName) {
        this.bundleSymbolicName = bundleSymbName;
        logger = new SimpleLogger(this, bundleSymbName, "log");
        logger.debug("Successfully started "+bundleSymbName);
    }
}
