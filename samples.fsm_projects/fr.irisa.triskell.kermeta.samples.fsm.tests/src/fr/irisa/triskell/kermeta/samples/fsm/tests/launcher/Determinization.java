package fr.irisa.triskell.kermeta.samples.fsm.tests.launcher;

import java.util.ArrayList;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Test;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Determinization {

	@Test public void determinizationWorks() {
		
		String file = "platform:/resource/fr.irisa.triskell.kermeta.samples.fsm.demo/launcher/determinization.kmt";
		
		KermetaInterpreter interpreter = new KermetaInterpreter(file, null, false);
		ArrayList<RuntimeObject> parameters = new ArrayList<RuntimeObject> ();
		parameters.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(
				"../models/sampletodeterminize.fsm", interpreter.getMemory().getROFactory()));
		interpreter.setEntryParameters(parameters);
		interpreter.launch();
		
		Assert.assertTrue( ResourcesPlugin.getWorkspace().getRoot().getFile( new Path("/fr.irisa.triskell.kermeta.samples.fsm.demo/models/sampletodeterminize.det.fsm") ).exists() );
		
	}
	
}
