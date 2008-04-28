/* $Id: DebugInterpreter.java,v 1.23 2008-04-28 11:50:55 ftanguy Exp $
 * Project   : Kermeta (First iteration)
 * File      : DebugInterpreter.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Sep 8, 2005
 * Authors       : (zdrey)
 */
package fr.irisa.triskell.kermeta.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.EmptyStackException;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.RuntimeProcess;
import org.kermeta.interpreter.InterpreterPlugin;
import org.kermeta.interpreter.internal.debug.AssignmentDebugInterpreter;
import org.kermeta.interpreter.internal.debug.CallFeatureDebugInterpreter;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.language.behavior.Assignment;
import fr.irisa.triskell.kermeta.language.behavior.CallExpression;
import fr.irisa.triskell.kermeta.language.behavior.CallFeature;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.Tracer;

/**
 * This is the ExpressionInterpreter improved to handle the debugging mode
 * Principles of the debug interpreter :
 * 
 *  - a pre and a post statements condition the interruption of the debugging mode,
 *  according to the type of command (step, resume, ...) that the user requested. 
 */
public class DebugInterpreter extends ExpressionInterpreter {

	/**		
	 * When stepping some nested expression, you want the pointer to go on the next line instead of staying on the same line for each nested expression.
	 * ex: Let's take this piece of code
	 * 		var s : String init a.initialize.toString
	 * 		stdio.writeln(s)
	 * Assume that there is a breakpoint on the variable declaration. When stepping you want to go on the writeln code.
	 */
	private FakeBreakpoint _lastHitBreakpoint;
	
	/**		
	 * A stack of breakpoints calculated each time the debug client requests a resume, step or step into action.
	 * A stack is used because when stepping into an expression you may need previous pointer to step in nested expressions or to calculate the next breakpoint.
	 */
	private Stack<FakeBreakpoint> _breakpoints = new Stack<FakeBreakpoint>();
	
	/**
	 * Look for a line breakpoint that is situated in the same file and line number as the textual trace of the target expression.
	 * If the target expression has no textual trace, the research is impossible and this methods returns null.
	 * @param expression The target expression.
	 * @return A FakeBreakpoint if a line breakpoint matches the textual reference associated to the target expression and null otherwise.
	 * @throws CoreException
	 */
	private FakeBreakpoint hasReachedBreakpoint(Expression expression) throws CoreException {
		// Getting the tracer
    	Tracer tracer = getKermetaUnit().getTracer();
    	if ( tracer != null ) {
    		// Getting a text reference on the target if any
    		TextReference reference = tracer.getFirstTextReference( expression );
    		if ( reference != null ) {
    			// Check wether a breakpoint is set on the line of the text reference
    			IBreakpointManager manager = DebugPlugin.getDefault().getBreakpointManager();
    			IBreakpoint[] breakpoints = manager.getBreakpoints( "org.kermeta.debug" );
    			for ( IBreakpoint p : breakpoints ) {
    				if ( p instanceof ILineBreakpoint ) {
    					IResource resource = p.getMarker().getResource();
    					int lineNumber = ((ILineBreakpoint) p).getLineNumber();
    					IFile file = ResourceHelper.getIFile( reference.getFileURI() );
    					if ( file != null && file.equals(resource) && lineNumber == reference.getLineBeginAt() )
    						return lineBreakpointHit(lineNumber, reference.getFileURI());
    				}
    			}
    		}
    	}
    	return null;
	}
	
	/**
	 * When a line breakpoint is hit, update some fields.
	 * @param lineNumber The line where the line breakpoint is situated.
	 * @param file The file where the line breakpoint is situated.
	 * @return The FakeBreapoint created from the given line number and file.
	 */
	private FakeBreakpoint lineBreakpointHit(int lineNumber, String file) {
		FakeBreakpoint b = new FakeBreakpoint(lineNumber, file);
		if ( ! b.equals(_lastHitBreakpoint) ) {
			_lastHitBreakpoint = b;
			clearBreakpoints();
			_breakpoints.add(b);
		} else
			b = null;
		return b;
	}
	
