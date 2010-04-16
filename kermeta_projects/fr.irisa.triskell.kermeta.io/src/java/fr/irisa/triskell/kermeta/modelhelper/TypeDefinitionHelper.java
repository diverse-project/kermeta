package fr.irisa.triskell.kermeta.modelhelper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.UniqueEList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class TypeDefinitionHelper {

	
	/**
	 * find all aspects for this typeDefinition
	 * search in this ModelingUnit and in its importedUnits
	 * @param rootUnit
	 * @param td
	 * @return
	 */
	static public List<TypeDefinition> getAllAspects(ModelingUnit rootUnit, TypeDefinition td) {
		return getAllAspects(rootUnit, KermetaModelHelper.ClassDefinition.qualifiedName(td));		
	}
	
	/**
	 * raw search of aspect, it will traverse the unit (and thus is quite inefficient if used intensively)
	 * @param rootUnit
	 * @param typeDefinitionQualifiedName
	 * @return
	 */
	static public List<TypeDefinition> getAllAspects(ModelingUnit rootUnit, String typeDefinitionQualifiedName){
		List<TypeDefinition> result = new UniqueEList<TypeDefinition>();
		List<ModelingUnit> searchedUnits = ModelingUnitHelper.getAllImportedKermetaUnits(rootUnit);
		searchedUnits.add(rootUnit);
		for ( ModelingUnit importedUnit : searchedUnits ) {
			TypeDefinition entry = ModelingUnitHelper.findContainedTypeDefinitionByQualifiedName(importedUnit, typeDefinitionQualifiedName);
			if(entry!= null)
				result.add(entry);
		}
		return result;
	}
	
	/**
	 * Variant that looks for aspects of a type definition that use the cache of the KermetaUnit 
	 * @param rootUnit
	 * @param typeDefinitionQualifiedName
	 * @return
	 */
	static public List<TypeDefinition> getAllAspects(KermetaUnit rootUnit, String typeDefinitionQualifiedName){
		List<TypeDefinition> result = new UniqueEList<TypeDefinition>();
		List<KermetaUnit> searchedUnits = KermetaUnitHelper.getAllImportedKermetaUnits(rootUnit);
		searchedUnits.add(0,rootUnit);
		for ( KermetaUnit importedUnit : searchedUnits ) {
			TypeDefinition entry = importedUnit.getTypeDefinitionByQualifiedName( typeDefinitionQualifiedName);
			if(entry!= null)
				result.add(entry);
		}
		return result;
	}
	
	
	/**
	 * find aspects for this typeDefinition but return only those with aspect attribute set to true
	 * @param rootUnit
	 * @param td
	 * @return
	 */
	static public List<TypeDefinition> getAspects(ModelingUnit rootUnit, TypeDefinition td) {
		List<TypeDefinition> result = new ArrayList<TypeDefinition> ();
		for(TypeDefinition td2 : getAllAspects(rootUnit, td)){
			if(td2.isIsAspect())
				result.add(td2);
		}
		return result;
		/*KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject(td);
		List<TypeDefinition> result = null;
		if ( kermetaUnit != null )
			result = kermetaUnit.getAspects().get(td);
		if ( result == null )
			result = new ArrayList<TypeDefinition> ();
		return result; */
	}
	
	/**
	 * find aspects for this typeDefinition but return only those which aren't declared as aspect
	 * @param rootUnit
	 * @param td
	 * @return
	 */
	static public List<TypeDefinition> getBaseAspects(ModelingUnit rootUnit, TypeDefinition td) {
		List<TypeDefinition> result = new ArrayList<TypeDefinition> ();
		for(TypeDefinition td2 : getAllAspects(rootUnit, td)){
			if(!td2.isIsAspect())
				result.add(td2);
		}
		/*KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject(td);
		List<TypeDefinition> result = null;
		if ( kermetaUnit != null )
			result = kermetaUnit.getBaseAspects().get(td);
		if ( result == null )
			result = new ArrayList<TypeDefinition> ();
			*/
		return result;
	}
	
}
