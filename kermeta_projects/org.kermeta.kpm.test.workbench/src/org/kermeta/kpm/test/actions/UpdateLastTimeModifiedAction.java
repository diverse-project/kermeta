

/*$Id: UpdateLastTimeModifiedAction.java,v 1.1 2008-06-02 09:13:03 ftanguy Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	UpdateLastTimeModifiedAction.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 2 juin 08
* Authors : paco
*/

package org.kermeta.kpm.test.actions;

import java.util.Date;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.kpm.IAction;

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class UpdateLastTimeModifiedAction implements IAction {

	public void execute(Out out, Unit unit, Map<String, Object> args, IProgressMonitor monitor) {
		unit.setLastTimeModified( new Date() );
	}
	
}


