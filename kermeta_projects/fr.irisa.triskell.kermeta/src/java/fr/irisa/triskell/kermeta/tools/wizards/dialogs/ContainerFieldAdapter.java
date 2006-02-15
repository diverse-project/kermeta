package fr.irisa.triskell.kermeta.tools.wizards.dialogs;

import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IStringButtonAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;

import fr.irisa.triskell.kermeta.tools.wizards.Kermeta2EcoreResolveWizardPage;

/**
 * FIXME not needed
 * Copied from jdt sources.
 * @see org.eclipse.jdt.ui.wizards.NewContainerWizardPage
 */
public class ContainerFieldAdapter implements IStringButtonAdapter, IDialogFieldListener {
	
	protected Kermeta2EcoreResolveWizardPage page;
	
	public ContainerFieldAdapter(Kermeta2EcoreResolveWizardPage p) 
	{
		page = p;
	}
	
	// -------- IStringButtonAdapter
	public void changeControlPressed(DialogField field) {
		// actually it cannot be another type than StringDialogField.
		StringDialogField f = (StringDialogField)field;
		//ecoreGenerationDirectory = 
		page.getWizhelper().handleBrowseFolders(f);
		page.setEcoreFolder(f.getText());
	}
	// -------- IDialogFieldListener
	public void dialogFieldChanged(DialogField field) {
		String input = ((StringDialogField)field).getText();
		page.setEcoreFolder(input);
		if (page.getIPathFromString(input)!=null) page.setProblemType(page.NONE);
		else page.setProblemType(page.INVALID_FIELD);
		page.setPageComplete(page.validatePage());
	}
	
}