package fr.irisa.triskell.kermeta.kpm.actions.popup;

import org.eclipse.core.resources.IFolder;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class RequestTargetDirectory extends ContainerSelectionDialog {

	public RequestTargetDirectory(IFolder initialRoot) {
		super(new Shell(), initialRoot, false, "");
	}
	
	/*public RequestTargetDirectory (IShellProvider parentShell) {
		super(parentShell);
	}
	
	public RequestTargetDirectory (Shell parentShell) {
		super(parentShell);
	}*/
}
