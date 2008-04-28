

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class EmptyExpressionInterpreter {

	static public RuntimeObject doIt(EmptyExpression node, ExpressionInterpreter interpreter) {
		return null;
	}

}


