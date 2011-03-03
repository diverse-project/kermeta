/*$Id: Art2ComponentTexteditorEclipse.java 13484 2010-11-15 14:35:02Z francoisfouquet $
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : November 2010
 * Authors :
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline.test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.kermeta.language.compiler.commandline.KermetaCompiler;

import junit.framework.Test;
import junit.framework.TestSuite;



/**
 * Test suite for KmBinaryMerger port
 */
public class CommandLineKermetaCompilerTestSuite extends TestSuite {

   // @Override
    public static Test suite() {

		KermetaCompiler.initializeFactory();
    	TestSuite suite = new TestSuite("CommandLineKermetaCompilerTestSuite");
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/test_001/001_testHelloWorld_standalone.kpt",
    													  "target/test/test_001"));
        return suite;
    }

    

    
}
