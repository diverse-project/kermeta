

/*$Id: OperationHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	ClassDefinitionHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import java.util.ArrayList;
import java.util.List;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

public class OperationHelper {
	
	static public Operation create(String name) {
		return create(name, false);
	}
	
	static public Operation create(String name, boolean isAbstract) {
		Operation o = StructureFactory.eINSTANCE.createOperation();
		o.setName( name );
		o.setIsAbstract( isAbstract );
		return o;
	}
	
	public static Parameter getParameter(Operation op, String parameterName) {
		for ( Parameter p : op.getOwnedParameter() ) {
			if ( p.getName().equals(parameterName) )
				return p;
		}
		return null;
	}
	
	static public TypeVariable getTypeVariable(Operation op, String name) {
		for ( TypeVariable tv : op.getTypeParameter() )
			if ( tv.getName().equals(name) )
				return tv;
		return null;
	}
	
	static public List<Operation> getSuperOperations(Operation node) {
		Operation superOp = node.getSuperOperation();
		List<Operation> list_superOps = new ArrayList<Operation>();
		if(superOp != null){
			list_superOps.add(superOp);
			list_superOps.addAll( getSuperOperations(superOp) );
		}
		return list_superOps;
	}
	
}


