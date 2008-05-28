

/*$Id: MainTest.java,v 1.1 2008-05-28 11:33:28 ftanguy Exp $
* Project : org.kermeta.kpm.test
* File : 	MainTest.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 mai 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.kpm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class MainTest extends TestSuite {

	public MainTest(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
	}
	
	public static Test suite() {
		TestSuite suite = new MainTest("Kpm Tests");
		suite.addTestSuite( NameFilterHelperTest.class );
		suite.addTest( KpmTests.suite() );
		return suite;
	}
	
}


