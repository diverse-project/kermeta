/* $Id: AbstractBreakpointStopCondition.java,v 1.6 2005-12-14 17:19:55 zdrey Exp $
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

import org.eclipse.emf.ecore.EObject;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionContext;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableBreakpoint;
import fr.irisa.triskell.kermeta.structure.FObject;
import fr.irisa.triskell.traceability.TextReference;

public abstract class AbstractBreakpointStopCondition extends AbstractKermetaDebugCondition {
	
	protected KermetaRemoteInterpreter remoteInterpreter;
	/**
	 * We need to know if the stop reason is a breakpoint, to send the appr. event
	 * The developer has the responsibility to set this variable when the breakpoint
	 * evaluate method is called.
	 */
	protected boolean wasBreakpoint;
	
	public AbstractBreakpointStopCondition(KermetaRemoteInterpreter p_interpreter) {
		remoteInterpreter = p_interpreter;
		wasBreakpoint = false;
	}

	public boolean evaluate()
	{
		boolean eval_stop = false;
		// FIXME : getInterpreter should never be null here, the only moment when it could occur
		// is a synchronization problem!
		if (remoteInterpreter == null || remoteInterpreter.getInterpreter() == null)
			eval_stop = false;
		else if (remoteInterpreter.getInterpreter().getCurrentState().equals(RunnerConstants.TERMINATE))
		{
			eval_stop = true;
		}
		else
		{
			try
			{
				// Do we have any breakpoint?
				SerializableBreakpoint[] breakpoints = remoteInterpreter.getRemoteDebugUI().getSerializableBreakpoints();
				Integer l = getLineForCurrentNode();
				Object[] statement_info= getStatementAtLine(l.intValue());
				// no stop condition!
				if (l.intValue() == -1) eval_stop = false;
				else
					for (int i=0; i<breakpoints.length && eval_stop==false; i++)
					{
						// The stop condition : the current node must equals the main 
						// statement at the tested line and in the file where the breakpoints
						// appear.
						if (l.compareTo(breakpoints[i].getLine())==0 
							&& getCurrentNode() == (EObject)statement_info[0]
							&& breakpoints[i].getFile().equals(statement_info[1]))
						{ 
							eval_stop = true;
						}
					}
			}
			catch (RemoteException e) { e.printStackTrace();}
		}
		return eval_stop;
	}
	
	/**
	 * Get the line of given object in its text.
	 * TODO move it into somewhere else
	 * FIXME : this is a dirty laborious method to get a so simple line... : use Tracer!
	 */
	protected Integer getLineForCurrentNode()
	{	
		Traceback t = new Traceback((ExpressionInterpreter)remoteInterpreter.getInterpreter(), (FObject)getCurrentNode());
		// first param of the called method is allowed to be null!
		InterpreterContext context = remoteInterpreter.getInterpreter().getInterpreterContext();
		
		// current_frame.peekExpressionContext().getStatement()
		String lstr = t.getContextForFObjectAsArray(null, (FObject)getCurrentNode())[1];
		if (lstr == "" || lstr == null) return new Integer(-1);
		else return new Integer(Integer.parseInt(lstr));
	}
	
	/**
	 * Try to find the main statement at the given line 
	 * For each call frame of the frame stack, and for each expression context
	 * of each of those call frames, we get the line of the stored statement (which
	 * is the one that is being processed) and compare it to the line of the last registered
	 * node. The last statement found that has the same line as the last registered node is
	 * the main statement at the given line.
	 * @return an array of 2 elements, which first one is the Statement, and second one is the 
	 * file where it was found. We indeed need it since we have to stop at a breakpoint which is
	 * located at a given line in a given file.
	 * 
	 * // TODO : we have to test the file
	 * */
	protected Object[] getStatementAtLine(int l)
	{
		EObject result = null;
		String file = "";
		InterpreterContext context = remoteInterpreter.getInterpreter().getInterpreterContext();
		// Used to get the infos about the parsed node
		KermetaUnit unit = remoteInterpreter.getInterpreter().getMemory().getUnit();
		
		if (!context.getFrameStack().isEmpty()) {
			int ifs = 0;
			Object[] fs = context.getFrameStack().toArray(); // transformed into an array to avoid conflicting accesses
			for (ifs = fs.length-1; ifs>=0; ifs--)
			{
				CallFrame f = (CallFrame)fs[ifs]; 
				if (!f.getExpressionContext().isEmpty()) {
					int iecs = 0; 
					Object[] ecs = f.getExpressionContext().toArray();
					for (iecs = ecs.length-1; iecs>=0; iecs--) {
						ExpressionContext c = (ExpressionContext)ecs[iecs];
						if (unit.getTracer()!=null) // we can remove this test when we are sure that Tracer is definitly adopted
						{
							TextReference txt_ref = unit.getTracer().getFirstTextReference(c.getStatement());
							//if (txt_ref.getFileURI().equals())
							if (txt_ref != null && txt_ref.getLine() == l) {	
								result = c.getStatement();
								file   = txt_ref.getFileURI();
							}
						}
					}
				}
					
			}
		}
		return new Object[] { result, file };
	}
}
