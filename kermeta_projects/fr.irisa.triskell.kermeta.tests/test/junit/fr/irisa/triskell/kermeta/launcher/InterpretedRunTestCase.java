/* $Id: InterpretedRunTestCase.java,v 1.1 2008-10-31 13:57:06 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : RunTestCase.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Authors : 
 * 		dvojtise	<dvojtise@irisa.fr>
 * 		zdrey 		<zdrey@irisa.fr>
 * Description :  	
 * 	see class javadoc.	
 * History :
 * 		- added detection of Kermeta assertion so it can be translated into JUnit failure
 * 		- interpreterInstance has become a static attribute of Run 
 * 		- splitted main method in smaller ones
 */
package fr.irisa.triskell.kermeta.launcher;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.log4j.util.LogConfigurationHelper;

import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.runtime.RuntimeObjectImpl;

/**
 * Launcher for Kermeta interpreter. It can be run from the command line or as a
 * test case for JUnit.
 */
public class InterpretedRunTestCase extends AbstractRunTestCase {

    /** Logger to get the error of this launcher */
    final static public Log internalLog = LogConfigurationHelper.getLogger("KMT.launcher");
    
    protected Interpreter interpreter = null;
    
    
    /**
     * 
     * @param themainClassValue
     * @param themainOperationValue
     * @param thecontainerTestSuite 
     * @param constraintExecution true if the interpreter much run with pre/post checking
     * @param isLastOfSerie true if this is the last of the test suite
     */
    public InterpretedRunTestCase(String themainClassValue, 
    		String themainOperationValue, AbstractRunJunitFactory thecontainerTestSuite, 
    		boolean constraintExecution,  boolean isFirstOfSerie, boolean isLastOfSerie)
    {
        super( themainClassValue, themainOperationValue, thecontainerTestSuite, constraintExecution, isFirstOfSerie, isLastOfSerie);
    }

    protected void setUp() throws java.lang.Exception {
        
        time = System.currentTimeMillis();
        
        nb_ro = RuntimeObjectImpl.getInstanceCounter();
        
        if (interpreter == null) {
            System.err.println("Memory before interpreter : " + Runtime.getRuntime().totalMemory());
            Map<String, Object> options = new HashMap<String, Object>();
            options.put( InterpreterOptions.MERGE, true);
            if ( constraintExecution )
            	interpreter = new Interpreter( containerTestSuite.getUnitToExecuteURI(), InterpreterMode.TEST_CONSTRAINT_RUN, options );
            else
            	interpreter = new Interpreter( containerTestSuite.getUnitToExecuteURI(), InterpreterMode.TEST_RUN, options );	
            interpreter.setErrorStream( System.out );
           	interpreter.setOutputStream( System.out );
           	interpreter.setInputStream( System.in );
           	System.err.println("Memory after interpreter : " + Runtime.getRuntime().totalMemory());
        }
        
        //interpreter.setEntryPoint(mainClassValue, mainOperationValue);

    }
    
    protected int nb_ro;
    protected long time;

    protected void tearDown() throws java.lang.Exception {
    	if(isLastOfSerie){
    		containerTestSuite.resetUnit();  // ask to free the memory of the unit
    	}
    	
        // not needed anymore now
        containerTestSuite = null;
       
        long total = Runtime.getRuntime().totalMemory();
        long max = Runtime.getRuntime().maxMemory();
        
        time = System.currentTimeMillis() - time;
        nb_ro = RuntimeObjectImpl.getInstanceCounter() - nb_ro;
        
        System.out.println("    ************************************************");
        System.out.println("    * Consumed memory : " + total + "/" + max);
        //System.out.println("    * #objects cached : " +  interpreter.memory.getNumberOfObjectCached());
        System.out.println("    * #ro created     : " + nb_ro);
        System.out.println("    * #ro total       : " + RuntimeObjectImpl.getInstanceCounter());
        System.out.println("    * time (ms)       : " + time);
        System.out.println("    ************************************************");
     //   if(isLastOfSerie){
        	interpreter = null;
     //   }
        
    }

    /**
     * This method is used for a kermeta program when it does not contain the
     * tag "testOperation". But when the tag "testOperation" is defined, it
     * means that we have to execute all the operation prefixed by
     * <code>test</code>. Otherwise, there should be a "mainOperation" to
     * launch (which name is defined in the <code>mainOperation</code> tag
     * @throws Exception 
     */
    public void runTest() throws KermetaRaisedException {
    	try {    		
    		interpreter.setEntryPoint(mainClassValue, mainOperationValue);
    		if(this.containerTestSuite._defaultpath !=  null) 
    			interpreter.setDefaultPath(this.containerTestSuite._defaultpath);
    		interpreter.launch();   		
    	} catch(KermetaRaisedException e){
    		// If this is a kermeta assertion that failed, then the Test must fail
    		fr.irisa.triskell.kermeta.language.structure.Class t_target=(fr.irisa.triskell.kermeta.language.structure.Class)e.raised_object.getMetaclass().getKCoreObject();        	
    		String exceptionTypeName = t_target.getTypeDefinition().getName();
    		if(exceptionTypeName.compareTo("AssertionFailedError") == 0){
    			fail(e.toString());
    		}
    		//	 otherwise it must be an error, so just forward the exception
    		else throw e;
    		
    	}
    }

}