	/**
	 * Calculate if possible the next breakpoint to hit when stepping into an expression.
	 * @param expression The target expression.
	 * @return True if a breakpoint has been created and false otherwise.
	 */
	public boolean stepInto(Expression expression) {
		FakeBreakpoint b = BreakpointHelper.getNextStepIntoBreakpoint(expression, this);
		if ( b == null )
			b = BreakpointHelper.getNextStepBreakpoint(expression, this);
		if ( b != null )
			_breakpoints.push( b );			
		return b != null;
	}
	
	/**
	 * Calculate if possible the next breakpoint to hit when stepping an expression.
	 * @param expression The target expression.
	 * @return True if a breakpoint has been created and false otherwise.
	 */
	public boolean step(Expression expression) {
		FakeBreakpoint b = BreakpointHelper.getNextStepBreakpoint(expression, this);
		if ( b == null ) {
			ListIterator<CallFrame> itCF = getInterpreterContext().frame_stack.listIterator();
			while ( itCF.hasNext() )
				itCF.next();
			while ( itCF.hasPrevious() && b == null ) {
				CallFrame frame = itCF.previous();
				popBreakpoint();
				if ( frame.getExpression() != null ) {
					// The current expression is nested. That means that there is some expression on the right side to evaluate.
					// Then we need to stop on the same line.
					if ( frame.getExpression().eContainer() instanceof CallExpression )
						b = BreakpointHelper.getBreakpoint( (Expression) frame.getExpression(), this );
					else
						b = BreakpointHelper.getNextStepBreakpoint( (Expression) frame.getExpression(), this);
				}
				if ( b == null ) {
					// We need to look in the stack reversely until finding an expression.
					// Go to the end
					ListIterator<ExpressionContext> it = frame.block_stack.listIterator();
					for ( int i=0; i<frame.block_stack.size(); i++ )
						it.next();
					// Looking for an expression.
					while ( it.hasPrevious() && b == null ) {
						ExpressionContext ec = it.previous();
						if ( ec.statement != null )
							// We find one, let's take the next statement.
							b = BreakpointHelper.getNextStepBreakpoint( (Expression) ec.statement, this);
					}		
				}
			}
		}
		if ( b != null )
			_breakpoints.push( b );
		return b != null;
	}
	
	/**
	 * Poping safely a breakpoint.
	 * @return A breakpoint if the stack is not empty and null otherwise.
	 */
	private FakeBreakpoint popBreakpoint() {
		if ( _breakpoints.isEmpty() )
			return null;
		else
			return _breakpoints.pop();
	}
	
	private void clearBreakpoints() {
		_breakpoints.clear();
	}
		
	/**
	 * The target expression may have hit a breakpoint. To determine that, the textual reference of the target expression is retrieved and
	 * compared to the list of breakpoints.
	 * @param expression The target expression.
	 * @return A breakpoint hit by the expression and null otherwise.
	 * @throws CoreException 
	 */
	private FakeBreakpoint shouldStop(Expression expression) throws CoreException {
		FakeBreakpoint b = hasReachedBreakpoint(expression);
		if ( b == null ) {
			Tracer tracer = getKermetaUnit().getTracer();
			if ( tracer != null ) {
				// Getting a text reference on the target if any
				TextReference reference = tracer.getFirstTextReference( expression );
				if ( reference != null ) {
					try {
						FakeBreakpoint temp = _breakpoints.peek();
						if ( temp.getLineNumber() == reference.getLineBeginAt() && temp.getFile().equals(reference.getFileURI()) )
							b = temp;
					} catch (EmptyStackException e) {}
				}
			}
		}
		return b;
	}
	
	/**		The eclipse process created for this interpreter.		*/
	private RuntimeProcess _fakeProcess;
	
