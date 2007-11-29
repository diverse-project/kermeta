/* $Id: RunLogoK.java,v 1.4 2007-11-29 16:29:12 dvojtise Exp $
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
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

import org.eclipse.core.runtime.Platform;

import fr.irisa.triskell.eclipse.console.IOConsole;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class RunLogoK {
	public static final String LOGO_SIMULATOR_KERMETA_CODE = "platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoSimulator.kmt";
	
	public static void run(String file, IOConsole console)  {
		System.out.println("run FixModel");
		
		//KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit("platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoSimulator.kmt", new NullProgressMonitor());
		
		
		KermetaInterpreter inter = new KermetaInterpreter(LOGO_SIMULATOR_KERMETA_CODE, null);
		inter.setKStream(console);
		// This is the operation to call
		try {
			inter.setEntryPoint("kmLogo::Interpreter", "execute");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// These are the parameters
		ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(file, inter.getMemory().getROFactory()));
		inter.setEntryParameters(params);
		// And we launch the interpreter
		
		String jar = "platform:/plugin/fr.irisa.triskell.kmlogo.model.jar";
		
		//ResourcesPlugin.getPlugin().getDescriptor().getInstallURL()
		
		
		URL[] urls = new URL[2];
		try {
			urls[0] = new URL("file://" + Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "bin/");
			//urls[0] = new URL("file:///home/franck/turtle.jar");
			urls[1] = new URL(jar);
			//urls[0] = new URL("file:///C:/eclipse3.3_dist051/workspace/fr.irisa.triskell.kmlogo.model/bin/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		URLClassLoader cl = new URLClassLoader(urls, inter.getClass().getClassLoader());
		Thread.currentThread().setContextClassLoader(cl);
		inter.launch();

	}


}
