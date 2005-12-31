/* $Id: ConfigurationDialog.java,v 1.2 2005-12-31 09:58:03 dvojtise Exp $
 * Project: Kermeta (First iteration)
 * File: ConfigurationDialog.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 12, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.touchnavigator.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.jface.dialogs.Dialog;
//import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import fr.irisa.triskell.kermeta.loader.ecore.ECore2Kermeta;

/**
 * Dialog that appears when user clics on the popup menu of a .kmt source file
 */
public class ConfigurationDialog extends Dialog {

    
    /** Describe the kind of action that implied this dialog */
    public String actionDescriptionString;
    /** The title for the dialog */
    public String dialogTitleString;
    public ConfigurationDialogComposite mainContainer;
    
    public boolean updateOnEditorChange;
    public boolean updateOnOutlineSelection;
    public boolean updateOnTextHover;
    public int primitiveTypePresentation;
    public int associationLinesPresentation;
    public int associationEndsPresentation;
    public int inheritancePresentation;
    public RGB selectedNodeColor = new RGB(0,0,0);
	public RGB distantNodesColor = new RGB(100,10,100);

    
    /**
     * 
     */
    public ConfigurationDialog(Shell parentShell) {
        super(parentShell);
        actionDescriptionString = "Configuring Kermeta Class TouchNavigator";
        dialogTitleString = "Kermeta Class TouchNavigator configuration";
		 
    }    
    
	/**
	 * Create a dialog Area
	 */
	protected Control createDialogArea(Composite parent) {
		mainContainer =  new ConfigurationDialogComposite(parent, SWT.NULL, this);
		
		return mainContainer;
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
    
	public void initValues(boolean newupdateOnTextHover, 
			boolean newupdateOnOutlineSelection,
			boolean newupdateOnEditorChange,
			int newprimitiveTypePresentation,
			int newassociationLinesPresentation,
			int newassociationEndsPresentation,
			int newinheritancePresentation){
		mainContainer.inheritancePresentationCombo.select(newinheritancePresentation);
		mainContainer.associationEndPresentationCombo.select(newassociationEndsPresentation);
		mainContainer.associationLinePresentationCombo.select(newassociationLinesPresentation);
		mainContainer.primitiveTypesPresentationCombo.select(newprimitiveTypePresentation);
		mainContainer.updateOnEditorChangeCheckBox.setSelection(newupdateOnEditorChange);
		mainContainer.updateOnOutlineSelectionCheckBox.setSelection(newupdateOnOutlineSelection);
		mainContainer.updateOnTextHoverCheckBox.setSelection(newupdateOnTextHover);
	}
	
	/**
     * overwrite this Dialog in order to be able to retreive the data befor it closes
     */
    protected void okPressed() {
    	updateOnEditorChange 		= mainContainer.updateOnEditorChangeCheckBox.getSelection();
		updateOnOutlineSelection 	= mainContainer.updateOnOutlineSelectionCheckBox.getSelection();
		updateOnTextHover 			= mainContainer.updateOnTextHoverCheckBox.getSelection();

		inheritancePresentation = mainContainer.inheritancePresentationCombo.getSelectionIndex();
		associationEndsPresentation =mainContainer.associationEndPresentationCombo.getSelectionIndex();
		associationLinesPresentation = mainContainer.associationLinePresentationCombo.getSelectionIndex();
		primitiveTypePresentation=mainContainer.primitiveTypesPresentationCombo.getSelectionIndex();
	  
    	super.okPressed();
    }

	
}
