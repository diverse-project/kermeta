/* $Id: ConfigureAction.java,v 1.1 2005-11-28 23:09:15 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.touchnavigator
 * File : ConfigureAction.java
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 nov. 2005
 * Authors : 
 *     	dvojtise <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.touchnavigator.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import fr.irisa.triskell.kermeta.touchnavigator.dialogs.ConfigurationDialog;

public class ConfigureAction extends Action {

	/**
	 * 
	 */
	public void run()
	{
		Shell shell = new Shell();
		 
		ConfigurationDialog configureDialog = new ConfigurationDialog(shell);
		
		int code = configureDialog.open();
		// User can cancel his action
		if (code != IDialogConstants.CANCEL_ID)
		{
		    
		   /* MessageDialog.openInformation(
					shell,
					"Kermeta TouchNavigator",
					"Kermeta TouchNavigator"); */
		}
		
	}
}
