

/*$Id: KMTUnitLoader.java,v 1.5 2007-07-27 13:28:27 ftanguy Exp $
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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.kermeta.io.IBuildingState;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.AbstractKermetaUnitLoader;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import fr.irisa.triskell.kermeta.ast.CompUnit;
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


public class KMTUnitLoader extends AbstractKermetaUnitLoader {

	private Hashtable<KermetaUnit, CompUnit> ast = new Hashtable<KermetaUnit, CompUnit> ();
	
	private String content = null;

	public KMTUnitLoader() {
	}
	
	public KMTUnitLoader(String content) {
		this.content = content;
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
			loadAllImportedUnits(kermetaUnit);
			
			if ( kermetaUnit.isErrored() )
				return kermetaUnit;
			
			// 2 - Creating the structure like class definitions, packages.
			loadAllTypeDefinitions(kermetaUnit);

			if ( kermetaUnit.isErrored() )
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
			importAllKermetaUnits(kermetaUnit);
			// 4 - Set the aspect staff
			setBaseAspectsForAll(kermetaUnit);			
			// 5
			replaceObjectTypeVariablesForAll(kermetaUnit);
			// 6
			loadAllStructuralFeatures(kermetaUnit);
			
			if ( kermetaUnit.isErrored() )
				return kermetaUnit;
			
			// 7
			loadAllOppositeProperties(kermetaUnit);
			
			if ( kermetaUnit.isErrored() )
				return kermetaUnit;
			
			// 8
			loadAllBodies(kermetaUnit);
			
			if ( kermetaUnit.isErrored() )
				return kermetaUnit;
			
			// 9
			loadAllAnnotations(kermetaUnit);
				
		} catch ( URIMalformedException exception) {
			
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
		System.out.println( kermetaUnit.getUri() );
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
			
			IBuildingState currentState = currentUnit.getBuildingState();
			
			if ( currentState instanceof KmBuildingState ) {
				KMUnitLoader loader = new KMUnitLoader();
				loader.load( currentUnit.getUri() );
			} else if ( currentState instanceof KMTBuildingState ) {
				KMTBuildingState currentKMTState = (KMTBuildingState) currentState;
				if ( ! currentKMTState.loading ) {
					for ( KermetaUnit unitToImport : KermetaUnitHelper.getAllImportedKermetaUnits( IOPlugin.getDefault().getFramework() ) )
						currentUnit.importKermetaUnit( unitToImport, true );
					loadAllImportedUnits( currentUnit );
				}
			} else if ( currentState instanceof EcoreBuildingState ) {
				Ecore2KMLoader loader = new Ecore2KMLoader();
				loader.load( currentUnit.getUri(), true );
			} else if ( currentState instanceof JavaBuildingState ) {
				JavaKermetaUnitLoader loader = new JavaKermetaUnitLoader();
				loader.load( currentUnit.getUri() );	
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

		if ( kermetaUnit.isErrored() )
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
			} catch (IOException e) {
				kermetaUnit.error("The file " + kermetaUnit.getUri() + " does not exist.");
				return;
			}
			content = null;
			
			if ( compUnit != null )
				ast.put(kermetaUnit, compUnit);
		}
		
		if ( compUnit != null ) {
			KMT2KMPass pass = new KMT2KMPass1(kermetaUnit, getLoadingContext(kermetaUnit)); 
			compUnit.accept(pass);
		}
	}
	
	
	//////////////////
	//		2		//
	//////////////////
	private void loadAllTypeDefinitions(KermetaUnit kermetaUnit) {
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
	
	private void loadTypeDefinitions(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErrored() )
			return;
		
		KMT2KMPass pass = new KMT2KMPass2(kermetaUnit, getLoadingContext(kermetaUnit)); 
		CompUnit compUnit = ast.get(kermetaUnit);
		/*if ( compUnit == null ) {
			compUnit = ASTHelper.parse( kermetaUnit.getUri() );
			ast.put(kermetaUnit, compUnit);
		}*/
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
		
		state.doneImport = true;
		state.loading = false;
		
	}
	
	private void importKermetaUnits(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErrored() )
			return;
		
		Set <KermetaUnit> importedKermetaUnits = KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit );
		for ( KermetaUnit unit : importedKermetaUnits ) {
			
			if ( unit != kermetaUnit ) {
				
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
				kermetaUnit.importKermetaUnit( unit, true );
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
		
		if ( kermetaUnit.isErrored() )
			return;
		
		Set <TypeDefinition> internalTypesDefinition = TypeDefinitionSearcher.getInternalTypesDefinition(kermetaUnit);
		for ( TypeDefinition typeDefinition : internalTypesDefinition ) {
			
			if ( typeDefinition.isIsAspect() ) {
				
				String qualifiedName = NamedElementHelper.getQualifiedName( typeDefinition );
				Set <TypeDefinition> externalTypesDefinition = TypeDefinitionSearcher.getExternalTypesDefinition(kermetaUnit, qualifiedName);
			
				for ( TypeDefinition current : externalTypesDefinition ) {
					typeDefinition.getBaseAspects().add( current );
				}
			
			}
		}
	}
	
	//////////////////
	//		5		//
	//////////////////
	private void replaceObjectTypeVariablesForAll(KermetaUnit kermetaUnit)  {
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
	
	public void replaceObjectTypeVariables(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErrored() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		if ( compUnit == null )
			System.out.println();
		/*if ( compUnit == null ) {
			compUnit = ASTHelper.parse( kermetaUnit.getUri() );
			ast.put(kermetaUnit, compUnit);
		}*/
		KMT2KMPass pass = new KMT2KMPass2_1(kermetaUnit, getLoadingContext(kermetaUnit));
		compUnit.accept(pass);
	}
	
	//////////////////
	//		6		//
	//////////////////
	private void loadAllStructuralFeatures(KermetaUnit kermetaUnit) {
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
	
	public void loadStructuralFeatures(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErrored() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		/*if ( compUnit == null ) {
			compUnit = ASTHelper.parse( kermetaUnit.getUri() );
			ast.put(kermetaUnit, compUnit);
		}*/
	
		KMT2KMPass pass = new KMT2KMPass3(kermetaUnit, getLoadingContext(kermetaUnit)); 
		compUnit.accept(pass);
	}
	
	//////////////////
	//		7		//
	//////////////////
	private void loadAllOppositeProperties(KermetaUnit kermetaUnit) {
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
	
	public void loadOppositeProperties(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErrored() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		/*if ( compUnit == null ) {
			compUnit = ASTHelper.parse( kermetaUnit.getUri() );
			ast.put(kermetaUnit, compUnit);
		}*/
		System.out.println("Pass 4 for " + kermetaUnit.getUri());
		KMT2KMPass pass = new KMT2KMPass4(kermetaUnit, getLoadingContext(kermetaUnit)); 
		compUnit.accept(pass); 
		System.out.println("Pass 5 for " + kermetaUnit.getUri());
		if (kermetaUnit.isErrored()) return;
		pass = new KMT2KMPass5(kermetaUnit, getLoadingContext(kermetaUnit)); compUnit.accept(pass);

	}
	
	//////////////////
	//		8		//
	//////////////////
	private void loadAllBodies(KermetaUnit kermetaUnit) {
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
	
	public void loadBodies(KermetaUnit kermetaUnit) {
		
		if ( kermetaUnit.isErrored() )
			return;
		
		CompUnit compUnit = ast.get(kermetaUnit);
		/*if ( compUnit == null ) {
			compUnit = ASTHelper.parse( kermetaUnit.getUri() );
			ast.put(kermetaUnit, compUnit);
		}*/
		System.out.println("Pass 6 for " + kermetaUnit.getUri());
		KMT2KMPass pass = new KMT2KMPass6(kermetaUnit, getLoadingContext(kermetaUnit)); 
		compUnit.accept(pass);
	}
	
	//////////////////
	//		9		//
	//////////////////
	private void loadAllAnnotations(KermetaUnit kermetaUnit) {
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
	
    public void loadAnnotations(KermetaUnit kermetaUnit) {
    	
		if ( kermetaUnit.isErrored() )
			return;
    	
    	CompUnit compUnit = ast.get(kermetaUnit);
		/*if ( compUnit == null ) {
			compUnit = ASTHelper.parse( kermetaUnit.getUri() );
			ast.put(kermetaUnit, compUnit);
		}*/
		KMT2KMPass7 pass = new KMT2KMPass7(kermetaUnit, getLoadingContext(kermetaUnit));
       	compUnit.accept(pass);
      
    }
	
}


