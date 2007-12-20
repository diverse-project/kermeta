
/*$Id: KermetaLauncher.java,v 1.11 2007-12-20 09:11:45 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta
 * File : 	KermetaLauncher.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 mai 07
 * Authors : paco
 */

package fr.irisa.triskell.kermeta.launcher;

import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.messages.ThrowableMessage;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.plugin.KermetaPlugin;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class KermetaLauncher {

	public static boolean execute(String filePath, String[] args) {

		EclipseConsole console = new EclipseConsole("KPM Console - Executing Kermeta file : " + filePath);
		
		try {
			
			if (args.length == 0)
				return false;
	
			String arguments = "";
			for (int i = 0; i < args.length; i++)
				arguments += args[i] + " ";
	
			KermetaInterpreter interpreter;
			interpreter = typeCheckTranfo(filePath);

			if (interpreter == null)
				return false;

			ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
			params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(
					arguments, interpreter.getMemory().getROFactory()));
			interpreter.setEntryParameters(params);

			interpreter.setKStream(console);
			
		// And we launch the interpreter
			interpreter.launch();
			
		} catch (KermetaIOFileNotFoundException e1) {
			
			e1.printStackTrace();
			return false;
		
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
					ErrorDialog dialog = new ErrorDialog(new Shell(), "Interpretation Failed", "", new Status(Status.ERROR, KermetaPlugin.ID, fe.getMessage(), fe), IStatus.ERROR);
					dialog.open();
				}
				
			};
			display.asyncExec(r);
		}
		return true;
	}

	private static KermetaInterpreter typeCheckTranfo(String file) throws KermetaIOFileNotFoundException, URIMalformedException {
		KermetaInterpreter interpreter = new KermetaInterpreter(file, null, true);
		return interpreter;
	}
}
