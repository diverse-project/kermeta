

/*$Id: KpmApplication.java,v 1.1 2008-06-02 06:48:31 ftanguy Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	KpmApplication.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 08
* Authors : paco
*/

package org.kermeta.kpm.test;

import org.openembedd.tests.TestLauncher;
import org.openembedd.tests.TestWorkbenchAdvisor;

public class KpmApplication extends TestLauncher {

	public TestWorkbenchAdvisor getAdvisor() {
		// Eclipse default Java Perspective
		return new TestWorkbenchAdvisor("org.eclipse.jdt.ui.JavaPerspective");
	}

}


