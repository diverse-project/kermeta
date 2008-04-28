

/*$Id: RequireConstraint.java,v 1.7 2008-04-28 11:50:11 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	RequireConstraint.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 3 oct. 07
* Authors : 
*		Francois Tanguy
*		Didier Vojtisek
*/

package fr.irisa.triskell.kermeta.constraintchecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecoretools.registration.EMFRegistryHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitRequire;

import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;

/**
 * 
 * Make sure that two requires do not collide.
 * 
 * Example : 
 * 		a file A require a file B and a file C
 * 		file B and file C defines the same class.
 * 		-> the file A is erroneous because the requires collide.
 * 
 * @author paco
 *
 */
public class RequireConstraint {

	private KermetaUnit kermetaUnit = null;
	
	private List<KermetaUnitRequire> requires = null;
	
	public RequireConstraint(KermetaUnit kermetaUnit) {
		this.kermetaUnit = kermetaUnit;
		requires = getAllRequires();
	}

	private boolean isInternal(TypeDefinition td, List<Package> l) {
		return l.contains(td.eContainer());
	}
	
	public void check() {
		
		Map<String, Set<Package>> mappings = new HashMap<String, Set<Package>> ();
		/*
		 * 
		 * Adding the internal packages because, some internal definitions may redefine some from required files.
		 * 
		 */
		List<Package> internalPackages = kermetaUnit.getInternalPackages();
		for ( Package p : internalPackages ) {
			String qualifiedName = NamedElementHelper.getQualifiedName(p);
			Set<Package> l = mappings.get(qualifiedName);
			if ( l == null ) {
				l = new HashSet<Package>();
				mappings.put(qualifiedName, l);
			}
			l.add( p );
		}	
		
		for ( KermetaUnitRequire kuRequire : requires ) {
			for ( Package p : kuRequire.getKermetaUnit().getInternalPackages() ) {
				String qualifiedName = NamedElementHelper.getQualifiedName(p);
				Set<Package> l = mappings.get(qualifiedName);
				if ( l == null ) {
					l = new HashSet<Package>();
					mappings.put(qualifiedName, l);
				}
				l.add( p );
			}
		}
		Map<Require, List<String>> errorsForRequireStatement = new HashMap<Require, List<String>>();
		Map<Require, List<String>> warningsForRequireStatement = new HashMap<Require, List<String>>();
		
		for ( String packageQualifiedName : mappings.keySet() ) {
			Set<Package> l = mappings.get(packageQualifiedName);
			/*
			 * 
			 * If size > 1 it means that the package with the qualifiedName has been declared twice.
			 * Let's see if some type definitions collide.
			 * 
			 */
			if ( l.size() > 1 ) {
				Map<String, List<TypeDefinition>> typeDefinitionMappings = new HashMap<String, List<TypeDefinition>>();
				for ( Package p : l ) {
					for ( TypeDefinition tdef : p.getOwnedTypeDefinition() ) {
						String qualifiedName = NamedElementHelper.getQualifiedName(tdef);
						List<TypeDefinition> typeDefinitions = typeDefinitionMappings.get(qualifiedName);
						if ( typeDefinitions == null ) {
							typeDefinitions = new ArrayList<TypeDefinition>();
							typeDefinitionMappings.put(qualifiedName, typeDefinitions);
						}
						typeDefinitions.add( tdef );
					}
				}
				
				for ( String typeDefinitionQualifiedName : typeDefinitionMappings.keySet() ) {
					List<TypeDefinition> typeDefinitions = typeDefinitionMappings.get(typeDefinitionQualifiedName);
					boolean good = true;
					boolean baseFound = false;
					TypeDefinition internalTypeDefinition = null;
					for ( TypeDefinition t : typeDefinitions ) {
						// Is it an internal definition ?
						if ( internalTypeDefinition == null && isInternal(t, internalPackages) )
							internalTypeDefinition = t;
						if ( ! t.isIsAspect() && ! baseFound ) {
							baseFound = true;
						} else {
							good = good && t.isIsAspect();
						}
					}
					if ( ! good ) {
						// The message depends on the status of the internalTypeDefinition variable.
						// If it is not null, it means that we tried to define a type definition that already exists somewhere in the required files.
						// If it is null, it means that we are importing at least two type definitions coming from required files.
						String message = "Type Definition " + typeDefinitionQualifiedName;
						if ( internalTypeDefinition != null ) {
							message += " already exists in ";
						} else {
							message += " with the same qualified name are imported from several files : ";
						}
						String units = "";
						Set<KermetaUnit> unitsProcessed = new HashSet<KermetaUnit>(); 
						Set<Require> requiresErroneous = new HashSet<Require>();
						// used to count the number of definition that comes from a file, it ignores definitions coming from unit that correspond to registered EPackage
						int nbComingFromAFile = 0;
						for ( TypeDefinition tdef : typeDefinitions ) {
							KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(tdef);
							if ( ! unitsProcessed.contains(unit) && (unit != kermetaUnit) ) {
								units += unit.getUri() + "\n";
								requiresErroneous.addAll( getIndirectRequire(kermetaUnit, unit) );
								//requiresErroneous.add( getRequire( unit) );
								if(!EMFRegistryHelper.isRegistered(unit.getUri())) 
									nbComingFromAFile++;
							}
						}
						message += units;
						
						if ( internalTypeDefinition == null ) {
							for ( Require r : requiresErroneous ) {
							
								if(nbComingFromAFile>1){
									if(!errorsForRequireStatement.containsKey(r)){
										errorsForRequireStatement.put(r, new ArrayList<String>());
									}
									errorsForRequireStatement.get(r).add(message);
								}
								else{
									if(!warningsForRequireStatement.containsKey(r))
										warningsForRequireStatement.put(r, new ArrayList<String>());
									warningsForRequireStatement.get(r).add(message);
								}
							}
						} else
							kermetaUnit.error(message, internalTypeDefinition);
					}
				}
				
			}
		}
		// mark the require
		for(Require req : errorsForRequireStatement.keySet()){
			List<String> msgs = errorsForRequireStatement.get(req);
			if(msgs.size() > 1){
				// we have many error on the same require, print only the first
				String message = "This unit imports "+ msgs.size()+ " definitions that comes from several files. The first is :\n";
				message += msgs.get(0);
				kermetaUnit.error(message, req);
			} 
			else if (msgs.size() == 1){
				// print the only message 
				kermetaUnit.error(msgs.get(0), req);
			}
		}
		for(Require req : warningsForRequireStatement.keySet()){
			List<String> msgs = warningsForRequireStatement.get(req);
			if(msgs.size() > 1){
				// we have many error on the same require, print only the first
				String message = "This unit imports several "+ msgs.size()+ " definitions that comes from several files. The first is :\n";
				message += msgs.get(0);
				kermetaUnit.warning(message, req);
			} 
			else if (msgs.size() == 1){
				// print the only message 
				kermetaUnit.warning(msgs.get(0), req);
			}
		}
		requires.clear();
		kermetaUnit = null;
	}
	
