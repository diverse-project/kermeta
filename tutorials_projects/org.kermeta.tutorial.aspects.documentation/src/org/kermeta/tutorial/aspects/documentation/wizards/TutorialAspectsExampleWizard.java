/* $Id: TutorialAspectsExampleWizard.java,v 1.1 2007-12-20 15:46:22 cfaucher Exp $
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : oct. 07
 * Authors       :
 * 		Cyril Faucher <cfaucher@irisa.fr> 
 * 		dvojtise <dvojtise.irisa.fr>
 */
package org.kermeta.tutorial.aspects.documentation.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.kermeta.tutorial.aspects.documentation.TutorialAspectsPlugin;


public class TutorialAspectsExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(TutorialAspectsPlugin.PROJECT_NAME, "zips/org.kermeta.tutorial.aspects.zip", "org.kermeta.tutorial.aspects"));
		return projects;
	}
}