

package org.kermeta.interpreter.internal;

import org.kermeta.io.printer.KM2KMTPrettyPrinter;

import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;

public class ConditionalInterpreter {

	static public RuntimeObject doIt(Conditional node, ExpressionInterpreter interpreter) {
		if (node!=null) 
			interpreter.setParent(node);
	    // The result returned by the visit
	    RuntimeObject result = interpreter.memory.voidINSTANCE;
	    
        Expression cond = node.getCondition();

        // Set "cond" as the current statement that will be evaluated in the
        // current expressionContext
        interpreter.getInterpreterContext().peekCallFrame().peekExpressionContext().setStatement(cond);
        
        // Object should be a Boolean
        RuntimeObject cond_result = (RuntimeObject) interpreter.accept(cond);
        boolean cond_value=true;
        
        // Get boolean value
        if (RuntimeObject.BOOLEAN_VALUE.equals(cond_result.getPrimitiveType()) )
            cond_value = ((Boolean)cond_result.getJavaNativeObject()).booleanValue();
        else
        {
        	KM2KMTPrettyPrinter pp  = new KM2KMTPrettyPrinter(); 
        	throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
            		"Cannot evaluate the condition "+ pp.accept(cond) +" : expecting a boolean and got " + cond_result.toString(),
            		interpreter,
            		interpreter.memory,
    				cond,
    				null);
        }
        
        // if cond is true
        if (cond_value == true)
        {   
    		if (node.getThenBody() != null) 
    		    result = (RuntimeObject) interpreter.accept(node.getThenBody());
    		
        }
        else
        {   
            if (node.getElseBody() != null) {
                result = (RuntimeObject) interpreter.accept(node.getElseBody());
            }
        }
		return result;
	}

}


