

/*$Id: Ecore2KMLoader.java,v 1.14 2007-09-19 12:14:58 ftanguy Exp $
* Project : org.kermeta.io
* File : 	Ecore2KMLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.ecore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.AbstractKermetaUnitLoader;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.loader.km.KMUnitLoader;
import fr.irisa.triskell.kermeta.loader.km.KmBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.KMTBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnitLoader;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.StringHelper;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;


public class Ecore2KMLoader extends AbstractKermetaUnitLoader {

	
	public Ecore2KMLoader(IProgressMonitor monitor) {
		super(monitor);
	}
	
	
	final static public Logger internalLog = LogConfigurationHelper.getLogger("EcoreLoader");
	
	/**
	 * This datatype is used as an extra datatype to represent (in the built Ecore file)
	 * the type of elements (properties/parameters/operations) that have a kermeta specific
	 * type (TypeVariable/FunctionType) as type.
	 * Such properties/parameters/operations will have this DataType as type, as well as an
	 * annotation that contains the name of this specific type. 
	 */
	
	private EDataType kermetaTypesAlias = null;
	
	public EDataType getKermetaTypesAlias() {
		if ( kermetaTypesAlias == null ) {
			kermetaTypesAlias = EcoreFactory.eINSTANCE.createEDataType(); 
			kermetaTypesAlias.setName( KM2Ecore.KERMETA_TYPES );
			kermetaTypesAlias.setInstanceClassName("java.lang.Object");
		}
		return kermetaTypesAlias;
	}
	
	private Hashtable<KermetaUnit, Ecore2KMDatas> passDatas = new Hashtable <KermetaUnit, Ecore2KMDatas> ();
		
	//private Ecore2KMDatas passDatas = new Ecore2KMDatas();
	
	private ResourceSet resourceSet = new ResourceSetImpl();
	
	private HashMap <KermetaUnit, Resource> resources = new HashMap <KermetaUnit, Resource> ();
	
	private boolean isQuickFixEnabled = false;
	
	private KermetaUnit getKermetaUnit(String uri) {
		KermetaUnit kermetaUnit = null;
		
		try {
			kermetaUnit = IOPlugin.getDefault().getKermetaUnit(uri);
		
			if  ( ! passDatas.contains(kermetaUnit) ) 
				passDatas.put(kermetaUnit, new Ecore2KMDatas() );
		
			if ( ! resources.containsKey(kermetaUnit) ) {
				
				/*
				 * 
				 * Special case for Registered Ecore files because the creation of the resource 
				 * with the URI http://www.eclipse.org/emf/2002/Ecore
				 * seams forbidden.
				 * 
				 */
				EPackage p = (EPackage) Registry.INSTANCE.get(uri);
				if ( p != null ) {
					resources.put(kermetaUnit, p.eResource());
					// find all dependencies from this registered EPackage
					Map<EObject,Collection<Setting>> m = EcoreUtil.ExternalCrossReferencer.find(p.eResource());
					for(EObject eobj : m.keySet()){
						if(eobj.eResource()!= null){
							KermetaUnit unit = IOPlugin.getDefault().getKermetaUnit( eobj.eResource().getURI().toString() );
							resources.put(unit, eobj.eResource());
						}
					}
				} else {
					URI emfURI = URI.createURI( uri );
					Resource resource = resourceSet.createResource( emfURI );
					resource.load(null);
					resources.put(kermetaUnit, resource);
					EcoreUtil.resolveAll( resourceSet );
										
					for ( Resource r : resourceSet.getResources() ) {
						if ( r != resource ) {
							KermetaUnit unit = IOPlugin.getDefault().getKermetaUnit( r.getURI().toString() );
							resources.put(unit, r);
						}
					}
					
					Map<EObject,Collection<Setting>> m = EcoreUtil.ExternalCrossReferencer.find(resource);
					for(EObject eobj : m.keySet()){
						if(eobj.eResource()!= null) {
							KermetaUnit unit = IOPlugin.getDefault().getKermetaUnit( eobj.eResource().getURI().toString() );
							resources.put(unit, eobj.eResource());
						}
					}
					
					// update the ImportedKermetaUnit property from the computed resource dependencies
					for(Entry<KermetaUnit,Resource> e : resources.entrySet()){
						if(!e.getKey().getUri().equals(uri)){
							kermetaUnit.getImportedKermetaUnits().add(e.getKey());
							kermetaUnit.addRequire( e.getKey().getUri() );
						}
					}
				}
			}
		} catch ( URIMalformedException exception ) {
			exception.printStackTrace();
			kermetaUnit.error( exception.getLocalizedMessage() );
		} catch (IOException e ) {
			kermetaUnit.error( e.getLocalizedMessage() );
		}
		return kermetaUnit;
	}
	
