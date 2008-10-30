/* $Id: KermetaExampleWizard.java,v 1.2 2008-10-30 16:45:57 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : KermetaExampleWizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.tools.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import fr.irisa.triskell.eclipse.wizard.AbstractExampleWizard;
import fr.irisa.triskell.eclipse.wizard.AbstractExampleWizard.ProjectDescriptor;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;


@SuppressWarnings("unused")
public class KermetaExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("fr.irisa.triskell.kermeta", "zips/fr.irisa.triskell.kermeta.samples.zip", "fr.irisa.triskell.kermeta.samples"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return KermetaPlugin.getDefault();
	}
}