	/**		The eclipse process associated to this interpreter.		*/
	public void setFakeProcess(RuntimeProcess process) {
		_fakeProcess = process;
	}
		
	/**
	 * Answering an "ok" message for acknowledgement.
	 */
	private void ok() {
		_requestWriter.println("ok");
		_requestWriter.flush();
	}
	
	/**
	 * Listens to requests from the debug ui interface and fire actions.
	 */
	class RequestListenerJob extends Job {
		
		public RequestListenerJob() {
			super("Kermeta Request Listener");
			setSystem(true);
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
		 */
		protected IStatus run(IProgressMonitor monitor) {
			String request = "";
			while (! _terminated && request != null) {
				try {
					request = _requestReader.readLine();
					InterpreterPlugin.internalLog.debug("Debug Request : " + request);
					if (request != null) {
						if ( request.equals("stack") ) {
							String stackInfo = getStackInfo();
							_requestWriter.println( stackInfo );
							_requestWriter.flush();
						} else if ( request.equals("step") ) {
							ok();
							_steppingStatus = SteppingStatus.STEPPING;
							_eventWriter.println("resumed step");
							_eventWriter.flush();
							resume();
						} else if ( request.equals("stepInto") ) {
							ok();
							_steppingStatus = SteppingStatus.STEPPING_INTO;
							_eventWriter.println("resumed step");
							_eventWriter.flush();
							resume();
						} else if ( request.equals("resume") ) {
							_steppingStatus = SteppingStatus.RESUMING;
							clearBreakpoints();
							ok();
							_eventWriter.println("resumed client");
							_eventWriter.flush();
							resume();
						} else if ( request.equals("exit") ) {
							_fakeProcess.terminate();
							resume();
							terminate();
							return Status.OK_STATUS;
						} else if ( request.startsWith("var ") ) {
							String valueInfo = getValueInfo(request);
							_requestWriter.println( valueInfo );
							_requestWriter.flush();
						}
					}
				} catch (IOException e) {
					terminate();
				} catch (Throwable e) {
					e.printStackTrace();
					memory.getInterpreter().print( e.getLocalizedMessage() );
					terminate();
				}
			}
			return Status.OK_STATUS;
		}
		
	}
	
	private boolean _suspended = true;
	    
	/*
	 * 
	 * Server fields to communicate on requests.
	 * 
	 */
    private ServerSocket _requestServerSocket;
    private Socket _requestSocket;
    private BufferedReader _requestReader;
    private PrintWriter _requestWriter;
    
    /*
     * 
     * Server fields to communicate on events.
     * 
     */
    private ServerSocket _eventServerSocket;
    private Socket _eventSocket;
    private PrintWriter _eventWriter;
   // private BufferedReader _eventReader;
    
    
    public enum SteppingStatus {
    	STEPPING,
    	STEPPING_INTO,
    	RESUMING
    }
    
    private SteppingStatus _steppingStatus = SteppingStatus.RESUMING;
        
    public SteppingStatus getSteppingStatus() {
    	return _steppingStatus;
    }
    
    private RequestListenerJob _requestListener;
    
    
    public DebugInterpreter(RuntimeMemory memory, int requestPort, int eventPort) throws IOException {
    	super( memory );
    	/*
    	 * 
    	 * Creating the server.
    	 * 
    	 */
    	_requestServerSocket = new ServerSocket( requestPort );
    	_eventServerSocket = new ServerSocket( eventPort );
    }
    
    /**
     * When the interpreter is ready, it is waiting for a client for the use of this interpreter.
     * @throws IOException
     */
    public void waitForClient() throws IOException {
    	_requestSocket = _requestServerSocket.accept();
    	/*		Now that a client just connected, streams can initialized.		*/
    	_requestReader = new BufferedReader( new InputStreamReader(_requestSocket.getInputStream()) );
    	_requestWriter = new PrintWriter( _requestSocket.getOutputStream() );
 
       	_eventSocket = _eventServerSocket.accept();
    	/*		Now that a client just connected, streams can initialized.		*/
       	_eventWriter = new PrintWriter( _eventSocket.getOutputStream() );
    	//_eventReader = new BufferedReader( new InputStreamReader(_eventSocket.getInputStream()) );

    }
    
