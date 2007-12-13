

/*$Id: KMUnitLoader.java,v 1.13 2007-12-13 08:30:06 ftanguy Exp $
* Project : org.kermeta.io
* File : 	KmUnitLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.km;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.io.IoFactory;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.PackageEntry;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.AbstractKermetaUnitLoader;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.kmt.AbstractBuildingState;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class KMUnitLoader extends AbstractKermetaUnitLoader {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("KMUnitLoader");
	
	private Hashtable <String, KermetaUnit> kermetaUnits = new Hashtable <String, KermetaUnit> ();
	
	private boolean frameworkLoading = false;
	
	public KMUnitLoader(Map<Object, Object> options, IProgressMonitor monitor) {
		super(options, monitor);
		if ( options != null ) {
			Boolean b = (Boolean) options.get( LoadingOptions.FRAMEWORK_LOADING );
			if ( b != null )
				frameworkLoading = b;
		}
	}
	
	@Override
	public KermetaUnit load(String uri) {

		KermetaUnit kermetaUnit = null;

		try {
		
			kermetaUnit = IOPlugin.getDefault().getKermetaUnit(uri, frameworkLoading);
			KmBuildingState buildingState = (KmBuildingState) kermetaUnit.getBuildingState();
			
			if ( buildingState.loaded )
				return kermetaUnit;
			
			internalLog.info("Creating uri for " + kermetaUnit.getUri());
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
			URI u = EcoreHelper.createURI( uri );
			
			internalLog.info("Creating and loading the resource for " + kermetaUnit.getUri());
			
			Resource resource = null;
			try {
				resource = resourceSet.getResource(u, true);
			} catch (Exception e) {
				kermetaUnit.error( e.getLocalizedMessage() );
				return kermetaUnit;
			}
			/*
			 * 
			 * Keeping compatibility with old km files
			 * 
			 */
			if ( ! (resource.getContents().get(0) instanceof ModelingUnit) ) {
				ModelingUnit modelingUnit = StructureFactory.eINSTANCE.createModelingUnit();
				modelingUnit.getPackages().add( (Package) resource.getContents().get(0) );
				kermetaUnit.setModelingUnit( modelingUnit );
			} else
				kermetaUnit.setModelingUnit( (ModelingUnit) resource.getContents().get(0) );
			buildingState.loaded = true;
		
			kermetaUnits.put(kermetaUnit.getUri(), kermetaUnit);
			
			EcoreUtil.resolveAll(resourceSet);
			
			for ( Resource r : (List<Resource>) resourceSet.getResources() ) {
				
				String fileURI = r.getURI().toString();

				if ( ! fileURI.startsWith("platform:/plugin") && kermetaUnit.getUri().startsWith("platform:/plugin") )
					fileURI = EcoreHelper.getPlatformPluginURI(fileURI).toString();
				else if ( ! fileURI.startsWith("platform:/resource") && kermetaUnit.getUri().startsWith("platform:/resource") )
					fileURI = EcoreHelper.getPlatformResourceURI(fileURI).toString();			
				
				KermetaUnit currentUnit = IOPlugin.getDefault().getKermetaUnit( fileURI, frameworkLoading );
				
				/*
				 * 
				 * Do not redo the job done just before for the main unit of this load.
				 * 
				 */
				if ( currentUnit != kermetaUnit ) {
					kermetaUnit.getImportedKermetaUnits().add( currentUnit );
					if ( r.getContents().isEmpty() ) {
						IOPlugin.getDefault().unload( fileURI );
						kermetaUnit.error(fileURI + " could not have been loaded.");
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
			
			importAllKermetaUnits();
			
			constructAspectsListsForAll(kermetaUnit);
						
		} catch ( URIMalformedException exception ) {
			exception.printStackTrace();
		}
			
		return kermetaUnit;
		
	}
	
	
	
	private void createInternalPackageEntries() {
		
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
	
	private void createTypeDefinitionCache() {
		for ( KermetaUnit kermetaUnit : kermetaUnits.values() ) {
			
			for ( Package p : (List<Package>) kermetaUnit.getModelingUnit().getPackages() )
				createTypeDefinitionCache(kermetaUnit, p);
			
		}
	}
	
	private void createTypeDefinitionCache(KermetaUnit unit, Package p) {
		for ( TypeDefinition typeDefinition : p.getOwnedTypeDefinition() ) {
			String qualifiedName = NamedElementHelper.getQualifiedName(typeDefinition);
			unit.getTypeDefinitionCache().addTypeDefinition(qualifiedName, typeDefinition);
		}
		
		for( Package nestedPackage : (List<Package>) p.getNestedPackage() )
			createTypeDefinitionCache(unit, nestedPackage);
		
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
	
/*	private void importAllKermetaUnits(KermetaUnit kermetaUnit) {
		
		KmBuildingState buildingState = (KmBuildingState) kermetaUnit.getBuildingState();
		
		if ( buildingState.importDone )
			return;
		
		buildingState.loading =true;
		
		importKermetaUnits(kermetaUnit);
		 
		buildingState.importDone = true;
		
		for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) ) {
			KmBuildingState currentBuildingState = (KmBuildingState) importedUnit.getBuildingState();
			if ( ! currentBuildingState.loading )	
				importAllKermetaUnits(importedUnit);
		}
		buildingState.loading = false;
	}
	*/
/*	private void importKermetaUnits(KermetaUnit kermetaUnit) {
		for ( String require : (Set<String>) kermetaUnit.getRequires() ) {
			
			int i = require.lastIndexOf(".");
			if ( i != -1 ) {
				
				String baseRequire = require.substring(0, i);
				KermetaUnit unitToImport = getKermetaUnitMatchesRequire(baseRequire);

				if ( unitToImport != null ) {
					kermetaUnit.importKermetaUnit(unitToImport);
					for ( KermetaUnit ku : KermetaUnitHelper.getAllImportedKermetaUnits( unitToImport ) ) {
						kermetaUnit.importKermetaUnit(ku);
					}
				}

			}
			
		}
		
	}*/
	
	
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
}


