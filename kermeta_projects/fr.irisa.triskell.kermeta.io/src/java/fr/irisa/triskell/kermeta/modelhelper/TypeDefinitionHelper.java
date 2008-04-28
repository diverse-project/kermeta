package fr.irisa.triskell.kermeta.modelhelper;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

public class TypeDefinitionHelper {

	static public List<TypeDefinition> getAspects(TypeDefinition td) {
		KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject(td);
		List<TypeDefinition> result = null;
		if ( kermetaUnit != null )
			result = kermetaUnit.getAspects().get(td);
		if ( result == null )
			result = new ArrayList<TypeDefinition> ();
		return result;
	}
	
	static public List<TypeDefinition> getBaseAspects(TypeDefinition td) {
		KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject(td);
		List<TypeDefinition> result = null;
		if ( kermetaUnit != null )
			result = kermetaUnit.getBaseAspects().get(td);
		if ( result == null )
			result = new ArrayList<TypeDefinition> ();
		return result;
	}
	
}
