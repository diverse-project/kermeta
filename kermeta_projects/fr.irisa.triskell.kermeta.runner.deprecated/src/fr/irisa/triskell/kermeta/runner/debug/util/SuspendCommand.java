/* $Id: SuspendCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : SuspendCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */
/* $Id: SuspendCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : SuspendCommand.java
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
public class SuspendCommand extends AbstractDebugCommand {
	
	protected String reason;
	
	public SuspendCommand(KermetaDebugThread t, String reason)
	{
		
	}
	
	public void execute()
	{
		System.err.println("suspend command!");
		
		int cause = DebugEvent.UNSPECIFIED;
		
		if ( 	reason.equals(KermetaDebugElement.STEP_INTO) || 
				reason.equals(KermetaDebugElement.STEP_OVER) || 
				reason.equals(KermetaDebugElement.STEP_RETURN) ) {
			cause = DebugEvent.STEP_END; }
		else if (reason.equals(KermetaDebugElement.SUSPEND)) {
			cause = DebugEvent.CLIENT_REQUEST;	}
		else if (reason.equals(KermetaDebugElement.SET_BREAKPOINT)){
			cause = DebugEvent.BREAKPOINT; }
		else {
			// RunnerPlugin.log(new Throwable("Unknown suspension cause (code: " + cause + ")"));
			cause = DebugEvent.UNSPECIFIED;
		}
	
		if (thread != null) {
			thread.setSuspended(true);
			thread.fireEvent(new DebugEvent(thread, DebugEvent.SUSPEND, cause));		
		}

		// getDebugInterpreter().setDebugMessage(DebugInterpreter.DEBUG_WAIT);	
	}
	
	
}
