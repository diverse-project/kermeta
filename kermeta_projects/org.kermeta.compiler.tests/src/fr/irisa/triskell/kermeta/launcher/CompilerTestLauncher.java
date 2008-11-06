package fr.irisa.triskell.kermeta.launcher;

import org.openembedd.tests.TestLauncher;
import org.openembedd.tests.TestWorkbenchAdvisor;

public class CompilerTestLauncher  extends TestLauncher {
	public TestWorkbenchAdvisor getAdvisor() {
		// Eclipse default Java Perspective
		return new TestWorkbenchAdvisor("org.eclipse.jdt.ui.JavaPerspective");
	}
}