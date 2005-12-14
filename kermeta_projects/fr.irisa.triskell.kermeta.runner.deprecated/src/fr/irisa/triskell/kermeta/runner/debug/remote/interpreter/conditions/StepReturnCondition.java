/* $Id: StepReturnCondition.java,v 1.1 2005-12-14 17:19:55 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : StepReturnCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Dec 14, 2005
 * Authors       : zdrey
 */

package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions;

import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;

/**
 * @author zdrey
 *
 */
public class StepReturnCondition extends AbstractBreakpointStopCondition {

	
	
	public StepReturnCondition(KermetaRemoteInterpreter p_interpreter) {
		super(p_interpreter);
	}

	/** @see fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition#blockInterpreter() */
	public void blockInterpreter() {

	}

}
