package fr.irisa.triskell.sintaks.samples.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class SintaksSampleExampleWizard extends AbstractExampleWizard {
	
	protected Collection getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("fr.irisa.triskell.sintaks", "samples/fr.irisa.triskell.sintaks.samples.zip", "fr.irisa.triskell.sintaks.samples"));
		return projects;
	}
}