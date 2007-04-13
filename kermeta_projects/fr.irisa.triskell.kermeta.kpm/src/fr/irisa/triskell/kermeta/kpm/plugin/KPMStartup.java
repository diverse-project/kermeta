/*$Id: KPMStartup.java,v 1.2 2007-04-13 14:45:12 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.plugin;

import org.eclipse.ui.IStartup;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.kpm.builder.WorkspaceChangeListener;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaWorkspace;

public class KPMStartup implements IStartup {

	public void earlyStartup() {
		ResourceHelper.workspace.addResourceChangeListener(new WorkspaceChangeListener() );
		KermetaWorkspace.getInstance();
	}

}
