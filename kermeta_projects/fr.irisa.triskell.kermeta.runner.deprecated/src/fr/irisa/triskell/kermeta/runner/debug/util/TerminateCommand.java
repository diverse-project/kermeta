/* $Id: TerminateCommand.java,v 1.2 2005-11-22 09:33:08 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : TerminateCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.util;

import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;

public class TerminateCommand extends AbstractDebugCommand
{
	
	
	public TerminateCommand(KermetaDebugThread t, String reason)
	{
		thread = t;
		
	}
	
	public void execute()
	{
		thread.fireTerminateEvent();
	}
	
}
