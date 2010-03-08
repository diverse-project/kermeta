

/*$Id: IOPlugin.java,v 1.43 2008-10-29 16:02:18 dvojtise Exp $
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
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.loader.FrameworkMapping;
import org.kermeta.loader.LoadingOptions;
import org.kermeta.log4j.util.LogConfigurationHelper;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.impl.KmPackageImpl;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;

public class IOPlugin extends Plugin {

	public static String FRAMEWORK_KM_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/framework.km";

	final public static String FRAMEWORK_KMT_URI = "platform:/plugin/fr.irisa.triskell.kermeta.framework/src/kermeta/Standard.kmt";
	
	final public static String FRAMEWORK_KM_LOCAL_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/framework.km";
	
	final public static String ECORE_URI = "http://www.eclipse.org/emf/2002/Ecore";
	
	final private static String FRAMEWORK_ECORE_URI = "platform:/plugin/fr.irisa.triskell.kermeta.io/src/kermeta/framework.ecore";
	
	final private static String FRAMEWORK_ECORE_LOCAL_URI = "platform:/resource/fr.irisa.triskell.kermeta.io/src/kermeta/framework.ecore";
	
	public static boolean FRAMEWORK_GENERATION = false;
	
	static public String getFrameWorkEcoreURI() {
		if ( LOCAL_USE )
			return FRAMEWORK_ECORE_LOCAL_URI;
		else
			return FRAMEWORK_ECORE_URI;
	}
	
	static public String getFrameWorkURI() {
		if ( FRAMEWORK_GENERATION )
			return FRAMEWORK_KMT_URI;
		else {
			if ( LOCAL_USE )
				return FRAMEWORK_KM_LOCAL_URI;
			else
				return FRAMEWORK_KM_URI;
		}
	}
	
	
	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irisa.triskell.kermeta.io";
	
	// The logger for this plugin
	final static public Log internalLog = LogConfigurationHelper.getLogger("IO");

	// The shared instance
	private static IOPlugin plugin;
	
	private KermetaUnitStore editionStorer;
	
	/**
	 * Get the default KermetaUnitStore for edition. Typically used by UI plugins like editor and their associated checkers
	 * Note that an interpreted run should use another store that this one, otherwise an edition may have impact on the run
	 * @return
	 */
	public KermetaUnitStore getEditionKermetaUnitStore() {
		return editionStorer;
	}


	//public KermetaUnit framework;
	
	//public KermetaUnit ecore;
	
	static public String URI_MAP = "../fr.irisa.triskell.kermeta.io/uri.map";
	
	/**
	 * 
	 * If local use is set to true, then a specific uri mapping file is used to map platform:/plugin and platform:/resource path.
	 * If set to false, it means that the plugin is used the usual way in a workbench.
	 * 
	 */
	static public boolean LOCAL_USE = false;
	
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
	
	/**
	 * Initialize the plugin
	 * Make sure that if it is in local use it will use the URIMap file in the plugin in order to retrieve the platform:/plugin or platform:/resource URI 
	 * @param localUse
	 */
	public static IOPlugin initialize(Boolean localUse){
		LOCAL_USE = localUse;
		return getDefault();
	}
	
	private void initialize() {
		
		if ( ! INITIALIZED ) {
			
			//kermetaUnitHelper = new org.kermeta.io.util2.KermetaUnitHelper( storer );
			KmPackageImpl.init();
			
			FrameworkMapping.initialize( ! LOCAL_USE );
			
			if ( LOCAL_USE ) {				
				File file = new File(URI_MAP);
				if (file.exists()){
					internalLog.info("Reading URIMap from " + file.toString());
					ExtensibleURIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
				}
				else {
					internalLog.warn("not able to read URIMap from " + file.toString());
				}
				
				if(!ExtensibleURIConverterImpl.URI_MAP.containsKey(URI.createURI("platform:/plugin/"))){
					internalLog.error("in local_use mode, ExtensibleURIConverterImpl.URI_MAP must contain a mapping  for platform:/plugin/");
				}if(!ExtensibleURIConverterImpl.URI_MAP.containsKey(URI.createURI("platform:/resource/"))){
					internalLog.error("in local_use mode, ExtensibleURIConverterImpl.URI_MAP must contain a mapping  for platform:/resource/");
				}if(!ExtensibleURIConverterImpl.URI_MAP.containsKey(URI.createURI("kconf:/loader/"))){
					internalLog.error("in local_use mode, ExtensibleURIConverterImpl.URI_MAP must contain a mapping  for kconf:/loader/");
				}
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl());
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("traceability",new XMIResourceFactoryImpl());
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());	
							
			} else {
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new EcoreResourceFactoryImpl());
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new EcoreResourceFactoryImpl());	
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("traceability",new XMIResourceFactoryImpl());
			}

			HashMap<String, Object> loadingOptions = new HashMap<String, Object>();
			//loadingOptions.put(LoadingOptions.CONTENT, content);
			loadingOptions.put( LoadingOptions.ECORE_QuickFixEnabled, true );
			editionStorer = new KermetaUnitStore(loadingOptions);
			
	/*		if ( ! FRAMEWORK_GENERATION ) {
			
				try {
					// Loading the framework
					framework = loadFramework();*/
					/*for ( KermetaUnit kermetaUnit : KermetaUnitHelper.getAllImportedKermetaUnits(framework) )
						kermetaUnit.setFramework( true );*/
