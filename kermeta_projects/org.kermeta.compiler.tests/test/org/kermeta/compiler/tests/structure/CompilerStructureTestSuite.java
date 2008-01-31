

/*$Id: CompilerStructureTestSuite.java,v 1.1 2008-01-31 09:06:24 ftanguy Exp $
* Project : org.kermeta.compiler.tests
* File : 	CompilerStructureTestSuite.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package org.kermeta.compiler.tests.structure;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

@RunWith(Suite.class)
@Suite.SuiteClasses(
	{
		CompPackageUseCase.class
	}
)
public class CompilerStructureTestSuite {
}


