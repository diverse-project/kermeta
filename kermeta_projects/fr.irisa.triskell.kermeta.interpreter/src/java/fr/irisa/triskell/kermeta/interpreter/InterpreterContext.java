/* $Id: InterpreterContext.java,v 1.2 2005-03-25 16:40:18 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : InterpreterContext.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 16, 2005
 * Author : Zoé Drey <zdrey@irisa.fr>
 * Description : describe here file content
 * TODO : 
 * 
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.Iterator;
import java.util.Stack;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

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
 * 3) 3rd element of stack	: eC for the while	[(d, f2())]
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
     * @uml.property name="frame_stack"
     * @uml.associationEnd inverse="context:fr.irisa.triskell.kermeta.interpreter.CallFrame"
     * multiplicity="(0 -1)"
     */
    protected Stack frame_stack;

    /**
     * Current frame
     * 
     * @uml.property name="current_frame"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    protected CallFrame current_frame; // stack.peek should return the current one

	

	/**
	 * @param self_object : the object on which an operation was applied. This operation is
	 * the one that led to the creation of this new CallFrame
	 */
	public void pushNewCallFrame(RuntimeObject self_object)
	{
	    CallFrame new_frame = new CallFrame(self_object, this);
	    frame_stack.push(new_frame);
	}
	
	
	public Stack getFrameStack()
	{
	    return frame_stack;
	}
	
	public CallFrame getCurrentFrame()
	{
	    return (CallFrame)frame_stack.peek();
	}
}
