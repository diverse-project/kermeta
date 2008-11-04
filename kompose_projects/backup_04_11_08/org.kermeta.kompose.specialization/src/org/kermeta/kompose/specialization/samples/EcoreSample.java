package org.kermeta.kompose.specialization.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class EcoreSample extends AbstractExampleWizard {

	@Override
	protected Collection getProjectDescriptors() {
		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.specialization.samples", "zip/ecoreSample.zip", "org.kermeta.kompose.specialization.ecore.uno"));
		projects.add(new ProjectDescriptor("org.kermeta.kompose.specialization.samples", "zip/ecoreSampleUse.zip", "org.kermeta.kompose.specialization.ecore.sampleuse"));
		return projects;
	}

}
