/* $Id: TestJavaCall.java,v 1.1 2005-04-20 12:46:49 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : TestJavaCall.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 18 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        see javadoc  
 */
package fr.irisa.triskell.kermeta.interpreter.test;

import org.apache.log4j.Logger;

import junit.framework.TestCase;
import fr.irisa.triskell.kermeta.launcher.Run;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Void;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Implementation of the java prt for a JavaCall from Kermeta
 * @author dvojtise
 *
 */
public class TestJavaCall extends TestCase{
    final static public Logger internalLog = LogConfigurationHelper.getLogger("test.JavaCall");
	
    static private int callCounter = 0;
    static private int lastCallCounter = 0;
    
    /**  Implementation of method simple called as : <br>
	 * extern fr::irisa::triskell::kermeta::interpreter::test::TestJavaCall.simpleCall();
	 */
    public static void simpleCall() {
        internalLog.info("simpleCall was called");
        callCounter++;
	}
    
    public static RuntimeObject callBooleanReturn() {
        internalLog.info("callBooleanReturn was called");

        callCounter++;
        return fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.create(true);
	}
    public static RuntimeObject callIntegerReturn() {
        internalLog.info("callIntegerReturn was called");
        //  Long way
        // RuntimeObject result = Run.koFactory.createObjectFromClassName("kermeta::standard::Integer");
        // fr.irisa.triskell.kermeta.runtime.basetypes.Integer.setValue(result, 777);
        // return result;
        
        // short way
        callCounter++;
        return fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(777,Run.koFactory);
	}

    public static RuntimeObject callStringReturn() {
        internalLog.info("callStringReturn was called");
        callCounter++;
        return fr.irisa.triskell.kermeta.runtime.basetypes.String.create("Hello world",Run.koFactory);
	}
    
    public static RuntimeObject callCollectionReturn() {
        internalLog.info("simpleCallReturn was called");
        return Void.VOID;
	}
    
    public static RuntimeObject callSetReturn() {
        internalLog.info("simpleCallReturn was called");
        return Void.VOID;
	}

    public static void callOneParam() {
        internalLog.info("simpleCall was called");
	}
    
    public static void callOneCollectionParam() {
        internalLog.info("simpleCall was called");
	}
    public static void callOneSetParam() {
        internalLog.info("simpleCall was called");
	}
    
    public static void callTwoParams() {
        internalLog.info("simpleCall was called");
	}
    
    public static void callOneParamAndReturn() {
        internalLog.info("simpleCall was called");
	}
    
    
    /**  Implementation of method assertMethodWasCalled called as : <br>
	 * extern fr::irisa::triskell::kermeta::interpreter::test::TestJavaCall.simpleCall();
	 * It raises an assertion if the CallCounter was not incremented since previous call
	 */
	public static void assertMethodWasCalled() {
		assertTrue("Method was not called (callCounter="+callCounter+"; lastcallCounter="+lastCallCounter+")", callCounter > lastCallCounter);
		lastCallCounter = callCounter;
	}
}
