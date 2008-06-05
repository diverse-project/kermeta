/* $Id: KermetaNewFileWizardPage.java,v 1.2 2008-06-05 14:52:11 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaNewFileWizardPage.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2005
 * Authors: 
 * 			zdrey
 * 			dvojtise
 * Notes :
 * 	This file was primarily generated by Eclipse plug-in helper
 */

package fr.irisa.triskell.kermeta.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.internal.ide.misc.ContainerSelectionGroup;

/**
 * The "New" wizard page allows setting the container for
 * the new file as well as the file name. The page
 * will only accept file name without the extension OR
 * with the extension that matches the expected one (kmt).
 */


public class KermetaNewFileWizardPage extends WizardPage implements Listener
{

    // TODO : extends this class with 'WizardNewFileCreationPage'
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
    // This attribute exists in WizardNewFileCreationPage, but private :(
    //protected ResourceAndContainerGroup resourceGroup;
    
	private static final int SIZING_CONTAINER_GROUP_HEIGHT = 250;
	
	protected ResourceHandler resourceHandler;
	/** The widget for path selection */
	protected ContainerSelectionGroup containerGroup;
	
	/**
	 * Constructor for SampleNewWizardPage.
	 * @param pageName
	 */
	public KermetaNewFileWizardPage(IStructuredSelection selection) {
		super("wizardPage");
		resourceHandler = new ResourceHandler();
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
	 * Create the layout of the project page
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createSimpleControl(Composite parent) {
	    
		Composite container = new Composite(parent, SWT.NULL);

	    Composite groupcontainer = new Group(container, SWT.NULL);
	    GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;
		
	    
		layout = new GridLayout(2, false);
		groupcontainer.setLayout(layout);
		layout.makeColumnsEqualWidth = false;
		layout.verticalSpacing = 9;
		
		Label label = new Label(groupcontainer, SWT.NULL);
		label.setText("&File name:");

		fileText = new Text(groupcontainer, SWT.BORDER | SWT.SINGLE);
		//GridData.FILL_HORIZONTAL
		GridData gd = new GridData();
		gd.widthHint = 350;
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		

		/* Create the resource browser */
		containerGroup = new ContainerSelectionGroup(container,
		        this, true, null, true); 


		createFillTemplateFileWindow(container);
				
		initialize();
		dialogChanged();
		setControl(container);

	
	}

	
    /**
     * This is a copy of createControl of super class, extended in order to add
     * a specific group for default folders (src/lib)
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent)
    {
        createSimpleControl(parent);
    }
	/**
	 * Tests if the current workbench selection is a suitable
	 * container to use.
	 */
	
	private void initialize() {
		if (selection!=null && selection.isEmpty()==false && selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection)selection;
			if (ssel.size()>1) return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer)obj;
				else
					container = ((IResource)obj).getParent();
				containerGroup.setSelectedContainer(container);
			}
		}
		fileText.setText("new_file.kmt");
	}
	
	/**
	 * Uses the standard container selection dialog to
	 * choose the new value for the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog =
			new ContainerSelectionDialog(
				getShell(),
				ResourcesPlugin.getWorkspace().getRoot(),
				false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path)result[0]).toOSString());
			}
		}
	}
	
	
	
	
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		String fileName =  getFilename();//page.getFileName();

		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		
		if (containerGroup!=null)
		{
		    boolean valid = resourceHandler.validateControls(
		            containerGroup, fileName, containerGroup.getContainerFullPath());
		    if (!valid)
		    {
		        updateStatus(resourceHandler.getProblemMessage());
		    	return;
		    }
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
     * Create a window that propose to the user the specification of a 
     * root package, a main class, and a main method.
     */
    protected void createFillTemplateFileWindow(Composite parent)
    {
        Font font = parent.getFont();
        // Advanced group
        advancedGroup = new Group(parent, SWT.NONE);
        GridLayout layout = new GridLayout(2,false);
        advancedGroup.setLayout(layout);
        advancedGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        advancedGroup.setFont(font);
        advancedGroup.setText("Set default folders"); //$NON-NLS-1$
        // Create the pacakge, class, operation fields
        createLabel(advancedGroup, "Root package ", true, font);
        packageText = createText(advancedGroup, true, font, defaultPackageString);
        createLabel(advancedGroup, "Main class ", true, font);
        mainClassText = createText(advancedGroup, true, font, defaultClassString);
        createLabel(advancedGroup, "Main operation ", true, font);
        mainOperationText = createText(advancedGroup, true, font, defaultOperationString);
    }
	
	
	
  
    /**
     * Create the text field for the Root package.
     * Also sets a default value for this root package.
     * @param parent
     */
    protected Label createLabel(Group advancedGroup, String label, boolean enabled, Font font)
    {
        Label _label = new Label(advancedGroup, SWT.NONE);
		_label.setText(label); //$NON-NLS-1$
		_label.setEnabled(enabled);
		_label.setFont(font);
		return _label;
    }

    protected Text createText(Group advancedGroup, boolean enabled, Font font, String defaultValue)
    {
        Text _text = new Text(advancedGroup, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        data.widthHint = GRID_DATA_WIDTH;
        _text.setLayoutData(data);
        _text.setEnabled(enabled);
        _text.setFont(font);
        _text.setText(defaultValue);
        return _text;
    }
	
    /**
     * @return Returns the mainClassText.
     */
    public Text getMainClassText() {  return mainClassText;}
    public String getMainClassTextString() {  return mainClassText.getText();}
    
    /**
     * @return Returns the mainOperationText.
     */
    public Text getMainOperationText() { return mainOperationText;}
    public String getMainOperationTextString() { return mainOperationText.getText();}
    
    /**
     * @return Returns the packageText.
     */
    public Text getPackageText() {        return packageText;}
    public String getPackageTextString() { return packageText.getText();}
    
    public String getContainerText() { return containerText.getText();}
    public String getFilename() {return fileText.getText();}
    
    public void handleEvent(Event e)
    {
        dialogChanged();
    }
    
    
}