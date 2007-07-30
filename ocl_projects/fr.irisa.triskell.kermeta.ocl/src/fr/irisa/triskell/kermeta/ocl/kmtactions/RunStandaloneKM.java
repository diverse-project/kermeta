package fr.irisa.triskell.kermeta.ocl.kmtactions;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;

public class RunStandaloneKM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		KermetaUnit unit = null;
		try {
			unit = IOPlugin.getDefault().loadKermetaUnit("platform:/resource/ksrc/hello.km");
		} catch (KermetaIOFileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//unit.typeCheckAllUnits();
		//unit.saveAsXMIModel("ksrc/hello.km");
		KermetaInterpreter inter = new KermetaInterpreter(unit);
		inter.setEntryPoint("hello::Main", "main");
		inter.launch();
	}

}
