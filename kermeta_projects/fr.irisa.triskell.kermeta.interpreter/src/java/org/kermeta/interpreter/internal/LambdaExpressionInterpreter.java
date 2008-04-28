

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.runtime.RuntimeLambdaObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class LambdaExpressionInterpreter {

	static public RuntimeObject doIt(LambdaExpression node, ExpressionInterpreter interpreter) {
		if (node!=null) 
			interpreter.setParent(node);
	    RuntimeObject result = new RuntimeLambdaObject(node, 
	    												interpreter.getMemory().getROFactory(),
	    												interpreter.getInterpreterContext().peekCallFrame(), 
	    												interpreter.getInterpreterContext());
	    return result;
	}

}


