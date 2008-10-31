/* $Id: TestPlugin.java,v 1.4 2008-10-31 13:57:06 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.tests
 * File       : TestPlugin.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 07 Sep. 2007
 * Authors : 
 *        Cyril Faucher <cfaucher@irisa.fr>
 * Description : 
 *			Plugin dedicated to the Kermeta tests
 */

package fr.irisa.triskell.kermeta.tests.plugin;

import java.io.File;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.impl.KmPackageImpl;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;


/**
 * The main plugin class to be used in the desktop.
 */
public class TestPlugin extends AbstractUIPlugin {
	//The shared instance.
	private static TestPlugin plugin = null;
	
	public static final String PLUGIN_TESTS_PATH = "platform:/plugin/fr.irisa.triskell.kermeta.tests/";
	
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.tests";
	
	private static boolean INITIALIZED = false;
	
	/**
	 * The constructor
	 */
	public TestPlugin() {
		super();
		plugin = this;
		if ( ! INITIALIZED ) {
			initialize();
			INITIALIZED = true;
		}
	}

	/**
	 * This method is called upon plug-in activation
	 * */
	 
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 */
	public static TestPlugin getDefault() {
		if ( plugin == null ) 
			plugin = new TestPlugin();
		return plugin;
	}
	
	private void initialize() {
		if ( ! INITIALIZED ) {
			
			//kermetaUnitHelper = new org.kermeta.io.util2.KermetaUnitHelper( storer );
			KmPackageImpl.init();
			File file = new File(IOPlugin.URI_MAP);
			if (file.exists()){
				URIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
				System.out.println("URIMap read from " + file.toString());
			}
			else {
				System.out.println("not able to read URIMap from " + file.toString());
			}
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());	
			
		}
	}
	
}
