/* $Id: RunJunitFactory.java,v 1.9 2008-04-28 11:51:16 ftanguy Exp $
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

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.kermeta.interpreter.helper.RunnerHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

/**
 * Run a kermeta program as a Junit test It may return either a TestCase or a
 * TestSuite
 *  
 */
/**
 * @author dvojtise
 *
 */
public class RunJunitFactory implements Test {

    private TestSuite theTestSuite = null;
    private TestCase theTestCase = null;
    
    public boolean isTestCase = false; // this part of a KermetaTestSuite
    
    private String unit_uri;
    
    private KermetaUnit unit = null;
    
    private boolean isCompiled = false;

    private KermetaUnit executable = null;
    
    /**
     * enabling this option will optimize the loading, so it will load it only once : one for the identification 
     * of the internal tests (if this test is a testsuite), one when it will run it
     * By default this is false since it is memory consumming and this prevent side effect from one testsuite to another
     * Note than even set to false, all the internal tests will run using the same loaded unit
     * 
     */
    public boolean optimizeLoading = false;
    /**
     * Default constructor
     */
    public RunJunitFactory() {
        optimizeLoading = false;
    }
    /**
     * constructor allowing to change some default setting
     */
    public RunJunitFactory(boolean optimizeLoading) {
        this.optimizeLoading = optimizeLoading;
    }
   
    public Test addTestsForUnit(String unit_uri) {
    	return addTestsForUnit(unit_uri, false);
    }
    
    public String getURI() {
        try {
        	if ( executable == null )
        		executable = RunnerHelper.getKermetaUnitToExecute(unit_uri, "platform:/resource/interpreter.km");
			return executable.getUri();
        } catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
    }
    
