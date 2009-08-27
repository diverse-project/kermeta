package org.kermeta.kompose.samples.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KomposeSpecializationUML2SampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {

		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.uml2.samples.zip", "org.kermeta.kompose.specialization.uml2.samples"));
		return projects;
	}
}