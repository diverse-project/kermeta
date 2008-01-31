

/*$Id: CompilerTestSuite.java,v 1.2 2008-01-31 14:30:08 cfaucher Exp $
* Project : org.kermeta.compiler.tests
* File : 	CompilerTestSuite.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package org.kermeta.compiler.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.kermeta.compiler.tests.structure.Kcomp_structureTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	Kcomp_structureTestSuite.class
})
public class CompilerTestSuite {

}


