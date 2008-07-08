

/*$Id: TypeReferenceCloner.java,v 1.3 2008-07-08 13:18:33 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	TypeReferenceCloner.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 mars 08
* Authors : paco
*/

package org.kermeta.merger.internal.behavior;

import org.kermeta.io.KermetaUnit;
import org.kermeta.merger.internal.util.TypeCloner;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorFactory;
import fr.irisa.triskell.kermeta.language.behavior.TypeReference;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.VoidType;
import fr.irisa.triskell.kermeta.language.structure.Object;

public class TypeReferenceCloner {

	static public Object clone(TypeReference node, AbstractBehaviorCloner visitor) {
		TypeReference typeReference = BehaviorFactory.eINSTANCE.createTypeReference();
		typeReference.setIsOrdered( node.isIsOrdered() );
		typeReference.setIsUnique( node.isIsUnique() );
		typeReference.setLower( node.getLower() );
		typeReference.setName( node.getName() );
		typeReference.setUpper( node.getUpper() );
		setType( typeReference, node.getType(), visitor.getKermetaUnit() );
		return typeReference;
	}

	static private void setType(TypeReference typeReference, Type baseType, KermetaUnit unit) {
		Type type = TypeCloner.clone( baseType, unit );
		if ( type instanceof Class || type instanceof VoidType )
			typeReference.getContainedType().add( type );
		typeReference.setType( type );
	}
	
}


