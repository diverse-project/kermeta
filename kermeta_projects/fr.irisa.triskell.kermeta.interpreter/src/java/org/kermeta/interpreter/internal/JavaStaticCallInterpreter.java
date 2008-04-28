

package org.kermeta.interpreter.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.kermeta.interpreter.InterpreterPlugin;

import fr.irisa.triskell.kermeta.error.KermetaVisitorError;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.language.behavior.JavaStaticCall;
import fr.irisa.triskell.kermeta.runtime.FrameworkExternCommand;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class JavaStaticCallInterpreter {

	static public RuntimeObject doIt(JavaStaticCall node, ExpressionInterpreter interpreter) {
		String cmdID = node.getJclass() + "_" + node.getJmethod() + "_" + node.getParameters().size();
		cmdID = cmdID.replaceAll(":", "_");
		FrameworkExternCommand cmd = FrameworkExternCommand.getCommand(cmdID);
		if (cmd != null) {
			RuntimeObject[] paramsArray = new RuntimeObject[node.getParameters().size()];
			
			// Get the parameters of this operation
			List<RuntimeObject> parameters = interpreter.visitList(node.getParameters());
			// Get the param types for invokated method
			int i = 0;
			for (Object next : parameters) paramsArray[i++] = (RuntimeObject)next;
			
			// Execute the command
			try{
				return cmd.execute(paramsArray);
	        }
	        catch(KermetaRaisedException e)
			{
	        	// the Kermeta raised exception created on the java side hasn't the cause object: ( context)
	        	// because it was not passed in the parameters ...
	        	if (!e.issetContextString())
	        	{
	        		RuntimeObject rnode = interpreter.getMemory().getRuntimeObjectForFObject(node);
	        		e.setContextString(interpreter, rnode);
	        	}
	            throw e;	
			}
		}
		
		/* IF THE EXTERN HAS NOT BEEN COMPILED THEN IT IS AN INVOKE */
		
		String jclassName  = node.getJclass().replaceAll("::","."); 
		String jmethodName = node.getJmethod();
		
		RuntimeObject[] paramsArray = new RuntimeObject[node.getParameters().size()];
		Class[] paramtypes = new Class[node.getParameters().size()];
		
		// Get the parameters of this operation
		List<RuntimeObject> parameters = interpreter.visitList(node.getParameters());
		// Get the param types for invokated method
		int i = 0;
		for (Object next : parameters) {
			paramtypes[i] = RuntimeObject.class;
		    paramsArray[i++] = (RuntimeObject)next;
		    // TODO : test if the RuntimeObject is null or not
		}
		
		RuntimeObject result = null;
		
		String cmd_id = node.getJclass() +"_"+ node.getJmethod();
	
			// Invoke the java method
			Class jclass = null;
			ClassLoader cl = Thread.currentThread().getContextClassLoader();
	        try {
	        	
	        	//jclass = Class.forName(jclassName);
	        	// The Thread ClassLoader also includes the user jars
	        	if(cl instanceof URLClassLoader){
	        		URLClassLoader ucl=(URLClassLoader)cl;
	        		jclass = ucl.loadClass(jclassName);
	        	} else jclass = cl.loadClass(jclassName);
	        	//jclass = Class.forName(jclassName,true, cl);
	        } catch (ClassNotFoundException e) {
	        	String additionalInfo = "";
	        	if(cl instanceof URLClassLoader){
	        		URLClassLoader ucl=(URLClassLoader)cl;
	        		URL[] urls = ucl.getURLs();
	        		additionalInfo += "Current URLs in the URLClassLoader : \n";
					for (int index = 0; index < urls.length; index++) {
						additionalInfo += "\t" + urls[index].toExternalForm() + "\n";
					}
	        	}
	        	InterpreterPlugin.internalLog.error("ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw KermetaRaisedException.createKermetaException("kermeta::exceptions::RuntimeError",
						"ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName + ". Please verify your java classpath in the kermeta run target. \n"+additionalInfo,
						interpreter,
						interpreter.getMemory(),
						node,
						e);
	        }
	        Method jmethod = null;
	        try {
	            jmethod = jclass.getMethod(jmethodName, paramtypes);
	        } catch (SecurityException e1) {
	        	InterpreterPlugin.internalLog.error("SecurityException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw	new KermetaVisitorError("SecurityException invoking "+ jmethodName + " on Class " +jclassName  , interpreter.computeCurrentContextString(), e1);
	        } catch (NoSuchMethodException e1) {
	        	InterpreterPlugin.internalLog.error("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!", e1);
				throw	new KermetaVisitorError("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName  , interpreter.computeCurrentContextString(),e1);
	        }
	        
	        try {
	            result = (RuntimeObject) jmethod.invoke(null, (Object[])paramsArray);
	        } catch (IllegalArgumentException e2) {        
	        	InterpreterPlugin.internalLog.error("IllegalArgumentException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw	new KermetaVisitorError("IllegalArgumentException invoking "+ jmethodName + " on Class " +jclassName, interpreter.computeCurrentContextString()  ,e2); 		
	        } catch (IllegalAccessException e2) {
	        	InterpreterPlugin.internalLog.error("IllegalAccessException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
				throw	new KermetaVisitorError("IllegalAccessException invoking "+ jmethodName + " on Class " +jclassName, interpreter.computeCurrentContextString()  ,e2);
	        } catch (InvocationTargetException e2) {
	            Throwable cause = e2.getCause();
			    if (cause != null)				       
			        if (cause.getClass().getName().compareTo("junit.framework.AssertionFailedError")==0)
				    {
			        	InterpreterPlugin.internalLog.error(e2.getClass().getName() + " invoking "+ jmethodName + " on Class " +jclassName + " was due to AssertionFailedError: Shrinking the Exception Stack ");					       
			            // this Exception was due to a KermetaVisitorError create a new one with the precedent content
			            throw new KermetaVisitorError("InvocationTargetException caused by AssertionError: "+cause.getMessage(), interpreter.computeCurrentContextString(), cause);
			        }
			        else if (cause instanceof KermetaRaisedException)
			        {
			            throw (KermetaRaisedException)cause;
			        }
			        else
			        {
			        	InterpreterPlugin.internalLog.error("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName , e2);
			        	InterpreterPlugin.internalLog.error("The cause : "  + cause.getClass());
			            throw	new KermetaVisitorError("InvocationTargetException invoking "+ jmethodName + " on Class " +jclassName 
			            		+ "\n The cause: " + cause.getClass(), interpreter.computeCurrentContextString(),e2);
			        }
	            
	        } catch (Throwable e2) {
	        	InterpreterPlugin.internalLog.error("InstantiationException invoking "+ jmethodName + " on Class " +jclassName, e2);
				throw	new KermetaVisitorError("InstantiationException invoking "+ jmethodName + " on Class " +jclassName, interpreter.computeCurrentContextString()  ,e2);
	        }

        return result;
	}

}


