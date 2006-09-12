package fr.irisa.triskell.kermeta.samples.fsm.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class FsmSampleExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("fr.irisa.triskell.kermeta.samples.fsm.core", "zips/fr.irisa.triskell.kermeta.samples.fsm.demo.zip", "fr.irisa.triskell.kermeta.samples.fsm.demo"));
		return projects;
	}
}