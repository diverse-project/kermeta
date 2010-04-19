/*$Id: OpenEditorHandler.java,v 1.2 2008-09-24 11:52:46 dvojtise Exp $
* Project : fr.irisa.triskell.eclipse.util
* File : 	OpenEditorHandler.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 31 mars 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package fr.irisa.triskell.eclipse.util.handlers;

import java.util.Map;
/*
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;*/
import org.eclipse.core.resources.IFile;
/*import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;*/

import fr.irisa.triskell.eclipse.plugin.Activator;
import fr.irisa.triskell.eclipse.resources.ResourceHelper;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class OpenEditorHandler/* extends AbstractHandler*/ {
	/**
	 * The constructor.
	 */
	public OpenEditorHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	
	public Object execute(/*ExecutionEvent event*/)/* throws ExecutionException*/ {
		/*@SuppressWarnings("unchecked")
		Map params = event.getParameters();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IWorkbenchPage page = window.getActivePage();
		if(page == null){
			Activator.logErrorMessage("Cannot open editor because getActivePage returned null", null);
			return null;
		}
		IFile file = ResourceHelper.getIFile((String)params.get("fr.irisa.triskell.eclipse.util.openFileCommandParameter1"));
		if(file == null){
			Activator.logErrorMessage("Cannot open editor, file doesn't exist : " + params.get("fr.irisa.triskell.eclipse.util.openFileCommandParameter1").toString(), null);
			return null;
		}
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
		try {
			page.openEditor(
			   new FileEditorInput(file),
			   desc.getId());
		} catch (PartInitException e) {
			Activator.logErrorMessage("Cannot open editor for " + params.get("fr.irisa.triskell.eclipse.util.openFileCommandParameter1").toString(), e);
		}
		*/
		return null;
	}
	
}
