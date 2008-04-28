/* $Id: Determinization.java,v 1.7 2008-04-28 13:39:27 ftanguy Exp $
 * Project   : fr.irisa.triskell.kermeta.fsm.test
 * File      : Determinization.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2007
 * Authors       : ftanguy
 */
package fr.irisa.triskell.kermeta.samples.fsm.tests.launcher;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Test;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * This test use the fsm.demo project file, and run the determinization transformation from it
 * checks that the transformation runs and produce a result
 *
 */
public class Determinization {

	@Test public void determinizationWorks() {
		
		String file = "platform:/resource/fr.irisa.triskell.kermeta.samples.fsm.demo/launcher/determinization.kmt";
		
		Interpreter interpreter;
		try {
			interpreter = new Interpreter(file, InterpreterMode.RUN, null);
			
			IOConsole console = new EclipseConsole("Determinization");
			
			interpreter.setStreams(console);
			String[] params = new String[1];
			params[0] = "platform:/resource/fr.irisa.triskell.kermeta.samples.fsm.demo/models/sampletodeterminize.fsm";
			interpreter.setParameters(params);
			interpreter.launch();
			
			Assert.assertTrue( ResourcesPlugin.getWorkspace().getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demo/models/sampletodeterminize.det.fsm") ).exists() );
			
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
