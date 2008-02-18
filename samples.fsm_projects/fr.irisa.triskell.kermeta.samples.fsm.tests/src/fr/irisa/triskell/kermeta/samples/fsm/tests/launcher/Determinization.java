/* $Id: Determinization.java,v 1.6 2008-02-18 08:49:27 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.fsm.test
 * File      : Determinization.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2007
 * Authors       : ftanguy
 */
package fr.irisa.triskell.kermeta.samples.fsm.tests.launcher;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Test;
import org.kermeta.interpreter.helper.RunnerHelper;

import fr.irisa.triskell.eclipse.console.EclipseConsole;
import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * This test use the fsm.demo project file, and run the determinization transformation from it
 * checks that the transformation runs and produce a result
 *
 */
public class Determinization {

	@Test public void determinizationWorks() {
		
		String file = "platform:/resource/fr.irisa.triskell.kermeta.samples.fsm.demo/launcher/determinization.kmt";
		
		KermetaInterpreter interpreter;
		try {
			interpreter = new KermetaInterpreter(RunnerHelper.getKermetaUnitToExecute(file), null);
			
			IOConsole console = new EclipseConsole("Determinization");
			
			interpreter.setKStream(console);
			ArrayList<RuntimeObject> parameters = new ArrayList<RuntimeObject> ();
			parameters.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(
					"platform:/resource/fr.irisa.triskell.kermeta.samples.fsm.demo/models/sampletodeterminize.fsm", interpreter.getMemory().getROFactory()));
			interpreter.setEntryParameters(parameters);
			interpreter.launch();
			
			Assert.assertTrue( ResourcesPlugin.getWorkspace().getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demo/models/sampletodeterminize.det.fsm") ).exists() );
			
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
