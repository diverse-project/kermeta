package org.kermeta.kpm.ui.preferences;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.kermeta.jface.preference.HelpfulTextFieldEditor;
import org.kermeta.kpm.KPMPlugin;
import org.kermeta.kpm.KpmManager;
import org.kermeta.kpm.preferences.PreferenceConstants;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class KPMPreferencePage
	extends PreferencePage implements
	IWorkbenchPreferencePage   {
	
	public static Image RED_CROSS = ImageDescriptor.createFromFile(KPMPreferencePage.class, "/icons/red_cross.jpg").createImage();

	
	public KPMPreferencePage() {
		super();
		setPreferenceStore(KPMPlugin.getDefault().getPreferenceStore());
	}
	
	HelpfulTextFieldEditor excludedExtensionTextField;
	HelpfulTextFieldEditor includedExtensionTextField;
	
	@Override
	protected Control createContents(Composite parent) {
		Composite top = new Composite(parent, SWT.LEFT);

		// Sets the layout data for the top composite's 
		// place in its parent's layout.
		GridLayout topLayout = new GridLayout();
		topLayout.numColumns = 1;
		top.setLayout(topLayout);
		//top.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		

		//  ------------- Group 1 ---------------------------		
		Group group = new Group(parent, SWT.NONE);
		group.setText("KPM Analysis and Recovering");
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.makeColumnsEqualWidth = true;
		group.setLayout( layout );
		

		Canvas canvas = new Canvas(group, SWT.NONE);
	    canvas.addPaintListener(new PaintListener() {
	      public void paintControl(PaintEvent e) {
	        e.gc.drawImage(KPMPreferencePage.RED_CROSS, 0, 0);
	      }
	    });
		
		Button resetButton;
		resetButton = new Button(group, SWT.PUSH);
		resetButton.setText("Reset KPM");
		resetButton.setToolTipText("This will erase KPM internal data and proceed to a new workspace evaluation");
		resetButton.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					perfomKPMReset();
				}
			} 
		);
		
		Label l = new Label(group, SWT.NONE);
		l.setText("Open KPM configuration file");
		Button openKPMeditorButton;
		openKPMeditorButton = new Button(group, SWT.PUSH);
		openKPMeditorButton.setText("Open");
		openKPMeditorButton.setToolTipText("This will open an editor with the current KPM configuation. \nThis editor is not synchronized with Eclipse. \n" +
				"Ie. it is not updated automatically and the refresh button may not work (only close and reopen will work)\n" +
				"You should also consider it as readonly. ");
		openKPMeditorButton.addSelectionListener( 
			new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					performOpenKPMEditor();
				}
			} 
		);

		//  ------------- Group 2 ---------------------------
		Group group2 = new Group(parent, SWT.FILL); 
		group2.setText("KPM general configuration");
		/*GridLayout group2Layout = new GridLayout();
		layout.numColumns = 1;
		group2.setLayout( group2Layout );*/
		GridData gridData2 = new GridData();
		gridData2.widthHint = 450;
		gridData2.heightHint = 200;
		group2.setLayoutData(gridData2);
		
		Font font = new Font(this.getShell().getDisplay(), "Courier", 8, SWT.NORMAL);
		includedExtensionTextField = new HelpfulTextFieldEditor(PreferenceConstants.P_INCLUDED_EXTENSIONS, "&Included for automatic typecheck:\none line per pattern\n(* = any string, ? = any character)", group2);		
		includedExtensionTextField.getTextControl(group2).setFont(font);
		includedExtensionTextField.setToolTipText("Only files with these extensions will be automatically typechecked");
		includedExtensionTextField.setPage(this);
		includedExtensionTextField.setPreferenceStore(getPreferenceStore());
		includedExtensionTextField.load();
		
		excludedExtensionTextField = new HelpfulTextFieldEditor(PreferenceConstants.P_EXCLUDED_EXTENSIONS, "&Excluded extension:\none line per pattern\n(* = any string, ? = any character)", group2);		
		excludedExtensionTextField.getTextControl(group2).setFont(font);
		excludedExtensionTextField.setToolTipText("Files with these extensions will be ignored by KPM");
		excludedExtensionTextField.setPage(this);
		excludedExtensionTextField.setPreferenceStore(getPreferenceStore());
		excludedExtensionTextField.load();
		
		return parent;
	}

	/**
	 * Do the actual work of cleaning kpm file and reset it
	 */
	protected void perfomKPMReset(){
		KpmManager.getDefault().resetKPM();
		
	}
	
	
	/**
	 * Open an editor on KPM configuration
	 */
	protected void performOpenKPMEditor(){
		String fileUri = KpmManager.getDefault().getKpm().eResource().getURI().toFileString();
		//String fileUri = "platform:/resource/.metadata/.plugins/org.kermeta.kpm/main.kpm";
		
		// create a project external files in order to have a linked resource to the file we want to open
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject project = ws.getRoot().getProject("External Files");
		try {
			if (!project.exists())
			   project.create(null);
			if (!project.isOpen())
			   project.open(null);
			/* Shell shell = window.getShell();
			String name = new FileDialog(shell, SWT.OPEN).open(); 
			if (name == null)
			   return;*/
			
			
			IPath location = new Path(fileUri);
			IFile file = project.getFile(location.lastSegment());
			if(!file.exists())
				file.createLink(location, IResource.NONE, null);
		
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			if (page != null)
				IDE.openEditor(page, file);
		} catch (CoreException e) {
			KPMPlugin.logErrorMessage("Cannot open editor for " + fileUri, e);
		}
	}
	
	@Override
	protected void performDefaults() {
		excludedExtensionTextField.loadDefault();
		super.performDefaults();
	}

	@Override
	public boolean performOk() {
		excludedExtensionTextField.store();

		return super.performOk();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}