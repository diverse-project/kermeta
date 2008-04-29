package org.kermeta.io.loader.plugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.EcoreLoader;
import org.kermeta.io.loader.KMLoader;
import org.kermeta.io.loader.KMTLoader;
import org.kermeta.io.loader.Loader;
import org.kermeta.io.loader.LoaderFactory;
import org.kermeta.io.loader.LoadingContext;
import org.kermeta.io.loader.impl.LoaderPackageImpl;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.LoadingOptions;
import org.osgi.framework.BundleContext;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * The activator class controls the plug-in life cycle
 */
public class LoaderPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.kermeta.io.loader";

	// The shared instance
	private static LoaderPlugin plugin;
	
	// Log4j logger for this plugin
	final static public Logger log = LogConfigurationHelper.getLogger("LoaderPlugin");

	/**		A boolean that tells wether the plugin has been initialized or not.		*/
	static private boolean INITIALIZED = false;
	
	static public void setFrameworkGeneration(boolean value) {
		IOPlugin.FRAMEWORK_GENERATION = value;
	}
	
	/**		A flag to allow or not the loading of the framework. Only used for test purposes.		*/
	static public boolean LOAD_FRAMEWORK = true;
	
	private KermetaUnit framework;
	
	public KermetaUnit getFramework() {
		return framework;
	}
	
	private KermetaUnit ecore;
	
	public KermetaUnit getEcore() {
		return ecore;
	}
	
	/**
	 * The constructor
	 */
	public LoaderPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		initialize();
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
	public static LoaderPlugin getDefault() {
		if ( plugin == null ) {
			plugin = new LoaderPlugin();
			plugin.initialize();
		} 
		return plugin;
	}

	private LoadingContext loadingContext;
	
	public void initialize() {
		if ( INITIALIZED )
			return;
		
		INITIALIZED = true;
		
		// Initializing IOPlugin before.
		IOPlugin.getDefault();
		
		// If no uri.map, let's set the default URI for loader.
		URI u = URI.createURI("kconf:/loader/");
		if ( URIConverterImpl.URI_MAP.get(u) == null )
			URIConverterImpl.URI_MAP.put(u, URI.createURI("platform:/plugin/org.kermeta.io.loader/instances/"));
				
		LoaderPackageImpl.init();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("loader",new XMIResourceFactoryImpl());
		initializeLoaders();
		getDefault().loadingContext = LoaderFactory.eINSTANCE.createLoadingContext();
		String frameworkURI = "";
		frameworkURI = IOPlugin.getFrameWorkURI();
			
		HashMap<Object, Object> options = new HashMap<Object, Object>();
		options.put(LoadingOptions.FRAMEWORK_LOADING, true);
		options.put( LoadingOptions.ECORE_QuickFixEnabled, true );
			
		/*
		 * 
		 * Just creating the keremeta unit in memory.
		 * 
		 */
		try {
			if ( LOAD_FRAMEWORK ) {
				framework = IOPlugin.getDefault().getKermetaUnit( frameworkURI );
				ecore = IOPlugin.getDefault().getKermetaUnit( IOPlugin.ECORE_URI );
				// TODO : refactor IOPlugin
				IOPlugin.getDefault().framework = framework;
				
				//ecore = load( IOPlugin.ECORE_URI, options );
				// TODO : refactor IOPlugin
				IOPlugin.getDefault().ecore = ecore;
				
				/*
				 * 
				 * Loading the framework.
				 * 
				 */
				load( frameworkURI, options );
				framework.setFramework(true);
					
				for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(framework) )
					importedUnit.setFramework(true);	
					
				if ( ! framework.isErroneous() ) {
					KermetaTypeChecker typechecker = new KermetaTypeChecker(framework);
						typechecker.checkUnit();
				}

				if ( ! framework.isErroneous() ) {
					KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker(framework);
					constraintchecker.checkUnit();
				} else
					System.err.println(KermetaUnitHelper.getAllErrors(framework));

			}
		} catch (URIMalformedException e) {
			logErrorMessage("not able to initialize LoaderPlugin", e);
			return;
		} catch (NotRegisteredURIException e) {
			logErrorMessage("not able to initialize LoaderPlugin", e);
			return;
		} catch (Throwable e) {
			logErrorMessage("not able to initialize LoaderPlugin", e);
			e.printStackTrace();
			return;
		}
	}
	
	/**
	 * Load the given uri
	 * option is typically :
	 * <code>
	 *    HashMap<String, Object> loaderOptions = new HashMap<String, Object>();
	 *    loaderOptions.put( LoadingOptions.ECORE_QuickFixEnabled, true );
	 * </code>
	 * @param uri
	 * @param options
	 * @return
	 * @throws URIMalformedException
	 * @throws NotRegisteredURIException
	 */
	public KermetaUnit load(String uri, Map<?, ?> options) throws URIMalformedException, NotRegisteredURIException {
		if ( options == null )
			options = new HashMap<Object, Object>();
		getDefault().loadingContext.load(uri, options);
		return IOPlugin.getDefault().getKermetaUnit(uri);
	}
	
	public void unload(String uri) {
		
		log.debug("Unloading " + uri);
		
		/*
		 * 
		 * Some kermeta units can cross reference each other. When this case occurs, those connected units must unloaded.
		 * 
		 */
		List <KermetaUnit> unitToUnload = new ArrayList <KermetaUnit> ();
		KermetaUnit kermetaUnit = IOPlugin.getDefault().findKermetaUnit(uri);
		if ( kermetaUnit != null ) {
			unitToUnload.add( kermetaUnit );
			unitToUnload.addAll( kermetaUnit.getImporters() );
			/*for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) )
				if ( importedUnit.getImportedKermetaUnits().contains( kermetaUnit ) )
					unitToUnload.add( importedUnit );*/
		
			for ( KermetaUnit unit : unitToUnload ) {
				// It can be a dynamic expression unit (They do not have uris).
				if ( unit.getUri() == null )
					unit.getImportedKermetaUnits().clear();
				else {
					URI emfURI = URI.createURI( unit.getUri() );
					Loader l = loadingContext.getLoader(emfURI);
					if ( l != null ) {
						/*
						 * 
						 * Removing the loader.
						 * 
						 */
						l.getDatas().setKermetaUnit(null);
						loadingContext.getLoaders().remove(l);
					}
					/*
					 * 
					 * Removing the kermeta unit.
					 * 
					 */
					IOPlugin.getDefault().unload(emfURI.toString());
				}
			}
		}
	}
	
	public void unloadAll() {
		// We must work on a copy because the unload method may remove some loaders from the source list.
		Loader[] loaders = new Loader[loadingContext.getLoaders().size()];
		loadingContext.getLoaders().toArray(loaders);
		for ( Loader l : loaders ) {
			// The Kermeta Unit can be null
			if ( (l.getDatas().getKermetaUnit() != null) && ! l.getDatas().getKermetaUnit().isFramework() && l.getDatas().getKermetaUnit() != ecore)
				unload(l.getDatas().getKermetaUnit().getUri());
		}
	}
	
	private EcoreLoader ecoreLoader;
	
	private KMTLoader kmtLoader;
	
	private KMLoader kmLoader;
	
	private void initializeLoaders() {
		try {
			/*
			 * 
			 * EcoreLoader
			 * 
			 */
			URI uri = URI.createURI("kconf:/loader/Ecore.loader");
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(uri);
			resource.load(null);
			getDefault().ecoreLoader = (EcoreLoader) resource.getContents().get(0);
			if(getDefault().ecoreLoader == null){
				logErrorMessage("not able to load ecoreLoader file from " +uri.toString(),null);
			}
			/*
			 * 
			 * KMTLoader
			 * 
			 */
			uri = URI.createURI("kconf:/loader/KMT.loader");
			resourceSet = new ResourceSetImpl();
			resource = resourceSet.createResource(uri);
			resource.load(null);
			getDefault().kmtLoader = (KMTLoader) resource.getContents().get(0);
			if(getDefault().kmtLoader == null){
				logErrorMessage("not able to load kmtLoader file from " +uri.toString(),null);
			}
			
			/*
			 * 
			 * KMLoader
			 * 
			 */
			uri = URI.createURI("kconf:/loader/KM.loader");
			resourceSet = new ResourceSetImpl();
			resource = resourceSet.createResource(uri);
			resource.load(null);
			getDefault().kmLoader = (KMLoader) resource.getContents().get(0);
			if(getDefault().kmLoader == null){
				logErrorMessage("not able to load kmLoader file from " +uri.toString(),null);
			}
			
		} catch (IOException e) {
			logErrorMessage("Error while loading \"loader\" files",e);
		}

	}
	
	public KMTLoader getNewKMTLoader() {
		return (KMTLoader) EcoreUtil.copy(getDefault().kmtLoader);
	}
	
	public KMLoader getNewKMLoader() {
		return (KMLoader) EcoreUtil.copy(getDefault().kmLoader);
	}
	
	public EcoreLoader getNewEcoreLoader() {
		return (EcoreLoader) EcoreUtil.copy(getDefault().ecoreLoader);
	}
	
	public void load(String uri, String stepName, Map<?,?> options) throws URIMalformedException, NotRegisteredURIException {
		getDefault().loadingContext.load(uri, stepName, options);
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
		log.error(message, e);
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
		log.error(message, e);
	}
}
