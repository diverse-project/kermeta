/* $Id: StepReturnCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : StepReturnCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.util;

import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;

public class StepReturnCommand extends AbstractDebugCommand {
	
	public StepReturnCommand(KermetaDebugThread t)
	{
		thread = t;
	}
	
	public void execute() {}

}
