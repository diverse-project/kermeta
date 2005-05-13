/* $Id: RunJunitFactory.java,v 1.4 2005-05-13 15:05:46 ffleurey Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : RunJunit.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        <desription.text> 
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.error.KermetaLoaderError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Run a kermeta program as a Junit test It may return either a TestCase or a
 * TestSuite
 *  
 */
public class RunJunitFactory implements Test {

    private TestSuite theTestSuite = null;

    private TestCase theTestCase = null;

    private String unit_uri;

    public KermetaInterpreter kminterpreter = null;
    
    /**
     * @param args
     */
    public RunJunitFactory(String unit_uri) {
        this.unit_uri = unit_uri;
        try {

            // Create the interpreter
            kminterpreter = new KermetaInterpreter(unit_uri);
            
            // get the main class to see if it inherits from class kermeta::kunit::Test
            boolean isTestSuite = false;
            String main_class = null;
            Iterator it = kminterpreter.getUnit().rootPackage.getFTag().iterator();
            while(it.hasNext()) {
                FTag tag = (FTag)it.next();
                if (tag.getFName().equals("mainClass")) 
    	            main_class = tag.getFValue().substring(1,tag.getFValue().length()-1); 
            }
            if (main_class != null) {
                FClassDefinition cd = (FClassDefinition)kminterpreter.getUnit().typeDefinitionLookup(main_class);
                FClassDefinition class_test = (FClassDefinition)kminterpreter.getUnit().typeDefinitionLookup("kermeta::kunit::Test");
            
                SimpleType kunit_test_type = new SimpleType(InheritanceSearch.getFClassForClassDefinition(class_test));
                SimpleType main_type = new SimpleType(InheritanceSearch.getFClassForClassDefinition(cd));
                
                if (main_type.isSubTypeOf(kunit_test_type)) isTestSuite = true;
            }
            
            // It is a test suite
            if (isTestSuite) {
                theTestSuite = new TestSuite();
                theTestSuite.setName(unit_uri);
                
                includeTestSuite(main_class);
                
            }
            else // it is not a test suite
            {
                theTestCase = new RunTestCase(unit_uri, main_class, kminterpreter.getEntryOperation().getFName(), this);
            }
            kminterpreter = null;

        } catch (fr.irisa.triskell.kermeta.error.KermetaError e) {
            // we cannot determine if this is a test suite or a simple test
            // this test will fail since we haven't succeeded to load the files
            // construct a "fake" test that simply fails and return this
            // exception
            theTestCase = new FailedTestCase(unit_uri, e);
            theTestSuite = null;
        }
    }

    /**
     * This special TestCase is there to keep a trace of the failure of
     * preloading the kermeta program
     *  
     */
    public class FailedTestCase extends TestCase {
        public fr.irisa.triskell.kermeta.error.KermetaError cause;

        public FailedTestCase(String TestCaseName, fr.irisa.triskell.kermeta.error.KermetaError e) {
            super(TestCaseName);
            cause = e;
        }

        /*
         * (non-Javadoc)
         * 
         * @see junit.framework.Test#runTest(junit.framework.TestResult)
         */
        protected void runTest() {
            //arg0.addError(this, cause);
            throw cause;
        }
    }

    public void includeTestSuite(String main_class) {

        // all operations that begin by "test" inside the class
        // specified by mainClassValue are added as concrete testcases
        // Create the RuntimeObject of main class, of its instance, and
        // its FClassDefinition so that we can get its operations in order to
        // run them
       Iterator it = kminterpreter.getEntryClass().getFClassDefinition().getFOwnedOperation().iterator();

        // Get each operation which name begins by "test",
        // and run it.
        while (it.hasNext()) {
            //	      We can now launch the operation found in mainOperation through
            // the BaseInterpreter
            FOperation mainOp = (FOperation) it.next();
            if (mainOp.getFName().startsWith("test")) {
                theTestSuite.addTest(new RunTestCase(unit_uri, main_class, mainOp.getFName(), this));
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see junit.framework.Test#countTestCases()
     */
    public int countTestCases() {
        if (theTestSuite != null)
            return theTestSuite.countTestCases();
        if (theTestCase != null)
            return theTestCase.countTestCases();
        // else
        return 0;
    }

    public Test getTest() {
        if (theTestSuite != null)
            return theTestSuite;
        if (theTestCase != null)
            return theTestCase;
        // else
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see junit.framework.Test#run(junit.framework.TestResult)
     */
    public void run(TestResult arg0) {
        if (theTestSuite != null)
            theTestSuite.run(arg0);
        if (theTestCase != null)
            theTestCase.run(arg0);

    }
}