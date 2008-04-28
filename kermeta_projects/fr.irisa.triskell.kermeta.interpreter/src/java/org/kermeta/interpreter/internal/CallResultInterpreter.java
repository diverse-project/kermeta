

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.CallResult;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class CallResultInterpreter {

	static public RuntimeObject doIt(CallResult node, ExpressionInterpreter interpreter) {
	    RuntimeObject value = interpreter.getInterpreterContext().peekCallFrame().getOperationResult();
	    if (value==null)
	    	System.err.println("result not found in context");
	    return value;	
	}

}


