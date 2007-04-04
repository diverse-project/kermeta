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
