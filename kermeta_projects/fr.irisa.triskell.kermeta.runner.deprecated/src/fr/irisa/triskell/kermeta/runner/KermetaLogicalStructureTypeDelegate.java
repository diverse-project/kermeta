/* $Id: KermetaLogicalStructureTypeDelegate.java,v 1.1 2005-12-01 18:29:07 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : KermetaLogicalStructureTypeDelegate.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 29, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.ILogicalStructureTypeDelegate;
import org.eclipse.debug.core.model.IValue;

public class KermetaLogicalStructureTypeDelegate implements
		ILogicalStructureTypeDelegate {

	public boolean providesLogicalStructure(IValue value) {
		System.err.println("providesLogicalStructure");
		// TODO Auto-generated method stub
		return false;
	}

	public IValue getLogicalStructure(IValue value) throws CoreException {
		System.err.println("getLogicalStructure");
		return null;
	}

}
