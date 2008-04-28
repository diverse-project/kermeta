

package org.kermeta.interpreter.internal;

import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;

public class LoopInterpreter {

	static public RuntimeObject doIt(Loop node, ExpressionInterpreter interpreter) {
		if (node!=null) 
			interpreter.setParent(node);
		// Push a new expressionContext in the current CallFrame. 
        interpreter.getInterpreterContext().peekCallFrame().pushExpressionContext();
	    // Else
        try {
        	
	        // Accept initialization (a VariableDecl) : add a new variable in the ExpressionContext
	        interpreter.accept(node.getInitialization());
	        boolean cond_value=true;
	        
		    do
		    {
		    	// As we pushed a specific ExpressionContext in the loop to "protect" the
		    	// initialization of the loop condition, we set the current
		    	// statement that will be processed inside this ExpressionContext.
		    	// this line does not modify the behavior of the interpreter
		    	interpreter.getInterpreterContext().peekCallFrame().peekExpressionContext().setStatement(node.getStopCondition());
				
		        RuntimeObject cond_result = (RuntimeObject)interpreter.accept(node.getStopCondition());
		        // Get boolean value
		        if (RuntimeObject.BOOLEAN_VALUE.equals(cond_result.getPrimitiveType()) )
		            cond_value = ((Boolean)cond_result.getJavaNativeObject()).booleanValue();
		      else
		        {
		        	throw new Error("INTERPRETER INTERNAL ERROR : Loop : evaluation of the condition part does not result in a boolean value.");
		        }
		        
		        if (! cond_value)
		        	interpreter.accept(node.getBody());
		    } while (! cond_value);
		    
        }
        finally {
		    // Pop the expression context
        	interpreter.getInterpreterContext().peekCallFrame().popExpressionContext();
        }
	    return interpreter.memory.voidINSTANCE;
	}

}


