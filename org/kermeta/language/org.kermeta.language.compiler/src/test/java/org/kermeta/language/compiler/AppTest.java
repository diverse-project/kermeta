package org.kermeta.language.compiler;

import java.io.File;
import java.util.Properties;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.kermeta.language.structure.ModelingUnit;

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

        LoadModelHelper loader = new LoadModelHelper();
        ModelingUnit model = loader.loadKM("/Users/ffouquet/NetBeansProjects/KermetaV2Trunk/org.kermeta.language.api.tests/src/main/resources/KmCompiler_Valid/valid_001_Helloworld/testHelloWorld_standalone.km");

        File fb = new File("K2Output");
        fb.mkdir();

        System.out.println(fb.getAbsolutePath());

        GlobalConfiguration.outputFolder_$eq(fb.getAbsolutePath());

        GlobalConfiguration.frameworkGeneratedPackageName_$eq("ScalaImplicit.generated");
        GlobalConfiguration.props_$eq(new Properties());
        GlobalConfiguration.props().setProperty("use.default.aspect.uml", "false");
        GlobalConfiguration.props().setProperty("use.default.aspect.ecore", "false");
        GlobalConfiguration.props().setProperty("use.default.aspect.km", "false");

        Compiler c = new Compiler();
        c.compile(model);

    }
}
