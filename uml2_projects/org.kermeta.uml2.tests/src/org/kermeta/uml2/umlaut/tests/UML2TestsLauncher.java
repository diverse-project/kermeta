package org.kermeta.uml2.umlaut.tests;

import org.openembedd.tests.TestLauncher;
import org.openembedd.tests.TestWorkbenchAdvisor;

public class UML2TestsLauncher extends TestLauncher {

	public TestWorkbenchAdvisor getAdvisor() {
		
		// Eclipse default Resource Perspective
		return new TestWorkbenchAdvisor("org.eclipse.ui.resourcePerspective");
		// Eclipse default Java Perspective
		//return new TestWorkbenchAdvisor("org.eclipse.jdt.ui.JavaPerspective");
	}
	
}
