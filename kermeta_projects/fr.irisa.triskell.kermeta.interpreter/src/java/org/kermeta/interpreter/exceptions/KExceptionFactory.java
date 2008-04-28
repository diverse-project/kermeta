package org.kermeta.interpreter.exceptions;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class KExceptionFactory {

	public static void raiseCallOnVoidTarget(Object o, String message, ExpressionInterpreter interpreter) {
        throw KermetaRaisedException.createKermetaException("kermeta::exceptions::CallOnVoidTarget",
        		message,
				interpreter,
				interpreter.memory,
				o,
				null);
	}
	
}
