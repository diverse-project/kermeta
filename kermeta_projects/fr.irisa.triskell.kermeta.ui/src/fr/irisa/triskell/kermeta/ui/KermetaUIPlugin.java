package fr.irisa.triskell.kermeta.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.ui.provider.TreeContentProvider;
import fr.irisa.triskell.kermeta.ui.provider.TreeViewerLabelProvider;

/**
 * The activator class controls the plug-in life cycle
 */
public class KermetaUIPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.ui";

	public static String NEWP_ROJECT_WIZARD_ID = "fr.irisa.triskell.kermeta.ui.wizards.newProject";
	
	// The shared instance
	private static KermetaUIPlugin plugin;
	
	final static private TreeViewerLabelProvider treeViewerLabelProvider = new TreeViewerLabelProvider();
	
	final static private TreeContentProvider treeContentProvider = new TreeContentProvider();
	
	/**
	 * The constructor
	 */
	public KermetaUIPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
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
	public static KermetaUIPlugin getDefault() {
		return plugin;
	}
	
	static public TreeContentProvider getTreeContentProvider() {
		return treeContentProvider;
	}
	
	static public TreeViewerLabelProvider getTreeViewerLabelProvider() {
		return treeViewerLabelProvider;
	}
	
	static private Hashtable <String, ImageDescriptor> iconDescriptors = new Hashtable <String, ImageDescriptor> ();
	
	static public ImageDescriptor getIcon(String iconKey) {
		ImageDescriptor id = iconDescriptors.get(iconKey);
		if ( id == null ) {
			try {
				URL url = new URL( "platform:/plugin/fr.irisa.triskell.kermeta.ui/images/" + iconKey);
				id = ImageDescriptor.createFromURL(url);
				iconDescriptors.put(iconKey, id);
			} catch (MalformedURLException e) {
				// should not happen
				return ImageDescriptor.getMissingImageDescriptor();
			}
		}
		return id;
	}

}
