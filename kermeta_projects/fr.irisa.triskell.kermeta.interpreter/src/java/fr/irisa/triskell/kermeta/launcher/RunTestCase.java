/* $Id: RunTestCase.java,v 1.4 2005-05-13 15:05:44 ffleurey Exp $
 * Project : Kermeta.interpreter
 * File : RunTestCase.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		dvojtise	<dvojtise@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 * 		- interpreterInstance has become a static attribute of Run 
 * 		- splitted main method in smaller ones
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Launcher for Kermeta interpreter. It can be run from the command line or as a
 * test case for JUnit.
 */
public class RunTestCase extends TestCase {

    /** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");

    private String unit_uri;
    // these values from the Run object are saved so they can be restored
    //when a testcase run
    private String mainClassValue;
    private String mainOperationValue;

    private RunJunitFactory containerTestSuite;

    // workaround about static fileds in Run.java
    private static RunJunitFactory containerTestSuitePreviouslyRun = null;

    public RunTestCase(String unit_uri, String themainClassValue, String themainOperationValue, RunJunitFactory thecontainerTestSuite)

    {
        super(themainClassValue + "." + themainOperationValue);
        this.unit_uri = unit_uri;
        mainClassValue = themainClassValue;
        mainOperationValue = themainOperationValue;
        containerTestSuite = thecontainerTestSuite;
    }

    protected void setUp() throws java.lang.Exception {
        // if this test does not belong to the same test suite as the preceding
        // then reinitialize the interpreter
        //  This is due to the use of public static value of "Run"
        // this workaround will not be neede when we will remove those static in
        // Run
        if (containerTestSuite != containerTestSuitePreviouslyRun || containerTestSuite.kminterpreter == null) {
            containerTestSuite.kminterpreter = new KermetaInterpreter(unit_uri);
            containerTestSuite.kminterpreter.setEntryPoint(mainClassValue, mainOperationValue);
            internalLog.info("interpreterReinitialized for running " + mainClassValue + "." + mainOperationValue);

        }
        containerTestSuitePreviouslyRun = containerTestSuite;

    }

    protected void tearDown() throws java.lang.Exception {
        // not needed anymore now
        containerTestSuite = null;
    }

    /**
     * This method is used for a kermeta program when it does not contain the
     * tag "testOperation". But when the tag "testOperation" is defined, it
     * means that we have to execute all the operation prefixed by
     * <code>test</code>. Otherwise, there should be a "mainOperation" to
     * launch (which name is defined in the <code>mainOperation</code> tag
     */
    public void runTest() {
        containerTestSuite.kminterpreter.launch();
    }

}