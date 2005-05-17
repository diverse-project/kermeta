/* $Id: KermetaRun.java,v 1.2 2005-05-17 07:28:08 zdrey Exp $
 * Project : Kermeta.runner
 * File : KermetaRun.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 * 		Zoé Drey <zdrey@irisa.fr>
 * Description :  	
 * 	see class javadoc.	 
 */
package fr.irisa.triskell.kermeta.runner.popup.actions;

import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.kermeta.behavior.impl.BehaviorPackageImpl;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.runner.console.KermetaConsole;
import fr.irisa.triskell.kermeta.runner.dialogs.RunPopupDialog;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.typechecker.InheritanceSearch;

public class KermetaRun implements IObjectActionDelegate {

    public IFile anIFile = null;
    private StructuredSelection currentSelection = null;
	private IProject currentProject = null;
	private org.eclipse.core.resources.IFile selectedFile=null;
	private ISelection selection=null;
	//private KermetaConsole console = null;
	
	private String defaultMainOperation = null;
	private String defaultMainClass = null;
   
	/**
	 * Constructor for Action1.
	 */
	public KermetaRun() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * When user clicks on the action "KermetaTheRun", a dialog appears.
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action)
	{
	    
		Shell shell = new Shell();
		// Get the selected file and instanciate the Popup dialog
		anIFile = getIFileFromSelection();
		try
		{
	    RunPopupDialog runPopupDialog = new RunPopupDialog(shell, anIFile);
	    // Load the selected file
		KermetaUnit kunit = runPopupDialog.parse(anIFile);
		runPopupDialog.setEntryPoint(kunit);
		int code = runPopupDialog.open();
		// If User chooses OK, than we launch the KermetaProgram 
		if (code != InputDialog.CANCEL)
		{
		    String errorMessage = "Pas d'erreur :-)";
		    
		    // 	Get the values given by the user in the runPopupDialog
		    KermetaInterpreter interpreter = new KermetaInterpreter(kunit);
		    
		    interpreter.setEntryPoint(
		            runPopupDialog.classQualifiedNameString,
		            runPopupDialog.defaultOperationString);
		    interpreter.launch();
		    
		    
		    errorMessage = "Erreur lors du lancement de l'interpreteur:\n"+kunit;
		    
		    // Launch the console
	    	KermetaConsole console = new KermetaConsole("KermetaConsole", null) ;
	    	console.write(errorMessage);
	    	
		}   
		}
		catch (Throwable e)
		{
		    e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	    this.selection = selection;
	}

	/**
	 * retreives the IFile from the selection
	 * It is supposed only one selection. (currently returns the last one)
	 * @return IFile
	 */
	public IFile getIFileFromSelection()
	{
		IFile anIFile = null;
		currentSelection = null;
	
		if (selection instanceof StructuredSelection)
		{		
			currentSelection = (StructuredSelection)selection;
			java.util.Iterator it = currentSelection.iterator();					
			while (it.hasNext() )
			{						
				IResource item = (IResource) it.next ();
				if (item instanceof IFile){					
					currentProject=item.getProject();
					anIFile=(IFile)item;											
				}
			}
		}		
		return anIFile;
	}
	
	
	
}