package org.openembedd.logo.csm.tutorial.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.openembedd.logo.csm.tutorial.LogoCSMDemoPlugin;

import fr.irisa.triskell.eclipse.wizard.AbstractExampleWizard;



public class LogoCSMDemoSampleWizard extends AbstractExampleWizard
{

	protected Collection<ProjectDescriptor> getProjectDescriptors()
	{

		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(7);
		projects.add(new ProjectDescriptor("org.openembedd.logo.csm.tutorial", "zip/org.openembedd.logo.csm.zip",
			"org.openembedd.logo.csm"));
		projects.add(new ProjectDescriptor("org.openembedd.logo.csm.tutorial",
			"zip/org.openembedd.logo.csm.diagram.block.zip", "org.openembedd.logo.csm.diagram.block"));
		projects.add(new ProjectDescriptor("org.openembedd.logo.csm.tutorial", "zip/org.openembedd.logo.csm.edit.zip",
			"org.openembedd.logo.csm.edit"));
		projects.add(new ProjectDescriptor("org.openembedd.logo.csm.tutorial",
			"zip/org.openembedd.logo.csm.editor.zip", "org.openembedd.logo.csm.editor"));
		projects.add(new ProjectDescriptor("org.openembedd.logo.csm.tutorial",
			"zip/org.openembedd.logo.csm.modeler.zip", "org.openembedd.logo.csm.modeler"));
		projects.add(new ProjectDescriptor("org.openembedd.logo.csm.tutorial",
			"zip/org.openembedd.logo.csm.translator.zip", "org.openembedd.logo.csm.translator"));
		projects.add(new ProjectDescriptor("org.openembedd.logo.csm.tutorial", "zip/org.openembedd.logo.csm.ui.zip",
			"org.openembedd.logo.csm.ui"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		return LogoCSMDemoPlugin.getDefault();
	}
}
