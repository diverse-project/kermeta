/* $Id: IKermetaDebugCondition.java,v 1.1 2005-11-24 14:26:53 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.interpreter (First iteration)
 * File      : IKermetaDebugCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 23, 2005
 * Authors       : 
 * 	zdrey <zdrey@irisa.fr>
 *  dpollet <dpollet@irisa.fr>
 */
package fr.irisa.triskell.kermeta.interpreter.debug;

import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;


public interface IKermetaDebugCondition {
	
	/**
	 * Blocks the interpreter by controlling the thread/process inside which it turns.
	 */
	public abstract void blockInterpreter();
	
	public abstract String getConditionType(); // stepInto, stepOver, terminate

	public abstract void setDebugInterpreter(DebugInterpreter interpreter);
	
	// Eval the stop condition 
	/**
	 * @return true if the stopCondition is true, false overwise
	 */
	public abstract boolean evaluate();
	
}
