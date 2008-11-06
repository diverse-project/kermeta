

/*$Id: CompiledCodeBehaviorTestSuite.java,v 1.1 2008-11-06 16:02:37 dvojtise Exp $
* Project : org.kermeta.compiler.tests
* File : 	CompilerTestSuite.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco Francois Tanguy <ftanguy@irisa.fr>
* 			Cyril Faucher <cfaucher@irisa.fr>
* 
* This class registers the test suite dedicated to the Kermeta compiler like the structure and behavior parts
*/

package org.kermeta.compiler.tests;

import kermeta_compiler.test.JunitTestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	JunitTestSuite.class
})
public class CompiledCodeBehaviorTestSuite {

}