	private List<KermetaUnitRequire> getAllRequires() {
		List<KermetaUnitRequire> r = new ArrayList<KermetaUnitRequire>();
		List<KermetaUnit> unitsProcessed = new ArrayList<KermetaUnit>();
		getAllRequires(kermetaUnit, unitsProcessed, r);
		return r;
	}
	
	private void getAllRequires(KermetaUnit unit, List<KermetaUnit> unitsProcessed, List<KermetaUnitRequire> r) {
		if ( ! unitsProcessed.contains(unit) && ! unit.isFramework() ) {
			unitsProcessed.add(unit);
			r.addAll( unit.getKermetaUnitRequires() );
			for ( KermetaUnit u : unit.getImportedKermetaUnits() )
				getAllRequires(u, unitsProcessed, r);
		}
	}
	
	
	/**
	 * which Require statement of this.kermetaUnit directly require the requiredUnit
	 * @param requiredUnit
	 * @return
	 */
	private Require getRequire(KermetaUnit selfUnit, KermetaUnit requiredUnit){
		
		for ( KermetaUnitRequire kuRequire : selfUnit.getKermetaUnitRequires() ) {
			if ( kuRequire.getKermetaUnit() == requiredUnit )
				return kuRequire.getRequire();
		}
		return null;
		
	}
	
	/**
	 * get list of Require from selfUnit that directly or indirectly require the requiredUnit
	 * @param selfUnit
	 * @param requiredUnit
	 * @return
	 */
	private Set<Require> getIndirectRequire(KermetaUnit selfUnit, KermetaUnit requiredUnit){
		Set<Require> result = new HashSet<Require>();
		
		if(getRequire(selfUnit, requiredUnit) != null)
			result.add(getRequire(selfUnit, requiredUnit));
		List<KermetaUnit> allImportedUnit = KermetaUnitHelper.getAllImportedKermetaUnits(selfUnit);
		// this is an indirect require
		for(KermetaUnit iu : allImportedUnit){
			if(iu != requiredUnit){
				
				if(getRequire(iu, requiredUnit) != null){
					// search the require that was requiring it
					result.addAll(getIndirectRequire(selfUnit,iu));
				}
			}
		}
		
		return result;
	}
	
}


