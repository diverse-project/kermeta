

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.Raise;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class RaiseInterpreter {

	static public RuntimeObject doIt(Raise node, ExpressionInterpreter interpreter) {
        // TODO : improve this to allow exception to be rescued.
        RuntimeObject exception = (RuntimeObject) interpreter.accept(node.getExpression());
        // DVK: I don't understand why we should use the CallFrame exception here: (more it is often null !
        // the node is enough to compute a context
        //raiseKermetaException(exception, interpreterContext.peekCallFrame().getExpression());
        interpreter.raiseKermetaException(exception, node);
        
        // This is dead code
        return null;	}

}


