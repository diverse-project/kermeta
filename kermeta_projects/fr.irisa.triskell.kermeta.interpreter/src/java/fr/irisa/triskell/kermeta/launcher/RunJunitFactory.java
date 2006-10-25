/* $Id: RunJunitFactory.java,v 1.17 2006-10-25 08:30:14 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : RunJunit.java
 * License    : EPL
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;

/**
 * Run a kermeta program as a Junit test It may return either a TestCase or a
 * TestSuite
 *  
 */
public class RunJunitFactory implements Test {

    private TestSuite theTestSuite = null;
    private TestCase theTestCase = null;
    
    public boolean isTestSuite = false; // this part of a KermetaTestSuite
    
   // private String unit_uri;
    
    public KermetaUnit root_unit;
    
    /**
     * 
     */
    public RunJunitFactory() {
        
    }
   // public KermetaInterpreter kminterpreter = null;
    
    
    
    /**
     * @param args
     */
    public Test addTestsForUnit(String unit_uri) {

        
        if(root_unit == null) {
        	StdLibKermetaUnitHelper.unloadStdLib();
        	KermetaUnitFactory.resetDefaultLoader();
            root_unit = StdLibKermetaUnitHelper.getKermetaUnit();
            TypeCheckerContext.initializeTypeChecker(root_unit);
        }
        //KermetaUnitFactory.resetDefaultLoader(); // each test must be run in its own environment
        //KermetaUnitFactory.
        KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(unit_uri);

        
        
        
        try {
            
            unit.load();
            unit.typeCheck(null);
        
            // copy imported unit to the root unit
            // DVK: needed to make sure the seamlaess java works ...
            root_unit.importedUnits.addAll(unit.importedUnits);
            
            if (unit.messages.hasError()) {
            	System.err.println("Unit " + unit.getUri() + " contains errors (ie. didn't load or typecheck correctly)");
            	System.err.println(unit.messages.getAllMessagesAsString());
            	theTestCase = new FailedTestCase("Unit " + unit.getUri() + " contains errors (ie. didn't load or typecheck correctly)", 
            		new Exception(unit.messages.getAllMessagesAsString()));
                return theTestCase;
            }
            
            
            //System.err.println("Memory before : " + Runtime.getRuntime().totalMemory());
            //unit.discardAllTraceabilityInfo();
            //Runtime.getRuntime().gc();
            //System.err.println("Memory after : " + Runtime.getRuntime().totalMemory());
            

            
            // get the main class to see if it inherits from class kermeta::kunit::Test
            isTestSuite = false;
            String main_class = null;
            String main_operation = null;
            Iterator it = unit.rootPackage.getTag().iterator();
            while(it.hasNext()) {
                Tag tag = (Tag)it.next();
                if (tag.getName().equals("mainClass")) 
    	            main_class = tag.getValue(); 
                if (tag.getName().equals("mainOperation"))
    	            main_operation = tag.getValue(); //remove the " to memorize value
            }
            if (main_class != null) {
            	
                ClassDefinition cd = (ClassDefinition)unit.typeDefinitionLookup(main_class);                
                if(cd != null){
                	ClassDefinition class_test = (ClassDefinition)unit.typeDefinitionLookup("kermeta::kunit::Test");
            
	                SimpleType kunit_test_type = new SimpleType(InheritanceSearch.getFClassForClassDefinition(class_test));
	                SimpleType main_type = new SimpleType(InheritanceSearch.getFClassForClassDefinition(cd));
	                
	                if (main_type.isSubTypeOf(kunit_test_type)) isTestSuite = true;
                }
            }
            
            // Display the errors stored in the unit that is checked
            if (unit.messages.unitHasError)
            {
                System.err.println("*** There are errors in the TestSuite of <"+ unit_uri + "> :" );
                for (int i=0; i<unit.messages.getErrors().size(); i++)
                {
                    System.out.println("Error "+i+":"+ unit.messages.getErrors().get(i));
                }
            }
            else
            {
                System.out.println(" *** No internal uncaught error for <"+unit_uri+">");
            }
            
            
            // It is a test suite
            if (isTestSuite) {
                theTestSuite = new TestSuite();
                theTestSuite.setName(unit_uri);
                
                includeTestSuite(main_class, unit);

                if(theTestSuite.countTestCases() == 0){
                	// No valid test in the testsuite ! => fails
                	Exception e = new Exception("Empty test suite ! Please check your unit (it must contain at least one operation whose name starts with 'test')");
                	return new FailedTestCase(unit_uri, e);
                }
                return theTestSuite;
                
            }
            else // it is not a test suite
            {
                theTestCase = new RunTestCase(main_class, main_operation, this);
                return theTestCase;
            }

        } catch (fr.irisa.triskell.kermeta.error.KermetaError e) {
            // we cannot determine if this is a test suite or a simple test
            // this test will fail since we haven't succeeded to load the files
            // construct a "fake" test that simply fails and return this
            // exception
            theTestCase = new FailedTestCase(unit_uri, e);
            return theTestCase;
        }
    }

    /**
     * This special TestCase is there to keep a trace of the failure of
     * preloading the kermeta program
     *  
     */
    public class FailedTestCase extends TestCase {
        public Throwable cause;

        public FailedTestCase(String TestCaseName, Throwable e) {
            super(TestCaseName);
            cause = e;
        }

        /*
         * (non-Javadoc)
         * 
         * @see junit.framework.Test#runTest(junit.framework.TestResult)
         */
        protected void runTest() throws Throwable {
            //arg0.addError(this, cause);
            throw cause;
        }
    }

    public void includeTestSuite(String main_class, KermetaUnit unit) {

        // all operations that begin by "test" inside the class
        // specified by mainClassValue are added as concrete testcases
        // Create the RuntimeObject of main class, of its instance, and
        // its ClassDefinition so that we can get its operations in order to
        // run them
        
        
        
       Iterator it = ((ClassDefinition)unit.typeDefinitionLookup(main_class)).getOwnedOperation().iterator();

        // Get each operation which name begins by "test",
        // and run it.
        while (it.hasNext()) {
            //	      We can now launch the operation found in mainOperation through
            // the BaseInterpreter
            Operation mainOp = (Operation) it.next();
            if (mainOp.getName().startsWith("test")) {
                theTestSuite.addTest(new RunTestCase(main_class, mainOp.getName(), this));
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