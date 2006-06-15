/* $Id: RunTestCase.java,v 1.8 2006-06-15 07:33:56 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : RunTestCase.java
 * License : GPL
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

import junit.framework.TestCase;

import org.apache.log4j.Logger;

import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Launcher for Kermeta interpreter. It can be run from the command line or as a
 * test case for JUnit.
 */
public class RunTestCase extends TestCase {

    /** Logger to get the error of this launcher */
    final static public Logger internalLog = LogConfigurationHelper.getLogger("KMT.launcher");

    private String mainClassValue;
    private String mainOperationValue;

    private RunJunitFactory containerTestSuite;
    
    private static KermetaInterpreter interpreter = null;

    public RunTestCase(String themainClassValue, String themainOperationValue, RunJunitFactory thecontainerTestSuite)

    {
        super(themainClassValue + "." + themainOperationValue);
        mainClassValue = themainClassValue;
        mainOperationValue = themainOperationValue;
        containerTestSuite = thecontainerTestSuite;
    }

    protected void setUp() throws java.lang.Exception {
        
        time = System.currentTimeMillis();
        
        nb_ro = RuntimeObject.getInstanceCounter();
        
        if (interpreter == null) {
            System.err.println("Memory before interpreter : " + Runtime.getRuntime().totalMemory());
            interpreter = new KermetaInterpreter(containerTestSuite.root_unit);
            System.err.println("Memory after interpreter : " + Runtime.getRuntime().totalMemory());
        }
        
        interpreter.setEntryPoint(mainClassValue, mainOperationValue);

    }
    
    protected int nb_ro;
    protected long time;

    protected void tearDown() throws java.lang.Exception {
        // not needed anymore now
        containerTestSuite = null;
       
        //Runtime.getRuntime().gc();
        
        long total = Runtime.getRuntime().totalMemory();
        long max = Runtime.getRuntime().maxMemory();
        
        time = System.currentTimeMillis() - time;
        nb_ro = RuntimeObject.getInstanceCounter() - nb_ro;
        
        System.out.println("    ************************************************");
        System.out.println("    * Consumed memory : " + total + "/" + max);
        System.out.println("    * #objects cached : " +  interpreter.memory.getNumberOfObjectCached());
        System.out.println("    * #ro created     : " + nb_ro);
        System.out.println("    * #ro total       : " + RuntimeObject.getInstanceCounter());
        System.out.println("    * time (ms)       : " + time);
        System.out.println("    ************************************************");
        
       
        
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
    	try{
    		interpreter.launch();
    	}
    	catch(KermetaRaisedException e){
    		// If this is a kermeta assertion that failed, then the Test must fail
    		fr.irisa.triskell.kermeta.language.structure.Class t_target=(fr.irisa.triskell.kermeta.language.structure.Class)e.raised_object.getMetaclass().getData().get("kcoreObject");        	
    		String exceptionTypeName = t_target.getTypeDefinition().getName();
    		if(exceptionTypeName.compareTo("AssertionFailedError") == 0){
    			fail(e.toString());
    		}
    		//	 otherwise it must be an error, so just forward the exception
    		else throw e;
    		
    	}
    }

}