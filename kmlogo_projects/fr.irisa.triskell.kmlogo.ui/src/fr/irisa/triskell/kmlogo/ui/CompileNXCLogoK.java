/* $Id: CompileNXCLogoK.java,v 1.10 2008-05-26 14:49:35 vmahe Exp $
 * Project   : KmLogo
 * File      : CompileNXCLogoK.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jun 14, 2007
 * Authors       : 
 *		Franck Fleurey
 *		Didier Vojtisek
 */
package fr.irisa.triskell.kmlogo.ui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class CompileNXCLogoK {

	public static final String LOGO_COMPILER_KERMETA_CODE = "platform:/plugin/fr.irisa.triskell.kmlogo.model/logo/6.NXTCompiler/LogoNXCCompiler.kmt";
	public static void run(String file, String out, IOConsole console) throws NotRegisteredURIException, URIMalformedException, IOException {
		System.out.println("run FixModel");
		
		/*
		 // merge in user projet .bin directory
		// create intermediate files into the project of the user
		IFile file = ResourceHelper.getIFile( fileURI );
	    IProject project = file.getProject();
	    String binDirectory = "platform:/resource" + project.getFullPath().toString() + "/.bin";
	    KermetaInterpreter inter = new KermetaInterpreter(LOGO_COMPILER_KERMETA_CODE, binDirectory , null);
		*/
		// merge in memory
		Interpreter interpreter = new Interpreter(LOGO_COMPILER_KERMETA_CODE, InterpreterMode.RUN, null);
		interpreter.setStreams(console);
		interpreter.setEntryPoint("kmLogo::NXCCompiler", "compile");
		
		String api = null;
		api = FileLocator.resolve(Platform.getBundle("fr.irisa.triskell.kmlogo.model").getEntry("/model/LogoNXC.nxc")).toString();

		String[] parameters = new String[3];
		parameters[0] = file;
		parameters[1] = out;
		parameters[2] = api;
		interpreter.setParameters(parameters);
				
		// Add some URL to the classloader of the interpreter : needed if your code use some extra java classes (via extern for example)
		// use a set for building the URL (in case some may fail due to malformed URL
		// Note : URL must end with a / if this is a directory, if not, this is considered as a jar by the classloader
		Set<URL> urlsSet = new LinkedHashSet<URL>();
		// URL used when run in a runtimeworkbench, this allows to debug the plugin
		safeAddURLAsString(urlsSet, "file://" + FileLocator.resolve(Platform.getBundle("fr.irisa.triskell.kmlogo.model").getEntry("/bin/")));;
		// add this plugin as a deployed plugin
		Bundle bundle = org.eclipse.core.runtime.Platform.getBundle("fr.irisa.triskell.kmlogo.model");
		if(bundle != null){
			urlsSet.add(FileLocator.resolve(bundle.getEntry("/")));
			/*safeAddURLAsString(urlsSet,bundle.getLocation());*/
//			Activator.internalLog.debug("classloader updated with " +FileLocator.resolve(bundle.getEntry("/")));
		}		
		
		
		// convert the set into an array
		URL[] urls = new URL[urlsSet.size()];
		int i = 0;
		for (URL url : urlsSet) {
			urls[i] = url;
			i++;
		}
		URLClassLoader cl = new URLClassLoader(urls, interpreter.getClass().getClassLoader());
		Thread.currentThread().setContextClassLoader(cl);
		interpreter.launch();
		

	}

	/**
	 * add a new URL to the set
	 * Doesn't fail if the URL is malformed, in that case, only a warning is raised, 
	 * @param urlsSet : set that will contain the URL built
	 * @param url : String of the URL to build
	 */
	private static void safeAddURLAsString(Set<URL> urlsSet, String url){
		try{
			urlsSet.add(new URL(url));
		} catch (MalformedURLException e) {
			Activator.logWarningMessage(
					"problem adding an entry of the classpath, "
					+ url + " cannot be added in classloader", e);
		}
	}

}
