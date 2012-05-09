/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 19 mars 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.builder.eclipse.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.kermeta.language.builder.eclipse.Activator;
import org.kermeta.language.builder.eclipse.KermetaBuilder;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.osgi.framework.Bundle;

public class URIMapFileBuilder {

	 static final String TAG_MAPPING  = "mapping";
	 static final String ATT_SOURCE   = "source";
	 static final String ATT_TARGET   = "target";
	
	protected String baseProgressGroup= "";
	
	
	/**
	 * @param baseProgressGroup
	 */
	public URIMapFileBuilder(String baseProgressGroup) {
		super();
		this.baseProgressGroup = baseProgressGroup;
	}


	public void generateURIMapFile(String outputFolder) {
		String localProgressGroup = getProgressGroup();
		Properties props = new Properties();
		// fill map
		Activator.getDefault().getMessaggingSystem().initProgress(localProgressGroup, 
				"Generating urimap.properties...",  
				KermetaBuilder.LOG_MESSAGE_GROUP,
				3);
		Activator.getDefault().getMessaggingSystem().progress(getProgressGroup(), "Retreiving workbench projects...", KermetaBuilder.LOG_MESSAGE_GROUP, 0);
		addPlatformResources(props);
		
		Activator.getDefault().getMessaggingSystem().progress(localProgressGroup, "Retreiving platform plugins...", KermetaBuilder.LOG_MESSAGE_GROUP, 1);
		addPlatformPlugins(props);
		
		Activator.getDefault().getMessaggingSystem().progress(localProgressGroup, "Retreiving pathmap in plugins...", KermetaBuilder.LOG_MESSAGE_GROUP, 1);
		addPathMap(props);
		
		Activator.getDefault().getMessaggingSystem().progress(localProgressGroup, "Saving property file...", KermetaBuilder.LOG_MESSAGE_GROUP, 1);		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(outputFolder+File.separator+"urimap.properties");
			props.store(fos, "Simulating resolution of eclipse workbench URIs resolution using URI map translation");
			fos.close();
		} catch (Exception e) {
			Activator.getDefault().getMessaggingSystem().error("cannot generate "+outputFolder+File.separator+"urimap.properties", KermetaBuilder.LOG_MESSAGE_GROUP, e);
		}
		Activator.getDefault().getMessaggingSystem().doneProgress(localProgressGroup, "End of urimap.properties generation", KermetaBuilder.LOG_MESSAGE_GROUP);
	}
	
	protected void addPlatformResources(Properties props){
		// TODO maybe we can use EcorePlugin.getPlatformResourceMap instead of this ad hoc code ...
		for( IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
			String key = "platform:/resource"+project.getFullPath().toString();
			String value = project.getLocationURI().toString();
			props.put(key, value);
		}
	}
	protected void addPlatformPlugins(Properties props){
		for(Bundle bundle : Activator.getDefault().getMyContext().getBundles()){
			
			String key = "platform:/plugin/"+bundle.getSymbolicName()+"/";
			// String value = new LocalFileConverterForEclipse().convertSpecialURItoFileURI(java.net.URI.create(key)).toString();
			String value;
			try {
				//value = FileLocator.toFileURL(new java.net.URL(key)).toString();
				URL resolvedURL = FileLocator.resolve(new java.net.URL(key));
				//URL resolvedURL = Platform.resolve(new java.net.URL(key));
				value = resolvedURL.toString();
				props.put(key, value);
			} catch (Exception e) {
				Activator.getDefault().getMessaggingSystem().log(Kind.UserINFO,"Ignoring bundle "+bundle.getSymbolicName()+". Will not be added to the urimap used to simulate Eclipse URI in standalone mode. Cause: "+e.getMessage(), KermetaBuilder.LOG_MESSAGE_GROUP, null);
			}
			
		}
	}
	
	
	protected void addPathMap(Properties props){
		//org.eclipse.emf.ecore.uri_mapping
		
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.emf.ecore.uri_mapping");
		for (IConfigurationElement element : config) {
			if (element.getName().equals(TAG_MAPPING)){
				String sourceURIValue = element.getAttribute(ATT_SOURCE);
				if (sourceURIValue == null){
					// ignore invalid mapping
				}
				else {
					String targetURIValue = element.getAttribute(ATT_TARGET);
					if (targetURIValue == null){
						// ignore invalid mapping
					}
					else{
						try {
							//value = FileLocator.toFileURL(new java.net.URL(key)).toString();
							URL resolvedURL = FileLocator.resolve(new java.net.URL(targetURIValue));
							//URL resolvedURL = Platform.resolve(new java.net.URL(key));
							String value = resolvedURL.toString();
							props.put(sourceURIValue, value);
						} catch (Exception e) {
							Activator.getDefault().getMessaggingSystem().log(Kind.DevINFO,"Mapping "+sourceURIValue+ " "+targetURIValue+ " cannot resolve to a file location. Cause: "+e.getMessage(), KermetaBuilder.LOG_MESSAGE_GROUP, null);
							props.put(sourceURIValue, targetURIValue);
						}
						
					}
				}
			}
		}
	}
	
	public String getProgressGroup(){
		return baseProgressGroup+".generateURIMapFile["+this.hashCode()+"]";
	}
}
