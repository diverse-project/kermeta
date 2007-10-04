

/*$Id: RequireConstraint.java,v 1.1 2007-10-04 07:22:52 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	RequireConstraint.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 3 oct. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.constraintchecker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	public void check() {
		
		Map<String, List<Package>> mappings = new HashMap<String, List<Package>> ();
		for ( KermetaUnitRequire kuRequire : requires ) {
			for ( Package p : kuRequire.getKermetaUnit().getInternalPackages() ) {
				String qualifiedName = NamedElementHelper.getQualifiedName(p);
				List<Package> l = mappings.get(qualifiedName);
				if ( l == null ) {
					l = new ArrayList<Package>();
					mappings.put(qualifiedName, l);
				}
				l.add( p );
			}
		}
		
		for ( String packageQualifiedName : mappings.keySet() ) {
			List<Package> l = mappings.get(packageQualifiedName);
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
					for ( TypeDefinition t : typeDefinitions ) {
						if ( ! t.isIsAspect() && ! baseFound ) {
							baseFound = true;
						} else
							good = good && t.isIsAspect();
					}
					if ( ! good ) {
						String message = "Type Definition " + typeDefinitionQualifiedName + " with the same qualified name are imported from several files : ";
						String units = "";
						Set<KermetaUnit> unitsProcessed = new HashSet<KermetaUnit>(); 
						Set<Require> requiresErroneous = new HashSet<Require>();
						for ( TypeDefinition tdef : typeDefinitions ) {
							KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(tdef);
							if ( ! unitsProcessed.contains(unit) ) {
								units += unit.getUri() + "\n";
								requiresErroneous.add( getRequire(unit) );
							}
						}
						message += units;
						for ( Require r : requiresErroneous ) {
							kermetaUnit.error(message, r);
						}
					}
				}
				
			}
		}
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
	
	private Require getRequire(KermetaUnit requiredUnit) {
		for ( KermetaUnitRequire kuRequire : kermetaUnit.getKermetaUnitRequires() ) {
			if ( kuRequire.getKermetaUnit() == requiredUnit )
				return kuRequire.getRequire();
		}
		return null;
	}
	
}


