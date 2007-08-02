
/*$Id: KermetaLauncher.java,v 1.4 2007-08-02 12:59:50 ftanguy Exp $
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

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class KermetaLauncher {

	public static boolean execute(String filePath, String[] args) {

		if (args.length == 0)
			return false;

		String arguments = "";
		for (int i = 0; i < args.length; i++)
			arguments += args[i] + " ";

		KermetaInterpreter interpreter;
		try {
			interpreter = typeCheckTranfo(filePath);
		} catch (KermetaIOFileNotFoundException e1) {
			e1.printStackTrace();
			return false;
		} catch (URIMalformedException e) {
			e.printStackTrace();
			return false;
		}

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

	private static KermetaInterpreter typeCheckTranfo(String file) throws KermetaIOFileNotFoundException, URIMalformedException {

		KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit( file );

		if ( ! unit.isErrored() ) {
			KermetaTypeChecker typechecker = new KermetaTypeChecker( unit );
			typechecker.checkUnit();
		}
		
		if ( ! unit.isErrored() ) {
			KermetaConstraintChecker constraintcheker = new KermetaConstraintChecker(unit);
			constraintcheker.checkUnit();
		}
		
		if ( ! unit.isErrored() ) {
		
			try {
				KermetaInterpreter interpreter = new KermetaInterpreter(unit);
				return interpreter;
			} catch (KermetaInterpreterError exception) {
			}
		
		} else
			System.out.println( KermetaUnitHelper.getAllErrorsAsString(unit) );
		
		IOPlugin.getDefault().unload( file );
		
		return null;

	}
}
