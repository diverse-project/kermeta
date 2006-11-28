package fr.irisa.triskell.kermeta.tools.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KermetaExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("fr.irisa.triskell.kermeta", "zips/fr.irisa.triskell.kermeta.samples.zip", "fr.irisa.triskell.kermeta.samples"));
		return projects;
	}
}