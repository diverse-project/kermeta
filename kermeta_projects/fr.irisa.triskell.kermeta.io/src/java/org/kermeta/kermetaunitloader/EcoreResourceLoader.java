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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.kermetaunitloader.AbstractLoader.CommandStep;
import org.kermeta.kermetaunitloader.core.EmptyKermetaUnitBuilder;
import org.kermeta.kermetaunitloader.core.ReportUsingError;
import org.kermeta.kermetaunitloader.core.RequireResolver;
import org.kermeta.loader.LoadingOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.Ecore2KMDatas;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.Ecore2KMPass1;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.Ecore2KMPass2;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.Ecore2KMPass3;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.Ecore2KMPass6;
import fr.irisa.triskell.kermeta.loader.ecore.ecore2km.EcoreBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.AbstractBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMTBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;


/**
 * Loader that knows how to deal with KM files
 *
 */
public class EcoreResourceLoader extends AbstractLoader {

	final static public Logger internalLog = LoggerFactory.getLogger("EcoreFileLoader");
	
	
	protected Map<String, Object> options;
	protected String ecoreResourceUri;
	
	public EList<EObject> resourceContents = new BasicEList<EObject>();
	
	public Ecore2KMDatas ecore2kmDatas = new Ecore2KMDatas();
	
	public Hashtable<Operation, ArrayList<Operation>> opTable;
	
	protected KermetaUnitStore kermetaUnitStore;
	
	public EcoreResourceLoader(String ecoreResourceUri, Map<String, Object> options2, KermetaUnitStore store) throws URIMalformedException, NotRegisteredURIException{
		this.options = options2;
		this.ecoreResourceUri = ecoreResourceUri;
		kermetaUnitStore = store;

		// needed to store error messages and store the empty unit during load time 
		internalLog.debug("Creating empty KermetaUnit... of " +ecoreResourceUri);
		loadedUnit = EmptyKermetaUnitBuilder.buildEmptyUnit(ecoreResourceUri, this);
	}
	
	@Override
	public void createCommands(){
		groupedCommands.put(CommandStep.requireResolving, new AbstractCommand(){
				@Override
				public void executeCommand() {
					internalLog.debug("Loading Ecore resource " + ecoreResourceUri);
					loadEcoreResource();
					
					internalLog.debug("building km structure  " + ecoreResourceUri);
					ecore2kmStructure();
					
					internalLog.debug("Resolving \"requires\"... of " +ecoreResourceUri);
					RequireResolver.resolve(loadedUnit);
				}				
			});	
		groupedCommands.put(CommandStep.requireImport, new AbstractCommand(){
			@Override
			public void executeCommand() {
				internalLog.debug("Importing required units... of " +ecoreResourceUri);
				importKermetaUnits();
			}				
		});
		
		groupedCommands.put(CommandStep.requireErrorPropagation, new AbstractCommand(){
			@Override
			public void executeCommand() {
				internalLog.debug("Propagating require errors... of " +ecoreResourceUri);
				ReportUsingError.propagateErrors(loadedUnit);
			}				
		});

		
	/*	groupedCommands.put(CommandStep.aspectBuilding, new AbstractCommand(){
			@Override
			public void executeCommand() {
				internalLog.debug("Building aspects... of " +ecoreResourceUri);
				BuildAspects.build(loadedUnit);
			}				
		}); */
		groupedCommands.put(CommandStep.typeSetting, new AbstractCommand(){
			@Override
			public void executeCommand() {
				internalLog.debug("Setting types of " +ecoreResourceUri);
				ecore2kmSetTypes();
			}				
		});
		groupedCommands.put(CommandStep.bodies_and_opposite_Setting, new AbstractCommand(){
			@Override
			public void executeCommand() {
				internalLog.debug("Setting opposite and loading bodies of " +ecoreResourceUri);
				LoadBodiesAndSetOppositesPass();
			}				
		});
		groupedCommands.put(CommandStep.quickFixApplication, new AbstractCommand(){
			@Override
			public void executeCommand() {
				internalLog.debug("Applying quickfixes " +ecoreResourceUri);
				ApplyQuickFixPass();
			}				
		});
		groupedCommands.put(CommandStep.loadingFinalization, new AbstractCommand(){
			@Override
			public void executeCommand() {
				internalLog.debug("Removing unnecessary inheritance and finalize loading");
				finalizeLoad();
			}				
		});
		
	}
	/*
	@Override
	public KermetaUnit load() throws URIMalformedException, NotRegisteredURIException {
		EcoreBuildingState buildingState = (EcoreBuildingState)loadedUnit.getBuildingState();
		
		//Step 1:
		internalLog.debug("Loading Ecore resource " + ecoreResourceUri);
		loadEcoreResource();
		if(loadedUnit.isErroneous()) return loadedUnit;

		internalLog.debug("building km structure  " + ecoreResourceUri);
		ecore2kmStructure();
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		if(!buildingState.allRequiresResolved){
			internalLog.debug("Resolving \"requires\"... of " +ecoreResourceUri);
			RequireResolver.resolve(loadedUnit);
			buildingState.allRequiresResolved = true;
			if(loadedUnit.isErroneous()) return loadedUnit;
		}
		// make sure all the context is correctly loaded up to this step
		enforceAllUnitsResolvedRequire();
		// due to the enforce maybe another have finished the load for us
		if(((EcoreBuildingState)loadedUnit.getBuildingState()).loaded){
			internalLog.debug("Resuming already loaded unit " +ecoreResourceUri);
			return loadedUnit;
		}
		
		if(!buildingState.allRequiredUnitImported){
			internalLog.debug("Importing required units... of " +ecoreResourceUri);
			importKermetaUnits();
			buildingState.allRequiredUnitImported = true;
			if(loadedUnit.isErroneous()) return loadedUnit;
		}
		
		if(!buildingState.allRequireErrorPropagated){
			internalLog.debug("Propagating require errors... of " +ecoreResourceUri);
			ReportUsingError.propagateErrors(loadedUnit);
			buildingState.allRequireErrorPropagated = true;
			if(loadedUnit.isErroneous()) return loadedUnit;
		}
		if(!buildingState.allAspectBuilt){
			internalLog.debug("Building aspects... of " +ecoreResourceUri);
			BuildAspects.build(loadedUnit);
			buildingState.allAspectBuilt =  true;
			if(loadedUnit.isErroneous()) return loadedUnit;
		}
		if(!buildingState.allTypeSet){
			internalLog.debug("Setting types of " +ecoreResourceUri);
			ecore2kmSetTypes();
			buildingState.allTypeSet = true;
			if(loadedUnit.isErroneous()) return loadedUnit;
		}
		enforceAllTypeSet();
		// due to the enforce maybe another have finished the load for us
		if(((EcoreBuildingState)loadedUnit.getBuildingState()).loaded){
			internalLog.debug("Resuming already loaded unit " +ecoreResourceUri);
			return loadedUnit;
		}
		
		internalLog.debug("Setting opposite and loading bodies of " +ecoreResourceUri);
		LoadBodiesAndSetOppositesPass();
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Applying quickfixes " +ecoreResourceUri);
		ApplyQuickFixPass();
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Removing unnecessary inheritance and finalize loading");
		finalizeLoad();
	  
		
		return loadedUnit;
	}
	*/
	protected void loadEcoreResource(){
	
		/*
		 * First check into the registry
		 */
		EPackage p = Registry.INSTANCE.getEPackage( ecoreResourceUri );
		if ( p != null )
			resourceContents.add(p);
		else {
			/*
			 * If not, let's try to load the file resource.
			 */
			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createURI( ecoreResourceUri );
			Resource resource = resourceSet.createResource(uri);
			if(resource == null){
				throw new Error("Kermeta error resource is null ! was not able to create a resource from " + uri.toString());
			}
			try {
				resource.load(null);
				EcoreUtil.resolveAll(resourceSet);
				/*for ( Resource r : resourceSet.getResources() ) {
					if ( r != resource )
						datas.getKermetaUnit().addRequire(r.getURI().toString(), null);
				}*/
				resourceContents.addAll( resource.getContents() );
			} catch (IOException e) {
				loadedUnit.error("The file " + ecoreResourceUri + " does not exist." );
			}
		}
	}
	
