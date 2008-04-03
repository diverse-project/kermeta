

/*$Id: KBasicProcess.java,v 1.4 2008-04-03 12:54:50 ftanguy Exp $
* Project : org.kermeta.debugger
* File : 	KBasicProcess.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 14 mars 08
* Authors : paco
*/

package org.kermeta.runner.launching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

/**
 * Simulating a system process.
 * This fake process is then used to create an Eclipse process.
 * Doing that gives us a full potential use on debug console. 
 * 
 * @author paco
 *
 */
public class KBasicProcess extends Process {
	
	private Interpreter _interpreter;
	
	private PipedInputStream _inputStream;
	private PipedInputStream _errorStream;
	private PipedOutputStream _outputStream;
	
	private PipedOutputStream _interpreterOutputStream;
	private PipedOutputStream _interpreterErrorStream;
	private PipedInputStream _interpreterInputStream;
	
	private ILaunchConfigurationDelegate _delegate;
	
	public Interpreter getInterpreter() {
		return _interpreter;
	}
	
	public KBasicProcess(String file, boolean isConstraint, String mainClass, String mainOperation, String[] parameters) throws NotRegisteredURIException, URIMalformedException {
		initializeStreams();
		BufferedReader inputReader = new BufferedReader( new InputStreamReader( _interpreterInputStream ) );
		PrintStream os = new PrintStream(_interpreterOutputStream);
		PrintStream es = new PrintStream(_interpreterErrorStream);
		if ( isConstraint )
			_interpreter = new Interpreter(file, InterpreterMode.CONSTRAINT_RUN, null);
		else
			_interpreter = new Interpreter(file, InterpreterMode.RUN, null);
		_interpreter.setInputStream( inputReader );
		_interpreter.setOutputStream( os );
		_interpreter.setErrorStream( es );
		_interpreter.setEntryPoint(mainClass, mainOperation);
		_interpreter.setParameters(parameters);
	}
	
	public KBasicProcess(String file, boolean isConstraint, int requestPort, int eventPort, String mainClass, String mainOperation, String[] parameters, ILaunchConfigurationDelegate delegate) throws IOException, NotRegisteredURIException, URIMalformedException {
		initializeStreams();
		BufferedReader inputReader = new BufferedReader( new InputStreamReader( _interpreterInputStream ) );
		PrintStream os = new PrintStream(_interpreterOutputStream);
		PrintStream es = new PrintStream(_interpreterErrorStream);
		if ( isConstraint )
			_interpreter = new Interpreter(file, InterpreterMode.CONSTRAINT_DEBUG, null);
		else {
			Map<String, Object> options = new HashMap<String, Object>();
			options.put( InterpreterOptions.EVENT_PORT, eventPort );
			options.put( InterpreterOptions.REQUEST_PORT, requestPort );
			_interpreter = new Interpreter(file, InterpreterMode.DEBUG, options);
		}
		_interpreter.setInputStream( inputReader );
		_interpreter.setOutputStream( os );
		_interpreter.setErrorStream( es );
		_interpreter.setEntryPoint(mainClass, mainOperation);
		_interpreter.setParameters(parameters);
		// Forces the interpreter to creates the delegates and especially the server so that the debug client can connect.
		_interpreter.ready();
		
		_delegate = delegate;
	}
	
	private void initializeStreams() {
		/*
		 * 
		 * Some piped streams are needed so that when the interpreter writes something, some stream monitors can read the something and redirect it
		 * to an other output stream (like the console).
		 * 
		 */
		try {
			_interpreterOutputStream = new PipedOutputStream();
			_inputStream = new PipedInputStream();

			_interpreterErrorStream = new PipedOutputStream();
			_errorStream = new PipedInputStream();
			
			_interpreterInputStream = new PipedInputStream();
			_outputStream = new PipedOutputStream();
			
			_inputStream.connect(_interpreterOutputStream);
			_errorStream.connect(_interpreterErrorStream);
			_outputStream.connect(_interpreterInputStream);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void destroy() {
		// Give time for other processes to flush their content string.
		// Needed for the debug console.
		synchronized (this) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Closing all streams.
		try {
			_errorStream.close();
			_inputStream.close();
			_outputStream.close();
			_interpreterErrorStream.close();
			_interpreterInputStream.close();
			_interpreterOutputStream.close();
			_errorStream = null;
			_inputStream = null;
			_interpreterErrorStream = null;
			_interpreterInputStream = null;
			_interpreterOutputStream = null;
		} catch (IOException e) {
		} catch (NullPointerException e) {
			// Sometimes this method is called twice and provokes a null pointer exception.
		}
	}

	@Override
	public int exitValue() {
		if ( _errorStream == null )
			return 0;
		throw new IllegalThreadStateException();
	}

	@Override
	public int waitFor() throws InterruptedException {
		// Starting the interpreter.
		_interpreter.launch();
		return 0;
	}

	@Override
	public InputStream getErrorStream() {
		return _errorStream;
	}

	@Override
	public InputStream getInputStream() {
		return _inputStream;
	}

	@Override
	public OutputStream getOutputStream() {
		return _outputStream;
	}

	/*public void makeDelegateWaiting() {
		if ( _delegate != null ) {
			Runnable r = new Runnable() {
				
				public void run() {
					synchronized(_delegate) {
						try {
							_delegate.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Thread t = new Thread(r);
			t.start();
		}
	}*/
}


