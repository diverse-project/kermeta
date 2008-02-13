

/*$Id: CompilerTestSuite.java,v 1.6 2008-02-13 10:43:44 cfaucher Exp $
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

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.kermeta.compiler.tests.behavior.Comp_behaviorTestSuite;
import org.kermeta.compiler.tests.structure.Comp_structureTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Comp_structureTestSuite.class,
	Comp_behaviorTestSuite.class
})
public class CompilerTestSuite {

}