	protected void ecore2kmStructure() {
		Resource resource = null;
		try {
			resource = resourceContents.get(0).eResource();
		} catch (NullPointerException e) {}
		Ecore2KMPass1 pass = new Ecore2KMPass1( loadedUnit, ecore2kmDatas, true, resource, null );
		for ( EObject o : resourceContents ) {
			pass.accept(o);
		}
	}
	
	protected void ecore2kmSetTypes() {
		/*
		 * Applying the pass.
		 */
		Ecore2KMPass2 pass = new Ecore2KMPass2( loadedUnit, ecore2kmDatas, true, null );
		for ( EObject o : resourceContents ) {
			pass.accept(o);
		}
		/*
		 * Getting the operations processed because it can be usefull for the quick fix pass later on.
		 */
		opTable = pass.getOpTable();
	}
	protected void LoadBodiesAndSetOppositesPass() {
		Ecore2KMPass3 pass = new Ecore2KMPass3( loadedUnit, ecore2kmDatas, true, null );
		for ( EObject o :resourceContents ) {
			pass.accept(o);
		}
	}
	
	protected void ApplyQuickFixPass() {
		boolean mustApply = false;
		if ( options != null && options.get( LoadingOptions.ECORE_QuickFixEnabled ) != null )
			mustApply = (Boolean) options.get( LoadingOptions.ECORE_QuickFixEnabled );
		
		if ( mustApply ) {
			Ecore2KMPass6 pass = new Ecore2KMPass6( loadedUnit, ecore2kmDatas, true, opTable, null );
			for ( EObject o : resourceContents ) {
				pass.accept(o);
			}
		}
	}
	protected void importKermetaUnits() {
		for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(loadedUnit) ) {
			/*
			 * Import the unit
			 */
			loadedUnit.importKermetaUnit(unitToImport, true, true);
			/* 
			 * Activate the external search
			 */
			loadedUnit.getTypeDefinitionCache().setExternalSearchAuthorized(true);
		}
	}
	
	protected void enforceAllUnitsResolvedRequire() throws URIMalformedException, NotRegisteredURIException{
		for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(loadedUnit) ){
			if(unitToImport.getBuildingState() instanceof KMTBuildingState){
				AbstractBuildingState buildingState = (AbstractBuildingState) unitToImport.getBuildingState();
				if(!buildingState.allRequiresResolved){
					// restart a load
					buildingState.kermetaUnitLoader.load();
				}
			}
		}
	}
	protected void enforceAllTypeSet() throws URIMalformedException, NotRegisteredURIException{
		for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(loadedUnit) ){
			if(unitToImport.getBuildingState() instanceof AbstractBuildingState){
				AbstractBuildingState buildingState = (AbstractBuildingState) unitToImport.getBuildingState();
				if(!buildingState.allTypeSet){
					// restart a load
					buildingState.kermetaUnitLoader.load();
				}
			}
		}
	}

}
