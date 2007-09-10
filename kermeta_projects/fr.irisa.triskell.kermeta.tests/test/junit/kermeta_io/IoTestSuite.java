/* $Id: IoTestSuite.java,v 1.1 2007-09-10 08:35:20 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : IoTestSuite.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 *        	Didier Vojtisek (dvojtise@irisa.fr)
 * Description : 
 *        	Kermeta Main TestSuite for io project
 */

package kermeta_io;

import junit.framework.TestResult;
import junit.framework.TestSuite;


/**
 * @author Didier Vojtisek
 * Kermeta Global TestSuite for io project
 */
public class IoTestSuite extends TestSuite {


	public IoTestSuite(String arg0) {
		super(arg0);

	    // INIT TYPE CHECKER
	  //  TypeCheckerContext.initializeTypeChecker(KermetaUnit.getStdLib());
	    this.addTest(new TestSuite(kermeta_io.constraintchecker_test.JunitTestSuite.class));
	    this.addTest(new TestSuite(kermeta_io.roundtrip_test.JunitTestSuite.class));
	    this.addTest(new TestSuite(kermeta_io.typechecker_test.JunitTestSuite.class));
	    this.addTest(new TestSuite(kermeta_io.test.JunitTestSuite.class));
	}
	
	public static void main(String args[]) { 
		IoTestSuite ioSuite = new IoTestSuite("");
		TestResult result = new TestResult();
		ioSuite.run(result);
		System.out.println(result.toString());
	}
	public void  testIo()
	{
		/*TestSuite suite= new TestSuite(kermeta_io.constraintchecker_test.JunitTestSuite.class);
		TestResult result = new TestResult();
		suite.run(result);*/ 
		//return result;
	}
	
	
}
