/*$Id: $
* Project : fr.irisa.triskell.kermeta.io
* File : 	KMTLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 févr. 2010
* Authors : Didier Vojtisek
*/

package org.kermeta.kermetaunitloader;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.PackageEntry;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kermetaunitloader.core.EmptyKermetaUnitBuilder;
import org.kermeta.loader.LoadingOptions;
import org.kermeta.log4j.util.LogConfigurationHelper;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.km.KmBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.AbstractBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.traceability.helper.Tracer;


/**
 * Loader that knows how to deal with KM files
 *
 */
public class KMFileLoader extends AbstractLoader {

	final static public Log internalLog = LogConfigurationHelper.getLogger("KMFileLoader");
	
	
	protected Map<String, Object> options;
	private boolean frameworkLoading = false;
	protected String kmFileUri;
	// internal list of loaded units
	private Hashtable <String, KermetaUnit> kermetaUnits = new Hashtable <String, KermetaUnit> ();
	
	// public list of available units
	protected KermetaUnitStore kermetaUnitStore;
	
	public KMFileLoader(String kmFileUri, Map<String, Object> options2, KermetaUnitStore store) throws URIMalformedException, NotRegisteredURIException{
		this.options = options2;
		if ( options != null ) {
			Boolean b = (Boolean) options.get( LoadingOptions.FRAMEWORK_LOADING );
			if ( b != null )
				frameworkLoading = b;
		}
		this.kmFileUri = kmFileUri;
		kermetaUnitStore = store;

		// needed to store error messages and store the empty unit during load time 
		internalLog.debug("Creating empty KermetaUnit... of " +kmFileUri);
		loadedUnit = EmptyKermetaUnitBuilder.buildEmptyUnit(kmFileUri, this);
	}
	
	@Override
	public KermetaUnit load() {
		//Step 1:
		internalLog.debug("Loading KM structure of " +kmFileUri);
		internalLoadResource();		
	    //<action class="org.kermeta.io.loader.km.Load"/>
	    
		internalLog.debug("Loading trace model of " +kmFileUri);
		loadTrace();
	  	//Step 2:
		internalLog.debug("Removing unnecessary inheritance and finalize loading of " +kmFileUri);
	    finalizeLoad();
	    //<action class="org.kermeta.io.loader.core.FinalizeLoading"/>
	  
		
		return loadedUnit;
	}
	
	
	protected void loadTrace(){
		// load the trace model if any
		Resource r = loadedUnit.getModelingUnit().eResource();
		if ( r !=null ) {
			URI uri = getTraceURI( r );
			if(uri != null){
				ResourceSet rs = r.getResourceSet();
				try {
					Resource traceResource = rs.getResource(uri, true);
					Tracer tracer = new Tracer(traceResource);
					loadedUnit.setTracer( tracer );
				} catch (RuntimeException e) {}
			}
			else {
				// No traceURI for this resource			
			}
		}
	}
	
	
	/**
	 * Calculate the uri for the trace model.
	 * @param resource
	 * @return
	 */
	private URI getTraceURI(Resource resource) {
		URI resourceURI = resource.getURI();
		if ( resourceURI.isPlatformPlugin() ) {
			StringBuffer s = new StringBuffer();
			for ( int i=1; i<resource.getURI().segmentCount()-1; i++ )
				s.append(resource.getURI().segment(i) + "/");
			s.append(resource.getURI().lastSegment().replaceAll("\\..+", ".traceability"));
			return URI.createPlatformPluginURI(s.toString(), false);
		} else if ( resourceURI.isPlatformResource() ) {
			StringBuffer s = new StringBuffer();
			for ( int i=1; i<resource.getURI().segmentCount()-1; i++ )
				s.append(resource.getURI().segment(i) + "/");
			s.append(resource.getURI().lastSegment().replaceAll("\\..+", ".traceability"));
			return URI.createPlatformResourceURI(s.toString(), false);
		}
		return null;
	}
	
