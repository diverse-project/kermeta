package fr.irisa.triskell.kmlogo.ui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;

public class RunLogoK {

	public static void run(String file, KermetaIOStream console)  {
		System.out.println("run FixModel");
		
		//KermetaUnit unit = IOPlugin.getDefault().loadKermetaUnit("platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoSimulator.kmt", new NullProgressMonitor());
		
		KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("platform:/plugin/fr.irisa.triskell.kmlogo.model/model/LogoSimulator.kmt");
		unit.load();
		unit.typeCheckAllUnits();
		KermetaInterpreter inter = new KermetaInterpreter(unit);
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
		
		
		URL[] urls = new URL[1];
		try {
			//urls[0] = new URL("file://" + Platform.resolve(Platform.getPlugin("fr.irisa.triskell.kmlogo.model").getDescriptor().getInstallURL()).getFile() + "bin");
			urls[0] = new URL("file:///home/franck/turtle.jar");
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