/*					
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
					}*/

					// Loading the framework as ecore
					/*frameworkAsEcore = loadEcoreFramework();
					
					typechecker = new KermetaTypeChecker( frameworkAsEcore, new NullProgressMonitor() );
					typechecker.checkUnit();

					if ( ! frameworkAsEcore.isErroneous() ) {
						KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( frameworkAsEcore, new NullProgressMonitor() );
						constraintchecker.checkUnit();
					}*/
					
	/*			} catch (URIMalformedException e) {
					e.printStackTrace();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			
			}*/
		}
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
	
	/**
	 * reset the current shared instance
	 * This might be useful to be used in a test suite, in order to 
	 * make sure one test doesn't affect result of a second test in the same suite
	 */
	public static void resetDefault(){
		plugin = null;
	}
	
	public KermetaUnit findKermetaUnit(IFile file) {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return findKermetaUnit(uri);
	}

	public KermetaUnit findKermetaUnit(String uri) {
		return editionStorer.find(uri);
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
	public KermetaUnit getKermetaUnit( String uri ) throws URIMalformedException, NotRegisteredURIException {
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
	
	public KermetaUnit getKermetaUnit( String uri, boolean isFramework) throws URIMalformedException, NotRegisteredURIException {
		HashMap<String,Object> options = new HashMap<String,Object>();
		if(uri.equals(IOPlugin.getFrameWorkURI()) || uri.equals("kermeta")){
			//options.put(LoadingOptions.INCLUDE_FRAMEWORK, true);
			options.put(LoadingOptions.FRAMEWORK_LOADING, true);
		}
		KermetaUnit kermetaUnit = editionStorer.get( uri, options );
		if ( isFramework )
			kermetaUnit.setFramework( true );
		return kermetaUnit;
	}
	
	public KermetaUnit basicGetKermetaUnit( String uri ) throws URIMalformedException, NotRegisteredURIException {
		return editionStorer.get( uri );
	}
	
	/*public KermetaUnit basicLoadKermetaUnit( String uri, IProgressMonitor monitor ) throws URIMalformedException, NotRegisteredURIException {
		KermetaUnit kermetaUnit = basicGetKermetaUnit( uri );
		storer.load( uri, null, monitor );
		return kermetaUnit;
	}*/
	
	/*public KermetaUnit loadKermetaUnit( String uri, IProgressMonitor monitor ) throws KermetaIOFileNotFoundException, URIMalformedException {
		return loadKermetaUnit(uri, new HashMap<Object, Object> (), monitor);
	}*/
	
	/*public KermetaUnit loadKermetaUnit(IFile file, IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return loadKermetaUnit( uri, monitor );
	}*/
	
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
	/*public KermetaUnit loadKermetaUnit( String uri, String content, IProgressMonitor monitor ) throws KermetaIOFileNotFoundException, URIMalformedException {
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

	}*/
	
	/*public KermetaUnit loadKermetaUnit(IFile file, String content, IProgressMonitor monitor) throws KermetaIOFileNotFoundException, URIMalformedException {
		String uri = "platform:/resource" + file.getFullPath().toString();
		return loadKermetaUnit( uri, content, monitor );
	}*/
	
/*	public KermetaUnit loadKermetaUnit(String uri, Map<Object, Object> options, IProgressMonitor monitor) throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit(uri);
		storer.load(uri, options, monitor);
		return kermetaUnit;
	}*/
	
	/*private KermetaUnit loadFramework() throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit( getFrameWorkURI(), true );
		Map<Object, Object> options = new HashMap<Object, Object> ();
		options.put( LoadingOptions.FRAMEWORK_LOADING, true );
		storer.load( getFrameWorkURI(), options, new NullProgressMonitor() );
		return kermetaUnit;
	}*/
	
	/*private KermetaUnit loadEcoreFramework() throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit(getFrameWorkEcoreURI(), true);
		kermetaUnit.getImportedKermetaUnits().add( ecore );
		Map<Object, Object> options = new HashMap<Object, Object> ();
		options.put( LoadingOptions.ECORE_QuickFixEnabled, false );
		options.put( LoadingOptions.ECORE_LOADING_FRAMEWORK, true );
		storer.load( getFrameWorkEcoreURI(), options, new NullProgressMonitor() );
		return kermetaUnit;
	}*/
	
	/*private KermetaUnit loadEcore( String uri ) throws URIMalformedException {
		KermetaUnit kermetaUnit = getKermetaUnit( uri );
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put( LoadingOptions.ECORE_QuickFixEnabled, true );
		storer.load( uri, options, new NullProgressMonitor() );
		return kermetaUnit;
	}*/
	
	public void unload( String uri ) {
		editionStorer.unload(uri);
	}
	public void unloadAll(  ) {
		editionStorer.clear();
	}
	
	public void unload(IFile file) {
		String uri = "platform:/resource" + file.getFullPath().toString();
		unload( uri );
	}
	/*public void unloadAll() {
		List <KermetaUnit> unitToUnload = new ArrayList <KermetaUnit> ();
		unitToUnload.addAll(storer.getKermetaUnits());
		for(KermetaUnit unit : unitToUnload){
			storer.unload(unit.getUri());
		}
	}*/
	
	/**
	 * cleanup some unused KermetaUnit
	 * @param gcExcludedUnits some unit that are excluded for the gc
	 */
/*	private void garbageCollect(Set<KermetaUnit> gcExcludedUnits) {
		List <KermetaUnit> unitsToGarbageCollect = new ArrayList <KermetaUnit> ();
		for ( KermetaUnit unit : storer.getKermetaUnits() ) {
			if ( unit.getImporters().isEmpty() && ! unit.isLocked() && ! gcExcludedUnits.contains(unit))
				unitsToGarbageCollect.add( unit );
		}
		for ( KermetaUnit unit : unitsToGarbageCollect )
			if ( ! unit.getUri().equals( ECORE_URI ) )
				storer.unload(unit.getUri() );
		internalLog.info("Available Memory before running garbage collection : " + Runtime.getRuntime().freeMemory());
		Runtime.getRuntime().gc();
		internalLog.info("Available Memory after running garbage collection : " + Runtime.getRuntime().freeMemory());
	}*/
	
/*	public KermetaUnit getFramework() {
		return framework;
	}
	
	public KermetaUnit getEcore() {
		return ecore;
	}
*/	
	/**
	 * list of unique units currently known
	 * 
	 * @return
	 */
	public EList<KermetaUnit> getKermetaUnits() {
		// can return directly the units from the storer since it already doesn't contains duplicates  
		return editionStorer.getKermetaUnits();
	}
	
	/**
	 * This method logs an error message and an associated exception (as a trace)
	 * It will post the message both in the ErrorLog view in Eclipse and in the Log4J
	 * @param message String
	 */
	public static void logErrorMessage(String message, Throwable e) {
		if (message == null)
			message= "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR, message, e));
		// log4j message
		internalLog.error(message, e);
	}
	
	/**
	 * This method logs a warning message and an associated exception (as a trace)
	 * It will post the message both in the ErrorLog view in Eclipse and in the Log4J
	 * @param message String
	 */
	public static void logWarningMessage(String message, Throwable e) {
		if (message == null)
			message= "";
		// eclipse logger
		getDefault().getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, IStatus.WARNING, message, e));
		// log4j message
		internalLog.error(message, e);
	}
	
}



