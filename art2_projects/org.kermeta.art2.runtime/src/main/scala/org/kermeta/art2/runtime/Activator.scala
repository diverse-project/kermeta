
package org.kermeta.art2.runtime

import org.osgi.framework.BundleContext
import org.osgi.framework.BundleActivator

class Activator extends BundleActivator with fr.irisa.triskell.scala.generated.fw.ImplicitConversion {
	
	def start( context: BundleContext ) {
		handler.actualContext  = context
		handler.init
		var launcher = org.kermeta.artKomparator.RichFactory.createLauncher
		launcher.KersetNodeName("duke.irisa.fr")
		launcher.KersetHotdeployPATH("/Users/ffouquet/Servers/apache-servicemix-4.0.0/deploy")
		launcher.launchFromURL("///Users/ffouquet/Documents/DEV/workspaces/runtime-artIDE/Drop/multi_sample.xmi")
     }   

     def stop( context: BundleContext )  {

     }


}



