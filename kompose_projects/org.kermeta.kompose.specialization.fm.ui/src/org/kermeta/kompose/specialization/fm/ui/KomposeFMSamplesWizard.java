package org.kermeta.kompose.specialization.fm.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KomposeFMSamplesWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {

		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.specialization.fm.ui", "zips/org.kermeta.kompose.specialization.fm.samples.zip", "org.kermeta.kompose.specialization.fm.samples"));
		return projects;
	}
}