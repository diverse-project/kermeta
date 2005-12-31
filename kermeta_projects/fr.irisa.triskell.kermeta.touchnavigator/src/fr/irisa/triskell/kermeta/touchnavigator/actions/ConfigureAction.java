/* $Id: ConfigureAction.java,v 1.2 2005-12-31 09:58:03 dvojtise Exp $
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

import java.awt.Color;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Shell;

import com.touchgraph.graphlayout.Node;

import fr.irisa.triskell.kermeta.touchnavigator.dialogs.ConfigurationDialog;
import fr.irisa.triskell.kermeta.touchnavigator.graphlayout.KermetaGLPanel;

public class ConfigureAction extends Action {
	private KermetaGLPanel kGLPanel;
	public ConfigureAction(KermetaGLPanel newkGLPanel) {
		super();
		kGLPanel = newkGLPanel;
	}

	private void initializeDialog(ConfigurationDialog configureDialog){
		configureDialog.create();
		configureDialog.mainContainer.updateOnEditorChangeCheckBox.setSelection(kGLPanel.updateOnEditorChange );
		configureDialog.mainContainer.updateOnOutlineSelectionCheckBox.setSelection(kGLPanel.updateOnOutlineSelection);
		configureDialog.mainContainer.updateOnTextHoverCheckBox.setSelection(kGLPanel.updateOnTextHover);
		configureDialog.selectedNodeColor = new RGB(Node.BACK_SELECT_COLOR.getRed(),
				Node.BACK_SELECT_COLOR.getGreen(),
				Node.BACK_SELECT_COLOR.getBlue());
		configureDialog.distantNodesColor = new RGB(Node.BACK_DEFAULT_COLOR.getRed(),
				Node.BACK_DEFAULT_COLOR.getGreen(),
				Node.BACK_DEFAULT_COLOR.getBlue());
		configureDialog.mainContainer.reinitValues();
	}

	/**
	 * 
	 */
	public void run()
	{
		Shell shell = new Shell();
		 
		ConfigurationDialog configureDialog = new ConfigurationDialog(shell);
		initializeDialog(configureDialog);
		
		
		int code = configureDialog.open();
		// User can cancel his action
		if (code == IDialogConstants.OK_ID)
		{
			kGLPanel.updateOnEditorChange 		= configureDialog.updateOnEditorChange;
			kGLPanel.updateOnOutlineSelection 	= configureDialog.updateOnOutlineSelection;
			kGLPanel.updateOnTextHover 			= configureDialog.updateOnTextHover;
			Node.BACK_SELECT_COLOR = new Color(configureDialog.selectedNodeColor.red,
					configureDialog.selectedNodeColor.green,
					configureDialog.selectedNodeColor.blue);
			Node.BACK_DEFAULT_COLOR = new Color(configureDialog.distantNodesColor.red,
					configureDialog.distantNodesColor.green,
					configureDialog.distantNodesColor.blue);
			kGLPanel.repaint();
			kGLPanel.refresh();
		   /* MessageDialog.openInformation(
					shell,
					"Kermeta TouchNavigator",
					"Kermeta TouchNavigator"); */
		}
		
	}
}
