
/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 20 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.eclipse.builder.internal;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
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
	
	protected MessagingSystem messaggingSystem;

	private WorkspaceResourceChangeListener workspaceResourceChangeListener;
	
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
		messaggingSystem = new EclipseMessagingSystem(PLUGIN_ID, "Kermeta builder console");
		workspaceResourceChangeListener = new WorkspaceResourceChangeListener();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(workspaceResourceChangeListener  );
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


	

}
