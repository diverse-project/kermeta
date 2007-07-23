package fr.irisa.triskell.kermeta.ocl.kmtactions;


import java.util.ArrayList;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
import fr.irisa.triskell.kermeta.ocl.console.OCLConsole;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;

public class GenerateOCL {

	public static void run(String in, String inmeta, String out, KermetaIOStream console, String KermetaTransfoPath) {
		System.out.println("run OCL2KMT Transformation");
		KermetaUnit unit = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(KermetaTransfoPath);
		unit.load();
		unit.typeCheckAllUnits();
		KermetaInterpreter inter = new KermetaInterpreter(unit);
		inter.setKStream(console);
		// This is the operation to call
		inter.setEntryPoint("OCLKMTPrinter::OCLKMTPrinter", "generateOCL");
		// These are the parameters
		ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(in, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(inmeta, inter.getMemory().getROFactory()));
		params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(out, inter.getMemory().getROFactory()));
		inter.setEntryParameters(params);
		
		// And we launch the interpreter
		inter.launch();
	}

	


}
