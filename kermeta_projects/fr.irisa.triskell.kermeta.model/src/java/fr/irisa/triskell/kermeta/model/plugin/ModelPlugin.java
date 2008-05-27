

/*$Id: ModelPlugin.java,v 1.2 2008-05-27 12:52:04 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	ModelPlugin.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 fŽvr. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.model.plugin;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class ModelPlugin extends Plugin {

	public ModelPlugin() {		
	}
	
	public void start(BundleContext context) throws Exception {
		super.start(context);
		try {
			URL url = getBundle().getEntry("/kermeta_log4j_configuration.xml");		
			System.setProperty(org.kermeta.log4j.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
					FileLocator.toFileURL(url).getFile());
		} catch (Exception e) {
			System.out.print("Not able to retreive kermeta_log4j_configuration.xml in the kermeta plugin => using default log configuration");
			// don't worry about that, the log4j will simply use its default configuration
		}
	}

}


