/* $Id: StepIntoCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : StepIntoCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.util;

import org.eclipse.debug.core.DebugEvent;

import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;

public class StepIntoCommand extends AbstractDebugCommand
{

	public StepIntoCommand(KermetaDebugThread t)
	{
		thread = t;
	}
	
	public void execute()
	{
		System.err.println("step into command!");
		thread.setSuspended(false);
		thread.fireEvent(new DebugEvent(thread, DebugEvent.SUSPEND, DebugEvent.STEP_INTO));
	}
	
}
