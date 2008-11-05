/*$Id: InvokeCompiledCodeJob.java,v 1.1 2008-11-05 16:26:15 dvojtise Exp $
* Project : org.kermeta.debugger
* File : 	InvokeCompiledCodeJob.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 5 Nov 08
* Authors : 
*		dvojtise
*/
package fr.irisa.triskell.kermeta.launcher;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.compiler.tests.CompilerTestsPlugin;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class InvokeCompiledCodeJob extends Job {

	protected String javaClassName;
	String[] classPath;
	
	public Exception catchedException;
	public Error catchedError;
	
	public InvokeCompiledCodeJob(String _javaClassName, String[] _classPath) throws MalformedURLException {
		super("Invoking main on " +_javaClassName);
		this.classPath = _classPath;
		this.javaClassName = _javaClassName; 
		
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try{
			updateThreadClassLoader(this.classPath);
			invokeMainOperationInClass(this.javaClassName);
		}
		catch (Exception e){
			catchedException = e;
			return new Status(IStatus.OK, CompilerTestsPlugin.PLUGIN_ID, "Exception while invoking main on " +javaClassName, e);
			//return new Status(IStatus.ERROR, "fr.irisa.triskell.kermeta.interpreter", "model not loaded", e);
		}
		catch (Error ome){
			catchedError = ome;
			return new Status(IStatus.OK, CompilerTestsPlugin.PLUGIN_ID, "Exception while invoking main on " +javaClassName, ome);
			//return new Status(IStatus.ERROR, "fr.irisa.triskell.kermeta.interpreter", "model not loaded", e);
		}
		return new Status(IStatus.OK,"End", null);
	}
	
	/** Update the classLoader for this thread 
	 * @throws MalformedURLException */
	public void updateThreadClassLoader(String[] classPath) throws MalformedURLException {
		URL[] urls = new URL[classPath.length];
 		for (int i=0; i<classPath.length; i++ ) {
 			if(classPath[i].endsWith(".jar"))
 				urls[i] = new URL("file:///" +classPath[i]);
 			else
 				urls[i] = new URL("file:///" +classPath[i]+"/");
 		}
 		URLClassLoader cl = new URLClassLoader(urls, this.getClass()
				.getClassLoader());
 		Thread.currentThread().setContextClassLoader(cl);
	}
	
	
	public void invokeMainOperationInClass(String jclassName) throws Exception{
		String jmethodName = "main";
		
		Class<?> jclass = null;
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
        	CompilerTestsPlugin.internalLog.error("ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaRuntimeError !!!");
        	CompilerTestsPlugin.internalLog.info(additionalInfo);			
        	throw new Exception("ClassNotFoundException invoking "+ jmethodName + " on Class " +jclassName + ".",
					e);
        }	
        // parameter is a String[]
		Class<?>[] paramtypes = new Class[1];
		paramtypes[0] = String[].class;
		
        Method jmethod = null;
        try {
            jmethod = jclass.getMethod(jmethodName, paramtypes);
        } catch (SecurityException e1) {
        	CompilerTestsPlugin.internalLog.error("SecurityException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!");
			throw	e1;
        } catch (NoSuchMethodException e1) {
        	CompilerTestsPlugin.internalLog.error("NoSuchMethodException invoking "+ jmethodName + " on Class " +jclassName + " => Throwing KermetaInterpreterError !!!", e1);
			throw	e1;
        }
        
        Object[] paramsArray = new Object[1];
        paramsArray[0] = null;
        
        @SuppressWarnings("unused")
		Object result = null;
        result = (RuntimeObject) jmethod.invoke(null, (Object[])paramsArray);
        
	}






	
}
