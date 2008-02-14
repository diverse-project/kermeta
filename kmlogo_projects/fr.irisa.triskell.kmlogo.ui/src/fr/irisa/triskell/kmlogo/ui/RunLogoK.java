/* $Id: RunLogoK.java,v 1.7 2008-02-14 07:15:51 uid21732 Exp $
 * Project   : kmLogo
 * File      : RunLogoK.java
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
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

import org.eclipse.core.runtime.Platform;
import org.kermeta.interpreter.helper.RunnerHelper;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class RunLogoK {
	public static final String LOGO_SIMULATOR_KERMETA_CODE = "platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoSimulator.kmt";
	
	public static void run(String fileURI, IOConsole console)  {
		System.out.println("run FixModel");
		
		//KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit("platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoSimulator.kmt", new NullProgressMonitor());
		
		
		/*
		 // merge in user projet .bin directory
		// create intermediate files into the project of the user
		IFile file = ResourceHelper.getIFile( fileURI );
	    IProject project = file.getProject();
	    String binDirectory = "platform:/resource" + project.getFullPath().toString() + "/.bin";
	    KermetaInterpreter inter = new KermetaInterpreter(LOGO_SIMULATOR_KERMETA_CODE, binDirectory , null);
		*/
		// merge in memory
		KermetaUnit unitToExecute;
		try {
			unitToExecute = RunnerHelper.getKermetaUnitToExecute(LOGO_SIMULATOR_KERMETA_CODE);
			KermetaInterpreter inter = new KermetaInterpreter(unitToExecute, null);
		    inter.setKStream(console);		
		    inter.setEntryPoint("kmLogo::Interpreter", "execute");
			// These are the parameters
			ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
			params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(fileURI, inter.getMemory().getROFactory()));
			inter.setEntryParameters(params);
			// And we launch the interpreter
			String jar = "file://home/paco/Desktop/fr.irisa.triskell.kmlogo.model_1.1.0.jar";
			
			//ResourcesPlugin.getPlugin().getDescriptor().getInstallURL()
			
			
			URL[] urls = new URL[1];
			//urls[0] = new URL("file://home/paco/workspace/fr.irisa.triskell.kmlogo.model/bin/");
			urls[0] = new URL("file://" + Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "bin/");
			//urls[0] = new URL("file:///home/franck/turtle.jar");
			//urls[0] = new URL("file://home/paco/workspace/fr.irisa.triskell.kmlogo.model/bin/");
			//urls[0] = new URL(jar);
			//urls[0] = new URL("file:///C:/eclipse3.3_dist051/workspace/fr.irisa.triskell.kmlogo.model/bin/");
			URLClassLoader cl = new URLClassLoader(urls, inter.getClass().getClassLoader());
			Thread.currentThread().setContextClassLoader(cl);
			inter.launch();
		} catch (NotRegisteredURIException e2) {
			e2.printStackTrace();
		} catch (URIMalformedException e2) {
			e2.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}


}
