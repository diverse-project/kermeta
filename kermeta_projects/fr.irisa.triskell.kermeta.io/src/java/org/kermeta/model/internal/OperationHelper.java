

/*$Id: OperationHelper.java,v 1.4 2008-04-30 14:12:06 dvojtise Exp $
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

import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
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
	/** Returns a list of all Preconditions for this operation including inherited pre and
	 * pre from an aspect
	 * User may filter this unsig the qualified name in order to separate aspects and inherited pre
	 */
	public static List<Constraint> getAllPreconditions(Operation op) {
				
		// go up to the ClassDefinition
		ClassDefinition cls =op.getOwningClass();
		// in all of the operations of the class and its aspects and inherited class		
		List<Constraint> preconditions = new ArrayList<Constraint>();
		for ( TypeDefinition typeDefinition :KermetaModelHelper.ClassDefinition.getContext(cls) )
			if ( typeDefinition instanceof ClassDefinition ){
				for(Operation potentialOp : ((ClassDefinition) typeDefinition).getOwnedOperation()){
					if(potentialOp.getName().equals(op.getName())){
						// filter on operation name
						preconditions.addAll(potentialOp.getPre());
					}
				}
			}		
		return preconditions;
	}
	
	/** Returns a list of all Postconditions for this operation including inherited post and
	 * post from an aspect
	 * User may filter this unsig the qualified name in order to separate aspects and inherited pre
	 */
	public static List<Constraint> getAllPostconditions(Operation op) {
				
		// go up to the ClassDefinition
		ClassDefinition cls =op.getOwningClass();
		// in all of the operations of the class and its aspects and inherited class		
		List<Constraint> postconditions = new ArrayList<Constraint>();
		for ( TypeDefinition typeDefinition :KermetaModelHelper.ClassDefinition.getContext(cls) )
			if ( typeDefinition instanceof ClassDefinition ){
				for(Operation potentialOp : ((ClassDefinition) typeDefinition).getOwnedOperation()){
					if(potentialOp.getName().equals(op.getName())){
						// filter on operation name
						postconditions.addAll(potentialOp.getPost());
					}
				}
			}		
		return postconditions;
	}
	
}


