/* $Id: ConfigurationDialog.java,v 1.1 2005-11-28 23:09:15 dvojtise Exp $
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

    
    /**
     * 
     */
    public ConfigurationDialog(Shell parentShell) {
        super(parentShell);
        actionDescriptionString = "Configuring Kermeta TouchNavigator";
        dialogTitleString = "Kermeta TouchNavigator configuration";
		 
    }    
    
	/**
	 * Create a dialog Area
	 */
	protected Control createDialogArea(Composite parent) {
		Composite container =  new ConfigurationDialogComposite(parent, SWT.NULL);		
		return container;
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
    

	
}
