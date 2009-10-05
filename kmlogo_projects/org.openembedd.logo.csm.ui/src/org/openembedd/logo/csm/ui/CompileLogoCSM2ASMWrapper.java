/**
 * Copyright : IRISA / INRIA Rennes Bretagne Atlantique - OpenEmbeDD integration team
 * 
 * This plug-in is under the terms of the EPL License. http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Vincent Mahe
 */
package org.openembedd.logo.csm.ui;

import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class CompileLogoCSM2ASMWrapper
{

	public static final String	LOGO_CSM_COMPILER_CODE	= "platform:/plugin/org.openembedd.logo.csm.translator/src/kermeta/CSMLogo2ASMLogo.kmt";

	public static void run(String file, String out, IOConsole console) throws NotRegisteredURIException,
			URIMalformedException
	{

		// need the Kermeta interpreter
		Interpreter interpreter = new Interpreter(LOGO_CSM_COMPILER_CODE, InterpreterMode.RUN, null);
		interpreter.setStreams(console);
		interpreter.setEntryPoint("logoCSM::CSMLogo2ASMLogo", "compile");

		// parameters to pass to the operation
		String[] parameters = new String[2];
		parameters[0] = file;
		parameters[1] = out;
		interpreter.setParameters(parameters);

		// the code is in a deployed plug-in
		// Bundle bundle = org.eclipse.core.runtime.Platform.getBundle("org.openembedd.logo.csm.model");

		interpreter.launch();
	}
}
