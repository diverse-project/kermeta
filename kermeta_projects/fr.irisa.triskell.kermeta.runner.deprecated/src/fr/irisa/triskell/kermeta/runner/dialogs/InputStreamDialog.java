/* $Id: InputStreamDialog.java,v 1.1 2005-05-20 12:06:00 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: InputStreamDialog.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 20, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.dialogs;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Input dialog that appears when the method "read" is called 
 * (see KermetaConsole.java)
 */
public class InputStreamDialog extends InputDialog {

    
    protected String inputString = null;
    /**
     * @param parentShell
     * @param dialogTitle
     * @param dialogMessage
     * @param initialValue
     * @param validator
     */
    public InputStreamDialog(Shell parentShell, String dialogTitle,
            String dialogMessage, String initialValue, IInputValidator validator) {
        super(parentShell, dialogTitle, dialogMessage, initialValue, validator);
        // TODO Auto-generated constructor stub
    }
    
    

    protected void okPressed() {
        // TODO Auto-generated method stub
        inputString = this.getText().getText();
        super.okPressed();
    }
    
    public  String getInputString()
    {
        return inputString;
    }
}