    /**
     * Terminate the interpretation sending a "terminated" message.
     */
    public void terminate() {
    	if ( ! _terminated ) {
	    	// Sending a stop event
			_eventWriter.println("terminated");
			_eventWriter.flush();
			_terminated = true;
			try {
				close();
				_fakeProcess.terminate();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (DebugException e) {
				e.printStackTrace();
			}
    	}
    }
    
    /**
     * Interpretation is finished, close the server and the associated sockets.
     * @throws IOException
     */
    public void close() throws IOException {
    	_requestSocket.close();
    	_requestReader.close();
    	_eventSocket.close();
    	_eventWriter.close();
    	
    	_requestServerSocket.close();
    	_eventServerSocket.close();
    }
    
    
    protected KermetaUnit getKermetaUnit() {
    	return memory.getUnit();
    }
    
    /**
     * The interpreter may need to be suspended. If so, then wait for a resume request.
     * @param node
     */
    public boolean stopIfNecessary(Expression node) {
    	FakeBreakpoint breakpoint = null;
    	try {
    		breakpoint = shouldStop(node);
    	} catch (CoreException e) {
    		e.printStackTrace();
    	}
    	if ( breakpoint != null ) {
    		switch ( _steppingStatus ) {
    		case STEPPING :
        		// A step action has been performed.
    			_eventWriter.println("suspended step");
    			_eventWriter.flush();
    			waitForARequest();
    			break;
    			
    		case STEPPING_INTO :
        		// A step action has been performed.
    			_eventWriter.println("suspended step");
    			_eventWriter.flush();
    			waitForARequest();
    			break;
    			
    		default :
        		// A breakpoint has been reached.
    			_eventWriter.println("suspended breakpoint " + breakpoint.toString());
    			_eventWriter.flush();
    			waitForARequest();
    			break;
    		}
    	}
    	return breakpoint != null;
    }
    
    /**
     * Deblocking this interpreter.
     */
    synchronized private void resume() {
    	notify();
    	_suspended = false;
    }
    
    /**
     * Blocking this thread for a request.
     */
    synchronized private void waitForARequest() {
    	try {
    		if ( ! _terminated ) {
    			_suspended = true;
    			wait();
    		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    /**
     * A stack trace info consists in the file name, the line number, the class, the operation name and the variables.
     * A variable can be a simple variable, a parameter, a property.
     * @return a String representing the stack trace.
     */
    private String getStackInfo() {
    	String stackInfo = "";
    	synchronized( interpreterContext.frame_stack ) {
    		stackInfo = StackFactory.getFrom( interpreterContext.getFrameStack() );
       	}
    	return stackInfo;
    }
    
    /**
     * Gives the string representation of the value of a variable, or a parameter or a property.
     * @param request The string encoded object for which the value is calculated.
     * @return The string representation of the value of an object encoded in string format.
     */
    private String getValueInfo(String request) {
    	String[] strings = request.split("\\|");
    	// Getting the frame
    	String[] firstInfo = strings[0].split(" ");
		int stackId = Integer.parseInt( firstInfo[1] );
		CallFrame frame = interpreterContext.frame_stack.get(stackId);
		// Getting the first variable
		RuntimeObject runtimeVariable = null;
		if ( frame instanceof CallFrame ) {
			Variable var = ((CallFrame) frame).getVariableByName(firstInfo[2]);
			if ( var != null )
				runtimeVariable = var.getRuntimeObject();
			else if ( frame.getSelf().getProperties().get( firstInfo[2] ) != null )
				runtimeVariable = frame.getSelf().getProperties().get( firstInfo[2] );
		}
		// Getting the real variable
		for ( int i = 1; i < strings.length; i++ ) {
			// Here, we are looking for a property or a collection element
			try {
				// looking for a possible collection element.
				int index = Integer.parseInt( strings[i] );
				List<Object> collection = (List<Object>) runtimeVariable.getJavaNativeObject();
				runtimeVariable = (RuntimeObject) collection.get(index);
			} catch (NumberFormatException e1) {
				// This is a property.
				// the properties getting can throw a null pointer exception.
				// That means that this property has not been set.
				try {
					runtimeVariable = runtimeVariable.getProperties().get( strings[i] );
				} catch (NullPointerException e2) {
					runtimeVariable = null;
				}
			}
		}
		// If the property has not been set, use the void instance.
		if ( runtimeVariable == null )
			runtimeVariable = memory.voidINSTANCE;
		
		// Setting the value
		String value = runtimeVariable.toUserString();
		// We do not want to display properties for Void objects
		
		if ( runtimeVariable != memory.voidINSTANCE ) {
			if ( runtimeVariable.getMetaclass() != null ) {
				Class metaclass = (Class) runtimeVariable.getMetaclass().getKCoreObject();
				if ( metaclass.getTypeDefinition() instanceof ClassDefinition ) {
					ClassDefinition cd = (ClassDefinition) metaclass.getTypeDefinition();
					if ( KermetaModelHelper.ClassDefinition.isCollection(cd) ) {
						List<Object> collection = (List<Object>) runtimeVariable.getJavaNativeObject();
						if ( collection != null )
							for ( int i = 0; i < collection.size(); i++ )
								value += "|index*" + i;
					}			
					for ( Property p : KermetaModelHelper.ClassDefinition.getAllProperties(cd) ) {
						if ( p.isIsDerived() )
							value += "|property*" + p.getName();
						else if ( p.isIsComposite() )	
							value += "|attribute*" + p.getName();
						else
							value += "|reference*" + p.getName();
					}
				}
			}
		}
		return value;
    }
    
    public RuntimeObject invoke(RuntimeObject mainClass, Operation mainOperation, List<RuntimeObject> parameters) {
    	RuntimeObject result = null;
    	try {
			waitForClient();
			// At starting, debugger is suspended.
			_suspended = true;
			// Notify that the debugger started.
			notifyEvent("started");
			// Waiting for a resume request from the debug target.
			waitForResumeRequest();
			notifyEvent("resumed client");
			_suspended = false;
	    	/*		Launch a specific job to listen requests.		*/
	    	_requestListener = new RequestListenerJob();
	    	_requestListener.schedule();
			result = (RuntimeObject) super.invoke(mainClass, mainOperation, parameters);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			terminate();
		}
		return result;
    }

    private void notifyEvent(String type) {
    	synchronized (_eventSocket) {
        	_eventWriter.println(type);
        	_eventWriter.flush();			
		}
    }
    
    private void waitForResumeRequest() throws IOException {
    	String s = "";
    	while ( ! s.equals("resume") ) {
    		s = _requestReader.readLine();
    		if ( ! s.equals("resume") )
    			sendRequestAnwser("");
    	}
    	ok();
    }
    
    private void sendRequestAnwser(String content) {
    	synchronized ( _requestSocket ) {
			_requestWriter.println(content);
			_requestWriter.flush();
		}
    }
        
    /** 
     * @see fr.irisa.triskell.kermeta.visitor.KermetaOptimizedVisitor#visitCallFeature(fr.irisa.triskell.kermeta.behavior.CallFeature)
     */
    public Object visitCallFeature(CallFeature node) {
    	// Do not visit the call feature if the interpreter is terminated.
    	if ( _terminated )
    		return null;
    	return CallFeatureDebugInterpreter.doIt(node, this);
    }   

    @Override
    public Object visitAssignment(Assignment node) {
    	if ( _terminated )
    		return null;
    	return AssignmentDebugInterpreter.doIt(node, this);
    }
    
}
