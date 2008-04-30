/* $Id: RunPopupDialog.java,v 1.2 2008-04-30 13:58:50 ftanguy Exp $
 * Project: org.kermeta.runner.ui
 * File: RunPopupDialog.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 12, 2005
 * Authors: zdrey
 */
package org.kermeta.runner.dialogs;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
//import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Dialog that appears when user clics on the popup menu of a .kmt source file
 */
public class RunPopupDialog extends Dialog {

    
    /** Describe the kind of action that implied this dialog */
    public String defaultOperationString;
    /** The source file that the user want to be executed */
    public String filenameString;
    /** The title for the dialog */
    public String dialogTitleString = "op";
    public String classQualifiedNameString = "class";
    
    /** The texts zones */
    public Text sourceFileText = null;
    public Text classQualifiedNameText = null;
    public Text defaultOperationText = null;
    
    
    /**
     * 
     */
    public RunPopupDialog(Shell parentShell, IFile ifile) {
        super(parentShell);
        // Set the selected file 
        //filenameString = pFilenameString;
        // Set the values of defaultOperationString and classQualifiedNameString;

        filenameString = ifile.getLocation().toString();
        dialogTitleString = "Kermeta popup run";
        
    }
    
    /***
     * 
     * @param pFilename the filename, given as a unix string
     */
    public void setFilenameString(String pFilename)
    {
        
        filenameString = pFilename;
    }
    
	/**
	 * Create a pretty dialog Area
	 */
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new FillLayout(SWT.VERTICAL));
		// Set the field for the chosen file
		{
			final Group group = new Group(area, SWT.NONE);
			group.setText("File:");
			group.setLayout(new FillLayout(SWT.VERTICAL));
			{
				sourceFileText = new Text(group, SWT.BORDER);
				sourceFileText.setEnabled(true);
				sourceFileText.setText(filenameString);
			}
		}

		// Set the field for the operation choice
		{
			final Group group_info = new Group(area, SWT.NONE);
			group_info.setText("Chosen class:");
			group_info.setLayout(new FillLayout());
			{
				classQualifiedNameText = new Text(group_info, SWT.BORDER);
				classQualifiedNameText.setEnabled(true);
				classQualifiedNameText.setText(classQualifiedNameString);
			}
		}
		// Set the field for the operation choice
		{
			final Group group_info = new Group(area, SWT.NONE);
			group_info.setText("Chosen operation:");
			group_info.setLayout(new FillLayout());
			{
				defaultOperationText = new Text(group_info, SWT.BORDER);
				defaultOperationText.setEnabled(true);
				defaultOperationText.setText(defaultOperationString);
			}
		}
		return area;
	}
	
	/** 
	 * Create the OK and the Cancel buttons
	 * */
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(
			parent,
			IDialogConstants.OK_ID,
			IDialogConstants.OK_LABEL,
			true);
		createButton(
			parent,
			IDialogConstants.CANCEL_ID,
			IDialogConstants.CANCEL_LABEL,
			false);
	}
	
	/**
	 * Configure the shell, by giving it a title
	 * @param newShell the shell
	 */
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(dialogTitleString);
	}
    

	/**
	 * Create a Browse list to get the list of available classes
	 *
	 */
	protected void browseKermetaClasses(String filename)
	{
	    
	}

    public void okPressed()
    {
        classQualifiedNameString = classQualifiedNameText.getText();
        defaultOperationString = defaultOperationText.getText();

        super.okPressed();
    }
    
	
}
