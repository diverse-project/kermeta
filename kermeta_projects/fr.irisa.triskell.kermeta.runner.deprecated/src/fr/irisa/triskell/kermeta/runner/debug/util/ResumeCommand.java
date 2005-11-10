/* $Id: ResumeCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : ResumeCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */
/* $Id: ResumeCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : ResumeCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */

package fr.irisa.triskell.kermeta.runner.debug.util;

import org.eclipse.debug.core.DebugEvent;

import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugElement;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;

/**
 * @author zdrey
 *
 */
public class ResumeCommand extends AbstractDebugCommand
{
	/** The reason of the call of the resume request. (begining of a step?, 
	 *  user request?) */
	protected String reason;
	
	public ResumeCommand(KermetaDebugThread t, String reason)
	{
		
	}
	
	public void execute()
	{
		System.err.println("step into command!");
		int cause = DebugEvent.UNSPECIFIED;
		if (reason.equals(KermetaDebugElement.RESUME)) {
			cause = DebugEvent.CLIENT_REQUEST;	}
		else {
			// RunnerPlugin.log(new Throwable("Unknown suspension cause (code: " + cause + ")"));
			cause = DebugEvent.UNSPECIFIED;
		}
	
		if (thread != null) {
			thread.setSuspended(false);
			thread.fireEvent(new DebugEvent(thread, DebugEvent.RESUME, cause));		
		}
	}
	
}
