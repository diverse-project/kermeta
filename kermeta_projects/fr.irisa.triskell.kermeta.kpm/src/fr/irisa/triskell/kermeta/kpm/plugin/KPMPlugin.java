package fr.irisa.triskell.kermeta.kpm.plugin;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import fr.irisa.triskell.kermeta.kpm.workspace.KermetaWorkspace;

/**
 * The activator class controls the plug-in life cycle
 */
public class KPMPlugin extends AbstractUIPlugin implements IStartup {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.kpm";

	// The shared instance
	private static KPMPlugin plugin;
	
	/**
	 * The constructor
	 */
	public KPMPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
		System.out.println("[KPM Plugin started]");
		
		KermetaWorkspace.getInstance();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
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
	public static KPMPlugin getDefault() {
		return plugin;
	}

	public void earlyStartup() {
		
	}
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final KPMPlugin INSTANCE = new KPMPlugin();

	
}
