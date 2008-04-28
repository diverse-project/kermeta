

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.VoidLiteral;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class VoidLiteralInterpreter {

	static public RuntimeObject doIt(VoidLiteral node, ExpressionInterpreter interpreter) {
		return interpreter.memory.voidINSTANCE;
	}

}


