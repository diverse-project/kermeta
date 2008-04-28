

package org.kermeta.interpreter.internal;

import java.util.List;

import org.kermeta.interpreter.InterpreterPlugin;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.Variable;
import fr.irisa.triskell.kermeta.language.behavior.CallVariable;
import fr.irisa.triskell.kermeta.runtime.RuntimeLambdaObject;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class CallVariableInterpreter {

	static public RuntimeObject doIt(CallVariable node, ExpressionInterpreter interpreter) {
        RuntimeObject result;
        Variable var = interpreter.getInterpreterContext().peekCallFrame().getVariableByName(node.getName());

        // This is for debugg purposes it should never happend
        if (var == null) {
        	InterpreterPlugin.internalLog.error("INTERPRETER INTERNAL ERROR : unable to find variable in context :" + node.getName());
            throw new Error("INTERPRETER INTERNAL ERROR : unable to find variable in context :" + node.getName());
        }

        // It is a simple variable call
        if (node.getParameters().size() == 0)
        {
            result = var.getRuntimeObject();
            interpreter.current_variable = var;
            // We add additional information in order to have a better handle of
            // errors --> FIXME : it perhaps pollute the memory not very smartly...
            //result.getData().put(" ");
            
        }
        // it is a call to a lambda expression
        else {

            // This is for debugg purposes it should never happend
            if (!(var.getRuntimeObject() instanceof RuntimeLambdaObject)) {
            	InterpreterPlugin.internalLog.error("INTERPRETER INTERNAL ERROR : function call on variable " + node.getName() + " which does not contain a function");
                throw new Error("INTERPRETER INTERNAL ERROR : function call on variable " + node.getName() + " which does not contain a function");
            }
            
            // Get the function
            RuntimeLambdaObject func = (RuntimeLambdaObject) var.getRuntimeObject();

            // Compute actual parameters
            List<RuntimeObject> paramAList = interpreter.visitList(node.getParameters());
            
            
            // Call the function
            result = func.call(interpreter, paramAList);
            
            
            }

        return result;
	}

}


