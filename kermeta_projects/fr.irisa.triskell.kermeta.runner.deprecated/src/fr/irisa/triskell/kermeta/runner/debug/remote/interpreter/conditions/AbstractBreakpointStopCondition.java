/* $Id: AbstractBreakpointStopCondition.java,v 1.16 2008-04-01 12:23:32 bmorin Exp $
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
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.interpreter.AbstractKermetaDebugCondition;
import fr.irisa.triskell.kermeta.interpreter.CallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionContext;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.Traceback;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.runner.RunnerConstants;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.KermetaRemoteInterpreter;
import fr.irisa.triskell.kermeta.runner.debug.remote.interpreter.SerializableBreakpoint;
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
				
				// no stop condition!
				for (int i=0; i<breakpoints.length && eval_stop==false; i++)
				{	
					Integer l = getLineForCurrentNode();
					if (l.intValue() == -1) { eval_stop = false; break; }
					else
					{	
						String bfile = breakpoints[i].getFile();
						EObject statement = getStatementAtLineAndFile(l.intValue(), bfile);
						// The stop condition : the current node must equals the main 
						// statement at the tested line and in the file where the breakpoints
						// appear.
						if (l.compareTo(breakpoints[i].getLine())==0 
							&& getCurrentNode() == statement)
						{ 
							eval_stop = true;
						}
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
		Traceback t = new Traceback((ExpressionInterpreter)remoteInterpreter.getInterpreter(), (fr.irisa.triskell.kermeta.language.structure.Object)getCurrentNode());
		// first param of the called method is allowed to be null!
		InterpreterContext context = remoteInterpreter.getInterpreter().getInterpreterContext();
		
		// current_frame.peekExpressionContext().getStatement()
		String lstr = t.getContextForFObjectAsArray(null, (fr.irisa.triskell.kermeta.language.structure.Object)getCurrentNode())[1];
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
	 * */
	protected EObject getStatementAtLineAndFile(int l, String file)
	{
		EObject result = null;
		InterpreterContext context = remoteInterpreter.getInterpreter().getInterpreterContext();
		// Used to get the infos about the parsed node
		KermetaUnit unit = remoteInterpreter.getInterpreter().getMemory().getUnit();
		KermetaUnit found_unit = null;
		// Get the KermetaUnit corresponding to the current file
		// TODO check that there is no risk of concurrent modif using the iterator of importedUnits
		if (unit.getUri().replaceAll("/+", "/").equals(file))
		{
			found_unit = unit;
		}
		else
		{
			Iterator<KermetaUnit> it = KermetaUnitHelper.getAllImportedKermetaUnits(unit).iterator();
			while (it.hasNext()) {
				KermetaUnit u = (KermetaUnit)it.next();
				String unit_uri = u.getUri().replaceAll("/+", "/");
				if (u.getUri().equals(file))
					found_unit = u;
			}
		}
		
		if (!context.getFrameStack().isEmpty() && found_unit != null) {
			int ifs = 0;
			Object[] fs = context.getFrameStack().toArray(); // transformed into an array to avoid conflicting accesses
			// For each frame, from the top to the bottom
			for (ifs = fs.length-1; ifs>=0; ifs--)
			{
				CallFrame f = (CallFrame)fs[ifs]; 
				if (!f.getExpressionContext().isEmpty()) {
					int iecs = 0; 
					Object[] ecs = f.getExpressionContext().toArray();
					// For each expressionContext (do..end)
					for (iecs = ecs.length-1; iecs>=0; iecs--) {
						ExpressionContext c = (ExpressionContext)ecs[iecs];
						// If we found the unit linked to the given file URL
						if (found_unit!=null)
						{	
							TextReference txt_ref = null;
							int found_line = 0;
							if (found_unit.getTracer()!=null)
								txt_ref = found_unit.getTracer().getFirstTextReference(c.getStatement());
							// We use traceback since Tracer is only set for the main KermetaUnit
							// Setting it to all the units makes the load too slow.
							if (txt_ref == null && c.getStatement()!=null) // if this condition is false, things are much slower :(
							{
								KermetaASTNode node = (KermetaASTNode)found_unit.getNodeByModelElement((fr.irisa.triskell.kermeta.language.structure.Object)c.getStatement());
								if (node != null)
									found_line = Traceback.getLineNumber(node, file);
							}
							else if (txt_ref != null)
							{
								found_line = txt_ref.getLineBeginAt();
							}
							
							if (found_line == l) {
								result = c.getStatement();
							}
							//if (result != null ) System.out.println(new KM2KMTPrettyPrinter().accept(result));
						}
					}
				}
					
			}
		}
		return result;
	}
}
