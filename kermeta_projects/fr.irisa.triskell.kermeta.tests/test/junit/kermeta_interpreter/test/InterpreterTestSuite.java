/* $Id: InterpreterTestSuite.java,v 1.2 2007-10-23 08:42:56 dvojtise Exp $
 * Project : Kermeta.tests
 * File : InterpreterTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Oct 2007
 * Authors : 
 * 		dvojtise@irisa.fr
 * Description :  	
 * 	JUnit4 launcher that encapsulate our previous JUnit3 test suites	 
 */
package kermeta_interpreter.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)  
@Suite.SuiteClasses({
	JunitTestSuite.class
})
public class InterpreterTestSuite { }
