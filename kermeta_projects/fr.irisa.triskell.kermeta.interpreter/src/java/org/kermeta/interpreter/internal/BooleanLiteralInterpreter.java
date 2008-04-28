

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class BooleanLiteralInterpreter {

	static public RuntimeObject doIt(BooleanLiteral node, ExpressionInterpreter interpreter) {
	    return interpreter.memory.getRuntimeObjectForBoolean(node.isValue());
	}

}


