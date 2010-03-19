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
import java.util.Map;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.cachemanager.KermetaUnitStore;
import org.kermeta.kermetaunitloader.core.BuildAspects;
import org.kermeta.kermetaunitloader.core.EmptyKermetaUnitBuilder;
import org.kermeta.kermetaunitloader.core.ReportUsingError;
import org.kermeta.kermetaunitloader.core.RequireResolver;
import org.kermeta.kermetaunitloader.kmt.AnnotationBuilder;
import org.kermeta.kermetaunitloader.kmt.BodiesAndOppositesSetter;
import org.kermeta.kermetaunitloader.kmt.ModelTypeContentBuilder;
import org.kermeta.kermetaunitloader.kmt.KmtAst2KMStructure;
import org.kermeta.kermetaunitloader.kmt.SuperTypesSetter;
import org.kermeta.kermetaunitloader.kmt.TypeSetter;
import org.kermeta.loader.LoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMTBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.ASTHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.CompUnit;

/**
 * Loader that knows how to deal with KMT files
 *
 */
public class KMTFileLoader extends AbstractLoader {


	final static public Logger internalLog = LoggerFactory.getLogger("KMTFileLoader");
	
	protected Map<String, Object> options;
	protected String kmtFileUri;
	protected CompUnit ast;
	protected LoadingContext loadingContext;
	protected KermetaUnitStore kermetaUnitStore;
	
	public KMTFileLoader(String kmtFileUri,  Map<String, Object> options2, KermetaUnitStore store) throws URIMalformedException, NotRegisteredURIException{
		this.options = options2;
		this.kmtFileUri = kmtFileUri;
		loadingContext =  new LoadingContext();
		kermetaUnitStore = store;

		// needed to store error messages and store the empty unit during load time 
		internalLog.debug("Creating empty KermetaUnit... of " +kmtFileUri);
		loadedUnit = EmptyKermetaUnitBuilder.buildEmptyUnit(kmtFileUri, this);
	}
	
	@Override
	public KermetaUnit load() throws URIMalformedException, NotRegisteredURIException {
		
		KMTBuildingState buildingState = (KMTBuildingState)loadedUnit.getBuildingState();
				
		if(!buildingState.astLoaded){
			internalLog.debug("Loading AST... of " +kmtFileUri);
			loadAST();
			buildingState.astLoaded = true;
			if(loadedUnit.isErroneous()) return loadedUnit;			
		}
		if(!buildingState.kmStructureCreated){
			internalLog.debug("Generating km structure from AST... of " +kmtFileUri);
			KmtAst2KMStructure ast2KM = new KmtAst2KMStructure(loadedUnit);
		    ast2KM.generateStructure(ast);
		    buildingState.kmStructureCreated = true;
			if(loadedUnit.isErroneous()) return loadedUnit;
		}
		if(!buildingState.allRequiresResolved){
			internalLog.debug("Resolving \"requires\"... of " +kmtFileUri);
			RequireResolver.resolve(loadedUnit);
			buildingState.allRequiresResolved = true;
			if(loadedUnit.isErroneous()) return loadedUnit;
		}
		
		// make sure all the context is correctly loaded up to this step
		enforceAllUnitsResolvedRequire();
		// due to the enforce maybe another have finished the load for us
		if(((KMTBuildingState)loadedUnit.getBuildingState()).loaded){
			internalLog.debug("Resuming already loaded unit " +kmtFileUri);
			return loadedUnit;
		}
		
		internalLog.debug("Importing required units... of " +kmtFileUri);
		importKermetaUnits();
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Propagating require errors... of " +kmtFileUri);
		ReportUsingError.propagateErrors(loadedUnit);
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		
		internalLog.debug("Building aspects... of " +kmtFileUri);
		BuildAspects.build(loadedUnit);
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Building modeltype content... of " +kmtFileUri);
		ModelTypeContentBuilder modeltypeContentBuilder = new ModelTypeContentBuilder(loadedUnit, loadingContext);
		modeltypeContentBuilder.generateContent(ast);
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Setting types... of " +kmtFileUri);
		TypeSetter tsetter =  new TypeSetter(loadedUnit, loadingContext);
		tsetter.setTypes(ast);
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Setting supertypes... of " +kmtFileUri);
		SuperTypesSetter stsetter =  new SuperTypesSetter(loadedUnit, loadingContext);
		stsetter.setSuperTypes(ast);
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Setting bodies and opposites... of " +kmtFileUri);
		BodiesAndOppositesSetter bsetter =  new BodiesAndOppositesSetter(loadedUnit, loadingContext);
		bsetter.performAction(ast);
		if(loadedUnit.isErroneous()) return loadedUnit;
		
		internalLog.debug("Adding annotations... of " +kmtFileUri);
		AnnotationBuilder abuilder =  new AnnotationBuilder(loadedUnit);
		abuilder.performAction(ast);
		if(loadedUnit.isErroneous()) return loadedUnit;
				
		internalLog.debug("Removing unnecessary inheritance and finalize loading... of " +kmtFileUri);
	    finalizeLoad();
	    // doesn't need AST trace anymore
		loadedUnit.setNeedASTTraces(false);
		return loadedUnit;
	}
	
	
	protected void loadAST() {
		try {
			
			String content = null;
			if ( options != null && options.containsKey("content") ) {
				content = (String) options.get("content");
				// This option can only be used once because it is only for the first file.
				options.remove("content");
			}
			if ( content != null )
				ast = ASTHelper.parseString( content );
			else
				ast = ASTHelper.parse( kmtFileUri );
			//datas.ast = ast;
		} catch (RecognitionException e) {
			// added error message to the unit
			loadedUnit.parsingError(e);
		} catch (TokenStreamException e) {
			// added error message to the unit
			loadedUnit.parsingError(e);
		} catch (IOException e) {
			// added error message to the unit
			loadedUnit.error("File " + kmtFileUri + " does not exist.");
		}
	}

	protected void enforceAllUnitsResolvedRequire() throws URIMalformedException, NotRegisteredURIException{
		for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits(loadedUnit) ){
			if(unitToImport.getBuildingState() instanceof KMTBuildingState){
				KMTBuildingState buildingState = (KMTBuildingState) unitToImport.getBuildingState();
				if(!buildingState.allRequiresResolved){
					// restart a load
					buildingState.kermetaUnitLoader.load();
				}
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
}
