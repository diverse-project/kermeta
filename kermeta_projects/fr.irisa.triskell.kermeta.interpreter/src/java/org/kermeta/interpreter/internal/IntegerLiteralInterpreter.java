

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class IntegerLiteralInterpreter {

	static public RuntimeObject doIt(IntegerLiteral node, ExpressionInterpreter interpreter) {
	    return fr.irisa.triskell.kermeta.runtime.basetypes.Integer.create(node.getValue(), interpreter.memory.getROFactory());
	}

}


