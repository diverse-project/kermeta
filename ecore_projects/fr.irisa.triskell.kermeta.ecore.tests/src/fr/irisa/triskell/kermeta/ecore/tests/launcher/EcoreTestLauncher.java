package fr.irisa.triskell.kermeta.ecore.tests.launcher;

import org.openembedd.tests.TestLauncher;
import org.openembedd.tests.TestWorkbenchAdvisor;

public class EcoreTestLauncher  extends TestLauncher {
	public TestWorkbenchAdvisor getAdvisor() {
		// Eclipse default Java Perspective
		return new TestWorkbenchAdvisor("org.eclipse.jdt.ui.JavaPerspective");
	}
}