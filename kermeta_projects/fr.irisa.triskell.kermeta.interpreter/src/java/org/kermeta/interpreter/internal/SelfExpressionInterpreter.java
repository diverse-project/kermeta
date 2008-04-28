

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.SelfExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class SelfExpressionInterpreter {

	static public RuntimeObject doIt(SelfExpression node, ExpressionInterpreter interpreter) {
	    return interpreter.getInterpreterContext().peekCallFrame().getSelf();
	}

}


