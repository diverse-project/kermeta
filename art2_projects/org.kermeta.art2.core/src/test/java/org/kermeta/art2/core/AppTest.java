package org.kermeta.art2.core;

import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.kermeta.art2.Art2Factory;
import org.kermeta.art2.ContainerRoot;
import org.kermeta.art2.adaptation.deploy.osgi.Art2AdaptationDeployServiceOSGi;
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager;
import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.kompare.Art2KompareBean;
import org.kermeta.art2adaptation.AdaptationModel;
import org.kermeta.art2adaptation.AdaptationPrimitive;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);


        ContainerRoot amodel = Art2Factory.eINSTANCE.createContainerRoot();
        ContainerRoot nmodel = Art2XmiHelper.load("/Users/ffouquet/Desktop/distart.xmi");



        Art2KompareBean kompareService = new Art2KompareBean();
        Art2AdaptationDeployServiceOSGi adaptationService = new Art2AdaptationDeployServiceOSGi();
        adaptationService.setContext(new Art2DeployManager());

        AdaptationModel adapModel = kompareService.kompare(amodel, nmodel, "duke.irisa.fr");


        /* REMOVE CT */
        ArrayList toRemove = new ArrayList();
        for (AdaptationPrimitive ap : adapModel.getAdaptations()) {
            System.out.println(ap.getClass().getSimpleName());
            if (ap.getClass().getName().contains("ComponentType")) {
                toRemove.add(ap);
            }
        }
        adapModel.getAdaptations().removeAll(toRemove);

        System.out.println("Adaptation Model Size =" + adapModel.getAdaptations().size());


        adaptationService.deploy(adapModel);

    }
}
