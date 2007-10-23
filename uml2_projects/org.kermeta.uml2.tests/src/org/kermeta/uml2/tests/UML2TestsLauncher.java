package org.kermeta.uml2.tests;

import org.openembedd.tests.TestLauncher;
import org.openembedd.tests.TestWorkbenchAdvisor;

public class UML2TestsLauncher extends TestLauncher {

	public TestWorkbenchAdvisor getAdvisor() {
		// Eclipse default Java Perspective
		return new TestWorkbenchAdvisor("org.eclipse.jdt.ui.JavaPerspective");
	}
	
}
