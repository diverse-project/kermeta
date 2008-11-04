package org.kermeta.kompose.ecore.popup.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class KomposeEcore implements IObjectActionDelegate, Runnable {

	protected StructuredSelection currentSelection;
    protected IFile komposeFile;
    
    protected String uri;
	
	/**
	 * Constructor for Action1.
	 */
	public KomposeEcore() {
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
		uri = "platform:/resource" + komposeFile.getFullPath().toOSString();
		new Thread(this).start();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			// the se=lection should be a single *.ecore file
			currentSelection = (StructuredSelection)selection;
			Iterator<?> it = currentSelection.iterator();

			while(it.hasNext()) {
				komposeFile = (IFile)it.next();
			}

		}
	}
	
	public void run() {
	/*	System.out.println("Run Kompose Ecore");
		KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("platform:/plugin/org.kermeta.kompose.ecore/kermeta/ecore_composition.kmt");
		unit.load();
		unit.typeCheckAllUnits();
		KermetaInterpreter inter = new KermetaInterpreter(unit);
		inter.setKStream(console);
		// This is the operation to call
		inter.setEntryPoint("ecore::Main", "main");
		// These are the parameters
		ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(uri, inter.getMemory().getROFactory()));
		inter.setEntryParameters(params);
		// And we launch the interpreter
		inter.launch();*/
		
		try {
			Interpreter interpreter = new Interpreter("platform:/plugin/org.kermeta.kompose.ecore/kermeta/ecore_composition.kmt", InterpreterMode.RUN, null);
	        interpreter.setStreams( new EclipseConsole("Kompose Console") );
	        interpreter.setEntryPoint("ecore::Main", "main");
	        String[] parameters = new String[1];
	        parameters[0] = uri;
	        interpreter.setParameters(parameters);
	        interpreter.launch();} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}
