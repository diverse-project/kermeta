
/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 20 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.systemservices.eclipse;

import java.io.PrintStream;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.eclipse.internal.EclipseConsoleOutputStream;
import org.kermeta.utils.systemservices.eclipse.internal.console.ConsoleIO;
import org.kermeta.utils.systemservices.eclipse.internal.console.EclipseConsoleIO;
import org.kermeta.utils.systemservices.eclipse.internal.console.EclipseConsoleIOFactory;
import org.kermeta.utils.systemservices.eclipse.preferences.PreferenceConstants;
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
	protected EclipseConsoleIO consoleIO;

	
	

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
		Boolean mustCapture = getPreferenceStore().getBoolean(PreferenceConstants.P_CAPTURE_SYSTEM_ERROUT);
		if(mustCapture){
			captureSystemOutAndErr();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {

		releaseSystemOutAndErr();
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

	public void clearConsole(){
		getConsoleIO().clear();
	}
	public ConsoleIO getConsoleIO() {
		return consoleIO;
	}
	
	protected PrintStream OriginalSystemOut = null;
	protected PrintStream OriginalSystemErr = null;
	/** 
	 * set the current System.out and System.err so they are redirected to our default console
	 */
	public void captureSystemOutAndErr() {
		consoleIO.print("Redirecting System.out and System.err to this console.\n");
		if (OriginalSystemOut != System.out){
			OriginalSystemOut = System.out;
			PrintStream outPrintStream = new PrintStream(new EclipseConsoleOutputStream(Activator.getDefault().getConsoleIO(), false));
			System.setOut(outPrintStream);
		}
		if (OriginalSystemErr != System.err){
			OriginalSystemOut = System.out;
			PrintStream errPrintStream = new PrintStream(new EclipseConsoleOutputStream(Activator.getDefault().getConsoleIO(), true));
			System.setErr(errPrintStream);
		}
	}

	/** 
	 * set back the System.out and System.err to their original values
	 */
	public void releaseSystemOutAndErr() {
		if(System.out != null) System.out.flush();
		if(System.err != null) System.err.flush();
		consoleIO.print("Stopping redirection of System.out and System.err to this console.\n");
		if(OriginalSystemOut != null) System.setOut(OriginalSystemOut);
		if(OriginalSystemErr != null) System.setErr(OriginalSystemErr);
		OriginalSystemOut = null;
		OriginalSystemErr = null;
	}

}
