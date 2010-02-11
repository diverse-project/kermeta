/* $Id: FsmSampleExampleWizard.java,v 1.9 2007-12-04 18:19:41 cfaucher Exp $
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : oct. 07
 * Authors       :
 * 		Cyril Faucher <cfaucher@irisa.fr> 
 * 		dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.samples.fsm.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.irisa.triskell.kermeta.samples.fsm.FsmPlugin;


public class FsmSampleExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		
		System.out.println("Debug - enter in the wizard");
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		//projects.add(new ProjectDescriptor(FsmPlugin.PROJECT_NAME, "zips/fr.irisa.triskell.kermeta.samples.fsm.demo.zip", "fr.irisa.triskell.kermeta.samples.fsm.demo"));
		projects.add(new ProjectDescriptor(FsmPlugin.PROJECT_NAME, "zips/fr.irisa.triskell.kermeta.samples.fsm.demoAspect.zip", "fr.irisa.triskell.kermeta.samples.fsm.demoAspect"));
		return projects;
	}
}