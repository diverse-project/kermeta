

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.StringLiteral;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class StringLiteralInterpreter {

	static public RuntimeObject doIt(StringLiteral node, ExpressionInterpreter interpreter) {
		return fr.irisa.triskell.kermeta.runtime.basetypes.String.create(node.getValue(), interpreter.memory.getROFactory());
    }

}


