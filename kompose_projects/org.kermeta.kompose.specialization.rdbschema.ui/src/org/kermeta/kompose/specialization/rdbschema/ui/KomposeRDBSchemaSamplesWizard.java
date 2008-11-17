package org.kermeta.kompose.specialization.rdbschema.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KomposeRDBSchemaSamplesWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {

		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.specialization.rdbschema.ui", "zips/org.kermeta.kompose.specialization.rdbschema.samples.zip", "org.kermeta.kompose.specialization.rdbschema.samples"));
		return projects;
	}
}