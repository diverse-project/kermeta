package org.kermeta.kompren.texteditor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.eclipse.api.EclipseMessagingSystem;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.kompren.texteditor"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	// The IFile dirty
	public Map<IFile,String> dirtyFilesContainment = new HashMap<IFile,String>();
	
	protected MessagingSystem messaggingSystem;
	
	
	
	/**
	 * The constructor
	 */
	public Activator() {
		super();
	}

	
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		messaggingSystem = new EclipseMessagingSystem("komprenConsole", "Kompren console");
	}

	
	@Override
	public void stop(final BundleContext context) throws Exception {
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

//	/**
//	 * Returns an image descriptor for the image file at the given
//	 * plug-in relative path
//	 *
//	 * @param path the path
//	 * @return the image descriptor
//	 */
//	public static ImageDescriptor getImageDescriptor(String path) {
//		return imageDescriptorFromPlugin(PLUGIN_ID, path);
//	}
	
	
	public MessagingSystem getMessaggingSystem() {
		return messaggingSystem;
	}
}
