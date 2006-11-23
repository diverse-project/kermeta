package fr.irisa.triskell.sintaks;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class SintaksPlugin extends AbstractUIPlugin {

	//The shared instance.
	private static SintaksPlugin plugin;
	public static final String PLUGIN_ID = "fr.irisa.triskell.sintaks";
	public static final String MESSAGES_BUNDLE = PLUGIN_ID+".messages";
	public static final String PLUGIN_CONSOLE_NAME = PLUGIN_ID+".Console";
	private ResourceBundle resourceBundle;
    private ScopedPreferenceStore preferenceStore;
	private OptionManager optionManager;
	private static final int INTERNAL_ERROR = 10001;
	private PrintStream debugStream = null;

	/**
	 * The constructor.
	 */
	public SintaksPlugin() {
		plugin = this;
		try {
			resourceBundle = ResourceBundle.getBundle(MESSAGES_BUNDLE);
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
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
	public static SintaksPlugin getDefault() {
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
		return AbstractUIPlugin.imageDescriptorFromPlugin("fr.irisa.triskell.sintaks", path);
	}

	public IPreferenceStore getPreferenceStore() {
        // Create the preference store lazily.
        if (preferenceStore == null) {
            preferenceStore = new ScopedPreferenceStore(new InstanceScope(),getBundle().getSymbolicName());
        }
        return preferenceStore;
    }

    public OptionManager getOptionManager () {
        if (optionManager == null) {
        	optionManager = new OptionManager(getPreferenceStore());
        }
        return optionManager;
    }

    /**
	 * Returns the string from the plugin's resource bundle,
	 * or 'key' if not found.
	 */
	public static String getResourceString(String key) {
		ResourceBundle bundle = getDefault().getResourceBundle();
		try {
			return (bundle != null) ? bundle.getString(key) : key;
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}

	/**
	 * This method logs a Status
	 * 
	 * @param status IStatus
	 */
	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}
	
	/**
	 * This method logs an error message 
	 * 
	 * @param message String
	 */
	public static void logErrorMessage(String message) {
		if (message == null)
			message= "";
		log(new Status(IStatus.ERROR, PLUGIN_ID, INTERNAL_ERROR, message, null));
	}
	
	/**
	 * This method logs an error message and a Status
	 * 
	 * @param message String
	 * @param status  IStatus
	 */
	public static void logErrorStatus(String message, IStatus status) {
		if (status == null) {
			logErrorMessage(message);
			return;
		}
		MultiStatus multi= new MultiStatus(PLUGIN_ID, INTERNAL_ERROR, message, null);
		multi.add(status);
		log(multi);
	}
	
	/**
	 * This method logs an exception
	 * 
	 * @param e Throwable
	 */
	public static void log(Throwable e) {
		log(new Status(IStatus.ERROR, PLUGIN_ID, INTERNAL_ERROR, "Sintaks Internal Error", e));
	}
	
	public PrintStream getDebugStream () {
		return debugStream;
	}

	public void debug (String text) {
		if (debugStream != null ) 
			debugStream.print(text);
	}

	public void debugln (String text) {
		if (debugStream != null ) 
			debugStream.println(text);		
	}

	public void createDebugStream (IPath container) {
		if (debugStream != null) 
			debugStream.close();
		try {
			IPath debugFile = container.append(getOptionManager().getDebugOutputFile());
			String realName = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + debugFile.toString();
			debugStream = new PrintStream (new BufferedOutputStream (new FileOutputStream(realName)));
		} catch (FileNotFoundException e) {
			debugStream = null;
		}
	}
	
	public void closeDebugStream () {
		if (debugStream != null) {
			debugStream.close ();
		}
		debugStream= null;
	}

}
