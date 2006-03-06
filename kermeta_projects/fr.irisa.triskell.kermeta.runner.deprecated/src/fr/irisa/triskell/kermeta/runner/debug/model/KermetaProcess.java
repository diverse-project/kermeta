/* $Id: KermetaProcess.java,v 1.17 2006-03-06 11:10:26 barais Exp $
 * Project   : Kermeta runner
 * File      : KermetaProcess.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 23/01/2006
 * Authors       : 
 *     Didier Vojtisek <dvojtise@irisa.fr>
 */
package fr.irisa.triskell.kermeta.runner.debug.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;

import fr.irisa.triskell.kermeta.runner.RunnerPlugin;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

public class KermetaProcess extends Thread {

	/** logger for the Process */
	final static public Logger internalLog = LogConfigurationHelper
			.getLogger("Kermeta");

	
	public String defaultName = "Kermeta Execution Thread";

	/**
	 * Constructor, uses the default name for the Thread
	 */
	public KermetaProcess() {
		super();
		this.setName(defaultName);
	}

	public KermetaProcess(String threadName) {
		super();
		this.setName(threadName);
	}

	/**
	 * Method called when start() is called on this thread
	 */
	@Override
	public synchronized void start() {
		super.start();
	}

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
							urlsV.add(new URL("file://" + entry1.getLocation().replaceAll("/", "//")));
						} else {
							urlsV.add(new URL("file://" +entry1.getLocation().replaceAll("/", "//")
									+ "//"));
						}
						RunnerPlugin.pluginLog.debug("added " + "file://" + entry1.getLocation().replaceAll("/", "//")
								+ " in Thread Class Loader " + this.getName());
					}
				} catch (MalformedURLException e) {
					RunnerPlugin.pluginLog.warn(
							"problem with an entry of the classpath, "
									+ "file:/" + entry1.getLocation()
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
		this.setContextClassLoader(cl);
		
		/*
		 * URL res = cl.findResource("waf/Test.class"); try {
		 * System.err.println(cl.loadClass("waf.Test")); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 * System.err.println("After cl changed, Test is here : " +res);
		 */
	}

	/** Terminates properly the interpreter */
	public synchronized void terminate() {
		RunnerPlugin.pluginLog.debug("KermetaProcess terminates");
	}
}