    /**
     * Main method of this class, it is used to create the junit test(s) for this unit/file
     * @param unit_uri
     * @param constraintExecution
     * @return
     */
    public Test addTestsForUnit(String unit_uri, boolean constraintExecution) {
    	// needed in case of non optimizedLoading
    	this.unit_uri = unit_uri;
    	
    	// precalculate the name of the test in the eventuality it fails before having loaded it
    	int index  = unit_uri.lastIndexOf("/");
    	String failedTestName = unit_uri.substring(index+1);
        
    	try {
    		/*
    		 * 
    		 * Trying to load the file. If the load fails we catch the exceptions to add a fail test case.
    		 * 
    		 */
    		Map<Object, Object> options = new HashMap<Object, Object>();
    		options.put(LoadingOptions.ECORE_QuickFixEnabled, true);
    		unit = LoaderPlugin.getDefault().load( unit_uri, options );
		} catch (URIMalformedException e) {
			e.printStackTrace();
			theTestCase = new FailedTestCase(failedTestName, e);
            return theTestCase;
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
			theTestCase = new FailedTestCase(failedTestName, e);
            return theTestCase;
		}
    	
        try {
            
        	/*
        	 * 
        	 * Typechecking the kermeta unit. If errors occurs create a fail test case.
        	 * 
        	 */
        	KermetaTypeChecker typechecker = new KermetaTypeChecker( unit );
        	typechecker.checkUnit();

            if ( unit.isIndirectlyErroneous() ) {
            	System.err.println("Unit " + unit.getUri() + " contains errors (ie. didn't load or typecheck correctly)");
            	System.out.println( KermetaUnitHelper.getWarningsAsString(unit));            	
            	System.err.println(KermetaUnitHelper.getErrorsAsString(unit));
            	theTestCase = new FailedTestCase(failedTestName, 
            		new Exception("Unit " + unit.getUri() + " contains errors (ie. didn't load or typecheck correctly)" +
            					  KermetaUnitHelper.getAllErrorsAsString(unit)));
            	if(!optimizeLoading) 
            		resetUnit(); // reset the unit to free some memory
                return theTestCase;
            }
            
            /*
             * 
             * Constraint checking the kermeta unit. If errors occurs create a fail test case.
             * 
             */
        	KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( unit );
        	constraintchecker.checkUnit();
        
            if ( unit.isIndirectlyErroneous()) {
            	System.err.println("Unit " + unit.getUri() + " contains errors (ie. didn't load or constraintcheck correctly)");
            	System.out.println( KermetaUnitHelper.getAllWarningsAsString(unit));            	
            	System.err.println(KermetaUnitHelper.getAllErrorsAsString(unit));
            	theTestCase = new FailedTestCase(failedTestName, 
            		new Exception("Unit " + unit.getUri() + " contains errors (ie. didn't load or constraintcheck correctly)"+
            				KermetaUnitHelper.getAllErrorsAsString(unit)));
            	if(!optimizeLoading) 
            		resetUnit(); // reset the unit to free some memory
            	return theTestCase;
            }
                      
            /*
             * 
             * Getting the entry point of the program.
             * 
             */
            String main_class = ModelingUnitHelper.getMainClassValue(unit);
            String main_operation = ModelingUnitHelper.getMainOperationValue(unit);
            
            if (main_class != null) {
            	
                ClassDefinition cd = (ClassDefinition)unit.getTypeDefinitionByName(main_class);                
                if ( cd != null ) {
                	ClassDefinition class_test = (ClassDefinition)unit.getTypeDefinitionByQualifiedName("kermeta::kunit::TestCase");
            
	                SimpleType kunit_test_type = new SimpleType(InheritanceSearch.getFClassForClassDefinition(class_test));
	                SimpleType main_type = new SimpleType(InheritanceSearch.getFClassForClassDefinition(cd));
	                
	                if (main_type.isSubTypeOf(kunit_test_type)) 
	                	isTestCase = true;
                }
            }
            
            // Display the errors stored in the unit that is checked
            if ( unit.isIndirectlyErroneous() )
            {
                System.err.println("*** There are errors in the TestSuite of <"+ unit_uri + "> :" );
                System.out.println( KermetaUnitHelper.getErrorsAsString(unit) );
            }
            else
            {
                System.out.println(" *** No internal uncaught error for <"+unit_uri+">");
            }
            
            
            // It is a test suite
            if (isTestCase) {
                theTestSuite = new TestSuite();
                theTestSuite.setName(unit_uri);
                
                includeTestSuite(main_class, unit, constraintExecution);
                if(!optimizeLoading) 
                	resetUnit(); // reset the unit to free some memory
                if(theTestSuite.countTestCases() == 0){
                	// No valid test in the testsuite ! => fails
                	Exception e = new Exception("Empty test suite ! Please check your unit (it must contain at least one operation whose name starts with 'test')");
                	return new FailedTestCase(failedTestName, e);
                }
                
                return theTestSuite;
                
            }
            else // it is not a test suite
            {
            	if(isCompiled) {
            		theTestCase = new RunCompiledTestCase(main_class, main_operation, this, constraintExecution, true);
            	} else {
            		theTestCase = new RunInterpretedTestCase(main_class, main_operation, this, constraintExecution, true);
            	}
                
            	if(!optimizeLoading)
            		resetUnit(); // reset the unit to free some memory
                return theTestCase;
            }

        } catch (fr.irisa.triskell.kermeta.error.KermetaError e) {
            // we cannot determine if this is a test suite or a simple test
            // this test will fail since we haven't succeeded to load the files
            // construct a "fake" test that simply fails and return this
            // exception
            theTestCase = new FailedTestCase(failedTestName, e);
            if(!optimizeLoading) resetUnit(); // reset the unit to free some memory
            return theTestCase;
        }
        catch (Throwable t){
        	// In Junit 4 we do not have the right to raise an exception otherwise all the test will not be displayed
        	theTestCase = new FailedTestCase(failedTestName, t);
            if(!optimizeLoading) resetUnit(); // reset the unit to free some memory
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
    	includeTestSuite(main_class, unit, false);
    }
    
    
    public void includeTestSuite(String main_class, KermetaUnit unit, boolean constraintExecution) {

        // all operations that begin by "test" inside the class
        // specified by mainClassValue are added as concrete testcases
        // Create the RuntimeObject of main class, of its instance, and
        // its ClassDefinition so that we can get its operations in order to
        // run them
        
        
        
       Iterator<Operation> it = ((ClassDefinition)unit.getTypeDefinitionByName(main_class)).getOwnedOperation().iterator();

        // Get each operation which name begins by "test",
        // and run it.
        while (it.hasNext()) {
            //	      We can now launch the operation found in mainOperation through
            // the BaseInterpreter
            Operation mainOp = it.next();
            if (mainOp.getName().startsWith("test")) {
            	if(isCompiled) {
            		theTestSuite.addTest(new RunCompiledTestCase(main_class, mainOp.getName(), this, constraintExecution, !it.hasNext()));
            	} else {
            		theTestSuite.addTest(new RunInterpretedTestCase(main_class, mainOp.getName(), this, constraintExecution, !it.hasNext()));
            	}
                
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
    
    
    public void resetUnit(){
     	/*
     	 * 
     	 * Unloading the source.
     	 * 
     	 */
    	LoaderPlugin.getDefault().unload(unit_uri);
    	
    	/*
    	 * 
    	 * Unloading the executable if it exists.
    	 * 
    	 */
    	if ( executable != null ) {
        	String s = executable.getUri();
    		executable = null;
    		LoaderPlugin.getDefault().unload( s );
    	}
    	unit = null;
    	Runtime.getRuntime().gc();
    }
    /**
     * return the unit, take care of optimization
     * may reload it if necessary
     * @return
     */
	public KermetaUnit getUnit() {
		if ( unit == null ) {
			try {
				unit = KermetaUnitChecker.check( unit_uri );
			} catch (NotRegisteredURIException e1) {
				e1.printStackTrace();
			} catch (URIMalformedException e1) {
				e1.printStackTrace();
			}
		}
		return unit;
	}
}