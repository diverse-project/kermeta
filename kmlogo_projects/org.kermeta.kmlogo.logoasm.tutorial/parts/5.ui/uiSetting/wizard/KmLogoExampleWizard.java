package org.kermeta.kmlogo.logoasm.ui.tools.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.kmlogo.logoasm.ui.Activator;

import fr.irisa.triskell.eclipse.wizard.AbstractExampleWizard;


public class KmLogoExampleWizard extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.ui", "zips/org.kermeta.kmlogo.logoasm.samples.zip", "org.kermeta.kmlogo.logoasm.samples"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		return Activator.getDefault();
	}
}