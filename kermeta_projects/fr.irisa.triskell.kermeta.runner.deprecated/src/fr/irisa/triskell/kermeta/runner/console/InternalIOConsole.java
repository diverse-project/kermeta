/* $Id: InternalIOConsole.java,v 1.1 2006-06-13 11:54:19 zdrey Exp $
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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.IOConsole;

/** Extends io console with a boolean indicating if console is disposed (ie not used anymore)
 * or not */
public class InternalIOConsole extends IOConsole {

	public boolean isDisposed;
	
	public InternalIOConsole(String name, String consoleType,
			ImageDescriptor imageDescriptor, boolean autoLifecycle) {
		super(name, consoleType, imageDescriptor, autoLifecycle);
		isDisposed = false;
	}

	public InternalIOConsole(String name, String consoleType,
			ImageDescriptor imageDescriptor, String encoding,
			boolean autoLifecycle) {
		super(name, consoleType, imageDescriptor, encoding, autoLifecycle);
		isDisposed = false;
	}

	public InternalIOConsole(String name, String consoleType,
			ImageDescriptor imageDescriptor) {
		super(name, consoleType, imageDescriptor);
		isDisposed = false;
	}

	public InternalIOConsole(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
		isDisposed = false;
	}

}
