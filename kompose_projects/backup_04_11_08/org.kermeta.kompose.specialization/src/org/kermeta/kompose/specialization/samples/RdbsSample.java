package org.kermeta.kompose.specialization.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.kermeta.kompose.specialization.samples.AbstractExampleWizard.ProjectDescriptor;

public class RdbsSample extends AbstractExampleWizard {

	@Override
	protected Collection getProjectDescriptors() {
		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.specialization.samples", "zip/rdbschemaSample.zip", "org.kermeta.kompose.specialization.rdbschema"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.specialization.samples", "zip/rdbschemaSampleUse.zip", "org.kermeta.kompose.specialization.rdbschema.sampleuse"));
		return projects;
	}

}
