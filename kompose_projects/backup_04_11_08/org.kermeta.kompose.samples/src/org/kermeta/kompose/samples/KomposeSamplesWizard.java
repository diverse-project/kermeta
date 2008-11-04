package org.kermeta.kompose.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KomposeSamplesWizard
	extends AbstractExampleWizard {
	
	protected Collection getProjectDescriptors() {

		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("org.kermeta.kompose.samples", "zip/KomposeSamples.zip", "KomposeSamples"));
		return projects;
	}
}