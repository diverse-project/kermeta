package org.kermeta.kompose.specialization.ecore.popup.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.interpreter.helper.RunnerHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.kompose.ui.console.KomposeConsole;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Composer implements IObjectActionDelegate, Runnable {

	protected StructuredSelection currentSelection;
    protected IFile komposeFile;
    
    protected String uri;
	
	/**
	 * Constructor for Action1.
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
		uri = "platform:/resource" + komposeFile.getFullPath().toOSString();
		KomposeConsole.printlnMessage("Execute " + uri, KomposeConsole.INFO);
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
		//KermetaIOStream console = new KomposeConsole();
		EclipseConsole console=new EclipseConsole("Kompose Console");
		//LocalIOConsole console=new LocalIOConsole();
		System.out.println("Run Kompose Ecore");
		KermetaUnit unit;
			
			try {
				unit = RunnerHelper.getKermetaUnitToExecute("platform:/plugin/org.kermeta.kompose.specialization.ecore/kermeta/Ecore.kmt");
				KermetaInterpreter inter = new KermetaInterpreter(unit,null);
				
				
				inter.setKStream(console);

				// This is the operation to call
				
				inter.setEntryPoint("ecore::Main", "main");
				
				// These are the parameters
				
				ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
				params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(uri, inter.getMemory().getROFactory()));
				inter.setEntryParameters(params);
				// And we launch the interpreter
				inter.launch();
				inter.freeJavaMemory();
			} catch (NotRegisteredURIException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}

	}

}
