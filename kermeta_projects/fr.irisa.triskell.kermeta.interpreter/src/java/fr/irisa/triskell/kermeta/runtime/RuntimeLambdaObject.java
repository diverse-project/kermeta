/* $Id: RuntimeLambdaObject.java,v 1.3 2005-05-25 17:42:56 ffleurey Exp $
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

import fr.irisa.triskell.kermeta.behavior.FLambdaExpression;
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
     * */
    protected LambdaCallFrame frame;
    protected FLambdaExpression lambdaExpression;

    /**
     * Constructor
     * @param factory
     * @param FLambdaExpression : the lambda expression represented by this runtime
     * lambda object. We need it as the body is only evaluated "after"
     */
    public RuntimeLambdaObject(FLambdaExpression node, RuntimeObjectFactory factory, CallFrame nestingFrame, InterpreterContext context) {
        super(factory, null);
        /*
         * This runtime object has no metaclass : it is a function, not a kermeta object
         */
        this.lambdaExpression = node;
        this.frame = new LambdaCallFrame(context, node, nestingFrame);
    }
    
    /**
     * The lambda parameters of this lambda expression.
     * We assign each parameter to the value of the parameters inside a lambdaexpression' call.
     * (This operation is called when encountering a lambda expression call)
     * @param params
     */
    public void setActualParameters(ArrayList rparams)
    {
        frame.bindActualParameter(rparams);
    }
    
    /**
     * Call the function with a set of actual parameter (list of RuntimeObject)
     * @param interpreter
     * @param actual_params
     * @return
     */
    public RuntimeObject call(ExpressionInterpreter interpreter, ArrayList actual_params) {
        frame.bindActualParameter(actual_params);
        interpreter.getInterpreterContext().pushLambdaCallFrame(frame);
        RuntimeObject result = (RuntimeObject)interpreter.accept(lambdaExpression.getFBody());
        interpreter.getInterpreterContext().popCallFrame();
        return result;
    }
	

    /**
     * @return Returns the lambdaExpression.
     */
    public FLambdaExpression getLambdaExpression() {
        return lambdaExpression;
    }

}