/*	public KermetaUnit load(String uri) {
		return load(uri, false);
	}
	*/
	public KermetaUnit load(String uri, boolean isQuickFixEnabled) {
		this.isQuickFixEnabled = isQuickFixEnabled;
		KermetaUnit kermetaUnit = null;
		try {
			
			kermetaUnit = getKermetaUnit(uri);

			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			applyPass1ToAll( kermetaUnit );
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			applyPass2ToAll(kermetaUnit);

			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			doImportForAllUnits( kermetaUnit );
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			constructAspectsListsForAll(kermetaUnit);
						
			applyPass3ToAll(kermetaUnit);
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			applyPass4ToAll(kermetaUnit);
			
			if ( kermetaUnit.isErroneous() )
				return kermetaUnit;
			
			applyPass5ToAll(kermetaUnit);
			
			if ( isQuickFixEnabled && ! kermetaUnit.isErroneous() )
				applyPass6ToAll(kermetaUnit);
			
		} catch (IOException e) {
			e.printStackTrace();
			kermetaUnit.error( e.getLocalizedMessage() );
		} catch (KermetaIOFileNotFoundException e) {
			e.printStackTrace();
			kermetaUnit.error( e.getLocalizedMessage() );
		} catch (URIMalformedException e) {
			e.printStackTrace();
			kermetaUnit.error( e.getLocalizedMessage() );
		}
		
		return kermetaUnit;
		
	}
	
	private void applyPass1ToAll(KermetaUnit kermetaUnit) throws IOException, KermetaIOFileNotFoundException, URIMalformedException {

		EcoreBuildingState state = (EcoreBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.pass1done )
			return;
		
		state.loading = true;
		
		internalLog.info( "Applying Pass1 Ecore2KM to " + kermetaUnit.getUri() );
		applyPass1( kermetaUnit );
		
		for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits( kermetaUnit ) ) {
			if ( unit.getUri().matches(".+\\.ecore") ) {
				if  ( ! passDatas.contains(unit) ) 
					passDatas.put(unit, new Ecore2KMDatas() );				
				if ( ! resources.containsKey(unit) ) {
					URI u = URI.createURI( unit.getUri() );
					Resource r = resourceSet.getResource(u, false);
					resources.put(unit, r);
				}
			} else if ( unit.getUri().matches("http:.+") ) {
				 if (  Registry.INSTANCE.get( unit.getUri() ) instanceof EPackage )
					 passDatas.put(unit, new Ecore2KMDatas() );
			}
		}
		
		/*
		 * 
		 * Imported Units can have been added via cross references in the model.
		 * 
		 */
		Iterator <KermetaUnit> iterator = KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit).iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTUnitLoader loader = new KMTUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else if (currentUnit.getUri().matches(".+\\.ecore") ) {	
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					applyPass1ToAll(currentUnit);
			}
		}
		
		/*
		 * 
		 * Or Imported units can have been added via the require tags at the root.
		 * 
		 */
		for ( String s : kermetaUnit.getRequires() ) {
			int index = kermetaUnit.getUri().lastIndexOf("/");
			String currentURI = "";
			
			if ( s.matches("http://.+") )
				currentURI = s;
			else if ( s.equals("kermeta") ) 
				currentURI = IOPlugin.FRAMEWORK_KM_URI;
			else if ( s.matches("platform:/plugin.+") || s.matches("platform:/resource.+") )
				currentURI = s;
			else if ( index != -1 ) {
				currentURI = kermetaUnit.getUri().substring(0, index) + "/" + s;
				currentURI = StringHelper.replaceExtension(currentURI, ".ecore");
				URI uri = URI.createURI( currentURI );
				uri = EcoreHelper.getCanonicalURI(uri);
				currentURI = uri.toString();
			}
			
			KermetaUnit currentUnit = IOPlugin.getDefault().getKermetaUnit( currentURI );
			if ( ! resources.containsKey(currentUnit) )
				IOPlugin.getDefault().loadKermetaUnit( currentURI, monitor );
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTBuildingState currentState = (KMTBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loaded )
					IOPlugin.getDefault().loadKermetaUnit( currentUnit.getUri(), monitor );
			} else if ( currentUnit.getUri().matches(".+\\.km") ) {
				KmBuildingState currentState = (KmBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loaded )
					IOPlugin.getDefault().loadKermetaUnit( currentUnit.getUri(), monitor );
			} else if (currentUnit.getUri().matches(".+\\.ecore") ) {
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					applyPass1ToAll(currentUnit);
			}
			kermetaUnit.getImportedKermetaUnits().addAll( 
					KermetaUnitHelper.getAllImportedKermetaUnits( currentUnit ) );
			
		}
		
		state.loading = false;
		state.pass1done = true;		
	}
	
	private void applyPass1(KermetaUnit kermetaUnit) {
		Resource resource = resources.get(kermetaUnit);
		EObject node = (EObject) resource.getContents().get(0);
		Ecore2KMPass1 pass = new Ecore2KMPass1( kermetaUnit, passDatas.get(kermetaUnit), isQuickFixEnabled, resources.get(kermetaUnit), monitor );
		pass.accept( node );
	}

	
	private void applyPass2ToAll(KermetaUnit kermetaUnit) {

		EcoreBuildingState state = (EcoreBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.pass2done )
			return;
		
		state.loading = true;
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTUnitLoader loader = new KMTUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else {
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					applyPass2ToAll( currentUnit );
			}
		}
		
		internalLog.info( "Applying Pass2 Ecore2KM to " + kermetaUnit.getUri() );
		applyPass2( kermetaUnit );
			
		state.loading = false;
		state.pass2done = true;	
	}
	
	private void applyPass2(KermetaUnit kermetaUnit) {
		Resource resource = resources.get(kermetaUnit);
		Ecore2KMPass2 pass = new Ecore2KMPass2( kermetaUnit, passDatas.get(kermetaUnit), isQuickFixEnabled, monitor );
		Iterator<EObject> iterator = resource.getContents().iterator();
		while ( iterator.hasNext() ) {
			EObject node = iterator.next();
			pass.accept( node );
		}
	}
	
	private void doImportForAllUnits(KermetaUnit kermetaUnit) {
		EcoreBuildingState state = (EcoreBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.importDone )
			return;
		
		state.loading = true;
		
		Iterator <KermetaUnit> iterator = KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit).iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTUnitLoader loader = new KMTUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else {	
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					doImportForAllUnits( currentUnit );
			}
		}
		
		internalLog.info( "Importing units for " + kermetaUnit.getUri() );
		doImport( kermetaUnit );
		kermetaUnit.getTypeDefinitionCache().setExternalSearchAuthorized( true );	
		
		state.loading = false;
		state.importDone = true;
	}
	
	private void doImport(KermetaUnit kermetaUnit) {
		Iterator <KermetaUnit> iterator = KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit).iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			kermetaUnit.importKermetaUnit( currentUnit, true );
		}
	}
	
	private void applyPass3ToAll(KermetaUnit kermetaUnit) {

		EcoreBuildingState state = (EcoreBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.pass3done )
			return;
		
		state.loading = true;
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTUnitLoader loader = new KMTUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else {
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					applyPass3ToAll( currentUnit );
			}
		}
		
		internalLog.info( "Applying Pass3 Ecore2KM to " + kermetaUnit.getUri() );
		applyPass3( kermetaUnit );
			
		state.loading = false;
		state.pass3done = true;	
	}
	
	private void applyPass3(KermetaUnit kermetaUnit) {
		Resource resource = resources.get(kermetaUnit);
		Ecore2KMPass3 pass = new Ecore2KMPass3( kermetaUnit, passDatas.get(kermetaUnit), isQuickFixEnabled, monitor );
		Iterator<EObject> iterator = resource.getContents().iterator();
		while ( iterator.hasNext() ) {
			EObject node = iterator.next();
			pass.accept( node );
		}
	}
	
	
	private void applyPass4ToAll(KermetaUnit kermetaUnit) {

		EcoreBuildingState state = (EcoreBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.pass4done )
			return;
		
		state.loading = true;
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTUnitLoader loader = new KMTUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else  if ( currentUnit.getUri().matches(".+\\.ecore") ) {	
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					applyPass4ToAll( currentUnit );
			}
		}
		
		internalLog.info( "Applying Pass4 Ecore2KM to " + kermetaUnit.getUri() );
		applyPass4( kermetaUnit );
			
		state.loading = false;
		state.pass4done = true;	
		state.loaded = true;
	}
	
	private Hashtable <KermetaUnit, Hashtable<Operation, ArrayList<Operation>>> opTables = 
			new Hashtable <KermetaUnit, Hashtable<Operation, ArrayList<Operation>>> ();
	
	private void applyPass4(KermetaUnit kermetaUnit) {
		Ecore2KMPass4 pass = new Ecore2KMPass4( kermetaUnit, passDatas.get(kermetaUnit), isQuickFixEnabled, getLoadingContext(kermetaUnit), monitor );
		pass.convertUnit();
		/*Iterator iterator = resource.getContents().iterator();
		while ( iterator.hasNext() ) {
			EObject node = (EObject) iterator.next();
			pass.accept( node );
		}*/
		opTables.put(kermetaUnit, pass.opTable);
	}
	
	
	private void applyPass5ToAll(KermetaUnit kermetaUnit) {

		EcoreBuildingState state = (EcoreBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.pass5done )
			return;
		
		state.loading = true;
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			
			KermetaUnit currentUnit = iterator.next();
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTUnitLoader loader = new KMTUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else  if ( currentUnit.getUri().matches(".+\\.ecore") ) {	
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					applyPass5ToAll( currentUnit );
			}

		}
		
		internalLog.info( "Applying Pass5 Ecore2KM to " + kermetaUnit.getUri() );
		applyPass5( kermetaUnit );
			
		state.loading = false;
		state.pass5done = true;	
	}
	
	private void applyPass5(KermetaUnit kermetaUnit) {
		Resource resource = resources.get(kermetaUnit);
		Ecore2KMPass5 pass = new Ecore2KMPass5( kermetaUnit, passDatas.get(kermetaUnit), isQuickFixEnabled, getLoadingContext(kermetaUnit), monitor );
		Iterator<EObject> iterator = resource.getContents().iterator();
		while ( iterator.hasNext() ) {
			EObject node = iterator.next();
			pass.accept( node );
		}
	}
	
	
	private void applyPass6ToAll(KermetaUnit kermetaUnit) {

		EcoreBuildingState state = (EcoreBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.pass6done )
			return;
		
		state.loading = true;
		
		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			
			KermetaUnit currentUnit = iterator.next();
			if ( currentUnit.getUri().matches(".+\\.kmt") ) {
				KMTUnitLoader loader = new KMTUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else if ( currentUnit.getUri().matches(".+\\.km") ) {
				KMUnitLoader loader = new KMUnitLoader(monitor);
				loader.load( currentUnit.getUri() );
			} else  if ( currentUnit.getUri().matches(".+\\.ecore") ) {	
				EcoreBuildingState currentState = (EcoreBuildingState) currentUnit.getBuildingState();
				if ( ! currentState.loading )
					applyPass6ToAll( currentUnit );
			}

		}
		
		internalLog.info( "Applying Pass5 Ecore2KM to " + kermetaUnit.getUri() );
		applyPass6( kermetaUnit );
			
		state.loading = false;
		state.pass6done = true;	
	}
	
	private void applyPass6(KermetaUnit kermetaUnit) {
		Resource resource = resources.get(kermetaUnit);
		Ecore2KMPass6 pass = new Ecore2KMPass6( kermetaUnit, passDatas.get(kermetaUnit), isQuickFixEnabled, opTables.get(kermetaUnit), monitor );
		Iterator<EObject> iterator = resource.getContents().iterator();
		while ( iterator.hasNext() ) {
			EObject node = iterator.next();
			pass.accept( node );
		}
	}
	
}


