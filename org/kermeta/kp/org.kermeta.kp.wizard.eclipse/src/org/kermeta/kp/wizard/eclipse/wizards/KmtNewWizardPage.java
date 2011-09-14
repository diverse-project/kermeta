package org.kermeta.kp.wizard.eclipse.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.internal.ide.misc.ContainerSelectionGroup;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (kmt).
 */

public class KmtNewWizardPage extends WizardPage {
	private Text containerText;

	private Text fileText;

	private IStructuredSelection selection;

	private Composite linkedResourceParent;
    private Button advancedButton;
    public static final int GRID_DATA_WIDTH = 150;
    public String defaultPackageString = "root_package";
    public static final String defaultClassString = "Main";
    public static final String defaultOperationString = "main";
    private Text packageText;
    private Text mainClassText;
    private Text mainOperationText;
    private Group advancedGroup;
	
	private static final int SIZING_CONTAINER_GROUP_HEIGHT = 250;
	
	
	/** The widget for path selection */
	protected ContainerSelectionGroup containerGroup;
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public KmtNewWizardPage(IStructuredSelection selection) {
		super("wizardPage");
		setTitle("New Kermeta File");
		setDescription("This wizard creates a new file with *.kmt extension that can be opened by a multi-page editor.");
		this.selection = selection;
		setDefaultPackageName();
	}
	
	/**
	 * Sets the package name from the selection.
	 * The name is the container path without the project name, without the src and/or kermeta folder.
	 * @param container
	 */
	private void setDefaultPackageName() {
		if ( selection.getFirstElement() instanceof IContainer ) {
			IContainer container = (IContainer) selection.getFirstElement();
			String s = container.getFullPath().toString();
			s = s.replace( container.getProject().getFullPath().toString(), "" );
			if ( s.startsWith("/") )
				s = s.replaceFirst("/", "");
			if ( s.startsWith("src/") )
				s = s.replaceFirst("src/", "");
			if ( s.startsWith("kermeta/") )
				s = s.replaceFirst("kermeta/", "");
			if ( ! s.equals("kermeta") && ! s.equals("src") && ! s.equals("") ) {
				s = s.replace("/", "::");
				defaultPackageString = s;			
			}
		}
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}
		fileText.setText("new_file.kmt");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		String fileName = getFileName();

		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("kmt") == false) {
				updateStatus("File extension must be \"kmt\"");
				return;
			}
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	/**
     * @return Returns the mainClassText.
     */
    public Text getMainClassText() {  return mainClassText;}
    public String getMainClassTextString() {  return mainClassText.getText();}
    
	
	public String getPackageTextString() { return packageText.getText();}
	
	public String getContainerName() {
		return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
	
	/**
     * @return Returns the mainOperationText.
     */
    public Text getMainOperationText() { return mainOperationText;}
    public String getMainOperationTextString() { return mainOperationText.getText();}
    
	
}