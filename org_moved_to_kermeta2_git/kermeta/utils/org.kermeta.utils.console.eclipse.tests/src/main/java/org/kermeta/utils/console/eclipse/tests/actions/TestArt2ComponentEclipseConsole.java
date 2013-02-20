package org.kermeta.utils.console.eclipse.tests.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.kermeta.utils.console.eclipse.tests.tests.Art2ComponentEclipseConsoleTest;

public class TestArt2ComponentEclipseConsole implements
		IWorkbenchWindowActionDelegate {

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow arg0) {
		// TODO Auto-generated method stub

	}

	public void run(IAction arg0) {
		Art2ComponentEclipseConsoleTest testArt2Comp = new Art2ComponentEclipseConsoleTest();
		testArt2Comp.testWrite();
		//testArt2Comp.testWriteln();

	}

	public void selectionChanged(IAction arg0, ISelection arg1) {
		// TODO Auto-generated method stub

	}

}
