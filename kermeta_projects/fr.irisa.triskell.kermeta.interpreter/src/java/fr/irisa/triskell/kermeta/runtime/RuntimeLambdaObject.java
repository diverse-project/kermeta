/* $Id: RuntimeLambdaObject.java,v 1.6 2006-03-03 15:21:47 dvojtise Exp $
 * Project: Kermeta (First iteration)
 * File: RuntimeLambdaObject.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: Apr 21, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runtime;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.language.behavior.LambdaExpression;
import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.LambdaCallFrame;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

/**
 * A special RuntimeObject for LambdaExpressions :
 * it is a RuntimeObject that contains an internal context, stored in a hashtable.
 */
public class RuntimeLambdaObject extends RuntimeObject {
    
    /** 
     *The context in which the expression is executed
     *frame is a prototype call frame
     * */
    protected LambdaCallFrame frame;
    protected LambdaExpression lambdaExpression;

    /**
     * Constructor
     * @param factory
     * @param LambdaExpression : the lambda expression represented by this runtime
     * lambda object. We need it as the body is only evaluated "after"
     */
    public RuntimeLambdaObject(LambdaExpression node, RuntimeObjectFactory factory, CallFrame nestingFrame, InterpreterContext context) {
        super(factory, null);
        /*
         * This runtime object has no metaclass : it is a function, not a kermeta object
         */
        this.lambdaExpression = node;
        this.frame = new LambdaCallFrame(context, node, nestingFrame);
    }

    
    /**
     * Call the function with a set of actual parameter (list of RuntimeObject)
     * @param interpreter
     * @param actual_params
     * @return
     */
    public RuntimeObject call(ExpressionInterpreter interpreter, ArrayList actual_params) {
        LambdaCallFrame frame = this.frame.cloneLambdaCallFrame();
        frame.bindActualParameter(actual_params);
        RuntimeObject result = interpreter.getMemory().voidINSTANCE;
        
        interpreter.getInterpreterContext().pushLambdaCallFrame(frame);
        try {
            result = (RuntimeObject)interpreter.accept(lambdaExpression.getBody());
        }
        finally {
            interpreter.getInterpreterContext().popCallFrame();
        }
        
        return result;
    }
	

    /**
     * @return Returns the lambdaExpression.
     */
    public LambdaExpression getLambdaExpression() {
        return lambdaExpression;
    }

}