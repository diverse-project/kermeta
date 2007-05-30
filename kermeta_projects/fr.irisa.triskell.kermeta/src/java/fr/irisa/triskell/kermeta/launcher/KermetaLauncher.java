
/*$Id: KermetaLauncher.java,v 1.1 2007-05-30 13:28:24 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta
 * File : 	KermetaLauncher.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 30 mai 07
 * Authors : paco
 */

package fr.irisa.triskell.kermeta.launcher;

import java.io.File;
import java.util.ArrayList;

import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class KermetaLauncher {

	public static boolean execute(String[] args) {

		if (args.length == 0)
			return false;

		String file = args[0];
		String arguments = "";
		for (int i = 0; i < args.length - 1; i++)
			arguments += args[i + 1] + " ";

		KermetaInterpreter interpreter = typeCheckTranfo(file);

		if (interpreter == null)
			return false;

		ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(
				arguments, interpreter.getMemory().getROFactory()));
		interpreter.setEntryParameters(params);

		// And we launch the interpreter
		try {
			interpreter.launch();
		} catch (KermetaRaisedException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static KermetaInterpreter typeCheckTranfo(String file) {

		KermetaUnitFactory.getDefaultLoader().unloadAll();
		KermetaUnit unit = KermetaUnitFactory.getDefaultLoader()
				.createKermetaUnit(file);
		unit.load();
		unit.typeCheckAllUnits();
		try {
			KermetaInterpreter interpreter = new KermetaInterpreter(unit);
			return interpreter;
		} catch (KermetaInterpreterError exception) {
		}

		return null;

	}
}
