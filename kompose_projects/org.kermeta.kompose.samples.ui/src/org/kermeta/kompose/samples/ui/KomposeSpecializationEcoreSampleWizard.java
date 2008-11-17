package org.kermeta.kompose.samples.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KomposeSpecializationEcoreSampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {

		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.ecore.zip", "org.kermeta.kompose.specialization.ecore"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.ecore.test.zip", "org.kermeta.kompose.specialization.ecore.test"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.ecore.samples.zip", "org.kermeta.kompose.specialization.ecore.samples"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.ecore.ui.zip", "org.kermeta.kompose.specialization.ecore.ui"));
		return projects;
	}
}