package fr.irisa.triskell.kermeta.kpm.actions.popup;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;

import fr.irisa.triskell.kermeta.console.KermetaIOConsole;

public class OpenKPMEditor implements IActionDelegate {

	public void run(IAction action) {
		
		Runnable r = new Runnable() {
			
			public void run() {
				KermetaIOConsole console = new KermetaIOConsole("blah");
				String value = console.promptAndRead("Integer value : ");
				console.println(value);
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();

	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
