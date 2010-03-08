

/*$Id: ConstructAspects.java,v 1.2 2008-02-14 07:12:50 uid21732 Exp $
* Project : org.kermeta.io.loader
* File : 	ConstructAspects.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 déc. 07
* Authors : paco
*/

package org.kermeta.kermetaunitloader.core;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class BuildAspects {

	public static void build(KermetaUnit kermetaUnit) {


		List<KermetaUnit> importedUnits = KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit);
		
		/*
		 * 
		 * For each Class Definition, try to find some aspects coming from imported units.
		 * 
		 */
		for ( TypeDefinition td : KermetaUnitHelper.getInternalTypeDefinitions(kermetaUnit) ) {
			
			if ( td.isIsAspect() && td instanceof ClassDefinition ) {
				ClassDefinition aspect = (ClassDefinition) td;
				String qualifiedName = KermetaModelHelper.ClassDefinition.qualifiedName(aspect);
				for ( KermetaUnit importedUnit : importedUnits ) {
					TypeDefinitionCacheEntry entry = importedUnit.getTypeDefinitionCache().getEntries().get(qualifiedName);
					if ( entry != null ) {
						ClassDefinition baseClassOrAspect = (ClassDefinition) entry.getTypeDefinition();
						
						/*
						 * 
						 * If both type definition are aspects, let's change the aspects collection in the kermeta units.
						 * Otherwise, it means that "baseClassOrAspect" is a base class for the current type definition.
						 * 
						 */
						if ( baseClassOrAspect.isIsAspect() ) {
							EList<TypeDefinition> aspects = kermetaUnit.getBaseAspects().get(aspect);
							if ( aspects == null ) {
								aspects = new UniqueEList<TypeDefinition>();
								kermetaUnit.getAspects().put(aspect, aspects);
							}
							aspects.add(baseClassOrAspect);	
							
						} else {
							/*
							 * 
							 * Updating the base aspects list for the aspect.
							 * 
							 */
							EList<TypeDefinition> baseAspects = kermetaUnit.getBaseAspects().get(aspect);
							if ( baseAspects == null ) {
								baseAspects = new UniqueEList<TypeDefinition>();
								kermetaUnit.getBaseAspects().put(aspect, baseAspects);
							}
							baseAspects.add(baseClassOrAspect);

						}
						
						/*
						 * 
						 * Updating the aspects for the base class.
						 * 
						 */
						EList<TypeDefinition> aspects = importedUnit.getAspects().get(baseClassOrAspect);
						if ( aspects == null ) {
							aspects = new UniqueEList<TypeDefinition>();
							importedUnit.getAspects().put(baseClassOrAspect, aspects);
						}
						aspects.add(aspect);
					}
				}
			}
			
		}
		
	}

}


