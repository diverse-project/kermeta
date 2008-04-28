package fr.irisa.triskell.kermeta.modelhelper;

import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

/**
 * this class proposes various helper functions that applies to ModelType in the Kermeta model
 *
 */
public class ModelTypeHelper {

	public static TypeDefinition getTypeDefinitionByName(ModelType mt, String typeName) {
		
		for(TypeDefinition tdef : mt.getIncludedTypeDefinition()) {
			if (typeName.equals(tdef.getName())) {
				return tdef;
			}
		}
		return null;
	}
	
}
