/* $Id: InterpreterContext.java,v 1.20 2008-04-28 11:50:55 ftanguy Exp $
 * Project : Kermeta (First iteration)
 * File : InterpreterContext.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 16, 2005
 * Authors : 
 * 		Zo� Drey <zdrey@irisa.fr>
 * 		Didier Vojtisek <dvojtise@irisa.fr>
 * Description : 
 * 		see class javadoc
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Hashtable;
import java.util.Stack;


import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.CallableElement;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;

/**
 * The context of the interpreter. It contains a stack of contexts that are called <code>CallFrame</code>.
 * - A CallFrame is a context itself. It is the runtime representation of the Expression that is being processed (a Statement, 
 * a block of Statements, or any expression). Thus it is defined by the self object, the result of current Expression,
 * and a stack of ExpressionContexts.
 * 
 * - An ExpressionContext is the context for any expression that is not an operation call 
 * An example :
 * do
 * 		self.f1();
 * 		self.f2();   
 * end
 * 
 * operation f1() : Void is 
 * do
 * 		if something then
 * 	    	a := 1
 * 			b := 2
 * 			c := 3
 * 			if somethingelse then
 * 				e := 1
 * 			end
 * 		end
 * 		while something do
 * 			d := f3();
 * 		end
 * end
 * 
 * The CallFrame of operation call of f1() has the following hashtables as its ExpressionContexts:
 * 1) 1st element of stack	: expressionContext for the if	[(a, 1), (b, 2), (c, 3), (d, f2())]
 * 2) 2nd element of stack  : eC for the included if [(e, 1)]
 * 3) after pop of the precedings : new 1st element of stack : eC for the while	[(d, f2())]
 * 
 * There is 2 other callFrames :
 * - one for f2
 * - one for f3 inside f1
 * 
 * How we process for the stack of ExpressionContexts :
 * push (1)
 * push (2)
 * pop (2)
 * pop (1)
 * push (3)
 * 
 * How we process for the stack of CallFrames :
 * 
 * push (f1);
 * push (f3);
 * process f3 (which also push/pop callFrames and expressionContexts);
 * pop (f3) ; // since we finished processing it
 * pop (f1);
 * push (f2);
 *  
 */
public class InterpreterContext {

    /**
     * This stack contains CallFrames (one for each operation call).
     * 
     */
    protected Stack<CallFrame> frame_stack;
    protected RuntimeMemory memory;

    // Contains interpreter variables (global variables such as stdio)
    protected Hashtable<String, Variable> interpreterVariables;
    
    
    /**
     * <code>typeCache</code> is a structure used to optimize some computation on types.
     * It takes care of type binding.
     */
    public TypeCache typeCache = new TypeCache();
    
    
    /**
     * Constructor
     */
    public InterpreterContext(RuntimeMemory memory) {
    	frame_stack = new Stack<CallFrame>();
    	this.memory = memory;
    	interpreterVariables = new Hashtable<String, Variable>();
    	initializeInterpreterVariables(memory);
    }
    
    protected void initializeInterpreterVariables(RuntimeMemory memory) {
        interpreterVariables.put("stdio", new Variable("stdio", memory.stdioINSTANCE));
    }
	
	/**
	 * @param self_object : the object on which an operation was applied. This operation is
	 * the one that led to the creation of this new CallFrame
	 */
	public void pushOperationCallFrame(RuntimeObject self_object, CallableElement callable, List<RuntimeObject> parameters, CallExpression expression)
	{
	    CallFrame new_frame = new OperationCallFrame(this, callable, self_object, parameters, expression);
	    frame_stack.push(new_frame);
	}

	public void pushLambdaCallFrame(LambdaCallFrame frame) {
	    frame_stack.push(frame);
	}
	
	public void pushExpressionCallFrame(ExpressionCallFrame frame) {
	    frame_stack.push(frame);
	}
	
	public void popCallFrame() {
	    frame_stack.pop();
	}
	
	public CallFrame peekCallFrame()
	{
	    return (CallFrame)frame_stack.peek();
	}
	
	public Variable getInterpreterVariableByName(String name) {
	    return interpreterVariables.get(name);
	}
    public RuntimeMemory getMemory() {
        return memory;
    }
    
    /** Return the frame_stack. If there is no frame, the stack is empty (and not "null") */
    public Stack<CallFrame> getFrameStack() {
    	return frame_stack;
    }
    
    public Hashtable<String, Variable> getInterpreterVariables() {
    	return interpreterVariables;
    }

}
