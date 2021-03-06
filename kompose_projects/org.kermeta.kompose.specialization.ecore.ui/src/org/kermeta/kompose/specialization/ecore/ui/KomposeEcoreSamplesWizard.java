package org.kermeta.kompose.specialization.ecore.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KomposeEcoreSamplesWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {

		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.specialization.ecore.ui", "zips/org.kermeta.kompose.specialization.ecore.samples.zip", "org.kermeta.kompose.specialization.ecore.samples"));
		return projects;
	}
}