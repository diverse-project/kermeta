

/*$Id: CompilerTestSuite.java,v 1.5 2008-02-06 12:55:19 cfaucher Exp $
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
import org.kermeta.compiler.tests.structure.Kcomp_structureTestSuite;
import org.kermeta.compiler.tests.behavior.Kcomp_behaviorTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Kcomp_structureTestSuite.class,
	Kcomp_behaviorTestSuite.class
})
public class CompilerTestSuite {

}


