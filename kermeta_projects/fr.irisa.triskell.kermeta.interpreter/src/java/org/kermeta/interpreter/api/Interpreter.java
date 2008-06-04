package org.kermeta.interpreter.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.model.RuntimeProcess;
import org.kermeta.interpreter.InterpreterPlugin;
import org.kermeta.interpreter.helper.RunnerHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.checker.KermetaUnitChecker;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.loader.LoadingOptions;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.error.KermetaInterpreterError;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.AbstractKInterpreter;
import fr.irisa.triskell.kermeta.launcher.KConstraintInterpreter;
import fr.irisa.triskell.kermeta.launcher.KDebugger;
import fr.irisa.triskell.kermeta.launcher.KInterpreter;
import fr.irisa.triskell.kermeta.launcher.KTestConstraintInterpreter;
import fr.irisa.triskell.kermeta.launcher.KTestInterpreter;
import fr.irisa.triskell.kermeta.launcher.KTraceInterpreter;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Interpreter {

	private String _fileName;
	
	/**		The concrete class implementing full functionalities of the interpreter.		*/
	private AbstractKInterpreter _realInterpreter;

	/**		The program to be run.		*/
	private KermetaUnit _kermetaUnit;
	
	/**		The execution mode. See InterpreterOptions interface for more details.		*/
	private InterpreterMode _mode;
	
	/**		The name of the main class of the program.		*/ 
	private String _className;
	
	/**		The name of the main operation of the main class.		*/
	private String _operationName;
	
	/**		The parameters to send to the main operation.		*/
	private String[] _parameters;
	
	/**		The default path for the program execution.		*/
	private String _defaultPath;
	
	/**		The stream to read inputs from the user.		*/
	private BufferedReader _inputReader;
	
	/**		The stream to use to print messages.		*/
	private PrintStream _outputStream;
	
	/**		The stream to use to print error messages.		*/
	private PrintStream _errorStream;
	
	/**		The port used to listen debug requests.		*/
	private int _requestPort;
	
	/**		The port used to send events.		*/
	private int _eventPort;
	
	/**		A boolean stating wether the interpreter must merge the kermeta unit before running the execution.		
	 *		Its value is true by default because that that mechanism will be hidden from the user. 
	 */
	private boolean _merge = true;
	
	/**		The name of the merged kermeta unit used for the interpretation.		*/
	private String _mergedUnitUri = "platform:/resource/interpreter_unit.km";
	
	/**		A boolean stating if after the execution, references to the memory and kermeta unit must be unset.		*/
	private boolean _cleanAtEnd = true;
	
	/**		*/
	private boolean _typeChecked = true;
	
	/**		The Eclipse runtime process affected for the interpreter to be fully integrated in the User Interface.		
	 * 		This is NOT USED in a standalone execution.
	 */
	private RuntimeProcess _process;
	
	/**		The class loader to use for using external java classes.		*/
	private ClassLoader _classLoader;
	
	private Interpreter(InterpreterMode mode, Map<String, Object> options) {
		_mode = mode;
		processOptions(options);
	}

	/**
	 * Creates an interpreter for a program that will run in a particular mode.
	 * @param file The program's file.
	 * @param mode The mode of execution.
	 * @param options Some options used to configure the interpreter. Those options depends on the mode you choose.
	 * @throws NotRegisteredURIException
	 * @throws URIMalformedException
	 */
	public Interpreter(IFile file, InterpreterMode mode, Map<String, Object> options) throws NotRegisteredURIException, URIMalformedException {
		this(mode, options);
		_fileName = "platform:/resource" + file.getFullPath().toString();
		calculateKermetaUnit( "platform:/resource" + file.getFullPath().toString() );
	}
	
	/**
	 * Creates an interpreter for a program that will run in a particular mode.
	 * @param uri The uri of the program.
	 * @param mode The mode of execution.
	 * @param options Some options used to configure the interpreter. Those options depends on the mode you choose.
	 * @throws NotRegisteredURIException
	 * @throws URIMalformedException
	 */
	public Interpreter(String uri, InterpreterMode mode, Map<String, Object> options) throws NotRegisteredURIException, URIMalformedException {
		this(mode, options);
		_fileName = uri;
		calculateKermetaUnit(uri);
	}
	
	/**
	 * Process a map of options to set up the configuration fields of this interpreter.
	 * @param options A map of options which keys come from InterpreterOptions interface.
	 */
	private void processOptions(Map<String, Object> options) {
		if ( options != null ) {
			for ( String s : options.keySet() ) {
				
				if ( s.equals( InterpreterOptions.EVENT_PORT) )
					_eventPort = (Integer) options.get(s);
				
				else if ( s.equals( InterpreterOptions.REQUEST_PORT) )
					_requestPort = (Integer) options.get(s);
			
				else if ( s.equals( InterpreterOptions.MERGE) )
					_merge = (Boolean) options.get(s);
				
				else if ( s.equals( InterpreterOptions.MERGED_UNIT_URI) )
					_mergedUnitUri = (String) options.get(s);

				else if ( s.equals( InterpreterOptions.CLEAN_AT_END) )
					_cleanAtEnd = (Boolean) options.get(s);
				
				else if ( s.equals( InterpreterOptions.TYPE_CHECKED) )
					_typeChecked = (Boolean) options.get(s);

			}
		}
	}
	
	/**
	 * Getting the real kermeta unit to execute. The merger is called if needed.
	 * @param uri The uri of the file to be executed.
	 */
	private void calculateKermetaUnit(String uri) {
		try {
			if ( _merge ) {
				_kermetaUnit = RunnerHelper.getKermetaUnitToExecute(uri, _mergedUnitUri);
			} else if ( ! _typeChecked ) {
				_kermetaUnit = KermetaUnitChecker.check(uri);
			} else {
				Map<String, Object> options = new HashMap<String, Object>();
				options.put( LoadingOptions.ECORE_QuickFixEnabled, true );
				options.put( LoadingOptions.INCLUDE_FRAMEWORK, false );
				_kermetaUnit = LoaderPlugin.getDefault().load(uri, options);
				_kermetaUnit.setTypeChecked(true);
			}
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Sets the entry point of the program.
	 * @param className The main class of the program.
	 * @param operationName The operation of the main class to be executed.
	 */
	public void setEntryPoint(String className, String operationName) {
		_className = className;
		_operationName = operationName;
	}
	
	/**
	 * Sets the prameters to send to the main operation.
	 * @param parameters The parameters in String representation.
	 */
	public void setParameters(String[] parameters) {
		_parameters = parameters;
	}
	
	/**
	 * Sets the default value of the program execution.
	 * It is used for model loading and saving.
	 * @param defaultPath The string value of the default path.
	 */
	public void setDefaultPath(String defaultPath) {
		_defaultPath = defaultPath;
	}
	
	/**
	 * Sets the input stream of the interpreter for interaction with the end user.
	 * @param reader The stream to read.
	 */
	public void setInputStream(BufferedReader reader) {
		_inputReader = reader;
	}
	
	/**
	 * Sets the input stream of the interpreter for interaction with the end user.
	 * @param reader The stream to read.
	 */
	public void setInputStream(InputStream stream) {
		setInputStream( new BufferedReader(new InputStreamReader(stream)) );
	}
	
	/**
	 * Sets the output stream of the interpreter for interaction with the end user.
	 * @param stream The stream to write on messages.
	 */
	public void setOutputStream(PrintStream stream) {
		_outputStream = stream;
	}
	
	/**
	 * Sets the error stream of the interpreter for interaction with the end user.
	 * @param stream The stream to write on error messages.
	 */
	public void setErrorStream(PrintStream stream) {
		_errorStream = stream;
	}
	
	/**
	 * Sets the input, output and error streams from an EclipseConsole.
	 * @param console The console to attach to this interpreter.
	 */
	public void setStreams(IOConsole console) {
		_inputReader = console.getReader();
		_outputStream = new PrintStream( console.getOutputStream() );
		_errorStream = new PrintStream( console.getOutputStream() );
	}
	
	public void setProcess(RuntimeProcess process) {
		_process = process;
		if ( _realInterpreter != null )
			_realInterpreter.setFakeProcess(_process);
	}
	
	/**
	 * Sets the class loader to load external java classes needed during the execution.
	 * @param cl
	 */
	public void addToClasspath(URL[] classpathEntries) {
		setDefaultClassLoader();
		if ( classpathEntries != null ) {
			URLClassLoader newCL = URLClassLoader.newInstance( classpathEntries, _classLoader);
			_classLoader = newCL;
		}
	}
	
	/**
	 * Set a default class loader for the interpreter. Add a class path entry for the interpreter project.
	 * If the file to execute is coming from a plugin, add entries coming from its manifest.
	 */
	private void setDefaultClassLoader() {
		ClassLoader cl = _classLoader = Thread.currentThread().getContextClassLoader();
		List<URL> urls = new ArrayList<URL>();
		// for development mode
		URL url = InterpreterPlugin.getDefault().getBundle().getEntry("build/class");
		if(url ==  null) // for deployed mode
			url = InterpreterPlugin.getDefault().getBundle().getEntry("/");
		urls.add(url);
		
		// Check if the file to execute is coming from a plugin. If yes get the classpath from the bundle and add it to interpreter classpath.
		if ( _fileName.matches("platform:/plugin/.+") ) {
			String bundleName = _fileName.replace("platform:/plugin/", "");
			bundleName = bundleName.replaceFirst("/.+", "");
			// Plugin Dependencies
			Object o = Platform.getBundle(bundleName).getHeaders().get("Require-Bundle");
			if ( o != null ) {
				String value = (String) o;
				String[] strings = value.split(",");
				for ( String s : strings ) {
					Bundle b = Platform.getBundle(s);
					if ( b!= null )
						urls.add( b.getEntry("/") );
				}
			}
			// Jar dependencies
			o = Platform.getBundle(bundleName).getHeaders().get("Bundle-ClassPath");
			if ( o != null ) {
				String value = (String) o;
				String[] strings = value.split(",");
				for ( String s : strings ) {
					url = Platform.getBundle(bundleName).getEntry(s);
					if ( url != null )
						urls.add( url );
				}
			}
		}
		// Getting an array of URL
		URL[] urlsArray = new URL[urls.size()];
		urls.toArray(urlsArray);
		// Creating a new class loader
		URLClassLoader newCL = URLClassLoader.newInstance( urlsArray, cl);
		_classLoader = newCL;		
	}
	
	private boolean checkValidity() {
		if ( _className == null )
			_className = ModelingUnitHelper.getMainClassAsString( _kermetaUnit );
		if ( _operationName == null )
			_operationName = ModelingUnitHelper.getMainOperationAsString( _kermetaUnit );
		return true;
	}
	
	private void initialize() {
		switch ( _mode ) {
		case RUN :
			_realInterpreter = new KInterpreter(_kermetaUnit, _inputReader, _outputStream, _errorStream);
			break;
				
		case DEBUG :
			_realInterpreter = new KDebugger(_kermetaUnit, _inputReader, _outputStream, _errorStream, _requestPort, _eventPort);
			break;
	
		case CONSTRAINT_RUN :
			_realInterpreter = new KConstraintInterpreter(_kermetaUnit, _inputReader, _outputStream, _errorStream);
			break;
				
		case CONSTRAINT_DEBUG :
			break;
				
		case TEST_RUN :
			_realInterpreter = new KTestInterpreter(_kermetaUnit, _inputReader, _outputStream, _errorStream);
			break;
				
		case TEST_CONSTRAINT_RUN :
			_realInterpreter = new KTestConstraintInterpreter(_kermetaUnit, _inputReader, _outputStream, _errorStream);
			break;
			
		case TRACE :
			_realInterpreter = new KTraceInterpreter(_kermetaUnit, _inputReader, _outputStream, _errorStream);
				
		default:
			break;
		}
		_realInterpreter.initialize();
		if ( _process != null )
			_realInterpreter.setFakeProcess( _process );
		if ( _classLoader == null )
			setDefaultClassLoader();
	}
	
	/**
	 * This method validates the interpreter configuration and creates the necessary delegates.
	 * At the moment, this method is usefull for the debugger that will creates the server and waiting for clients.
	 * If you use the run or constraint run mode, you do not need to call this method, it will be done in the launch method.
	 */
	public void ready() {
		boolean v = checkValidity();
		if ( v )
			initialize();
	}
	
	public RuntimeObject launch() throws InitializationError {
		RuntimeObject result = null;
		InterpreterPlugin.internalLog.debug("Free Memory Available before Interpretation : " + Runtime.getRuntime().freeMemory());
		try {
			if ( _kermetaUnit.isErroneous() )
				throw new InitializationError(_kermetaUnit);			
			if ( _realInterpreter == null )
				ready();
			if ( _realInterpreter != null ) {
				_realInterpreter.setEntryPoint(_className, _operationName);
				_realInterpreter.setParameters(_parameters);
				_realInterpreter.setDefaultPath(_defaultPath);
				_realInterpreter.setContextClassLoader(_classLoader);
				result = _realInterpreter.launch();
			}
		} catch (KermetaInterpreterError e) {
			e.printStackTrace( _errorStream);
		} finally {
			releaseResources();
		}
		InterpreterPlugin.internalLog.debug("Free Memory Available after Interpretation : " + Runtime.getRuntime().freeMemory());
		return result;
	}
	
	/**
	 * 
	 * @return true if the interpreter has terminated and false otherwise.
	 */
	public boolean isTerminated() {
		if ( _realInterpreter == null )
			return false;
		return _realInterpreter.isTerminated();
	}
	
	/**
	 * 
	 * @return true if the interpreter has started the interpretation and false otherwise.
	 */
	public boolean hasStarted() {
		if ( _realInterpreter == null )
			return false;
		return _realInterpreter.hasStarted();
	}
	
	/**
	 * 
	 * @return true if the interpreter is attached with an Eclipse process and false otherwise.
	 */
	public boolean hasProcessAttached() {
		return _process != null;
	}
	
	/**
	 * Unreferences every object of that class.
	 */
	private void releaseResources() {
		if ( _cleanAtEnd ) {
			_kermetaUnit = null;
		}
		_realInterpreter = null;
		_process = null;
		Runtime.getRuntime().gc();
	}
	
}
