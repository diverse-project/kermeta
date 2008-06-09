

/*$Id: KBasicProcess.java,v 1.13 2008-06-09 14:24:07 ftanguy Exp $
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
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
import org.kermeta.interpreter.api.InitializationError;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.runner.RunnerPlugin;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
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
	
	private String _file;
	
	private Interpreter _interpreter;
	
	private PipedInputStream _inputStream;
	private PipedInputStream _errorStream;
	private PipedOutputStream _outputStream;
	
	private PipedOutputStream _interpreterOutputStream;
	private PipedOutputStream _interpreterErrorStream;
	private PipedInputStream _interpreterInputStream;
	
	
	public Interpreter getInterpreter() {
		return _interpreter;
	}
	
	public KBasicProcess(String file, boolean isConstraint, String mainClass, String mainOperation, String[] parameters, String defaultPath, List<String> classpath) throws NotRegisteredURIException, URIMalformedException {
		_file = file;
		initializeStreams();
		BufferedReader inputReader = new BufferedReader( new InputStreamReader( _interpreterInputStream ) );
		PrintStream os = new PrintStream(_interpreterOutputStream);
		PrintStream es = new PrintStream(_interpreterErrorStream);
		if ( isConstraint )
			_interpreter = new Interpreter(file, InterpreterMode.CONSTRAINT_RUN, null);
		else
			_interpreter = new Interpreter(file, InterpreterMode.RUN, null);
		_interpreter.setDefaultPath( defaultPath );
		_interpreter.setInputStream( inputReader );
		_interpreter.setOutputStream( os );
		_interpreter.setErrorStream( es );
		_interpreter.setEntryPoint(mainClass, mainOperation);
		_interpreter.setParameters(parameters);
		updateThreadClassLoader(classpath, getCurrentProjectOutputPath(), getCurrentProjectRequiredEntries());
	}
	
	public KBasicProcess(String file, boolean isConstraint, int requestPort, int eventPort, String mainClass, String mainOperation, String[] parameters, String defaultPath, List<String> classpath) throws IOException, NotRegisteredURIException, URIMalformedException {
		_file = file;
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
		_interpreter.setDefaultPath( defaultPath );
		_interpreter.setInputStream( inputReader );
		_interpreter.setOutputStream( os );
		_interpreter.setErrorStream( es );
		_interpreter.setEntryPoint(mainClass, mainOperation);
		_interpreter.setParameters(parameters);
		updateThreadClassLoader(classpath, getCurrentProjectOutputPath(), getCurrentProjectRequiredEntries());
		// Forces the interpreter to creates the delegates and especially the server so that the debug client can connect.
		_interpreter.ready();
		
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
		if ( ! _interpreter.hasProcessAttached() ) {
			synchronized( this ) {
				wait();
			}
		}
		try {
			// Starting the interpreter.
			_interpreter.launch();
		} catch (InitializationError e) {
			try {
				_interpreterErrorStream.write( e.getErrorsAsString().getBytes() );
				_interpreterErrorStream.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			destroy();
		}
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

	/** retreives the requires pathes used by the current project */
	protected IClasspathEntry[] getCurrentProjectRequiredEntries() {
		IFile ifile = ResourceHelper.getIFile(_file);
    	IProject theProject = ifile.getProject();
    	
    	if(theProject != null) 
    		if ( theProject.exists() && theProject.isOpen() ) {
    			try {
					if ( theProject.getNature(org.eclipse.jdt.core.JavaCore.NATURE_ID) != null ) {
						IJavaProject javaProj = JavaCore.create(theProject);
						return javaProj.getResolvedClasspath(true);
					}
				} catch (CoreException e) {
					// we don't care, just ignore this project for the class path
				}
    		}
		return null;
	}
	
	/** retrieve the path of the project if this is a java project */ 
	protected String getCurrentProjectOutputPath() {
		IFile ifile = ResourceHelper.getIFile(_file);
    	IProject theProject = ifile.getProject();
    	
    	String currentProjectPath = null;
    	if(theProject != null) 
    		if ( theProject.exists() && theProject.isOpen() ) {
    			try {
					if ( theProject.getNature(org.eclipse.jdt.core.JavaCore.NATURE_ID) != null ) {
						currentProjectPath = ResourceHelper.root.getLocation().toString();
						IJavaProject javaProj = JavaCore.create(theProject);
						currentProjectPath += javaProj.getOutputLocation().toString();
					}
				} catch (CoreException e) {
					// we don't care, just ignore this project for the class path
				}
    		}
		return currentProjectPath;
	}
	
	/** Update the classLoader for this thread */
	public void updateThreadClassLoader(List<String> pathAttribute, String currentProjectPath, IClasspathEntry[] currentProjectEntries) {
		Set<URL> urlsV = new LinkedHashSet<URL>();
		//Vector<URL> urlsV = new Vector<URL>();

		if ( pathAttribute != null ) {
		
			for (int i = 0; i < pathAttribute.size(); i++) {
				String memento1 = (String) pathAttribute.get(i);
				try {
					IRuntimeClasspathEntry entry1 = JavaRuntime
							.newRuntimeClasspathEntry(memento1);
					// resolve this classpath entry
					// org.eclipse.jdt.launching.StandardClasspathProvider resolver;
					try {
						// entry1.toString();
						if (entry1.getLocation() != null) {
							if (entry1.getType() == IRuntimeClasspathEntry.ARCHIVE && entry1.getLocation().endsWith(".jar")) {
								// second part of the test is because IRuntimeClasspathEntry.ARCHIVE may also be a folder in the system
								// deal with jar url
								urlsV.add(new URL("file:///" + entry1.getLocation()));
								RunnerPlugin.internalLog.debug("added " + "file:///" + entry1.getLocation()
										+ " in Thread Class Loader " );//+ this.thread.getName());
								
								
							} else {
								// deal with project url
								urlsV.add(new URL("file:///" +entry1.getLocation() + "/"));
								RunnerPlugin.internalLog.debug("added " + "file:///" + entry1.getLocation()+ "/"
										+ " in Thread Class Loader " );//+ this.thread.getName());
							}
						}
					} catch (MalformedURLException e) {
						RunnerPlugin.internalLog.warn(
								"problem with an entry of the classpath, "
										+ "file:///" + entry1.getLocation()
										+ " cannot be added in classloader", e);
					}
					// IRuntimeClasspathEntryResolver
					// this.getIPathFromString()
				} catch (CoreException e) {
					RunnerPlugin.internalLog.warn("Problem reading classpath entry",
							e);
					//RunnerPlugin.log(e);
					return;
				}
			}
		}
		if(currentProjectPath != null){
			try {				
				//ClasspathEntry cpEntry = new ClasspathEntry();				
				urlsV.add(new URL("file:///" +currentProjectPath + "/"));
			} catch (MalformedURLException e) {
				RunnerPlugin.internalLog.warn("Current project cannot be added to classpath",
						e);
				//RunnerPlugin.log(e);
			}
		}
		
		if(currentProjectEntries != null){
			for(IClasspathEntry projectEntry : currentProjectEntries){
				try {
					
					if (projectEntry.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
						
						urlsV.add(new URL("file:///" +projectEntry.getPath().toPortableString()));
					}
					else if (projectEntry.getEntryKind() == IClasspathEntry.CPE_CONTAINER) {
						RunnerPlugin.internalLog.warn(
								"(not implemented) problem with an entry CPE_CONTAINER of the classpath, "
										+ projectEntry.getPath().toOSString()
										+ " cannot be added in classloader", null);
						//urlsV.add(new URL(projectEntry.getPath().toOSString()));
					}
					else if (projectEntry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
						String outputLocation = null;
						if(projectEntry.getOutputLocation() != null)
						{
							outputLocation = "file:///" +projectEntry.getOutputLocation().toOSString()+ "/";
						}
						else{
							// must use project default output location
							// project name is the first segment of the path
							String projectName = projectEntry.getPath().segments()[0];
							IProject theProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
							if (theProject.exists() && theProject.isOpen())
				    		{
								outputLocation = "file:///" +ResourceHelper.root.getLocation().toString();
								IJavaProject javaProj = JavaCore.create(theProject);
								outputLocation += javaProj.getOutputLocation().toString()+ "/";
				    		}
							else{
								// try a plugin in the workbench that launched this eclipse
								Bundle bundle = org.eclipse.core.runtime.Platform.getBundle(projectName);
								if(bundle != null){
									// ok a plugin exists with the same name as the required project
									try {
										outputLocation = FileLocator.resolve(FileLocator.find(bundle, new org.eclipse.core.runtime.Path("/"), null)).toString();
										outputLocation += "bin/";
									} catch (IOException e) {
										RunnerPlugin.internalLog.warn(
												"problem with an entry of the classpath, "
														+ projectEntry.getPath().toOSString()
														+ " cannot be added in classloader", e);
									}
								}
								else {
									RunnerPlugin.internalLog.warn(
											"problem with an entry of the classpath, "
													+ projectEntry.getPath().toOSString()
													+ " cannot be added in classloader", null);
								}

							}
						}
						urlsV.add(new URL(outputLocation));
						//urlsV.add(new URL(projectEntry.getPath().toOSString()));
					}
					else if (projectEntry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
						// this correspond to the source of a project
						// need to retrieve the output dir of the corresponding project

						String outputLocation = null;
						if(projectEntry.getOutputLocation() != null)
						{
							outputLocation = "file:///" +projectEntry.getOutputLocation().toOSString()+ "/";
						}
						else{
							// must use project default output location
							// project name is the first segment of the path
							String projectName = projectEntry.getPath().segments()[0];
							IProject theProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
							outputLocation = "file:///" +ResourceHelper.root.getLocation().toString();
							IJavaProject javaProj = JavaCore.create(theProject);
							outputLocation += javaProj.getOutputLocation().toString()+ "/";
						}
						urlsV.add(new URL(outputLocation));
					}
				} catch (MalformedURLException e) {
					RunnerPlugin.internalLog.warn(
							"problem with an entry of the classpath, "
									+ projectEntry.getPath().toOSString()
									+ " cannot be added in classloader", e);
				}	
				catch (JavaModelException e) {
					RunnerPlugin.internalLog.warn(
							"problem with an entry of the classpath, "
									+ projectEntry.getPath().toOSString()
									+ " cannot be added in classloader", e);
				}
			}
		}
		
		// Check if the file to execute is coming from a plugin. If yes get the classpath from the bundle and add it to interpreter classpath.
		if ( _file.matches("platform:/plugin/.+") ) {
			String bundleName = _file.replace("platform:/plugin/", "");
			bundleName = bundleName.replaceFirst("/.+", "");
			// Plugin Dependencies
			Object o = Platform.getBundle(bundleName).getHeaders().get("Require-Bundle");
			if ( o != null ) {
				String value = (String) o;
				String[] strings = value.split(",");
				for ( String s : strings ) {
					Bundle b = Platform.getBundle(s);
					if ( b!= null )
						urlsV.add( b.getEntry("/") );
				}
			}
			// Jar dependencies
			o = Platform.getBundle(bundleName).getHeaders().get("Bundle-ClassPath");
			if ( o != null ) {
				String value = (String) o;
				String[] strings = value.split(",");
				for ( String s : strings ) {
					URL url = Platform.getBundle(bundleName).getEntry(s);
					if ( url != null )
						urlsV.add( url );
				}
			}
		}
			
		URL[] urls = new URL[urlsV.size()];
		int i = 0;
		for (URL url : urlsV) {
			urls[i] = url;
			i++;
		}
		
		//_interpreter.addToClasspath(urls);		
		
		// URLClassLoader cl = new URLClassLoader(urls,
		// this.getContextClassLoader());
		// use this object class loader as parent (instead of the default thread
		// class loader)
		// because it also contains the plugin classloader rules
		URLClassLoader cl = new URLClassLoader(urls, this.getClass()
				.getClassLoader());
		
		_interpreter.setContextClassLoader(cl);
		/*
		 * URL res = cl.findResource("waf/Test.class"); try {
		 * System.err.println(cl.loadClass("waf.Test")); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 * System.err.println("After cl changed, Test is here : " +res);
		 */
	}
	
}


