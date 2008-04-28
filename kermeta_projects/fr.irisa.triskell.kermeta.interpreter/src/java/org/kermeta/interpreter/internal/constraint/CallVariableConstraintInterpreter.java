

package org.kermeta.interpreter.internal.constraint;

import org.kermeta.interpreter.internal.CallVariableInterpreter;

import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ConstraintInterpreter;

public class CallVariableConstraintInterpreter {

	static public RuntimeObject doIt(CallVariable node, ConstraintInterpreter interpreter) {
		RuntimeObject result = CallVariableInterpreter.doIt(node, interpreter);
		// It is a simple variable call
		if ( node.getParameters().size() == 0 ) {
			if ( node.isIsAtpre() && interpreter.atpreV.getListCallVariableAtPre().indexOf(node) != -1 ) {
				int index = interpreter.atpreV.getListCallVariableAtPre().indexOf(node);
				result = (RuntimeObject) interpreter.atpreV.getListCallVariableAtPre().get(index + 1);
			}
		}
		return result;
	}

}


