/* $Id: KmLogoTutorialWizard.java,v 1.1 2008-03-27 16:22:39 dvojtise Exp $
 * Project    : org.kermeta.kmlogo.tutorial
 * File       : AbstractExampleWizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA
 * -------------------------------------------------------------------
 * Creation date : May 29, 2006
 * Authors : 
 *    Didier Vojtisek
 */
package org.kermeta.kmlogo.tutorial.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class KmLogoTutorialWizard
	extends AbstractExampleWizard {
	
	protected Collection getProjectDescriptors() {
		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List projects = new ArrayList(1);
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.tutorial", "zips/fr.irisa.triskell.kmlogo.model.zip", "fr.irisa.triskell.kmlogo.model"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.tutorial", "zips/fr.irisa.triskell.kmlogo.model.edit.zip", "fr.irisa.triskell.kmlogo.model.edit"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.tutorial", "zips/fr.irisa.triskell.kmlogo.model.editor.zip", "fr.irisa.triskell.kmlogo.model.editor"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.tutorial", "zips/fr.irisa.triskell.kmlogo.ui.zip", "fr.irisa.triskell.kmlogo.ui"));
		projects.add(new ProjectDescriptor("org.kermeta.kmlogo.tutorial", "zips/org.kermeta.kmlogo.texteditor.zip", "org.kermeta.kmlogo.texteditor"));
		return projects;
	}
}