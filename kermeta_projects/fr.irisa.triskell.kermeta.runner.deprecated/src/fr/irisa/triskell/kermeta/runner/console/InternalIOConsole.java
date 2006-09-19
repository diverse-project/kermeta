/* $Id: InternalIOConsole.java,v 1.6 2006-09-19 14:37:55 zdrey Exp $
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

import org.eclipse.core.runtime.Preferences.IPropertyChangeListener;
import org.eclipse.core.runtime.Preferences.PropertyChangeEvent;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.IOConsole;

/** Extends io console with a boolean indicating if console is disposed (ie not used anymore)
 * or not */
public class InternalIOConsole extends IOConsole implements IDebugEventSetListener, IPropertyChangeListener
{ //extends ProcessConsole {

	public boolean isDisposed;
	protected KermetaConsole kermetaConsole;
	
	public InternalIOConsole(String name, ImageDescriptor imageDescriptor) {
		super(name, imageDescriptor);
		isDisposed = false;
	}
	
	public void setKermetaConsole(KermetaConsole kconsole)
	{
		kermetaConsole = kconsole;
	}

	public KermetaConsole getKermetaConsole()
	{
		return kermetaConsole;
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

	public void handleDebugEvents(DebugEvent[] events) {
		// TODO Auto-generated method stub
	}

	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
	}
}
