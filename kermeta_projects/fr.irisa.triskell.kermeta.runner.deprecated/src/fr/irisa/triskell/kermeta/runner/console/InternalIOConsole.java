/* $Id: InternalIOConsole.java,v 1.3 2006-06-15 13:21:24 zdrey Exp $
 * Project    : fr.irisa.triskell.kermeta.runner
 * File       : MessageConsole.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : Jun 13, 2006
 * Authors : 
 *    zdrey <zdrey@irisa.fr>
 * Contributors :
 */
package fr.irisa.triskell.kermeta.runner.console;

import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.internal.ui.views.console.ProcessConsole;
import org.eclipse.debug.ui.console.IConsoleColorProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.MessageConsole;

/** Extends io console with a boolean indicating if console is disposed (ie not used anymore)
 * or not */
public class InternalIOConsole extends IOConsole
{ //extends ProcessConsole {

	public boolean isDisposed;
	
	public InternalIOConsole(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
		isDisposed = false;
	}
	// This is for ProcessConsole extension
	/* public InternalIOConsole(IProcess process, IConsoleColorProvider colorProvider, String encoding) {
		super(process, colorProvider, encoding);
		isDisposed = false;
	}
	*/
}
