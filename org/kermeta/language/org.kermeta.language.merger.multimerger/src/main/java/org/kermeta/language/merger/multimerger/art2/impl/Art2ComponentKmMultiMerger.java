package org.kermeta.language.merger.multimerger.art2.impl;

import java.util.Collection;
import java.util.Iterator;

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
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.framework.MessagePort;
import org.kermeta.language.api.art2.port.utils.SimpleLogger;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortKmMerger;
import org.kermeta.language.api.result.ErrorProneResult;
import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.structure.ModelingUnit;
import org.osgi.framework.Bundle;

@Provides({
    @ProvidedPort(name = "KmMerger"/*, type = PortType.SERVICE*/, className = PortKmMerger.class)
})
@Requires({
    /**
     * Log port for sending technical messages
     */
    @RequiredPort(name = "log", type = PortType.MESSAGE),
    @RequiredPort(name = "KmBinaryMerger", type = PortType.SERVICE, className = PortKmBinaryMerger.class)
})
/**
 * ART2 component of multi merger for Kermeta 2 models
 */
@Library(name = "org.kermeta.language")
@ComponentType
public class Art2ComponentKmMultiMerger extends AbstractComponentType implements PortKmMerger {

    private String bundleSymbolicName = "";
    protected MessagePort logPort = null;
    protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
    // The KmBinaryMerger used by the MultiMerger
    private PortKmBinaryMerger binaryMerger = null;

    /** simple logger on top of logPort */
     protected SimpleLogger logger;


    @Start
    public void start() {
        bundleSymbolicName = ((Bundle) this.getDictionary().get("osgi.bundle")).getHeaders().get("Bundle-SymbolicName").toString();
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Successfully started MultiMerger" + bundleSymbolicName);
        logPort = getPortByName("log", MessagePort.class);
        binaryMerger = this.getPortByName("KmBinaryMerger", PortKmBinaryMerger.class);
    }

    @Stop
    public void stop() {
    }

    @Port(name = "KmMerger", method = "merge")
    public ModelingUnitResult merge(Collection<ModelingUnit> mus) {

        ModelingUnitResult result = null;

        // local variable to store errors after each merge
        ErrorProneResult globalErrors = new ErrorProneResult();


        if (mus.size() == 1) {
            // Only one element in the collection, return that element
            result = new ModelingUnitResult(mus.iterator().next());
        } else if (mus.size() > 1) {

            // Retrieve binary merger
            PortKmBinaryMerger binaryMerger = this.getPortByName("KmBinaryMerger", PortKmBinaryMerger.class);

            // Merge the first 2 elements in the collection
            Iterator<ModelingUnit> iterator = mus.iterator();
            ModelingUnit first = iterator.next();
            ModelingUnit second = iterator.next();

            ModelingUnitResult merged = binaryMerger.merge(first, second);

            // Store the errors in globalErrors
            for (ProblemMessage pm : merged.getProblems()) {
                globalErrors.getProblems().add(pm);
            }


            // Merge with the other elements
            while (iterator.hasNext()) {
                merged = binaryMerger.merge(merged.getModelingUnit(), iterator.next());

                // Store the errors
                for (ProblemMessage pm : merged.getProblems()) {
                    globalErrors.getProblems().add(pm);
                }

            }

            // Set the result
            result = new ModelingUnitResult(merged.getModelingUnit());
            for (ProblemMessage pm : globalErrors.getProblems()) {
                result.getProblems().add(pm);
            }
        }

        return result;
    }

    /**
     * Getter method for binaryMerger
     * @return
     */
    public PortKmBinaryMerger getBinaryMerger() {
        return binaryMerger;
    }

    /**
     * Setter method for binaryMerger
     * @param binaryMerger
     */
    public void setBinaryMerger(PortKmBinaryMerger binaryMerger) {
        this.binaryMerger = binaryMerger;
    }

    /**
     * This opertion should pass everything that ART2 initialize before calling the usual start method
     * This is used for test purpose
     * @param bundleSymbolicName
     */
    public void simulatedStart(String bundleSymbolicName, PortKmBinaryMerger binaryMerger) {
        this.bundleSymbolicName = bundleSymbolicName;
        logger = new SimpleLogger(this, bundleSymbolicName, "log");
        logger.debug("Successfully started " + bundleSymbolicName);
        setBinaryMerger(binaryMerger);
    }
}
