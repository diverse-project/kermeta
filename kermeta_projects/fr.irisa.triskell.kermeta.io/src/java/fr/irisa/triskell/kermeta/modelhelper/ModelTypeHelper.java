package fr.irisa.triskell.kermeta.modelhelper;

import java.util.HashMap;
import java.util.Map;

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
	
	/**
	 * Put in a map the elements of rename tag. 
	 * For example : @rename "UmlMT=packagedElement kermetaMT=ownedTypeDefinition" 
	 *               attribute ownedClass : set MyClass[0..*]
	 * 
	 * Result : Map<UmlMT, packagedElement> Map<kermetaMT, ownedTypeDefinition>
	 * 
	 * @author moha
	 * @since 23/12/2008
	 * 
	 * @param String
	 *            valueRenameTag
	 * @return Map<String, String>
	 */
	public static Map<String, String> getElemsValueRenameTag(String valueRenameTag) {
		Map<String, String> elemsTag = new HashMap<String, String>();
		if (valueRenameTag != null) {
			String elems[] = valueRenameTag.split(" ");
			for (String elem : elems) {
				String sub_elems[] = null;
				sub_elems = elem.split("=");
				if (sub_elems.length > 1) {
					elemsTag.put(sub_elems[0], sub_elems[1]);
				}
			}
		}
		return elemsTag;
	}
	
}
