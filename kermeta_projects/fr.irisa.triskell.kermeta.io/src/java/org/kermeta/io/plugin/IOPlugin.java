

/*$Id: IOPlugin.java,v 1.4 2007-07-27 07:12:17 ftanguy Exp $
* Project : org.kermeta.io
* File : 	IOPlugin.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 29 juin 07
* Authors : paco
*/

package org.kermeta.io.plugin;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.impl.KmPackageImpl;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class IOPlugin extends AbstractUIPlugin {

	public static String FRAMEWORK_KM_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.km";
	
	private static String FRAMEWORK_ECORE_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.ecore";
	
	private static String FRAMEWORK_ECORE_LOCAL_URI = "platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.ecore";
	
	static public String getFrameWorkEcoreURI() {
		if ( LOCAL_USE )
			return FRAMEWORK_ECORE_LOCAL_URI;
		else
			return FRAMEWORK_ECORE_URI;
	}
	
	final public static String ECORE_URI = "http://www.eclipse.org/emf/2002/Ecore";
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.io";
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("IO");

	// The shared instance
	private static IOPlugin plugin;
	
	private KermetaUnitStorer storer = IoFactory.eINSTANCE.createKermetaUnitStorer();
	
	private KermetaUnit framework;

	private KermetaUnit ecore;
	
	static public boolean LOCAL_USE = false;
	
	static public boolean FRAMEWORK_GENERATION = false;
	
	static private boolean INITIALIZED = false;
	
	/**
	 * The constructor
	 */
	public IOPlugin() {
		plugin = this;
		if ( ! INITIALIZED ) {
			initialize();
			INITIALIZED = true;
		}
	}
	
	private void initialize() {
		
		if ( ! INITIALIZED ) {
			
			kermetaUnitHelper = new org.kermeta.io.util2.KermetaUnitHelper( storer );
			KmPackageImpl.init();
			
			if ( LOCAL_USE ) {
				File file = new File("../fr.irisa.triskell.kermeta.io/uri.map");
				if (file.exists())
					URIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());	
			} else {
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new EcoreResourceFactoryImpl());
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new EcoreResourceFactoryImpl());	
			}
			
			if ( ! FRAMEWORK_GENERATION ) {
			
				try {
					framework = loadFramework( FRAMEWORK_KM_URI );
					for ( KermetaUnit kermetaUnit : KermetaUnitHelper.getAllImportedKermetaUnits(framework) )
						kermetaUnit.setFramework( true );
					ecore = loadEcore( ECORE_URI );
					
					KermetaTypeChecker typechecker = new KermetaTypeChecker( ecore );
					typechecker.checkUnit();
					
					if ( ! ecore.isErrored() ) {
						KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( ecore );
						constraintchecker.checkUnit();
					}

				} catch (URIMalformedException e) {
					e.printStackTrace();
				}
			
			}
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		initialize();
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
	public static IOPlugin getDefault() {
		if ( plugin == null ) 
			plugin = new IOPlugin();
		return plugin;
	}

	public KermetaUnit getKermetaUnit( String uri ) throws URIMalformedException {
		KermetaUnit kermetaUnit = storer.find(uri);
		if ( kermetaUnit == null ) {
			kermetaUnit = storer.get( uri );
		
			if ( ! uri.equals(ECORE_URI) && uri.matches(".+\\.ecore") && (ecore != null) ) {
				kermetaUnit.importKermetaUnit( ecore, false );
				kermetaUnit.addRequire( ECORE_URI );
				kermetaUnit.importKermetaUnit( framework, false );
				kermetaUnit.addRequire( "kermeta" );
			} else if ( framework != null )
				kermetaUnit.importKermetaUnit( framework, false );
		}
		return kermetaUnit;
	}
	
	public KermetaUnit loadKermetaUnit( String uri ) throws KermetaIOFileNotFoundException, URIMalformedException {
		return loadKermetaUnit(uri, null);
	}
	
	public KermetaUnit loadKermetaUnit(IFile file) throws KermetaIOFileNotFoundException, URIMalformedException {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return loadKermetaUnit( uri );
	}
	
	public KermetaUnit loadKermetaUnit( String uri, String content ) throws KermetaIOFileNotFoundException, URIMalformedException {
		
		if ( Runtime.getRuntime().freeMemory() < 1000000 ) {
			KermetaUnit.internalLog.info("Unloading all Kermeta Unit but the framework.km.");
			storer.getKermetaUnits().clear();
			storer.getKermetaUnits().add( framework );
			for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(framework) )
				storer.getKermetaUnits().add( unit );
			storer.getKermetaUnits().add( ecore );
			for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(ecore) )
				storer.getKermetaUnits().add( unit );
			Runtime.getRuntime().gc();
		}
		
		KermetaUnit kermetaUnit = kermetaUnitHelper.loadFile(uri, content);
		//KermetaUnit kermetaUnit = getKermetaUnit( uri );
		//storer.load( uri, content );
		return kermetaUnit;

	}
	
	public KermetaUnit loadKermetaUnit(IFile file, String content) throws KermetaIOFileNotFoundException, URIMalformedException {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return loadKermetaUnit( uri, content );
	}
	
	private KermetaUnit loadFramework( String uri ) throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit( uri );
		storer.load( uri );
		return kermetaUnit;
	}
	
	private KermetaUnit loadEcore( String uri ) throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit( uri );
		storer.load( uri );
		return kermetaUnit;
	}
	
	public void unload( String uri ) {
		storer.unload(uri);
	}
	
	public void unload(IFile file) {
		String uri = "platform:/resource" + file.getFullPath().toString();
		unload( uri );
		Runtime.getRuntime().gc();
	}
	
	public KermetaUnit getFramework() {
		return framework;
	}
	
	public KermetaUnit getEcore() {
		return ecore;
	}
	
	public Set<KermetaUnit> getKermetaUnits() {
		Set<KermetaUnit> s = new HashSet<KermetaUnit> ();
		s.addAll( storer.getKermetaUnits() );
		return s;
	}
	
	private org.kermeta.io.util2.KermetaUnitHelper kermetaUnitHelper;
	
}



