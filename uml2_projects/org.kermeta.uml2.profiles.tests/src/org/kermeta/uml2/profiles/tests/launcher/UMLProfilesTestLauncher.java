package org.kermeta.uml2.profiles.tests.launcher;

import org.openembedd.tests.TestLauncher;
import org.openembedd.tests.TestWorkbenchAdvisor;

public class UMLProfilesTestLauncher  extends TestLauncher {
	public TestWorkbenchAdvisor getAdvisor() {
		// Eclipse default Java Perspective
		return new TestWorkbenchAdvisor("org.eclipse.jdt.ui.JavaPerspective");
	}
}