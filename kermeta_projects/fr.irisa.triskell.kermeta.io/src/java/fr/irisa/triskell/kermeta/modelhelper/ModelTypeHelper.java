package fr.irisa.triskell.kermeta.modelhelper;

import java.util.Iterator;

import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class ModelTypeHelper {

	public static TypeDefinition getTypeDefinitionByName(ModelType mt, String typeName) {
		Iterator included = mt.getIncludedTypeDefinition().iterator();
		while (included.hasNext()) {
			TypeDefinition tdef = (TypeDefinition) included.next();
			if (typeName.equals(tdef.getName())) {
				return tdef;
			}
		}
		return null;
	}
	
}
