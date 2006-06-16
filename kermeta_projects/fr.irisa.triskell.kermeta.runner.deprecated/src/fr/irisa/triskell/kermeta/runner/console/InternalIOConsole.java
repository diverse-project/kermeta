/* $Id: InternalIOConsole.java,v 1.4 2006-06-16 09:33:16 zdrey Exp $
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

	/**
	 * @return Returns the isDisposed.
	 */
	public boolean isDisposed() {
		return isDisposed;
	}

	/**
	 * @param isDisposed The isDisposed to set.
	 */
	public void setDisposed(boolean isDisposed) {
		this.isDisposed = isDisposed;
	}
	
	// This is for ProcessConsole extension
	/* public InternalIOConsole(IProcess process, IConsoleColorProvider colorProvider, String encoding) {
		super(process, colorProvider, encoding);
		isDisposed = false;
	}
	*/
}
