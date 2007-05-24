package fr.irisa.triskell.sintaks.texteditor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.runtime.ContributorFactoryOSGi;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * The activator class controls the plug-in life cycle
 */
public class SintaksTextEditorPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.sintaks.textualeditor";

	//static final public URL pluginURL = getDefault().getBundle().getEntry("/");
	
	// The shared instance
	private static SintaksTextEditorPlugin plugin;
	
	final static private Logger internalLog = LogConfigurationHelper.getLogger("SintakstextEditor");
	
	/**
	 * The constructor
	 */
	public SintaksTextEditorPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		
		IExtensionRegistry registry = RegistryFactory.getRegistry();
		Object key = ((ExtensionRegistry) registry).getTemporaryUserToken();
		IContributor contributor = ContributorFactoryOSGi.createContributor( getBundle() );
		
		/*
		 * 
		 * Getting all extensions of sintaks files registration.
		 * 
		 */
		IExtensionPoint extensionPoint = registry.getExtensionPoint("fr.irisa.triskell.sintaks.stsFilesRegistration");
		IExtension[] extensions = extensionPoint.getExtensions();
		
		/*
		 * 
		 * For all extensions, generate an editor for all ConfigurationElement.
		 * An extension can have one or more registration (one registration corresponds to one ConfigurationElement).
		 * 
		 */
		for ( int i = 0; i < extensions.length; i++ ) {
			
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			for ( int j = 0; j < elements.length; j++ ) {
				
				String extensionAsString = createExtension( elements[j] );
				ByteArrayInputStream is = new ByteArrayInputStream( extensionAsString.getBytes() );
				
				try {

					boolean result = Platform.getExtensionRegistry().addContribution(is, contributor, false, null, null, key);
					if ( ! result ) {
						String message = "Sintaks Text Editor for " + elements[i].getAttribute("Extension") + " files could not be set up.";
						getLog().log(new Status(Status.WARNING, PLUGIN_ID, Status.WARNING, message, null));
						error(message);
					}
						
				} finally {

					try {
						is.close();
					} catch (IOException e) {}
				}
				
			}
			
		}
		
		info("Sintaks Editor have been set up.");
		
	}
		
	private String createExtension(IConfigurationElement element) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<?eclipse version=\"3.2\"?>");
		sb.append("<plugin>");
		sb.append("<extension point=\"org.eclipse.ui.editors\"");
		sb.append("    id=\"" + getEditorId(element) + "\">");
		sb.append("		<editor class=\"fr.irisa.triskell.sintaks.texteditor.SintaksTextEditor\"");
		sb.append("			default=\"false\"");
		sb.append("			extensions=\"" + element.getAttribute("Extension") + "\"");
		sb.append("			icon=\"icons/kermeta_logo_32.gif\"");
		sb.append("			id=\"fr.irisa.triskell.kermeta.sintaks.texteditor." + element.getAttribute("Extension") + "\"");
		sb.append("			name=\"Sintaks Text Editor\"/>");
		sb.append("</extension>");
		sb.append("</plugin>");
		return sb.toString();
		
	}
	
	static public void initializeEditors() {}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	
		IExtensionRegistry registry = RegistryFactory.getRegistry();
		Object key = ((ExtensionRegistry) registry).getTemporaryUserToken();
		
		/*
		 * 
		 * Getting all extensions of sintaks files registration.
		 * 
		 */
		IExtensionPoint extensionPoint = registry.getExtensionPoint("fr.irisa.triskell.sintaks.stsFilesRegistration");
		IExtension[] extensions = extensionPoint.getExtensions();
		
		/*
		 * 
		 * For all extensions, generate an editor for all ConfigurationElement.
		 * An extension can have one or more registration (one registration corresponds to one ConfigurationElement).
		 * 
		 */
		for ( int i = 0; i < extensions.length; i++ ) {
			
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			for ( int j = 0; j < elements.length; j++ ) {
				
				IExtension extensionToRemove = registry.getExtension( getEditorId(elements[j]) );
				registry.removeExtension(extensionToRemove, key);
							
			}
			
		}
		
		info("Sintaks Editor have been set down.");
	}

	static public URL getPluginURL() {
		return getDefault().getBundle().getEntry("/");
	}
	
	private String getEditorId(IConfigurationElement element) {
		return "fr.irisa.triskell.kermeta.sintaks.texteditor." + element.getAttribute("Extension");
	}
	
	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SintaksTextEditorPlugin getDefault() {
		return plugin;
	}
	
	static public void warn(String message) {
		internalLog.warn( message );
	}
	
	static public void debug(String message) {
		internalLog.debug( message );
	}
	
	static public void error(String message) {
		internalLog.error( message );
	}

	static public void info(String message) {
		internalLog.info( message );
	}
}
