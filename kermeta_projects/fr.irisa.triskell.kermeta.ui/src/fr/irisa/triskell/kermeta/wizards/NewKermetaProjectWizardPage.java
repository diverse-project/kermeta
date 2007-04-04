/* $Id: NewKermetaProjectWizardPage.java,v 1.1 2007-04-04 13:25:30 ftanguy Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaNewProjectWizardPage.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 19, 2005
 * Authors: zdrey
 * Notes :
 * 	This file was primarily generated by Eclipse plug-in helper
 */

package fr.irisa.triskell.kermeta.wizards;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Font;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.wizard.WizardDialog;

/**
 * The "New" wizard page allows setting the container for
 * the new file as well as the file name. The page
 * will only accept file name without the extension OR
 * with the extension that matches the expected one (kmt).
 */

public class NewKermetaProjectWizardPage extends WizardNewProjectCreationPage
{ 
    // 
    protected WizardDialog wizardDialog;
    
    /** true if user uses the default metamodel/model/output folders, false otherwise */
    public boolean useDefaultFolders = false;
    protected Button useDefaultFoldersButton;
    
    // Widgets
    /*protected Text modelLocationText, mmodelLocationText;*/
    protected Text srcLocationText, binLocationText;
    // Labels
    /*protected Label modelLocationLabel, mmodelLocationLabel;*/
    protected Label srcLocationLabel,binLocationLabel;

    private String SRC_FOLDER = "src";

    private String SRC_LIB = "lib";
    
