package toto;

import java.util.Comparator;
import java.util.TreeMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "Toto"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private TreeMap<String, Factory> factories;
	
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
		
		factories = new TreeMap<String, Factory>(new Comparator<String>() {
			public int compare(String arg0, String arg1) {
				// if same length, ensure consistency with equals
				if(arg0.length()==arg1.length()){
					return arg0.compareTo(arg1);
				} else
					return arg0.length()-arg1.length();
			}
		});
				
		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint(Activator.PLUGIN_ID,"totos").getExtensions();
		for(IExtension extension : extensions){
			for(IConfigurationElement element : extension.getConfigurationElements()){
				Factory factory = (Factory) element.createExecutableExtension("factory");
				for(IConfigurationElement child : element.getChildren()){
					factories.put(child.getAttribute("string"), factory);
				}
			}
		}

		System.out.println("Testing factories");
		int i=0;
		for(String key : factories.descendingKeySet()){
			MyInterface test = factories.get(key).create("repo"+i);
			System.out.println(test.load(key));
			i++;
		}
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

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
