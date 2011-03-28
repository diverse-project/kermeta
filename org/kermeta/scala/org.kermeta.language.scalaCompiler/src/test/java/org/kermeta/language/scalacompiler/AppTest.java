package org.kermeta.language.scalacompiler;

import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.kermeta.language.scalacompiler.sub.ScalaCompiler;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );


        ScalaCompiler compiler = new ScalaCompiler();
        compiler.compile("/Users/ffouquet/NetBeansProjects/KermetaV2Trunk/org.kermeta.language.compiler/K2Output", "/Users/ffouquet/NetBeansProjects/KermetaV2Trunk/org.kermeta.language.compiler/K2OutputBin", Arrays.asList("/Users/ffouquet/NetBeansProjects/KermetaV2Trunk/org.kermeta.language.library.core/target/language.library.core-2.0.1-SNAPSHOT.jar"));


    }
}
