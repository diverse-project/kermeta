/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.mopp;

/**
 * A singleton class for the text resource plug-in.
 */
public class KpPlugin /*extends org.eclipse.core.runtime.Plugin */{
	
	public static final String PLUGIN_ID = "org.kermeta.kp.editor";
	/**
	 * The version of EMFText that was used to generate this plug-in.
	 */
	public static final String EMFTEXT_SDK_VERSION = "1.3.3";
	/**
	 * The ID of the extension point to register default options to be used when
	 * loading resources with this plug-in.
	 */
	public static final String EP_DEFAULT_LOAD_OPTIONS_ID = PLUGIN_ID + ".default_load_options";
	public static final String EP_ADDITIONAL_EXTENSION_PARSER_ID = PLUGIN_ID + ".additional_extension_parser";
	
	private static KpPlugin plugin;
	
	public KpPlugin() {
		//super();
	}
	
	public void start(org.osgi.framework.BundleContext context) throws Exception {
		//super.start(context);
		plugin = this;
	}
	
	public void stop(org.osgi.framework.BundleContext context) throws Exception {
		plugin = null;
		//super.stop(context);
	}
	
	public static KpPlugin getDefault() {
		return plugin;
	}
	
	/**
	 * Helper method for error logging.
	 * 
	 * @param message the error message to log
	 * @param exception the exception that describes the error in detail
	 * 
	 * @return the status object describing the error
	 */
	public static void /*org.eclipse.core.runtime.IStatus*/ logError(String message, Throwable exception) {
		/*org.eclipse.core.runtime.IStatus status;
		if (exception != null) {
			status = new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, KpPlugin.PLUGIN_ID, 0, message, exception);
		} else {
			status = new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, KpPlugin.PLUGIN_ID, message);
		}
		final KpPlugin pluginInstance = KpPlugin.getDefault();
		if (pluginInstance == null) {
		*/
			System.err.println(message);
			if (exception != null) {
				exception.printStackTrace();
			}
		/*			
		} else {
			pluginInstance.getLog().log(status);
		}
		return status;*/
	}
}