	/**
	 * Constructor for KermetaNewWizardPage.
	 * @param pageName
	 */
	public NewKermetaProjectWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new project");
	}
	
	public NewKermetaProjectWizardPage() {
		super("wizardPage");
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new project");
	}
	
    /**
     * Create the layout of this page
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
     */
    public void createControl(Composite parent) {
        // Super method contains the following widgets : 
        // The text field for the project name
        // The text field for the project location (default or user defined)
        super.createControl(parent);
        Composite composite = (Composite)getControl();
        createDefaultFoldersRadioButton(composite);
        
    }
    /**
     * Create the radio button and the box fields to define the folders
     * models/metamodels/src/bin
     * @param parent
     */
    protected void createDefaultFoldersRadioButton(Composite parent)
    {
        
        Font font = parent.getFont();
        // project specification group
        Group folderGroup = new Group(parent, SWT.NONE);
        GridLayout layout = new GridLayout(2,false);
        folderGroup.setLayout(layout);
        folderGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        folderGroup.setFont(font);
        folderGroup.setText("Set default folders");
        
        final Button useEmptyFoldersButton =
            new Button(folderGroup, SWT.RADIO | SWT.RIGHT);
        
        useEmptyFoldersButton.setText("Create empty folder");
        useEmptyFoldersButton.setSelection(!useDefaultFolders);
        useEmptyFoldersButton.setFont(font);

        
        GridData buttonData = new GridData();
        buttonData.horizontalSpan = 3;
        useEmptyFoldersButton.setLayoutData(buttonData);
        
        
        // Default folders
        final Button useDefaultFoldersButton =
            new Button(folderGroup, SWT.RADIO | SWT.RIGHT);
        
        useDefaultFoldersButton.setText("Create separate folders for source (src) and libraries (lib)");
        useDefaultFoldersButton.setSelection(!useEmptyFoldersButton.getSelection());
        useDefaultFoldersButton.setFont(font);
        
        buttonData = new GridData();
        buttonData.horizontalSpan = 3;
        useDefaultFoldersButton.setLayoutData(buttonData);
        
        
        createUserSpecifiedFolderLocationGroup(folderGroup, false);
        
        SelectionListener listener = new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                useDefaultFolders = useDefaultFoldersButton.getSelection();
                setLocationFoldersEnabled(useDefaultFolders);
                if (useDefaultFolders) {
                    setLocationFoldersForSelection();
                } else {
                    // User choice
                }
            }
        };
        useDefaultFoldersButton.addSelectionListener(listener);
        
    }
    
    /**
     * Enable/Disable the default folder location fields
     * */
    protected void setLocationFoldersEnabled(boolean b)
    {/*
        modelLocationText.setEnabled(b);   modelLocationLabel.setEnabled(b);
        mmodelLocationText.setEnabled(b);  mmodelLocationLabel.setEnabled(b);*/
        srcLocationLabel.setEnabled(b);
        srcLocationText.setEnabled(b);;
        binLocationLabel.setEnabled(b);
        binLocationText.setEnabled(b);
    }

    protected void setLocationFoldersForSelection()
    {
		if (useDefaultFolders)
		{
/*			mmodelLocationText.setText("metamodels"); modelLocationText.setText("models");*/
			srcLocationText.setText(SRC_FOLDER);
			binLocationText.setText(SRC_LIB);
		}
    }

    /**
     * Create the templated folder
     * @param folderGroup
     * @param b
     */
    private void createUserSpecifiedFolderLocationGroup(Group folderGroup, boolean b) {
        
		Font font = folderGroup.getFont();

		// metamodels location label
/*		mmodelLocationLabel = createLocationLabel(folderGroup, "Metamodel location", b, font);
		mmodelLocationText = createLocationText(folderGroup, b, font, "metamodels");
		// models location label
		modelLocationLabel = createLocationLabel(folderGroup, "Model location", b, font);
		modelLocationText = createLocationText(folderGroup, b, font, "models");
*/
		// source location label
		srcLocationLabel = createLocationLabel(folderGroup, "Transformation source location", b, font);
		srcLocationText = createLocationText(folderGroup, b, font, SRC_FOLDER);
		
		// source location label
		binLocationLabel = createLocationLabel(folderGroup, "Compiled files location", b, font);
		binLocationText = createLocationText(folderGroup, b, font, SRC_LIB);
        
    }
    
    protected Label createLocationLabel(Group folderGroup, String label, boolean enabled, Font font)
    {
        Label _locationLabel = new Label(folderGroup, SWT.NONE);
		_locationLabel.setText(label); //$NON-NLS-1$
		_locationLabel.setEnabled(enabled);
		_locationLabel.setFont(font);
		return _locationLabel;
    }

    protected Text createLocationText(Group folderGroup, boolean enabled, Font font, String defaultValue)
    {
        Text _locationText = new Text(folderGroup, SWT.BORDER);
        GridData data = new GridData(GridData.FILL_HORIZONTAL);
        //data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        _locationText.setLayoutData(data);
        _locationText.setEnabled(enabled);
        _locationText.setFont(font);
        _locationText.setText(defaultValue);
        return _locationText;
    }
    
    /**
     * Invoked when user clicks on "Finish" button.
     * Create the empty folders
     *
     */
    protected void createFolders(IProject newProject)
    {	
        try
        {   
            //createFolder(newProject.getFolder(modelLocationText.getText()));
            // createFolder(newProject.getFolder(mmodelLocationText.getText()));
            //output folder
            IFolder output = newProject.getFolder(binLocationText.getText());
            createFolder(output);
            IFolder src = newProject.getFolder(srcLocationText.getText());
            createFolder(src);
        }
        catch (CoreException e)
        {
            e.printStackTrace();
        }
    }
    
    
    
	/**
	 * helper method that recusrively create the requested folder
	 * 
	 * @param folder
	 */
	private void createFolder(IFolder folder) throws CoreException {
		if (!folder.getParent().exists())
			createFolder((IFolder) folder.getParent());
		folder.create(true, true, null);
	}

    /* (non-Javadoc)
     * @see org.eclipse.ui.dialogs.WizardNewProjectCreationPage#setInitialProjectName(java.lang.String)
     */
    public void setInitialProjectName(String name) {
        // TODO Auto-generated method stub
        super.setInitialProjectName(name);
    }
    
    /**
     * Set the dialog to this page : the container in fact
     * @param dialog
     */
/*    public void setWizardDialog(WizardDialog dialog)    {
        wizardDialog = dialog;
    }*/
    
    
    
    
    
}