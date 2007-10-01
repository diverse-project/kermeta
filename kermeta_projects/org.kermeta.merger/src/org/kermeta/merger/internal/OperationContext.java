

/*$Id: OperationContext.java,v 1.1 2007-10-01 15:07:49 ftanguy Exp $
* Project : org.kermeta.merger
* File : 	OperationContext.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 1 oct. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import java.util.HashSet;
import java.util.Set;

import fr.irisa.triskell.kermeta.language.structure.Operation;

public class OperationContext {
	
	private Operation baseOperation = null;
	
	private Set<Operation> operations = new HashSet<Operation> ();
	
	public OperationContext(Operation baseOperation) {
		this.baseOperation = baseOperation;
	}
	
	public void addOperation(Operation op) {
		operations.add(op);
	}
	
	public Operation getBaseOperation() {
		return baseOperation;
	}
	
	public Set<Operation> getOperations() {
		return operations;
	}
	
}


