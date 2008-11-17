package org.kermeta.kompose.samples.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KomposeSpecializationRDBSchemaSampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {

		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.rdbschema.zip", "org.kermeta.kompose.specialization.rdbschema"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.rdbschema.test.zip", "org.kermeta.kompose.specialization.rdbschema.test"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.rdbschema.samples.zip", "org.kermeta.kompose.specialization.rdbschema.samples"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples.ui", "zips/org.kermeta.kompose.specialization.rdbschema.ui.zip", "org.kermeta.kompose.specialization.rdbschema.ui"));
		return projects;
	}
}