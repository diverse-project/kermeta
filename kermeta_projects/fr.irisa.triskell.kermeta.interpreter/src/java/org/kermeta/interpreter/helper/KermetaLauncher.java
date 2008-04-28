
/*$Id: KermetaLauncher.java,v 1.3 2008-04-28 11:50:59 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta
 * File : 	KermetaLauncher.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 mai 07
 * Authors : paco
 */

package org.kermeta.interpreter.helper;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.KInterpreter;

public class KermetaLauncher {

	public static boolean execute(String filePath, String[] args) {

		EclipseConsole console = new EclipseConsole("KPM Console - Executing Kermeta file : " + filePath);
		
		try {
			
			if (args.length == 0)
				return false;
	
			String arguments = "";
			for (int i = 0; i < args.length; i++)
				arguments += args[i] + " ";
	
			KInterpreter interpreter = typeCheckTranfo(filePath);
			
		// And we launch the interpreter
			interpreter.launch();
		} catch (URIMalformedException e) {
		
			e.printStackTrace();
			return false;
		
		} catch (KermetaRaisedException e) {
			ThrowableMessage message = new ThrowableMessage(e);
			console.print(message);
			e.printStackTrace();
			IOPlugin.getDefault().unload( filePath );
			return false;
		
		} catch (Error e) {
		
			final Error fe = e;
			Display display = PlatformUI.getWorkbench().getDisplay();
			Runnable r = new Runnable() {

				public void run() {
					ErrorDialog dialog = new ErrorDialog(new Shell(), "Interpretation Failed", "", new Status(Status.ERROR, "fr.irisa.triskell.kermeta.interpreter", fe.getMessage(), fe), IStatus.ERROR);
					dialog.open();
				}
				
			};
			display.asyncExec(r);
		} catch (KermetaIOFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	private static KInterpreter typeCheckTranfo(String file) throws KermetaIOFileNotFoundException, URIMalformedException, NotRegisteredURIException, IOException {
		KermetaUnit unitToExecute = RunnerHelper.getKermetaUnitToExecute(file, "platform:/resource/interpreter_unit.km");
		//KInterpreter interpreter = new KInterpreter(unitToExecute);
		//return interpreter;
		return null;
	}
}
