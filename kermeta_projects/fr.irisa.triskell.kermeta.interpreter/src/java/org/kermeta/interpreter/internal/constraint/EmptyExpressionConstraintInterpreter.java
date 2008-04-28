

package org.kermeta.interpreter.internal.constraint;

import fr.irisa.triskell.kermeta.language.behavior.EmptyExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ConstraintInterpreter;

public class EmptyExpressionConstraintInterpreter {

	static public RuntimeObject doIt(EmptyExpression node, ConstraintInterpreter interpreter) {
		return null;
	}

}


