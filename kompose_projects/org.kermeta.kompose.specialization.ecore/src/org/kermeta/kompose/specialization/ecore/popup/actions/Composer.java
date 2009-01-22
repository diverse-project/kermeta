package org.kermeta.kompose.specialization.ecore.popup.actions;

import java.io.PrintStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class Composer implements IObjectActionDelegate, Runnable {

	protected StructuredSelection currentSelection;
    protected IFile komposeFile;
    
    protected String uri;
	
	/**
	 * Constructor for Composer.
	 */
	public Composer() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)	
	 */
	public void run(IAction action) {
		uri = "platform:/resource" + komposeFile.getFullPath().toPortableString();
		new Thread(this).start();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the selection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator<?> it = currentSelection.iterator();

			while(it.hasNext()) {
				komposeFile = (IFile)it.next();
			}
		}
	}
	
	public void run() {
		System.out.println("Run Kompose Ecore");
		try {
			String spath="platform:/plugin/org.kermeta.kompose.specialization.ecore/kermeta/Ecore.kmt";
			
			EclipseConsole console = new EclipseConsole("Kompose Console");
			PrintStream stream = new PrintStream( console.getOutputStream() );
			String[] params={uri};
			
			Interpreter interpreter = new Interpreter(spath, InterpreterMode.RUN, null);
			interpreter.setEntryPoint("ecore::Main", "main");
			interpreter.setParameters(params);				
			interpreter.setInputStream( console.getReader() );
			interpreter.setOutputStream(stream);
			interpreter.setErrorStream( new PrintStream( console.getOutputStream() ) );

			stream.println("Execute " + uri);
			interpreter.launch();
			
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		}
	}
}
