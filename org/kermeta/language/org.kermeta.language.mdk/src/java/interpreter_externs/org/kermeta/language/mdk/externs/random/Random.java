

/*$Id: Random.java,v 1.2 2009-01-22 16:45:23 cfaucher Exp $
* Project : org.kermeta.language.mdk
* File : 	Random.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 déc. 2008
* Authors : cfaucher
*/

package org.kermeta.language.mdk.externs.random;

import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;

public class Random {

	/**
	 * Get randomly an Integer between 0 and (param0 - 1)
	 * @param self
	 * @param param0
	 * @return
	 */
	public static RuntimeObject nextInteger(RuntimeObject self, RuntimeObject param0) {
	    int _size = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(param0);
    	java.lang.Integer number = RandomSingleton.getInstance().getRandomJava().nextInt(_size);
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		fr.irisa.triskell.kermeta.runtime.basetypes.Integer.setValue(result, number);
		return result;
	}
	
	/**
	 * Get a sequence of Integer between 0 and param0, the interval decreases for each increasing id
	 * @param self
	 * @param param0
	 * @return
	 */
	public static RuntimeObject getIntegerSequenceRandomly(RuntimeObject self, RuntimeObject param0) {
			
		RuntimeObjectFactory factory = self.getFactory();
	    GenericTypeDefinition typeVarClassDef  = (GenericTypeDefinition)factory.getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Integer");
	    fr.irisa.triskell.kermeta.language.structure.Class typeParam = StructureFactory.eINSTANCE.createClass();
	    typeParam.setTypeDefinition(typeVarClassDef);
		
	    RuntimeObject result = fr.irisa.triskell.kermeta.runtime.basetypes.Collection.create("kermeta::standard::Sequence", factory, typeParam);
	    
	    java.util.Random rdm = RandomSingleton.getInstance().getRandomJava();
	    
	    int size = fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(param0);
		
	    for(int i = size ; i>0 ; i--) {
	    	java.lang.Integer number = rdm.nextInt(i);
			RuntimeObject addedNumber = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
			fr.irisa.triskell.kermeta.runtime.basetypes.Integer.setValue(addedNumber, number);
			fr.irisa.triskell.kermeta.runtime.basetypes.Collection.add(result, addedNumber);
		}

	    return result;
		
	}
		
}


