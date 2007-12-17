

/*$Id: KMTUnitLoader.java,v 1.20 2007-12-17 16:54:58 ftanguy Exp $
* Project : io
* File : 	KMTUnitLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 5 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.kmt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.AbstractKermetaUnitLoader;
import org.kermeta.loader.LoadingOptions;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.ast.CompUnit;
import fr.irisa.triskell.kermeta.ast.ImportStmt;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.ecore.Ecore2KMLoader;
import fr.irisa.triskell.kermeta.loader.ecore.EcoreBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaBuildingState;
import fr.irisa.triskell.kermeta.loader.java.JavaKermetaUnitLoader;
import fr.irisa.triskell.kermeta.loader.km.KMUnitLoader;
import fr.irisa.triskell.kermeta.loader.km.KmBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.ASTHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionSearcher;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;


public class KMTUnitLoader extends AbstractKermetaUnitLoader {

	static private Hashtable<KermetaUnit, CompUnit> ast = new Hashtable<KermetaUnit, CompUnit> ();
	
	private String content = null;
	
	public KMTUnitLoader(Map<Object, Object> options, IProgressMonitor monitor) {
		super(options, monitor);
		if ( options.get(LoadingOptions.CONTENT) != null )
			content = (String) options.get("content");
	}
	
	public KermetaUnit load(String uri) {

		KermetaUnit kermetaUnit = null;
		try {

			kermetaUnit = IOPlugin.getDefault().getKermetaUnit(uri);

			KMTBuildingState buildingState = (KMTBuildingState) kermetaUnit.getBuildingState();
			if ( buildingState.loaded )
				return kermetaUnit;
			
			//checkBuildingState(kermetaUnit);
			kermetaUnit.setNeedASTTraces(true);
			
			// 1 - Creating the imported kermeta units.
			Date t1 = new Date();
			loadAllImportedUnits(kermetaUnit);
			Date t2 = new Date();
			IOPlugin.internalLog.debug("Load All Imported Units : " + (t2.getTime() - t1.getTime()) + "ms");
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			// 2 - Creating the structure like class definitions, packages.
			t1 = new Date();
			loadAllTypeDefinitions(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Load All typeDefinitiosn : " + (t2.getTime() - t1.getTime()) + "ms");
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;			
			
			/*
			 * 
			 * If the kermeta unit is tagged as framework, so its imported kermeta units.
			 * 
			 */
			if ( kermetaUnit.isFramework() ) {
				for ( KermetaUnit currentUnit : KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit ) )
					currentUnit.setFramework( true );
			}
			
			// 3 - Importing the type definitions from the imported kermeta units in the current one.
			t1 = new Date();
			importAllKermetaUnits(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Import All Kermeta Units : " + (t2.getTime() - t1.getTime()) + "ms");
						
			// 4 - Set the aspect staff
			t1 = new Date();
			setBaseAspectsForAll(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Set Base Aspects : " + (t2.getTime() - t1.getTime()) + "ms");
			
			// 10, finally create the aspects lists to improve performances.
			t1 = new Date();
			constructAspectsListsForAll(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Construct Aspects : " + (t2.getTime() - t1.getTime()) + "ms");
			
			// 5
			t1 = new Date();
			replaceObjectTypeVariablesForAll(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Replace Object Type Variables : " + (t2.getTime() - t1.getTime()) + "ms");
			// 6
			t1 = new Date();
			loadAllStructuralFeatures(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Load Structural Features : " + (t2.getTime() - t1.getTime()) + "ms");
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			TypeCheckerContext.initializeTypeChecker( kermetaUnit, new NullProgressMonitor() );
			
			// 7
			t1 = new Date();
			loadAllOppositeProperties(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Load Opposite Properties : " + (t2.getTime() - t1.getTime()) + "ms");
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			// 8
			t1 = new Date();
			loadAllBodies(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Load All Bodies : " + (t2.getTime() - t1.getTime()) + "ms");
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			// 9
			t1 = new Date();
			loadAllAnnotations(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Load All Annotations : " + (t2.getTime() - t1.getTime()) + "ms");
			
			// 10
			t1 = new Date();
			markErrorsFromImportedUnits(kermetaUnit);
			t2 = new Date();
			IOPlugin.internalLog.debug("Mark Errors : " + (t2.getTime() - t1.getTime()) + "ms");
			
		} catch ( URIMalformedException exception) {
		} catch (RecognitionException e) {
		} catch (TokenStreamException e) {
		} catch (IOException e) {
		}
		return kermetaUnit;
	}

	//////////////////
	//		1		//
	//////////////////
	private void loadAllImportedUnits(KermetaUnit kermetaUnit) {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();

		if ( state.doneLoadImportedUnits ) return;
		state.loading = true;
		IOPlugin.internalLog.debug( kermetaUnit.getUri() );
		loadImportedUnits(kermetaUnit);
		state.doneLoadImportedUnits = true;
	
		/*
		 * 
		 * Loading the structure for the imported units.
		 * 
		 */
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			AbstractBuildingState currentState = (AbstractBuildingState) currentUnit.getBuildingState();
			if ( ! currentState.loaded ) {
				
				if ( currentState instanceof KmBuildingState ) {
					KMUnitLoader loader = new KMUnitLoader(null, monitor);
					loader.load( currentUnit.getUri() );
				} else if ( currentState instanceof KMTBuildingState ) {
					KMTBuildingState currentKMTState = (KMTBuildingState) currentState;
					if ( ! currentKMTState.loading ) {
						for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits( IOPlugin.getDefault().getFramework() ) )
							currentUnit.importKermetaUnit( unitToImport, true, true );
						loadAllImportedUnits( currentUnit );
					}
				} else if ( currentState instanceof EcoreBuildingState ) {
					Map<Object, Object> options = new HashMap<Object, Object> ();
					options.put(LoadingOptions.ECORE_QuickFixEnabled, true);
					Ecore2KMLoader loader = new Ecore2KMLoader(options, monitor);
					loader.load( currentUnit.getUri() );
				} else if ( currentState instanceof JavaBuildingState ) {
					JavaKermetaUnitLoader loader = new JavaKermetaUnitLoader(null, monitor);
					loader.load( currentUnit.getUri() );	
				}

			}
		/*	if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader();
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.ecore") ){
				Ecore2KMLoader loader = new Ecore2KMLoader();
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.jar") ) {
				JavaKermetaUnitLoader loader = new JavaKermetaUnitLoader();
				loader.load( currentUnit.getUri() );	
			} else if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading ) {
					for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits( IOPlugin.getDefault().getFramework() ) )
						currentUnit.importKermetaUnit( unitToImport, true );
					loadAllImportedUnits( currentUnit );
				}
			}*/
		}
	
		state.loading = false;

	}
	
	public void loadImportedUnits(KermetaUnit kermetaUnit) {

		if ( kermetaUnit.isErroneous() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		if ( compUnit == null ) {
			
			try {
				if ( content != null )
					compUnit = ASTHelper.parseString(content);
				else
					compUnit = ASTHelper.parse( kermetaUnit.getUri() );
			} catch (RecognitionException e) {
				kermetaUnit.parsingError(e);
				return;
			} catch (TokenStreamException e) {
				kermetaUnit.parsingError(e);
				return;
			} catch (IOException e) {
				kermetaUnit.error("The file " + kermetaUnit.getUri() + " does not exist.");
				return;
			}
			content = null;
			
			if ( compUnit != null )
				ast.put(kermetaUnit, compUnit);
		}
		
		if ( compUnit != null ) {
			requireEntries.put( kermetaUnit, new ArrayList<RequireEntry>());
			KMT2KMPass pass = new KMT2KMPass1(kermetaUnit, getLoadingContext(kermetaUnit), requireEntries.get(kermetaUnit), monitor); 
			compUnit.accept(pass);
		}
	}
	
	
	//////////////////
	//		2		//
	//////////////////
	private void loadAllTypeDefinitions(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();

		//		System.out.println("loadAllTypeDefinitions " + uri);
		if ( state.doneLoadTypeDefinitions ) return;
		state.loading = true;
		
		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					loadAllTypeDefinitions(currentUnit);
			}
		}
								
		loadTypeDefinitions(kermetaUnit);
		
		state.doneLoadTypeDefinitions = true;
		state.loading = false;
	}
	
	private void loadTypeDefinitions(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		
		if ( kermetaUnit.isErroneous() )
			return;
		
		KMT2KMPass pass = new KMT2KMPass2(kermetaUnit, getLoadingContext(kermetaUnit), monitor); 
		CompUnit compUnit = ast.get(kermetaUnit);
		
		compUnit.accept(pass);
	}
	
	//////////////////
	//		3		//
	//////////////////
	private void importAllKermetaUnits(KermetaUnit kermetaUnit)  {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
			
		if ( state.doneImport ) return;
		state.loading = true;
		
		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					importAllKermetaUnits(currentUnit);
			}
			
		}

		importKermetaUnits(kermetaUnit);
		kermetaUnit.getTypeDefinitionCache().setExternalSearchAuthorized( true );
		
		state.doneImport = true;
		state.loading = false;
		
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 */
	private void importKermetaUnits(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErroneous() )
			return;
		
		List <KermetaUnit> importedKermetaUnits = KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit );
		for ( KermetaUnit unit : importedKermetaUnits ) {
			
			if ( unit != kermetaUnit ) {
				//for ( TypeDefinition typeDefinition : TypeDefinitionSearcher.getInternalTypesDefinition(unit) ) {
				for ( Package p : (List<Package>) unit.getInternalPackages() ) {
					for ( TypeDefinition typeDefinition : (List<TypeDefinition>) p.getOwnedTypeDefinition() ) {
						
						if ( ! typeDefinition.isIsAspect() ) {
							String qualifiedName = NamedElementHelper.getQualifiedName( typeDefinition );
							
							Package internalPackage = kermetaUnit.getInternalPackage( NamedElementHelper.getQualifiedName(p) );
							if ( internalPackage != null ) {
								boolean found = false;
								Iterator<TypeDefinition> iterator = internalPackage.getOwnedTypeDefinition().iterator();
								while ( ! found && (iterator.hasNext()) ) {
									TypeDefinition currentTypeDefinition = iterator.next();
									if ( ! currentTypeDefinition.isIsAspect() )
										if ( qualifiedName.equals(NamedElementHelper.getQualifiedName(currentTypeDefinition)) ) {
											kermetaUnit.error("Type Definition " + qualifiedName + " has already been declared in " + unit.getUri(), currentTypeDefinition);
											found = true;			
										}
									
								}
							}
						}
					}
				}
				
				kermetaUnit.getImportedKermetaUnits().add( unit );
				kermetaUnit.getModelingUnit().getReferencedModelingUnits().add( unit.getModelingUnit() );
				//Iterator <Package> iterator = value.getPackages().iterator();
				Iterator <Package> iterator = unit.getInternalPackages().iterator();
				while ( iterator.hasNext() ) {
					Package p = iterator.next();
					kermetaUnit.addExternalPackage( p );
				}			
				
//				kermetaUnit.importKermetaUnit( unit, true );
			}
		}
	}

	
	//////////////////
	//		4		//
	//////////////////
	private void setBaseAspectsForAll(KermetaUnit kermetaUnit) {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.baseAspectDone ) return;
		state.loading = true;
		
		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					setBaseAspectsForAll(currentUnit);
			}
		}

		setBaseAspects(kermetaUnit);
		
		state.baseAspectDone = true;
		state.loading = false;
	}
	
	private void setBaseAspects(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErroneous() )
			return;
		
		Set <TypeDefinition> internalTypesDefinition = TypeDefinitionSearcher.getInternalTypesDefinition(kermetaUnit);
		for ( TypeDefinition typeDefinition : internalTypesDefinition ) {
			
			if ( typeDefinition.isIsAspect() ) {
				
				String qualifiedName = NamedElementHelper.getQualifiedName( typeDefinition );
				Set <TypeDefinition> externalTypesDefinition = TypeDefinitionSearcher.getExternalTypesDefinition(kermetaUnit, qualifiedName);
			
				for ( TypeDefinition current : externalTypesDefinition ) {
					/*
					 * 
					 * Taking care about not aspectizing itself.
					 * 
					 */
					if ( current != typeDefinition ) {
						typeDefinition.getBaseAspects().add( current );
						KermetaUnit importedUnit = KermetaUnitHelper.getKermetaUnitFromObject( current );
						importedUnit.getAspects().put( current, KermetaUnitHelper.getAspects(importedUnit, current) );
					}
				}
			
			}
		}
	}
	
	//////////////////
	//		5		//
	//////////////////
	private void replaceObjectTypeVariablesForAll(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException  {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
			
		if ( state.replacingObjecTypeVariablesDone ) return;
		state.loading = true;
		
		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					replaceObjectTypeVariablesForAll(currentUnit);
			}
		}

		replaceObjectTypeVariables(kermetaUnit);
		
		state.replacingObjecTypeVariablesDone = true;
		state.loading = false;
		
	}
	
	public void replaceObjectTypeVariables(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		
		if ( kermetaUnit.isErroneous() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		
		KMT2KMPass pass = new KMT2KMPass2_1(kermetaUnit, getLoadingContext(kermetaUnit), monitor);
		compUnit.accept(pass);
	}
	
	//////////////////
	//		6		//
	//////////////////
	private void loadAllStructuralFeatures(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
		if ( state.doneLoadStructuralFeatures )
			return;
		
		state.loading = true;
		// load imported units
		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					loadAllStructuralFeatures(currentUnit);
			}
		}

		// load the features of this unit
		loadStructuralFeatures(kermetaUnit);

		state.doneLoadStructuralFeatures = true;
		state.loading = false;
		
	}
	
	public void loadStructuralFeatures(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		
		if ( kermetaUnit.isErroneous() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		
		KMT2KMPass pass = new KMT2KMPass3(kermetaUnit, getLoadingContext(kermetaUnit), monitor); 
		compUnit.accept(pass);
	}
	
	//////////////////
	//		7		//
	//////////////////
	private void loadAllOppositeProperties(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
		if ( state.doneLoadOppositeProperties )
			return;
		
		state.loading = true;
		// load imported units

		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					loadAllOppositeProperties(currentUnit);
			}
		}

		loadOppositeProperties(kermetaUnit);
		state.doneLoadOppositeProperties = true;
		state.loading = false;
	}
	
	public void loadOppositeProperties(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		
		if ( kermetaUnit.isErroneous() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		
		IOPlugin.internalLog.debug("Pass 4 for " + kermetaUnit.getUri());
		KMT2KMPass pass = new KMT2KMPass4(kermetaUnit, getLoadingContext(kermetaUnit), monitor); 
		compUnit.accept(pass); 
		IOPlugin.internalLog.debug("Pass 5 for " + kermetaUnit.getUri());
		if (kermetaUnit.isErroneous()) return;
		pass = new KMT2KMPass5(kermetaUnit, getLoadingContext(kermetaUnit), monitor); 
		compUnit.accept(pass);
	}
	
	//////////////////
	//		8		//
	//////////////////
	private void loadAllBodies(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
		if ( state.doneLoadBodies )
			return;
		
		state.loading = true;
		// load imported units

		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					loadAllBodies(currentUnit);
			}
		}

		loadBodies(kermetaUnit);
		state.doneLoadBodies = true;
		state.loading = false;
	}
	
	public void loadBodies(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		
		if ( kermetaUnit.isErroneous() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);

		IOPlugin.internalLog.debug("Pass 6 for " + kermetaUnit.getUri());
		KMT2KMPass pass = new KMT2KMPass6(kermetaUnit, getLoadingContext(kermetaUnit), monitor); 
		compUnit.accept(pass);
	}
	
	//////////////////
	//		9		//
	//////////////////
	private void loadAllAnnotations(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
		if ( state.doneLoadAnnotations )
			return;
		
		state.loading = true;
		// load imported units

		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					loadAllAnnotations(currentUnit);
			}
			
		}

		loadAnnotations(kermetaUnit);
		state.doneLoadAnnotations = true;
		state.loading = false;
		state.loaded = true;
	}
	
    public void loadAnnotations(KermetaUnit kermetaUnit) throws RecognitionException, TokenStreamException, IOException {
    	
		if ( kermetaUnit.isErroneous() )
			return;
    	
    	CompUnit compUnit = ast.get(kermetaUnit);
		
		KMT2KMPass7 pass = new KMT2KMPass7(kermetaUnit, getLoadingContext(kermetaUnit), monitor);
       	compUnit.accept(pass);
      
       	ast.remove(kermetaUnit);
       	context.remove(kermetaUnit);
       	
    }
	
	//////////////////
	//		10		//
	//////////////////
	private void markErrorsFromImportedUnits(KermetaUnit kermetaUnit) {
		KMTBuildingState state = (KMTBuildingState) kermetaUnit.getBuildingState();
		if ( state.doneMarkError )
			return;
		
		state.loading = true;
		// load imported units

		Iterator<KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
			
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					markErrorsFromImportedUnits(currentUnit);
			}
			
		}

		markErrors(kermetaUnit);
		state.doneMarkError = true;
		state.loading = false;
		state.loaded = true;
	}
	
    public void markErrors(KermetaUnit kermetaUnit) {
    	
    	List<RequireEntry> entries = requireEntries.get(kermetaUnit);
    	if ( entries != null ) {
    		for ( RequireEntry entry : entries ) {
    			if ( entry.getImportedUnit().isErroneous() )
    				kermetaUnit.warning("The file " + entry.getFileURI() + " contains error(s) : " + KermetaUnitHelper.getAllErrorsAsString(entry.getImportedUnit()), entry.getImportStmt());
    		}
    	}
       	
    }
    
    private Hashtable<KermetaUnit, List<RequireEntry>> requireEntries = new Hashtable<KermetaUnit, List<RequireEntry>> ();
    

    
}

class RequireEntry {
	
	private ImportStmt stms;
	private KermetaUnit importedUnit;
	private String fileURI;
	
	public ImportStmt getImportStmt() {
		return stms;
	}
	
	public KermetaUnit getImportedUnit() {
		return importedUnit;
	}
	
	public String getFileURI() {
		return fileURI;
	}
	
	public RequireEntry(ImportStmt stms, KermetaUnit importedUnit, String fileURI) {
		this.stms = stms;
		this.importedUnit = importedUnit;
		this.fileURI = fileURI;
	}
}
