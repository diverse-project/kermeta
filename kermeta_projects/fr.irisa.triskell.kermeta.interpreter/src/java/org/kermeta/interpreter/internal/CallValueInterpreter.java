

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.CallValue;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class CallValueInterpreter {

	static public RuntimeObject doIt(CallValue node, ExpressionInterpreter interpreter) {
		return interpreter.getInterpreterContext().peekCallFrame().getCallValueResult();
	}

}


