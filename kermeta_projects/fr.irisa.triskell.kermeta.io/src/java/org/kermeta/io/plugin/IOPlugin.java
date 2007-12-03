

/*$Id: IOPlugin.java,v 1.31 2007-12-03 15:56:00 ftanguy Exp $
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitStorer;
import org.kermeta.loader.FrameworkMapping;
import org.kermeta.loader.LoadingOptions;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.impl.KmPackageImpl;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class IOPlugin extends AbstractUIPlugin {

	final public static String FRAMEWORK_KM_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.km";

	final public static String FRAMEWORK_KM_LOCAL_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.km";
	
	final public static String ECORE_URI = "http://www.eclipse.org/emf/2002/Ecore";
	
	final private static String FRAMEWORK_ECORE_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.ecore";
	
	final private static String FRAMEWORK_ECORE_LOCAL_URI = "platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/Standard.ecore";
	
	static public String getFrameWorkEcoreURI() {
		if ( LOCAL_USE )
			return FRAMEWORK_ECORE_LOCAL_URI;
		else
			return FRAMEWORK_ECORE_URI;
	}
	
	static public String getFrameWorkURI() {
		if ( LOCAL_USE )
			return FRAMEWORK_KM_LOCAL_URI;
		else
			return FRAMEWORK_KM_URI;
	}
	
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.io";
	
	// The logger for this plugin
	final static public Logger internalLog = LogConfigurationHelper.getLogger("IO");

	// The shared instance
	private static IOPlugin plugin;
	
	private KermetaUnitStorer storer = IoFactory.eINSTANCE.createKermetaUnitStorer();
	
	private KermetaUnit framework;
	
	private KermetaUnit ecore;
	
	static public String URI_MAP = "../fr.irisa.triskell.kermeta.io/uri.map";
	
	/**
	 * 
	 * If local use is set to true, then a specific uri mapping file is used to map platform:/plugin and platform:/resource path.
	 * If set to false, it means that the plugin is used the usual way in a workbench.
	 * 
	 */
	static public boolean LOCAL_USE = false;
	
	static public boolean FRAMEWORK_GENERATION = false;
	
	private boolean INITIALIZED = false;
	
	/**
	 * The constructor
	 * note: cannot put this as a singleton due to eclipse :-(
	 * we cannot garantee that there is only one instance
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
			
			//kermetaUnitHelper = new org.kermeta.io.util2.KermetaUnitHelper( storer );
			KmPackageImpl.init();
			
			FrameworkMapping.initialize( ! LOCAL_USE );
			
			if ( LOCAL_USE ) {				
				File file = new File(URI_MAP);
				if (file.exists()){
					URIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
					System.out.println("URIMap read from " + file.toString());
				}
				else {
					System.out.println("not able to read URIMap from " + file.toString());
				}
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());	
							
			} else {
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new EcoreResourceFactoryImpl());
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new EcoreResourceFactoryImpl());	
			}
			
			if ( ! FRAMEWORK_GENERATION ) {
			
				try {
					// Loading the framework
					framework = loadFramework();
					/*for ( KermetaUnit kermetaUnit : KermetaUnitHelper.getAllImportedKermetaUnits(framework) )
						kermetaUnit.setFramework( true );*/
					
					KermetaTypeChecker typechecker = new KermetaTypeChecker( framework, new NullProgressMonitor() );
					typechecker.checkUnit();

					if ( ! framework.isIndirectlyErroneous() ) {
						KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( framework, new NullProgressMonitor() );
						constraintchecker.checkUnit();
					}				

					if ( framework.isIndirectlyErroneous() )
			            MessageDialog.openInformation(new Shell(), "Invalid Kermeta Framework", "The Kermeta Framework contains errors. " + KermetaUnitHelper.getAllErrorsAsString(framework));
					
					// Loading Ecore
					ecore = loadEcore( ECORE_URI );
					ecore.setLocked(true);				
					
					typechecker = new KermetaTypeChecker( ecore, new NullProgressMonitor() );
					typechecker.checkUnit();

					if ( ! ecore.isIndirectlyErroneous() ) {
						KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( ecore, new NullProgressMonitor() );
						constraintchecker.checkUnit();
					}

					// Loading the framework as ecore
					/*frameworkAsEcore = loadEcoreFramework();
					
					typechecker = new KermetaTypeChecker( frameworkAsEcore, new NullProgressMonitor() );
					typechecker.checkUnit();

					if ( ! frameworkAsEcore.isErroneous() ) {
						KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( frameworkAsEcore, new NullProgressMonitor() );
						constraintchecker.checkUnit();
					}*/
					
				} catch (URIMalformedException e) {
					e.printStackTrace();
				} catch (Throwable e) {
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
	
	public KermetaUnit findKermetaUnit(IFile file) {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return findKermetaUnit(uri);
	}

	public KermetaUnit findKermetaUnit(String uri) {
		return storer.find(uri);
	}
	
	/**
	 * 
	 * This method is used to get a kermeta unit that imports the kermeta framework and the ecore.ecore wether the
	 * file's extension is ecore.
	 * 
	 * @param uri
	 * @return
	 * @throws URIMalformedException
	 */
	public KermetaUnit getKermetaUnit( String uri ) throws URIMalformedException {
		return getKermetaUnit(uri, false);
		/*KermetaUnit kermetaUnit = storer.find(uri);
		if ( kermetaUnit == null ) {
			kermetaUnit = storer.get( uri );
		
			if ( ! uri.equals(ECORE_URI) && ! uri.equals(getFrameWorkEcoreURI()) && uri.matches(".+\\.ecore") && (ecore != null) ) {
				kermetaUnit.importKermetaUnit( ecore, false );
				kermetaUnit.addRequire( ECORE_URI, ecore );
				kermetaUnit.importKermetaUnit( framework, false );
				kermetaUnit.addRequire( "kermeta", framework );
			} else if ( (framework != null) && ! uri.equals(getFrameWorkEcoreURI()) )
				kermetaUnit.getImportedKermetaUnits().add( framework );
				//kermetaUnit.importKermetaUnit( framework, false );
		}
		return kermetaUnit;*/
	}
	
	public KermetaUnit getKermetaUnit( String uri, boolean isFramework) throws URIMalformedException {
		KermetaUnit kermetaUnit = storer.find( uri );
		if ( kermetaUnit == null ) {
			kermetaUnit = storer.get( uri );
			if ( isFramework )
				kermetaUnit.setFramework( true );
			else if ( ! FRAMEWORK_GENERATION ) {
				//kermetaUnit.getImportedKermetaUnits().add( framework );
				if ( uri.matches(".+\\.ecore") ) {
					System.out.println("See if framework is null ??? => " + framework);
					System.out.println("See if is initialized ??? => " + INITIALIZED);
					kermetaUnit.getImportedKermetaUnits().add( framework );
					kermetaUnit.importKermetaUnit( ecore, false, true );
					kermetaUnit.addRequire( ECORE_URI, ecore );	
				} else if ( uri.equals( ECORE_URI ) )
					kermetaUnit.getImportedKermetaUnits().add( framework );
				else if ( uri.matches("http://.+") ) {
					kermetaUnit.getImportedKermetaUnits().add( framework );
					Object o = EPackage.Registry.INSTANCE.get( uri );
					if ( ! (o instanceof Package) ) {
						kermetaUnit.importKermetaUnit( ecore, false, true );
						kermetaUnit.addRequire( ECORE_URI, ecore );	
					}
				}
			} else
				kermetaUnit.setLocked(true);
		}
		return kermetaUnit;
	}
	
	public KermetaUnit basicGetKermetaUnit( String uri ) throws URIMalformedException {
		return storer.get( uri );
	}
	
	public KermetaUnit basicLoadKermetaUnit( String uri, IProgressMonitor monitor ) throws URIMalformedException {
		KermetaUnit kermetaUnit = basicGetKermetaUnit( uri );
		storer.load( uri, null, monitor );
		return kermetaUnit;
	}
	
	public KermetaUnit loadKermetaUnit( String uri, IProgressMonitor monitor ) throws KermetaIOFileNotFoundException, URIMalformedException {
		return loadKermetaUnit(uri, new HashMap<Object, Object> (), monitor);
	}
	
	public KermetaUnit loadKermetaUnit(IFile file, IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return loadKermetaUnit( uri, monitor );
	}
	
	/**
	 * 
	 * Loads a kermeta unit with the contents if not null. It first gets the corresponding kermeta unit.
	 * When running in a workbench, it also checks the free memory before doing the load to avoid out of memory.
	 * 
	 * @param uri
	 * @param content
	 * @return
	 * @throws KermetaIOFileNotFoundException
	 * @throws URIMalformedException
	 */
	public KermetaUnit loadKermetaUnit( String uri, String content, IProgressMonitor monitor ) throws KermetaIOFileNotFoundException, URIMalformedException {
		KermetaUnit kermetaUnit = null;
		synchronized ( IOPlugin.class ) {
			if ( ! LOCAL_USE ) {
			
				if ( Runtime.getRuntime().freeMemory() < 1000000 ) {
					KermetaUnit.internalLog.info("Unloading all Kermeta Unit but the framework.km.");
					List<KermetaUnit> list = new ArrayList <KermetaUnit> ( (List<KermetaUnit>) storer.getKermetaUnits() );
					for ( KermetaUnit unit : list ) {
						if ( ! unit.isFramework() && (unit != ecore) )
							storer.unload( unit.getUri() );
					}
		
				}
			
			}
			
			Map<Object, Object> options = new HashMap<Object, Object> ();
			options.put( LoadingOptions.CONTENT, content);
			kermetaUnit = loadKermetaUnit(uri, options, monitor);
		}
		return kermetaUnit;

	}
	
	public KermetaUnit loadKermetaUnit(IFile file, String content, IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return loadKermetaUnit( uri, content, monitor );
	}
	
	public KermetaUnit loadKermetaUnit(String uri, Map<Object, Object> options, IProgressMonitor monitor) throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit(uri);
		storer.load(uri, options, monitor);
		return kermetaUnit;
	}
	
	private KermetaUnit loadFramework() throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit( getFrameWorkURI(), true );
		Map<Object, Object> options = new HashMap<Object, Object> ();
		options.put( LoadingOptions.FRAMEWORK_LOADING, true );
		storer.load( getFrameWorkURI(), options, new NullProgressMonitor() );
		return kermetaUnit;
	}
	
	/*private KermetaUnit loadEcoreFramework() throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit(getFrameWorkEcoreURI(), true);
		kermetaUnit.getImportedKermetaUnits().add( ecore );
		Map<Object, Object> options = new HashMap<Object, Object> ();
		options.put( LoadingOptions.ECORE_QuickFixEnabled, false );
		options.put( LoadingOptions.ECORE_LOADING_FRAMEWORK, true );
		storer.load( getFrameWorkEcoreURI(), options, new NullProgressMonitor() );
		return kermetaUnit;
	}*/
	
	private KermetaUnit loadEcore( String uri ) throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit( uri );
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put( LoadingOptions.ECORE_QuickFixEnabled, true );
		storer.load( uri, options, new NullProgressMonitor() );
		return kermetaUnit;
	}
	
	public void unload( String uri ) {
		synchronized ( IOPlugin.class ) {
			List <KermetaUnit> unitToUnload = new ArrayList <KermetaUnit> ();
			IOPlugin.internalLog.debug( "unloading " + uri);
			KermetaUnit kermetaUnit;
			try {
				kermetaUnit = getKermetaUnit(uri);
				for ( KermetaUnit importedUnit : new ArrayList<KermetaUnit>(kermetaUnit.getImportedKermetaUnits()) )
					if ( importedUnit.getImportedKermetaUnits().contains( kermetaUnit ) )
						unitToUnload.add( importedUnit );
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
			storer.unload(uri);
			IOPlugin.internalLog.debug( "unloading " + uri + " done");
			for ( KermetaUnit unit : unitToUnload )
				unload( unit.getUri() );
		}
		garbageCollect();
	}
	
	public void unload(IFile file) {
		String uri = "platform:/resource" + file.getFullPath().toString();
		unload( uri );
	}
	public void unloadAll() {
		List <KermetaUnit> unitToUnload = new ArrayList <KermetaUnit> ();
		unitToUnload.addAll(storer.getKermetaUnits());
		for(KermetaUnit unit : unitToUnload){
			storer.unload(unit.getUri());
		}
	}
	
	private void garbageCollect() {
		List <KermetaUnit> unitToUnload = new ArrayList <KermetaUnit> ();
		for ( KermetaUnit unit : storer.getKermetaUnits() ) {
			if ( unit.getImporters().isEmpty() && ! unit.isLocked() )
				unitToUnload.add( unit );
		}
		for ( KermetaUnit unit : unitToUnload )
			storer.unload(unit.getUri() );
		internalLog.info("Available Memory before running garbage collection : " + Runtime.getRuntime().freeMemory());
		Runtime.getRuntime().gc();
		internalLog.info("Available Memory after running garbage collection : " + Runtime.getRuntime().freeMemory());
	}
	
	public KermetaUnit getFramework() {
		return framework;
	}
	
	public KermetaUnit getEcore() {
		return ecore;
	}
	
	/**
	 * list of unique units
	 * @return
	 */
	public EList<KermetaUnit> getKermetaUnits() {
		// can return directly the units from the storer since it already doesn't contains duplicates  
		return storer.getKermetaUnits();
	}
	
	//private org.kermeta.io.util2.KermetaUnitHelper kermetaUnitHelper;
	
}



