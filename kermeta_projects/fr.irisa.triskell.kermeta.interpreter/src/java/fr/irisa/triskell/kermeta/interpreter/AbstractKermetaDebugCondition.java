/* $Id: AbstractKermetaDebugCondition.java,v 1.2 2005-12-01 18:41:11 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.interpreter (First iteration)
 * File      : IKermetaDebugConditionWrong.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : 
 * 	zdrey <zdrey@irisa.fr>
 *  dpollet <dpollet@irisa.fr>
 */
package fr.irisa.triskell.kermeta.interpreter;

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;

/** TODO : transform it in an AbstractClass */
public abstract class AbstractKermetaDebugCondition {
	
	protected EObject currentNode;
	/** Tells if the debugging needs to be suspended or not (used by the evaluate method) */
	protected boolean isSuspended;
	/** "stepInto", "stepOver", "stepReturn", or "resume" */
	protected String conditionType;
	/**
	 * Blocks the interpreter by controlling the thread/process inside which it turns.
	 */
	public abstract void blockInterpreter();
	 
	/**
	 * @return true if the stopCondition is true, false overwise
	 */
	public abstract boolean evaluate();

	/**
	 * Tell the debug condition where we are in the debug execution,
	 * so that we can find the line where we are and compare it to the lines of
	 * the breakpoints that are defined.
	 * @param node the current position where the condition is called
	 */
	public void setCurrentNode(EObject node) { currentNode = node; }
	
	/** 
	 * 
	 * @return the current node that the debugInterpreter is about to visit 
	 */
	public EObject getCurrentNode() { return currentNode; }
	
	/**
	 * Sets the isSuspended boolean.
	 */
	public void setSuspended(boolean suspend) { isSuspended = suspend ; }
	
	/** 
	 * Returns the type of the stop condition as a string. This method is used by the
	 * debug interpreter to control the execution of the debug command. The debug Interpreter
	 * sets a special variable according to the type of the condition that is then checked by
	 * the remote side of the interpreter to suspend its thread at the appropriate time.
	 * @return the type of the stop condition as a string. Can be stepInto, stepOver,
	 * stepReturn, resume.
	 */
	public String getConditionType() { return conditionType; }
}
