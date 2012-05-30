
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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.language.builder.eclipse.internal.WorkspaceResourceChangeListener;
import org.kermeta.language.builder.eclipse.preferences.PreferenceConstants;
import org.kermeta.utils.provisionner4eclipse.Activator;
import org.kermeta.utils.systemservices.eclipse.api.ConsoleLogLevel;
import org.kermeta.utils.systemservices.eclipse.api.EclipseMessagingSystem;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	/** list of bundle that must be started before we really start ourself */
	public String[] requiredStartedBundleNames = {"org.ops4j.pax.url.mvn"};
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.language.builder.eclipse"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	private BundleContext myContext = null;
	
	protected EclipseMessagingSystem messaggingSystem = null;
	
	// currently wer run in only one JVM, so we can accept to use only one messagingSystem when running a kermeta program
	// when we will support several JVM, we'll need to use a smarter strategy
	protected EclipseMessagingSystem messaggingSystem4Runner = null;

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
		
		for (String requiredStartedBundleName : requiredStartedBundleNames) {
			Bundle requiredbundle = Platform.getBundle(requiredStartedBundleName);
			try {
				if(requiredbundle.getState() != Bundle.ACTIVE){
					requiredbundle.start();
				}
			} catch (BundleException e) {
				Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, 0, "failed to start "+requiredStartedBundleName +". Some URI protocols won't be available", e));
			}
		}
		
		super.start(context);
		KermetaBuilder.getDefault();
		plugin = this;
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
		if(messaggingSystem ==  null){			
			messaggingSystem = new EclipseMessagingSystem(PLUGIN_ID+".builder", "K2 builder console");
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			((EclipseMessagingSystem) messaggingSystem).setConsoleLogLevel(ConsoleLogLevel.String2Level(store.getString(PreferenceConstants.P_BUILDER_CONSOLE_LOG_LEVEL_CHOICE)));		
		}
		return messaggingSystem;
	}
	
	public EclipseMessagingSystem getMessaggingSystem4Runner(String runnerName) {
		if(messaggingSystem4Runner ==  null){			
			messaggingSystem4Runner = new EclipseMessagingSystem(PLUGIN_ID+".runner", "K2 runner console");
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			((EclipseMessagingSystem) messaggingSystem4Runner).setConsoleLogLevel(ConsoleLogLevel.String2Level(store.getString(PreferenceConstants.P_RUNNER_CONSOLE_LOG_LEVEL_CHOICE)));		
		}
		return messaggingSystem4Runner;
	}

	public BundleContext getMyContext() {
		return myContext;
	}

	public void setMyContext(BundleContext myContext) {
		this.myContext = myContext;
	}


	

}
