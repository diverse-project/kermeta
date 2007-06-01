package fr.irisa.triskell.kermeta.ocl.kmtactions;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

public class RunStandaloneKM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StdLibKermetaUnitHelper.STD_LIB_URI = KermetaConfig.STD_LIB_URI;
		KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("ksrc/hello.km");
		unit.load();
		//unit.typeCheckAllUnits();
		//unit.saveAsXMIModel("ksrc/hello.km");
		KermetaInterpreter inter = new KermetaInterpreter(unit);
		inter.setEntryPoint("hello::Main", "main");
		inter.launch();
	}

}
