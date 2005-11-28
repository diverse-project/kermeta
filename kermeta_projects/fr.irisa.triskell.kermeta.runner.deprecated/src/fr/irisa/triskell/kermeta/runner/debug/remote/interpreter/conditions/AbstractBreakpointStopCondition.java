/* $Id: AbstractBreakpointStopCondition.java,v 1.1 2005-11-28 18:54:36 zdrey Exp $
 * Project   : fr.irisa.triskell.kermeta.runner (First iteration)
 * File      : AbstractBreakpointStopCondition.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Nov 28, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.conditions;

import java.rmi.RemoteException;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.structure.FObject;

public abstract class AbstractBreakpointStopCondition extends AbstractKermetaDebugCondition {
	
	KermetaRemoteInterpreter remoteInterpreter;
	
	public boolean evaluate()
	{
		boolean eval_stop = false;
		try
		{	
//			Do we have any breakpoint?
			Integer[] lines = remoteInterpreter.getRemoteDebugUI().getBreakpointLines();
			Integer l = getLineForCurrentNode();
			// no stop condition!
			if (l.intValue() == -1) return false;
			for (int i=0; i<lines.length && eval_stop==false; i++)
				// if (l.equals(lines[i]))
				if (l.compareTo(lines[i])<0)	eval_stop = true;
		}
		catch (RemoteException e) { e.printStackTrace();}
		
		return eval_stop;
	}
	
	/**
	 * Get the line of given object in its text.
	 * TODO move it into somewhere else
	 * FIXME : this is a dirty laborious method to get a so simple line...
	 */
	protected Integer getLineForCurrentNode()
	{	
		Traceback t = new Traceback((ExpressionInterpreter)remoteInterpreter.getInterpreter(), (FObject)getCurrentNode());
		// first param of the called method is allowed to be null!
		String lstr = t.getContextForFObjectAsArray(null, (FObject)getCurrentNode())[1];
		if (lstr == "" || lstr == null) return new Integer(-1);
		else return new Integer(Integer.parseInt(lstr));
	}
}
