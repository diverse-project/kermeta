
/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 20 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.builder.eclipse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.language.builder.eclipse.internal.WorkspaceResourceChangeListener;
import org.kermeta.language.builder.eclipse.preferences.PreferenceConstants;
import org.kermeta.utils.systemservices.eclipse.api.ConsoleLogLevel;
import org.kermeta.utils.systemservices.eclipse.api.EclipseMessagingSystem;
import org.osgi.framework.BundleContext;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.language.eclipse.builder"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	private BundleContext myContext = null;
	
	protected EclipseMessagingSystem messaggingSystem;
	
	// currently wer run in only one JVM, so we can accept to use only one messagingSystem when running a kermeta program
	// when we will support several JVM, we'll need to use a smarter strategy
	protected EclipseMessagingSystem messaggingSystem4Runner;

	private WorkspaceResourceChangeListener workspaceResourceChangeListener;
	
	
	/**
	 * List of KermetaBuilderEventListener that must be notified
	 */
	public Set<KermetaBuilderEventListener> kermetaBuilderEventListeners = new HashSet <KermetaBuilderEventListener> (); 
	
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
		KermetaBuilder.getDefault();
		plugin = this;
		messaggingSystem 		= new EclipseMessagingSystem(PLUGIN_ID+".builder", "Kermeta builder console");
		messaggingSystem4Runner = new EclipseMessagingSystem(PLUGIN_ID+".runner", "Kermeta runner  console");
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		((EclipseMessagingSystem) messaggingSystem).setConsoleLogLevel(ConsoleLogLevel.String2Level(store.getString(PreferenceConstants.P_BUILDER_CONSOLE_LOG_LEVEL_CHOICE)));
		((EclipseMessagingSystem) messaggingSystem4Runner).setConsoleLogLevel(ConsoleLogLevel.String2Level(store.getString(PreferenceConstants.P_RUNNER_CONSOLE_LOG_LEVEL_CHOICE)));
		workspaceResourceChangeListener = new WorkspaceResourceChangeListener();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(workspaceResourceChangeListener  );
		this.setMyContext(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
    public void fireCompiledEvent(IProject prj) {
        Iterator<KermetaBuilderEventListener> it = kermetaBuilderEventListeners.iterator();
        while(it.hasNext()){
        	((KermetaBuilderEventListener)it.next()).projectCompiled(prj);
        }        
    }
	public void registerListener(KermetaBuilderEventListener listener) {
		kermetaBuilderEventListeners.add(listener);
	}
	public void unregisterListener(KermetaBuilderEventListener listener) {
		kermetaBuilderEventListeners.remove(listener);
	}
	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public EclipseMessagingSystem getMessaggingSystem() {
		return messaggingSystem;
	}
	
	public EclipseMessagingSystem getMessaggingSystem4Runner(String runnerName) {
		return messaggingSystem4Runner;
	}

	public BundleContext getMyContext() {
		return myContext;
	}

	public void setMyContext(BundleContext myContext) {
		this.myContext = myContext;
	}


	

}