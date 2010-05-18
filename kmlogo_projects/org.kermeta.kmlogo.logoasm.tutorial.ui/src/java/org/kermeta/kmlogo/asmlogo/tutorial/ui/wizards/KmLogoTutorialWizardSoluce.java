/* $Id: KmLogoTutorialWizard.java,v 1.3 2008-08-06 15:32:48 dvojtise Exp $
 * Project    : org.kermeta.kmlogo.tutorial
 * File       : AbstractExampleWizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA
 * -------------------------------------------------------------------
 * Creation date : May 29, 2006
 * Authors : 
 *    Didier Vojtisek
 */
package org.kermeta.kmlogo.asmlogo.tutorial.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.kmlogo.logoasm.tutorial.ui.Activator;

import fr.irisa.triskell.eclipse.wizard.AbstractExampleWizard;


public class KmLogoTutorialWizardSoluce
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.tutorial.zip", "org.kermeta.kmlogo.logoasm.tutorial"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.samples.zip", "org.kermeta.kmlogo.logoasm.samples"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.emftexteditor.zip", "org.kermeta.kmlogo.logoasm.emftexteditor"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.model.zip", "org.kermeta.kmlogo.logoasm.model"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.edit.zip", "org.kermeta.kmlogo.logoasm.edit"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.editor.zip", "org.kermeta.kmlogo.logoasm.editor"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.zip", "org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.srcKermeta.zip", "org.kermeta.kmlogo.logoasm.srcKermeta"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.ui.zip", "org.kermeta.kmlogo.logoasm.ui"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.ui.osspecific.zip", "org.kermeta.kmlogo.logoasm.ui.osspecific"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.ui.linux.x86.zip", "org.kermeta.kmlogo.logoasm.ui.linux.x86"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.ui.macosx.zip", "org.kermeta.kmlogo.logoasm.ui.macosx"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.logoasm.tutorial.ui", "zips/org.kermeta.kmlogo.logoasm.ui.win32.x86.zip", "org.kermeta.kmlogo.logoasm.ui.win32.x86"));
		return projects;
	}
	
	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}