	public void internalLoadResource() {

		//KermetaUnit kermetaUnit = null;

		try {
		
			loadedUnit = kermetaUnitStore.get(kmFileUri);
			loadedUnit.setFramework(frameworkLoading);
			KmBuildingState buildingState = (KmBuildingState) loadedUnit.getBuildingState();
			
			if ( buildingState.loaded )
				return;
			
			internalLog.info("Creating uri for " + kmFileUri);
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			/*
			 * 
			 * If this is not the framework's loading, put the framework resources into the resource set if the kermeta unit is not intended to be executed.
			 * 
			 */
			boolean includeFramework = true;
			if ( options.containsKey(LoadingOptions.INCLUDE_FRAMEWORK) )
				includeFramework = (Boolean) options.get(LoadingOptions.INCLUDE_FRAMEWORK);
			if ( includeFramework ) {
				KermetaUnit framework = kermetaUnitStore.get(IOPlugin.FRAMEWORK_KM_URI);
				if ( ! frameworkLoading && framework != null && !IOPlugin.FRAMEWORK_GENERATION  ) {
					addResource(resourceSet, framework);
					for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(framework) ) {
						addResource(resourceSet, unit);
					}
				}
			}
			
			URI u = EcoreHelper.createURI( kmFileUri );
			
			internalLog.info("Creating and loading the resource for " + kmFileUri);
			
			/*
			 * 
			 * Getting the resource.
			 * 
			 */
			Resource resource = null;
			try {
				resource = resourceSet.getResource(u, true);
			} catch (Exception e) {
				loadedUnit.error( e.getLocalizedMessage() );
				return;
			}
			
			/*
			 * 
			 * Keeping compatibility with old km files
			 * 
			 */
			if ( ! (resource.getContents().get(0) instanceof ModelingUnit) ) {
				ModelingUnit modelingUnit = StructureFactory.eINSTANCE.createModelingUnit();
				modelingUnit.getPackages().add( (Package) resource.getContents().get(0) );
				loadedUnit.setModelingUnit( modelingUnit );
			} else
				loadedUnit.setModelingUnit( (ModelingUnit) resource.getContents().get(0) );
			
			buildingState.loaded = true;
		
			kermetaUnits.put(loadedUnit.getUri(), loadedUnit);
			
			EcoreUtil.resolveAll(resourceSet);
		
			List<Resource> resourceList = new BasicEList<Resource>();
			resourceList.addAll(resourceSet.getResources());
			for ( Resource r : resourceList ) {
				
				String fileURI = r.getURI().toString();

				if ( ! fileURI.startsWith("platform:/plugin") && loadedUnit.getUri().startsWith("platform:/plugin") )
					fileURI = EcoreHelper.getPlatformPluginURI(fileURI).toString();
				else if ( ! fileURI.startsWith("platform:/resource") && loadedUnit.getUri().startsWith("platform:/resource") )
					fileURI = EcoreHelper.getPlatformResourceURI(fileURI).toString();			
				
				KermetaUnit currentUnit = kermetaUnitStore.get( fileURI);
				currentUnit.setFramework(frameworkLoading );
				
				/*
				 * 
				 * Do not redo the job done just before for the main unit of this load.
				 * 
				 */
				if ( currentUnit != loadedUnit ) {
					loadedUnit.getImportedKermetaUnits().add( currentUnit );
					if ( r.getContents().isEmpty() ) {
						kermetaUnitStore.unload( fileURI );
						loadedUnit.error(fileURI + " could not have been loaded.");
					} else if ( ! ((AbstractBuildingState) currentUnit.getBuildingState()).loaded ) {
						/*
						 * 
						 * Take care about not overriding existing loaded units.
						 * 
						 */
						ModelingUnit modelingUnit = null;
						// Backward compatibility. Adding a modeling unit to old km files.
						if ( r.getContents().get(0) instanceof ModelingUnit )
							modelingUnit = (ModelingUnit) r.getContents().get(0);
						else {
							modelingUnit = StructureFactory.eINSTANCE.createModelingUnit();
							modelingUnit.getPackages().add( (Package) r.getContents().get(0) );
						}
						currentUnit.setModelingUnit( modelingUnit );
						((AbstractBuildingState) currentUnit.getBuildingState()).loaded = true;
						kermetaUnits.put(currentUnit.getUri(), currentUnit);
					}
				}
			}
							
			createInternalPackageEntries();
			
			createTypeDefinitionCache();
			
			processRequire();
			
			importAllKermetaUnits();
			
			constructAspectsListsForAll(loadedUnit);
						
		} catch ( URIMalformedException exception ) {
			exception.printStackTrace();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		}
			
		
	}

	protected void createInternalPackageEntries() {
		
		for ( KermetaUnit kermetaUnit : kermetaUnits.values() ) {
		
			for ( Package p : (List<Package>) kermetaUnit.getModelingUnit().getPackages() )
				createInternalPackagesEntriesRecursively(kermetaUnit, p);
			
		}
		
	}
	
	private void createInternalPackagesEntriesRecursively(KermetaUnit kermetaUnit, Package p) {
		PackageEntry entry = IoFactory.eINSTANCE.createPackageEntry();
		entry.setQualifiedName( NamedElementHelper.getQualifiedName(p) );
		entry.setPackage(p);
		kermetaUnit.getInternalPackageEntries().add( entry );
		
		for( Package nestedPackage : (List<Package>) p.getNestedPackage() )
			createInternalPackagesEntriesRecursively(kermetaUnit, nestedPackage);
		
	}
	
	protected void createTypeDefinitionCache() {
		for ( KermetaUnit kermetaUnit : kermetaUnits.values() ) {
			kermetaUnit.fillTypeDefinitionCache();			
		}
	}
	
	
	protected void processRequire() {
		for ( KermetaUnit kermetaUnit : kermetaUnits.values() ) {
			
			/*
			 * 
			 * There are maybe extra units to import. It must be an exceptional case. Anyway we need it to properly load the framework.
			 * kermeta_java.km needs to import the others kermeta unit even if it has no physical dependencies to the others files.
			 * 
			 */
			for ( String s : kermetaUnit.getRequires() ) {
				KermetaUnit unit = kermetaUnitStore.find(s);
				if ( unit != null )
					kermetaUnit.getImportedKermetaUnits().add(unit);
			}
		}		
	}
	
	private void importAllKermetaUnits() {
		
		for ( KermetaUnit kermetaUnit : kermetaUnits.values() ) {
			
			Set <KermetaUnit> kermetaUnitToImports = getKermetaUnitToImport(kermetaUnit);
			for ( KermetaUnit unitToImport : kermetaUnitToImports ) {
				kermetaUnit.importKermetaUnit( unitToImport, true, true );
				kermetaUnit.getTypeDefinitionCache().setExternalSearchAuthorized( true );
			}	
		}	
	}
	
	protected void constructAspectsListsForAll(KermetaUnit kermetaUnit) {
		
		AbstractBuildingState state = (AbstractBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.aspectsDone ) return;
		state.loading = true;
		
		constructAspectsLists(kermetaUnit);
		state.aspectsDone = true;
		
		/*
		 * 
		 * Loading the structure for the imported units.
		 * 
		 */
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			AbstractBuildingState currentState = (AbstractBuildingState) currentUnit.getBuildingState();
			if ( ! currentState.loading )
				constructAspectsListsForAll( currentUnit );
		}
	
		state.loading = false;
		
	}
	
	private void constructAspectsLists(KermetaUnit kermetaUnit) {	
		for ( TypeDefinition t : KermetaUnitHelper.getInternalTypeDefinitions(kermetaUnit) ) {
			if ( t.isIsAspect() ) {
				String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(t);
				for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) ) {
					for ( TypeDefinition tdef : KermetaUnitHelper.getInternalTypeDefinitions(importedUnit) ) {
						if ( ! tdef.isIsAspect() ) {
							String s = KermetaModelHelper.NamedElement.qualifiedName(tdef);
							if ( qualifiedName.equals(s) ) {
								EList<TypeDefinition> l = importedUnit.getAspects().get(tdef);
								if ( l == null ) {
									l = new UniqueEList<TypeDefinition>();
									importedUnit.getAspects().put(tdef, l);
								}
								l.add( t );
								l = kermetaUnit.getBaseAspects().get(t);
								if ( l == null ) {
									l = new UniqueEList<TypeDefinition>();
									kermetaUnit.getBaseAspects().put(t, l);
								}
								l.add( tdef );
							}
						}
					}
				}
			}
		}
	}
	
	private Set <KermetaUnit> getKermetaUnitToImport(KermetaUnit kermetaUnit) {
		Set <KermetaUnit> list = new HashSet <KermetaUnit> ();
		getKermetaUnitToImport(kermetaUnit, list);
		return list;
	}
	private void getKermetaUnitToImport(KermetaUnit kermetaUnit, Set <KermetaUnit> list) {
		
		for ( String s : kermetaUnit.getRequires() ) {
			
			int i = s.lastIndexOf(".");
			if ( i != -1 ) {
				String baseRequire = s.substring(0, i);
				KermetaUnit unitToImport = getKermetaUnitMatchesRequire(baseRequire);
				if ( (unitToImport != null) && ! list.contains(unitToImport) ) {
					list.add( unitToImport );
					getKermetaUnitToImport(unitToImport, list);
				}
			}	
		}
	}
	
	
	private KermetaUnit getKermetaUnitMatchesRequire(String baseRequire) {
		for ( String uri : kermetaUnits.keySet() ) {
			
			String regex = ".+" + baseRequire + ".+";
			if ( uri.matches(regex) )
				return kermetaUnits.get(uri);
		}
		return null;
	}
	
	private void addResource(ResourceSet resourceSet, KermetaUnit kermetaUnit) {
		resourceSet.getResources().add( kermetaUnit.getModelingUnit().eResource() );
	}
}
