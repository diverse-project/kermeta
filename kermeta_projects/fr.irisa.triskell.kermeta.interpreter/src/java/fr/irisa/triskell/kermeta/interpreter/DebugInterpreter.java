/* $Id: DebugInterpreter.java,v 1.1 2005-09-09 17:46:04 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : DebugInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 8, 2005
 * Authors       : (zdrey)
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.behavior.FAssignement;
import fr.irisa.triskell.kermeta.behavior.FBlock;
import fr.irisa.triskell.kermeta.behavior.FBooleanLiteral;
import fr.irisa.triskell.kermeta.behavior.FCallFeature;
import fr.irisa.triskell.kermeta.behavior.FExpression;

import fr.irisa.triskell.kermeta.behavior.FRescue;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

/**
 * This is the ExpressionInterpreter improved to handle the debugging mode 
 */
public class DebugInterpreter extends ExpressionInterpreter {

    EObject current_eobject;
    int current_statement_position;
    FBlock current_block;
    
    /**
     * @param pMemory
     */
    public DebugInterpreter(RuntimeMemory pMemory) {
        super(pMemory);
        current_statement_position = 0;
        // TODO Auto-generated constructor stub
    }
    
    
	/**
	 * Visit an operation definition. 
	 * This visit usually follows the visit of a FCallFeature that is an operation call 
	 * This has the following steps :
	 * 	- Create an expression context for the variables defined at "top level" in this operation
	 *
	 * "Here" begins the debugging/execution of a Kermeta program
	 * @see kermeta.visitor.MetacoreVisitor#visit(metacore.structure.FOperation)
	 */
	public Object visitFOperation(FOperation node) {
	    System.err.println("VISIT OPERATION IN DEBUG MODE!");
	    RuntimeObject result = memory.voidINSTANCE;
	    // push expression context
	    interpreterContext.peekCallFrame().pushExpressionContext();
	    try {
		    // Interpret body
	        // Developer note : here shoudl visitFBlock called
		    current_eobject = node.getFBody();
		    // execCommand()-liike
		    this.accept(current_eobject);
		    
		    // Set the result
		    result = interpreterContext.peekCallFrame().getOperationResult();
	    }
	    finally {
		    // Pop the expressionContext
		    interpreterContext.peekCallFrame().popExpressionContext();
	    }
		return result;
	}


    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFAssignement(fr.irisa.triskell.kermeta.behavior.FAssignement)
     */
    public Object visitFAssignement(FAssignement node) {
        
        // TODO Auto-generated method stub
        return super.visitFAssignement(node);
    }
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFBlock(fr.irisa.triskell.kermeta.behavior.FBlock)
     */
    public Object visitFBlock(FBlock node)
    {
        System.err.println("VISIT BLOCK IN DEBUG MODE! (" + current_statement_position +")");
	    RuntimeObject result = memory.voidINSTANCE;
	    // process the statements
	    try {
	        // Execute the block -- pushExpressionContext -> peekIt
	        // If we have pas
	        if (current_statement_position == 0)
	            interpreterContext.peekCallFrame().pushExpressionContext();
	        try
	        {
	            // Need it
	            current_block = node;
	            current_eobject = (EObject)node.getFStatement().get(current_statement_position);
	            this.accept(current_eobject);
	            update();
	        }
	        finally {
	            if (current_statement_position == node.getFStatement().size())
	                interpreterContext.peekCallFrame().popExpressionContext();
	        }
	    }
	    catch(KermetaRaisedException ex) {
	        Iterator it = node.getFRescueBlock().iterator();
	        FRescue resc_block = null;
	        while (it.hasNext() && resc_block == null) {
	            FRescue r = (FRescue)it.next();
	            if (r.getFExceptionType() == null)
	                resc_block = r;
	            else {
	                SimpleType exprected =  new SimpleType(r.getFExceptionType().getFType());
	                SimpleType provided = new SimpleType((FClass)ex.raised_object.getMetaclass().getData().get("kcoreObject"));
	                if (provided.isSubTypeOf(exprected)) {
	                    resc_block = r;
	                }
	            }
	        }
	        if (resc_block == null) throw ex;
	        
	        // Execute the rescue block
	        interpreterContext.peekCallFrame().pushExpressionContext();
	        
	        try {
	        
	        if (resc_block.getFExceptionType() != null)
	            interpreterContext.peekCallFrame().peekExpressionContext().defineVariable(resc_block.getFExceptionName(), ex.raised_object);
	        	ArrayList res = visitList(resc_block.getFBody());
	        	if (res.size() > 0) 
			        result = (RuntimeObject)res.get(res.size()-1);
	        }
	        finally {
	            interpreterContext.peekCallFrame().popExpressionContext();
	        }
	    }
	    return result;
    }
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFBooleanLiteral(fr.irisa.triskell.kermeta.behavior.FBooleanLiteral)
     */
    public Object visitFBooleanLiteral(FBooleanLiteral node) {
        // TODO Auto-generated method stub
        return super.visitFBooleanLiteral(node);
    }
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitFCallFeature(fr.irisa.triskell.kermeta.behavior.FCallFeature)
     */
    public Object visitFCallFeature(FCallFeature node) {
        // TODO Auto-generated method stub
        return super.visitFCallFeature(node);
    }
    
    /** Update the needed values for the debug */
/*	public Object accept(EObject node) {
		// Throw an error if the node is null
		if (node == null) {
			throw new Error("Error in visitor : the node to visit is null");
		}
		// Get the accept command
		AcceptCommand cmd = KermetaOptimizedVisitor.getAcceptCmd(node);
		// Throw an error is the command is null
		if (cmd == null) {
			throw new Error(
					"Error in visitor : no strategy to handle node of type "
							+ node.getClass().getName());
		}
		// accept the node
		return cmd.accept(node, this);
	}*/
    public void update()
    {
        current_statement_position += 1;
    }
 
    /* 
     *
     * The following methods represent the debugger commands.
     * Later command pattern use will be useful
     * Yet, we only have implemented step over, but we have to consider the following:
     *  
     *  - step over (step without going into subroutine) 
     *  - step into
     *  - step X where X is the number of statements to execute before next step
     *  - run to next breakpoint
     */
    
    /**
     * @param expression : expression to execute
     */
    public void stepOver()
    {
        // Interprete the expression
        // update current_statement
        this.accept(current_block);
    }
}
