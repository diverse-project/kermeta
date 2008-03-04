/* $Id: CompileNXCLogoK.java,v 1.7 2008-03-04 11:12:33 dvojtise Exp $
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

public class CompileNXCLogoK {

	public static final String LOGO_COMPILER_KERMETA_CODE = "platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoNXCCompiler.kmt";
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
		KermetaUnit unitToExecute;
		unitToExecute = RunnerHelper.getKermetaUnitToExecute(LOGO_COMPILER_KERMETA_CODE);
		KermetaInterpreter inter = new KermetaInterpreter(unitToExecute, null);
		inter.setKStream(console);
		// This is the operation to call
		inter.setEntryPoint("kmLogo::NXCCompiler", "compile");
		
		String api = null;
		api = Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "model/LogoNXC.nxc";

		// These are the parameters
		ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(file, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(out, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(api, inter.getMemory().getROFactory()));
		inter.setEntryParameters(params);
		// And we launch the interpreter
		
		String jar = "platform:/plugin/fr.irisa.triskell.kmlogo.model.jar";
		
		//ResourcesPlugin.getPlugin().getDescriptor().getInstallURL()
		
		
		URL[] urls = new URL[1];
		urls[0] = new URL("file://" + Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "bin");

		URLClassLoader cl = new URLClassLoader(urls, inter.getClass().getClassLoader());
		Thread.currentThread().setContextClassLoader(cl);
		inter.launch();
		

	}


}
