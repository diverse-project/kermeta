/**
 * 
 */
package fr.irisa.triskell.sintaks.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.internal.ide.misc.ResourceAndContainerGroup;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.sintaks.SintaksPlugin;

/**
 * @author dtouzet
 *
 */
public class SintaksDestFileWizardPage extends DestFileWizardPage {

	/**
	 * @param pageName
	 * @param selection
	 */
	public SintaksDestFileWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setPageComplete(false);
		this.currentSelection = selection;
	}
	
	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.tools.wizards.DestFileWizardPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		// top level group
		topLevel = new Composite(parent,SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(
			GridData.VERTICAL_ALIGN_FILL | GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		//WorkbenchHelp.setHelp(topLevel, IHelpContextIds.NEW_FILE_WIZARD_PAGE);
		
		createPreControls(topLevel);
		
		// Resource and container group
		resourceGroup = new ResourceAndContainerGroup(topLevel, this, getNewFileLabel(), 
				SintaksPlugin.getResourceString("Sintaks.NEWFILE"), false, SIZING_CONTAINER_GROUP_HEIGHT); //$NON-NLS-1$
		resourceGroup.setAllowExistingResources(false);
		initialPopulateContainerNameField();
		createFileExistsBehaviorControls(topLevel);
		createAdvancedControls(topLevel);
		
		createControls(topLevel);
		
		if (initialFileName != null)
			resourceGroup.setResource(initialFileName);
		
		// Show description on opening
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
		validatePage();
	}
	
	protected Group sMdlSelectGrp;
	protected Label sMdlLbl;
	protected Text sMdlText;
	protected Button sMdlSelectBtn;
	private String syntacticModel;
	
	/**
	 * @param parent
	 */
	protected void createControls(Composite parent) {
		Font font = parent.getFont();

		sMdlSelectGrp = new Group(parent, SWT.NONE);
		GridLayout sMdlLayout = new GridLayout(4, false);
		sMdlSelectGrp.setLayout(sMdlLayout);
		sMdlSelectGrp.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		sMdlSelectGrp.setFont(font);
		sMdlSelectGrp.setText("Syntactic model selection:");
		
		//sMdlLbl = new Label(sMdlSelectGrp, SWT.NULL);
		sMdlLbl = new Label(sMdlSelectGrp, SWT.LEFT);
		sMdlLbl.setText("Syntactic model: ");
		
		sMdlText = new Text(sMdlSelectGrp, SWT.SINGLE | SWT.BORDER);
		sMdlText.setText(syntacticModel);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		sMdlText.setLayoutData( gridData );
		
		sMdlSelectBtn = new Button(sMdlSelectGrp, SWT.PUSH);
		sMdlSelectBtn.setText("Browse");
		sMdlSelectBtn.setAlignment(SWT.RIGHT);
		sMdlSelectBtn.addSelectionListener(
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					String text = handleBrowseButtonSelect();
					sMdlText.setText(text);
				}
			}
		);
	}
	

	/**
	 * @return
	 */
	protected String handleBrowseButtonSelect() {
		String resultFile = null;
		
		/*ResourceSelectionDialog rsDlg =
			new ResourceSelectionDialog(
					getShell(),
					ResourcesPlugin.getWorkspace().getRoot(),
					null);*/
		
		SintaksModelSelectionDialog rsDlg =
		new SintaksModelSelectionDialog(
				getShell(),
				ResourcesPlugin.getWorkspace().getRoot(),
				null);
		
		if (rsDlg.open() == ResourceSelectionDialog.OK)	{
			Object[] results = rsDlg.getResult();
			if (results != null) {
			    // Get only the first selected file / TODO : forbid multi-selection
			    if (results[0] instanceof IFile)
			        resultFile = ((IFile) results[0]).getFullPath().toString();
			    else if ( results[0] instanceof SintaksFile )
			    	resultFile = ((SintaksFile) results[0]).getFilePath(); 
			}
		}
		return resultFile;
	}


	/**
	 * @return
	 */
	protected String getSMdlText() {
		return sMdlText.getText();
	}

	
	/**
	 * should be called before activation of the wizard to propose previous file
	 */
	protected void setSMdlText(String text) {
		syntacticModel = text;
	}

	
	/**
	 * @return
	 */
	public IFile getSMdlFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile( new Path(getSMdlText()) );
	}

}
