

/*$Id: ModelingUnitHelper.java,v 1.5 2008-04-28 11:50:17 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ModelingHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 juil. 07
* Authors : Francois Tanguy ftanguy@irisa.fr
*/

package fr.irisa.triskell.kermeta.modelhelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.tool.ContainedTypeDefinitionFinder;
import fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor;

/**
 * 
 * 
 * TODO move these operations to the ModelingUnitHelper class in the kermeta.model package
 * 
 * @author paco
 *
 */
public class ModelingUnitHelper {

	//////////////////////////////
	//////////////////////////////
	//		Main Operation		//
	//////////////////////////////
	//////////////////////////////
	
	static public String getMainOperationValue(KermetaUnit kermetaUnit) {
		return getMainOperationValue( kermetaUnit.getModelingUnit() );
	}
	
	static public String getMainOperationValue(ModelingUnit modelingUnit) {
		Tag t = getMainOperation(modelingUnit);
		if ( t != null )
			return t.getValue();
		return null;
	}
	
	static public Tag getMainOperation(KermetaUnit kermetaUnit) {
		return getMainOperation( kermetaUnit.getModelingUnit() );
	}
	
	/**
	 * 
	 * @param modelingUnit
	 * @return
	 */
	static public Tag getMainOperation(ModelingUnit modelingUnit) {
		for ( Tag tag : (List<Tag>) modelingUnit.getOwnedTags() ) {
			if ( (tag.getName() != null) && tag.getName().equals("mainOperation") )
				return tag;
		}
		return null;
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 * @return
	 */
	static public String getMainOperationAsString(KermetaUnit kermetaUnit) {
		if( getMainOperation(kermetaUnit) != null ) {
			return getMainOperation(kermetaUnit).getValue();
		}
		return null;
	}
	
	/**
	 * 
	 * @param modelingUnit
	 * @return
	 */
	static public String getMainOperationAsString(ModelingUnit modelingUnit) {
		if( getMainOperation(modelingUnit) != null ) {
			return getMainOperation(modelingUnit).getValue();
		}
		return null;
	}
	
	//////////////////////////
	//////////////////////////
	//		Main Class		//
	//////////////////////////
	//////////////////////////
	
	static public String getMainClassValue(KermetaUnit kermetaUnit) {
		return getMainClassValue( kermetaUnit.getModelingUnit() );
	}
	
	static public String getMainClassValue(ModelingUnit modelingUnit) {
		Tag t = getMainClass(modelingUnit);
		if ( t != null )
			return t.getValue();
		return null;
	}
	
	static public Tag getMainClass(KermetaUnit kermetaUnit) {
		return getMainClass( kermetaUnit.getModelingUnit() );
	}
	
	static public Tag getMainClass(ModelingUnit modelingUnit) {
		for ( Tag tag : (List<Tag>) modelingUnit.getOwnedTags() ) {
			if ( (tag.getName() != null) && tag.getName().equals("mainClass") )
				return tag;
		}
		return null;
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 * @return
	 */
	static public String getMainClassAsString(KermetaUnit kermetaUnit) {
		if( getMainClass(kermetaUnit) != null ) {
			return getMainClass(kermetaUnit).getValue();
		}
		return null;
	}
	
	/**
	 * 
	 * @param modelingUnit
	 * @return
	 */
	static public String getMainClassAsString(ModelingUnit modelingUnit) {
		if( getMainClass(modelingUnit) != null ) {
			return getMainClass(modelingUnit).getValue();
		}
		return null;
	}
	
	
	/**
	 * returns a list of the ModelingUnit required units(directly or indirectly from this unit) doesn't contains 
	 * the unit even if it is indirectly required
	 * @param value
	 * @return
	 */
	static public List <ModelingUnit> getAllImportedKermetaUnits(ModelingUnit value) {
		List <ModelingUnit> units = new ArrayList <ModelingUnit> ();
		if ( value != null )
			getAllImportedKermetaUnits(value, units);
		units.remove(value);  // if contains the value, remove it
		return units;
	}
	/**
	 * completes the list of ModelingUnit required units(directly or indirectly from this unit)
	 * it may contains itself if it is indirectly required
	 * @param value
	 * @param units
	 */
	static private void getAllImportedKermetaUnits(ModelingUnit value, List <ModelingUnit> units) {
		Iterator <ModelingUnit> iterator = value.getReferencedModelingUnits().iterator();
		while ( iterator.hasNext() ) {
			ModelingUnit current = iterator.next();
			if ( ! units.contains(current) ) {
				units.add( current );
				getAllImportedKermetaUnits(current, units);
			}
		}
	}
	
	/**
	 * returns a list of the TypeDefinition contained by this ModelingUnit
	 * @param value
	 * @return
	 */
	static public List <TypeDefinition> getContainedTypeDefinitions(ModelingUnit value) {
		List <TypeDefinition> typeDefinitions = ContainedTypeDefinitionFinder.findContainedTypeDefinitions(value);
		return typeDefinitions;
	}
	
	static public TypeDefinition findContainedTypeDefinitionByQualifiedName(ModelingUnit mu, String qualifiedName) {
		List <TypeDefinition> typeDefinitions = getContainedTypeDefinitions(mu);
		for(TypeDefinition td : typeDefinitions){
			if(KermetaModelHelper.ClassDefinition.qualifiedName(td).equals(qualifiedName))
				return td;
		}
		return null;
	}
	
}


