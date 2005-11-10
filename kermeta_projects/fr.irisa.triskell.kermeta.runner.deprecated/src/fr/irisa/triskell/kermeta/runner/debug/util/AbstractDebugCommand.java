/* $Id: AbstractDebugCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : AbstractDebugCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */
/* $Id: AbstractDebugCommand.java,v 1.1 2005-11-10 15:44:28 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : AbstractDebugCommand.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 10, 2005
 * Authors       : zdrey
 */

package fr.irisa.triskell.kermeta.runner.debug.util;

import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugTarget;
import fr.irisa.triskell.kermeta.runner.debug.model.KermetaDebugThread;

/**
 * @author zdrey
 * This is the command created
 */
public abstract class AbstractDebugCommand {

	/** the debug target itself ?*/
	KermetaDebugTarget target;
	/** the thread linked to this command */
	KermetaDebugThread thread;
	
	/** You must implement this method */
	public void execute()
	{ 
		System.err.println("TODO : you must implement this method execute!");
	}
	
	
}
