

package org.kermeta.interpreter.internal.debug;

import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;

public class EmptyExpressionDebugInterpreter {

	static public RuntimeObject doIt(EmptyExpression node, DebugInterpreter interpreter) {
		return null;
	}

}


