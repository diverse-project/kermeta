
/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 20 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.systemservices.eclipse;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.eclipse.internal.console.ConsoleIO;
import org.kermeta.utils.systemservices.eclipse.internal.console.EclipseConsoleIOFactory;
import org.osgi.framework.BundleContext;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.utils.systemservices.eclipse"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	protected MessagingSystem messaggingSystem;
	protected ConsoleIO consoleIO;

	
	

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		messaggingSystem = new StdioSimpleMessagingSystem();
		
		// currently use only  one Console for everything, maybe later we can use a better strategy for having several consoles
		String bundleSymbolicName = this.getBundle().getHeaders().get("Bundle-SymbolicName").toString();
		String consoleUId = bundleSymbolicName+this.hashCode();
		consoleIO = EclipseConsoleIOFactory.getInstance().getConsoleIO(consoleUId, "Default kermeta console");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public MessagingSystem getMessaggingSystem() {
		return messaggingSystem;
	}

	public ConsoleIO getConsoleIO() {
		return consoleIO;
	}
	

}
