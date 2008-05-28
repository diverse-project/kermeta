package fr.irisa.triskell.kermeta.touchnavigator;

import org.apache.commons.logging.Log;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * The main plugin class to be used in the desktop.
 */
public class TouchNavigatorPlugin extends AbstractUIPlugin {

	//The shared instance.
	private static TouchNavigatorPlugin plugin;
	
	public static final String EMFModelTouchView_ID = "fr.irisa.triskell.kermeta.touchnavigator.views.EMFModelTouchView";
	
	final static public Log internalLog = LogConfigurationHelper.getLogger("TouchNavigator");
	
	/**
	 * The constructor.
	 */
	public TouchNavigatorPlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static TouchNavigatorPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("fr.irisa.triskell.kermeta.touchnavigator", path);
	}
}
