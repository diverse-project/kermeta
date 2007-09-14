package fr.irisa.triskell.kmlogo.ui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;

public class CompileNXCLogoK {

	public static void run(String file, String out, KermetaIOStream console) throws KermetaIOFileNotFoundException, URIMalformedException {
		System.out.println("run FixModel");
		KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit("platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoNXCCompiler.kmt", new NullProgressMonitor());
		//unit.load();
		//unit.typeCheckAllUnits();
		KermetaInterpreter inter = new KermetaInterpreter(unit);
		inter.setKStream(console);
		// This is the operation to call
		inter.setEntryPoint("kmLogo::NXCCompiler", "compile");
		
		String api = null;
		try {
			api = Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "model/LogoNXC.nxc";
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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
		try {
			urls[0] = new URL("file://" + Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "bin");

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
