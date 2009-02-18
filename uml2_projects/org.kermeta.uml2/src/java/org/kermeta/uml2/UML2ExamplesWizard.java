package org.kermeta.uml2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openembedd.wizards.AbstractNewExampleWizard;


public class UML2ExamplesWizard
	extends AbstractNewExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.uml2.samples", "zip/org.kermeta.uml2.samples.zip", "org.kermeta.uml2.samples"));
		return projects;
	}
}