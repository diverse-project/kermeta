package fr.irisa.triskell.kermeta.launcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.RuntimeProcess;
import org.kermeta.interpreter.InterpreterPlugin;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.interpreter.DebugInterpreter;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.InterpreterContext;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

abstract public class AbstractKInterpreter {

	/**		The fake process used to launch the interpreter.		*/
	protected RuntimeProcess _fakeProcess;
	
	public void setFakeProcess(RuntimeProcess process) {
		_fakeProcess = process;
		if ( isDebugger() ) {
			DebugInterpreter debugger = (DebugInterpreter) _basicInterpreter;
			debugger.setFakeProcess(_fakeProcess);
		} 
	}
	
	/**		The program to be run.				*/
	private KermetaUnit _kermetaUnit;
	
	/**		The memory of the interpreter.		*/
	protected RuntimeMemory _memory;
	
	/**		The context of the interpreter.		*/
	protected InterpreterContext _context;
	
	/**		The entry point of the program related to the main operation.		*/
	protected ClassDefinition _mainClassDefinition;
	
	/**		The entry point of the program related to the main class definition.		*/
	protected Operation _mainOperation;
	
	/**		The parameters to send to the main operation.		*/
	protected List<RuntimeObject> _parameters;
	
	/**		The default path for the program execution.		*/
	protected String _defaultPath;
	
	/**		Stream to read to interact with the user.		*/
	private BufferedReader _inputReader;
	
	/**		Stream to use when errors come up.				*/
	private PrintStream _errorWriter;
	
	/**		Stream used to print information.				*/
	private PrintStream _outputWriter;
	
	/**		Boolean stating the activity of the interpreter.		*/
	protected boolean _terminated = false;
	
	/**		Boolean indicating if the interpreter started.		*/
	protected boolean _started = false;
	
	/**
	 * 
	 * @return true or false wether the interpretation is terminated.
	 */
	public boolean isTerminated() {
		return _terminated;
	}
	
	public boolean hasStarted() {
		return _started;
	}
	
	/**		The basic interpreter used to visit kermeta objects.		*/
	protected ExpressionInterpreter _basicInterpreter;
	
	public AbstractKInterpreter(KermetaUnit program, BufferedReader inputReader, PrintStream outputWriter, PrintStream errorWriter) {
		assert( program != null );
		_kermetaUnit = program;
		_memory = new RuntimeMemory(_kermetaUnit, this);
		_context = new InterpreterContext(_memory);
		_inputReader = inputReader;
		_errorWriter = errorWriter;
		_outputWriter = outputWriter;
	}
	
	/**
	 * Initialization method for extending classes that particularly needs to create the basic interpreter.
	 */
	public void initialize() {
		_basicInterpreter = createBasicInterpreter();
	}
	
	/**
	 * Throw a KermetaInterpreterError with a specific message.
	 * @param message A specific message for understanding the error.
	 */
	protected void throwError(String message) {
		InterpreterPlugin.internalLog.error(message);
		throw new KermetaInterpreterError(message);
	}
	
	/**
	 * Look for a class and an operation to use as the entry point of the program.
	 * If the operation or the class cannot be found , throws a KermetaInterpreterError.
	 * @param className The name of the entry class.
	 * @param operationName The name of the operation to be executed.
	 */
	public void setEntryPoint(String className, String operationName) {
		_mainClassDefinition = (ClassDefinition) _kermetaUnit.getTypeDefinitionByQualifiedName(className);
	    if ( _mainClassDefinition == null ) {
	    	 String message = "Entry @mainClass '" + className + "' not found.";
	    	 throwError(message);
	    }
		_mainOperation = KermetaModelHelper.ClassDefinition.getOperationByName(_mainClassDefinition, operationName);
		if ( _mainOperation == null ) {
	        String message = "Cannot find entry @mainOperation '" + operationName + "' in @mainClass '" + className+"'";
	        throwError(message);
		}
	}
	
	/**
	 * Sets the parameters to send to the main operation. It converts each string into a corresponding
	 * RuntimeObject.
	 * @param parameters
	 */
	public void setParameters(String[] parameters) {
		if ( parameters != null ) {
			_parameters =  new ArrayList<RuntimeObject>();
			for (String s : parameters)
				_parameters.add(
					fr.irisa.triskell.kermeta.runtime.basetypes.String.create(s,_memory.getROFactory()));
		}
	}
	
	/**
	 * Sets the default path for the program execution.
	 * @param defaultPath The String value of the default path.
	 */
	public void setDefaultPath(String defaultPath) {
		_defaultPath = defaultPath;
	}
	
	/**
	 * 
	 * @return The default path for the program execution.
	 */
	public String getDefaultPath() {
		return _defaultPath;
	}
	
	abstract protected ExpressionInterpreter createBasicInterpreter();
	
	/**
	 * 
	 * @return The result of the operation or null if an exception has been raised.
	 */
	public RuntimeObject launch() {
		try {
			// setting the context
			_basicInterpreter.setInterpreterContext( _context );
			// Creating the main runtime object
			RuntimeObject entryClass = _memory.getROFactory().createObjectFromClassName( KermetaModelHelper.NamedElement.qualifiedName(_mainClassDefinition) );
			// Starting the basic interpreter
			_started = true;
			return (RuntimeObject) _basicInterpreter.invoke(entryClass, _mainOperation, _parameters);
		} catch (KermetaRaisedException e) {
            error( e.getMessage() );
            error( "\n" + e.toString() );
		} catch (Throwable e) {
			e.printStackTrace();
			error( e.getMessage() );
		} finally {
			if ( _fakeProcess != null )
				try {
					_fakeProcess.terminate();
				} catch (DebugException e) {
					e.printStackTrace();
				}
			_started = false;
			_terminated = true;
			releaseResources();
		}
		return null;
	}
	
	/**
	 * Prints the string representation of that object on the output stream.
	 * @param value Any object that implements a comprehensive toString method
	 */
	public void print(Object value) {
		_outputWriter.print( value );
		_outputWriter.flush();
	}
	
	/**
	 * Prints the string representation of that object on the output stream with a \n at the end.
	 * @param value Any object that implements a comprehensive toString method
	 */
	public void println(Object value) {
		_outputWriter.println( value );
		_outputWriter.flush();
	}
	
	/**
	 * Prompts the user to enter a string value.
	 * @param value The string that is printed before reading input from the user
	 * @return The string value entered by the user without the last \n character.
	 */
	public String promptAndRead(String value) {
		print(value);
		try {
			return _inputReader.readLine();
		} catch (IOException e) {
			return "";
		}
	}
	
	/**
	 * Prints the string representation of that object on the error stream.
	 * @param value Any object that implements a comprehensive toString method
	 */
	public void error(Object value) {
		_errorWriter.print( value );
		_errorWriter.flush();
	}
	
	/**
	 * Prints the string representation of that object on the error stream with a \n at the end.
	 * @param value Any object that implements a comprehensive toString method
	 */
	public void errorln(Object value) {
		_errorWriter.println( value );
		_errorWriter.flush();
	}
	
	public ExpressionInterpreter getBasicInterpreter() {
		return _basicInterpreter;
	}
	
	public boolean isDebugger() {
		return false;
	}
	
	/**
	 * Breaks references to free memory out.
	 */
	private void releaseResources() {
		_basicInterpreter.releaseResources();
		_basicInterpreter = null;
		_kermetaUnit = null;
		_mainClassDefinition = null;
		_mainOperation = null;
		_memory = null;
		_context = null;
		_fakeProcess = null;
	}
}
