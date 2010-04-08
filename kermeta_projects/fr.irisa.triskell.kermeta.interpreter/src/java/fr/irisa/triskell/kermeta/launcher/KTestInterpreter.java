package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedReader;
import java.io.PrintStream;

import org.eclipse.debug.core.DebugException;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class KTestInterpreter extends KInterpreter {

	public KTestInterpreter(KermetaUnit program, BufferedReader inputReader, PrintStream errorWriter, PrintStream outputWriter) {
		super(program, inputReader, errorWriter, outputWriter);
	}

	/**
	 * Create the entry object and launch the interpreter
	 * plus, run eventual setUp and tearDown method if we this launch is a test
	 */
	public RuntimeObject launch() {
		RuntimeObject result = null;
		try {
			_basicInterpreter.setInterpreterContext( _context );
			RuntimeObject entryClass = _memory.getROFactory().createObjectFromClassName( KermetaModelHelper.NamedElement.qualifiedName(_mainClassDefinition) );

			callOperation( _basicInterpreter, entryClass, "initLog");
		    callOperation(_basicInterpreter, entryClass, "setUp");

			result = (RuntimeObject) _basicInterpreter.invoke(entryClass, _mainOperation, null);
			
			callOperation(_basicInterpreter, entryClass, "tearDown");
		    // retreives the failures
		   	callOperation(_basicInterpreter, entryClass, "raiseIfHasFailures");
		} finally {
			if ( _fakeProcess != null )
				try {
					_fakeProcess.terminate();
				} catch (DebugException e) {
					e.printStackTrace();
				}
			_terminated = true;
		}
		return result;
	}
	
	/** call the given operation 
	 * do nothing if the operation doesn't exist*/
	private void callOperation(ExpressionInterpreter exp_interpreter, RuntimeObject entryObject, String operationName) {
		Operation operation = KermetaModelHelper.ClassDefinition.getOperationByName(_memory.getUnit(), _mainClassDefinition, operationName);
		if ( operation != null )
			exp_interpreter.invoke(entryObject, operation, null);
	}
	
}
