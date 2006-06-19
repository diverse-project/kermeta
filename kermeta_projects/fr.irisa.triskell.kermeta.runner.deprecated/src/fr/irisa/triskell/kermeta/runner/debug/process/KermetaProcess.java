/* $Id: KermetaProcess.java,v 1.2 2006-06-19 12:34:39 dvojtise Exp $
 * Project   : Kermeta runner
 * File      : KermetaProcess.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 23/01/2006
 * Authors       : 
 *     Didier Vojtisek <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.runner.debug.process;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.RuntimeProcess;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;

import sun.awt.RepaintArea;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/** 
 * Inspired from :
 * http://darwingrok.physics.ox.ac.uk:8080/
 * source/xref/gcc/libjava/java/lang/PosixProcess.java
 * */
public class KermetaProcess //extends Process
	implements Runnable {


	/** Before the process is forked. */
   public static final int STATE_WAITING_TO_START = 0;
   /** After the fork. */
   public static final int STATE_RUNNING = 1;
   /** After exit code has been collected. */
   public static final int STATE_TERMINATED = 2;

	/** One of STATE_WAITING_TO_START, STATE_RUNNING, STATE_TERMINATED. */
    public int state;
    
    /** The exit status, if the child has exited. */
    public int status;
	/** logger for the Process */
	final static public Logger internalLog = LogConfigurationHelper
			.getLogger("Kermeta");
	
	public Thread thread;
	
	public KermetaProcess(String threadName) {
		super();
		// Create the thread supplying it with the runnable object
		thread = new Thread(this);
		this.thread.setName(threadName);
		this.state = STATE_RUNNING;
	}
	
	/** Starts the underlying thread */
	public void start()
	{
		this.thread.start();
	}

	/** Update the classLoader for this thread */
	public void updateThreadClassLoader(List pathAttribute) {
		Vector<URL> urlsV = new Vector<URL>();

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
						if (entry1.getType() == IRuntimeClasspathEntry.ARCHIVE) {
							// deal with jar url
							urlsV.add(new URL("file:///" + entry1.getLocation()));
							RunnerPlugin.pluginLog.debug("added " + "file:///" + entry1.getLocation()
									+ " in Thread Class Loader " + this.thread.getName());
						} else {
							// deal with project url
							urlsV.add(new URL("file://" +entry1.getLocation() + "//"));
							RunnerPlugin.pluginLog.debug("added " + "file:///" + entry1.getLocation()+ "//"
									+ " in Thread Class Loader " + this.thread.getName());
						}
					}
				} catch (MalformedURLException e) {
					RunnerPlugin.pluginLog.warn(
							"problem with an entry of the classpath, "
									+ "file:///" + entry1.getLocation()
									+ " cannot be added in classloader", e);
				}
				// IRuntimeClasspathEntryResolver
				// this.getIPathFromString()
			} catch (CoreException e) {
				RunnerPlugin.pluginLog.warn("Problem reading classpath entry",
						e);
				RunnerPlugin.log(e);
				return;
			}
		}
		URL[] urls = new URL[urlsV.size()];
		for (int i = 0; i < urlsV.size(); i++) {
			urls[i] = urlsV.elementAt(i);
		}
		// URLClassLoader cl = new URLClassLoader(urls,
		// this.getContextClassLoader());
		// use this object class loader as parent (instead of the default thread
		// class loader)
		// because it also contains the plugin classloader rules
		URLClassLoader cl = new URLClassLoader(urls, this.getClass()
				.getClassLoader());
		this.thread.setContextClassLoader(cl);
		
		/*
		 * URL res = cl.findResource("waf/Test.class"); try {
		 * System.err.println(cl.loadClass("waf.Test")); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 * System.err.println("After cl changed, Test is here : " +res);
		 */
	}

	/** Terminates properly the interpreter */
	public synchronized void terminate() {
		System.out.println("Someone terminates?");
		state = STATE_TERMINATED; 
		RunnerPlugin.pluginLog.debug("KermetaProcess terminates");
	}

	/** Run method of implemented Runnable interface (actually defined in 
	 * the inherited classes of KermetaProcess */
	public void run() { }

	/* ----------------------------------------------------------------------
	 *  
	 *  Implementation of java.lang.Process methods.
	 * 
	 * ----------------------------------------------------------------------
	 */
	
	/** (non-Javadoc)
	 * @see java.lang.Process#destroy()
	 */
	public void destroy() {
		this.thread = null;
		state = STATE_TERMINATED;
	}
	/**
	 * @see java.lang.Process#exitValue()
	 * It should be forbidden to call this method before the process is finished.
	 * This method is called by IProcess when user clicks on "Stop" button
	 */
	public int exitValue() {
		synchronized (this)
	     {
			System.out.println("Someone calls exit value: " + state);
			//	if (! hasExited())
			if (state != STATE_TERMINATED)
				throw new IllegalThreadStateException("Process has not exited");
	     }
		return status;
	}

	/**
	 * @see java.lang.Process#getErrorStream()
	 */
	public InputStream getErrorStream() {
		System.out.println("Someone calls getErrorStream");
		return System.in;
	}

	/**
	 * @see java.lang.Process#getInputStream()
	 */
	public InputStream getInputStream() {
		System.out.println("Someone calls getInputStream");
		return System.in;
	}

	/**
	 * Must not be null
	 * @see java.lang.Process#getOutputStream()
	 */
	public OutputStream getOutputStream() {
		System.err.println("Someone calls getOutputStream");
		return System.out;
	}

	/**
	 * @see java.lang.Process#waitFor()
	 */
	public int waitFor() throws InterruptedException {
/*		synchronized (this)
		{ 	System.out.println("Someone calls waitFor");
			while (state != STATE_TERMINATED)
				wait();
		}*/
		return status;
	}
	

}
